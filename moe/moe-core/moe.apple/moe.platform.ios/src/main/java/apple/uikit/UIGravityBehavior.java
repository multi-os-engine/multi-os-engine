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
import apple.coregraphics.struct.CGVector;
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
public class UIGravityBehavior extends UIDynamicBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected UIGravityBehavior(Pointer peer) {
        super(peer);
    }

    /**
     * addItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instm/UIGravityBehavior/addItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addItem:")
    public native void addItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIGravityBehavior alloc();

    /**
     * angle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instp/UIGravityBehavior/angle">iOS Dev Center</a>
     */
    @Generated
    @Selector("angle")
    @NFloat
    public native double angle();

    /**
     * gravityDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instp/UIGravityBehavior/gravityDirection">iOS Dev Center</a>
     */
    @Generated
    @Selector("gravityDirection")
    @ByValue
    public native CGVector gravityDirection();

    @Generated
    @Selector("init")
    public native UIGravityBehavior init();

    /**
     * initWithItems:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instm/UIGravityBehavior/initWithItems:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithItems:")
    public native UIGravityBehavior initWithItems(NSArray<?> items);

    /**
     * items</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instp/UIGravityBehavior/items">iOS Dev Center</a>
     */
    @Generated
    @Selector("items")
    public native NSArray<?> items();

    /**
     * magnitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instp/UIGravityBehavior/magnitude">iOS Dev Center</a>
     */
    @Generated
    @Selector("magnitude")
    @NFloat
    public native double magnitude();

    /**
     * removeItem:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instm/UIGravityBehavior/removeItem:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeItem:")
    public native void removeItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * angle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instp/UIGravityBehavior/angle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAngle:")
    public native void setAngle(@NFloat double value);

    /**
     * setAngle:magnitude:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instm/UIGravityBehavior/setAngle:magnitude:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAngle:magnitude:")
    public native void setAngleMagnitude(@NFloat double angle, @NFloat double magnitude);

    /**
     * gravityDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instp/UIGravityBehavior/gravityDirection">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGravityDirection:")
    public native void setGravityDirection(@ByValue CGVector value);

    /**
     * magnitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGravityBehavior_Class/index.html#//apple_ref/occ/instp/UIGravityBehavior/magnitude">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMagnitude:")
    public native void setMagnitude(@NFloat double value);

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
