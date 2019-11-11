package org.gwtbootstrap3.client.shared.js;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2018 GwtBootstrap3
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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.dom.client.Element;

import static jsinterop.annotations.JsPackage.GLOBAL;

/**
 * jQuery and Bootstrap methods wrapper
 * @author Thiago Ricciardi
 *
 */
@JsType(isNative = true)
public abstract class JQuery {

    /**
     * Create a JQuery object
     * @param element the element to jQuerify 
     * @return JQuery object of element
     */
    @JsMethod(namespace = GLOBAL, name = "jQuery")
    public static native JQuery $(Element element);
    /**
     * Select jQuery elements and create a JQuery object
     * @param selector jQuery selector
     * @return JQuery object of elements selected
     */
    @JsMethod(namespace = GLOBAL, name = "jQuery")
    public static native JQuery $(String selector);

    @JsMethod(namespace = GLOBAL, name = "jQuery")
    public static native JQuery $();

    /**
     * Bootstrap button() method
     * @param method the method string
     * @return JQuery object for chaining purposes
     */
    public native JQuery button(String method);

    /**
     * jQuery html() method
     * @param htmlString A string of HTML to set as the content of each matched element
     * @return JQuery object for chaining purposes
     */
    public native JQuery html(String htmlString);

    /**
     * jQuery on() method
     * @param events One or more space-separated event types and optional namespaces,
     * such as "click" or "keydown.myPlugin"
     * @param function A function to execute when the event is triggered
     * @return JQuery object for chaining purposes
     */
    public native JQuery on(String events, EventHandler function);

    /**
     * jQuery off() method
     * @param events One or more space-separated event types and optional namespaces,
     * or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin"
     * @return JQuery object for chaining purposes
     */
    public native JQuery off(String events);

    /**
     * Bootstrap alert() method
     * @param method the method string
     * @return JQuery object for chaining purposes
     */
    public native JQuery alert(String method);

    /**
     * Bootstrap carousel() method
     * @param method the method string
     * @return JQuery object for chaining purposes
     */
    public native JQuery carousel(String method);
    /**
     * Bootstrap carousel() method
     * @param slideNumber particular frame (0 based, similar to an array)
     * @return JQuery object for chaining purposes
     */
    public native JQuery carousel(int slideNumber);

    /**
     * Bootstrap collapse() method
     * @param method the method string
     * @return JQuery object for chaining purposes
     */
    public native JQuery collapse(String method);

    /**
     * Description: Merge the contents of two or more objects together into the first object.
     * @param target An object that will receive the new properties if additional objects are passed in or that will extend the jQuery namespace if it is the sole argument.
     * @param object1 An object containing additional properties to merge in.
     * @return
     */
    public native void extend(Object target, Object... object1);

    /**
     * Bootstrap modal() method
     * @param method the method string
     * @return JQuery object for chaining purposes
     */
    public native JQuery modal(String method);

    /**
     * Bootstrap popover() method
     * @return JQuery object for chaining purposes
     */
    public native JQuery popover();
    /**
     * Bootstrap popover() method
     * @param method the method string
     * @return JQuery object for chaining purposes
     */
    public native JQuery popover(String method);

    /**
     * Bootstrap scrollspy() method
     * @param method the method string
     * @return JQuery object for chaining purposes
     */
    public native JQuery scrollspy(String method);

    /**
     * Bootstrap tab() method
     * @param method the method string
     * @return JQuery object for chaining purposes
     */
    public native JQuery tab(String method);

    /**
     * Bootstrap tooltip() method
     * @return JQuery object for chaining purposes
     */
    public native JQuery tooltip();
    /**
     * Bootstrap tooltip() method
     * @param method the method string
     * @return JQuery object for chaining purposes
     */
    public native JQuery tooltip(String method);

    public native void carousel(Element e, int interval, String pause, boolean wrap);

    public native Object data(String dataTarget);

    public native static boolean isArray(Object obj);

}