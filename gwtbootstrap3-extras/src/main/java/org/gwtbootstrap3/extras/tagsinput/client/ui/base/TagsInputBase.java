package org.gwtbootstrap3.extras.tagsinput.client.ui.base;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import elemental2.core.JsArray;
import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.gwtbootstrap3.client.shared.js.JQuery;
import org.gwtbootstrap3.client.ui.gwt.Widget;
import org.gwtbootstrap3.extras.tagsinput.client.callback.ItemTextCallback;
import org.gwtbootstrap3.extras.tagsinput.client.callback.ItemValueCallback;
import org.gwtbootstrap3.extras.tagsinput.client.callback.OnTagExistsCallback;
import org.gwtbootstrap3.extras.tagsinput.client.callback.TagClassCallback;
import org.gwtbootstrap3.extras.tagsinput.client.event.BeforeItemAddEvent;
import org.gwtbootstrap3.extras.tagsinput.client.event.BeforeItemAddHandler;
import org.gwtbootstrap3.extras.tagsinput.client.event.BeforeItemRemoveEvent;
import org.gwtbootstrap3.extras.tagsinput.client.event.BeforeItemRemoveHandler;
import org.gwtbootstrap3.extras.tagsinput.client.event.ItemAddedEvent;
import org.gwtbootstrap3.extras.tagsinput.client.event.ItemAddedHandler;
import org.gwtbootstrap3.extras.tagsinput.client.event.ItemAddedOnInitEvent;
import org.gwtbootstrap3.extras.tagsinput.client.event.ItemAddedOnInitHandler;
import org.gwtbootstrap3.extras.tagsinput.client.event.ItemRemovedEvent;
import org.gwtbootstrap3.extras.tagsinput.client.event.ItemRemovedHandler;
import org.gwtbootstrap3.extras.typeahead.client.base.Dataset;
import org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArrayInteger;
import org.gwtproject.core.client.JsArrayString;
import org.gwtproject.core.client.Scheduler;
import org.gwtproject.dom.client.Element;
import org.gwtproject.event.dom.client.ChangeEvent;
import org.gwtproject.event.dom.client.ChangeHandler;
import org.gwtproject.event.dom.client.HasChangeHandlers;
import org.gwtproject.event.logical.shared.ValueChangeEvent;
import org.gwtproject.event.shared.HandlerRegistration;

/**
 * Wrapper for Bootstrap Tags Input component.
 * <p>
 * Type T represents type of the tags. Tags can be objects or in special case strings.
 * If tags are strings, no special handling is necessary. However, if tags are objects,
 * it is required to set in options 'itemValue' and 'itemText'. If 'itemText' is not
 * set, 'itemValue' is used instead.
 * @author Marko Nikolić <marko.nikolic@iten.rs>
 */
class TagsInputBase<T> extends Widget implements HasAllTagsInputEvents<T>,
                                                 HasChangeHandlers {

    @SuppressWarnings("unchecked")
    private TagsInputOptions<T> options = TagsInputOptions.create();

    private Collection<? extends Dataset<T>> datasets;

    private Typeahead<T> typeahead;
    private Scheduler.ScheduledCommand attachTypeahead = new Scheduler.ScheduledCommand() {
        @Override
        public void execute() {
            typeahead = new Typeahead<>(input(), datasets);
            typeahead.reconfigure();
            typeahead.addTypeaheadSelectedHandler(event -> add(event.getSuggestion().getData()));
        }
    };

    protected static List<String> toMultiValue(JavaScriptObject js_multi_value) {
        List<String> retValue = new ArrayList<>();

        if (js_multi_value != null) {
            JsArrayString js_string_array = js_multi_value.cast();

            for (int i = 0; i < js_string_array.length(); i++) {
                retValue.add(js_string_array.get(i));
            }
        }

        return retValue;
    }

    public void setDatasets(final Dataset<T> dataset) {
        this.datasets = Arrays.asList(dataset);
    }

    public void setDatasets(final Collection<? extends Dataset<T>> datasets) {
        this.datasets = datasets;
    }

    /**
     * Sets classname for the tags.
     * @param tagClass Classname for the tags
     */
    public void setTagClass(final String tagClass) {
        options.setTagClass(tagClass);
    }

    public void setTagClass(final TagClassCallback<T> cb) {
        options.setTagClass(cb);
    }

    /**
     * Sets item value name that will be used if tags are objects other then String.
     * @param itemValue name of field used for the tag value
     */
    public void setItemValue(final String itemValue) {
        options.setItemValue(itemValue);
    }

    public void setItemValue(final ItemValueCallback<T> cb) {
        options.setItemValue(cb);
    }

    /**
     * Sets item text name that will be used if tags are objects other then String.
     * If it item text name is not provided, item value will be used instead.
     * @param itemText name of field used for the tag text
     */
    public void setItemText(final String itemText) {
        options.setItemText(itemText);
    }

    public void setItemText(final ItemTextCallback<T> cb) {
        options.setItemText(cb);
    }

    /**
     * Array of keycodes which will add a tag when typing in the input.
     * (default: [13, 188], which are ENTER and comma)
     * @param confirmKeys Array of keycodes
     */
    public void setConfirmKeys(final List<Integer> confirmKeys) {
        JsArrayInteger keys = JsArrayInteger.createArray().cast();

        for (int key : confirmKeys) {
            keys.push(key);
        }
        options.setConfirmKeys(keys);
    }

    /**
     * When set, no more than the given number of tags are allowed to add (default: undefined).
     * When maxTags is reached, a class 'bootstrap-tagsinput-max' is placed on the tagsinput element.
     * @param maxTags max number of tags
     */
    public void setMaxTags(final int maxTags) {
        options.setMaxTags(maxTags);
    }

    /**
     * Defines the maximum length of a single tag. (default: undefined)
     * @param maxChars max number of chars
     */
    public void setMaxChars(final int maxChars) {
        options.setMaxChars(maxChars);
    }

    /**
     * When true, automatically removes all whitespace around tags. (default: false)
     * @param trimValue
     */
    public void setTrimValue(final boolean trimValue) {
        options.setTrimValue(trimValue);
    }

    /**
     * When true, the same tag can be added multiple times. (default: false)
     * @param allowDuplicates
     */
    public void setAllowDuplicaties(final boolean allowDuplicates) {
        options.setAllowDuplicates(allowDuplicates);
    }

    /**
     * When the input container has focus, the class specified by this config
     * option will be applied to the container.
     * @param focusClass classname
     */
    public void setFocusClass(final String focusClass) {
        options.setFocusClass(focusClass);
    }

    /**
     * Callback called when adding tag that already exists.
     * @param callback callback method.
     */
    public void onTagExists(final OnTagExistsCallback<T> callback) {
        options.onTagExists(callback);
    }

    @Override
    public HandlerRegistration addItemAddedOnInitHandler(final ItemAddedOnInitHandler<T> handler) {
        return addHandler(handler, ItemAddedOnInitEvent.getType());
    }

    @Override
    public HandlerRegistration addBeforeItemAddHandler(final BeforeItemAddHandler<T> handler) {
        return addHandler(handler, BeforeItemAddEvent.getType());
    }

    @Override
    public HandlerRegistration addItemAddedHandler(final ItemAddedHandler<T> handler) {
        return addHandler(handler, ItemAddedEvent.getType());
    }

    @Override
    public HandlerRegistration addBeforeItemRemoveHandler(final BeforeItemRemoveHandler<T> handler) {
        return addHandler(handler, BeforeItemRemoveEvent.getType());
    }

    @Override
    public HandlerRegistration addItemRemovedHandler(final ItemRemovedHandler<T> handler) {
        return addHandler(handler, ItemRemovedEvent.getType());
    }

    @Override
    public HandlerRegistration addChangeHandler(ChangeHandler handler) {
        return addDomHandler(handler, ChangeEvent.getType());
    }

    public void reconfigure() {
        destroy();
        initialize(getElement(), options);

        // Deferred to make sure the tagsinput component creates <input> field
        // on which typeahead should attach.
        Scheduler.get().scheduleDeferred(attachTypeahead);
    }

    /**
     * Initialises tags input component with given options.
     * @param e tags input element
     * @param options tags input options
     */
    private void initialize(Element e, JavaScriptObject options) {
        JTagsinput.jQuery(e).tagsinput(options);

        JTagsinput.jQuery(e).on(HasAllTagsInputEvents.ITEM_ADDED_ON_INIT_EVENT, (Fn) (event) -> ItemAddedOnInitEvent.fire(Js.uncheckedCast(this), Js.asPropertyMap(event).get("item")));
        JTagsinput.jQuery(e).on(HasAllTagsInputEvents.BEFORE_ITEM_ADD_EVENT, (Fn) (event) -> BeforeItemAddEvent.fire(Js.uncheckedCast(this), Js.asPropertyMap(event).get("item")));
        JTagsinput.jQuery(e).on(HasAllTagsInputEvents.ITEM_ADDED_EVENT, (Fn) (event) -> ItemAddedEvent.fire(Js.uncheckedCast(this), Js.asPropertyMap(event).get("item")));
        JTagsinput.jQuery(e).on(HasAllTagsInputEvents.BEFORE_ITEM_REMOVE_EVENT, (Fn) (event) -> BeforeItemRemoveEvent.fire(Js.uncheckedCast(this), Js.asPropertyMap(event).get("item")));
        JTagsinput.jQuery(e).on(HasAllTagsInputEvents.ITEM_REMOVED_EVENT, (Fn) (event) -> ItemRemovedEvent.fire(Js.uncheckedCast(this), Js.asPropertyMap(event).get("item")));

        ////////////////////
        // 'change' event does not work properly if fired from jQuery and it is not cached by GWT. Workaround to make it working properly
        // is to have at least one function assigned to the 'change' event.
        //
        // Probably related to the issue https://github.com/jquery/jquery/issues/1783.
        //
        // Even if firing of ValueChangeEvent is removed, there should remain empty function and 'change' event will be properly cached by GWT.
        ////////////////////
        JTagsinput.jQuery(e).on(HasAllTagsInputEvents.ITEM_CHANGED_EVENT, (Fn) (event) -> {
            Object currentValue = JTagsinput.jQuery(e).val();
            if (currentValue != null) {
                String[] values = currentValue.toString().split(",");
                if (currentValue.toString().split(",").length == 1) {
                    ValueChangeEvent.fire(Js.uncheckedCast(this), currentValue.toString());
                } else {
                    List<String> arr = new ArrayList<>();
                    for (int i = 0; i < values.length; i++) {
                        arr.add(values[i]);
                    }
                    ValueChangeEvent.fire(Js.uncheckedCast(this), arr);
                }
            } else {
                ValueChangeEvent.fire(Js.uncheckedCast(this), null);
            }
        });
    }

    @Override
    protected void onLoad() {
        super.onLoad();

        initialize(getElement(), options);

        // Deferred to make sure the tagsinput component creates <input> field
        // on which typeahead should attach.
        Scheduler.get().scheduleDeferred(attachTypeahead);
    }

    @Override
    protected void onUnload() {
        super.onUnload();

        command(getElement(), TagsInputCommand.DESTROY);
    }

    /**
     * Returns list of items contained in the
     * @return List of items
     */
    public List<T> getItems() {
        JsArray<JavaScriptObject> js_items = getItems(getElement());
        List<T> items = new ArrayList<T>();

        for (int i = 0; i < js_items.length; i++) {
            @SuppressWarnings("unchecked")
            T item = (T) js_items.getAt(i);
            items.add(item);
        }

        return items;
    }

    /**
     * Adds a tag
     * @param tag tag to add
     */
    public void add(T tag) {
        if (isAttached()) {
            add(getElement(), tag);
        }
    }

    /**
     * Adds list of tags
     * @param tags list of tags to add
     */
    public void add(List<T> tags) {
        if (tags != null) {
            for (T tag : tags) {
                add(tag);
            }
        }
    }

    /**
     * Removes a tag
     * @param tag tag to remove
     */
    public void remove(T tag) {
        if (isAttached()) {
            remove(getElement(), tag);
        }
    }

    /**
     * Removes all tags
     */
    public void removeAll() {
        if (isAttached()) {
            command(getElement(), TagsInputCommand.REMOVE_ALL);
        }
    }

    /**
     * Sets focus in the tagsinput
     */
    public void focus() {
        if (isAttached()) {
            command(getElement(), TagsInputCommand.FOCUS);
        }
    }

    /**
     * Returns the tagsinput's internal <input />, which is used for adding tags.
     */
    public Element input() {
        if (isAttached()) {
            return input(getElement());
        } else {
            return null;
        }
    }

    /**
     * Refreshes the tags input UI.
     */
    public void refresh() {
        if (isAttached()) {
            command(getElement(), TagsInputCommand.REFRESH);
        }
    }

    /**
     * Removes tagsinput behaviour
     */
    public void destroy() {
        if (isAttached()) {
            destroy(getElement());
        }
    }

    private void command(Element e, String command) {
        JTagsinput.jQuery(e).tagsinput(command);
    }

    private void add(Element e, T tag) {
        JTagsinput.jQuery(e).tagsinput(TagsInputCommand.ADD, tag);
    }

    private void remove(Element e, T tag) {
        JTagsinput.jQuery(e).tagsinput(TagsInputCommand.REMOVE, tag);
    }

    private Element input(Element e) {
        return JTagsinput.jQuery(e).tagsinput(TagsInputCommand.INPUT);
    }

    JavaScriptObject getValue(Element e) {
        return JTagsinput.jQuery(e).val();
    }

    private JsArray<JavaScriptObject> getItems(Element e) {
        return JTagsinput.jQuery(e).tagsinput(TagsInputCommand.ITEMS);
    }

    private void destroy(Element e) {
        JTagsinput.jQuery(e).off(HasAllTagsInputEvents.ITEM_ADDED_ON_INIT_EVENT);
        JTagsinput.jQuery(e).off(HasAllTagsInputEvents.BEFORE_ITEM_ADD_EVENT);
        JTagsinput.jQuery(e).off(HasAllTagsInputEvents.ITEM_ADDED_EVENT);
        JTagsinput.jQuery(e).off(HasAllTagsInputEvents.BEFORE_ITEM_REMOVE_EVENT);
        JTagsinput.jQuery(e).off(HasAllTagsInputEvents.ITEM_REMOVED_EVENT);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        void onInvoke(Object value);
    }

    @JsType(
            isNative = true,
            namespace = JsPackage.GLOBAL,
            name = "jQuery"
    )
    private static class JTagsinput extends JQuery {

        @JsOverlay
        public static JTagsinput jQuery(Element e) {
            return (JTagsinput) JQuery.$(e);
        }

        public native JTagsinput on(String var1, Object arg);

        public native <T> T tagsinput(Object value);

        public native <T> T tagsinput(String getValue, Object value);

        public native <T> T val();
    }

    @JsType(
            isNative = true,
            namespace = JsPackage.GLOBAL
    )
    public static class Array {

        public static native boolean isArray(Object var0);
    }
}
