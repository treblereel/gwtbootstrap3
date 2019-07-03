package org.gwtbootstrap3.client.shared.event;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
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

import org.gwtproject.event.legacy.shared.GwtEvent;
import org.gwtproject.user.client.Event;

/**
 * @author Sven Jacobs
 */
public class AlertClosedEvent extends GwtEvent<AlertClosedHandler> {

    private static final Type<AlertClosedHandler> TYPE = new Type<AlertClosedHandler>();

    private final Event nativeEvent;

    public static Type<AlertClosedHandler> getType() {
        return TYPE;
    }

    public AlertClosedEvent(final Event nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Event getNativeEvent() {
        return nativeEvent;
    }

    @Override
    public Type<AlertClosedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(final AlertClosedHandler handler) {
        handler.onClosed(this);
    }
}
