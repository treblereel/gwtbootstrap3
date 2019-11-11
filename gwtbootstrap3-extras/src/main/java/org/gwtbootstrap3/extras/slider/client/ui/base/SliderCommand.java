package org.gwtbootstrap3.extras.slider.client.ui.base;

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

/**
 * Boostrap slider commands.
 *
 * @author Xiaodong SUN
 * @see https://github.com/seiyria/bootstrap-slider#functions
 */
public interface SliderCommand {

    String GET_VALUE = "getValue";
    String SET_VALUE = "setValue";
    String GET_ELEMENT = "getElement";
    String DESTROY = "destroy";
    String DISABLE = "disable";
    String ENABLE = "enable";
    String TOGGLE = "toggle";
    String IS_ENABLED = "isEnabled";
    String SET_ATTRIBUTE = "setAttribute";
    String GET_ATTRIBUTE = "getAttribute";
    String REFEESH = "refresh";
    String ON = "on";
    String RELAYOUT = "relayout";

}
