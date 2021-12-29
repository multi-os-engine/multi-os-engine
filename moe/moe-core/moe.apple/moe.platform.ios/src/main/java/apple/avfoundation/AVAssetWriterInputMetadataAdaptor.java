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
 * AVAssetWriterInputMetadataAdaptor
 * <p>
 * Defines an interface for writing metadata, packaged as instances of AVTimedMetadataGroup, to a single AVAssetWriterInput object.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetWriterInputMetadataAdaptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetWriterInputMetadataAdaptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetWriterInputMetadataAdaptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetWriterInputMetadataAdaptor allocWithZone(VoidPtr zone);

    /**
     * assetWriterInputMetadataAdaptorWithAssetWriterInput:
     * <p>
     * Creates a new timed metadata group adaptor to receive instances of AVTimedMetadataGroup for writing to the output file.
     * <p>
     * The instance of AVAssetWriterInput passed in to this method must have been created with a format hint indicating all possible combinations of identifier (or, alternatively, key and keySpace), dataType, and extendedLanguageTag that will be appended to the metadata adaptor.  It is an error to append metadata items not represented in the input's format hint.
     * <p>
     * It is an error to initialize an instance of AVAssetWriterInputMetadataAdaptor with an asset writer input that is already attached to another instance of AVAssetWriterInputMetadataAdaptor.  It is also an error to initialize an instance of AVAssetWriterInputMetadataAdaptor with an asset writer input whose asset writer has progressed beyond AVAssetWriterStatusUnknown.
     *
     * @param input An instance of AVAssetWriterInput to which the receiver should append groups of timed metadata.  Only asset writer inputs that accept media data of type AVMediaTypeMetadata can be used to initialize a timed metadata group adaptor.
     * @return An instance of AVAssetWriterInputMetadataAdaptor.
     */
    @Generated
    @Selector("assetWriterInputMetadataAdaptorWithAssetWriterInput:")
    public static native AVAssetWriterInputMetadataAdaptor assetWriterInputMetadataAdaptorWithAssetWriterInput(
            AVAssetWriterInput input);

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
    public static native AVAssetWriterInputMetadataAdaptor new_objc();

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
     * appendTimedMetadataGroup:
     * <p>
     * Appends a timed metadata group to the receiver.
     * <p>
     * The receiver will retain the AVTimedMetadataGroup until it is done with it, and then release it.
     * <p>
     * The timing of the metadata items in the output asset will correspond to the timeRange of the AVTimedMetadataGroup, regardless of the values of the time and duration properties of the individual items.
     * <p>
     * Before calling this method, you must ensure that the input that underlies the receiver is attached to an AVAssetWriter via a prior call to -addInput: and that -startWriting has been called on the asset writer.  It is an error to invoke this method before starting a session (via -[AVAssetWriter startSessionAtSourceTime:]) or after ending a session (via -[AVAssetWriter endSessionAtSourceTime:]).
     *
     * @param timedMetadataGroup The AVTimedMetadataGroup to be appended.
     * @return A BOOL value indicating success of appending the timed metadata group.  If a result of NO is returned, AVAssetWriter.error will contain more information about why apending the timed metadata group failed.
     */
    @Generated
    @Selector("appendTimedMetadataGroup:")
    public native boolean appendTimedMetadataGroup(AVTimedMetadataGroup timedMetadataGroup);

    /**
     * [@property] assetWriterInput
     * <p>
     * The asset writer input to which the receiver should append timed metadata groups.
     */
    @Generated
    @Selector("assetWriterInput")
    public native AVAssetWriterInput assetWriterInput();

    @Generated
    @Selector("init")
    public native AVAssetWriterInputMetadataAdaptor init();

    /**
     * initWithAssetWriterInput:
     * <p>
     * Creates a new timed metadator group adaptor to receive instances of AVTimedMetadataGroup for writing to the output file.
     * <p>
     * The instance of AVAssetWriterInput passed in to this method must have been created with a format hint indicating all possible combinations of identifier (or, alternatively, key and keySpace), dataType, and extendedLanguageTag that will be appended to the metadata adaptor.  It is an error to append metadata items not represented in the input's format hint.  For help creating a suitable format hint, see -[AVTimedMetadataGroup copyFormatDescription].
     * <p>
     * It is an error to initialize an instance of AVAssetWriterInputMetadataAdaptor with an asset writer input that is already attached to another instance of AVAssetWriterInputMetadataAdaptor.  It is also an error to initialize an instance of AVAssetWriterInputMetadataAdaptor with an asset writer input whose asset writer has progressed beyond AVAssetWriterStatusUnknown.
     *
     * @param input An instance of AVAssetWriterInput to which the receiver should append groups of timed metadata. Only asset writer inputs that accept media data of type AVMediaTypeMetadata can be used to initialize a timed metadata group adaptor.
     * @return An instance of AVAssetWriterInputMetadataAdaptor.
     */
    @Generated
    @Selector("initWithAssetWriterInput:")
    public native AVAssetWriterInputMetadataAdaptor initWithAssetWriterInput(AVAssetWriterInput input);
}
