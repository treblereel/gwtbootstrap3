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

import org.gwtproject.dom.client.Style;
import org.gwtproject.dom.client.Style.Display;
import org.gwtproject.dom.client.Style.Unit;

/**
 * Display's a help block inline.
 * 
 * @author Joshua Godi
 * @author Steven Jardine
 */
public class InlineHelpBlock extends HelpBlock {

    public InlineHelpBlock() {
        super();
        Style style = getElement().getStyle();
        style.setDisplay(Display.INLINE_BLOCK);
        style.setMarginTop(0, Unit.PX);
        style.setMarginBottom(0, Unit.PX);
        style.setPaddingLeft(10, Unit.PX);
    }

}
