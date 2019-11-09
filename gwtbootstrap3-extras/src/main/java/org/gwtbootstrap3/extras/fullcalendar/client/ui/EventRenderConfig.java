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

public class EventRenderConfig implements IsJavaScriptObject {

    private JsPropertyMap config;

    public EventRenderConfig(final EventRenderHandler callback) {
        newInstance(callback);
    }

    private void newInstance(EventRenderHandler callback) {
        config = JsPropertyMap.of();
        config.set("eventRender", (Fn) (event, e, view) -> callback.render(event, Js.uncheckedCast(Js.asPropertyMap(e).get("0"))));
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(config);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        void onInvoke(JavaScriptObject event, JavaScriptObject e, JavaScriptObject view);
    }
}
