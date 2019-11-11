package org.gwtbootstrap3.extras.card.client;

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

import org.gwtproject.resources.client.ResourcePrototype;

public class CardClientBundleImpl implements CardClientBundle {
  private static CardClientBundleImpl _instance0 = new CardClientBundleImpl();
  private void card_cssInitializer() {
    card_css = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/card/client/resource/css/card-1.0.1.cache.css
      public String getText() {
        return ".flip {\n    -webkit-perspective: 800px;\n    -moz-perspective: 800px;\n    -ms-perspective: 800px;\n    -o-perspective: 800px;\n    perspective: 800px;\n    position: relative;\n    min-height: 100px;\n    width: 100%;\n}\n\n/*Horizontal Flip*/\n.flip .card.flipped {\n    -webkit-transform: rotateY(180deg);\n    -moz-transform: rotateY(180deg);\n    -ms-transform: rotateY(180deg);\n    -o-transform: rotateY(180deg);\n    transform: rotateY(180deg);\n}\n\n/*Vertical Flip*/\n/*.flip .card.flipped {*/\n/*-webkit-transform: rotateX(-180deg);*/\n/*-moz-transform: rotateX(-180deg);*/\n/*-ms-transform: rotateX(-180deg);*/\n/*-o-transform: rotateX(-180deg);*/\n/*transform: rotateX(-180deg);*/\n/*}*/\n\n.flip .card {\n    width: 100%;\n    min-height: 100px;\n    height: 100%;\n    border: 1px solid #CCC;\n    -webkit-transform-style: preserve-3d;\n    -moz-transform-style: preserve-3d;\n    -ms-transform-style: preserve-3d;\n    -o-transform-style: preserve-3d;\n    transform-style: preserve-3d;\n    -webkit-transition: 1.0s;\n    -moz-transition: 1.0s;\n    -ms-transition: 1.0s;\n    -o-transition: 1.0s;\n    transition: 1.0s;\n}\n\n.flip .card .face {\n    width: 100%;\n    height: 100%;\n    position: absolute;\n    padding: 5px;\n    -webkit-backface-visibility: hidden;\n    -moz-backface-visibility: hidden;\n    -ms-backface-visibility: hidden;\n    -o-backface-visibility: hidden;\n    backface-visibility: hidden;\n    z-index: 2;\n    transform: rotateX(0deg); /* Fix for firefox backface-visibility bug. */\n}\n\n.flip .card .front {\n    position: absolute;\n    z-index: 1;\n}\n\n/*Horizontal Flip*/\n.flip .card .back {\n    -webkit-transform: rotateY(180deg);\n    -moz-transform: rotateY(180deg);\n    -ms-transform: rotateY(180deg);\n    -o-transform: rotateY(180deg);\n    transform: rotateY(180deg);\n}\n\n/*Vertical Flip*/\n/*.flip .card .back {*/\n/*-webkit-transform: rotateX(-180deg);*/\n/*-moz-transform: rotateX(-180deg);*/\n/*-ms-transform: rotateX(-180deg);*/\n/*-o-transform: rotateX(-180deg);*/\n/*transform: rotateX(-180deg);*/\n/*}*/\n\n.trigger {\n    cursor: pointer;\n    position: absolute;\n    bottom: 5px;\n    right: 5px;\n}";
      }
      public String getName() {
        return "card_css";
      }
    }
    ;
  }
  private static class card_cssInitializer {
    static {
      _instance0.card_cssInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return card_css;
    }
  }
  public org.gwtproject.resources.client.TextResource card_css() {
    return card_cssInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static org.gwtproject.resources.client.TextResource card_css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      card_css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
        resourceMap.put("card_css", card_css());
      }
      return resourceMap.get(name);
  }
}
