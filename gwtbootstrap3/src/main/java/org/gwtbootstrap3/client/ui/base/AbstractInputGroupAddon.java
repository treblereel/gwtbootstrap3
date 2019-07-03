package org.gwtbootstrap3.client.ui.base;

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

import org.gwtproject.dom.client.Document;

/**
 * Base class for {@link org.gwtbootstrap3.client.ui.InputGroupAddon}
 * and {@link org.gwtbootstrap3.client.ui.InputGroupButton}
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 * @see org.gwtbootstrap3.client.ui.InputGroupAddon
 * @see org.gwtbootstrap3.client.ui.InputGroupButton
 */
public abstract class AbstractInputGroupAddon extends ComplexWidget {

    protected AbstractInputGroupAddon(final String styleName) {
        setElement(Document.get().createSpanElement());
        setStyleName(styleName);
    }
}
