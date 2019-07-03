package org.gwtbootstrap3.client.ui;

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

import org.gwtbootstrap3.client.ui.constants.Styles;

import org.gwtproject.dom.client.Document;
import org.gwtproject.i18n.client.HasDirection;
import org.gwtproject.i18n.shared.DirectionEstimator;
import org.gwtproject.safehtml.shared.SafeHtml;
import org.gwtproject.uibinder.client.UiConstructor;
import org.gwtproject.user.client.DOM;

/**
 * An inline radio button widget.
 *
 * @author Sven Jacobs
 * @see org.gwtbootstrap3.client.ui.Radio
 */
public class InlineRadio extends Radio {

    /**
     * Creates a new radio associated with a particular group, and initialized
     * with the given HTML label. All radio buttons associated with the same
     * group name belong to a mutually-exclusive set.
     * 
     * Radio buttons are grouped by their name attribute, so changing their name
     * using the setName() method will also change their associated group.
     * 
     * @param name
     *            the group name with which to associate the radio button
     * @param label
     *            this radio button's html label
     */
    public InlineRadio(String name, SafeHtml label) {
        this(name, label.asString(), true);
    }

    /**
     * @see #InlineRadio(String, SafeHtml)
     * 
     * @param name
     *            the group name with which to associate the radio button
     * @param label
     *            this radio button's html label
     * @param dir
     *            the text's direction. Note that {@code DEFAULT} means
     *            direction should be inherited from the widget's parent
     *            element.
     */
    public InlineRadio(String name, SafeHtml label, HasDirection.Direction dir) {
        this(name);
        setHTML(label, dir);
    }

    /**
     * @see #InlineRadio(String, SafeHtml)
     * 
     * @param name
     *            the group name with which to associate the radio button
     * @param label
     *            this radio button's html label
     * @param directionEstimator
     *            A DirectionEstimator object used for automatic direction
     *            adjustment. For convenience,
     *            {@link #DEFAULT_DIRECTION_ESTIMATOR} can be used.
     */
    public InlineRadio(String name, SafeHtml label, DirectionEstimator directionEstimator) {
        this(name);
        setDirectionEstimator(directionEstimator);
        setHTML(label.asString());
    }

    /**
     * Creates a new radio associated with a particular group, and initialized
     * with the given HTML label. All radio buttons associated with the same
     * group name belong to a mutually-exclusive set.
     * 
     * Radio buttons are grouped by their name attribute, so changing their name
     * using the setName() method will also change their associated group.
     * 
     * @param name
     *            the group name with which to associate the radio button
     * @param label
     *            this radio button's label
     */
    public InlineRadio(String name, String label) {
        this(name);
        setText(label);
    }

    /**
     * @see #InlineRadio(String, SafeHtml)
     * 
     * @param name
     *            the group name with which to associate the radio button
     * @param label
     *            this radio button's label
     * @param dir
     *            the text's direction. Note that {@code DEFAULT} means
     *            direction should be inherited from the widget's parent
     *            element.
     */
    public InlineRadio(String name, String label, HasDirection.Direction dir) {
        this(name);
        setText(label, dir);
    }

    /**
     * @see #InlineRadio(String, SafeHtml)
     * 
     * @param name
     *            the group name with which to associate the radio button
     * @param label
     *            this radio button's label
     * @param directionEstimator
     *            A DirectionEstimator object used for automatic direction
     *            adjustment. For convenience,
     *            {@link #DEFAULT_DIRECTION_ESTIMATOR} can be used.
     */
    public InlineRadio(String name, String label, DirectionEstimator directionEstimator) {
        this(name);
        setDirectionEstimator(directionEstimator);
        setText(label);
    }

    /**
     * Creates a new radio button associated with a particular group, and
     * initialized with the given label (optionally treated as HTML). All radio
     * buttons associated with the same group name belong to a
     * mutually-exclusive set.
     * 
     * Radio buttons are grouped by their name attribute, so changing their name
     * using the setName() method will also change their associated group.
     * 
     * @param name
     *            name the group with which to associate the radio button
     * @param label
     *            this radio button's label
     * @param asHTML
     *            <code>true</code> to treat the specified label as HTML
     */
    public InlineRadio(String name, String label, boolean asHTML) {
        this(name);
        if (asHTML) {
            setHTML(label);
        } else {
            setText(label);
        }
    }

    /**
     * Creates a new radio associated with a particular group name. All radio
     * buttons associated with the same group name belong to a
     * mutually-exclusive set.
     * 
     * Radio buttons are grouped by their name attribute, so changing their name
     * using the setName() method will also change their associated group.
     * 
     * @param name
     *            the group name with which to associate the radio button
     */
    @UiConstructor
    public InlineRadio(String name) {
        super(DOM.createLabel(), Document.get().createRadioInputElement(name));
        setStyleName(Styles.RADIO_INLINE);

        getElement().appendChild(inputElem);
        getElement().appendChild(labelElem);
    }

}
