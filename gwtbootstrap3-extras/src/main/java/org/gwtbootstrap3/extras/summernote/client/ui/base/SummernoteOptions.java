package org.gwtbootstrap3.extras.summernote.client.ui.base;

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

import elemental2.core.JsArray;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtproject.core.client.JavaScriptObject;
import org.gwtproject.core.client.JsArrayMixed;
import org.gwtproject.core.client.JsArrayString;

/**
 * This class represents Summernote options, that you can use to
 * customize the editor.
 * @author Xiaodong SUN
 */
class SummernoteOptions extends JavaScriptObject {

    /**
     * Default constructor
     */
    @JsConstructor
    protected SummernoteOptions() {
    }

    /**
     * Creates a new instance of {@link SummernoteOptions}.
     * @return a new instance of {@link SummernoteOptions}.
     */
    static SummernoteOptions newOptions() {
        return new SummernoteOptions();
    }

    /**
     * Creates a new toolbar group.
     * @param name
     * @param buttons
     * @return
     */
    static final JsArray newToolbarGroup(String name, ToolbarButton... buttons) {
        JsArrayString arr = JavaScriptObject.createArray().cast();
        for (ToolbarButton button : buttons) {
            arr.push(button.getId());
        }
        return getToolbarGroup(name, arr);
    }

    private static final JsArray getToolbarGroup(String name, JsArrayString buttons) {
        JsArray arr = new JsArray<>();
        arr.push(name);
        arr.push(buttons);
        return arr;
    }

    /**
     * Builds the toolbar.
     * @param toolbarGroups
     * @return
     */
    static final JsArray buildToolbar(JsArrayMixed... toolbarGroups) {
        JsArray arr = new JsArray<>();
        for (int i = 0; i < toolbarGroups.length; i++) {
            arr.push(toolbarGroups[i]);
        }
        return arr;
    }

    /**
     * @see {@link SummernoteBase#setPlaceholder(String)}
     */
    final void setPlaceholder(String placeholder) {
        Js.asPropertyMap(this).set("placeholder", placeholder);
    }
    /**
     * @see {@link SummernoteBase#setFontNames(boolean)}
     */
    final void setFontNames(JsArrayString fontNames) {
        Js.asPropertyMap(this).set("fontNames", fontNames);
    }

    /**
     * @see {@link SummernoteBase#setFontNamesIgnoreCheck(boolean)}
     */
    final void setFontNamesIgnoreCheck(JsArrayString fontNamesIgnoreCheck) {
        Js.asPropertyMap(this).set("fontNamesIgnoreCheck", fontNamesIgnoreCheck);
    }

    /**
     * @see {@link SummernoteBase#setDialogsInBody(boolean)}
     */
    final void setDialogsInBody(boolean dialogsInBody) {
        Js.asPropertyMap(this).set("dialogsInBody", dialogsInBody);
    }

    /**
     * @see {@link SummernoteBase#setDialogsFade(boolean)}
     */
    final void setDialogsFade(boolean dialogsFade) {
        Js.asPropertyMap(this).set("dialogsFade", dialogsFade);
    }

    /**
     * @see {@link SummernoteBase#setDisableDragAndDrop(boolean)}
     */
    final void setDisableDragAndDrop(boolean disableDragAndDrop) {
        Js.asPropertyMap(this).set("disableDragAndDrop", disableDragAndDrop);
    }
    /**
     * @see {@link SummernoteBase#setShortcuts(boolean)}
     */
    final void setShortcuts(boolean shortcuts) {
        Js.asPropertyMap(this).set("shortcuts", shortcuts);
    }
    /**
     * @see {@link SummernoteBase#setShowToolbar(boolean)}
     */
    final void setShowToolbar(boolean showToolbar) {
        if (!showToolbar) {
            Js.asPropertyMap(this).set("toolbar", false);
        } else if (Js.asPropertyMap(this).has("toolbar")) {
            Js.asPropertyMap(this).delete("toolbar");
        }
    }

    /**
     * @see {@link SummernoteBase#setToolbar(Toolbar)}
     */
    final void setToolbar(Toolbar toolbar) {
        Js.asPropertyMap(this).set("toolbar", toolbar.build());
    }

    /**
     * @see {@link SummernoteBase#setDefaultHeight(int)}
     */
    final void setHeight(int height) {
        Js.asPropertyMap(this).set("height", height);
    }

    /**
     * @see {@link SummernoteBase#setMaxHeight(int)}
     */
    final void setMaxHeight(int maxHeight) {
        Js.asPropertyMap(this).set("maxHeight", maxHeight);
    }

    /**
     * @see {@link SummernoteBase#setMinHeight(int)}
     */
    final void setMinHeight(int minHeight) {
        Js.asPropertyMap(this).set("minHeight", minHeight);
    }

    /**
     * @see {@link SummernoteBase#setHasFocus(boolean)}
     */
    final void setFocus(boolean focus) {
        Js.asPropertyMap(this).set("focus", focus);
    }

    /**
     * @see {@link SummernoteBase#setLanguage(SummernoteLanguage)}
     */
    final void setLanguage(SummernoteLanguage language) {
        Js.asPropertyMap(this).set("lang", language.getCode());
    }

    /**
     * @see {@link SummernoteBase#setAirMode(boolean)}
     */
    final void setAirMode(boolean airMode) {
        Js.asPropertyMap(this).set("airMode", airMode);
    }

    /**
     * @see {@link SummernoteBase#setHint(String, HintHandler)}
     */
    final void setHint(String match, HintHandler searchHandler) {
        JsPropertyMap map = JsPropertyMap.of();
        Js.asPropertyMap(this).set("hint", map);
        map.set("match", new RegExp(match));
        map.set("search", (Fn2Args) (keyword, callback) -> {
            String[] items = searchHandler.onSearch(keyword);
            JsArray result = new JsArray<>();
            for (int i = 0; i < items.length; i++) {
                result.push(items[i]);
            }
            callback.onInvoke(result);
        });
        map.set("template", (Fn) item -> searchHandler.getTemplate(Js.uncheckedCast(item)));
        map.set("content", (Fn) item -> searchHandler.getContent(Js.uncheckedCast(item)));
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn {

        Object onInvoke(Object value);
    }

    @FunctionalInterface
    @JsFunction
    private interface Fn2Args {

        void onInvoke(String arg1, Fn arg2);
    }

    @JsType(namespace = JsPackage.GLOBAL, isNative = true)
    private static class RegExp {

        @JsConstructor
        public RegExp(String value) {

        }
    }
}
