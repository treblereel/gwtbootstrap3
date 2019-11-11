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
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtbootstrap3.extras.bootbox.client.callback.SimpleCallback;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/19
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class DialogOptions<E extends DialogOptions> {

    private String locale;

    private String className;

    private boolean show;

    private boolean backdrop;

    private boolean closeButton;

    private Object onEscape;

    private boolean animate;

    private String size;

    private String title;

    private String message;

    private JsPropertyMap buttons;

    /**
     * Creates a new {@link ConfirmOptions}.
     * @param message
     * @return
     */
    @JsOverlay
    public static final <E> E newOptions(final String message) {
        DialogOptions options = new DialogOptions();
        options.setMessage(message);
        return Js.uncheckedCast(options);
    }

    @JsOverlay
    public final E setLocale(String locale) {
        this.locale = locale;
        return (E) this;
    }

    @JsOverlay
    public final E setLocale(BootboxLocale locale) {
        this.locale = locale.getLocale();
        return (E) this;
    }

    @JsOverlay
    public final E setClassName(String className) {
        this.className = className;
        return (E) this;
    }

    @JsOverlay
    public final E setShow(boolean show) {
        this.show = show;
        return (E) this;
    }

    /**
     * Whether the dialog should be have a backdrop or not. Also determines whether clicking on the backdrop dismisses the modal.
     * @param backdrop
     */
    @JsOverlay
    public final E setBackdrop(boolean backdrop) {
        this.backdrop = backdrop;
        return (E) this;
    }

    @JsOverlay
    public final E setCloseButton(boolean closeButton) {
        this.closeButton = closeButton;
        return (E) this;
    }

    @JsOverlay
    public final E setOnEscape(boolean onEscape) {
        this.onEscape = onEscape;
        return (E) this;
    }

    @JsOverlay
    public final E setOnEscape(SimpleCallback onEscape) {
        this.onEscape = onEscape;
        return (E) this;
    }

    @JsOverlay
    public final E setAnimate(boolean animate) {
        this.animate = animate;
        return (E) this;
    }

    @JsOverlay
    public final E setSize(BootboxSize size) {
        this.size = size.getSize();
        return (E) this;
    }

    @JsOverlay
    public final E setTitle(String title) {
        this.title = title;
        return (E) this;
    }

    @JsOverlay
    public final E setMessage(String message) {
        this.message = message;
        return (E) this;
    }

    @JsOverlay
    public final E addButton(String name) {
        if (!Js.asPropertyMap(this).has("buttons")) {
            Js.asPropertyMap(this).set("buttons", JsPropertyMap.of());
        }
        JsPropertyMap button = JsPropertyMap.of();
        buttons.set(name, button);
        return (E) this;
    }

    @JsOverlay
    public final E addButton(String name, String className, SimpleCallback callback) {
        if (!Js.asPropertyMap(this).has("buttons")) {
            Js.asPropertyMap(this).set("buttons", JsPropertyMap.of());
        }

        JsPropertyMap button = JsPropertyMap.of();
        button.set("className", className);
        button.set("callback", callback);
        buttons.set(name, button);
        return (E) this;
    }

    @JsOverlay
    public final E addButton(String name, String label, String className, SimpleCallback callback) {
        if (!Js.asPropertyMap(this).has("buttons")) {
            Js.asPropertyMap(this).set("buttons", JsPropertyMap.of());
        }

        JsPropertyMap button = JsPropertyMap.of();
        button.set("className", className);
        button.set("label", label);
        button.set("callback", callback);
        buttons.set(name, button);
        return (E) this;
    }
}
