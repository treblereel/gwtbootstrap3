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
import org.gwtbootstrap3.client.ui.constants.Pull;
import org.junit.Test;

import static org.gwtbootstrap3.client.ui.base.helper.EnumHelper.fromStyleName;


/**
 * @author Sven Jacobs
 */
public class EnumHelperTest extends GWTTestCase {

    @Test
    public void testFromStyleName() {
        assertEquals(fromStyleName("123 pull-left abc", Pull.class, null), Pull.LEFT);
        assertEquals(fromStyleName("123 pull-right abc", Pull.class, null), Pull.RIGHT);
        assertEquals(fromStyleName("pull-left pull-right abc", Pull.class, null), Pull.LEFT);
        assertEquals(fromStyleName("123 abc", Pull.class, null), null);
        assertEquals(fromStyleName("123 abc", Pull.class, Pull.LEFT), Pull.LEFT);
        assertEquals(fromStyleName("123 abc", null, null), null);
        assertEquals(fromStyleName(null, Pull.class, null), null);
    }

    @Override
    public String getModuleName() {
        return null;
    }
}
