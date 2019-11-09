package org.gwtbootstrap3.extras.toggleswitch.client;

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

import org.gwtproject.resources.client.ClientBundle;
import org.gwtproject.resources.client.TextResource;

/**
 * @author Grant Slender
 */
//@Resource
interface ToggleSwitchClientBundle extends ClientBundle {

    ToggleSwitchClientBundle INSTANCE = new ToggleSwitchClientBundleImpl();

    @Source("resource/js/bootstrap-switch-3.3.2.min.cache.js")
    TextResource toggleswitch();

    @Source("resource/css/bootstrap-switch-3.3.2.min.cache.css")
    TextResource toggleswitch_css();
}
