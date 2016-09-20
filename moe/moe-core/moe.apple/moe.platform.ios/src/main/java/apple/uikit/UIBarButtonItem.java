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
import apple.uikit.struct.UIOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBarButtonItem extends UIBarItem implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBarButtonItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBarButtonItem alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass,
            Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * action</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/action">iOS Dev Center</a>
     */
    @Generated
    @Selector("action")
    public native SEL action();

    /**
     * backButtonBackgroundImageForState:barMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/backButtonBackgroundImageForState:barMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("backButtonBackgroundImageForState:barMetrics:")
    public native UIImage backButtonBackgroundImageForStateBarMetrics(@NUInt long state, @NInt long barMetrics);

    /**
     * backButtonBackgroundVerticalPositionAdjustmentForBarMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/backButtonBackgroundVerticalPositionAdjustmentForBarMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("backButtonBackgroundVerticalPositionAdjustmentForBarMetrics:")
    @NFloat
    public native double backButtonBackgroundVerticalPositionAdjustmentForBarMetrics(@NInt long barMetrics);

    /**
     * backButtonTitlePositionAdjustmentForBarMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/backButtonTitlePositionAdjustmentForBarMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("backButtonTitlePositionAdjustmentForBarMetrics:")
    @ByValue
    public native UIOffset backButtonTitlePositionAdjustmentForBarMetrics(@NInt long barMetrics);

    /**
     * backgroundImageForState:barMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/backgroundImageForState:barMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("backgroundImageForState:barMetrics:")
    public native UIImage backgroundImageForStateBarMetrics(@NUInt long state, @NInt long barMetrics);

    /**
     * backgroundImageForState:style:barMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/backgroundImageForState:style:barMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("backgroundImageForState:style:barMetrics:")
    public native UIImage backgroundImageForStateStyleBarMetrics(@NUInt long state, @NInt long style,
            @NInt long barMetrics);

    /**
     * backgroundVerticalPositionAdjustmentForBarMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/backgroundVerticalPositionAdjustmentForBarMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("backgroundVerticalPositionAdjustmentForBarMetrics:")
    @NFloat
    public native double backgroundVerticalPositionAdjustmentForBarMetrics(@NInt long barMetrics);

    /**
     * customView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/customView">iOS Dev Center</a>
     */
    @Generated
    @Selector("customView")
    public native UIView customView();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native UIBarButtonItem init();

    /**
     * initWithBarButtonSystemItem:target:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/initWithBarButtonSystemItem:target:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBarButtonSystemItem:target:action:")
    public native UIBarButtonItem initWithBarButtonSystemItemTargetAction(@NInt long systemItem,
            @Mapped(ObjCObjectMapper.class) Object target, SEL action);

    @Generated
    @Selector("initWithCoder:")
    public native UIBarButtonItem initWithCoder(NSCoder aDecoder);

    /**
     * initWithCustomView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/initWithCustomView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCustomView:")
    public native UIBarButtonItem initWithCustomView(UIView customView);

    /**
     * initWithImage:landscapeImagePhone:style:target:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/initWithImage:landscapeImagePhone:style:target:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithImage:landscapeImagePhone:style:target:action:")
    public native UIBarButtonItem initWithImageLandscapeImagePhoneStyleTargetAction(UIImage image,
            UIImage landscapeImagePhone, @NInt long style, @Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * initWithImage:style:target:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/initWithImage:style:target:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithImage:style:target:action:")
    public native UIBarButtonItem initWithImageStyleTargetAction(UIImage image, @NInt long style,
            @Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * initWithTitle:style:target:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/initWithTitle:style:target:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTitle:style:target:action:")
    public native UIBarButtonItem initWithTitleStyleTargetAction(String title, @NInt long style,
            @Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * possibleTitles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/possibleTitles">iOS Dev Center</a>
     */
    @Generated
    @Selector("possibleTitles")
    public native NSSet<String> possibleTitles();

    /**
     * action</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/action">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAction:")
    public native void setAction(SEL value);

    /**
     * setBackButtonBackgroundImage:forState:barMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/setBackButtonBackgroundImage:forState:barMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackButtonBackgroundImage:forState:barMetrics:")
    public native void setBackButtonBackgroundImageForStateBarMetrics(UIImage backgroundImage, @NUInt long state,
            @NInt long barMetrics);

    /**
     * setBackButtonBackgroundVerticalPositionAdjustment:forBarMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/setBackButtonBackgroundVerticalPositionAdjustment:forBarMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackButtonBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackButtonBackgroundVerticalPositionAdjustmentForBarMetrics(@NFloat double adjustment,
            @NInt long barMetrics);

    /**
     * setBackButtonTitlePositionAdjustment:forBarMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/setBackButtonTitlePositionAdjustment:forBarMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackButtonTitlePositionAdjustment:forBarMetrics:")
    public native void setBackButtonTitlePositionAdjustmentForBarMetrics(@ByValue UIOffset adjustment,
            @NInt long barMetrics);

    /**
     * setBackgroundImage:forState:barMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/setBackgroundImage:forState:barMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackgroundImage:forState:barMetrics:")
    public native void setBackgroundImageForStateBarMetrics(UIImage backgroundImage, @NUInt long state,
            @NInt long barMetrics);

    /**
     * setBackgroundImage:forState:style:barMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/setBackgroundImage:forState:style:barMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackgroundImage:forState:style:barMetrics:")
    public native void setBackgroundImageForStateStyleBarMetrics(UIImage backgroundImage, @NUInt long state,
            @NInt long style, @NInt long barMetrics);

    /**
     * setBackgroundVerticalPositionAdjustment:forBarMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/setBackgroundVerticalPositionAdjustment:forBarMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackgroundVerticalPositionAdjustmentForBarMetrics(@NFloat double adjustment,
            @NInt long barMetrics);

    /**
     * customView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/customView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCustomView:")
    public native void setCustomView(UIView value);

    /**
     * possibleTitles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/possibleTitles">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPossibleTitles:")
    public native void setPossibleTitles(NSSet<String> value);

    /**
     * style</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/style">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@NInt long value);

    /**
     * target</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/target">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTarget:")
    public native void setTarget_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * target</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/target">iOS Dev Center</a>
     */
    @Generated
    public void setTarget(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = target();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTarget_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * tintColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/tintColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    /**
     * setTitlePositionAdjustment:forBarMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/setTitlePositionAdjustment:forBarMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTitlePositionAdjustment:forBarMetrics:")
    public native void setTitlePositionAdjustmentForBarMetrics(@ByValue UIOffset adjustment, @NInt long barMetrics);

    /**
     * width</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/width">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWidth:")
    public native void setWidth(@NFloat double value);

    /**
     * style</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/style">iOS Dev Center</a>
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();

    /**
     * target</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/target">iOS Dev Center</a>
     */
    @Generated
    @Selector("target")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object target();

    /**
     * tintColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/tintColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    /**
     * titlePositionAdjustmentForBarMetrics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instm/UIBarButtonItem/titlePositionAdjustmentForBarMetrics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("titlePositionAdjustmentForBarMetrics:")
    @ByValue
    public native UIOffset titlePositionAdjustmentForBarMetrics(@NInt long barMetrics);

    /**
     * width</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/width">iOS Dev Center</a>
     */
    @Generated
    @Selector("width")
    @NFloat
    public native double width();

    /**
     * buttonGroup</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarButtonItem_Class/index.html#//apple_ref/occ/instp/UIBarButtonItem/buttonGroup">iOS Dev Center</a>
     */
    @Generated
    @Selector("buttonGroup")
    public native UIBarButtonItemGroup buttonGroup();

    @Generated
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }
}
