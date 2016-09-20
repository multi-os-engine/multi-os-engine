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
public class UITabBarItem extends UIBarItem {
    static {
        NatJ.register();
    }

    @Generated
    protected UITabBarItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITabBarItem alloc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * badgeValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instp/UITabBarItem/badgeValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("badgeValue")
    public native String badgeValue();

    /**
     * finishedSelectedImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instm/UITabBarItem/finishedSelectedImage">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("finishedSelectedImage")
    public native UIImage finishedSelectedImage();

    /**
     * finishedUnselectedImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instm/UITabBarItem/finishedUnselectedImage">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("finishedUnselectedImage")
    public native UIImage finishedUnselectedImage();

    @Generated
    @Selector("init")
    public native UITabBarItem init();

    /**
     * initWithTabBarSystemItem:tag:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instm/UITabBarItem/initWithTabBarSystemItem:tag:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTabBarSystemItem:tag:")
    public native UITabBarItem initWithTabBarSystemItemTag(@NInt long systemItem, @NInt long tag);

    /**
     * initWithTitle:image:selectedImage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instm/UITabBarItem/initWithTitle:image:selectedImage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTitle:image:selectedImage:")
    public native UITabBarItem initWithTitleImageSelectedImage(String title, UIImage image, UIImage selectedImage);

    /**
     * initWithTitle:image:tag:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instm/UITabBarItem/initWithTitle:image:tag:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTitle:image:tag:")
    public native UITabBarItem initWithTitleImageTag(String title, UIImage image, @NInt long tag);

    /**
     * selectedImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instp/UITabBarItem/selectedImage">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectedImage")
    public native UIImage selectedImage();

    /**
     * badgeValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instp/UITabBarItem/badgeValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBadgeValue:")
    public native void setBadgeValue(String value);

    /**
     * setFinishedSelectedImage:withFinishedUnselectedImage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instm/UITabBarItem/setFinishedSelectedImage:withFinishedUnselectedImage:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setFinishedSelectedImage:withFinishedUnselectedImage:")
    public native void setFinishedSelectedImageWithFinishedUnselectedImage(UIImage selectedImage,
            UIImage unselectedImage);

    /**
     * selectedImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instp/UITabBarItem/selectedImage">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelectedImage:")
    public native void setSelectedImage(UIImage value);

    /**
     * titlePositionAdjustment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instp/UITabBarItem/titlePositionAdjustment">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(@ByValue UIOffset value);

    /**
     * titlePositionAdjustment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarItem_Class/index.html#//apple_ref/occ/instp/UITabBarItem/titlePositionAdjustment">iOS Dev Center</a>
     */
    @Generated
    @Selector("titlePositionAdjustment")
    @ByValue
    public native UIOffset titlePositionAdjustment();

    @Generated
    @Selector("initWithCoder:")
    public native UITabBarItem initWithCoder(NSCoder aDecoder);

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
