/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UINavigationItem extends NSObject implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UINavigationItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UINavigationItem alloc();

    /**
     * backBarButtonItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/backBarButtonItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("backBarButtonItem")
    public native UIBarButtonItem backBarButtonItem();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * hidesBackButton</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/hidesBackButton">iOS Dev Center</a>
     */
    @Generated
    @Selector("hidesBackButton")
    public native boolean hidesBackButton();

    @Generated
    @Selector("init")
    public native UINavigationItem init();

    @Generated
    @Selector("initWithCoder:")
    public native UINavigationItem initWithCoder(NSCoder coder);

    /**
     * initWithTitle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instm/UINavigationItem/initWithTitle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTitle:")
    public native UINavigationItem initWithTitle(String title);

    /**
     * leftBarButtonItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/leftBarButtonItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("leftBarButtonItem")
    public native UIBarButtonItem leftBarButtonItem();

    /**
     * leftBarButtonItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/leftBarButtonItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("leftBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> leftBarButtonItems();

    /**
     * leftItemsSupplementBackButton</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/leftItemsSupplementBackButton">iOS Dev Center</a>
     */
    @Generated
    @Selector("leftItemsSupplementBackButton")
    public native boolean leftItemsSupplementBackButton();

    /**
     * prompt</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/prompt">iOS Dev Center</a>
     */
    @Generated
    @Selector("prompt")
    public native String prompt();

    /**
     * rightBarButtonItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/rightBarButtonItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("rightBarButtonItem")
    public native UIBarButtonItem rightBarButtonItem();

    /**
     * rightBarButtonItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/rightBarButtonItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("rightBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> rightBarButtonItems();

    /**
     * backBarButtonItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/backBarButtonItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackBarButtonItem:")
    public native void setBackBarButtonItem(UIBarButtonItem value);

    /**
     * hidesBackButton</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/hidesBackButton">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHidesBackButton:")
    public native void setHidesBackButton(boolean value);

    /**
     * setHidesBackButton:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instm/UINavigationItem/setHidesBackButton:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHidesBackButton:animated:")
    public native void setHidesBackButtonAnimated(boolean hidesBackButton, boolean animated);

    /**
     * leftBarButtonItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/leftBarButtonItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLeftBarButtonItem:")
    public native void setLeftBarButtonItem(UIBarButtonItem value);

    /**
     * setLeftBarButtonItem:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instm/UINavigationItem/setLeftBarButtonItem:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLeftBarButtonItem:animated:")
    public native void setLeftBarButtonItemAnimated(UIBarButtonItem item, boolean animated);

    /**
     * leftBarButtonItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/leftBarButtonItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLeftBarButtonItems:")
    public native void setLeftBarButtonItems(NSArray<? extends UIBarButtonItem> value);

    /**
     * setLeftBarButtonItems:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instm/UINavigationItem/setLeftBarButtonItems:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLeftBarButtonItems:animated:")
    public native void setLeftBarButtonItemsAnimated(NSArray<? extends UIBarButtonItem> items, boolean animated);

    /**
     * leftItemsSupplementBackButton</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/leftItemsSupplementBackButton">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLeftItemsSupplementBackButton:")
    public native void setLeftItemsSupplementBackButton(boolean value);

    /**
     * prompt</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/prompt">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPrompt:")
    public native void setPrompt(String value);

    /**
     * rightBarButtonItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/rightBarButtonItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRightBarButtonItem:")
    public native void setRightBarButtonItem(UIBarButtonItem value);

    /**
     * setRightBarButtonItem:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instm/UINavigationItem/setRightBarButtonItem:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRightBarButtonItem:animated:")
    public native void setRightBarButtonItemAnimated(UIBarButtonItem item, boolean animated);

    /**
     * rightBarButtonItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/rightBarButtonItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRightBarButtonItems:")
    public native void setRightBarButtonItems(NSArray<? extends UIBarButtonItem> value);

    /**
     * setRightBarButtonItems:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instm/UINavigationItem/setRightBarButtonItems:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRightBarButtonItems:animated:")
    public native void setRightBarButtonItemsAnimated(NSArray<? extends UIBarButtonItem> items, boolean animated);

    /**
     * title</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/title">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * titleView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/titleView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTitleView:")
    public native void setTitleView(UIView value);

    /**
     * title</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/title">iOS Dev Center</a>
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * titleView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationItem_Class/index.html#//apple_ref/occ/instp/UINavigationItem/titleView">iOS Dev Center</a>
     */
    @Generated
    @Selector("titleView")
    public native UIView titleView();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
