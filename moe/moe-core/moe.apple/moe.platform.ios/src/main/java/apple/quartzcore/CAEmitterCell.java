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
import apple.coregraphics.opaque.CGColorRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.quartzcore.protocol.CAMediaTiming;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 5.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAEmitterCell extends NSObject implements NSSecureCoding, CAMediaTiming {
    static {
        NatJ.register();
    }

    @Generated
    protected CAEmitterCell(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAEmitterCell alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CAEmitterCell allocWithZone(VoidPtr zone);

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

    /**
     * Emitter cells implement the same property model as defined by CALayer.
     * See CALayer.h for more details.
     */
    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("emitterCell")
    public static native CAEmitterCell emitterCell();

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
    public static native CAEmitterCell new_objc();

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
    @Selector("alphaRange")
    public native float alphaRange();

    @Generated
    @Selector("alphaSpeed")
    public native float alphaSpeed();

    @Generated
    @Selector("autoreverses")
    public native boolean autoreverses();

    @Generated
    @Selector("beginTime")
    public native double beginTime();

    /**
     * The number of emitted objects created every second. Default value is
     * zero. Animatable.
     */
    @Generated
    @Selector("birthRate")
    public native float birthRate();

    @Generated
    @Selector("blueRange")
    public native float blueRange();

    @Generated
    @Selector("blueSpeed")
    public native float blueSpeed();

    /**
     * The mean color of each emitted object, and the range from that mean
     * color. `color' defaults to opaque white, `colorRange' to (0, 0, 0,
     * 0). Animatable.
     */
    @Nullable
    @Generated
    @Selector("color")
    public native CGColorRef color();

    /**
     * The cell contents, typically a CGImageRef. Defaults to nil.
     * Animatable.
     */
    @Nullable
    @Generated
    @Selector("contents")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contents();

    /**
     * The sub-rectangle of the contents image that will be drawn. See
     * CALayer.h for more details. Defaults to the unit rectangle [0 0 1 1].
     * Animatable.
     */
    @Generated
    @Selector("contentsRect")
    @ByValue
    public native CGRect contentsRect();

    /**
     * Defines the scale factor applied to the contents of the cell. See
     * CALayer.h for more details.
     */
    @Generated
    @Selector("contentsScale")
    @NFloat
    public native double contentsScale();

    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * The orientation of the emission angle in radians, relative to the
     * natural orientation angle of the emission shape. Note that latitude
     * here is what is typically called colatitude, the zenith or phi, the
     * angle from the z-axis. Similarly longitude is the angle in the
     * xy-plane from the x-axis, often referred to as the azimuth or
     * theta. Both values default to zero, which translates to no change
     * relative to the emission shape's direction. Both values are
     * animatable.
     */
    @Generated
    @Selector("emissionLatitude")
    @NFloat
    public native double emissionLatitude();

    @Generated
    @Selector("emissionLongitude")
    @NFloat
    public native double emissionLongitude();

    /**
     * An angle (in radians) defining a cone around the emission angle.
     * Emitted objects are uniformly distributed across this cone. Defaults
     * to zero. Animatable.
     */
    @Generated
    @Selector("emissionRange")
    @NFloat
    public native double emissionRange();

    /**
     * An array containing the sub-cells of this cell, or nil (the default
     * value). When non-nil each particle emitted by the cell will act as
     * an emitter for each of the cell's sub-cells. The emission point is
     * the current particle position and the emission angle is relative to
     * the current direction of the particle. Animatable.
     */
    @Nullable
    @Generated
    @Selector("emitterCells")
    public native NSArray<? extends CAEmitterCell> emitterCells();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Generated
    @Selector("fillMode")
    public native String fillMode();

    @Generated
    @Selector("greenRange")
    public native float greenRange();

    @Generated
    @Selector("greenSpeed")
    public native float greenSpeed();

    @Generated
    @Selector("init")
    public native CAEmitterCell init();

    @Generated
    @Selector("initWithCoder:")
    public native CAEmitterCell initWithCoder(@NotNull NSCoder coder);

    /**
     * Controls whether or not cells from this emitter are rendered.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * Controls whether or not cells from this emitter are rendered.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * The lifetime of each emitted object in seconds, specified as a mean
     * value and a range about the mean. Both values default to zero.
     * Animatable.
     */
    @Generated
    @Selector("lifetime")
    public native float lifetime();

    @Generated
    @Selector("lifetimeRange")
    public native float lifetimeRange();

    @NotNull
    @Generated
    @Selector("magnificationFilter")
    public native String magnificationFilter();

    /**
     * The filter parameters used when rendering the `contents' image. See
     * CALayer.h for more details.
     */
    @NotNull
    @Generated
    @Selector("minificationFilter")
    public native String minificationFilter();

    @Generated
    @Selector("minificationFilterBias")
    public native float minificationFilterBias();

    /**
     * The name of the cell. Used to construct key paths. Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("redRange")
    public native float redRange();

    /**
     * The speed at which color components of emitted objects change over
     * their lifetime, defined as the rate of change per second. Defaults
     * to (0, 0, 0, 0). Animatable.
     */
    @Generated
    @Selector("redSpeed")
    public native float redSpeed();

    @Generated
    @Selector("repeatCount")
    public native float repeatCount();

    @Generated
    @Selector("repeatDuration")
    public native double repeatDuration();

    /**
     * The scale factor applied to each emitted object, defined as mean and
     * range about the mean. Scale defaults to one, range to zero.
     * Animatable.
     */
    @Generated
    @Selector("scale")
    @NFloat
    public native double scale();

    @Generated
    @Selector("scaleRange")
    @NFloat
    public native double scaleRange();

    @Generated
    @Selector("scaleSpeed")
    @NFloat
    public native double scaleSpeed();

    @Generated
    @Selector("setAlphaRange:")
    public native void setAlphaRange(float value);

    @Generated
    @Selector("setAlphaSpeed:")
    public native void setAlphaSpeed(float value);

    @Generated
    @Selector("setAutoreverses:")
    public native void setAutoreverses(boolean value);

    @Generated
    @Selector("setBeginTime:")
    public native void setBeginTime(double value);

    /**
     * The number of emitted objects created every second. Default value is
     * zero. Animatable.
     */
    @Generated
    @Selector("setBirthRate:")
    public native void setBirthRate(float value);

    @Generated
    @Selector("setBlueRange:")
    public native void setBlueRange(float value);

    @Generated
    @Selector("setBlueSpeed:")
    public native void setBlueSpeed(float value);

    /**
     * The mean color of each emitted object, and the range from that mean
     * color. `color' defaults to opaque white, `colorRange' to (0, 0, 0,
     * 0). Animatable.
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(@Nullable CGColorRef value);

    /**
     * The cell contents, typically a CGImageRef. Defaults to nil.
     * Animatable.
     */
    @Generated
    @Selector("setContents:")
    public native void setContents(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * The sub-rectangle of the contents image that will be drawn. See
     * CALayer.h for more details. Defaults to the unit rectangle [0 0 1 1].
     * Animatable.
     */
    @Generated
    @Selector("setContentsRect:")
    public native void setContentsRect(@ByValue CGRect value);

    /**
     * Defines the scale factor applied to the contents of the cell. See
     * CALayer.h for more details.
     */
    @Generated
    @Selector("setContentsScale:")
    public native void setContentsScale(@NFloat double value);

    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * The orientation of the emission angle in radians, relative to the
     * natural orientation angle of the emission shape. Note that latitude
     * here is what is typically called colatitude, the zenith or phi, the
     * angle from the z-axis. Similarly longitude is the angle in the
     * xy-plane from the x-axis, often referred to as the azimuth or
     * theta. Both values default to zero, which translates to no change
     * relative to the emission shape's direction. Both values are
     * animatable.
     */
    @Generated
    @Selector("setEmissionLatitude:")
    public native void setEmissionLatitude(@NFloat double value);

    @Generated
    @Selector("setEmissionLongitude:")
    public native void setEmissionLongitude(@NFloat double value);

    /**
     * An angle (in radians) defining a cone around the emission angle.
     * Emitted objects are uniformly distributed across this cone. Defaults
     * to zero. Animatable.
     */
    @Generated
    @Selector("setEmissionRange:")
    public native void setEmissionRange(@NFloat double value);

    /**
     * An array containing the sub-cells of this cell, or nil (the default
     * value). When non-nil each particle emitted by the cell will act as
     * an emitter for each of the cell's sub-cells. The emission point is
     * the current particle position and the emission angle is relative to
     * the current direction of the particle. Animatable.
     */
    @Generated
    @Selector("setEmitterCells:")
    public native void setEmitterCells(@Nullable NSArray<? extends CAEmitterCell> value);

    @Generated
    @Selector("setFillMode:")
    public native void setFillMode(@NotNull String value);

    @Generated
    @Selector("setGreenRange:")
    public native void setGreenRange(float value);

    @Generated
    @Selector("setGreenSpeed:")
    public native void setGreenSpeed(float value);

    /**
     * The lifetime of each emitted object in seconds, specified as a mean
     * value and a range about the mean. Both values default to zero.
     * Animatable.
     */
    @Generated
    @Selector("setLifetime:")
    public native void setLifetime(float value);

    @Generated
    @Selector("setLifetimeRange:")
    public native void setLifetimeRange(float value);

    @Generated
    @Selector("setMagnificationFilter:")
    public native void setMagnificationFilter(@NotNull String value);

    /**
     * The filter parameters used when rendering the `contents' image. See
     * CALayer.h for more details.
     */
    @Generated
    @Selector("setMinificationFilter:")
    public native void setMinificationFilter(@NotNull String value);

    @Generated
    @Selector("setMinificationFilterBias:")
    public native void setMinificationFilterBias(float value);

    /**
     * The name of the cell. Used to construct key paths. Defaults to nil.
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    @Generated
    @Selector("setRedRange:")
    public native void setRedRange(float value);

    /**
     * The speed at which color components of emitted objects change over
     * their lifetime, defined as the rate of change per second. Defaults
     * to (0, 0, 0, 0). Animatable.
     */
    @Generated
    @Selector("setRedSpeed:")
    public native void setRedSpeed(float value);

    @Generated
    @Selector("setRepeatCount:")
    public native void setRepeatCount(float value);

    @Generated
    @Selector("setRepeatDuration:")
    public native void setRepeatDuration(double value);

    /**
     * The scale factor applied to each emitted object, defined as mean and
     * range about the mean. Scale defaults to one, range to zero.
     * Animatable.
     */
    @Generated
    @Selector("setScale:")
    public native void setScale(@NFloat double value);

    @Generated
    @Selector("setScaleRange:")
    public native void setScaleRange(@NFloat double value);

    @Generated
    @Selector("setScaleSpeed:")
    public native void setScaleSpeed(@NFloat double value);

    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(float value);

    /**
     * The rotation speed applied to each emitted object, defined as mean
     * and range about the mean. Defaults to zero. Animatable.
     */
    @Generated
    @Selector("setSpin:")
    public native void setSpin(@NFloat double value);

    @Generated
    @Selector("setSpinRange:")
    public native void setSpinRange(@NFloat double value);

    /**
     * Inherited attributes similar to in layers.
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@Nullable NSDictionary<?, ?> value);

    @Generated
    @Selector("setTimeOffset:")
    public native void setTimeOffset(double value);

    /**
     * The initial mean velocity of each emitted object, and its range. Both
     * values default to zero. Animatable.
     */
    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(@NFloat double value);

    @Generated
    @Selector("setVelocityRange:")
    public native void setVelocityRange(@NFloat double value);

    /**
     * The acceleration vector applied to emitted objects. Defaults to
     * (0, 0, 0). Animatable.
     */
    @Generated
    @Selector("setXAcceleration:")
    public native void setXAcceleration(@NFloat double value);

    @Generated
    @Selector("setYAcceleration:")
    public native void setYAcceleration(@NFloat double value);

    @Generated
    @Selector("setZAcceleration:")
    public native void setZAcceleration(@NFloat double value);

    @Generated
    @Selector("shouldArchiveValueForKey:")
    public native boolean shouldArchiveValueForKey(@NotNull String key);

    @Generated
    @Selector("speed")
    public native float speed();

    /**
     * The rotation speed applied to each emitted object, defined as mean
     * and range about the mean. Defaults to zero. Animatable.
     */
    @Generated
    @Selector("spin")
    @NFloat
    public native double spin();

    @Generated
    @Selector("spinRange")
    @NFloat
    public native double spinRange();

    /**
     * Inherited attributes similar to in layers.
     */
    @Nullable
    @Generated
    @Selector("style")
    public native NSDictionary<?, ?> style();

    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    /**
     * The initial mean velocity of each emitted object, and its range. Both
     * values default to zero. Animatable.
     */
    @Generated
    @Selector("velocity")
    @NFloat
    public native double velocity();

    @Generated
    @Selector("velocityRange")
    @NFloat
    public native double velocityRange();

    /**
     * The acceleration vector applied to emitted objects. Defaults to
     * (0, 0, 0). Animatable.
     */
    @Generated
    @Selector("xAcceleration")
    @NFloat
    public native double xAcceleration();

    @Generated
    @Selector("yAcceleration")
    @NFloat
    public native double yAcceleration();

    @Generated
    @Selector("zAcceleration")
    @NFloat
    public native double zAcceleration();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
