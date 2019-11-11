package org.gwtbootstrap3.extras.notify.client;

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

public class NotifyClientBundleImpl implements NotifyClientBundle {
  private static NotifyClientBundleImpl _instance0 = new NotifyClientBundleImpl();
  private void notifyJSInitializer() {
    notifyJS = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/notify/client/resource/js/bootstrap-notify-3.1.3.min.cache.js
      public String getText() {
        return "/* Project: Bootstrap Growl = v3.1.3 | Description: Turns standard Bootstrap alerts into \"Growl-like\" notifications. | Author: Mouse0270 aka Robert McIntosh | License: MIT License | Website: https://github.com/mouse0270/bootstrap-growl */\n!function(t){\"function\"==typeof define&&define.amd?define([\"jquery\"],t):t(\"object\"==typeof exports?require(\"jquery\"):jQuery)}(function(t){function e(e,i,n){var i={content:{message:\"object\"==typeof i?i.message:i,title:i.title?i.title:\"\",icon:i.icon?i.icon:\"\",url:i.url?i.url:\"#\",target:i.target?i.target:\"-\"}};n=t.extend(!0,{},i,n),this.settings=t.extend(!0,{},s,n),this._defaults=s,\"-\"==this.settings.content.target&&(this.settings.content.target=this.settings.url_target),this.animations={start:\"webkitAnimationStart oanimationstart MSAnimationStart animationstart\",end:\"webkitAnimationEnd oanimationend MSAnimationEnd animationend\"},\"number\"==typeof this.settings.offset&&(this.settings.offset={x:this.settings.offset,y:this.settings.offset}),this.init()}var s={element:\"body\",position:null,type:\"info\",allow_dismiss:!0,newest_on_top:!1,showProgressbar:!1,placement:{from:\"top\",align:\"right\"},offset:20,spacing:10,z_index:1031,delay:5e3,timer:1e3,url_target:\"_blank\",mouse_over:null,animate:{enter:\"animated fadeInDown\",exit:\"animated fadeOutUp\"},onShow:null,onShown:null,onClose:null,onClosed:null,icon_type:\"class\",template:'<div data-notify=\"container\" class=\"col-xs-11 col-sm-4 alert alert-{0}\" role=\"alert\"><button type=\"button\" aria-hidden=\"true\" class=\"close\" data-notify=\"dismiss\">&times;</button><span data-notify=\"icon\"></span> <span data-notify=\"title\">{1}</span> <span data-notify=\"message\">{2}</span><div class=\"progress\" data-notify=\"progressbar\"><div class=\"progress-bar progress-bar-{0}\" role=\"progressbar\" aria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 0%;\"></div></div><a href=\"{3}\" target=\"{4}\" data-notify=\"url\"></a></div>'};String.format=function(){for(var t=arguments[0],e=1;e<arguments.length;e++)t=t.replace(RegExp(\"\\\\{\"+(e-1)+\"\\\\}\",\"gm\"),arguments[e]);return t},t.extend(e.prototype,{init:function(){var t=this;this.buildNotify(),this.settings.content.icon&&this.setIcon(),\"#\"!=this.settings.content.url&&this.styleURL(),this.placement(),this.bind(),this.notify={$ele:this.$ele,update:function(e,s){var i={};\"string\"==typeof e?i[e]=s:i=e;for(var e in i)switch(e){case\"type\":this.$ele.removeClass(\"alert-\"+t.settings.type),this.$ele.find('[data-notify=\"progressbar\"] > .progress-bar').removeClass(\"progress-bar-\"+t.settings.type),t.settings.type=i[e],this.$ele.addClass(\"alert-\"+i[e]).find('[data-notify=\"progressbar\"] > .progress-bar').addClass(\"progress-bar-\"+i[e]);break;case\"icon\":var n=this.$ele.find('[data-notify=\"icon\"]');\"class\"==t.settings.icon_type.toLowerCase()?n.removeClass(t.settings.content.icon).addClass(i[e]):(n.is(\"img\")||n.find(\"img\"),n.attr(\"src\",i[e]));break;case\"progress\":var a=t.settings.delay-t.settings.delay*(i[e]/100);this.$ele.data(\"notify-delay\",a),this.$ele.find('[data-notify=\"progressbar\"] > div').attr(\"aria-valuenow\",i[e]).css(\"width\",i[e]+\"%\");break;case\"url\":this.$ele.find('[data-notify=\"url\"]').attr(\"href\",i[e]);break;case\"target\":this.$ele.find('[data-notify=\"url\"]').attr(\"target\",i[e]);break;default:this.$ele.find('[data-notify=\"'+e+'\"]').html(i[e])}var o=this.$ele.outerHeight()+parseInt(t.settings.spacing)+parseInt(t.settings.offset.y);t.reposition(o)},close:function(){t.close()}}},buildNotify:function(){var e=this.settings.content;this.$ele=t(String.format(this.settings.template,this.settings.type,e.title,e.message,e.url,e.target)),this.$ele.attr(\"data-notify-position\",this.settings.placement.from+\"-\"+this.settings.placement.align),this.settings.allow_dismiss||this.$ele.find('[data-notify=\"dismiss\"]').css(\"display\",\"none\"),(this.settings.delay<=0&&!this.settings.showProgressbar||!this.settings.showProgressbar)&&this.$ele.find('[data-notify=\"progressbar\"]').remove()},setIcon:function(){\"class\"==this.settings.icon_type.toLowerCase()?this.$ele.find('[data-notify=\"icon\"]').addClass(this.settings.content.icon):this.$ele.find('[data-notify=\"icon\"]').is(\"img\")?this.$ele.find('[data-notify=\"icon\"]').attr(\"src\",this.settings.content.icon):this.$ele.find('[data-notify=\"icon\"]').append('<img src=\"'+this.settings.content.icon+'\" alt=\"Notify Icon\" />')},styleURL:function(){this.$ele.find('[data-notify=\"url\"]').css({backgroundImage:\"url(data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7)\",height:\"100%\",left:\"0px\",position:\"absolute\",top:\"0px\",width:\"100%\",zIndex:this.settings.z_index+1}),this.$ele.find('[data-notify=\"dismiss\"]').css({position:\"absolute\",right:\"10px\",top:\"5px\",zIndex:this.settings.z_index+2})},placement:function(){var e=this,s=this.settings.offset.y,i={display:\"inline-block\",margin:\"0px auto\",position:this.settings.position?this.settings.position:\"body\"===this.settings.element?\"fixed\":\"absolute\",transition:\"all .5s ease-in-out\",zIndex:this.settings.z_index},n=!1,a=this.settings;switch(t('[data-notify-position=\"'+this.settings.placement.from+\"-\"+this.settings.placement.align+'\"]:not([data-closing=\"true\"])').each(function(){return s=Math.max(s,parseInt(t(this).css(a.placement.from))+parseInt(t(this).outerHeight())+parseInt(a.spacing))}),1==this.settings.newest_on_top&&(s=this.settings.offset.y),i[this.settings.placement.from]=s+\"px\",this.settings.placement.align){case\"left\":case\"right\":i[this.settings.placement.align]=this.settings.offset.x+\"px\";break;case\"center\":i.left=0,i.right=0}this.$ele.css(i).addClass(this.settings.animate.enter),t.each(Array(\"webkit\",\"moz\",\"o\",\"ms\",\"\"),function(t,s){e.$ele[0].style[s+\"AnimationIterationCount\"]=1}),t(this.settings.element).append(this.$ele),1==this.settings.newest_on_top&&(s=parseInt(s)+parseInt(this.settings.spacing)+this.$ele.outerHeight(),this.reposition(s)),t.isFunction(e.settings.onShow)&&e.settings.onShow.call(this.$ele),this.$ele.one(this.animations.start,function(){n=!0}).one(this.animations.end,function(){t.isFunction(e.settings.onShown)&&e.settings.onShown.call(this)}),setTimeout(function(){n||t.isFunction(e.settings.onShown)&&e.settings.onShown.call(this)},600)},bind:function(){var e=this;if(this.$ele.find('[data-notify=\"dismiss\"]').on(\"click\",function(){e.close()}),this.$ele.mouseover(function(){t(this).data(\"data-hover\",\"true\")}).mouseout(function(){t(this).data(\"data-hover\",\"false\")}),this.$ele.data(\"data-hover\",\"false\"),this.settings.delay>0){e.$ele.data(\"notify-delay\",e.settings.delay);var s=setInterval(function(){var t=parseInt(e.$ele.data(\"notify-delay\"))-e.settings.timer;if(\"false\"===e.$ele.data(\"data-hover\")&&\"pause\"==e.settings.mouse_over||\"pause\"!=e.settings.mouse_over){var i=(e.settings.delay-t)/e.settings.delay*100;e.$ele.data(\"notify-delay\",t),e.$ele.find('[data-notify=\"progressbar\"] > div').attr(\"aria-valuenow\",i).css(\"width\",i+\"%\")}t<=-e.settings.timer&&(clearInterval(s),e.close())},e.settings.timer)}},close:function(){var e=this,s=parseInt(this.$ele.css(this.settings.placement.from)),i=!1;this.$ele.data(\"closing\",\"true\").addClass(this.settings.animate.exit),e.reposition(s),t.isFunction(e.settings.onClose)&&e.settings.onClose.call(this.$ele),this.$ele.one(this.animations.start,function(){i=!0}).one(this.animations.end,function(){t(this).remove(),t.isFunction(e.settings.onClosed)&&e.settings.onClosed.call(this)}),setTimeout(function(){i||(e.$ele.remove(),e.settings.onClosed&&e.settings.onClosed(e.$ele))},600)},reposition:function(e){var s=this,i='[data-notify-position=\"'+this.settings.placement.from+\"-\"+this.settings.placement.align+'\"]:not([data-closing=\"true\"])',n=this.$ele.nextAll(i);1==this.settings.newest_on_top&&(n=this.$ele.prevAll(i)),n.each(function(){t(this).css(s.settings.placement.from,e),e=parseInt(e)+parseInt(s.settings.spacing)+t(this).outerHeight()})}}),t.notify=function(t,s){var i=new e(this,t,s);return i.notify},t.notifyDefaults=function(e){return s=t.extend(!0,{},s,e)},t.notifyClose=function(e){\"undefined\"==typeof e||\"all\"==e?t(\"[data-notify]\").find('[data-notify=\"dismiss\"]').trigger(\"click\"):t('[data-notify-position=\"'+e+'\"]').find('[data-notify=\"dismiss\"]').trigger(\"click\")}});";
      }
      public String getName() {
        return "notifyJS";
      }
    }
    ;
  }
  private static class notifyJSInitializer {
    static {
      _instance0.notifyJSInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return notifyJS;
    }
  }
  public org.gwtproject.resources.client.TextResource notifyJS() {
    return notifyJSInitializer.get();
  }
  private void notify_cssInitializer() {
    notify_css = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/notify/client/resource/css/bootstrap-notify-custom.min.cache.css
      public String getText() {
        return "/* Bootstrap Notify Custom CSS | Website: http://bootstrap-notify.remabledesigns.com/ */\n[data-notify=\"progressbar\"]{margin-bottom:0;position:absolute;bottom:0;left:0;width:100%;height:5px;}";
      }
      public String getName() {
        return "notify_css";
      }
    }
    ;
  }
  private static class notify_cssInitializer {
    static {
      _instance0.notify_cssInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return notify_css;
    }
  }
  public org.gwtproject.resources.client.TextResource notify_css() {
    return notify_cssInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static org.gwtproject.resources.client.TextResource notifyJS;
  private static org.gwtproject.resources.client.TextResource notify_css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      notifyJS(), 
      notify_css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
        resourceMap.put("notifyJS", notifyJS());
        resourceMap.put("notify_css", notify_css());
      }
      return resourceMap.get(name);
  }
}
