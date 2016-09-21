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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAEmitterCell extends NSObject implements NSCoding, CAMediaTiming {
    static {
        NatJ.register();
    }

    @Generated
    protected CAEmitterCell(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAEmitterCell alloc();

    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(String key);

    @Generated
    @Selector("emitterCell")
    public static native CAEmitterCell emitterCell();

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

    @Generated
    @Selector("birthRate")
    public native float birthRate();

    @Generated
    @Selector("blueRange")
    public native float blueRange();

    @Generated
    @Selector("blueSpeed")
    public native float blueSpeed();

    @Generated
    @Selector("color")
    public native CGColorRef color();

    @Generated
    @Selector("contents")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contents();

    @Generated
    @Selector("contentsRect")
    @ByValue
    public native CGRect contentsRect();

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("emissionLatitude")
    @NFloat
    public native double emissionLatitude();

    @Generated
    @Selector("emissionLongitude")
    @NFloat
    public native double emissionLongitude();

    @Generated
    @Selector("emissionRange")
    @NFloat
    public native double emissionRange();

    @Generated
    @Selector("emitterCells")
    public native NSArray<? extends CAEmitterCell> emitterCells();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

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
    public native CAEmitterCell initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    @Generated
    @Selector("lifetime")
    public native float lifetime();

    @Generated
    @Selector("lifetimeRange")
    public native float lifetimeRange();

    @Generated
    @Selector("magnificationFilter")
    public native String magnificationFilter();

    @Generated
    @Selector("minificationFilter")
    public native String minificationFilter();

    @Generated
    @Selector("minificationFilterBias")
    public native float minificationFilterBias();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("redRange")
    public native float redRange();

    @Generated
    @Selector("redSpeed")
    public native float redSpeed();

    @Generated
    @Selector("repeatCount")
    public native float repeatCount();

    @Generated
    @Selector("repeatDuration")
    public native double repeatDuration();

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

    @Generated
    @Selector("setBirthRate:")
    public native void setBirthRate(float value);

    @Generated
    @Selector("setBlueRange:")
    public native void setBlueRange(float value);

    @Generated
    @Selector("setBlueSpeed:")
    public native void setBlueSpeed(float value);

    @Generated
    @Selector("setColor:")
    public native void setColor(CGColorRef value);

    @Generated
    @Selector("setContents:")
    public native void setContents(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setContentsRect:")
    public native void setContentsRect(@ByValue CGRect value);

    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    @Generated
    @Selector("setEmissionLatitude:")
    public native void setEmissionLatitude(@NFloat double value);

    @Generated
    @Selector("setEmissionLongitude:")
    public native void setEmissionLongitude(@NFloat double value);

    @Generated
    @Selector("setEmissionRange:")
    public native void setEmissionRange(@NFloat double value);

    @Generated
    @Selector("setEmitterCells:")
    public native void setEmitterCells(NSArray<? extends CAEmitterCell> value);

    @Generated
    @Selector("setFillMode:")
    public native void setFillMode(String value);

    @Generated
    @Selector("setGreenRange:")
    public native void setGreenRange(float value);

    @Generated
    @Selector("setGreenSpeed:")
    public native void setGreenSpeed(float value);

    @Generated
    @Selector("setLifetime:")
    public native void setLifetime(float value);

    @Generated
    @Selector("setLifetimeRange:")
    public native void setLifetimeRange(float value);

    @Generated
    @Selector("setMagnificationFilter:")
    public native void setMagnificationFilter(String value);

    @Generated
    @Selector("setMinificationFilter:")
    public native void setMinificationFilter(String value);

    @Generated
    @Selector("setMinificationFilterBias:")
    public native void setMinificationFilterBias(float value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setRedRange:")
    public native void setRedRange(float value);

    @Generated
    @Selector("setRedSpeed:")
    public native void setRedSpeed(float value);

    @Generated
    @Selector("setRepeatCount:")
    public native void setRepeatCount(float value);

    @Generated
    @Selector("setRepeatDuration:")
    public native void setRepeatDuration(double value);

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

    @Generated
    @Selector("setSpin:")
    public native void setSpin(@NFloat double value);

    @Generated
    @Selector("setSpinRange:")
    public native void setSpinRange(@NFloat double value);

    @Generated
    @Selector("setStyle:")
    public native void setStyle(NSDictionary<?, ?> value);

    @Generated
    @Selector("setTimeOffset:")
    public native void setTimeOffset(double value);

    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(@NFloat double value);

    @Generated
    @Selector("setVelocityRange:")
    public native void setVelocityRange(@NFloat double value);

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
    public native boolean shouldArchiveValueForKey(String key);

    @Generated
    @Selector("speed")
    public native float speed();

    @Generated
    @Selector("spin")
    @NFloat
    public native double spin();

    @Generated
    @Selector("spinRange")
    @NFloat
    public native double spinRange();

    @Generated
    @Selector("style")
    public native NSDictionary<?, ?> style();

    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    @Generated
    @Selector("velocity")
    @NFloat
    public native double velocity();

    @Generated
    @Selector("velocityRange")
    @NFloat
    public native double velocityRange();

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
    @Selector("contentsScale")
    @NFloat
    public native double contentsScale();

    @Generated
    @Selector("setContentsScale:")
    public native void setContentsScale(@NFloat double value);
}
