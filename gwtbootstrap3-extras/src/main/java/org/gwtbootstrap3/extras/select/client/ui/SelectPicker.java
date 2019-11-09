package org.gwtbootstrap3.extras.select.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2019 GwtBootstrap3
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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import org.gwtbootstrap3.client.shared.js.JQuery;
import org.gwtproject.dom.client.Element;
import org.gwtproject.event.shared.Event;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/18/19
 */
@JsType(
        isNative = true,
        namespace = "<global>",
        name = "jQuery"
)
class SelectPicker extends JQuery {

    @JsOverlay
    public static SelectPicker jQuery(Element e) {
        return (SelectPicker) JQuery.$(e);
    }

    native <T> T selectpicker(String val);

    native <T> T selectpicker(String val, Object value);

    native <T> T selectpicker(Object value);

    public native JQuery on(String var1, Fn var2);

    public native JQuery on(String var1, Fn4Args var2);

    @FunctionalInterface
    @JsFunction
    interface FnNoArgs {
        void onInvoke();
    }

    @FunctionalInterface
    @JsFunction
    interface Fn {
        void onInvoke(Event arg);
    }

    @FunctionalInterface
    @JsFunction
    interface Fn2Args {
        Object onInvoke(int selectedCount, int totalCount);
    }

    @FunctionalInterface
    @JsFunction
    interface Fn4Args {
        void onInvoke(Event event, int clickedIndex, Object newValue, Object oldValue);
    }
}
