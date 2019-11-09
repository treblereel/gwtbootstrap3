package org.gwtbootstrap3.extras.fullcalendar.client;

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

import jsinterop.base.Js;
import org.gwtbootstrap3.extras.JsUtils;
import org.gwtproject.core.client.EntryPoint;
import org.gwtproject.core.client.ScriptInjector;
import org.gwtproject.dom.client.StyleInjector;

public class FullCalendarEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        StyleInjector.injectAtEnd(FullCalendarClientBundle.INSTANCE.fullCalendarCss().getText());
        StyleInjector.injectAtEnd("@media print {" + FullCalendarClientBundle.INSTANCE.fullCalendarPrintCss().getText() + "}");

        if (!isMomentPresent()) {
            ScriptInjector.fromString(FullCalendarClientBundle.INSTANCE.getMomentJS().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        }

        if (!isCalendarPresent()) {
            ScriptInjector.fromString(FullCalendarClientBundle.INSTANCE.getFullCalendarJS().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        }

        if (!isDragAndResizePresent()) {
            ScriptInjector.fromString(FullCalendarClientBundle.INSTANCE.getCustomDragResizeJS().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        }
    }

    private boolean isCalendarPresent() {
        if (Js.asPropertyMap(JsUtils.global()).has("jQuery")
                && Js.asPropertyMap(Js.asPropertyMap(JsUtils.global()).get("jQuery")).has("fullCalendar")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isDragAndResizePresent() {
        if (Js.asPropertyMap(JsUtils.global()).has("jQuery")
                && Js.asPropertyMap(Js.asPropertyMap(JsUtils.global()).get("jQuery")).has("draggable")
                && Js.asPropertyMap(Js.asPropertyMap(JsUtils.global()).get("jQuery")).has("resizable")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isMomentPresent() {
        if (Js.asPropertyMap(JsUtils.global()).has("jQuery")
                && Js.asPropertyMap(Js.asPropertyMap(JsUtils.global()).get("jQuery")).has("moment")) {
            return true;
        } else {
            return false;
        }
    }
}
