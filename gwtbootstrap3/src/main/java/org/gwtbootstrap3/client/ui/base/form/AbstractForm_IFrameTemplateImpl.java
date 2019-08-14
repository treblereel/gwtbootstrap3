package org.gwtbootstrap3.client.ui.base.form;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2019 GwtBootstrap3
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
 * This class is generated from org.treblereel.mvp.presenter.components.NavbarPresenter.IFrameTemplate, do not edit manually
 */
public class AbstractForm_IFrameTemplateImpl implements AbstractForm.IFrameTemplate {
  
  /**
   * @Template("<iframe src=\"javascript:''\" name='{0}' tabindex='-1' title='Form submit helper frame'style='position:absolute;width:0;height:0;border:0'>")
   */
  public org.gwtproject.safehtml.shared.SafeHtml get(
        String arg0) {
    StringBuilder sb = new StringBuilder();
    sb.append("<iframe src=\"javascript:''\" name='");
    sb.append(org.gwtproject.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("' tabindex='-1' title='Form submit helper frame'style='position:absolute;width:0;height:0;border:0'>");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
