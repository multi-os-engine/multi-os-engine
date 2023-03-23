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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIEvent extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIEvent allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("new")
    public static native UIEvent new_objc();

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

    @Generated
    @Selector("allTouches")
    public native NSSet<? extends UITouch> allTouches();

    /**
     * An array of auxiliary UITouch’s for the touch events that did not get delivered for a given main touch. This also
     * includes an auxiliary version of the main touch itself.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("coalescedTouchesForTouch:")
    public native NSArray<? extends UITouch> coalescedTouchesForTouch(UITouch touch);

    @Generated
    @Selector("init")
    public native UIEvent init();

    /**
     * An array of auxiliary UITouch’s for touch events that are predicted to occur for a given main touch. These
     * predictions may not exactly match the real behavior of the touch as it moves, so they should be interpreted as an
     * estimate.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("predictedTouchesForTouch:")
    public native NSArray<? extends UITouch> predictedTouchesForTouch(UITouch touch);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("subtype")
    @NInt
    public native long subtype();

    @Generated
    @Selector("timestamp")
    public native double timestamp();

    /**
     * API-Since: 3.2
     */
    @Generated
    @Selector("touchesForGestureRecognizer:")
    public native NSSet<? extends UITouch> touchesForGestureRecognizer(UIGestureRecognizer gesture);

    @Generated
    @Selector("touchesForView:")
    public native NSSet<? extends UITouch> touchesForView(UIView view);

    @Generated
    @Selector("touchesForWindow:")
    public native NSSet<? extends UITouch> touchesForWindow(UIWindow window);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    /**
     * API-Since: 13.4
     */
    @Generated
    @Selector("buttonMask")
    @NInt
    public native long buttonMask();

    /**
     * API-Since: 13.4
     */
    @Generated
    @Selector("modifierFlags")
    @NInt
    public native long modifierFlags();
}
