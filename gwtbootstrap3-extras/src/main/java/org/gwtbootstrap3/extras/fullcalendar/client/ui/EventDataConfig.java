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
import org.gwtproject.core.client.JavaScriptObject;

/**
 * Models the configuration of an <code>Event</code> object
 * @author Jeff Isenhart
 * @see http://arshaw.com/fullcalendar/docs/event_data/
 */
public class EventDataConfig implements IsJavaScriptObject {

    private JsPropertyMap config;

    public EventDataConfig() {
        newInstance();
    }

    private void newInstance() {
        this.config = JsPropertyMap.of();
        JsPropertyMap days = JsPropertyMap.of();
        days.set("days", 1);

        config.set("allDayDefault", null);
        config.set("startParam", "start");
        config.set("endParam", "end");
        config.set("timezoneParam", "timezone");
        config.set("lazyFetching", true);
        config.set("defaultTimedEventDuration", "02:00:00");
        config.set("defaultTimedEventDuration", days);
        config.set("forceEventDuration", false);
    }

    public void addEventDataTransformCallback(final EventDataTransformCallback callback) {
        if (callback != null) {
            addTransformCallback(callback);
        }
    }

    private void addTransformCallback(EventDataTransformCallback callback) {
        this.config.set("eventDataTransform", (FnOneArg) (data) -> callback.eventData(data));
    }

    public void addEventLoadingCallback(final EventLoadingCallback callback) {
        if (callback != null) {
            addLoadingCallback(callback);
        }
    }

    private void addLoadingCallback(EventLoadingCallback callback) {
        this.config.set("loading", (Fn) (isLoading, viewObject) -> callback.isLoading(isLoading, viewObject));
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(config);
    }

    @FunctionalInterface
    @JsFunction
    private interface FnOneArg {

        void onInvoke(JavaScriptObject data);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        void onInvoke(boolean isLoading, JavaScriptObject viewObject);
    }
}
