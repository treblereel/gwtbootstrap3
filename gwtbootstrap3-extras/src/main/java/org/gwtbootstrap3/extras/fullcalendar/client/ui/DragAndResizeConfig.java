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
 * @author Jeff Iesnhart
 * @see http://arshaw.com/fullcalendar/docs/event_ui/
 */
public class DragAndResizeConfig implements IsJavaScriptObject {

    private JsPropertyMap script;

    public DragAndResizeConfig(final DragAndResizeCallback handler) {
        if (handler != null) {
            newInstance(handler);
        }
    }

    private void newInstance(DragAndResizeCallback handler) {
        script = JsPropertyMap.of();
        script.set("eventDragStart", (Fn) (event, jsEvent, ui, view) -> {
            if (event != null && jsEvent != null) {
                NativeEvent originalEvent = null;
                if (Js.asPropertyMap(jsEvent).has("originalEvent")) {
                    originalEvent = (NativeEvent) Js.asPropertyMap(jsEvent).get("originalEvent");
                }
                handler.eventDragStart(event, originalEvent);
            }
        });

        script.set("eventDragStop", (Fn) (event, jsEvent, ui, view) -> {
            if (event != null && jsEvent != null) {
                NativeEvent originalEvent = null;
                if (Js.asPropertyMap(jsEvent).has("originalEvent")) {
                    originalEvent = (NativeEvent) Js.asPropertyMap(jsEvent).get("originalEvent");
                }
                handler.eventDragStop(event, originalEvent);
            }
        });

        script.set("eventDrop", (FnEventDrop) (event, delta, revertFunc, jsEvent, ui, view) -> {
            NativeEvent originalEvent = null;
            if (jsEvent != null && Js.asPropertyMap(jsEvent).has("originalEvent")) {
                originalEvent = Js.uncheckedCast(Js.asPropertyMap(jsEvent).get("originalEvent"));
            }
            handler.eventDrop(event, revertFunc, originalEvent);
        });

        script.set("eventResizeStart", (Fn) (event, jsEvent, ui, view) -> {
            if (event != null && jsEvent != null) {
                NativeEvent originalEvent = null;
                if (Js.asPropertyMap(jsEvent).has("originalEvent")) {
                    originalEvent = (NativeEvent) Js.asPropertyMap(jsEvent).get("originalEvent");
                }
                handler.eventResizeStart(event, originalEvent);
            }
        });

        script.set("eventResizeStop", (Fn) (event, jsEvent, ui, view) -> {
            if (event != null && jsEvent != null) {
                NativeEvent originalEvent = null;
                if (Js.asPropertyMap(jsEvent).has("originalEvent")) {
                    originalEvent = (NativeEvent) Js.asPropertyMap(jsEvent).get("originalEvent");
                }
                handler.eventResizeStop(event, originalEvent);
            }
        });

        script.set("eventResizeStop", (Fn) (event, jsEvent, ui, view) -> {
            if (event != null && jsEvent != null) {
                NativeEvent originalEvent = null;
                if (Js.asPropertyMap(jsEvent).has("originalEvent")) {
                    originalEvent = (NativeEvent) Js.asPropertyMap(jsEvent).get("originalEvent");
                }
                handler.eventResizeStop(event, originalEvent);
            }
        });

        script.set("eventResize", (FnEventDrop) (event, delta, revertFunc, jsEvent, ui, view) -> {
            NativeEvent originalEvent = null;
            if (jsEvent != null && Js.asPropertyMap(jsEvent).has("originalEvent")) {
                originalEvent = Js.uncheckedCast(Js.asPropertyMap(jsEvent).get("originalEvent"));
            }
            handler.eventResize(event, revertFunc, originalEvent);
        });
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(script);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        void onInvoke(JavaScriptObject event, NativeEvent nativeEvent, JavaScriptObject ui, JavaScriptObject view);
    }

    @FunctionalInterface
    @JsFunction
    private interface FnEventDrop {

        void onInvoke(JavaScriptObject event, JavaScriptObject delta, JavaScriptObject revertFunc, NativeEvent nativeEvent, JavaScriptObject ui, JavaScriptObject view);
    }
}
