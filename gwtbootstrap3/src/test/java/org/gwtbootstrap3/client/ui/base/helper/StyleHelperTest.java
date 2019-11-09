package org.gwtbootstrap3.client.ui.base.helper;

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

import com.google.gwt.junit.client.GWTTestCase;
import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;

import static org.gwtbootstrap3.client.ui.base.helper.StyleHelper.containsStyle;

/**
 * @author Sven Jacobs
 */
@J2clTestInput(StyleHelperTest.class)
public class StyleHelperTest extends GWTTestCase {

    @Test
    public void testContainsStyle() {
        final String styleNames = "abc-efg 123 hji-klm";

        assertEquals(containsStyle(styleNames, "abc-efg"), true);
        assertEquals(containsStyle(styleNames, "123"), true);
        assertEquals(containsStyle(styleNames, "hji-klm"), true);
        assertEquals(containsStyle(styleNames, "mno"), false);
        assertEquals(containsStyle(null, "hji-klm"), false);
        assertEquals(containsStyle(styleNames, null), false);
        assertEquals(containsStyle("abc", "abc"), true);
    }

    @Override
    public String getModuleName() {
        return null;
    }
}
