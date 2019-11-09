package org.gwtbootstrap3.extras.gallery.client.ui;

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

import org.gwtbootstrap3.client.ui.base.ComplexWidget;
import org.gwtbootstrap3.client.ui.base.HasHref;
import org.gwtproject.core.client.Scheduler;
import org.gwtproject.dom.client.AnchorElement;
import org.gwtproject.dom.client.Document;
import org.gwtproject.dom.client.Style;
import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.event.dom.client.ClickHandler;
import org.gwtproject.event.dom.client.HasClickHandlers;
import org.gwtproject.event.dom.client.HasLoadHandlers;
import org.gwtproject.event.dom.client.LoadEvent;
import org.gwtproject.event.dom.client.LoadHandler;
import org.gwtproject.event.shared.HandlerRegistration;
import org.gwtproject.uibinder.client.UiConstructor;
import org.gwtproject.user.client.Command;
import org.gwtproject.user.client.ui.Image;
import org.gwtproject.user.client.ui.Widget;

/**
 * Gallery Image
 *
 * @author Ben Dol
 */
public class GalleryImage extends ComplexWidget implements HasHref,
                                                           HasLoadHandlers {

    private Image image;

    @UiConstructor
    public GalleryImage(String url) {
        setElement(Document.get().createAnchorElement());
        getElement().setAttribute("data-gallery", "data-gallery");
        getElement().getStyle().setDisplay(Style.Display.INLINE_TABLE);

        setHref(url);

        image = new Image(url);
        add(image);
    }

    @Override
    public void add(final Widget child) {
        if(child instanceof Image) {
            if(image != null) {
                image.removeFromParent();
            }

            image = (Image) child;
            setHref(image.getUrl());

            super.add(image);
        } else if(child instanceof HasClickHandlers) {
            ((HasClickHandlers) child).addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    event.stopPropagation();
                }
            });

            Scheduler.get().scheduleDeferred(new Command() {
                @Override
                public void execute() {
                    Style style = child.getElement().getStyle();
                    style.setPosition(Style.Position.RELATIVE);
                    style.setBottom((double) image.getHeight(), Style.Unit.PX);
                    style.setLeft(4, Style.Unit.PX);
                }
            });

            super.add(child);
        } else {
            super.add(child);
        }
    }

    @Override
    public void setHref(String href) {
        AnchorElement.as(getElement()).setHref(href);
    }

    @Override
    public String getHref() {
        return AnchorElement.as(getElement()).getHref();
    }

    @Override
    public void setWidth(String width) {
        super.setWidth(width);
        image.setWidth(width);
    }

    @Override
    public void setHeight(String height) {
        super.setHeight(height);
        image.setHeight(height);

        Scheduler.get().scheduleDeferred(new Command() {
            @Override
            public void execute() {
                for (Widget child : GalleryImage.this) {
                    if (child instanceof HasClickHandlers && !(child instanceof Image)) {
                        Style style = child.getElement().getStyle();
                        style.setBottom((double) image.getHeight(), Style.Unit.PX);
                    }
                }
            }
        });
    }

    @Override
    public HandlerRegistration addLoadHandler(LoadHandler handler) {
        return image.addHandler(handler, LoadEvent.getType());
    }
}
