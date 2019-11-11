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

import elemental2.core.JsDate;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArrayString;
import org.gwtproject.i18n.client.DateTimeFormat;

/**
 * Represents and event on a FullCalendar
 * @author Jeff Isenhart
 * @see http://arshaw.com/fullcalendar/docs/event_data/Event_Object/
 */
public class Event implements IsJavaScriptObject {

    private static final DateTimeFormat ISO_8601_FORMAT = DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.ISO_8601);
    private static final DateTimeFormat RFC_2822_FORMAT = DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.RFC_2822);
    private JsPropertyMap event;

    public Event(final String id, final String title) {
        newEvent(id, title, true, true, true);
    }

    public Event(final JavaScriptObject jso) {
        event = Js.uncheckedCast(jso);
    }

    public Event(final String id, final String title, final boolean isEditable, final boolean isStartEditable, final boolean isDurationEditable) {
        newEvent(id, title, isEditable, isStartEditable, isDurationEditable);
    }

    public static String getDateAsRFC_2822(final Date d) {
        return d == null ? "" : RFC_2822_FORMAT.format(d);
    }

    public static String getDateAsISO8601(final Date d) {
        return d == null ? "" : ISO_8601_FORMAT.format(d);
    }

    public static String getDateAsUnixTimestamp(final Date d) {
        if (d == null) {
            return "";
        }
        final int iTimeStamp = (int) (d.getTime() * .001);
        return "" + iTimeStamp;
    }

    private void newEvent(String eventId, String eventTitle, boolean isEditable, boolean isStartEditable, boolean isDurationEditable) {
        event = JsPropertyMap.of();
        event.set("id", eventId);
        event.set("allDay", true);
        event.set("editable", isEditable);
        event.set("title", eventTitle);
        event.set("startEditable", isStartEditable);
        event.set("durationEditable", isDurationEditable);
    }

    public String getId() {
        return Js.uncheckedCast(event.get("id"));
    }

    public String getTitle() {
        return Js.uncheckedCast(event.get("title"));
    }

    public void setTitle(String title) {
        event.set("title", title);
    }

    public boolean isAllDay() {
        return Js.uncheckedCast(event.get("allDay"));
    }

    public void setAllDay(boolean isAllDay) {
        event.set("allDay", isAllDay);
    }

    public void setStart(final Date d) {
        if (d != null) {
            setStart(getDateAsISO8601(d));
        }
    }

    public void setStart(String start) {
        event.set("start", start);
    }

    public JsDate getStart() {
        if (event.has("start")) {
            return ((HasToDate) Js.uncheckedCast(event.get("start"))).toDate();
        }
        return null;
    }

    public void setStart(final JavaScriptObject start) {
        event.set("start", start);
    }

    public Date getStartFromYearMonthDay() {
        Date iso = null;
        final String isoString = getISOStart();
        if (isoString != null && isoString.length() >= 10) {
            iso = DateTimeFormat.getFormat("yyyy-MM-dd").parse(isoString.substring(0, 10));
        }
        return iso;
    }

    public String getISOStart() {
        if (event.has("start")) {
            return ((HasToDate) Js.uncheckedCast(event.get("start"))).toDate().toISOString();
        }
        return null;
    }

    public void setEnd(final Date d) {
        if (d != null) {
            setEnd(getDateAsISO8601(d));
        }
    }

    public void setEnd(String end) {
        event.set("end", end);
    }

    public JsDate getEnd() {
        if (event.has("end")) {
            return ((HasToDate) Js.uncheckedCast(event.get("end"))).toDate();
        }
        return null;
    }

    public void setEnd(final JavaScriptObject end) {
        event.set("end", end);
    }

    public String getISOEnd() {
        if (event.has("end")) {
            return ((HasToDate) Js.uncheckedCast(event.get("end"))).toDate().toISOString();
        }
        return null;
    }

    public Date getEndFromYearMonthDay() {
        Date iso = null;
        final String isoString = getISOEnd();
        if (isoString != null && isoString.length() >= 10) {
            iso = DateTimeFormat.getFormat("yyyy-MM-dd").parse(isoString.substring(0, 10));
        }
        return iso;
    }

    public String getUrl() {
        return Js.uncheckedCast(event.get("url"));
    }

    public void setUrl(String url) {
        event.set("url", url);
    }

    public void setClassName(String className) {
        event.set("className", className);
    }

    public void setClassNames(JsArrayString classNames) {
        event.set("className", classNames.join(" "));
    }

    public boolean isEditable() {
        if (event.has("editable")) {
            return Js.uncheckedCast(event.get("editable"));
        }
        return false;
    }

    public void setEditable(boolean editable) {
        event.set("editable", editable);
    }

    public boolean getStartEditable() {
        if (event.has("startEditable")) {
            return Js.uncheckedCast(event.get("startEditable"));
        }
        return false;
    }

    public void setStartEditable(boolean startEditable) {
        event.set("startEditable", startEditable);
    }

    public boolean getDurationEditable() {
        if (event.has("durationEditable")) {
            return Js.uncheckedCast(event.get("durationEditable"));
        }
        return false;
    }

    public void setDurationEditable(boolean durationEditable) {
        event.set("durationEditable", durationEditable);
    }

    public String getRendering() {
        if (event.has("rendering")) {
            return Js.uncheckedCast(event.get("rendering"));
        }
        return null;
    }

    public void setRendering(String rendering) {
        event.set("rendering", rendering);
    }

    public boolean getOverlap() {
        if (event.get("overlap") != null) {
            return Js.uncheckedCast(event.get("overlap"));
        }
        return true;
    }

    public void setOverlap(boolean overlap) {
        event.set("overlap", overlap);
    }

    public void setConstraint(String constraint) {
        event.set("constraint", constraint);
    }

    public void setConstraint(JavaScriptObject constraint) {
        event.set("constraint", constraint);
    }

    private JavaScriptObject getJSOSource() {
        return Js.uncheckedCast(event.get("source"));
    }

    public EventSource getSource() {
        return new EventSource(getJSOSource());
    }

    public void setColor(String color) {
        event.set("color", color);
    }

    public void setBackgroundColor(String bgColor) {
        event.set("bgColor", bgColor);
    }

    public void setBorderColor(String borderColor) {
        event.set("borderColor", borderColor);
    }

    public void setTextColor(String textColor) {
        event.set("textColor", textColor);
    }

    public String getDescription() {
        return Js.uncheckedCast(event.get("description"));
    }

    /**
     * ************* non standard / add-on fields and methods *********************
     */
    public void setDescription(String description) {
        event.set("description", description);
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(this.event);
    }

    @JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Object")
    private static class HasToDate {

        native JsDate toDate();
    }
}
