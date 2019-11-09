package org.gwtbootstrap3.extras.typeahead.client.ui;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtbootstrap3.client.shared.js.JQuery;
import org.gwtbootstrap3.client.ui.TextBox;
import org.gwtbootstrap3.extras.typeahead.client.base.CollectionDataset;
import org.gwtbootstrap3.extras.typeahead.client.base.Dataset;
import org.gwtbootstrap3.extras.typeahead.client.base.Suggestion;
import org.gwtbootstrap3.extras.typeahead.client.base.SuggestionCallback;
import org.gwtbootstrap3.extras.typeahead.client.base.SuggestionTemplate;
import org.gwtbootstrap3.extras.typeahead.client.base.Template;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadAutoCompletedEvent;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadAutoCompletedHandler;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadClosedEvent;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadClosedHandler;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadCursorChangedEvent;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadCursorChangedHandler;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadOpenedEvent;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadOpenedHandler;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadSelectedEvent;
import org.gwtbootstrap3.extras.typeahead.client.events.TypeaheadSelectedHandler;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArray;
import org.gwtproject.dom.client.Element;
import org.gwtproject.event.shared.HandlerRegistration;
import org.gwtproject.user.client.Event;

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

/**
 * Twitter typeahead.js
 * <p>
 * https://github.com/twitter/typeahead.js
 * @author Florian Kremser <florian.kremser@sage.com>
 */
public class Typeahead<T> extends TextBox {

    private Collection<? extends Dataset<T>> datasets;
    private boolean highlight = false;
    private boolean hint = true;
    private int minLength = 1;

    public Typeahead() {
        List<T> empty = Collections.emptyList();
        setDatasets(new CollectionDataset<>(empty));
    }

    /**
     * A typeahead is composed of one or more datasets. When an end-user
     * modifies the value of a typeahead, each dataset will attempt to
     * render suggestions for the new value.
     * @param dataset a dataset for providing suggestions
     */
    public Typeahead(final Dataset<T> dataset) {
        setDatasets(dataset);
    }

    public Typeahead(final Collection<? extends Dataset<T>> datasets) {
        setDatasets(datasets);
    }

    public Typeahead(final Element e, final Dataset<T> dataset) {
        super(e);
        setDatasets(dataset);
    }

    public Typeahead(final Element e, final Collection<? extends Dataset<T>> datasets) {
        super(e);
        setDatasets(datasets);
    }

    public void setDatasets(final Dataset<T> dataset) {
        this.datasets = Arrays.asList(dataset);
    }

    public void setDatasets(final Collection<? extends Dataset<T>> datasets) {
        this.datasets = datasets;
    }

    @Override
    public void setValue(final String value, final boolean fireEvents) {
        setValueNative(getElement(), value);
        super.setValue(value, fireEvents);
    }

    /**
     * If {@code true}, when suggestions are rendered, pattern matches for the
     * current query in text nodes will be wrapped in a {@code strong} element
     * with the {@code tt-highlight} class. Defaults to {@code false}.
     * @param highlight {@code true} to highlight pattern matches in suggestions
     */
    public void setHighlight(final boolean highlight) {
        this.highlight = highlight;
    }

    /**
     * If {@code false}, the typeahead will not show a hint. Defaults to {@code true}.
     * @param hint {@code true} to show a hint
     */
    public void setHint(final boolean hint) {
        this.hint = hint;
    }

    /**
     * The minimum character length needed before suggestions start getting
     * rendered. Defaults to 1.
     * @param minLength minimum required input length for matching
     */
    public void setMinLength(final int minLength) {
        this.minLength = minLength;
    }

    public HandlerRegistration addTypeaheadOpenedHandler(final TypeaheadOpenedHandler<T> handler) {
        return addHandler(handler, TypeaheadOpenedEvent.getType());
    }

    public HandlerRegistration addTypeaheadClosedHandler(final TypeaheadClosedHandler<T> handler) {
        return addHandler(handler, TypeaheadClosedEvent.getType());
    }

    public HandlerRegistration addTypeaheadCursorChangededHandler(final TypeaheadCursorChangedHandler<T> handler) {
        return addHandler(handler, TypeaheadCursorChangedEvent.getType());
    }

    public HandlerRegistration addTypeaheadAutoCompletedHandler(final TypeaheadAutoCompletedHandler<T> handler) {
        return addHandler(handler, TypeaheadAutoCompletedEvent.getType());
    }

    public HandlerRegistration addTypeaheadSelectedHandler(final TypeaheadSelectedHandler<T> handler) {
        return addHandler(handler, TypeaheadSelectedEvent.getType());
    }

    /**
     * Triggered when the dropdown menu of the typeahead is opened.
     * @param event the event
     */
    private void onOpened(final Event event) {
        TypeaheadOpenedEvent.fire(this, event);
    }

    /**
     * Triggered when the dropdown menu of the typeahead is closed.
     * @param event the event
     */
    private void onClosed(final Event event) {
        TypeaheadClosedEvent.fire(this, event);
    }

    /**
     * Triggered when the dropdown menu cursor is moved to a different suggestion.
     * @param event the event
     * @param suggestion the suggestion object
     */
    private void onCursorChanged(final Event event, final Suggestion<T> suggestion) {
        TypeaheadCursorChangedEvent.fire(this, suggestion, event);
    }

    /**
     * Triggered when the query is autocompleted. Autocompleted means the query was changed to the hint.
     * @param event the event
     * @param suggestion the suggestion object
     */
    private void onAutoCompleted(final Event event, final Suggestion<T> suggestion) {
        TypeaheadAutoCompletedEvent.fire(this, suggestion, event);
    }

    /**
     * Triggered when a suggestion from the dropdown menu is selected.
     * @param event the event
     * @param suggestion the suggestion object
     */
    private void onSelected(final Event event, final Suggestion<T> suggestion) {
        TypeaheadSelectedEvent.fire(this, suggestion, event);
    }

    public void reconfigure() {
        remove(getElement());
        configure();
    }

    @Override
    protected void onLoad() {
        super.onLoad();
        configure();
    }

    @Override
    protected void onUnload() {
        super.onUnload();
        remove(getElement());
    }

    protected void configure() {
        JsArray<JavaScriptObject> datasetJSOs = JsArray.createArray().cast();
        for (Dataset<T> dataset : datasets) {
            JavaScriptObject jso = toJSO(dataset);
            datasetJSOs.push(jso);
        }
        configure(getElement(), highlight, hint, minLength, datasetJSOs);
    }

    private JavaScriptObject toJSO(Dataset<T> dataset) {
        Template emptyTemplate = dataset.getEmptyTemplate();
        Template headerTemplate = dataset.getHeaderTemplate();
        Template footerTemplate = dataset.getFooterTemplate();
        SuggestionTemplate suggestionTemplate = dataset.getSuggestionTemplate() != null ? dataset.getSuggestionTemplate() : suggestion -> suggestion.getValue();

        TypeaHead.Fn findMatches = () -> (TypeaHead.Fn2ObjectArgs) (query, fn) -> {
            SuggestionCallback scb = new SuggestionCallback(fn);
            return dataset.findMatches(query, scb);
        };

        JsPropertyMap result = JavaScriptObject.createObject().cast();
        JsPropertyMap templates = JsPropertyMap.of();

        elemental2.core.JsArray source = Js.uncheckedCast(findMatches.onInvoke());
        result.set("name", dataset.getName());
        result.set("source", source);
        result.set("templates", templates);

        if(emptyTemplate != null) {
            Js.asPropertyMap(result.get("templates")).set("empty", (TypeaHead.Fn1Arg) arg -> emptyTemplate.render());
        }
        if(headerTemplate != null) {
            Js.asPropertyMap(result.get("templates")).set("header", (TypeaHead.Fn1Arg) arg -> headerTemplate.render());
        }
        if(footerTemplate != null) {
            Js.asPropertyMap(result.get("templates")).set("footer", (TypeaHead.Fn1Arg) arg -> footerTemplate.render());
        }
        if(suggestionTemplate != null) {
            Js.asPropertyMap(result.get("templates")).set("suggestion", (TypeaHead.Fn1Arg) arg -> suggestionTemplate.render(Js.uncheckedCast(arg)));
        }
        return Js.uncheckedCast(result);
    }

    private void configure(
            Element e, boolean highlight, boolean hint, int minLength, JsArray<JavaScriptObject> datasets) {
        JsPropertyMap templates = JsPropertyMap.of();
        templates.set("highlight", highlight);
        templates.set("hint", hint);
        templates.set("minLength", minLength);

        TypeaHead.jQuery(e).typeahead(templates, datasets)
                .on("typeahead:opened", (TypeaHead.FnEvent) event -> onOpened(event))
                .on("typeahead:closed", (TypeaHead.FnEvent) event -> onClosed(event))
                .on("typeahead:cursorchanged", (TypeaHead.FnEventAndSuggestion) (event, value, datasetName) -> onCursorChanged(event, value))
                .on("typeahead:autocompleted", (TypeaHead.FnEventAndSuggestion) (event, value, datasetName) -> onAutoCompleted(event, value))
                .on("typeahead:selected", (TypeaHead.FnEventAndSuggestion) (event, value, datasetName) -> onSelected(event, value));
    }

    private void remove(Element e) {
        TypeaHead.jQuery(e).typeahead("destroy");
    }

    private void setValueNative(Element e, String value) {
        TypeaHead.jQuery(e).typeahead("val", value);
    }

    @JsType(
            isNative = true,
            namespace = "<global>",
            name = "jQuery"
    )
    static class TypeaHead extends JQuery {

        @JsOverlay
        public static TypeaHead jQuery(Element e) {
            return (TypeaHead) JQuery.$(e);
        }

        public native TypeaHead typeahead(String val);

        public native TypeaHead typeahead(Object val, Object value);

        public native TypeaHead on(String var1, Object arg);

        @FunctionalInterface
        @JsFunction
        interface Fn {

            Object onInvoke();
        }

        @FunctionalInterface
        @JsFunction
        interface FnEvent {

            void onInvoke(Event event);
        }

        @FunctionalInterface
        @JsFunction
        interface FnEventAndSuggestion {

            void onInvoke(Event event, Suggestion suggestion, Object datasetName);
        }

        @FunctionalInterface
        @JsFunction
        interface Fn1Arg {

            Object onInvoke(Object arg);
        }

        @FunctionalInterface
        @JsFunction
        interface Fn2ObjectArgs {

            Object onInvoke(String query, SuggestionCallback.Fn fn);
        }
    }
}
