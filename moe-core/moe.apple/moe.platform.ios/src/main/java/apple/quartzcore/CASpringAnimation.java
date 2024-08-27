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

package apple.quartzcore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.scenekit.SCNAnimation;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Subclass for mass-spring animations.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CASpringAnimation extends CABasicAnimation {
    static {
        NatJ.register();
    }

    @Generated
    protected CASpringAnimation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CASpringAnimation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CASpringAnimation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animation")
    public static native CASpringAnimation animation();

    @Generated
    @Selector("animationWithKeyPath:")
    public static native CASpringAnimation animationWithKeyPath(@Nullable String path);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CASpringAnimation new_objc();

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
     * The damping coefficient. Must be greater than or equal to 0.
     * Defaults to 10.
     */
    @Generated
    @Selector("damping")
    @NFloat
    public native double damping();

    @Generated
    @Selector("init")
    public native CASpringAnimation init();

    @Generated
    @Selector("initWithCoder:")
    public native CASpringAnimation initWithCoder(@NotNull NSCoder coder);

    /**
     * The initial velocity of the object attached to the spring. Defaults
     * to zero, which represents an unmoving object. Negative values
     * represent the object moving away from the spring attachment point,
     * positive values represent the object moving towards the spring
     * attachment point.
     */
    @Generated
    @Selector("initialVelocity")
    @NFloat
    public native double initialVelocity();

    /**
     * The mass of the object attached to the end of the spring. Must be greater
     * than 0. Defaults to one.
     */
    @Generated
    @Selector("mass")
    @NFloat
    public native double mass();

    /**
     * The damping coefficient. Must be greater than or equal to 0.
     * Defaults to 10.
     */
    @Generated
    @Selector("setDamping:")
    public native void setDamping(@NFloat double value);

    /**
     * The initial velocity of the object attached to the spring. Defaults
     * to zero, which represents an unmoving object. Negative values
     * represent the object moving away from the spring attachment point,
     * positive values represent the object moving towards the spring
     * attachment point.
     */
    @Generated
    @Selector("setInitialVelocity:")
    public native void setInitialVelocity(@NFloat double value);

    /**
     * The mass of the object attached to the end of the spring. Must be greater
     * than 0. Defaults to one.
     */
    @Generated
    @Selector("setMass:")
    public native void setMass(@NFloat double value);

    /**
     * The spring stiffness coefficient. Must be greater than 0.
     * Defaults to 100.
     */
    @Generated
    @Selector("setStiffness:")
    public native void setStiffness(@NFloat double value);

    /**
     * Returns the estimated duration required for the spring system to be
     * considered at rest. The duration is evaluated for the current animation
     * parameters.
     */
    @Generated
    @Selector("settlingDuration")
    public native double settlingDuration();

    /**
     * The spring stiffness coefficient. Must be greater than 0.
     * Defaults to 100.
     */
    @Generated
    @Selector("stiffness")
    @NFloat
    public native double stiffness();

    @NotNull
    @Generated
    @Selector("animationWithSCNAnimation:")
    public static native CAAnimation animationWithSCNAnimation(@NotNull SCNAnimation animation);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Whether true overdamping is allowed (otherwise it is treated as critically
     * damped). Defaults to false.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("allowsOverdamping")
    public native boolean allowsOverdamping();

    /**
     * How bouncy the spring is. A value of 0 indicates no bounces (a critically
     * damped spring), positive values indicate increasing amounts of bounce (with
     * typical values being between 0.0 and 1.0), and negative values indicate
     * overdamped springs (with typical values being between 0.0 and -1.0).
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("bounce")
    @NFloat
    public native double bounce();

    /**
     * Creates a spring animation with coefficients computed from the specified
     * perceptual duration and bounce. A spring animation created with this
     * initializer will have allowsOverdamping set to true (so will use overdamping
     * when a negative bounce is specified).
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithPerceptualDuration:bounce:")
    public native CASpringAnimation initWithPerceptualDurationBounce(double perceptualDuration, @NFloat double bounce);

    /**
     * The perceptual duration, which defines the pace of the spring.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("perceptualDuration")
    public native double perceptualDuration();

    /**
     * Whether true overdamping is allowed (otherwise it is treated as critically
     * damped). Defaults to false.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setAllowsOverdamping:")
    public native void setAllowsOverdamping(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
