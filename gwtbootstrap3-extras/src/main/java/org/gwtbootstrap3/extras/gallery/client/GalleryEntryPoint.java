package org.gwtbootstrap3.extras.gallery.client;

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

import org.gwtproject.core.client.EntryPoint;
import org.gwtproject.core.client.ScriptInjector;
import org.gwtproject.dom.client.StyleInjector;

/**
 * @author Ben Dol
 */
public class GalleryEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        inject(GalleryClientBundle.INSTANCE.BLUEIMP_JS().getText());
        inject(GalleryClientBundle.INSTANCE.GALLERY_JS().getText());
        StyleInjector.injectStylesheetAtEnd(GalleryClientBundle.INSTANCE.GALLERY_CSS().getText());
        StyleInjector.injectStylesheetAtEnd(GalleryClientBundle.INSTANCE.GALLERY_FIX_CSS().getText());
        StyleInjector.injectStylesheetAtEnd(GalleryClientBundle.INSTANCE.GALLERY_IMAGE_CSS().getText());

    }

    private void inject(String resource) {
        ScriptInjector.fromString(resource).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
