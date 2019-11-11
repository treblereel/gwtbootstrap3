package org.gwtbootstrap3.extras.select.client.ui;

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
import jsinterop.base.Js;
import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.client.ui.constants.Styles;
import org.gwtproject.core.client.JavaScriptObject;

/**
 * This class represents select options, that you can use to
 * customize the select picker.
 * @author Xiaodong Sun
 */
class SelectOptions extends JavaScriptObject {

    private static final String DATA_PREFIX = "data-";

    // Select (<select data-xx="xx">) options
    static final String ACTIONS_BOX = DATA_PREFIX + "actions-box";
    static final String CONTAINER = DATA_PREFIX + "container";
    static final String DESELECT_ALL_TEXT = DATA_PREFIX + "deselect-all-text";
    static final String DROPDOWN_ALIGN_RIGHT = DATA_PREFIX + "dropdown-align-right";
    static final String DROPUP_AUTO = DATA_PREFIX + "dropup-auto";
    static final String HEADER = DATA_PREFIX + "header";
    static final String HIDE_DISABLED = DATA_PREFIX + "hide-disabled";
    static final String LIVE_SEARCH = DATA_PREFIX + "live-search";
    static final String LIVE_SEARCH_NORMALIZE = DATA_PREFIX + "live-search-normalize";
    static final String LIVE_SEARCH_PLACEHOLDER = DATA_PREFIX + "live-search-placeholder";
    static final String LIVE_SEARCH_STYLE = DATA_PREFIX + "live-search-style";
    static final String MAX_OPTIONS = DATA_PREFIX + "max-options";
    static final String MOBILE = DATA_PREFIX + "mobile";
    static final String MULTIPLE_SEPARATOR = DATA_PREFIX + "multiple-separator";
    static final String NONE_SELECTED_TEXT = DATA_PREFIX + "none-selected-text";
    static final String SELECT_ALL_TEXT = DATA_PREFIX + "select-all-text";
    static final String SELECTED_TEXT_FORMAT = DATA_PREFIX + "selected-text-format";
    static final String SELECT_ON_TAB = DATA_PREFIX + "select-on-tab";
    static final String SHOW_CONTENT = DATA_PREFIX + "show-content";
    static final String SHOW_ICON = DATA_PREFIX + "show-icon";
    static final String SHOW_SUBTEXT = DATA_PREFIX + "show-subtext";
    static final String SHOW_TICK = DATA_PREFIX + "show-tick";
    static final String SIZE = DATA_PREFIX + "size";
    static final String STYLE = DATA_PREFIX + "style";
    static final String TITLE = DATA_PREFIX + "title";
    static final String WIDTH = DATA_PREFIX + "width";
    static final String WINDOW_PADDING = DATA_PREFIX + "window-padding";

    // Option (<option data-xx="xx">) options
    static final String DIVIDER = DATA_PREFIX + "divider";
    static final String SUBTEXT = DATA_PREFIX + "subtext";
    static final String ICON = DATA_PREFIX + "icon";
    static final String TOKENS = DATA_PREFIX + "tokens";
    static final String CONTENT = DATA_PREFIX + "content";
    static final String HIDDEN = DATA_PREFIX + "hidden";

    /**
     * Default constructor
     */
    @JsConstructor
    protected SelectOptions() {
    }

    /**
     * Creates a new instance of {@link SelectOptions}.
     * @return a new instance of {@link SelectOptions}.
     */
    static SelectOptions newOptions() {
        SelectOptions options = new SelectOptions();
        options.init(Styles.FONT_AWESOME_BASE, IconType.CHECK.getCssName());
        return options;
    }

    private final void init(String iconBase, String tickIcon) {
        Js.asPropertyMap(this).set("iconBase", iconBase);
        Js.asPropertyMap(this).set("tickIcon", tickIcon);
    }

    /**
     * @see {@link SelectBase#setCountSelectedTextHandler(CountSelectedTextHandler)}
     */
    final void setCountSelectedTextHandler(CountSelectedTextHandler handler) {
        if (handler != null) {
            Js.asPropertyMap(this).set("countSelectedText", (SelectPicker.Fn2Args) (selectedCount, totalCount) -> handler.getCountSelectedText(selectedCount, totalCount));
        } else if (Js.asPropertyMap(this).has("countSelectedText")) {
            Js.asPropertyMap(this).delete("countSelectedText");
        }
    }

    /**
     * @see {@link MultipleSelect#setMaxOptionsTextHandler(MaxOptionsTextHandler)}
     */
    final void setMaxOptionsTextHandler(MaxOptionsTextHandler handler) {
        if (handler != null) {
            Js.asPropertyMap(this).set("maxOptionsText", (SelectPicker.Fn2Args) (numAll, numGroup) -> {
                JsArray result = new JsArray<>();
                result.push(handler.getMaxSelectOptionsText(numAll), handler.getMaxGroupOptionsText(numGroup));
                return result;
            });
        } else if (Js.asPropertyMap(this).has("maxOptionsText")) {
            Js.asPropertyMap(this).delete("maxOptionsText");
        }
    }
}
