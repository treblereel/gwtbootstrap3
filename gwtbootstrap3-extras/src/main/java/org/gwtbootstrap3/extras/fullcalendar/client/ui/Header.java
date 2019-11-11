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
 * http://arshaw.com/fullcalendar/docs/display/header/
 * <p/>
 * Setting the header options to false will display no header.
 * An object can be supplied with properties left, center, and right.
 * These properties contain strings with comma/space separated values.
 * Values separated by a comma will be displayed adjacently.
 * Values separated by a space will be displayed with a small gap in between.
 * Strings can contain any of the following values:
 * <code>
 * {
 * left:   'title',
 * center: '',
 * right:  'today prev,next'
 * }
 * </code>
 * @author Jeff Isenhart
 */
public class Header {

    private JsPropertyMap header;

    public Header() {
        newInstance();
    }

    private void newInstance() {
        header = JsPropertyMap.of();
        header.set("left", "title");
        header.set("center", "");
        header.set("right", "today prev,next");
    }

    public void setNoHeader() {
        header.set("header", null);
    }

    public void setLeft(String left) {
        header.set("left", left);
    }

    public void setCenter(String center) {
        header.set("center", center);
    }

    public void setRight(String right) {
        header.set("right", right);
    }

    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(header);
    }
}
