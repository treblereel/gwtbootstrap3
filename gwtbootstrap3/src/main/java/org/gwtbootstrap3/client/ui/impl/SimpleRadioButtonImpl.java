package org.gwtbootstrap3.client.ui.impl;

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

import org.gwtbootstrap3.client.ui.SimpleRadioButton;
import org.gwtproject.event.dom.client.ChangeEvent;
import org.gwtproject.event.dom.client.ChangeHandler;
import org.gwtproject.event.logical.shared.ValueChangeEvent;

public class SimpleRadioButtonImpl {

    public void ensureDomEventHandlers(final SimpleRadioButton simpleRadioButton) {
        simpleRadioButton.addChangeHandler(new ChangeHandler() {

            @Override
            public void onChange(ChangeEvent event) {
                ValueChangeEvent.fire(simpleRadioButton,
                                      simpleRadioButton.getValue());
            }

        });
    }

}
