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
 * @see http://arshaw.com/fullcalendar/docs/agenda/
 */
public class AgendaOptions implements IsJavaScriptObject {

    private JsPropertyMap options;

    public AgendaOptions() {
        newInstance();
    }

    /**
     * Sets defaults
     * @see http://arshaw.com/fullcalendar/docs/agenda/
     */
    public void newInstance() {
        options = JsPropertyMap.of();
        options.set("allDaySlot", true);
        options.set("allDayText", "all-day");
        options.set("axisFormat", "h(:mm)a");
        options.set("slotDuration", "00:30.00");
        options.set("scrollTime", "06:00:00");
        options.set("minTime", "00:00:00");
        options.set("maxTime", "24:00:00");
        options.set("slotEventOverlap", true);
    }

    /**
     * @see http://arshaw.com/fullcalendar/docs/agenda/allDaySlot/
     */
    public void setAllDaySlot(boolean allDay) {
        options.set("allDaySlot", allDay);
    }

    /**
     * @see http://arshaw.com/fullcalendar/docs/agenda/allDayText/
     */
    public void setAllDayText(String text) {
        options.set("allDayText", text);
    }

    /**
     * @see http://arshaw.com/fullcalendar/docs/agenda/axisFormat/
     */
    public void setAxisFormat(String format) {
        options.set("axisFormat", format);
    }

    public void setSlotDuration(final int minutes) {
        assert minutes >= 0 && minutes <= 60;
        if (minutes < 10) {
            setSlotDuration("00:0" + minutes + ":00");
        } else {
            setSlotDuration("00:" + minutes + ":00");
        }
    }

    /**
     * @see http://arshaw.com/fullcalendar/docs/agenda/slotDuration/
     */
    public void setSlotDuration(String timeString) {
        options.set("slotDuration", timeString);
    }

    public void setSnapDuration(final int minutes) {
        assert minutes >= 0 && minutes <= 60;
        if (minutes < 10) {
            setSnapDuration("00:0" + minutes + ":00");
        } else {
            setSnapDuration("00:" + minutes + ":00");
        }
    }

    /**
     * @see http://arshaw.com/fullcalendar/docs/agenda/snapDuration/
     */
    public void setSnapDuration(String timeString) {
        options.set("snapDuration", timeString);
    }

    /**
     * @see http://arshaw.com/fullcalendar/docs/agenda/scrollTime/
     */
    public void setScrollTime(String timeString) {
        options.set("scrollTime", timeString);
    }

    /**
     * @see http://arshaw.com/fullcalendar/docs/agenda/minTime/
     */
    public void setMinTime(String timeString) {
        options.set("minTime", timeString);
    }

    /**
     * @see http://arshaw.com/fullcalendar/docs/agenda/maxTime/
     */
    public void setMaxTime(String timeString) {
        options.set("maxTime", timeString);
    }

    /**
     * @see http://arshaw.com/fullcalendar/docs/agenda/slotEventOverlap/
     */
    public void setSlotEventOverlap(boolean overlap) {
        options.set("slotEventOverlap", overlap);
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(options);
    }
}
