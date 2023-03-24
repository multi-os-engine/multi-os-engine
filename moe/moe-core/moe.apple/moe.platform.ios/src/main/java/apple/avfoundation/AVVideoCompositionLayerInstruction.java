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

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVVideoCompositionLayerInstruction extends NSObject implements NSSecureCoding, NSCopying,
        NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVVideoCompositionLayerInstruction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVVideoCompositionLayerInstruction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVVideoCompositionLayerInstruction allocWithZone(VoidPtr zone);

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
    public static native AVVideoCompositionLayerInstruction new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * getCropRectangleRampForTime:startCropRectangle:endCropRectangle:timeRange:
     * 
     * Obtains the crop rectangle ramp that includes the specified time.
     * 
     * @param time
     *                           If a ramp with a timeRange that contains the specified time has been set, information
     *                           about the effective ramp for that time is supplied.
     *                           Otherwise, information about the first ramp that starts after the specified time is
     *                           supplied.
     * @param startCropRectangle
     *                           A pointer to a CGRect to receive the starting crop rectangle value for the crop
     *                           rectangle ramp. May be NULL.
     * @param endCropRecrangle
     *                           A pointer to a CGRect to receive the ending crop rectangle value for the crop rectangle
     *                           ramp. May be NULL.
     * @param timeRange
     *                           A pointer to a CMTimeRange to receive the timeRange of the crop rectangle ramp. May be
     *                           NULL.
     * @return
     *         An indication of success. NO will be returned if the specified time is beyond the duration of the last
     *         crop rectangle ramp that has been set.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @Selector("getCropRectangleRampForTime:startCropRectangle:endCropRectangle:timeRange:")
    public native boolean getCropRectangleRampForTimeStartCropRectangleEndCropRectangleTimeRange(@ByValue CMTime time,
            @Nullable CGRect startCropRectangle, @Nullable CGRect endCropRectangle, @Nullable CMTimeRange timeRange);

    /**
     * getOpacityRampForTime:startOpacity:endOpacity:timeRange:
     * 
     * Obtains the opacity ramp that includes the specified time.
     * 
     * @param time
     *                     If a ramp with a timeRange that contains the specified time has been set, information about
     *                     the effective ramp for that time is supplied.
     *                     Otherwise, information about the first ramp that starts after the specified time is supplied.
     * @param startOpacity
     *                     A pointer to a float to receive the starting opacity value for the opacity ramp. May be NULL.
     * @param endOpacity
     *                     A pointer to a float to receive the ending opacity value for the opacity ramp. May be NULL.
     * @param timeRange
     *                     A pointer to a CMTimeRange to receive the timeRange of the opacity ramp. May be NULL.
     * @return
     *         An indication of success. NO will be returned if the specified time is beyond the duration of the last
     *         opacity ramp that has been set.
     */
    @Generated
    @Selector("getOpacityRampForTime:startOpacity:endOpacity:timeRange:")
    public native boolean getOpacityRampForTimeStartOpacityEndOpacityTimeRange(@ByValue CMTime time,
            @Nullable FloatPtr startOpacity, @Nullable FloatPtr endOpacity, @Nullable CMTimeRange timeRange);

    /**
     * getTransformRampForTime:startTransform:endTransform:timeRange:
     * 
     * Obtains the transform ramp that includes the specified time.
     * 
     * @param time
     *                       If a ramp with a timeRange that contains the specified time has been set, information about
     *                       the effective ramp for that time is supplied.
     *                       Otherwise, information about the first ramp that starts after the specified time is
     *                       supplied.
     * @param startTransform
     *                       A pointer to a float to receive the starting transform value for the transform ramp. May be
     *                       NULL.
     * @param endTransform
     *                       A pointer to a float to receive the ending transform value for the transform ramp. May be
     *                       NULL.
     * @param timeRange
     *                       A pointer to a CMTimeRange to receive the timeRange of the transform ramp. May be NULL.
     * @return
     *         An indication of success. NO will be returned if the specified time is beyond the duration of the last
     *         transform ramp that has been set.
     */
    @Generated
    @Selector("getTransformRampForTime:startTransform:endTransform:timeRange:")
    public native boolean getTransformRampForTimeStartTransformEndTransformTimeRange(@ByValue CMTime time,
            @Nullable CGAffineTransform startTransform, @Nullable CGAffineTransform endTransform,
            @Nullable CMTimeRange timeRange);

    @Generated
    @Selector("init")
    public native AVVideoCompositionLayerInstruction init();

    @Generated
    @Selector("initWithCoder:")
    public native AVVideoCompositionLayerInstruction initWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Indicates the trackID of the source track to which the compositor will apply the instruction.
     */
    @Generated
    @Selector("trackID")
    public native int trackID();
}
