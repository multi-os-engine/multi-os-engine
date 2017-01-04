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
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetWriter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetWriter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetWriter alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWriterWithURL:fileType:error:")
    public static native AVAssetWriter assetWriterWithURLFileTypeError(NSURL outputURL, String outputFileType,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addInput:")
    public native void addInput(AVAssetWriterInput input);

    @Generated
    @Selector("addInputGroup:")
    public native void addInputGroup(AVAssetWriterInputGroup inputGroup);

    @Generated
    @Selector("availableMediaTypes")
    public native NSArray<String> availableMediaTypes();

    @Generated
    @Selector("canAddInput:")
    public native boolean canAddInput(AVAssetWriterInput input);

    @Generated
    @Selector("canAddInputGroup:")
    public native boolean canAddInputGroup(AVAssetWriterInputGroup inputGroup);

    @Generated
    @Selector("canApplyOutputSettings:forMediaType:")
    public native boolean canApplyOutputSettingsForMediaType(NSDictionary<String, ?> outputSettings, String mediaType);

    @Generated
    @Selector("cancelWriting")
    public native void cancelWriting();

    @Generated
    @Selector("directoryForTemporaryFiles")
    public native NSURL directoryForTemporaryFiles();

    @Generated
    @Selector("endSessionAtSourceTime:")
    public native void endSessionAtSourceTime(@ByValue CMTime endTime);

    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Deprecated
    @Selector("finishWriting")
    public native boolean finishWriting();

    @Generated
    @Selector("finishWritingWithCompletionHandler:")
    public native void finishWritingWithCompletionHandler(
            @ObjCBlock(name = "call_finishWritingWithCompletionHandler") Block_finishWritingWithCompletionHandler handler);

    @Generated
    @Selector("init")
    public native AVAssetWriter init();

    @Generated
    @Selector("initWithURL:fileType:error:")
    public native AVAssetWriter initWithURLFileTypeError(NSURL outputURL, String outputFileType,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("inputGroups")
    public native NSArray<? extends AVAssetWriterInputGroup> inputGroups();

    @Generated
    @Selector("inputs")
    public native NSArray<? extends AVAssetWriterInput> inputs();

    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    @Generated
    @Selector("movieFragmentInterval")
    @ByValue
    public native CMTime movieFragmentInterval();

    @Generated
    @Selector("movieTimeScale")
    public native int movieTimeScale();

    @Generated
    @Selector("outputFileType")
    public native String outputFileType();

    @Generated
    @Selector("outputURL")
    public native NSURL outputURL();

    @Generated
    @Selector("overallDurationHint")
    @ByValue
    public native CMTime overallDurationHint();

    @Generated
    @Selector("setDirectoryForTemporaryFiles:")
    public native void setDirectoryForTemporaryFiles(NSURL value);

    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    @Generated
    @Selector("setMovieFragmentInterval:")
    public native void setMovieFragmentInterval(@ByValue CMTime value);

    @Generated
    @Selector("setMovieTimeScale:")
    public native void setMovieTimeScale(int value);

    @Generated
    @Selector("setOverallDurationHint:")
    public native void setOverallDurationHint(@ByValue CMTime value);

    @Generated
    @Selector("setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean value);

    @Generated
    @Selector("shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();

    @Generated
    @Selector("startSessionAtSourceTime:")
    public native void startSessionAtSourceTime(@ByValue CMTime startTime);

    @Generated
    @Selector("startWriting")
    public native boolean startWriting();

    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishWritingWithCompletionHandler {
        @Generated
        void call_finishWritingWithCompletionHandler();
    }
}
