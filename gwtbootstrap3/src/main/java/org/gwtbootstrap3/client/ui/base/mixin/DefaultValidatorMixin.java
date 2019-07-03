package org.gwtbootstrap3.client.ui.base.mixin;

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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.gwtbootstrap3.client.ui.form.error.ErrorHandler;
import org.gwtbootstrap3.client.ui.form.validator.HasValidators;
import org.gwtbootstrap3.client.ui.form.validator.ValidationChangedEvent;
import org.gwtbootstrap3.client.ui.form.validator.ValidationChangedEvent.ValidationChangedHandler;
import org.gwtbootstrap3.client.ui.form.validator.Validator;
import org.gwtbootstrap3.client.ui.form.validator.ValidatorWrapper;
import org.gwtproject.editor.client.Editor;
import org.gwtproject.editor.client.EditorError;
import org.gwtproject.event.dom.client.BlurEvent;
import org.gwtproject.event.dom.client.BlurHandler;
import org.gwtproject.event.legacy.shared.GwtEvent;
import org.gwtproject.event.logical.shared.ValueChangeEvent;
import org.gwtproject.event.logical.shared.ValueChangeHandler;
import org.gwtproject.event.shared.Event;
import org.gwtproject.event.shared.EventBus;
import org.gwtproject.event.shared.HandlerRegistration;
import org.gwtproject.event.shared.SimpleEventBus;
import org.gwtproject.user.client.ui.HasValue;
import org.gwtproject.user.client.ui.Widget;

/**
 * Abstract validator mixin. Contains all of the validation logic.
 *
 * @param <W> the generic type
 * @param <V> the value type
 * 
 * @author Steven Jardine
 */
public class DefaultValidatorMixin<W extends Widget & HasValue<V> & Editor<V>, V> implements HasValidators<V> {

    protected ErrorHandler errorHandler;

    private EventBus eventBus;

    private W inputWidget;

    private Boolean valid = null;

    private boolean validateOnBlur;

    protected Set<ValidatorWrapper<V>> validators = new TreeSet<ValidatorWrapper<V>>();

    /**
     * Instantiates a new abstract validator mixin.
     *
     * @param inputWidget the input widget
     * @param errorHandler the error handler
     */
    public DefaultValidatorMixin(W inputWidget, ErrorHandler errorHandler) {
        this.inputWidget = inputWidget;
        this.errorHandler = errorHandler;
        eventBus = new SimpleEventBus();

        setupBlurValidation();
        setupValueChangeValidation();
    }

    protected HandlerRegistration setupBlurValidation() {
        return inputWidget.addDomHandler(new BlurHandler() {
            @Override
            public void onBlur(BlurEvent event) {
                validate(validateOnBlur);
            }
        }, BlurEvent.getType());
    }

    protected HandlerRegistration setupValueChangeValidation() {
        return inputWidget.addHandler(new ValueChangeHandler<V>() {
            @Override
            public void onValueChange(ValueChangeEvent<V> event) {
                validate(false);
            }
        }, ValueChangeEvent.getType());
    }

    @Override
    public HandlerRegistration addValidationChangedHandler(ValidationChangedHandler handler) {
        return eventBus.addHandler(ValidationChangedEvent.getType(), handler);
    }

    /** {@inheritDoc} */
    @Override
    public void addValidator(Validator<V> validator) {
        validators.add(new ValidatorWrapper<V>(validator, validators.size()));
    }

    /**
     * @return the inputWidget
     */
    public W getInputWidget() {
        return inputWidget;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getValidateOnBlur() {
        return validateOnBlur;
    }

    /** {@inheritDoc} */
    @Override
    public boolean removeValidator(Validator<V> validator) {
        for (ValidatorWrapper<V> wrapper : validators) {
            if (wrapper.getValidator().equals(validator)) { return validators.remove(wrapper); }
        }
        return false;
    }

    /** {@inheritDoc} */
    @Override
    public void reset() {
        if (errorHandler != null) {
            errorHandler.clearErrors();
        }
    }

    /**
     * Sets the error handler.
     *
     * @param errorHandler the new error handler
     */
    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    /** {@inheritDoc} */
    @Override
    public void setValidateOnBlur(boolean vob) {
        validateOnBlur = vob;
    }

    /** {@inheritDoc} */
    @Override
    public void setValidators(@SuppressWarnings("unchecked") Validator<V>... newValidators) {
        validators.clear();
        for (Validator<V> validator : newValidators) {
            addValidator(validator);
        }
    }

    /** {@inheritDoc} */
    @Override
    public boolean validate() {
        return validate(true);
    }

    /** {@inheritDoc} */
    @Override
    public boolean validate(boolean show) {
        Boolean oldValid = valid;
        valid = true;
        if (errorHandler != null && !validators.isEmpty()) {
            List<EditorError> errors = new ArrayList<EditorError>();
            for (ValidatorWrapper<V> wrapper : validators) {
                Validator<V> validator = wrapper.getValidator();
                List<EditorError> result = validator.validate(inputWidget, inputWidget.getValue());
                if (result != null && !result.isEmpty()) {
                    errors.addAll(result);
                    valid = false;
                }
            }
            if (show) {
                if (errors.size() > 0) {
                    errorHandler.showErrors(errors);
                } else {
                    errorHandler.clearErrors();
                }
            }
        }
        if (valid != oldValid) {
            eventBus.fireEvent(new ValidationChangedEvent(valid));
        }
        return valid;
    }

    @Override
    public void fireEvent(Event<?> event) {
        eventBus.fireEvent(event);
    }
}
