package org.gwtbootstrap3.extras.select.client;

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

public class SelectClientBundleImpl implements SelectClientBundle {
  private static SelectClientBundleImpl _instance0 = new SelectClientBundleImpl();
  private void selectInitializer() {
    select = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/bootstrap-select-1.12.4.min.cache.js
      public String getText() {
        StringBuilder builder = new StringBuilder();
        builder.append("/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){\"use strict\";function b(b){var c=[{re:/[\\xC0-\\xC6]/g,ch:\"A\"},{re:/[\\xE0-\\xE6]/g,ch:\"a\"},{re:/[\\xC8-\\xCB]/g,ch:\"E\"},{re:/[\\xE8-\\xEB]/g,ch:\"e\"},{re:/[\\xCC-\\xCF]/g,ch:\"I\"},{re:/[\\xEC-\\xEF]/g,ch:\"i\"},{re:/[\\xD2-\\xD6]/g,ch:\"O\"},{re:/[\\xF2-\\xF6]/g,ch:\"o\"},{re:/[\\xD9-\\xDC]/g,ch:\"U\"},{re:/[\\xF9-\\xFC]/g,ch:\"u\"},{re:/[\\xC7-\\xE7]/g,ch:\"c\"},{re:/[\\xD1]/g,ch:\"N\"},{re:/[\\xF1]/g,ch:\"n\"}];return a.each(c,function(){b=b?b.replace(this.re,this.ch):\"\"}),b}function c(b){var c=arguments,d=b;[].shift.apply(c);var e,f=this.each(function(){var b=a(this);if(b.is(\"select\")){var f=b.data(\"selectpicker\"),g=\"object\"==typeof d&&d;if(f){if(g)for(var h in g)g.hasOwnProperty(h)&&(f.options[h]=g[h])}else{var i=a.extend({},l.DEFAULTS,a.fn.selectpicker.defaults||{},b.data(),g);i.template=a.extend({},l.DEFAULTS.template,a.fn.selectpicker.defaults?a.fn.selectpicker.defaults.template:{},b.data().template,g.template),b.data(\"selectpicker\",f=new l(this,i))}\"string\"==typeof d&&(e=f[d]instanceof Function?f[d].apply(f,c):f.options[d])}});return\"undefined\"!=typeof e?e:f}String.prototype.includes||!function(){var a={}.toString,b=function(){try{var a={},b=Object.defineProperty,c=b(a,a,a)&&b}catch(a){}return c}(),c=\"\".indexOf,d=function(b){if(null==this)throw new TypeError;var d=String(this);if(b&&\"[object RegExp]\"==a.call(b))throw new TypeError;var e=d.length,f=String(b),g=f.length,h=arguments.length>1?arguments[1]:void 0,i=h?Number(h):0;i!=i&&(i=0);var j=Math.min(Math.max(i,0),e);return!(g+j>e)&&c.call(d,f,i)!=-1};b?b(String.prototype,\"includes\",{value:d,configurable:!0,writable:!0}):String.prototype.includes=d}(),String.prototype.startsWith||!function(){var a=function(){try{var a={},b=Object.defineProperty,c=b(a,a,a)&&b}catch(a){}return c}(),b={}.toString,c=function(a){if(null==this)throw new TypeError;var c=String(this);if(a&&\"[object RegExp]\"==b.call(a))throw new TypeError;var d=c.length,e=String(a),f=e.length,g=arguments.length>1?arguments[1]:void 0,h=g?Number(g):0;h!=h&&(h=0);var i=Math.min(Math.max(h,0),d);if(f+i>d)return!1;for(var j=-1;++j<f;)if(c.charCodeAt(i+j)!=e.charCodeAt(j))return!1;return!0};a?a(String.prototype,\"startsWith\",{value:c,configurable:!0,writable:!0}):String.prototype.startsWith=c}(),Object.keys||(Object.keys=function(a,b,c){c=[];for(b in a)c.hasOwnProperty.call(a,b)&&c.push(b);return c});var d={useDefault:!1,_set:a.valHooks.select.set};a.valHooks.select.set=function(b,c){return c&&!d.useDefault&&a(b).data(\"selected\",!0),d._set.apply(this,arguments)};var e=null,f=function(){try{return new Event(\"change\"),!0}catch(a){return!1}}();a.fn.triggerNative=function(a){var b,c=this[0];c.dispatchEvent?(f?b=new Event(a,{bubbles:!0}):(b=document.createEvent(\"Event\"),b.initEvent(a,!0,!1)),c.dispatchEvent(b)):c.fireEvent?(b=document.createEventObject(),b.eventType=a,c.fireEvent(\"on\"+a,b)):this.trigger(a)},a.expr.pseudos.icontains=function(b,c,d){var e=a(b).find(\"a\"),f=(e.data(\"tokens\")||e.text()).toString().toUpperCase();return f.includes(d[3].toUpperCase())},a.expr.pseudos.ibegins=function(b,c,d){var e=a(b).find(\"a\"),f=(e.data(\"tokens\")||e.text()).toString().toUpperCase();return f.startsWith(d[3].toUpperCase())},a.expr.pseudos.aicontains=function(b,c,d){var e=a(b).find(\"a\"),f=(e.data(\"tokens\")||e.data(\"normalizedText\")||e.text()).toString().toUpperCase();return f.includes(d[3].toUpperCase())},a.expr.pseudos.aibegins=function(b,c,d){var e=a(b).find(\"a\"),f=(e.data(\"tokens\")||e.data(\"normalizedText\")||e.text()).toString().toUpperCase();return f.startsWith(d[3].toUpperCase())};var g={\"&\":\"&amp;\",\"<\":\"&lt;\",\">\":\"&gt;\",'\"':\"&quot;\",\"'\":\"&#x27;\",\"`\":\"&#x60;\"},h={\"&amp;\":\"&\",\"&lt;\":\"<\",\"&gt;\":\">\",\"&quot;\":'\"',\"&#x27;\":\"'\",\"&#x60;\":\"`\"},i=function(a){var b=function(b){return a[b]},c=\"(?:\"+Object.keys(a).join(\"|\")+\")\",d=RegExp(c),e=RegExp(c,\"g\");return function(a){return a=null==a?\"\":\"\"+a,d.test(a)?a.replace(e,b):a}},j=i(g),k=i(h),l=function(b,c){d.useDefault||(a.valHooks.select.set=d._set,d.useDefault=!0),this.$element=a(b),this.$newElement=null,this.$button=null,this.$menu=null,this.$lis=null,this.options=c,null===this.options.title&&(this.options.title=this.$element.attr(\"title\"));var e=this.options.windowPadding;\"number\"==typeof e&&(this.options.windowPadding=[e,e,e,e]),this.val=l.prototype.val,this.render=l.prototype.render,this.refresh=l.prototype.refresh,this.setStyle=l.prototype.setStyle,this.selectAll=l.prototype.selectAll,this.deselectAll=l.prototype.deselectAll,this.destroy=l.prototype.destroy,this.remove=l.prototype.remove,this.show=l.prototype.show,this.hide=l.prototype.hide,this.init()};l.VERSION=\"1.12.4\",l.DEFAULTS={noneSelectedText:\"Nothing selected\",noneResultsText:\"No results matched {0}\",countSelectedText:function(a,b){return 1==a?\"{0} item selected\":\"{0} items selected\"},maxOptionsText:function(a,b){return[1==a?\"Limit reached ({n} item max)\":\"Limit reached ({n} items max)\",1==b?\"Group limit reached ({n} item max)\":\"Group limit reached ({n} items max)\"]},selectAllText:\"Select All\",deselectAllText:\"Deselect All\",doneButton:!1,doneButtonText:\"Close\",multipleSeparator:\", \",styleBase:\"btn\",style:\"btn-default\",size:\"auto\",title:null,selectedTextFormat:\"values\",width:!1,container:!1,hideDisabled:!1,showSubtext:!1,showIcon:!0,showContent:!0,dropupAuto:!0,header:!1,liveSearch:!1,liveSearchPlaceholder:null,liveSearchNormalize:!1,liveSearchStyle:\"contains\",actionsBox:!1,iconBase:\"glyphicon\",tickIcon:\"glyphicon-ok\",showTick:!1,template:{caret:'<span class=\"caret\"></span>'},maxOptions:!1,mobile:!1,selectOnTab:!1,dropdownAlignRight:!1,windowPadding:0},l.prototype={constructor:l,init:function(){var b=this,c=this.$element.attr(\"id\");this.$element.addClass(\"bs-select-hidden\"),this.liObj={},this.multiple=this.$element.prop(\"multiple\"),this.autofocus=this.$element.prop(\"autofocus\"),this.$newElement=this.createView(),this.$element.after(this.$newElement).appendTo(this.$newElement),this.$button=this.$newElement.children(\"button\"),this.$menu=this.$newElement.children(\".dropdown-menu\"),this.$menuInner=this.$menu.children(\".inner\"),this.$searchbox=this.$menu.find(\"input\"),this.$element.removeClass(\"bs-select-hidden\"),this.options.dropdownAlignRight===!0&&this.$menu.addClass(\"dropdown-menu-right\"),\"undefined\"!=typeof c&&(this.$button.attr(\"data-id\",c),a('label[for=\"'+c+'\"]').click(function(a){a.preventDefault(),b.$button.focus()})),this.checkDisabled(),this.clickListener(),this.options.liveSearch&&this.liveSearchListener(),this.render(),this.setStyle(),this.setWidth(),this.options.container&&this.selectPosition(),this.$menu.data(\"this\",this),this.$newElement.data(\"this\",this),this.options.mobile&&this.mobile(),this.$newElement.on({\"hide.bs.dropdown\":function(a){b.$menuInner.attr(\"aria-expanded\",!1),b.$element.trigger(\"hide.bs.select\",a)},\"hidden.bs.dropdown\":function(a){b.$element.trigger(\"hidden.bs.select\",a)},\"show.bs.dropdown\":function(a){b.$menuInner.attr(\"aria-expanded\",!0),b.$element.trigger(\"show.bs.select\",a)},\"shown.bs.dropdown\":function(a){b.$element.trigger(\"shown.bs.select\",a)}}),b.$element[0].hasAttribute(\"required\")&&this.$element.on(\"invalid\",function(){b.$button.addClass(\"bs-invalid\"),b.$element.on({\"focus.bs.select\":function(){b.$button.focus(),b.$element.off(\"focus.bs.select\")},\"shown.bs.select\":function(){b.$element.val(b.$element.val()).off(\"shown.bs.select\")},\"rendered.bs.select\":function(){this.validity.valid&&b.$button.removeClass(\"bs-invalid\"),b.$element.off(\"rendered.bs.select\")}}),b.$button.on(\"blur.bs.select\",function(){b.$element.focus().blur(),b.$button.off(\"blur.bs.select\")})}),setTimeout(function(){b.$element.trigger(\"loaded.bs.select\")})},createDropdown:function(){var b=this.multiple||this.options.showTick?\" show-tick\":\"\",c=this.$element.parent().hasClass(\"input-group\")?\" input-group-btn\":\"\",d=this.autofocus?\" autofocus\":\"\",e=this.options.header?'<div class=\"popover-title\"><button type=\"button\" class=\"close\" aria-hidden=\"true\">&times;</button>'+this.options.header+\"</div>\":\"\",f=this.options.liveSearch?'<div class=\"bs-searchbox\"><input type=\"text\" class=\"form-control\" autocomplete=\"off\"'+(null===this.options.liveSearchPlaceholder?\"\":' placeholder=\"'+j(this.options.liveSearchPlaceholder)+'\"')+' role=\"textbox\" aria-label=\"Search\"></div>':\"\",g=this.multiple&&this.options.actionsBox?'<div class=\"bs-actionsbox\"><div class=\"btn-group btn-group-sm btn-block\"><button type=\"button\" class=\"actions-btn bs-select-all btn btn-default\">'+this.options.selectAllText+'</button><button type=\"button\" class=\"actions-btn bs-deselect-all btn btn-default\">'+this.options.deselectAllText+\"</button></div></div>\":\"\",h=this.multiple&&this.options.doneButton?'<div class=\"bs-donebutton\"><div class=\"btn-group btn-block\"><button type=\"button\" class=\"btn btn-sm btn-default\">'+this.options.doneButtonText+\"</button></div></div>\":\"\",i='<div class=\"btn-group bootstrap-select'+b+c+'\"><button type=\"button\" class=\"'+this.options.styleBase+' dropdown-toggle\" data-toggle=\"dropdown\"'+d+' role=\"button\"><span class=\"filter-option pull-left\"></span>&nbsp;<span class=\"bs-caret\">'+this.options.template.caret+'</span></button><div class=\"dropdown-menu open\" role=\"combobox\">'+e+f+g+'<ul class=\"dropdown-menu inner\" role=\"listbox\" aria-expanded=\"false\"></ul>'+h+\"</div></div>\";return a(i)},createView:function(){var a=this.createDropdown(),b=this.createLi();return a.find(\"ul\")[0].innerHTML=b,a},reloadLi:function(){var a=this.createLi();this.$menuInner[0].innerHTML=a},createLi:function(){var c=this,d=[],e=0,f=document.createElement(\"option\"),g=-1,h=function(a,b,c,d){return\"<li\"+(\"undefined\"!=typeof c&&\"\"!==c?' class=\"'+c+'\"':\"\")+(\"undefined\"!=typeof b&&null!==b?' data-original-index=\"'+b+'\"':\"\")+(\"undefined\"!=typeof d&&null!==d?'data-optgroup=\"'+d+'\"':\"\")+\">\"+a+\"</li>\"},i=function(d,e,f,g){return'<a tabindex=\"0\"'+(\"undefined\"!=typeof e?' class=\"'+e+'\"':\"\")+(f?' style=\"'+f+'\"':\"\")+(c.options.liveSearchNormalize?' data-normalized-text=\"'+b(j(a(d).html()))+'\"':\"\")+(\"undefined\"!=typeof g||null!==g?' data-tokens=\"'+g+'\"':\"\")+' role=\"option\">'+d+'<span class=\"'+c.options.iconBase+\" \"+c.options.tickIcon+' check-mark\"></span></a>'};if(this.options.title&&!this.multiple&&(g--,!this.$element.find(\".bs-title-option\").length)){var k=this.$element[0];f.className=\"bs-title-option\",f.innerHTML=this.options.title,f.value=\"\",k.insertBefore(f,k.firstChild);var l=a(k.options[k.selectedIndex]);void 0===l.attr(\"selected\")&&void 0===this.$element.data(\"selected\")&&(f.selected=!0)}var m=this.$element.find(\"option\");return m.each(function(b){var f=a(this);if(g++,!f.hasClass(\"bs-title-option\")){var k,l=this.className||\"\",n=j(this.style.cssText),o=f.data(\"content\")?f.data(\"content\"):f.html(),p=f.data(\"tokens\")?f.data(\"tokens\"):null,q=\"undefined\"!=typeof f.data(\"subtext\")?'<small class=\"text-muted\">'+f.data(\"subtext\")+\"</small>\":\"\",r=\"undefined\"!=typeof f.data(\"icon\")?'<span class=\"'+c.options.iconBase+\" \"+f.data(\"icon\")+'\"></span> ':\"\",s=f.parent(),t=\"OPTGROUP\"===s[0].tagName,u=t&&s[0].disabled,v=this.disabled||u;if(\"\"!==r&&v&&(r=\"<span>\"+r+\"</span>\"),c.options.hideDisabled&&(v&&!t||u))return k=f.data(\"prevHiddenIndex\"),f.next().data(\"prevHiddenIndex\",void 0!==k?k:b),void g--;if(f.data(\"content\")||(o=r+'<span class=\"text\">'+o+q+\"</span>\"),t&&f.data(\"divider\")!==!0){if(c.options.hideDisabled&&v){if(void 0===s.data(\"allOptionsDisabled\")){var w=s.children();s.data(\"allOptionsDisabled\",w.filter(\":disabled\").length===w.length)}if(s.data(\"allOptionsDisabled\"))return void g--}var x=\" \"+s[0].className||\"\";if(0===f.index()){e+=1;var y=s[0].label,z=\"undefined\"!=typeof s.data(\"subtext\")?'<small class=\"text-muted\">'+s.data(\"subtext\")+\"</small>\":\"\",A=s.data(\"icon\")?'<span class=\"'+c.options.iconBase+\" \"+s.data(\"icon\")+'\"></span> ':\"\";y=A+'<span class=\"text\">'+j(y)+z+\"</span>\",0!==b&&d.length>0&&(g++,d.push(h(\"\",null,\"divider\",e+\"div\"))),g++,d.push(h(y,null,\"dropdown-header\"+x,e))}if(c.options.hideDisabled&&v)return void g--;d.push(h(i(o,\"opt \"+l+x,n,p),b,\"\",e))}else if(f.data(\"divider\")===!0)d.push(h(\"\",b,\"divider\"));else if(f.data(\"hidden\")===!0)k=f.data(\"prevHiddenIndex\"),f.next().data(\"prevHiddenIndex\",void 0!==k?k:b),d.push(h(i(o,l,n,p),b,\"hidden is-hidden\"));else{var B=this.previousElementSibling&&\"OPTGROUP\"===this.previousElementSibling.tagName;if(!B&&c.options.hideDisabled&&(k=f.data(\"prevHiddenIndex\"),void 0!==k)){var C=m.eq(k)[0].previousElementSibling;C&&\"OPTGROUP\"===C.tagName&&!C.disabled&&(B=!0)}B&&(g++,d.push(h(\"\",null,\"divider\",e+\"div\"))),d.push(h(i(o,l,n,p),b))}c.liObj[b]=g}}),this.multiple||0!==this.$element.find(\"option:selected\").length||this.options.title||this.$element.find(\"option\").eq(0).prop(\"selected\",!0).attr(\"selected\",\"selected\"),d.join(\"\")},findLis:function(){return null==this.$lis&&(this.$lis=this.$menu.find(\"li\")),this.$lis},render:function(b){var c,d=this,e=this.$element.find(\"option\");b!==!1&&e.each(function(a){var b=d.findLis().eq(d.liObj[a]);d.setDisabled(a,this.disabled||\"OPTGROUP\"===this.parentNode.tagName&&this.parentNode.disabled,b),d.setSelected(a,this.selected,b)}),this.togglePlaceholder(),this.tabIndex();var f=e.map(function(){if(this.selected){if(d.options.hideDisabled&&(this.disabled||\"OPTGROUP\"===this.parentNode.tagName&&this.parentNode.disabled))return;var b,c=a(this),e=c.data(\"icon\")&&d.options.showIcon?'<i class=\"'+d.options.iconBase+\" \"+c.data(\"icon\")+'\"></i> ':\"\";return b=d.options.showSubtext&&c.data(\"subtext\")&&!d.multiple?' <small class=\"text-muted\">'+c.data(\"subtext\")+\"</small>\":\"\",\"undefined\"!=typeof c.attr(\"title\")?c.attr(\"title\"):c.data(\"content\")&&d.options.showContent?c.data(\"content\").toString():e+c.html()+b}}).toArray(),g=this.multiple?f.join(this.options.multipleSeparator):f[0];if(this.multiple&&this.options.selectedTextFormat.indexOf(\"count\")>-1){var h=this.options.selectedTextFormat.split(\">\");if(h.length>1&&f.length>h[1]||1==h.length&&f.length>=2){c=this.options.hideDisabled?\", [disabled]\":\"\";var i=e.not('[data-divider=\"true\"], [data-hidden=\"true\"]'+c).length,j=\"function\"==typeof this.options.countSelectedText?this.options.countSelectedText(f.length,i):this.options.countSelectedText;g=j.replace(\"{0}\",f.length.toString()).replace(\"{1}\",i.toString())}}void 0==this.options.title&&(this.options.title=this.$element.attr(\"title\")),\"static\"==this.options.selectedTextFormat&&(g=this.options.title),g||(g=\"undefined\"!=typeof this.options.title?this.options.title:this.options.noneSelectedText),this.$button.attr(\"title\",k(a.trim(g.replace(/<[^>]*>?/g,\"\")))),this.$button.children(\".filter-option\").html(g),this.$element.trigger(\"rendered.bs.select\")},setStyle:function(a,b){this.$element.attr(\"class\")&&this.$newElement.addClass(this.$element.attr(\"class\").replace(/selectpicker|mobile-device|bs-select-hidden|validate\\[.*\\]/gi,\"\"));var c=a?a:this.options.style;\"add\"==b?this.$button.addClass(c):\"remove\"==b?this.$button.removeClass(c):(this.$button.removeClass(this.options.style),this.$button.addClass(c))},liHeight:function(b){if(b||this.options.size!==!1&&!this.sizeInfo){var c=document.createElement(\"div\"),d=document.createElement(\"div\"),e=document.createElement(\"ul\"),f=document.createElement(\"li\"),g=document.createElement(\"li\"),h=document.createElement(\"a\"),i=document.createElement(\"span\"),j=this.options.header&&this.$menu.find(\".popover-title\").length>0?this.$menu.find(\".popover-title\")[0].cloneNode(!0):null,k=this.options.liveSearch?document.createElement(\"div\"):null,l=this.options.actionsBox&&this.multiple&&this.$menu.find(\".bs-actionsbox\").length>0?this.$menu.find(\".bs-actionsbox\")[0].cloneNode(!0):null,m=this.options.doneButton&&this.multiple&&this.$menu.find(\".bs-donebutton\").length>0?this.$menu.find(\".bs-donebutton\")[0].cloneNode(!0):null;if(i.className=\"text\",c.className=this.$menu[0].parentNode.className+\" open\",d.className=\"dropdown-menu open\",e.className=\"dropdown-menu inner\",f.className=\"divider\",i.appendChild(document.createTextNode(\"Inner text\")),h.appendChild(i),g.appendChild(h),e.appendChild(g),e.appendChild(f),j&&d.appendChild(j),k){var n=document.createElement(\"input\");k.className=\"bs");
        builder.append("-searchbox\",n.className=\"form-control\",k.appendChild(n),d.appendChild(k)}l&&d.appendChild(l),d.appendChild(e),m&&d.appendChild(m),c.appendChild(d),document.body.appendChild(c);var o=h.offsetHeight,p=j?j.offsetHeight:0,q=k?k.offsetHeight:0,r=l?l.offsetHeight:0,s=m?m.offsetHeight:0,t=a(f).outerHeight(!0),u=\"function\"==typeof getComputedStyle&&getComputedStyle(d),v=u?null:a(d),w={vert:parseInt(u?u.paddingTop:v.css(\"paddingTop\"))+parseInt(u?u.paddingBottom:v.css(\"paddingBottom\"))+parseInt(u?u.borderTopWidth:v.css(\"borderTopWidth\"))+parseInt(u?u.borderBottomWidth:v.css(\"borderBottomWidth\")),horiz:parseInt(u?u.paddingLeft:v.css(\"paddingLeft\"))+parseInt(u?u.paddingRight:v.css(\"paddingRight\"))+parseInt(u?u.borderLeftWidth:v.css(\"borderLeftWidth\"))+parseInt(u?u.borderRightWidth:v.css(\"borderRightWidth\"))},x={vert:w.vert+parseInt(u?u.marginTop:v.css(\"marginTop\"))+parseInt(u?u.marginBottom:v.css(\"marginBottom\"))+2,horiz:w.horiz+parseInt(u?u.marginLeft:v.css(\"marginLeft\"))+parseInt(u?u.marginRight:v.css(\"marginRight\"))+2};document.body.removeChild(c),this.sizeInfo={liHeight:o,headerHeight:p,searchHeight:q,actionsHeight:r,doneButtonHeight:s,dividerHeight:t,menuPadding:w,menuExtras:x}}},setSize:function(){if(this.findLis(),this.liHeight(),this.options.header&&this.$menu.css(\"padding-top\",0),this.options.size!==!1){var b,c,d,e,f,g,h,i,j=this,k=this.$menu,l=this.$menuInner,m=a(window),n=this.$newElement[0].offsetHeight,o=this.$newElement[0].offsetWidth,p=this.sizeInfo.liHeight,q=this.sizeInfo.headerHeight,r=this.sizeInfo.searchHeight,s=this.sizeInfo.actionsHeight,t=this.sizeInfo.doneButtonHeight,u=this.sizeInfo.dividerHeight,v=this.sizeInfo.menuPadding,w=this.sizeInfo.menuExtras,x=this.options.hideDisabled?\".disabled\":\"\",y=function(){var b,c=j.$newElement.offset(),d=a(j.options.container);j.options.container&&!d.is(\"body\")?(b=d.offset(),b.top+=parseInt(d.css(\"borderTopWidth\")),b.left+=parseInt(d.css(\"borderLeftWidth\"))):b={top:0,left:0};var e=j.options.windowPadding;f=c.top-b.top-m.scrollTop(),g=m.height()-f-n-b.top-e[2],h=c.left-b.left-m.scrollLeft(),i=m.width()-h-o-b.left-e[1],f-=e[0],h-=e[3]};if(y(),\"auto\"===this.options.size){var z=function(){var m,n=function(b,c){return function(d){return c?d.classList?d.classList.contains(b):a(d).hasClass(b):!(d.classList?d.classList.contains(b):a(d).hasClass(b))}},u=j.$menuInner[0].getElementsByTagName(\"li\"),x=Array.prototype.filter?Array.prototype.filter.call(u,n(\"hidden\",!1)):j.$lis.not(\".hidden\"),z=Array.prototype.filter?Array.prototype.filter.call(x,n(\"dropdown-header\",!0)):x.filter(\".dropdown-header\");y(),b=g-w.vert,c=i-w.horiz,j.options.container?(k.data(\"height\")||k.data(\"height\",k.height()),d=k.data(\"height\"),k.data(\"width\")||k.data(\"width\",k.width()),e=k.data(\"width\")):(d=k.height(),e=k.width()),j.options.dropupAuto&&j.$newElement.toggleClass(\"dropup\",f>g&&b-w.vert<d),j.$newElement.hasClass(\"dropup\")&&(b=f-w.vert),\"auto\"===j.options.dropdownAlignRight&&k.toggleClass(\"dropdown-menu-right\",h>i&&c-w.horiz<e-o),m=x.length+z.length>3?3*p+w.vert-2:0,k.css({\"max-height\":b+\"px\",overflow:\"hidden\",\"min-height\":m+q+r+s+t+\"px\"}),l.css({\"max-height\":b-q-r-s-t-v.vert+\"px\",\"overflow-y\":\"auto\",\"min-height\":Math.max(m-v.vert,0)+\"px\"})};z(),this.$searchbox.off(\"input.getSize propertychange.getSize\").on(\"input.getSize propertychange.getSize\",z),m.off(\"resize.getSize scroll.getSize\").on(\"resize.getSize scroll.getSize\",z)}else if(this.options.size&&\"auto\"!=this.options.size&&this.$lis.not(x).length>this.options.size){var A=this.$lis.not(\".divider\").not(x).children().slice(0,this.options.size).last().parent().index(),B=this.$lis.slice(0,A+1).filter(\".divider\").length;b=p*this.options.size+B*u+v.vert,j.options.container?(k.data(\"height\")||k.data(\"height\",k.height()),d=k.data(\"height\")):d=k.height(),j.options.dropupAuto&&this.$newElement.toggleClass(\"dropup\",f>g&&b-w.vert<d),k.css({\"max-height\":b+q+r+s+t+\"px\",overflow:\"hidden\",\"min-height\":\"\"}),l.css({\"max-height\":b-v.vert+\"px\",\"overflow-y\":\"auto\",\"min-height\":\"\"})}}},setWidth:function(){if(\"auto\"===this.options.width){this.$menu.css(\"min-width\",\"0\");var a=this.$menu.parent().clone().appendTo(\"body\"),b=this.options.container?this.$newElement.clone().appendTo(\"body\"):a,c=a.children(\".dropdown-menu\").outerWidth(),d=b.css(\"width\",\"auto\").children(\"button\").outerWidth();a.remove(),b.remove(),this.$newElement.css(\"width\",Math.max(c,d)+\"px\")}else\"fit\"===this.options.width?(this.$menu.css(\"min-width\",\"\"),this.$newElement.css(\"width\",\"\").addClass(\"fit-width\")):this.options.width?(this.$menu.css(\"min-width\",\"\"),this.$newElement.css(\"width\",this.options.width)):(this.$menu.css(\"min-width\",\"\"),this.$newElement.css(\"width\",\"\"));this.$newElement.hasClass(\"fit-width\")&&\"fit\"!==this.options.width&&this.$newElement.removeClass(\"fit-width\")},selectPosition:function(){this.$bsContainer=a('<div class=\"bs-container\" />');var b,c,d,e=this,f=a(this.options.container),g=function(a){e.$bsContainer.addClass(a.attr(\"class\").replace(/form-control|fit-width/gi,\"\")).toggleClass(\"dropup\",a.hasClass(\"dropup\")),b=a.offset(),f.is(\"body\")?c={top:0,left:0}:(c=f.offset(),c.top+=parseInt(f.css(\"borderTopWidth\"))-f.scrollTop(),c.left+=parseInt(f.css(\"borderLeftWidth\"))-f.scrollLeft()),d=a.hasClass(\"dropup\")?0:a[0].offsetHeight,e.$bsContainer.css({top:b.top-c.top+d,left:b.left-c.left,width:a[0].offsetWidth})};this.$button.on(\"click\",function(){var b=a(this);e.isDisabled()||(g(e.$newElement),e.$bsContainer.appendTo(e.options.container).toggleClass(\"open\",!b.hasClass(\"open\")).append(e.$menu))}),a(window).on(\"resize scroll\",function(){g(e.$newElement)}),this.$element.on(\"hide.bs.select\",function(){e.$menu.data(\"height\",e.$menu.height()),e.$bsContainer.detach()})},setSelected:function(a,b,c){c||(this.togglePlaceholder(),c=this.findLis().eq(this.liObj[a])),c.toggleClass(\"selected\",b).find(\"a\").attr(\"aria-selected\",b)},setDisabled:function(a,b,c){c||(c=this.findLis().eq(this.liObj[a])),b?c.addClass(\"disabled\").children(\"a\").attr(\"href\",\"#\").attr(\"tabindex\",-1).attr(\"aria-disabled\",!0):c.removeClass(\"disabled\").children(\"a\").removeAttr(\"href\").attr(\"tabindex\",0).attr(\"aria-disabled\",!1)},isDisabled:function(){return this.$element[0].disabled},checkDisabled:function(){var a=this;this.isDisabled()?(this.$newElement.addClass(\"disabled\"),this.$button.addClass(\"disabled\").attr(\"tabindex\",-1).attr(\"aria-disabled\",!0)):(this.$button.hasClass(\"disabled\")&&(this.$newElement.removeClass(\"disabled\"),this.$button.removeClass(\"disabled\").attr(\"aria-disabled\",!1)),this.$button.attr(\"tabindex\")!=-1||this.$element.data(\"tabindex\")||this.$button.removeAttr(\"tabindex\")),this.$button.click(function(){return!a.isDisabled()})},togglePlaceholder:function(){var a=this.$element.val();this.$button.toggleClass(\"bs-placeholder\",null===a||\"\"===a||a.constructor===Array&&0===a.length)},tabIndex:function(){this.$element.data(\"tabindex\")!==this.$element.attr(\"tabindex\")&&this.$element.attr(\"tabindex\")!==-98&&\"-98\"!==this.$element.attr(\"tabindex\")&&(this.$element.data(\"tabindex\",this.$element.attr(\"tabindex\")),this.$button.attr(\"tabindex\",this.$element.data(\"tabindex\"))),this.$element.attr(\"tabindex\",-98)},clickListener:function(){var b=this,c=a(document);c.data(\"spaceSelect\",!1),this.$button.on(\"keyup\",function(a){/(32)/.test(a.keyCode.toString(10))&&c.data(\"spaceSelect\")&&(a.preventDefault(),c.data(\"spaceSelect\",!1))}),this.$button.on(\"click\",function(){b.setSize()}),this.$element.on(\"shown.bs.select\",function(){if(b.options.liveSearch||b.multiple){if(!b.multiple){var a=b.liObj[b.$element[0].selectedIndex];if(\"number\"!=typeof a||b.options.size===!1)return;var c=b.$lis.eq(a)[0].offsetTop-b.$menuInner[0].offsetTop;c=c-b.$menuInner[0].offsetHeight/2+b.sizeInfo.liHeight/2,b.$menuInner[0].scrollTop=c}}else b.$menuInner.find(\".selected a\").focus()}),this.$menuInner.on(\"click\",\"li a\",function(c){var d=a(this),f=d.parent().data(\"originalIndex\"),g=b.$element.val(),h=b.$element.prop(\"selectedIndex\"),i=!0;if(b.multiple&&1!==b.options.maxOptions&&c.stopPropagation(),c.preventDefault(),!b.isDisabled()&&!d.parent().hasClass(\"disabled\")){var j=b.$element.find(\"option\"),k=j.eq(f),l=k.prop(\"selected\"),m=k.parent(\"optgroup\"),n=b.options.maxOptions,o=m.data(\"maxOptions\")||!1;if(b.multiple){if(k.prop(\"selected\",!l),b.setSelected(f,!l),d.blur(),n!==!1||o!==!1){var p=n<j.filter(\":selected\").length,q=o<m.find(\"option:selected\").length;if(n&&p||o&&q)if(n&&1==n)j.prop(\"selected\",!1),k.prop(\"selected\",!0),b.$menuInner.find(\".selected\").removeClass(\"selected\"),b.setSelected(f,!0);else if(o&&1==o){m.find(\"option:selected\").prop(\"selected\",!1),k.prop(\"selected\",!0);var r=d.parent().data(\"optgroup\");b.$menuInner.find('[data-optgroup=\"'+r+'\"]').removeClass(\"selected\"),b.setSelected(f,!0)}else{var s=\"string\"==typeof b.options.maxOptionsText?[b.options.maxOptionsText,b.options.maxOptionsText]:b.options.maxOptionsText,t=\"function\"==typeof s?s(n,o):s,u=t[0].replace(\"{n}\",n),v=t[1].replace(\"{n}\",o),w=a('<div class=\"notify\"></div>');t[2]&&(u=u.replace(\"{var}\",t[2][n>1?0:1]),v=v.replace(\"{var}\",t[2][o>1?0:1])),k.prop(\"selected\",!1),b.$menu.append(w),n&&p&&(w.append(a(\"<div>\"+u+\"</div>\")),i=!1,b.$element.trigger(\"maxReached.bs.select\")),o&&q&&(w.append(a(\"<div>\"+v+\"</div>\")),i=!1,b.$element.trigger(\"maxReachedGrp.bs.select\")),setTimeout(function(){b.setSelected(f,!1)},10),w.delay(750).fadeOut(300,function(){a(this).remove()})}}}else j.prop(\"selected\",!1),k.prop(\"selected\",!0),b.$menuInner.find(\".selected\").removeClass(\"selected\").find(\"a\").attr(\"aria-selected\",!1),b.setSelected(f,!0);!b.multiple||b.multiple&&1===b.options.maxOptions?b.$button.focus():b.options.liveSearch&&b.$searchbox.focus(),i&&(g!=b.$element.val()&&b.multiple||h!=b.$element.prop(\"selectedIndex\")&&!b.multiple)&&(e=[f,k.prop(\"selected\"),l],b.$element.triggerNative(\"change\"))}}),this.$menu.on(\"click\",\"li.disabled a, .popover-title, .popover-title :not(.close)\",function(c){c.currentTarget==this&&(c.preventDefault(),c.stopPropagation(),b.options.liveSearch&&!a(c.target).hasClass(\"close\")?b.$searchbox.focus():b.$button.focus())}),this.$menuInner.on(\"click\",\".divider, .dropdown-header\",function(a){a.preventDefault(),a.stopPropagation(),b.options.liveSearch?b.$searchbox.focus():b.$button.focus()}),this.$menu.on(\"click\",\".popover-title .close\",function(){b.$button.click()}),this.$searchbox.on(\"click\",function(a){a.stopPropagation()}),this.$menu.on(\"click\",\".actions-btn\",function(c){b.options.liveSearch?b.$searchbox.focus():b.$button.focus(),c.preventDefault(),c.stopPropagation(),a(this).hasClass(\"bs-select-all\")?b.selectAll():b.deselectAll()}),this.$element.change(function(){b.render(!1),b.$element.trigger(\"changed.bs.select\",e),e=null})},liveSearchListener:function(){var c=this,d=a('<li class=\"no-results\"></li>');this.$button.on(\"click.dropdown.data-api\",function(){c.$menuInner.find(\".active\").removeClass(\"active\"),c.$searchbox.val()&&(c.$searchbox.val(\"\"),c.$lis.not(\".is-hidden\").removeClass(\"hidden\"),d.parent().length&&d.remove()),c.multiple||c.$menuInner.find(\".selected\").addClass(\"active\"),setTimeout(function(){c.$searchbox.focus()},10)}),this.$searchbox.on(\"click.dropdown.data-api focus.dropdown.data-api touchend.dropdown.data-api\",function(a){a.stopPropagation()}),this.$searchbox.on(\"input propertychange\",function(){if(c.$lis.not(\".is-hidden\").removeClass(\"hidden\"),c.$lis.filter(\".active\").removeClass(\"active\"),d.remove(),c.$searchbox.val()){var e,f=c.$lis.not(\".is-hidden, .divider, .dropdown-header\");if(e=c.options.liveSearchNormalize?f.not(\":a\"+c._searchStyle()+'(\"'+b(c.$searchbox.val())+'\")'):f.not(\":\"+c._searchStyle()+'(\"'+c.$searchbox.val()+'\")'),e.length===f.length)d.html(c.options.noneResultsText.replace(\"{0}\",'\"'+j(c.$searchbox.val())+'\"')),c.$menuInner.append(d),c.$lis.addClass(\"hidden\");else{e.addClass(\"hidden\");var g,h=c.$lis.not(\".hidden\");h.each(function(b){var c=a(this);c.hasClass(\"divider\")?void 0===g?c.addClass(\"hidden\"):(g&&g.addClass(\"hidden\"),g=c):c.hasClass(\"dropdown-header\")&&h.eq(b+1).data(\"optgroup\")!==c.data(\"optgroup\")?c.addClass(\"hidden\"):g=null}),g&&g.addClass(\"hidden\"),f.not(\".hidden\").first().addClass(\"active\"),c.$menuInner.scrollTop(0)}}})},_searchStyle:function(){var a={begins:\"ibegins\",startsWith:\"ibegins\"};return a[this.options.liveSearchStyle]||\"icontains\"},val:function(a){return\"undefined\"!=typeof a?(this.$element.val(a),this.render(),this.$element):this.$element.val()},changeAll:function(b){if(this.multiple){\"undefined\"==typeof b&&(b=!0),this.findLis();var c=this.$element.find(\"option\"),d=this.$lis.not(\".divider, .dropdown-header, .disabled, .hidden\"),e=d.length,f=[];if(b){if(d.filter(\".selected\").length===d.length)return}else if(0===d.filter(\".selected\").length)return;d.toggleClass(\"selected\",b);for(var g=0;g<e;g++){var h=d[g].getAttribute(\"data-original-index\");f[f.length]=c.eq(h)[0]}a(f).prop(\"selected\",b),this.render(!1),this.togglePlaceholder(),this.$element.triggerNative(\"change\")}},selectAll:function(){return this.changeAll(!0)},deselectAll:function(){return this.changeAll(!1)},toggle:function(a){a=a||window.event,a&&a.stopPropagation(),this.$button.trigger(\"click\")},keydown:function(b){var c,d,e,f,g=a(this),h=g.is(\"input\")?g.parent().parent():g.parent(),i=h.data(\"this\"),j=\":not(.disabled, .hidden, .dropdown-header, .divider)\",k={32:\" \",48:\"0\",49:\"1\",50:\"2\",51:\"3\",52:\"4\",53:\"5\",54:\"6\",55:\"7\",56:\"8\",57:\"9\",59:\";\",65:\"a\",66:\"b\",67:\"c\",68:\"d\",69:\"e\",70:\"f\",71:\"g\",72:\"h\",73:\"i\",74:\"j\",75:\"k\",76:\"l\",77:\"m\",78:\"n\",79:\"o\",80:\"p\",81:\"q\",82:\"r\",83:\"s\",84:\"t\",85:\"u\",86:\"v\",87:\"w\",88:\"x\",89:\"y\",90:\"z\",96:\"0\",97:\"1\",98:\"2\",99:\"3\",100:\"4\",101:\"5\",102:\"6\",103:\"7\",104:\"8\",105:\"9\"};if(f=i.$newElement.hasClass(\"open\"),!f&&(b.keyCode>=48&&b.keyCode<=57||b.keyCode>=96&&b.keyCode<=105||b.keyCode>=65&&b.keyCode<=90))return i.options.container?i.$button.trigger(\"click\"):(i.setSize(),i.$menu.parent().addClass(\"open\"),f=!0),void i.$searchbox.focus();if(i.options.liveSearch&&/(^9$|27)/.test(b.keyCode.toString(10))&&f&&(b.preventDefault(),b.stopPropagation(),i.$menuInner.click(),i.$button.focus()),/(38|40)/.test(b.keyCode.toString(10))){if(c=i.$lis.filter(j),!c.length)return;d=i.options.liveSearch?c.index(c.filter(\".active\")):c.index(c.find(\"a\").filter(\":focus\").parent()),e=i.$menuInner.data(\"prevIndex\"),38==b.keyCode?(!i.options.liveSearch&&d!=e||d==-1||d--,d<0&&(d+=c.length)):40==b.keyCode&&((i.options.liveSearch||d==e)&&d++,d%=c.length),i.$menuInner.data(\"prevIndex\",d),i.options.liveSearch?(b.preventDefault(),g.hasClass(\"dropdown-toggle\")||(c.removeClass(\"active\").eq(d).addClass(\"active\").children(\"a\").focus(),g.focus())):c.eq(d).children(\"a\").focus()}else if(!g.is(\"input\")){var l,m,n=[];c=i.$lis.filter(j),c.each(function(c){a.trim(a(this).children(\"a\").text().toLowerCase()).substring(0,1)==k[b.keyCode]&&n.push(c)}),l=a(document).data(\"keycount\"),l++,a(document).data(\"keycount\",l),m=a.trim(a(\":focus\").text().toLowerCase()).substring(0,1),m!=k[b.keyCode]?(l=1,a(document).data(\"keycount\",l)):l>=n.length&&(a(document).data(\"keycount\",0),l>n.length&&(l=1)),c.eq(n[l-1]).children(\"a\").focus()}if((/(13|32)/.test(b.keyCode.toString(10))||/(^9$)/.test(b.keyCode.toString(10))&&i.options.selectOnTab)&&f){if(/(32)/.test(b.keyCode.toString(10))||b.preventDefault(),i.options.liveSearch)/(32)/.test(b.keyCode.toString(10))||(i.$menuInner.find(\".active a\").click(),g.focus());else{var o=a(\":focus\");o.click(),o.focus(),b.preventDefault(),a(document).data(\"spaceSelect\",!0)}a(document).data(\"keycount\",0)}(/(^9$|27)/.test(b.keyCode.toString(10))&&f&&(i.multiple||i.options.liveSearch)||/(27)/.test(b.keyCode.toString(10))&&!f)&&(i.$menu.parent().removeClass(\"open\"),i.options.container&&i.$newElement.removeClass(\"open\"),i.$button.focus())},mobile:function(){this.$element.addClass(\"mobile-device\")},refresh:function(){this.$lis=null,this.liObj={},this.reloadLi(),this.render(),this.checkDisabled(),this.liHeight(!0),this.setStyle(),\nthis.setWidth(),this.$lis&&this.$searchbox.trigger(\"propertychange\"),this.$element.trigger(\"refreshed.bs.select\")},hide:function(){this.$newElement.hide()},show:function(){this.$newElement.show()},remove:function(){this.$newElement.remove(),this.$element.remove()},destroy:function(){this.$newElement.before(this.$element).remove(),this.$bsContainer?this.$bsContainer.remove():this.$menu.remove(),this.$element.off(\".bs.select\").removeData(\"selectpicker\").removeClass(\"bs-select-hidden selectpicker\")}};var m=a.fn.selectpicker;a.fn.selectpi");
        builder.append("cker=c,a.fn.selectpicker.Constructor=l,a.fn.selectpicker.noConflict=function(){return a.fn.selectpicker=m,this},a(document).data(\"keycount\",0).on(\"keydown.bs.select\",'.bootstrap-select [data-toggle=dropdown], .bootstrap-select [role=\"listbox\"], .bs-searchbox input',l.prototype.keydown).on(\"focusin.modal\",'.bootstrap-select [data-toggle=dropdown], .bootstrap-select [role=\"listbox\"], .bs-searchbox input',function(a){a.stopPropagation()}),a(window).on(\"load.bs.select.data-api\",function(){a(\".selectpicker\").each(function(){var b=a(this);c.call(b,b.data())})})}(a)});\n//# sourceMappingURL=bootstrap-select.js.map");
        return builder.toString();
      }
      public String getName() {
        return "select";
      }
    }
    ;
  }
  private static class selectInitializer {
    static {
      _instance0.selectInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return select;
    }
  }
  public org.gwtproject.resources.client.TextResource select() {
    return selectInitializer.get();
  }
  private void select_cssInitializer() {
    select_css = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/css/bootstrap-select-1.12.4.min.cache.css
      public String getText() {
        return "/*!\r\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\r\n *\r\n * Copyright 2013-2017 bootstrap-select\r\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\r\n */select.bs-select-hidden,select.selectpicker{display:none!important}.bootstrap-select{width:220px\\9}.bootstrap-select>.dropdown-toggle{width:100%;padding-right:25px;z-index:1}.bootstrap-select>.dropdown-toggle.bs-placeholder,.bootstrap-select>.dropdown-toggle.bs-placeholder:active,.bootstrap-select>.dropdown-toggle.bs-placeholder:focus,.bootstrap-select>.dropdown-toggle.bs-placeholder:hover{color:#999}.bootstrap-select>select{position:absolute!important;bottom:0;left:50%;display:block!important;width:.5px!important;height:100%!important;padding:0!important;opacity:0!important;border:none}.bootstrap-select>select.mobile-device{top:0;left:0;display:block!important;width:100%!important;z-index:2}.error .bootstrap-select .dropdown-toggle,.has-error .bootstrap-select .dropdown-toggle{border-color:#b94a48}.bootstrap-select.fit-width{width:auto!important}.bootstrap-select:not([class*=col-]):not([class*=form-control]):not(.input-group-btn){width:220px}.bootstrap-select .dropdown-toggle:focus{outline:thin dotted #333!important;outline:5px auto -webkit-focus-ring-color!important;outline-offset:-2px}.bootstrap-select.form-control{margin-bottom:0;padding:0;border:none}.bootstrap-select.form-control:not([class*=col-]){width:100%}.bootstrap-select.form-control.input-group-btn{z-index:auto}.bootstrap-select.form-control.input-group-btn:not(:first-child):not(:last-child)>.btn{border-radius:0}.bootstrap-select.btn-group:not(.input-group-btn),.bootstrap-select.btn-group[class*=col-]{float:none;display:inline-block;margin-left:0}.bootstrap-select.btn-group.dropdown-menu-right,.bootstrap-select.btn-group[class*=col-].dropdown-menu-right,.row .bootstrap-select.btn-group[class*=col-].dropdown-menu-right{float:right}.form-group .bootstrap-select.btn-group,.form-horizontal .bootstrap-select.btn-group,.form-inline .bootstrap-select.btn-group{margin-bottom:0}.form-group-lg .bootstrap-select.btn-group.form-control,.form-group-sm .bootstrap-select.btn-group.form-control{padding:0}.form-group-lg .bootstrap-select.btn-group.form-control .dropdown-toggle,.form-group-sm .bootstrap-select.btn-group.form-control .dropdown-toggle{height:100%;font-size:inherit;line-height:inherit;border-radius:inherit}.form-inline .bootstrap-select.btn-group .form-control{width:100%}.bootstrap-select.btn-group.disabled,.bootstrap-select.btn-group>.disabled{cursor:not-allowed}.bootstrap-select.btn-group.disabled:focus,.bootstrap-select.btn-group>.disabled:focus{outline:0!important}.bootstrap-select.btn-group.bs-container{position:absolute;height:0!important;padding:0!important}.bootstrap-select.btn-group.bs-container .dropdown-menu{z-index:1060}.bootstrap-select.btn-group .dropdown-toggle .filter-option{display:inline-block;overflow:hidden;width:100%;text-align:left}.bootstrap-select.btn-group .dropdown-toggle .caret{position:absolute;top:50%;right:12px;margin-top:-2px;vertical-align:middle}.bootstrap-select.btn-group[class*=col-] .dropdown-toggle{width:100%}.bootstrap-select.btn-group .dropdown-menu{min-width:100%;-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box}.bootstrap-select.btn-group .dropdown-menu.inner{position:static;float:none;border:0;padding:0;margin:0;border-radius:0;-webkit-box-shadow:none;box-shadow:none}.bootstrap-select.btn-group .dropdown-menu li{position:relative}.bootstrap-select.btn-group .dropdown-menu li.active small{color:#fff}.bootstrap-select.btn-group .dropdown-menu li.disabled a{cursor:not-allowed}.bootstrap-select.btn-group .dropdown-menu li a{cursor:pointer;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.bootstrap-select.btn-group .dropdown-menu li a.opt{position:relative;padding-left:2.25em}.bootstrap-select.btn-group .dropdown-menu li a span.check-mark{display:none}.bootstrap-select.btn-group .dropdown-menu li a span.text{display:inline-block}.bootstrap-select.btn-group .dropdown-menu li small{padding-left:.5em}.bootstrap-select.btn-group .dropdown-menu .notify{position:absolute;bottom:5px;width:96%;margin:0 2%;min-height:26px;padding:3px 5px;background:#f5f5f5;border:1px solid #e3e3e3;-webkit-box-shadow:inset 0 1px 1px rgba(0,0,0,.05);box-shadow:inset 0 1px 1px rgba(0,0,0,.05);pointer-events:none;opacity:.9;-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box}.bootstrap-select.btn-group .no-results{padding:3px;background:#f5f5f5;margin:0 5px;white-space:nowrap}.bootstrap-select.btn-group.fit-width .dropdown-toggle .filter-option{position:static}.bootstrap-select.btn-group.fit-width .dropdown-toggle .caret{position:static;top:auto;margin-top:-1px}.bootstrap-select.btn-group.show-tick .dropdown-menu li.selected a span.check-mark{position:absolute;display:inline-block;right:15px;margin-top:5px}.bootstrap-select.btn-group.show-tick .dropdown-menu li a span.text{margin-right:34px}.bootstrap-select.show-menu-arrow.open>.dropdown-toggle{z-index:1061}.bootstrap-select.show-menu-arrow .dropdown-toggle:before{content:'';border-left:7px solid transparent;border-right:7px solid transparent;border-bottom:7px solid rgba(204,204,204,.2);position:absolute;bottom:-4px;left:9px;display:none}.bootstrap-select.show-menu-arrow .dropdown-toggle:after{content:'';border-left:6px solid transparent;border-right:6px solid transparent;border-bottom:6px solid #fff;position:absolute;bottom:-4px;left:10px;display:none}.bootstrap-select.show-menu-arrow.dropup .dropdown-toggle:before{bottom:auto;top:-3px;border-top:7px solid rgba(204,204,204,.2);border-bottom:0}.bootstrap-select.show-menu-arrow.dropup .dropdown-toggle:after{bottom:auto;top:-3px;border-top:6px solid #fff;border-bottom:0}.bootstrap-select.show-menu-arrow.pull-right .dropdown-toggle:before{right:12px;left:auto}.bootstrap-select.show-menu-arrow.pull-right .dropdown-toggle:after{right:13px;left:auto}.bootstrap-select.show-menu-arrow.open>.dropdown-toggle:after,.bootstrap-select.show-menu-arrow.open>.dropdown-toggle:before{display:block}.bs-actionsbox,.bs-donebutton,.bs-searchbox{padding:4px 8px}.bs-actionsbox{width:100%;-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box}.bs-actionsbox .btn-group button{width:50%}.bs-donebutton{float:left;width:100%;-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box}.bs-donebutton .btn-group button{width:100%}.bs-searchbox+.bs-actionsbox{padding:0 8px 4px}.bs-searchbox .form-control{margin-bottom:0;width:100%;float:none}";
      }
      public String getName() {
        return "select_css";
      }
    }
    ;
  }
  private static class select_cssInitializer {
    static {
      _instance0.select_cssInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return select_css;
    }
  }
  public org.gwtproject.resources.client.TextResource select_css() {
    return select_cssInitializer.get();
  }
  private void arInitializer() {
    ar = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-ar_AR.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){/*!\n * Translated default messages for bootstrap-select.\n * Locale: AR (Arabic)\n * Author: Yasser Lotfy <y_l@alive.com>\n */\n!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"لم يتم إختيار شئ\",noneResultsText:\"لا توجد نتائج مطابقة لـ {0}\",countSelectedText:function(a,b){return 1==a?\"{0} خيار تم إختياره\":\"{0} خيارات تمت إختيارها\"},maxOptionsText:function(a,b){return[1==a?\"تخطى الحد المسموح ({n} خيار بحد أقصى)\":\"تخطى الحد المسموح ({n} خيارات بحد أقصى)\",1==b?\"تخطى الحد المسموح للمجموعة ({n} خيار بحد أقصى)\":\"تخطى الحد المسموح للمجموعة ({n} خيارات بحد أقصى)\"]},selectAllText:\"إختيار الجميع\",deselectAllText:\"إلغاء إختيار الجميع\",multipleSeparator:\"، \"}}(a)});";
      }
      public String getName() {
        return "ar";
      }
    }
    ;
  }
  private static class arInitializer {
    static {
      _instance0.arInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return ar;
    }
  }
  public org.gwtproject.resources.client.TextResource ar() {
    return arInitializer.get();
  }
  private void bgInitializer() {
    bg = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-bg_BG.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Нищо избрано\",noneResultsText:\"Няма резултат за {0}\",countSelectedText:function(a,b){return 1==a?\"{0} избран елемент\":\"{0} избрани елемента\"},maxOptionsText:function(a,b){return[1==a?\"Лимита е достигнат ({n} елемент максимум)\":\"Лимита е достигнат ({n} елемента максимум)\",1==b?\"Груповия лимит е достигнат ({n} елемент максимум)\":\"Груповия лимит е достигнат ({n} елемента максимум)\"]},selectAllText:\"Избери всички\",deselectAllText:\"Размаркирай всички\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "bg";
      }
    }
    ;
  }
  private static class bgInitializer {
    static {
      _instance0.bgInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return bg;
    }
  }
  public org.gwtproject.resources.client.TextResource bg() {
    return bgInitializer.get();
  }
  private void croInitializer() {
    cro = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-cro_CRO.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Odaberite stavku\",noneResultsText:\"Nema rezultata pretrage {0}\",countSelectedText:function(a,b){return 1==a?\"{0} stavka selektirana\":\"{0} stavke selektirane\"},maxOptionsText:function(a,b){return[1==a?\"Limit je postignut ({n} stvar maximalno)\":\"Limit je postignut ({n} stavke maksimalno)\",1==b?\"Grupni limit je postignut ({n} stvar maksimalno)\":\"Grupni limit je postignut ({n} stavke maksimalno)\"]},selectAllText:\"Selektiraj sve\",deselectAllText:\"Deselektiraj sve\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "cro";
      }
    }
    ;
  }
  private static class croInitializer {
    static {
      _instance0.croInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return cro;
    }
  }
  public org.gwtproject.resources.client.TextResource cro() {
    return croInitializer.get();
  }
  private void csInitializer() {
    cs = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-cs_CZ.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Nic není vybráno\",noneResultsText:\"Žádné výsledky {0}\",countSelectedText:\"Označeno {0} z {1}\",maxOptionsText:[\"Limit překročen ({n} {var} max)\",\"Limit skupiny překročen ({n} {var} max)\",[\"položek\",\"položka\"]],multipleSeparator:\", \",selectAllText:\"Vybrat Vše\",deselectAllText:\"Odznačit Vše\"}}(a)});";
      }
      public String getName() {
        return "cs";
      }
    }
    ;
  }
  private static class csInitializer {
    static {
      _instance0.csInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return cs;
    }
  }
  public org.gwtproject.resources.client.TextResource cs() {
    return csInitializer.get();
  }
  private void daInitializer() {
    da = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-da_DK.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Intet valgt\",noneResultsText:\"Ingen resultater fundet {0}\",countSelectedText:function(a,b){return\"{0} valgt\"},maxOptionsText:function(a,b){return[1==a?\"Begrænsning nået (max {n} valgt)\":\"Begrænsning nået (max {n} valgte)\",1==b?\"Gruppe-begrænsning nået (max {n} valgt)\":\"Gruppe-begrænsning nået (max {n} valgte)\"]},selectAllText:\"Markér alle\",deselectAllText:\"Afmarkér alle\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "da";
      }
    }
    ;
  }
  private static class daInitializer {
    static {
      _instance0.daInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return da;
    }
  }
  public org.gwtproject.resources.client.TextResource da() {
    return daInitializer.get();
  }
  private void deInitializer() {
    de = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-de_DE.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Bitte wählen...\",noneResultsText:\"Keine Ergebnisse für {0}\",countSelectedText:function(a,b){return 1==a?\"{0} Element ausgewählt\":\"{0} Elemente ausgewählt\"},maxOptionsText:function(a,b){return[1==a?\"Limit erreicht ({n} Element max.)\":\"Limit erreicht ({n} Elemente max.)\",1==b?\"Gruppen-Limit erreicht ({n} Element max.)\":\"Gruppen-Limit erreicht ({n} Elemente max.)\"]},selectAllText:\"Alles auswählen\",deselectAllText:\"Nichts auswählen\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "de";
      }
    }
    ;
  }
  private static class deInitializer {
    static {
      _instance0.deInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return de;
    }
  }
  public org.gwtproject.resources.client.TextResource de() {
    return deInitializer.get();
  }
  private void enInitializer() {
    en = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-en_US.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Nothing selected\",noneResultsText:\"No results match {0}\",countSelectedText:function(a,b){return 1==a?\"{0} item selected\":\"{0} items selected\"},maxOptionsText:function(a,b){return[1==a?\"Limit reached ({n} item max)\":\"Limit reached ({n} items max)\",1==b?\"Group limit reached ({n} item max)\":\"Group limit reached ({n} items max)\"]},selectAllText:\"Select All\",deselectAllText:\"Deselect All\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "en";
      }
    }
    ;
  }
  private static class enInitializer {
    static {
      _instance0.enInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return en;
    }
  }
  public org.gwtproject.resources.client.TextResource en() {
    return enInitializer.get();
  }
  private void es_CLInitializer() {
    es_CL = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-es_CL.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"No hay selección\",noneResultsText:\"No hay resultados {0}\",countSelectedText:\"Seleccionados {0} de {1}\",maxOptionsText:[\"Límite alcanzado ({n} {var} max)\",\"Límite del grupo alcanzado({n} {var} max)\",[\"elementos\",\"element\"]],multipleSeparator:\", \",selectAllText:\"Seleccionar Todos\",deselectAllText:\"Desmarcar Todos\"}}(a)});";
      }
      public String getName() {
        return "es_CL";
      }
    }
    ;
  }
  private static class es_CLInitializer {
    static {
      _instance0.es_CLInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return es_CL;
    }
  }
  public org.gwtproject.resources.client.TextResource es_CL() {
    return es_CLInitializer.get();
  }
  private void es_ESInitializer() {
    es_ES = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-es_ES.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"No hay selección\",noneResultsText:\"No hay resultados {0}\",countSelectedText:\"Seleccionados {0} de {1}\",maxOptionsText:[\"Límite alcanzado ({n} {var} max)\",\"Límite del grupo alcanzado({n} {var} max)\",[\"elementos\",\"element\"]],multipleSeparator:\", \",selectAllText:\"Seleccionar Todos\",deselectAllText:\"Desmarcar Todos\"}}(a)});";
      }
      public String getName() {
        return "es_ES";
      }
    }
    ;
  }
  private static class es_ESInitializer {
    static {
      _instance0.es_ESInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return es_ES;
    }
  }
  public org.gwtproject.resources.client.TextResource es_ES() {
    return es_ESInitializer.get();
  }
  private void euInitializer() {
    eu = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-eu.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Hautapenik ez\",noneResultsText:\"Emaitzarik ez {0}\",countSelectedText:\"{1}(e)tik {0} hautatuta\",maxOptionsText:[\"Mugara iritsita ({n} {var} gehienez)\",\"Taldearen mugara iritsita ({n} {var} gehienez)\",[\"elementu\",\"elementu\"]],multipleSeparator:\", \",selectAllText:\"Hautatu Guztiak\",deselectAllText:\"Desautatu Guztiak\"}}(a)});";
      }
      public String getName() {
        return "eu";
      }
    }
    ;
  }
  private static class euInitializer {
    static {
      _instance0.euInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return eu;
    }
  }
  public org.gwtproject.resources.client.TextResource eu() {
    return euInitializer.get();
  }
  private void faInitializer() {
    fa = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-fa_IR.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"چیزی انتخاب نشده است\",noneResultsText:\"هیج مشابهی برای {0} پیدا نشد\",countSelectedText:\"{0} از {1} مورد انتخاب شده\",maxOptionsText:[\"بیشتر ممکن نیست {حداکثر {n} عدد}\",\"بیشتر ممکن نیست {حداکثر {n} عدد}\"],selectAllText:\"انتخاب همه\",deselectAllText:\"انتخاب هیچ کدام\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "fa";
      }
    }
    ;
  }
  private static class faInitializer {
    static {
      _instance0.faInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return fa;
    }
  }
  public org.gwtproject.resources.client.TextResource fa() {
    return faInitializer.get();
  }
  private void fiInitializer() {
    fi = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-fi_FI.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Ei valintoja\",noneResultsText:\"Ei hakutuloksia {0}\",countSelectedText:function(a,b){return 1==a?\"{0} valittu\":\"{0} valitut\"},maxOptionsText:function(a,b){return[\"Valintojen maksimimäärä ({n} saavutettu)\",\"Ryhmän maksimimäärä ({n} saavutettu)\"]},selectAllText:\"Valitse kaikki\",deselectAllText:\"Poista kaikki\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "fi";
      }
    }
    ;
  }
  private static class fiInitializer {
    static {
      _instance0.fiInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return fi;
    }
  }
  public org.gwtproject.resources.client.TextResource fi() {
    return fiInitializer.get();
  }
  private void frInitializer() {
    fr = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-fr_FR.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Aucune sélection\",noneResultsText:\"Aucun résultat pour {0}\",countSelectedText:function(a,b){return a>1?\"{0} éléments sélectionnés\":\"{0} élément sélectionné\"},maxOptionsText:function(a,b){return[a>1?\"Limite atteinte ({n} éléments max)\":\"Limite atteinte ({n} élément max)\",b>1?\"Limite du groupe atteinte ({n} éléments max)\":\"Limite du groupe atteinte ({n} élément max)\"]},multipleSeparator:\", \",selectAllText:\"Tout sélectionner\",deselectAllText:\"Tout désélectionner\"}}(a)});";
      }
      public String getName() {
        return "fr";
      }
    }
    ;
  }
  private static class frInitializer {
    static {
      _instance0.frInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return fr;
    }
  }
  public org.gwtproject.resources.client.TextResource fr() {
    return frInitializer.get();
  }
  private void huInitializer() {
    hu = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-hu_HU.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Válasszon!\",noneResultsText:\"Nincs találat {0}\",countSelectedText:function(a,b){return\"{0} elem kiválasztva\"},maxOptionsText:function(a,b){return[\"Legfeljebb {n} elem választható\",\"A csoportban legfeljebb {n} elem választható\"]},selectAllText:\"Mind\",deselectAllText:\"Egyik sem\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "hu";
      }
    }
    ;
  }
  private static class huInitializer {
    static {
      _instance0.huInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return hu;
    }
  }
  public org.gwtproject.resources.client.TextResource hu() {
    return huInitializer.get();
  }
  private void idInitializer() {
    id = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-id_ID.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Tidak ada yang dipilih\",noneResultsText:\"Tidak ada yang cocok {0}\",countSelectedText:\"{0} terpilih\",maxOptionsText:[\"Mencapai batas (maksimum {n})\",\"Mencapai batas grup (maksimum {n})\"],selectAllText:\"Pilih Semua\",deselectAllText:\"Hapus Semua\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "id";
      }
    }
    ;
  }
  private static class idInitializer {
    static {
      _instance0.idInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return id;
    }
  }
  public org.gwtproject.resources.client.TextResource id() {
    return idInitializer.get();
  }
  private void itInitializer() {
    it = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-it_IT.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Nessuna selezione\",noneResultsText:\"Nessun risultato per {0}\",countSelectedText:function(a,b){return 1==a?\"Selezionato {0} di {1}\":\"Selezionati {0} di {1}\"},maxOptionsText:[\"Limite raggiunto ({n} {var} max)\",\"Limite del gruppo raggiunto ({n} {var} max)\",[\"elementi\",\"elemento\"]],multipleSeparator:\", \",selectAllText:\"Seleziona Tutto\",deselectAllText:\"Deseleziona Tutto\"}}(a)});";
      }
      public String getName() {
        return "it";
      }
    }
    ;
  }
  private static class itInitializer {
    static {
      _instance0.itInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return it;
    }
  }
  public org.gwtproject.resources.client.TextResource it() {
    return itInitializer.get();
  }
  private void koInitializer() {
    ko = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-ko_KR.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"항목을 선택해주세요\",noneResultsText:\"{0} 검색 결과가 없습니다\",countSelectedText:function(a,b){return\"{0}개를 선택하였습니다\"},maxOptionsText:function(a,b){return[\"{n}개까지 선택 가능합니다\",\"해당 그룹은 {n}개까지 선택 가능합니다\"]},selectAllText:\"전체선택\",deselectAllText:\"전체해제\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "ko";
      }
    }
    ;
  }
  private static class koInitializer {
    static {
      _instance0.koInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return ko;
    }
  }
  public org.gwtproject.resources.client.TextResource ko() {
    return koInitializer.get();
  }
  private void ltInitializer() {
    lt = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-lt_LT.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Niekas nepasirinkta\",noneResultsText:\"Niekas nesutapo su {0}\",countSelectedText:function(a,b){return 1==a?\"{0} elementas pasirinktas\":\"{0} elementai(-ų) pasirinkta\"},maxOptionsText:function(a,b){return[1==a?\"Pasiekta riba ({n} elementas daugiausiai)\":\"Riba pasiekta ({n} elementai(-ų) daugiausiai)\",1==b?\"Grupės riba pasiekta ({n} elementas daugiausiai)\":\"Grupės riba pasiekta ({n} elementai(-ų) daugiausiai)\"]},selectAllText:\"Pasirinkti visus\",deselectAllText:\"Atmesti visus\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "lt";
      }
    }
    ;
  }
  private static class ltInitializer {
    static {
      _instance0.ltInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return lt;
    }
  }
  public org.gwtproject.resources.client.TextResource lt() {
    return ltInitializer.get();
  }
  private void nbInitializer() {
    nb = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-nb_NO.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Ingen valgt\",noneResultsText:\"Søket gir ingen treff {0}\",countSelectedText:function(a,b){return 1==a?\"{0} alternativ valgt\":\"{0} alternativer valgt\"},maxOptionsText:function(a,b){return[\"Grense nådd (maks {n} valg)\",\"Grense for grupper nådd (maks {n} grupper)\"]},selectAllText:\"Merk alle\",deselectAllText:\"Fjern alle\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "nb";
      }
    }
    ;
  }
  private static class nbInitializer {
    static {
      _instance0.nbInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return nb;
    }
  }
  public org.gwtproject.resources.client.TextResource nb() {
    return nbInitializer.get();
  }
  private void nlInitializer() {
    nl = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-nl_NL.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Niets geselecteerd\",noneResultsText:\"Geen resultaten gevonden voor {0}\",countSelectedText:\"{0} van {1} geselecteerd\",maxOptionsText:[\"Limiet bereikt ({n} {var} max)\",\"Groep limiet bereikt ({n} {var} max)\",[\"items\",\"item\"]],selectAllText:\"Alles selecteren\",deselectAllText:\"Alles deselecteren\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "nl";
      }
    }
    ;
  }
  private static class nlInitializer {
    static {
      _instance0.nlInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return nl;
    }
  }
  public org.gwtproject.resources.client.TextResource nl() {
    return nlInitializer.get();
  }
  private void plInitializer() {
    pl = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-pl_PL.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Nic nie zaznaczono\",noneResultsText:\"Brak wyników wyszukiwania {0}\",countSelectedText:\"Zaznaczono {0} z {1}\",maxOptionsText:[\"Osiągnięto limit ({n} {var} max)\",\"Limit grupy osiągnięty ({n} {var} max)\",[\"elementy\",\"element\"]],selectAllText:\"Zaznacz wszystkie\",deselectAllText:\"Odznacz wszystkie\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "pl";
      }
    }
    ;
  }
  private static class plInitializer {
    static {
      _instance0.plInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return pl;
    }
  }
  public org.gwtproject.resources.client.TextResource pl() {
    return plInitializer.get();
  }
  private void pt_BRInitializer() {
    pt_BR = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-pt_BR.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Nada selecionado\",noneResultsText:\"Nada encontrado contendo {0}\",countSelectedText:\"Selecionado {0} de {1}\",maxOptionsText:[\"Limite excedido (máx. {n} {var})\",\"Limite do grupo excedido (máx. {n} {var})\",[\"itens\",\"item\"]],multipleSeparator:\", \",selectAllText:\"Selecionar Todos\",deselectAllText:\"Desmarcar Todos\"}}(a)});";
      }
      public String getName() {
        return "pt_BR";
      }
    }
    ;
  }
  private static class pt_BRInitializer {
    static {
      _instance0.pt_BRInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return pt_BR;
    }
  }
  public org.gwtproject.resources.client.TextResource pt_BR() {
    return pt_BRInitializer.get();
  }
  private void pt_PTInitializer() {
    pt_PT = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-pt_PT.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Nenhum seleccionado\",noneResultsText:\"Sem resultados contendo {0}\",countSelectedText:\"Selecionado {0} de {1}\",maxOptionsText:[\"Limite ultrapassado (máx. {n} {var})\",\"Limite de seleções ultrapassado (máx. {n} {var})\",[\"itens\",\"item\"]],multipleSeparator:\", \",selectAllText:\"Selecionar Tudo\",deselectAllText:\"Desmarcar Todos\"}}(a)});";
      }
      public String getName() {
        return "pt_PT";
      }
    }
    ;
  }
  private static class pt_PTInitializer {
    static {
      _instance0.pt_PTInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return pt_PT;
    }
  }
  public org.gwtproject.resources.client.TextResource pt_PT() {
    return pt_PTInitializer.get();
  }
  private void roInitializer() {
    ro = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-ro_RO.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={doneButtonText:\"Închide\",noneSelectedText:\"Nu a fost selectat nimic\",noneResultsText:\"Nu există niciun rezultat {0}\",countSelectedText:\"{0} din {1} selectat(e)\",maxOptionsText:[\"Limita a fost atinsă ({n} {var} max)\",\"Limita de grup a fost atinsă ({n} {var} max)\",[\"iteme\",\"item\"]],selectAllText:\"Selectează toate\",deselectAllText:\"Deselectează toate\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "ro";
      }
    }
    ;
  }
  private static class roInitializer {
    static {
      _instance0.roInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return ro;
    }
  }
  public org.gwtproject.resources.client.TextResource ro() {
    return roInitializer.get();
  }
  private void ruInitializer() {
    ru = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-ru_RU.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Ничего не выбрано\",noneResultsText:\"Совпадений не найдено {0}\",countSelectedText:\"Выбрано {0} из {1}\",maxOptionsText:[\"Достигнут предел ({n} {var} максимум)\",\"Достигнут предел в группе ({n} {var} максимум)\",[\"шт.\",\"шт.\"]],doneButtonText:\"Закрыть\",selectAllText:\"Выбрать все\",deselectAllText:\"Отменить все\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "ru";
      }
    }
    ;
  }
  private static class ruInitializer {
    static {
      _instance0.ruInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return ru;
    }
  }
  public org.gwtproject.resources.client.TextResource ru() {
    return ruInitializer.get();
  }
  private void skInitializer() {
    sk = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-sk_SK.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Vyberte zo zoznamu\",noneResultsText:\"Pre výraz {0} neboli nájdené žiadne výsledky\",countSelectedText:\"Vybrané {0} z {1}\",maxOptionsText:[\"Limit prekročený ({n} {var} max)\",\"Limit skupiny prekročený ({n} {var} max)\",[\"položiek\",\"položka\"]],selectAllText:\"Vybrať všetky\",deselectAllText:\"Zrušiť výber\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "sk";
      }
    }
    ;
  }
  private static class skInitializer {
    static {
      _instance0.skInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return sk;
    }
  }
  public org.gwtproject.resources.client.TextResource sk() {
    return skInitializer.get();
  }
  private void slInitializer() {
    sl = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-sl_SI.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Nič izbranega\",noneResultsText:\"Ni zadetkov za {0}\",countSelectedText:\"{0} od {1} izbranih\",maxOptionsText:function(a,b){return[\"Omejitev dosežena (max. izbranih: {n})\",\"Omejitev skupine dosežena (max. izbranih: {n})\"]},selectAllText:\"Izberi vse\",deselectAllText:\"Počisti izbor\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "sl";
      }
    }
    ;
  }
  private static class slInitializer {
    static {
      _instance0.slInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return sl;
    }
  }
  public org.gwtproject.resources.client.TextResource sl() {
    return slInitializer.get();
  }
  private void svInitializer() {
    sv = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-sv_SE.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Inget valt\",noneResultsText:\"Inget sökresultat matchar {0}\",countSelectedText:function(a,b){return 1===a?\"{0} alternativ valt\":\"{0} alternativ valda\"},maxOptionsText:function(a,b){return[\"Gräns uppnåd (max {n} alternativ)\",\"Gräns uppnåd (max {n} gruppalternativ)\"]},selectAllText:\"Markera alla\",deselectAllText:\"Avmarkera alla\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "sv";
      }
    }
    ;
  }
  private static class svInitializer {
    static {
      _instance0.svInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return sv;
    }
  }
  public org.gwtproject.resources.client.TextResource sv() {
    return svInitializer.get();
  }
  private void trInitializer() {
    tr = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-tr_TR.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Hiçbiri seçilmedi\",noneResultsText:\"Hiçbir sonuç bulunamadı {0}\",countSelectedText:function(a,b){return\"{0} öğe seçildi\"},maxOptionsText:function(a,b){return[1==a?\"Limit aşıldı (maksimum {n} sayıda öğe )\":\"Limit aşıldı (maksimum {n} sayıda öğe)\",\"Grup limiti aşıldı (maksimum {n} sayıda öğe)\"]},selectAllText:\"Tümünü Seç\",deselectAllText:\"Seçiniz\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "tr";
      }
    }
    ;
  }
  private static class trInitializer {
    static {
      _instance0.trInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return tr;
    }
  }
  public org.gwtproject.resources.client.TextResource tr() {
    return trInitializer.get();
  }
  private void uaInitializer() {
    ua = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-ua_UA.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"Нічого не вибрано\",noneResultsText:\"Збігів не знайдено {0}\",countSelectedText:\"Вибрано {0} із {1}\",maxOptionsText:[\"Досягнута межа ({n} {var} максимум)\",\"Досягнута межа в групі ({n} {var} максимум)\",[\"items\",\"item\"]],multipleSeparator:\", \",selectAllText:\"Вибрати все\",deselectAllText:\"Скасувати вибір усі\"}}(a)});";
      }
      public String getName() {
        return "ua";
      }
    }
    ;
  }
  private static class uaInitializer {
    static {
      _instance0.uaInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return ua;
    }
  }
  public org.gwtproject.resources.client.TextResource ua() {
    return uaInitializer.get();
  }
  private void zh_CNInitializer() {
    zh_CN = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-zh_CN.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"没有选中任何项\",noneResultsText:\"没有找到匹配项\",countSelectedText:\"选中{1}中的{0}项\",maxOptionsText:[\"超出限制 (最多选择{n}项)\",\"组选择超出限制(最多选择{n}组)\"],multipleSeparator:\", \",selectAllText:\"全选\",deselectAllText:\"取消全选\"}}(a)});";
      }
      public String getName() {
        return "zh_CN";
      }
    }
    ;
  }
  private static class zh_CNInitializer {
    static {
      _instance0.zh_CNInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return zh_CN;
    }
  }
  public org.gwtproject.resources.client.TextResource zh_CN() {
    return zh_CNInitializer.get();
  }
  private void zh_TWInitializer() {
    zh_TW = new org.gwtproject.resources.client.TextResource() {
      // file:/home/treblereel/workspace/gwt/gwtbootstrap3-extras/target/classes/org/gwtbootstrap3/extras/select/client/resource/js/i18n.cache.1.12.4/defaults-zh_TW.min.js
      public String getText() {
        return "/*!\n * Bootstrap-select v1.12.4 (http://silviomoreto.github.io/bootstrap-select)\n *\n * Copyright 2013-2017 bootstrap-select\n * Licensed under MIT (https://github.com/silviomoreto/bootstrap-select/blob/master/LICENSE)\n */\n!function(a,b){\"function\"==typeof define&&define.amd?define([\"jquery\"],function(a){return b(a)}):\"object\"==typeof module&&module.exports?module.exports=b(require(\"jquery\")):b(a.jQuery)}(this,function(a){!function(a){a.fn.selectpicker.defaults={noneSelectedText:\"沒有選取任何項目\",noneResultsText:\"沒有找到符合的結果\",countSelectedText:\"已經選取{0}個項目\",maxOptionsText:[\"超過限制 (最多選擇{n}項)\",\"超過限制(最多選擇{n}組)\"],selectAllText:\"選取全部\",deselectAllText:\"全部取消\",multipleSeparator:\", \"}}(a)});";
      }
      public String getName() {
        return "zh_TW";
      }
    }
    ;
  }
  private static class zh_TWInitializer {
    static {
      _instance0.zh_TWInitializer();
    }
    static org.gwtproject.resources.client.TextResource get() {
      return zh_TW;
    }
  }
  public org.gwtproject.resources.client.TextResource zh_TW() {
    return zh_TWInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static org.gwtproject.resources.client.TextResource select;
  private static org.gwtproject.resources.client.TextResource select_css;
  private static org.gwtproject.resources.client.TextResource ar;
  private static org.gwtproject.resources.client.TextResource bg;
  private static org.gwtproject.resources.client.TextResource cro;
  private static org.gwtproject.resources.client.TextResource cs;
  private static org.gwtproject.resources.client.TextResource da;
  private static org.gwtproject.resources.client.TextResource de;
  private static org.gwtproject.resources.client.TextResource en;
  private static org.gwtproject.resources.client.TextResource es_CL;
  private static org.gwtproject.resources.client.TextResource es_ES;
  private static org.gwtproject.resources.client.TextResource eu;
  private static org.gwtproject.resources.client.TextResource fa;
  private static org.gwtproject.resources.client.TextResource fi;
  private static org.gwtproject.resources.client.TextResource fr;
  private static org.gwtproject.resources.client.TextResource hu;
  private static org.gwtproject.resources.client.TextResource id;
  private static org.gwtproject.resources.client.TextResource it;
  private static org.gwtproject.resources.client.TextResource ko;
  private static org.gwtproject.resources.client.TextResource lt;
  private static org.gwtproject.resources.client.TextResource nb;
  private static org.gwtproject.resources.client.TextResource nl;
  private static org.gwtproject.resources.client.TextResource pl;
  private static org.gwtproject.resources.client.TextResource pt_BR;
  private static org.gwtproject.resources.client.TextResource pt_PT;
  private static org.gwtproject.resources.client.TextResource ro;
  private static org.gwtproject.resources.client.TextResource ru;
  private static org.gwtproject.resources.client.TextResource sk;
  private static org.gwtproject.resources.client.TextResource sl;
  private static org.gwtproject.resources.client.TextResource sv;
  private static org.gwtproject.resources.client.TextResource tr;
  private static org.gwtproject.resources.client.TextResource ua;
  private static org.gwtproject.resources.client.TextResource zh_CN;
  private static org.gwtproject.resources.client.TextResource zh_TW;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      select(), 
      select_css(), 
      ar(), 
      bg(), 
      cro(), 
      cs(), 
      da(), 
      de(), 
      en(), 
      es_CL(), 
      es_ES(), 
      eu(), 
      fa(), 
      fi(), 
      fr(), 
      hu(), 
      id(), 
      it(), 
      ko(), 
      lt(), 
      nb(), 
      nl(), 
      pl(), 
      pt_BR(), 
      pt_PT(), 
      ro(), 
      ru(), 
      sk(), 
      sl(), 
      sv(), 
      tr(), 
      ua(), 
      zh_CN(), 
      zh_TW(), 
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
        resourceMap.put("select", select());
        resourceMap.put("select_css", select_css());
        resourceMap.put("ar", ar());
        resourceMap.put("bg", bg());
        resourceMap.put("cro", cro());
        resourceMap.put("cs", cs());
        resourceMap.put("da", da());
        resourceMap.put("de", de());
        resourceMap.put("en", en());
        resourceMap.put("es_CL", es_CL());
        resourceMap.put("es_ES", es_ES());
        resourceMap.put("eu", eu());
        resourceMap.put("fa", fa());
        resourceMap.put("fi", fi());
        resourceMap.put("fr", fr());
        resourceMap.put("hu", hu());
        resourceMap.put("id", id());
        resourceMap.put("it", it());
        resourceMap.put("ko", ko());
        resourceMap.put("lt", lt());
        resourceMap.put("nb", nb());
        resourceMap.put("nl", nl());
        resourceMap.put("pl", pl());
        resourceMap.put("pt_BR", pt_BR());
        resourceMap.put("pt_PT", pt_PT());
        resourceMap.put("ro", ro());
        resourceMap.put("ru", ru());
        resourceMap.put("sk", sk());
        resourceMap.put("sl", sl());
        resourceMap.put("sv", sv());
        resourceMap.put("tr", tr());
        resourceMap.put("ua", ua());
        resourceMap.put("zh_CN", zh_CN());
        resourceMap.put("zh_TW", zh_TW());
      }
      return resourceMap.get(name);
  }
}
