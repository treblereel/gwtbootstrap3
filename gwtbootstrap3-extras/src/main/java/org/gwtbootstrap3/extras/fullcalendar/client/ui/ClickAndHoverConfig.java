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
import org.gwtproject.dom.client.NativeEvent;

/**
 * Wraps click and hover events inside a <code>JavaScriptObject</code>
 * @author Jeff Isenhart
 * @see http://arshaw.com/fullcalendar/docs/mouse/
 */
public class ClickAndHoverConfig implements IsJavaScriptObject {

    private JsPropertyMap script;

    public ClickAndHoverConfig(final ClickAndHoverEventCallback handler) {
        if (handler != null) {
            newInstance(handler);
        }
    }

    private void newInstance(ClickAndHoverEventCallback handler) {
        script = JsPropertyMap.of();
        script.set("eventClick", (Fn) (calendarEvent, event, viewObject) -> handler.eventClick(calendarEvent, event, viewObject));
        script.set("eventClick", (Fn) (calendarEvent, event, viewObject) -> handler.dayClick(calendarEvent, event, viewObject));
        script.set("eventClick", (Fn) (calendarEvent, event, viewObject) -> handler.eventMouseover(calendarEvent, event, viewObject));
        script.set("eventClick", (Fn) (calendarEvent, event, viewObject) -> handler.eventMouseout(calendarEvent, event, viewObject));
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(script);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        void onInvoke(JavaScriptObject calendarEvent, NativeEvent event, JavaScriptObject viewObject);
    }
}
