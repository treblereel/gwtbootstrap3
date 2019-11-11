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

import elemental2.core.JsDate;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.gwtproject.core.client.JavaScriptObject;

/**
 * @author Jeff
 * @see http://arshaw.com/fullcalendar/docs/views/View_Object/
 */
public class View {

    private final JavaScriptObject view;

    /**
     * @param jso
     */
    public View(final JavaScriptObject jso) {
        view = jso;
    }

    public String getName() {
        return (String) Js.asPropertyMap(view).get("name");
    }

    public String getTitle() {
        return (String) Js.asPropertyMap(view).get("title");
    }

    public JsDate getStart() {
        if (Js.asPropertyMap(view).has("start")) {
            return ((HasToDate) Js.uncheckedCast(Js.asPropertyMap(view).get("start"))).toDate();
        }
        return null;
    }

    public JsDate getEnd() {
        if (Js.asPropertyMap(view).has("end")) {
            return ((HasToDate) Js.uncheckedCast(Js.asPropertyMap(view).get("end"))).toDate();
        }
        return null;
    }

    public JsDate getIntervalStart() {
        if (Js.asPropertyMap(view).has("intervalStart")) {
            return ((HasToDate) Js.uncheckedCast(Js.asPropertyMap(view).get("intervalStart"))).toDate();
        }
        return null;
    }

    public JsDate getIntervalEnd() {
        if (Js.asPropertyMap(view).has("intervalEnd")) {
            return ((HasToDate) Js.uncheckedCast(Js.asPropertyMap(view).get("intervalEnd"))).toDate();
        }
        return null;
    }

    public JavaScriptObject toJavaScript() {
        return this.view;
    }

    @JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Object")
    private static class HasToDate {

        public native JsDate toDate();
    }
}
