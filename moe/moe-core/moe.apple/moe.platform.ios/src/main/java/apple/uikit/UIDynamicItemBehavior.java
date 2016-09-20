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
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIDynamicItem;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDynamicItemBehavior extends UIDynamicBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDynamicItemBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDynamicItemBehavior alloc();

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

    /**
     * addAngularVelocity:forItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instm/UIDynamicItemBehavior/addAngularVelocity:forItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addAngularVelocity:forItem:")
    public native void addAngularVelocityForItem(@NFloat double velocity,
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * addItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instm/UIDynamicItemBehavior/addItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addItem:")
    public native void addItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * addLinearVelocity:forItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instm/UIDynamicItemBehavior/addLinearVelocity:forItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addLinearVelocity:forItem:")
    public native void addLinearVelocityForItem(@ByValue CGPoint velocity,
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * allowsRotation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/allowsRotation">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsRotation")
    public native boolean allowsRotation();

    /**
     * angularResistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/angularResistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("angularResistance")
    @NFloat
    public native double angularResistance();

    /**
     * angularVelocityForItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instm/UIDynamicItemBehavior/angularVelocityForItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("angularVelocityForItem:")
    @NFloat
    public native double angularVelocityForItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * density</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/density">iOS Dev Center</a>
     */
    @Generated
    @Selector("density")
    @NFloat
    public native double density();

    /**
     * elasticity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/elasticity">iOS Dev Center</a>
     */
    @Generated
    @Selector("elasticity")
    @NFloat
    public native double elasticity();

    /**
     * friction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/friction">iOS Dev Center</a>
     */
    @Generated
    @Selector("friction")
    @NFloat
    public native double friction();

    @Generated
    @Selector("init")
    public native UIDynamicItemBehavior init();

    /**
     * initWithItems:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instm/UIDynamicItemBehavior/initWithItems:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithItems:")
    public native UIDynamicItemBehavior initWithItems(NSArray<?> items);

    /**
     * items</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/items">iOS Dev Center</a>
     */
    @Generated
    @Selector("items")
    public native NSArray<?> items();

    /**
     * linearVelocityForItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instm/UIDynamicItemBehavior/linearVelocityForItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("linearVelocityForItem:")
    @ByValue
    public native CGPoint linearVelocityForItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * removeItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instm/UIDynamicItemBehavior/removeItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeItem:")
    public native void removeItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * resistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/resistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("resistance")
    @NFloat
    public native double resistance();

    /**
     * allowsRotation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/allowsRotation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsRotation:")
    public native void setAllowsRotation(boolean value);

    /**
     * angularResistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/angularResistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAngularResistance:")
    public native void setAngularResistance(@NFloat double value);

    /**
     * density</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/density">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDensity:")
    public native void setDensity(@NFloat double value);

    /**
     * elasticity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/elasticity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setElasticity:")
    public native void setElasticity(@NFloat double value);

    /**
     * friction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/friction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFriction:")
    public native void setFriction(@NFloat double value);

    /**
     * resistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/resistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResistance:")
    public native void setResistance(@NFloat double value);

    /**
     * charge</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/charge">iOS Dev Center</a>
     */
    @Generated
    @Selector("charge")
    @NFloat
    public native double charge();

    /**
     * anchored</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/anchored">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAnchored")
    public native boolean isAnchored();

    /**
     * anchored</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/anchored">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnchored:")
    public native void setAnchored(boolean value);

    /**
     * charge</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItemBehavior_Class/index.html#//apple_ref/occ/instp/UIDynamicItemBehavior/charge">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCharge:")
    public native void setCharge(@NFloat double value);
}
