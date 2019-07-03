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

import org.gwtbootstrap3.client.ui.base.AbstractTextWidget;
import org.gwtbootstrap3.client.ui.constants.ElementTags;
import org.gwtproject.dom.client.Document;
import org.gwtproject.uibinder.client.UiConstructor;

/**
 * Simple {@code <abbr>} block for abbreviating words.
 *
 * @author Joshua Godi
 */
public class Abbreviation extends AbstractTextWidget {

    @UiConstructor
    public Abbreviation(final String title) {
        super(Document.get().createElement(ElementTags.ABBR));
        setTitle(title);
    }
}
