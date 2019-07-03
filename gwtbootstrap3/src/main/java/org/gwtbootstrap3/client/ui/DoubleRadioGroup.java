package org.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2015 GwtBootstrap3
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

import org.gwtbootstrap3.client.ui.base.RadioGroupBase;

import org.gwtproject.text.client.DoubleParser;
import org.gwtproject.uibinder.client.UiConstructor;

/**
 * A radio group that returns a double value.
 * @author Steven Jardine
 */
public class DoubleRadioGroup extends RadioGroupBase<Double> {

    /**
     * Constructor.
     * @param name the name.
     */
    @UiConstructor
    public DoubleRadioGroup(final String name) {
        super(name, DoubleParser.instance());
    }
}
