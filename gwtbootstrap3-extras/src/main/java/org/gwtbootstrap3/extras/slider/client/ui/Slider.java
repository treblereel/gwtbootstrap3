package org.gwtbootstrap3.extras.slider.client.ui;

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

import jsinterop.base.Js;
import org.gwtbootstrap3.extras.slider.client.ui.base.SliderBase;
import org.gwtbootstrap3.extras.slider.client.ui.base.SliderCommand;
import org.gwtbootstrap3.extras.slider.client.ui.base.SliderOption;
import org.gwtbootstrap3.extras.slider.client.ui.base.event.SlideEvent;
import org.gwtbootstrap3.extras.slider.client.ui.base.event.SlideStartEvent;
import org.gwtbootstrap3.extras.slider.client.ui.base.event.SlideStopEvent;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.dom.client.Element;
import org.gwtproject.event.shared.Event;
import org.gwtproject.uibinder.client.UiConstructor;

/**
 * This slider simply takes a numeric value.
 * @author Xiaodong SUN
 */
public class Slider extends SliderBase<Double> {

    /**
     * Creates a numerical slider.
     */
    public Slider() {
        setRange(false);
    }

    /**
     * Creates a numerical slider with min, max, and value.
     * @param min
     * @param max
     * @param value
     */
    @UiConstructor
    public Slider(final double min, final double max, final double value) {
        this();
        setMin(min);
        setMax(max);
        setValue(value);
    }

    @Override
    public void setValue(Element e, Double value) {
        double doubleValue = value.doubleValue();
        if (isSliderNamespaceAvailable()) {
            JSlider.jQuery(e).slider(SliderCommand.SET_VALUE, doubleValue);
        } else {
            JSlider.jQuery(e).bootstrapSlider(SliderCommand.SET_VALUE, doubleValue);
        }
    }

    @Override
    public Double getValue(Element e) {
        Object value;
        if (isSliderNamespaceAvailable()) {
            value = JSlider.jQuery(e).slider(SliderCommand.GET_VALUE);
        } else {
            value = JSlider.jQuery(e).bootstrapSlider(SliderCommand.GET_VALUE);
        }
        return new Double(Js.uncheckedCast(value));
    }

    @Override
    public void setFormatterOption(JavaScriptObject options) {
        JSlider.Fn formatter = value -> {
            Double val = new Double(Js.uncheckedCast(value));
            return formatTooltip(val);
        };
        Js.asPropertyMap(options).set("formatter", formatter);
    }

    @Override
    public void setFormatter(Element e) {
        SliderOption attr = SliderOption.FORMATTER;
        JSlider.Fn formatter = value -> {
            Double val = new Double(Js.uncheckedCast(value));
            return formatTooltip(val);
        };

        if (isSliderNamespaceAvailable()) {
            JSlider.jQuery(e).slider(SliderCommand.SET_ATTRIBUTE, attr, formatter);
        } else {
            JSlider.jQuery(e).bootstrapSlider(SliderCommand.SET_ATTRIBUTE, attr, formatter);
        }
    }

    @Override
    public String format(Double value) {
        return value.toString();
    }

    @Override
    protected Double convertValue(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        return Double.valueOf(value);
    }

    @Override
    protected void onSlide(SlideEvent<Double> event) {
        Double value = new Double(Js.uncheckedCast(Js.asPropertyMap(event).get("value")));
        fireSlideEvent(value);
    }

    @Override
    protected void onSlideStart(SlideStartEvent event) {
        Double value = new Double(Js.uncheckedCast(Js.asPropertyMap(event).get("value")));
        fireSlideStartEvent(value);
    }

    @Override
    protected void onSlideStop(SlideStopEvent event) {
        Double value = new Double(Js.uncheckedCast(Js.asPropertyMap(event).get("value")));
        fireSlideStopEvent(value);
    }

    @Override
    protected void onSlideChange(SlideEvent event) {
        Double value = new Double(Js.uncheckedCast(Js.asPropertyMap(Js.asPropertyMap(event).get("value")).get("newValue")));
        fireChangeEvent(value);
    }
}
