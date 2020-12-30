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
 * AVAssetReaderOutputMetadataAdaptor
 * 
 * Defines an interface for reading metadata, packaged as instances of AVTimedMetadataGroup, from a single AVAssetReaderTrackOutput object.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetReaderOutputMetadataAdaptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetReaderOutputMetadataAdaptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetReaderOutputMetadataAdaptor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * assetReaderOutputMetadataAdaptorWithAssetReaderTrackOutput:
     * 
     * Creates a new timed metadata group adaptor for retrieving timed metadata group objects from an asset reader output.
     * 
     * It is an error to create a timed metadata group adaptor with an asset reader output that does not vend metadata.  It is also an error to create a timed metadata group adaptor with an asset reader output whose asset reader has already started reading, or an asset reader output that already has been used to initialize another timed metadata group adaptor.
     * 
     * Clients should not mix calls to -[AVAssetReaderTrackOutput copyNextSampleBuffer] and -[AVAssetReaderOutputMetadataAdaptor nextTimedMetadataGroup].  Once an AVAssetReaderTrackOutput instance has been used to initialize an AVAssetReaderOutputMetadataAdaptor, calling -copyNextSampleBuffer on that instance will result in an exception being thrown.
     * 
     * @param	assetReaderOutput
     * An instance of AVAssetReaderTrackOutput that vends sample buffers containing metadata, e.g. an AVAssetReaderTrackOutput object initialized with a track of media type AVMediaTypeMetadata and nil outputSettings.
     * @return
     * An instance of AVAssetReaderOutputMetadataAdaptor
     */
    @Generated
    @Selector("assetReaderOutputMetadataAdaptorWithAssetReaderTrackOutput:")
    public static native AVAssetReaderOutputMetadataAdaptor assetReaderOutputMetadataAdaptorWithAssetReaderTrackOutput(
            AVAssetReaderTrackOutput trackOutput);

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
     * [@property] assetReaderTrackOutput
     * 
     * The asset reader track output from which the receiver pulls timed metadata groups.
     */
    @Generated
    @Selector("assetReaderTrackOutput")
    public native AVAssetReaderTrackOutput assetReaderTrackOutput();

    @Generated
    @Selector("init")
    public native AVAssetReaderOutputMetadataAdaptor init();

    /**
     * initWithAssetReaderTrackOutput:
     * 
     * Creates a new timed metadata group adaptor for retrieving timed metadata group objects from an asset reader output.
     * 
     * It is an error to create a timed metadata group adaptor with an asset reader output that does not vend metadata.  It is also an error to create a timed metadata group adaptor with an asset reader output whose asset reader has already started reading, or an asset reader output that already has been used to initialize another timed metadata group adaptor.
     * 
     * Clients should not mix calls to -[AVAssetReaderTrackOutput copyNextSampleBuffer] and -[AVAssetReaderOutputMetadataAdaptor nextTimedMetadataGroup].  Once an AVAssetReaderTrackOutput instance has been used to initialize an AVAssetReaderOutputMetadataAdaptor, calling -copyNextSampleBuffer on that instance will result in an exception being thrown.
     * 
     * @param	assetReaderOutput
     * An instance of AVAssetReaderTrackOutput that vends sample buffers containing metadata, e.g. an AVAssetReaderTrackOutput object initialized with a track of media type AVMediaTypeMetadata and nil outputSettings.
     * @return
     * An instance of AVAssetReaderOutputMetadataAdaptor
     */
    @Generated
    @Selector("initWithAssetReaderTrackOutput:")
    public native AVAssetReaderOutputMetadataAdaptor initWithAssetReaderTrackOutput(
            AVAssetReaderTrackOutput trackOutput);

    /**
     * nextTimedMetadataGroup
     * 
     * Returns the next timed metadata group for the asset reader output, synchronously.
     * 
     * This method will return nil when all timed metadata groups have been read from the asset reader output, or if there is an error that prevents the timed metadata group adaptor from reading more timed metadata groups.  When this method returns nil, clients should check the value of the associated AVAssetReader's status property to determine why no more samples could be read.
     * 
     * Unlike -[AVAssetReaderTrackOutput copyNextSampleBuffer], this method returns an autoreleased object.
     * 
     * Before calling this method, you must ensure that the output which underlies the receiver is attached to an AVAssetReader via a prior call to -addOutput: and that -startReading has been called on the asset reader.
     * 
     * @return
     * An instance of AVTimedMetadataGroup, representing the next logical segment of metadata coming from the source asset reader output.
     */
    @Generated
    @Selector("nextTimedMetadataGroup")
    public native AVTimedMetadataGroup nextTimedMetadataGroup();
}
