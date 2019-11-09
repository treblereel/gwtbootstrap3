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

import jsinterop.annotations.JsFunction;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.dom.client.NativeEvent;

/**
 * Wraps selection events inside a <code>JavaScriptObject</code>
 * @see http://fullcalendar.io/docs/selection/
 */
public class SelectConfig implements IsJavaScriptObject {

    private JavaScriptObject script;

    public SelectConfig(final SelectEventCallback handler) {
        if (handler != null) {
            newInstance(handler);
        }
    }

    private void newInstance(SelectEventCallback handler) {
        JsPropertyMap script = JsPropertyMap.of();
        this.script = Js.uncheckedCast(script);
        script.set("select", (Fn4Args) (start, end, jsEvent, view) -> handler.select(start, end, jsEvent, view));
        script.set("unselect", (Fn2Args) (view, jsEvent) -> handler.unselect(view, jsEvent));
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return script;
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn2Args {

        void onInvoke(JavaScriptObject view, NativeEvent jsEvent);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn4Args {

        void onInvoke(JavaScriptObject start, JavaScriptObject end, NativeEvent jsEvent, JavaScriptObject view);
    }
}
