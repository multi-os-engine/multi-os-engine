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
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
public class AVMutableVideoCompositionLayerInstruction extends AVVideoCompositionLayerInstruction {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableVideoCompositionLayerInstruction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableVideoCompositionLayerInstruction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMutableVideoCompositionLayerInstruction allocWithZone(VoidPtr zone);

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
    public static native AVMutableVideoCompositionLayerInstruction new_objc();

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

    /**
     * videoCompositionLayerInstruction
     * 
     * Returns a new instance of AVMutableVideoCompositionLayerInstruction with no transform or opacity ramps and a
     * trackID initialized to kCMPersistentTrackID_Invalid.
     */
    @Generated
    @Selector("videoCompositionLayerInstruction")
    public static native AVMutableVideoCompositionLayerInstruction videoCompositionLayerInstruction();

    /**
     * videoCompositionLayerInstructionWithAssetTrack:
     * 
     * Returns a new instance of AVMutableVideoCompositionLayerInstruction with no transform or opacity ramps and a
     * trackID set to the specified track's trackID.
     * 
     * @param track
     *              A reference to an AVAssetTrack.
     */
    @Generated
    @Selector("videoCompositionLayerInstructionWithAssetTrack:")
    public static native AVMutableVideoCompositionLayerInstruction videoCompositionLayerInstructionWithAssetTrack(
            @NotNull AVAssetTrack track);

    @Generated
    @Selector("init")
    public native AVMutableVideoCompositionLayerInstruction init();

    @Generated
    @Selector("initWithCoder:")
    public native AVMutableVideoCompositionLayerInstruction initWithCoder(@NotNull NSCoder coder);

    /**
     * setCropRectangle:atTime:
     * 
     * Sets a value of the crop rectangle at a time within the timeRange of the instruction.
     * 
     * The origin of the crop rectangle is the top-left corner of the buffer clean aperture rectangle. The crop
     * rectangle is defined in
     * square pixel space, i.e. without taking the pixel aspect ratio into account. Crop rectangles extending outside of
     * the clean aperture,
     * are cropped to the clean aperture.
     * 
     * Sets a fixed crop rectangle to apply from the specified time until the next time at which a crop rectangle is
     * set; this is the same as setting a flat ramp for that time range.
     * Before the first specified time for which a crop rectangle is set, the crop rectangle is held constant to
     * CGRectInfinite
     * after the last time for which a crop rectangle is set, the crop rectangle is held constant at that last value.
     * 
     * This method throws an exception if time is not numeric.
     * 
     * API-Since: 7.0
     * 
     * @param cropRectangle
     *                      The crop rectangle to be applied at the specified time. See the discussion below of how crop
     *                      rectangles are applied to video frames.
     * @param time
     *                      A time value within the timeRange of the composition instruction.
     */
    @Generated
    @Selector("setCropRectangle:atTime:")
    public native void setCropRectangleAtTime(@ByValue CGRect cropRectangle, @ByValue CMTime time);

    /**
     * setCropRectangleRampFromStartCropRectangle:toEndCropRectangle:timeRange:
     * 
     * Sets an crop rectangle ramp to apply during the specified timerange.
     * 
     * The origin of the crop rectangle is the top-left corner of the buffer clean aperture rectangle. The crop
     * rectangle is defined in
     * square pixel space, i.e. without taking the pixel aspect ratio into account. Crop rectangles extending outside of
     * the clean aperture,
     * are cropped to the clean aperture.
     * 
     * During a crop rectangle ramp, the rectangle is interpolated between the values set at the ramp's start time and
     * end time.
     * When the starting or ending rectangle is empty, interpolations take into account the origin and size of the empty
     * rectangle.
     * Before the first specified time for which a crop rectangle is set, the crop rectangle is held constant to
     * CGRectInfinite
     * after the last time for which a crop rectangle is set, the crop rectangle is held constant at that last value.
     * 
     * This method throws an exception if the time range overlaps the time range of an existing crop rectangle ramp, or
     * if the time range does not have a numeric start time and duration.
     * 
     * API-Since: 7.0
     * 
     * @param startCropRectangle
     *                           The crop rectangle to be applied at the starting time of the timeRange. See the
     *                           discussion below of how crop rectangles are applied to video frames.
     * @param endCropRectangle
     *                           The crop rectangle to be applied at the end time of the timeRange.
     * @param timeRange
     *                           The timeRange over which the value of the opacity will be interpolated between
     *                           startCropRectangle and endCropRectangle.
     */
    @Generated
    @Selector("setCropRectangleRampFromStartCropRectangle:toEndCropRectangle:timeRange:")
    public native void setCropRectangleRampFromStartCropRectangleToEndCropRectangleTimeRange(
            @ByValue CGRect startCropRectangle, @ByValue CGRect endCropRectangle, @ByValue CMTimeRange timeRange);

    /**
     * setOpacity:atTime:
     * 
     * Sets a value of the opacity at a time within the timeRange of the instruction.
     * 
     * Sets a fixed opacity to apply from the specified time until the next time at which an opacity is set; this is the
     * same as setting a flat ramp for that time range.
     * Before the first time for which an opacity is set, the opacity is held constant at 1.0; after the last specified
     * time, the opacity is held constant at the last value.
     * This method throws an exception if time is not numeric.
     * 
     * @param opacity
     *                The opacity to be applied at the specified time. The value must be between 0.0 and 1.0.
     * @param time
     *                A time value within the timeRange of the composition instruction.
     */
    @Generated
    @Selector("setOpacity:atTime:")
    public native void setOpacityAtTime(float opacity, @ByValue CMTime time);

    /**
     * setOpacityRampFromStartOpacity:toEndOpacity:timeRange:
     * 
     * Sets an opacity ramp to apply during the specified timerange.
     * 
     * During an opacity ramp, opacity is computed using a linear interpolation.
     * Before the first time for which an opacity is set, the opacity is held constant at 1.0; after the last specified
     * time, the opacity is held constant at the last value
     * This method throws an exception if the time range of a does not have a numeric start time and duration.
     * 
     * @param startOpacity
     *                     The opacity to be applied at the starting time of the timeRange. The value must be between
     *                     0.0 and 1.0.
     * @param endOpacity
     *                     The opacity to be applied at the end time of the timeRange. The value must be between 0.0 and
     *                     1.0.
     * @param timeRange
     *                     The timeRange over which the value of the opacity will be interpolated between startOpacity
     *                     and endOpacity.
     */
    @Generated
    @Selector("setOpacityRampFromStartOpacity:toEndOpacity:timeRange:")
    public native void setOpacityRampFromStartOpacityToEndOpacityTimeRange(float startOpacity, float endOpacity,
            @ByValue CMTimeRange timeRange);

    /**
     * Indicates the trackID of the source track to which the compositor will apply the instruction.
     */
    @Generated
    @Selector("setTrackID:")
    public native void setTrackID(int value);

    /**
     * setTransform:atTime:
     * 
     * Sets a value of the transform at a time within the timeRange of the instruction.
     * 
     * For purposes of spatial positioning of video frames, the origin is in the top-left corner, so
     * (a) positive translation values in an affine transform move a video frame right and down; and
     * (b) with an identity transform a video frame is positioned with its top-left corner in the top-left corner of the
     * composited frame.
     * Video frames shall be interpreted at their display sizes (as described by CVImageBufferGetDisplaySize,
     * ie, taking pixel aspect ratio attachments into account) before any affine transform is applied.
     * 
     * Sets a fixed transform to apply from the specified time until the next time at which a transform is set; this is
     * the same as setting a flat ramp for that time range.
     * Before the first specified time for which a transform is set, the affine transform is held constant at the value
     * of CGAffineTransformIdentity;
     * after the last time for which a transform is set, the affine transform is held constant at that last value;
     * 
     * This method throws an exception if time is not numeric.
     * 
     * @param transform
     *                  The transform to be applied at the specified time. See the discussion below of how transforms
     *                  are applied to video frames.
     * @param time
     *                  A time value within the timeRange of the composition instruction.
     */
    @Generated
    @Selector("setTransform:atTime:")
    public native void setTransformAtTime(@ByValue CGAffineTransform transform, @ByValue CMTime time);

    /**
     * setTransformRampFromStartTransform:toEndTransform:timeRange:
     * 
     * Sets a transform ramp to apply during the specified timerange.
     * 
     * For purposes of spatial positioning of video frames, the origin is in the top-left corner, so
     * (a) positive translation values in an affine transform move a video frame right and down; and
     * (b) with an identity transform a video frame is positioned with its top-left corner in the top-left corner of the
     * composited frame.
     * Video frames shall be interpreted at their display sizes (as described by CVImageBufferGetDisplaySize,
     * ie, taking pixel aspect ratio attachments into account) before any affine transform is applied.
     * 
     * During a transform ramp, the affine transform is interpolated between the values set at the ramp's start time and
     * end time.
     * Before the first specified time for which a transform is set, the affine transform is held constant at the value
     * of CGAffineTransformIdentity;
     * after the last time for which a transform is set, the affine transform is held constant at that last value;
     * 
     * This method throws an exception if the time range overlaps the time range of an existing transform ramp or if the
     * time range of a does not have a numeric start time and duration.
     * 
     * @param startTransform
     *                       The transform to be applied at the starting time of the timeRange. See the discussion below
     *                       of how transforms are applied to video frames.
     * @param endTransform
     *                       The transform to be applied at the end time of the timeRange.
     * @param timeRange
     *                       The timeRange over which the value of the transform will be interpolated between
     *                       startTransform and endTransform.
     */
    @Generated
    @Selector("setTransformRampFromStartTransform:toEndTransform:timeRange:")
    public native void setTransformRampFromStartTransformToEndTransformTimeRange(
            @ByValue CGAffineTransform startTransform, @ByValue CGAffineTransform endTransform,
            @ByValue CMTimeRange timeRange);

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
