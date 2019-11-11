package org.gwtbootstrap3.extras.gallery.client.events;

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


import org.gwtbootstrap3.extras.gallery.client.ui.Gallery;
import org.gwtproject.event.legacy.shared.GwtEvent;
import org.gwtproject.user.client.Event;

/**
 * Triggered when the gallery is closed.
 *
 * @author Ben Dol
 */
public class GalleryClosedEvent extends GwtEvent<GalleryClosedHandler> {

    public static void fire(final Gallery source, final Event nativeEvent) {
        GalleryClosedEvent event = new GalleryClosedEvent(source, nativeEvent);
        source.fireEvent(event);
    }

    private static final Type<GalleryClosedHandler> TYPE = new Type<GalleryClosedHandler>();

    private final Gallery gallery;
    private final Event nativeEvent;

    public static Type<GalleryClosedHandler> getType() {
        return TYPE;
    }

    private GalleryClosedEvent(final Gallery gallery, final Event nativeEvent) {
        this.gallery = gallery;
        this.nativeEvent = nativeEvent;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public Event getNativeEvent() {
        return nativeEvent;
    }

    @Override
    public Type<GalleryClosedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(final GalleryClosedHandler handler) {
        handler.onClosed(this);
    }
}
