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
import apple.avfoundation.protocol.AVVideoCompositionInstruction;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTime;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.coremedia.opaque.CMTaggedBufferGroupRef;

/**
 * An AVAsynchronousVideoCompositionRequest instance contains the information necessary for a video compositor to render
 * an output pixel buffer. The video compositor must implement the AVVideoCompositing protocol.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAsynchronousVideoCompositionRequest extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAsynchronousVideoCompositionRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAsynchronousVideoCompositionRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAsynchronousVideoCompositionRequest allocWithZone(VoidPtr zone);

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
    public static native AVAsynchronousVideoCompositionRequest new_objc();

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
     * The time for which the frame should be composed
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("compositionTime")
    @ByValue
    public native CMTime compositionTime();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * callback the custom compositor should call for a request that has been cancelled.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("finishCancelledRequest")
    public native void finishCancelledRequest();

    /**
     * The method that the custom compositor calls when composition succeeds.
     * 
     * - Parameter composedVideoFrame: The video frame to finish with. Call finishWithComposedTaggedBufferGroup: instead
     * if outputBufferDescription is non-nil.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("finishWithComposedVideoFrame:")
    public native void finishWithComposedVideoFrame(@NotNull CVBufferRef composedVideoFrame);

    /**
     * callback the custom compositor should call when composition failed. The error parameter should describe the
     * actual error.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("finishWithError:")
    public native void finishWithError(@NotNull NSError error);

    @Generated
    @Selector("init")
    public native AVAsynchronousVideoCompositionRequest init();

    /**
     * The AVVideoCompositionRenderContext making the request
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("renderContext")
    public native AVVideoCompositionRenderContext renderContext();

    /**
     * Returns the source CVPixelBufferRef for the given track ID
     * 
     * If the track contains tagged buffers, a pixel buffer from one of the tagged buffers will be returned.
     * 
     * - Parameter trackID: The track ID for the requested source frame
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("sourceFrameByTrackID:")
    public native CVBufferRef sourceFrameByTrackID(int trackID);

    /**
     * Track IDs of all the source video buffers that are available to compose the frame.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("sourceTrackIDs")
    public native NSArray<? extends NSNumber> sourceTrackIDs();

    /**
     * The AVVideoCompositionInstruction to use to compose the frame.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("videoCompositionInstruction")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositionInstruction videoCompositionInstruction();

    /**
     * Returns the source CMSampleBufferRef for the given track ID
     * 
     * - Parameter trackID: The track ID for the requested source sample buffer
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("sourceSampleBufferByTrackID:")
    public native CMSampleBufferRef sourceSampleBufferByTrackID(int trackID);

    /**
     * Track IDs of all the source sample data buffers that are available to compose the frame.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("sourceSampleDataTrackIDs")
    public native NSArray<? extends NSNumber> sourceSampleDataTrackIDs();

    /**
     * Returns the source AVTimedMetadataGroup * for the given track ID
     * 
     * - Parameter trackID: The track ID for the requested source timed metadata group.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("sourceTimedMetadataByTrackID:")
    public native AVTimedMetadataGroup sourceTimedMetadataByTrackID(int trackID);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Associates the pixel buffer with the specified spatial configuration.
     * - Parameters:
     * - spatialVideoConfiguration: The spatial configuration to associate with the pixel buffer.
     * - pixelBuffer: The pixel buffer to associate with the spatial configuration.
     * NOTE: The spatial configuration must be one of the spatial configurations specified in the
     * ``AVVideoComposition/spatialConfigurations`` property. An exception will be thrown otherwise.
     * NOTE: All pixel buffers from the custom compositor must be associated with the same spatial configuration. An
     * exception will be thrown otherwise.
     * A spatial configuration with all nil values indicates the video is not spatial. A nil spatial configuration also
     * indicates the video is not spatial. The value can be nil, which indicates the output will not be spatial, but a
     * spatial configuration with all nil values must be in the ``AVVideoComposition/spatialConfigurations`` property or
     * an exception will be thrown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("attachSpatialVideoConfiguration:toPixelBuffer:")
    public native void attachSpatialVideoConfigurationToPixelBuffer(
            @Nullable AVSpatialVideoConfiguration spatialVideoConfiguration, @NotNull CVBufferRef pixelBuffer);

    /**
     * The method that the custom compositor calls when composition succeeds.
     * 
     * - Parameter taggedBufferGroup: The tagged buffer group containing the composed tagged buffers. The tagged buffers
     * must be compatible with the outputBufferDescription specified in the video composition. The
     * outputBufferDescription must not be nil when calling this function.
     * NOTE: If ``AVVideoComposition/spatialConfigurations`` is not empty, then
     * ``attach(spatialVideoConfiguration:to:)`` must be called with one of the spatial configurations. An exception
     * will be thrown otherwise. Also, all pixel buffers must be associated with the same spatial configuration. An
     * exception will be thrown otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("finishWithComposedTaggedBufferGroup:")
    public native void finishWithComposedTaggedBufferGroup(@NotNull CMTaggedBufferGroupRef taggedBufferGroup);

    /**
     * Returns the source CMTaggedBufferGroupRef for the given track ID.
     * 
     * Returns nil if the video track does not contain tagged buffers. Returns nil if the track does not contain video.
     * This function should only be called when supportsSourceTaggedBuffers is YES.
     * 
     * - Parameter trackID: The track ID for the requested source tagged buffer group.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sourceTaggedBufferGroupByTrackID:")
    @Nullable
    public native CMTaggedBufferGroupRef sourceTaggedBufferGroupByTrackID(int trackID);
}
