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
package org.gwtbootstrap3.extras.bootbox.client.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.gwtbootstrap3.extras.bootbox.client.callback.ConfirmCallback;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/19
 */
@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Object")
public class ConfirmOptions extends DialogOptions<ConfirmOptions> {

    ConfirmCallback callback;

    @JsOverlay
    public final void setCallback(ConfirmCallback callback) {
        this.callback = callback;
    }
}
