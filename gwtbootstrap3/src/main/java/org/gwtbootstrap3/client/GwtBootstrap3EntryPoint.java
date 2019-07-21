package org.gwtbootstrap3.client;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2015 GwtBootstrap3
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

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLLinkElement;
import jsinterop.base.Js;
import org.gwtproject.core.client.EntryPoint;
import org.gwtproject.core.client.ScriptInjector;
import org.gwtproject.dom.client.StyleInjector;

/**
 * Provides script injection for jQuery and boostrap if they aren't already loaded.
 * @author Sven Jacobs
 * @author Steven Jardine
 */
public class GwtBootstrap3EntryPoint implements EntryPoint {

    /**
     * {@inheritDoc}
     */
    @Override
    public void onModuleLoad() {

        StyleInjector.injectStylesheetAtEnd(GwtBootstrap3ClientBundle.INSTANCE.bootstrap_css().getText());

        HTMLLinkElement fontawesome = (HTMLLinkElement) DomGlobal.document.createElement("link");
        fontawesome.href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css";
        fontawesome.rel = "stylesheet";

        DomGlobal.document.head.appendChild(fontawesome);

        ScriptInjector.fromString(GwtBootstrap3ClientBundle.INSTANCE.gwtBootstrap3().getText())
                .setWindow(ScriptInjector.TOP_WINDOW)
                .inject();

        if (!isjQueryLoaded()) {
            ScriptInjector.fromString(GwtBootstrap3ClientBundle.INSTANCE.jQuery().getText())
                    .setWindow(ScriptInjector.TOP_WINDOW)
                    .inject();
        }
        ScriptInjector.fromString(GwtBootstrap3ClientBundle.INSTANCE.bootstrap().getText())
                .setWindow(ScriptInjector.TOP_WINDOW)
                .inject();
    }

    private boolean isjQueryLoaded() {
        return Js.global().has("jQuery");
    }
}
