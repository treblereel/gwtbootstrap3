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

import elemental2.core.JsArray;
import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsFunction;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArrayInteger;
import org.gwtproject.dom.client.NativeEvent;

/**
 * @author Jeff Isenhart
 * @see http://arshaw.com/fullcalendar/docs/display/
 */
public class GeneralDisplay implements IsJavaScriptObject {

    private JsPropertyMap general;

    public GeneralDisplay() {
        this(new Header());
    }

    public GeneralDisplay(final Header header) {
        newInstance();
        if (header != null) {
            setHeader(header.toJavaScript());
        }
    }

    private void newInstance() {
        general = JsPropertyMap.of();

        general.set("firstDay", 0);
        general.set("isRTL", false);
        general.set("weekends", true);
        general.set("hiddenDays", new JsArray<>());
        general.set("weekMode", "fixed");
        general.set("weekNumbers", 0);
        general.set("weekNumberCalculation", "local");
        general.set("aspectRatio", 1.35);
        general.set("handleWindowResize", true);
        general.set("prev", "left-single-arro'");
        general.set("next", "right-single-arrow");
        general.set("prevYear", "right-single-arrow");
        general.set("next", "right-double-arrow");
    }

    public void setViewRenderCallback(ViewRenderCallback callback) {
        if (callback != null) {
            DomGlobal.console.log("setViewRenderCallback check here ");

            general.set("viewRender", (Fn2Args) (view, element) -> callback.viewRender(view, Js.uncheckedCast(Js.asPropertyMap(element).get("0"))));
            general.set("viewDestroy", (Fn2Args) (view, element) -> callback.viewDestroy(view, Js.uncheckedCast(Js.asPropertyMap(element).get("0"))));
            general.set("dayRender", (Fn2Args) (date, cell) -> callback.dayRender(date, Js.uncheckedCast(cell)));
            general.set("windowResize", (Fn) (view) -> callback.windowResize(view));
        }
    }

    public void setFirstDayOption(int firstDay) {
        if (firstDay >= 0 && firstDay <= 6) {
            general.set("firstDay", firstDay);
        }
    }

    public void setIsRTL(boolean rtl) {
        general.set("isRTL", rtl);
    }

    public void setHeader(final Header header) {
        setHeader(header == null ? null : header.toJavaScript());
    }

    private void setHeader(JavaScriptObject header) {
        general.set("header", header);
    }

    public void setWeekends(boolean weekends) {
        general.set("weekends", weekends);
    }

    public void setHiddenDays(final int... days) {
        if (days != null) {
            final JsArrayInteger intArr = (JsArrayInteger) JsArrayInteger.createArray();
            for (final int i : days) {
                assert i >= 0 && i <= 6;
                intArr.push(i);
            }
            setHiddenDays(intArr);
        }
    }

    public void setHiddenDays(JsArrayInteger hiddenDays) {
        general.set("hiddenDays", hiddenDays);
    }

    public void setWeekMode(String mode) {
        if (mode != null) {
            if (mode.equals("fixed") || mode.equals("liquid") || mode.equals("variable")) {
                general.set("weekMode", mode);
            }
        }
    }

    public void setWeekNumbers(boolean weekNumbers) {
        general.set("weekNumbers", weekNumbers);
    }

    public void setWeekNumberCaculation(String calculation) {
        if (calculation != null) {
            if (calculation.equals("local") || calculation.equals("ISO")) {
                general.set("weekNumberCalculation", calculation);
            }
        }
    }

    //to-do: make this a callback
    public void setWeekNumberCaculation(JavaScriptObject weekNumberFunction) {
        if (weekNumberFunction != null) {
            general.set("weekNumberCalculation", weekNumberFunction);
        }
    }

    public void setBusinessHours(boolean businessHours) {
        general.set("businessHours", businessHours);
    }

    public void setHeight(int height) {
        general.set("height", height);
    }

    public void setContentHeight(int contentHeight) {
        general.set("contentHeight", contentHeight);
    }

    public void setAspectRatio(double aspectRatio) {
        general.set("aspectRatio", aspectRatio);
    }

    public void setHandleWindowResize(boolean handleWindowResize) {
        general.set("handleWindowResize", handleWindowResize);
    }

    public void setPrev(String previous) {
        general.set("prev", previous);
    }

    public void setNext(String next) {
        general.set("next", next);
    }

    public void setPrevYear(String previousYear) {
        general.set("prevYear", previousYear);
    }

    public void setNextYear(String nextYear) {
        general.set("nextYear", nextYear);
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(general);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        void onInvoke(JavaScriptObject view);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn2Args {

        void onInvoke(JavaScriptObject view, NativeEvent jsEvent);
    }
}
