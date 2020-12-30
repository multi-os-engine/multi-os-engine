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
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * @class AVAssetReaderSampleReferenceOutput
 * @abstract
 * AVAssetReaderSampleReferenceOutput is a concrete subclass of AVAssetReaderOutput that defines an interface for reading sample references from a single AVAssetTrack of an AVAssetReader's AVAsset.
 * @discussion
 * Clients can extract information about the location (file URL and offset) of samples in a track by adding an instance of AVAssetReaderSampleReferenceOutput to an AVAssetReader using the -[AVAssetReader addOutput:] method. No actual sample data can be extracted using this class. The location of the sample data is described by the kCMSampleBufferAttachmentKey_SampleReferenceURL and kCMSampleBufferAttachmentKey_SampleReferenceByteOffset attachments on the extracted sample buffers. More information about sample buffers describing sample references can be found in the CMSampleBuffer documentation.
 * 
 * Sample buffers extracted using this class can also be appended to an AVAssetWriterInput to create movie tracks that are not self-contained and reference data in the original file instead.  Currently, only instances of AVAssetWriter configured to write files of type AVFileTypeQuickTimeMovie can be used to write tracks that are not self-contained.
 * 
 * Since no sample data is ever returned by instances of AVAssetReaderSampleReferenceOutput, the value of the alwaysCopiesSampleData property is ignored.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetReaderSampleReferenceOutput extends AVAssetReaderOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetReaderSampleReferenceOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetReaderSampleReferenceOutput alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * @method assetReaderSampleReferenceOutputWithTrack:
     * @abstract
     * Returns an instance of AVAssetReaderSampleReferenceOutput for supplying sample references.
     * 
     * @param track
     * The AVAssetTrack for which the resulting AVAssetReaderSampleReferenceOutput should provide sample references.
     * @result
     * An instance of AVAssetReaderSampleReferenceOutput.
     * 
     * @discussion
     * The track must be one of the tracks contained by the target AVAssetReader's asset.
     */
    @Generated
    @Selector("assetReaderSampleReferenceOutputWithTrack:")
    public static native AVAssetReaderSampleReferenceOutput assetReaderSampleReferenceOutputWithTrack(
            AVAssetTrack track);

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

    @Generated
    @Selector("init")
    public native AVAssetReaderSampleReferenceOutput init();

    /**
     * @method initWithTrack:
     * @abstract
     * Returns an instance of AVAssetReaderSampleReferenceOutput for supplying sample references.
     * 
     * @param track
     * The AVAssetTrack for which the resulting AVAssetReaderSampleReferenceOutput should provide sample references.
     * @result
     * An instance of AVAssetReaderTrackOutput.
     * 
     * @discussion
     * The track must be one of the tracks contained by the target AVAssetReader's asset.
     */
    @Generated
    @Selector("initWithTrack:")
    public native AVAssetReaderSampleReferenceOutput initWithTrack(AVAssetTrack track);

    /**
     * @property track
     * @abstract
     * The track from which the receiver extracts sample references.
     * 
     * @discussion
     * The value of this property is an AVAssetTrack owned by the target AVAssetReader's asset.
     */
    @Generated
    @Selector("track")
    public native AVAssetTrack track();
}
