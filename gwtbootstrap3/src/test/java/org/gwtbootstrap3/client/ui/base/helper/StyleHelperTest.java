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

import org.junit.Test;

import static org.gwtbootstrap3.client.ui.base.helper.StyleHelper.containsStyle;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

/**
 * @author Sven Jacobs
 */
public class StyleHelperTest {

    @Test
    public void testContainsStyle() {
        final String styleNames = "abc-efg 123 hji-klm";

        assertEquals(containsStyle(styleNames, "abc-efg"), is(true));
        assertEquals(containsStyle(styleNames, "123"), is(true));
        assertEquals(containsStyle(styleNames, "hji-klm"), is(true));
        assertEquals(containsStyle(styleNames, "mno"), is(false));
        assertEquals(containsStyle(null, "hji-klm"), is(false));
        assertEquals(containsStyle(styleNames, null), is(false));
        assertEquals(containsStyle("abc", "abc"), is(true));
    }
}
