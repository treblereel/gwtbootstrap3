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

import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArrayString;
import org.gwtproject.i18n.client.LocaleInfo;

/**
 * @author Jeff Isenhart
 * http://arshaw.com/fullcalendar/docs/text/monthNames/
 * http://arshaw.com/fullcalendar/docs/text/monthNamesShort/
 */
public class MonthNames implements IsJavaScriptObject {

    private JsPropertyMap names;

    public MonthNames() {
        newInstance();
    }

    private void newInstance() {
        names.set("monthNames", JsArray.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        names.set("monthNamesShort", JsArray.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public void localize() {
        localize(LocaleInfo.getCurrentLocale().getDateTimeFormatInfo().monthsFull(),
                 LocaleInfo.getCurrentLocale().getDateTimeFormatInfo().monthsShort());
    }

    /**
     * To pass in localized names directly
     *
     * @param longNames
     * @param shortNames
     */
    public void localize(final String[] longNames, final String[] shortNames) {
        assert longNames != null && longNames.length == 12;
        assert shortNames != null && shortNames.length == 12;
        final JsArrayString longOnes = (JsArrayString) JsArrayString.createArray();
        for (final String name : longNames) {
            longOnes.push(name);
        }

        final JsArrayString shortOnes = (JsArrayString) JsArrayString.createArray();
        for (final String name : shortNames) {
            shortOnes.push(name);
        }
        localize(longOnes, shortOnes);
    }

    /**
     * To pass in localized names directly
     *
     * @param longNames
     * @param shortNames
     */
    public void localize(JsArrayString longNames, JsArrayString shortNames) {
        Js.asPropertyMap(names).set("monthNames", longNames);
        Js.asPropertyMap(names).set("monthNamesShort", shortNames);
    }

    @Override
    public JavaScriptObject toJavaScript() {
        return Js.uncheckedCast(names);
    }
}
