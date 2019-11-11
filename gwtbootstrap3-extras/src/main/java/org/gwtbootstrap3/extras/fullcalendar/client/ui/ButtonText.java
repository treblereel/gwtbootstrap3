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

import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.core.client.JavaScriptObject;

/**
 * @author Jeff Isenhart
 * @see http://arshaw.com/fullcalendar/docs/text/buttonText/
 */
public class ButtonText implements IsJavaScriptObject {

    private JsPropertyMap text;

    public ButtonText() {
        newInstance();
    }

    private void newInstance() {
        text = JsPropertyMap.of();
        JsPropertyMap buttonText = JsPropertyMap.of();
        buttonText.set("today", "today");
        buttonText.set("month", "month");
        buttonText.set("week", "week");
        buttonText.set("day", "day");
        text.set("buttonText", buttonText);
    }

    public void setToday(String today) {
        Js.asPropertyMap(text.get("buttonText")).set("today", today);
    }

    public void setMonth(String month) {
        Js.asPropertyMap(text.get("buttonText")).set("month", month);
    }

    public void setWeek(String week) {
        Js.asPropertyMap(text.get("buttonText")).set("week", week);
    }

    public void setDay(String day) {
        Js.asPropertyMap(text.get("buttonText")).set("day", day);
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(text);
    }
}
