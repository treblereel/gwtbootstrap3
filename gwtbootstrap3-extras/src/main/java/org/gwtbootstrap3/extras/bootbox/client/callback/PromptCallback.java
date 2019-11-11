package org.gwtbootstrap3.extras.bootbox.client.callback;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2016 GwtBootstrap3
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

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;

/**
 * Prompt callback to handle the user's input.
 * @author Xiaodong Sun
 */
@FunctionalInterface
@JsFunction
public interface PromptCallback {

    void callback(String result);

    /**
     * Default {@link PromptCallback} does nothing.
     */
    @JsOverlay
    PromptCallback DEFAULT_PROMPT_CALLBACK = result -> {};
}
