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

import java.util.Map;

import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.core.client.JavaScriptObject;

/**
 * @author Jeff Isenhart
 * @see http://arshaw.com/fullcalendar/docs/text/columnFormat/
 */
public class ColumnFormat extends AbstractViewOptionFormat implements IsJavaScriptObject {

    private JsPropertyMap format;

    public ColumnFormat() {
        this(null);
    }

    public ColumnFormat(Map<ViewOptionHash, String> options) {
        newInstance();
        if (options == null) {
            options = getDefaultOptions();
        }
        for (final ViewOptionHash option : options.keySet()) {
            setFormat(option.name(), options.get(option));
        }
    }

    @Override
    /**
     * @see http://arshaw.com/fullcalendar/docs/text/columnFormat/
     */
    protected void populateDefaultOptions(final Map<ViewOptionHash, String> options) {
        options.put(ViewOptionHash.month, "ddd");
        options.put(ViewOptionHash.week, "ddd M/d");
        options.put(ViewOptionHash.day, "dddd M/d");
    }

    private void newInstance() {
        this.format = JsPropertyMap.of();
        format.set("columnFormat", JsPropertyMap.of());
    }

    private void setFormat(String format, String viewOption) {
        Js.asPropertyMap(this.format.get("columnFormat")).set(viewOption, format);
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(format);
    }
}
