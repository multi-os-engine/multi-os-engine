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
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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

/**
 * @class AVAssetReaderOutput
 * @abstract
 * AVAssetReaderOutput is an abstract class that defines an interface for reading a single collection of samples of a common media type from an AVAssetReader.
 * 
 * @discussion
 * Clients can read the media data of an asset by adding one or more concrete instances of AVAssetReaderOutput to an AVAssetReader using the -[AVAssetReader addOutput:] method.
 * 
 * IMPORTANT PERFORMANCE NOTE: Make sure to set the alwaysCopiesSampleData property to NO if you do not need to modify the sample data in-place, to avoid unnecessary and inefficient copying.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetReaderOutput extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetReaderOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetReaderOutput alloc();

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
     * @property alwaysCopiesSampleData
     * @abstract
     * Indicates whether or not the data in buffers gets copied before being vended to the client.
     * 
     * @discussion
     * When the value of this property is YES, the AVAssetReaderOutput will always vend a buffer with copied data to the client.  Data in such buffers can be freely modified by the client. When the value of this property is NO, the buffers vended to the client may not be copied.  Such buffers may still be referenced by other entities. The result of modifying a buffer whose data hasn't been copied is undefined.  Requesting buffers whose data hasn't been copied when possible can lead to performance improvements.
     * 
     * The default value is YES.
     */
    @Generated
    @Selector("alwaysCopiesSampleData")
    public native boolean alwaysCopiesSampleData();

    /**
     * @method copyNextSampleBuffer
     * @abstract
     * Copies the next sample buffer for the output synchronously.
     * 
     * @result
     * A CMSampleBuffer object referencing the output sample buffer.
     * 
     * @discussion
     * The client is responsible for calling CFRelease on the returned CMSampleBuffer object when finished with it. This method will return NULL if there are no more sample buffers available for the receiver within the time range specified by its AVAssetReader's timeRange property, or if there is an error that prevents the AVAssetReader from reading more media data. When this method returns NULL, clients should check the value of the associated AVAssetReader's status property to determine why no more samples could be read.
     */
    @Generated
    @Selector("copyNextSampleBuffer")
    public native CMSampleBufferRef copyNextSampleBuffer();

    @Generated
    @Selector("init")
    public native AVAssetReaderOutput init();

    /**
     * @method markConfigurationAsFinal
     * @abstract
     * Informs the receiver that no more reconfiguration of time ranges is necessary and allows the attached AVAssetReader to advance to AVAssetReaderStatusCompleted.
     * 
     * @discussion
     * When the value of supportsRandomAccess is YES, the attached asset reader will not advance to AVAssetReaderStatusCompleted until this method is called.
     * 
     * When the destination of media data vended by the receiver is an AVAssetWriterInput configured for multi-pass encoding, a convenient time to invoke this method is after the asset writer input indicates that no more passes will be performed.
     * 
     * Once this method has been called, further invocations of -resetForReadingTimeRanges: are disallowed.
     */
    @Generated
    @Selector("markConfigurationAsFinal")
    public native void markConfigurationAsFinal();

    /**
     * @property mediaType
     * @abstract
     * The media type of the samples that can be read from the receiver.
     * 
     * @discussion
     * The value of this property is one of the media type strings defined in AVMediaFormat.h.
     */
    @Generated
    @Selector("mediaType")
    public native String mediaType();

    /**
     * @method resetForReadingTimeRanges:
     * @abstract
     * Starts reading over with a new set of time ranges.
     * 
     * @param timeRanges
     * An NSArray of NSValue objects, each representing a single CMTimeRange structure
     * 
     * @discussion
     * This method may only be used if supportsRandomAccess has been set to YES and may not be called after -markConfigurationAsFinal has been invoked.
     * 
     * This method is often used in conjunction with AVAssetWriter multi-pass (see AVAssetWriterInput category AVAssetWriterInputMultiPass).  In this usage, the caller will invoke -copyNextSampleBuffer until that method returns NULL and then ask the AVAssetWriterInput for a set of time ranges from which it thinks media data should be re-encoded.  These time ranges are then given to this method to set up the asset reader output for the next pass.
     * 
     * The time ranges set here override the time range set on AVAssetReader.timeRange.  Just as with that property, for each time range in the array the intersection of that time range and CMTimeRangeMake(kCMTimeZero, asset.duration) will take effect.  If the start times of each time range in the array are not strictly increasing or if two or more time ranges in the array overlap, an NSInvalidArgumentException will be raised.  It is an error to include a time range with a non-numeric start time or duration (see CMTIME_IS_NUMERIC), unless the duration is kCMTimePositiveInfinity.
     * 
     * If this method is invoked after the status of the attached AVAssetReader has become AVAssetReaderStatusFailed or AVAssetReaderStatusCancelled, no change in status will occur and the result of the next call to -copyNextSampleBuffer will be NULL.
     * 
     * If this method is invoked before all media data has been read (i.e. -copyNextSampleBuffer has not yet returned NULL), an exception will be thrown.  This method may not be called before -startReading has been invoked on the attached asset reader.
     */
    @Generated
    @Selector("resetForReadingTimeRanges:")
    public native void resetForReadingTimeRanges(NSArray<? extends NSValue> timeRanges);

    /**
     * @property alwaysCopiesSampleData
     * @abstract
     * Indicates whether or not the data in buffers gets copied before being vended to the client.
     * 
     * @discussion
     * When the value of this property is YES, the AVAssetReaderOutput will always vend a buffer with copied data to the client.  Data in such buffers can be freely modified by the client. When the value of this property is NO, the buffers vended to the client may not be copied.  Such buffers may still be referenced by other entities. The result of modifying a buffer whose data hasn't been copied is undefined.  Requesting buffers whose data hasn't been copied when possible can lead to performance improvements.
     * 
     * The default value is YES.
     */
    @Generated
    @Selector("setAlwaysCopiesSampleData:")
    public native void setAlwaysCopiesSampleData(boolean value);

    /**
     * @property supportsRandomAccess
     * @abstract
     * Indicates whether the asset reader output supports reconfiguration of the time ranges to read.
     * 
     * @discussion
     * When the value of this property is YES, the time ranges read by the asset reader output can be reconfigured during reading using the -resetForReadingTimeRanges: method.  This also prevents the attached AVAssetReader from progressing to AVAssetReaderStatusCompleted until -markConfigurationAsFinal has been invoked.
     * 
     * The default value is NO, which means that the asset reader output may not be reconfigured once reading has begun.  When the value of this property is NO, AVAssetReader may be able to read media data more efficiently, particularly when multiple asset reader outputs are attached.
     * 
     * This property may not be set after -startReading has been called on the attached asset reader.
     */
    @Generated
    @Selector("setSupportsRandomAccess:")
    public native void setSupportsRandomAccess(boolean value);

    /**
     * @property supportsRandomAccess
     * @abstract
     * Indicates whether the asset reader output supports reconfiguration of the time ranges to read.
     * 
     * @discussion
     * When the value of this property is YES, the time ranges read by the asset reader output can be reconfigured during reading using the -resetForReadingTimeRanges: method.  This also prevents the attached AVAssetReader from progressing to AVAssetReaderStatusCompleted until -markConfigurationAsFinal has been invoked.
     * 
     * The default value is NO, which means that the asset reader output may not be reconfigured once reading has begun.  When the value of this property is NO, AVAssetReader may be able to read media data more efficiently, particularly when multiple asset reader outputs are attached.
     * 
     * This property may not be set after -startReading has been called on the attached asset reader.
     */
    @Generated
    @Selector("supportsRandomAccess")
    public native boolean supportsRandomAccess();
}
