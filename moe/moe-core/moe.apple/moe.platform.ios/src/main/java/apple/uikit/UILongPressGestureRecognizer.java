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
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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

/**
 * Begins:  when numberOfTouchesRequired have tapped numberOfTapsRequired times and been held for minumPressDuration
 * Changes: when a finger moves
 * Ends:    when a finger is lifted
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UILongPressGestureRecognizer extends UIGestureRecognizer {
    static {
        NatJ.register();
    }

    @Generated
    protected UILongPressGestureRecognizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UILongPressGestureRecognizer alloc();

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
     * Default is 10. Maximum movement in pixels allowed before the gesture fails. Once recognized (after minimumPressDuration) there is no limit on finger movement for the remainder of the touch tracking
     */
    @Generated
    @Selector("allowableMovement")
    @NFloat
    public native double allowableMovement();

    @Generated
    @Selector("init")
    public native UILongPressGestureRecognizer init();

    @Generated
    @Selector("initWithTarget:action:")
    public native UILongPressGestureRecognizer initWithTargetAction(@Mapped(ObjCObjectMapper.class) Object target,
            SEL action);

    /**
     * Default is 0.5. Time in seconds the fingers must be held down for the gesture to be recognized
     */
    @Generated
    @Selector("minimumPressDuration")
    public native double minimumPressDuration();

    /**
     * Default is 0. The number of full taps required before the press for gesture to be recognized
     */
    @Generated
    @Selector("numberOfTapsRequired")
    @NUInt
    public native long numberOfTapsRequired();

    /**
     * Default is 1. Number of fingers that must be held down for the gesture to be recognized
     */
    @Generated
    @Selector("numberOfTouchesRequired")
    @NUInt
    public native long numberOfTouchesRequired();

    /**
     * Default is 10. Maximum movement in pixels allowed before the gesture fails. Once recognized (after minimumPressDuration) there is no limit on finger movement for the remainder of the touch tracking
     */
    @Generated
    @Selector("setAllowableMovement:")
    public native void setAllowableMovement(@NFloat double value);

    /**
     * Default is 0.5. Time in seconds the fingers must be held down for the gesture to be recognized
     */
    @Generated
    @Selector("setMinimumPressDuration:")
    public native void setMinimumPressDuration(double value);

    /**
     * Default is 0. The number of full taps required before the press for gesture to be recognized
     */
    @Generated
    @Selector("setNumberOfTapsRequired:")
    public native void setNumberOfTapsRequired(@NUInt long value);

    /**
     * Default is 1. Number of fingers that must be held down for the gesture to be recognized
     */
    @Generated
    @Selector("setNumberOfTouchesRequired:")
    public native void setNumberOfTouchesRequired(@NUInt long value);

    @Generated
    @Selector("initWithCoder:")
    public native UILongPressGestureRecognizer initWithCoder(NSCoder coder);
}
