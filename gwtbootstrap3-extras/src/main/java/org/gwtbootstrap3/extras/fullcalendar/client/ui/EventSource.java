package org.gwtbootstrap3.extras.fullcalendar.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
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

import jsinterop.annotations.JsFunction;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtbootstrap3.extras.fullcalendar.client.FullCalendarClientBundle;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.ScriptInjector;

/**
 * Models the Event Source Object
 * @author Jeff Isenhart
 * @see http://arshaw.com/fullcalendar/docs/event_data/Event_Source_Object/
 */
public class EventSource implements IsJavaScriptObject {

    private static boolean GCAL_ADDED = false;
    private JsPropertyMap eventSource;

    public EventSource(final JavaScriptObject jso) {
        eventSource = Js.uncheckedCast(jso);
    }

    public EventSource(final String url,
                       final String color,
                       final String backgroundColor,
                       final String textColor,
                       final String borderColor,
                       final String className,
                       final boolean isEditable,
                       final boolean isStartEditable,
                       final boolean isDurationEditable,
                       final boolean allDayDefault,
                       final boolean ignoreTimeZone,
                       final boolean isGoogle//if true include google script file
    ) {
        if (isGoogle && !GCAL_ADDED) {
            GCAL_ADDED = true;
            ScriptInjector.fromString(FullCalendarClientBundle.INSTANCE.getGoogleCalJS().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        }
        newEvent(url, color, backgroundColor, textColor, borderColor, className, isEditable, isStartEditable, isDurationEditable, allDayDefault, ignoreTimeZone);
    }

    private void newEvent(String url,
                          String color,
                          String backgroundColor,
                          String textColor,
                          String borderColor,
                          String className,
                          boolean isEditable,
                          boolean isStartEditable,
                          boolean isDurationEditable,
                          boolean allDayDefault,
                          boolean ignoreTimeZone
    ) {
        eventSource = JsPropertyMap.of();
        eventSource.set("url", url);
        eventSource.set("color", color);
        eventSource.set("backgroundColor", backgroundColor);
        eventSource.set("textColor", textColor);
        eventSource.set("borderColor", borderColor);
        eventSource.set("className", className);
        eventSource.set("editable", isEditable);
        eventSource.set("startEditable", isStartEditable);
        eventSource.set("durationEditable", isDurationEditable);
        eventSource.set("allDayDefault", allDayDefault);
        eventSource.set("ignoreTimeZone", ignoreTimeZone);
    }

    public void setEventDataTransform(EventDataTransformCallback callback) {
        eventSource.set("eventTransform", (Fn) eventData -> {
            if (callback != null) {
                callback.eventData(eventData);
            }
        });
    }

    public String getUrl() {
        return Js.uncheckedCast(this.eventSource.get("url"));
    }

    public String getColor() {
        return Js.uncheckedCast(this.eventSource.get("color"));
    }

    public String getBackgroundColor() {
        return Js.uncheckedCast(this.eventSource.get("backgroundColor"));
    }

    public String getTextColor() {
        return Js.uncheckedCast(this.eventSource.get("textColor"));
    }

    public String getBorderColor() {
        return Js.uncheckedCast(this.eventSource.get("borderColor"));
    }

    public String getClassName() {
        return Js.uncheckedCast(this.eventSource.get("className"));
    }

    public boolean getIsEditable() {
        return Js.uncheckedCast(this.eventSource.get("editable"));
    }

    public boolean getStartEditable() {
        return Js.uncheckedCast(this.eventSource.get("startEditable"));
    }

    public boolean getDurationEditable() {
        if (this.eventSource.has("durationEditable")) {
            return Js.uncheckedCast(this.eventSource.get("durationEditable"));
        }
        return false;
    }

    public boolean isAllDayDefault() {
        return Js.uncheckedCast(this.eventSource.get("allDayDefault"));
    }

    public boolean ignoreTimeZone() {
        return Js.uncheckedCast(this.eventSource.get("ignoreTimeZone"));
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(eventSource);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        void onInvoke(JavaScriptObject eventData);
    }
}
