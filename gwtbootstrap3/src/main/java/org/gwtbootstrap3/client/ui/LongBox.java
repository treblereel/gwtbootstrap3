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

import org.gwtbootstrap3.client.ui.base.ValueBoxBase;
import org.gwtbootstrap3.client.ui.constants.Styles;

import org.gwtproject.dom.client.Document;
import org.gwtproject.text.client.LongParser;
import org.gwtproject.text.client.LongRenderer;
import org.gwtproject.text.shared.Parser;
import org.gwtproject.text.shared.Renderer;

public class LongBox extends ValueBoxBase<Long> {

    public LongBox() {
        this(LongRenderer.instance(), LongParser.instance());
    }

    public LongBox(Renderer<Long> renderer, Parser<Long> parser) {
        super(Document.get().createTextInputElement(), renderer, parser);
        addStyleName(Styles.FORM_CONTROL);
    }

}
