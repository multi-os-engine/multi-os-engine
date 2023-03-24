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

package apple.spritekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKKeyframeSequence extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected SKKeyframeSequence(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKKeyframeSequence alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKKeyframeSequence allocWithZone(VoidPtr zone);

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
    public static native SKKeyframeSequence new_objc();

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
    @Selector("addKeyframeValue:time:")
    public native void addKeyframeValueTime(@NotNull @Mapped(ObjCObjectMapper.class) Object value, @NFloat double time);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("getKeyframeTimeForIndex:")
    @NFloat
    public native double getKeyframeTimeForIndex(@NUInt long index);

    @NotNull
    @Generated
    @Selector("getKeyframeValueForIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object getKeyframeValueForIndex(@NUInt long index);

    @Generated
    @Selector("init")
    public native SKKeyframeSequence init();

    @Generated
    @Selector("initWithCapacity:")
    public native SKKeyframeSequence initWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("initWithCoder:")
    public native SKKeyframeSequence initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * Designated initializer
     */
    @Generated
    @Selector("initWithKeyframeValues:times:")
    public native SKKeyframeSequence initWithKeyframeValuesTimes(@NotNull NSArray<?> values,
            @NotNull NSArray<? extends NSNumber> times);

    /**
     * defaults to SKInterpolationModeLinear
     */
    @Generated
    @Selector("interpolationMode")
    @NInt
    public native long interpolationMode();

    @Generated
    @Selector("removeKeyframeAtIndex:")
    public native void removeKeyframeAtIndex(@NUInt long index);

    @Generated
    @Selector("removeLastKeyframe")
    public native void removeLastKeyframe();

    /**
     * defaults to SKRepeatModeClamp
     */
    @Generated
    @Selector("repeatMode")
    @NInt
    public native long repeatMode();

    @Nullable
    @Generated
    @Selector("sampleAtTime:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object sampleAtTime(@NFloat double time);

    /**
     * defaults to SKInterpolationModeLinear
     */
    @Generated
    @Selector("setInterpolationMode:")
    public native void setInterpolationMode(@NInt long value);

    @Generated
    @Selector("setKeyframeTime:forIndex:")
    public native void setKeyframeTimeForIndex(@NFloat double time, @NUInt long index);

    @Generated
    @Selector("setKeyframeValue:forIndex:")
    public native void setKeyframeValueForIndex(@NotNull @Mapped(ObjCObjectMapper.class) Object value,
            @NUInt long index);

    @Generated
    @Selector("setKeyframeValue:time:forIndex:")
    public native void setKeyframeValueTimeForIndex(@NotNull @Mapped(ObjCObjectMapper.class) Object value,
            @NFloat double time, @NUInt long index);

    /**
     * defaults to SKRepeatModeClamp
     */
    @Generated
    @Selector("setRepeatMode:")
    public native void setRepeatMode(@NInt long value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
