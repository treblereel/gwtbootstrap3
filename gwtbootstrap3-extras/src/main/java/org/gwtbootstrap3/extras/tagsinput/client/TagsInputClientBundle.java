package org.gwtbootstrap3.extras.tagsinput.client;

import org.gwtproject.resources.client.ClientBundle;
import org.gwtproject.resources.client.TextResource;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2016 GwtBootstrap3
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

/**
 * @author Marko Nikolić <marko.nikolic@iten.rs>
 */
//@Resource
public interface TagsInputClientBundle extends ClientBundle {
    TagsInputClientBundle INSTANCE = new TagsInputClientBundleImpl();
    String VERSION = "0.8.0";

    @Source("resource/js/bootstrap-tagsinput-" + VERSION + ".min.cache.js")
    TextResource tagsinput();

    @Source("resource/css/bootstrap-tagsinput.css")
    TextResource tagsinput_css();

    @Source("resource/css/bootstrap-tagsinput-typeahead.css")
    TextResource tagsinput_typeahead_css();
}
