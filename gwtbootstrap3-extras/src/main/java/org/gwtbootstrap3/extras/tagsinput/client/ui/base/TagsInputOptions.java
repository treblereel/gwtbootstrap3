package org.gwtbootstrap3.extras.tagsinput.client.ui.base;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsFunction;
import jsinterop.base.Js;
import org.gwtbootstrap3.extras.tagsinput.client.callback.ItemTextCallback;
import org.gwtbootstrap3.extras.tagsinput.client.callback.ItemValueCallback;
import org.gwtbootstrap3.extras.tagsinput.client.callback.OnTagExistsCallback;
import org.gwtbootstrap3.extras.tagsinput.client.callback.TagClassCallback;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArrayInteger;

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

/**
 * Tags Input options, used for customisation of TagsInput widget.
 * @author Marko Nikolić <marko.nikolic@iten.rs>
 */
public class TagsInputOptions<T> extends JavaScriptObject {

    @JsConstructor
    protected TagsInputOptions() {
    }

    /**
     * Creates a new instance of {@link TagsInputOptions}.
     * @return a new instance of {@link TagsInputOptions}.
     */
    @SuppressWarnings("rawtypes")
    static TagsInputOptions create() {
        return new TagsInputOptions();
    }

    public final void setTagClass(String className) {
        Js.asPropertyMap(this).set("tagClass", className);
    }

    public final void setTagClass(final TagClassCallback<T> callback) {
        Js.asPropertyMap(this).set("tagClass", (Fn) item -> callback.getTagClass((T) item));
    }

    public final void setItemValue(String itemValue) {
        Js.asPropertyMap(this).set("itemValue", itemValue);
    }

    public final void setItemValue(final ItemValueCallback<T> callback) {
        Js.asPropertyMap(this).set("itemValue", (Fn) item -> callback.getItemValue((T) item));
    }

    public final void setItemText(String itemText) {
        Js.asPropertyMap(this).set("itemText", itemText);
    }

    public final void setItemText(final ItemTextCallback<T> callback) {
        Js.asPropertyMap(this).set("itemText", (Fn) item -> callback.getItemText((T) item));
    }

    public final void setConfirmKeys(JsArrayInteger keys) {
        Js.asPropertyMap(this).set("confirmKeys", keys);
    }

    public final void setMaxTags(int maxTags) {
        Js.asPropertyMap(this).set("maxTags", maxTags);
    }

    public final void setMaxChars(int maxChars) {
        Js.asPropertyMap(this).set("maxChars", maxChars);
    }

    public final void setTrimValue(boolean trimValue) {
        Js.asPropertyMap(this).set("trimValue", trimValue);
    }

    public final void setAllowDuplicates(boolean allowDuplicates) {
        Js.asPropertyMap(this).set("allowDuplicates", allowDuplicates);
    }

    public final void setFocusClass(String focusClass) {
        Js.asPropertyMap(this).set("focusClass", focusClass);
    }

    public final void setFreeInput(boolean freeInput) {
        Js.asPropertyMap(this).set("freeInput", freeInput);
    }

    public final void setCancelConfirmKeysOnEmpty(boolean cancelConfirmKeysOnEmpty) {
        Js.asPropertyMap(this).set("cancelConfirmKeysOnEmpty", cancelConfirmKeysOnEmpty);
    }

    public final void onTagExists(final OnTagExistsCallback<T> callback) {
        Js.asPropertyMap(this).set("onTagExists", (FnOnTagExists) (value, value1) -> callback.onTagExists((T) value, Js.uncheckedCast(Js.asPropertyMap(value1).get("0"))));
    }

    @FunctionalInterface
    @JsFunction
    private interface FnOnTagExists {

        void onInvoke(Object value, JavaScriptObject value1);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        String onInvoke(JavaScriptObject value1);
    }
}
