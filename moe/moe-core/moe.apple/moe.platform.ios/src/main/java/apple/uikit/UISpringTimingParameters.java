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
import apple.uikit.protocol.UITimingCurveProvider;
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
import apple.corefoundation.struct.CGVector;

/**
 * API-Since: 10.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISpringTimingParameters extends NSObject implements UITimingCurveProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected UISpringTimingParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISpringTimingParameters alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISpringTimingParameters allocWithZone(VoidPtr zone);

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
    public static native UISpringTimingParameters new_objc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("cubicTimingParameters")
    public native UICubicTimingParameters cubicTimingParameters();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Initializes with the default system spring parameters
     */
    @Generated
    @Selector("init")
    public native UISpringTimingParameters init();

    @Generated
    @Selector("initWithCoder:")
    public native UISpringTimingParameters initWithCoder(NSCoder coder);

    /**
     * Equivalent to initWithDampingRatio:initialVelocity: where the velocity is the zero-vector.
     */
    @Generated
    @Selector("initWithDampingRatio:")
    public native UISpringTimingParameters initWithDampingRatio(@NFloat double ratio);

    /**
     * Performs `animations` using a timing curve described by the motion of a
     * spring. When `dampingRatio` is 1, the animation will smoothly decelerate to
     * its final model values without oscillating. Damping ratios less than 1 will
     * oscillate more and more before coming to a complete stop. You can use the
     * initial spring velocity to specify how fast the object at the end of the
     * simulated spring was moving before it was attached. It's a unit coordinate
     * system, where 1 is defined as traveling the total animation distance in a
     * second. So if you're changing an object's position by 200pt in this
     * animation, and you want the animation to behave as if the object was moving
     * at 100pt/s before the animation started, you'd pass 0.5. You'll typically
     * want to pass 0 for the velocity. Velocity is specified as a vector for the
     * convenience of animating position changes. For 1-dimensional properties
     * the x-coordinate of the velocity vector is used.
     */
    @Generated
    @Selector("initWithDampingRatio:initialVelocity:")
    public native UISpringTimingParameters initWithDampingRatioInitialVelocity(@NFloat double ratio,
            @ByValue CGVector velocity);

    /**
     * Similar to initWithDampingRatio:initialVelocity: except this allows you to specify the spring constants for the
     * underlying
     * CASpringAnimation directly. The duration is computed assuming a small settling oscillation.
     */
    @Generated
    @Selector("initWithMass:stiffness:damping:initialVelocity:")
    public native UISpringTimingParameters initWithMassStiffnessDampingInitialVelocity(@NFloat double mass,
            @NFloat double stiffness, @NFloat double damping, @ByValue CGVector velocity);

    @Generated
    @Selector("initialVelocity")
    @ByValue
    public native CGVector initialVelocity();

    @Generated
    @Selector("springTimingParameters")
    public native UISpringTimingParameters springTimingParameters();

    @Generated
    @Selector("timingCurveType")
    @NInt
    public native long timingCurveType();
}
