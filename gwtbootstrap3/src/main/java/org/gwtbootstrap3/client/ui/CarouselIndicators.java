package org.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
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

import org.gwtbootstrap3.client.ui.constants.Styles;
import org.gwtbootstrap3.client.ui.html.OrderedList;

import org.gwtproject.user.client.ui.Widget;

/**
 * @author Joshua Godi
 */
public class CarouselIndicators extends OrderedList {

    public CarouselIndicators() {
        setStyleName(Styles.CAROUSEL_INDICATORS);
    }

    @Override
    public void add(final Widget child) {
        if (!(child instanceof CarouselIndicator)) {
            throw new IllegalArgumentException("Children can only be of type CarouselIndicator");
        }
        super.add(child);
    }
}
