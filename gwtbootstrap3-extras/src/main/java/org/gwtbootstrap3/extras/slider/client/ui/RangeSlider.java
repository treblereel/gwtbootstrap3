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

import elemental2.core.JsArray;
import jsinterop.base.Js;
import org.gwtbootstrap3.extras.slider.client.ui.base.SliderBase;
import org.gwtbootstrap3.extras.slider.client.ui.base.SliderCommand;
import org.gwtbootstrap3.extras.slider.client.ui.base.SliderOption;
import org.gwtbootstrap3.extras.slider.client.ui.base.event.SlideEvent;
import org.gwtbootstrap3.extras.slider.client.ui.base.event.SlideStartEvent;
import org.gwtbootstrap3.extras.slider.client.ui.base.event.SlideStopEvent;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArrayNumber;
import org.gwtproject.dom.client.Element;
import org.gwtproject.event.shared.Event;
import org.gwtproject.uibinder.client.UiConstructor;

/**
 * This slider takes as value a range with a min value and a max value.
 * @author Xiaodong SUN
 */
public class RangeSlider extends SliderBase<Range> {

    /**
     * Creates a range slider.
     */
    public RangeSlider() {
        setRange(true);
    }

    /**
     * Creates a range slider with min, max, and range value.
     * @param min
     * @param max
     * @param range
     */
    public RangeSlider(final double min, final double max, final Range range) {
        this();
        setMin(min);
        setMax(max);
        setValue(range);
    }

    /**
     * Creates a range slider with min, max, and range value.<br>
     * <br>
     * Useful for UiBinder.
     * @param min
     * @param max
     * @param value
     */
    @UiConstructor
    public RangeSlider(final double min, final double max, final String value) {
        this(min, max, Range.fromString(value));
    }

    @Override
    public void setValue(Element e, Range value) {
        JsArrayNumber range = value.toJsArray();
        if (isSliderNamespaceAvailable()) {
            Slider.JSlider.jQuery(e).slider(SliderCommand.SET_VALUE, range);
        } else {
            Slider.JSlider.jQuery(e).bootstrapSlider(SliderCommand.SET_VALUE, range);
        }
    }

    @Override
    public Range getValue(Element e) {
        Object value;
        if (isSliderNamespaceAvailable()) {
            value = Slider.JSlider.jQuery(e).slider(SliderCommand.GET_VALUE);
        } else {
            value = Slider.JSlider.jQuery(e).bootstrapSlider(SliderCommand.GET_VALUE);
        }
        return new Range(Js.uncheckedCast(value));
    }

    @Override
    public void setFormatterOption(JavaScriptObject options) {
        Slider.JSlider.Fn formatter = value -> {
            Range range = new Range(Js.uncheckedCast(value));
            return formatTooltip(range);
        };
        Js.asPropertyMap(options).set("formatter", formatter);
    }

    @Override
    public void setFormatter(Element e) {
        SliderOption attr = SliderOption.FORMATTER;
        Slider.JSlider.Fn formatter = value -> {
            Range range = new Range(Js.uncheckedCast(value));
            return formatTooltip(range);
        };
        if (isSliderNamespaceAvailable()) {
            Slider.JSlider.jQuery(e).slider(SliderCommand.SET_ATTRIBUTE, attr, formatter);
        } else {
            Slider.JSlider.jQuery(e).bootstrapSlider(SliderCommand.SET_ATTRIBUTE, attr, formatter);
        }
    }

    @Override
    public String format(Range value) {
        return value.getMinValue() + " : " + value.getMaxValue();
    }

    @Override
    protected Range convertValue(String value) {
        return Range.fromString(value);
    }

    @Override
    protected void onSlide(SlideEvent<Double> event) {
        Range range = new Range(Js.uncheckedCast(Js.asPropertyMap(event).get("value")));
        fireSlideEvent(range);
    }

    @Override
    protected void onSlideStart(SlideStartEvent event) {
        Range range = new Range(Js.uncheckedCast(Js.asPropertyMap(event).get("value")));
        fireSlideStartEvent(range);
    }

    @Override
    protected void onSlideStop(SlideStopEvent event) {
        Range range = new Range(Js.uncheckedCast(Js.asPropertyMap(event).get("value")));
        fireSlideStopEvent(range);
    }

    @Override
    protected void onSlideChange(SlideEvent event) {
        JsArray<Double> value = Js.uncheckedCast(Js.asPropertyMap(Js.asPropertyMap(event).get("value")).get("newValue"));
        Range range = new Range(value);
        fireChangeEvent(range);
    }
}
