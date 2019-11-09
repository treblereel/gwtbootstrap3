package org.gwtbootstrap3.extras.fullcalendar.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2015 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import elemental2.core.JsDate;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtbootstrap3.client.shared.js.JQuery;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArray;
import org.gwtproject.core.client.ScriptInjector;
import org.gwtproject.dom.client.Document;
import org.gwtproject.dom.client.Element;
import org.gwtproject.event.dom.client.DomEvent;
import org.gwtproject.event.dom.client.HasLoadHandlers;
import org.gwtproject.event.dom.client.LoadEvent;
import org.gwtproject.event.dom.client.LoadHandler;
import org.gwtproject.event.shared.HandlerRegistration;
import org.gwtproject.user.client.ui.FlowPanel;

/**
 * Wrapper around FullCalendar
 * @author Jeff Isenhart
 * @see http://arshaw.com/fullcalendar/
 */
public class FullCalendar extends FlowPanel implements HasLoadHandlers {

    private static Map<String, JavaScriptObject> languageScripts;
    private final boolean editable;//@see http://arshaw.com/fullcalendar/docs/event_ui/editable/
    private ViewOption currentView;//http://arshaw.com/fullcalendar/docs/views/defaultView/
    private CalendarConfig config;//a bunch of options and events encapsulated in one place
    private boolean loaded;

    public FullCalendar(final String id, final ViewOption defaultView, final boolean editable) {
        this(id, defaultView, null, editable);
    }

    public FullCalendar(final String id, final ViewOption defaultView, final boolean editable, final Header header) {
        this(id, defaultView, new CalendarConfig(header), editable);
    }

    public FullCalendar(final String id, final ViewOption defaultView, final CalendarConfig config, final boolean editable) {
        getElement().setId(id);
        this.currentView = defaultView == null ? ViewOption.month : defaultView;
        this.config = config;
        this.editable = editable;
        loaded = false;
        if (languageScripts == null) {
            languageScripts = new HashMap<>();
        }
    }

    /**
     * This method is called immediately after a widget becomes attached to the
     * browser's document.
     */
    @Override
    protected void onLoad() {
        super.onLoad();
        loaded = true;
        renderCalendar();
    }

    private void renderCalendar() {
        boolean selectable = false;
        boolean selectHelper = false;
        boolean unselectAuto = true;
        boolean selectOverlap = true;

        JsArray<JavaScriptObject> javascriptParams = null;
        String language = null;
        String timezone = null;
        String weekNumberTitle = null;
        String unselectCancel = null;
        String selectContraint = null;
        if (config != null) {
            selectable = config.isSelectable();
            selectHelper = config.isSelectHelper();
            unselectAuto = config.isUnselectAuto();
            selectOverlap = config.isSelectOverlap();
            timezone = config.getTimezone();
            weekNumberTitle = config.getWeekNumberTitle();
            unselectCancel = config.getUnselectCancel();
            selectContraint = config.getSelectContraint();
            javascriptParams = config.getJavaScriptParameters();
            if (config.getLangauge() != null) {
                language = config.getLangauge().getCode();
                ensureInjected(config.getLangauge());
            }
        }
        addCalendar(getElement().getId(),
                    currentView.name(),
                    editable,
                    selectable,
                    selectHelper,
                    unselectAuto,
                    selectOverlap,
                    language,
                    timezone,
                    weekNumberTitle,
                    unselectCancel,
                    selectContraint,
                    javascriptParams
        );
        //Let everyone know it is ok to add events and set properties on the instance
        DomEvent.fireNativeEvent(Document.get().createLoadEvent(), this);
    }

    public void changeLangauge(final Language language) {
        if (language != null) {
            if (config == null) {
                config = new CalendarConfig();
            }
            config.setLangauge(language);
            destroy();
            renderCalendar();
        }
    }

    public void changeTimezone(final String timezone) {
        if (timezone != null) {
            if (config == null) {
                config = new CalendarConfig();
            }
            config.setTimezone(timezone);
            destroy();
            renderCalendar();
        }
    }

    private void ensureInjected(final Language language) {
        if (!languageScripts.isEmpty()) {
            for (final JavaScriptObject script : languageScripts.values()) {
                try {
                    final Element ele = (Element) script;
                    ele.removeFromParent();
                } catch (final Exception e) {
                    // TODO: handle exception
                }
            }
        }
        final JavaScriptObject scriptElement = ScriptInjector.fromString(language.getResource().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        languageScripts.put(language.getCode(), scriptElement);
    }

    private void addCalendar(String id,
                             String currentView,
                             boolean editable,
                             boolean selectable,
                             boolean selectHelper,
                             boolean unselectAuto,
                             boolean selectOverlap,
                             String lang,
                             String timezone,
                             String weekNumberTitle,
                             String unselectCancel,
                             String selectContraint,
                             JsArray<JavaScriptObject> options) {
        JsPropertyMap fullCalendarParams = JsPropertyMap.of();
        fullCalendarParams.set("defaultView", currentView);
        fullCalendarParams.set("selectable", selectable);
        fullCalendarParams.set("selectHelper", selectHelper);
        fullCalendarParams.set("editable", editable);
        fullCalendarParams.set("unselectAuto", unselectAuto);
        fullCalendarParams.set("selectOverlap", selectOverlap);

        if (lang != null) {
            fullCalendarParams.set("lang", lang);
        }

        if (timezone != null) {
            fullCalendarParams.set("timezone", timezone);
        }

        if (weekNumberTitle != null) {
            fullCalendarParams.set("weekNumberTitle", weekNumberTitle);
        }

        if (unselectCancel != null) {
            fullCalendarParams.set("unselectCancel", unselectCancel);
        }

        if (selectContraint != null) {
            fullCalendarParams.set("selectContraint", selectContraint);
        }

        if (options != null) {
            for (int i = 0; i < options.length(); i++) {
                JQuery.$().extend(fullCalendarParams, options.get(i));
            }
        }

        JFullCalendar.jQuery("#" + id).fullCalendar(fullCalendarParams);
    }

    public void addEvent(final Event event) {
        if (loaded && event != null) {
            addEvent(getElement().getId(), event.toJavaScript());
        }
    }

    public void addEvents(final List<Event> events) {
        if (loaded && events != null && !events.isEmpty()) {
            JsArray<JavaScriptObject> jsEvents = JavaScriptObject.createArray(events.size()).cast();
            int i = 0;
            for (final Event evt : events) {
                jsEvents.set(i++, evt.toJavaScript());
            }
            addEventSource(getElement().getId(), jsEvents);
        }
    }

    private void addEventSource(String id, JsArray<JavaScriptObject> events) {
        JFullCalendar.jQuery("#" + id).fullCalendar("addEventSource", events);
    }

    public ViewOption getCurrentView() {
        return currentView;
    }

    private void addEvent(String id, JavaScriptObject event) {
        JFullCalendar.jQuery("#" + id).fullCalendar("renderEvent", event, true);
    }

    private void setView(String id, String viewName) {
        JFullCalendar.jQuery("#" + id).fullCalendar("changeView", viewName);
    }

    public void goToDate(final Date d) {
        if (d != null) {
            JsDate date = new JsDate((double) d.getTime());
            goToDate(getElement().getId(), date);
        }
    }

    private void goToDate(String id, JsDate date) {
        JFullCalendar.jQuery("#" + id).fullCalendar("gotoDate", date);
    }

    @Override
    public HandlerRegistration addLoadHandler(final LoadHandler handler) {
        return super.addDomHandler(handler, LoadEvent.getType());
    }

    public JsArray<JavaScriptObject> getEvent(final String eventId) {
        if (eventId != null) {
            return getEvent(getElement().getId(), eventId);
        }
        return null;
    }

    public JsArray<JavaScriptObject> getEvent(String id, String eventId) {
        return JFullCalendar.jQuery("#" + id).fullCalendar("clientEvents", eventId);
    }

    public void removeEvent(final String eventId) {
        if (eventId != null) {
            removeEvent(getElement().getId(), eventId);
        }
    }

    public void removeAllEvents() {
        removeAllEvents(getElement().getId());
    }

    private void removeAllEvents(String id) {
        JFullCalendar.jQuery("#" + id).fullCalendar("removeEvents");
    }

    public void removeEvent(String id, String eventId) {
        JFullCalendar.jQuery("#" + id).fullCalendar("removeEvents", eventId);
    }

    public void updateEvent(final Event evt) {
        if (evt != null && evt.getId() != null) {
            updateEvent(getElement().getId(), evt.toJavaScript());
        }
    }

    public void updateEvent(String id, JavaScriptObject event) {
        JFullCalendar.jQuery("#" + id).fullCalendar("updateEvent", event);
    }

    public void addEventSource(final EventSource eventSource) {
        if (eventSource != null) {
            addEventSource(getElement().getId(), eventSource.toJavaScript());
        }
    }

    private void addEventSource(String id, JavaScriptObject eventSource) {
        JFullCalendar.jQuery("#" + id).fullCalendar("addEventSource", eventSource);
    }

    public void removeEventSource(final EventSource eventSource) {
        if (eventSource != null) {
            removeEventSource(getElement().getId(), eventSource.toJavaScript());
        }
    }

    private void removeEventSource(String id, JavaScriptObject eventSource) {
        JFullCalendar.jQuery("#" + id).fullCalendar("removeEventSource", eventSource);
    }

    public void previous() {
        previous(getElement().getId());
    }

    private void previous(String id) {
        JFullCalendar.jQuery("#" + id).fullCalendar("prev");
    }

    public void next() {
        next(getElement().getId());
    }

    private void next(String id) {
        JFullCalendar.jQuery("#" + id).fullCalendar("next");
    }

    public Date getDate() {
        final JsDate jsDate = getDate(getElement().getId());
        final long time = (long) jsDate.getTime();
        return new Date(time);
    }

    private JsDate getDate(String id) {
        return ((HasToDate) JFullCalendar.jQuery("#" + id).fullCalendar("getDate")).toDate();
    }

    public void today() {
        today(getElement().getId());
    }

    private void today(String id) {
        JFullCalendar.jQuery("#" + id).fullCalendar("today");
    }

    public View getView() {
        return new View(getView(getElement().getId()));
    }

    public void setView(final ViewOption view) {
        if (view != null) {
            currentView = view;
            setView(getElement().getId(), view.name());
        }
    }

    private JavaScriptObject getView(String id) {
        return JFullCalendar.jQuery("#" + id).fullCalendar("getView");
    }

    public void destroy() {
        destroy(getElement().getId());
    }

    private void destroy(String id) {
        JFullCalendar.jQuery("#" + id).fullCalendar("destroy");
    }

    public void render() {
        render(getElement().getId());
    }

    private void render(String id) {
        JFullCalendar.jQuery("#" + id).fullCalendar("render");
    }

    public void setHeight(final int height) {
        if (height >= 0) {
            setHeight(getElement().getId(), height);
        }
    }

    private void setHeight(String id, int height) {
        JFullCalendar.jQuery("#" + id).fullCalendar("option", "height", height);
    }

    public void setContentHeight(final int height) {
        if (height >= 0) {
            setContentHeight(getElement().getId(), height);
        }
    }

    private void setContentHeight(String id, int height) {
        JFullCalendar.jQuery("#" + id).fullCalendar("option", "contentHeight", height);
    }

    public void setAspectRatio(final double ratio) {
        if (ratio > 0) {
            setAspectRatio(getElement().getId(), ratio);
        }
    }

    private void setAspectRatio(String id, double ratio) {
        JFullCalendar.jQuery("#" + id).fullCalendar("option", "aspectRatio", ratio);
    }

    /**
     * Useful for callback cancel/revert functions
     * @param revertFunction
     */
    public void executeFunction(JavaScriptObject revertFunction) {
        ((Fn) Js.uncheckedCast(revertFunction)).onInvoke();
    }

    public void select(Date start, Date end) {
        select(getElement().getId(), Event.getDateAsISO8601(start), Event.getDateAsISO8601(end));
    }

    public void select(String start, String end) {
        select(getElement().getId(), start, end);
    }

    private void select(String id, String start, String end) {
        JFullCalendar.jQuery("#" + id).fullCalendar("select", start, end);
    }

    public void unselect() {
        unselect(getElement().getId());
    }

    private void unselect(String id) {
        JFullCalendar.jQuery("#" + id).fullCalendar("unselect");
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        void onInvoke();
    }

    @JsType(
            isNative = true,
            namespace = "<global>",
            name = "jQuery"
    )
    private static class JFullCalendar extends JQuery {

        @JsOverlay
        public static JFullCalendar jQuery(Element e) {
            return (JFullCalendar) JQuery.$(e);
        }

        @JsOverlay
        public static JFullCalendar jQuery(String e) {
            return (JFullCalendar) JQuery.$(e);
        }

        native <T> T fullCalendar(Object id);

        native <T> T fullCalendar(String id, Object start, Object end);

        native <T> T fullCalendar(String removeEventSource, Object eventSource);
    }

    @JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Object")
    private static class HasToDate {

        native JsDate toDate();
    }
}
