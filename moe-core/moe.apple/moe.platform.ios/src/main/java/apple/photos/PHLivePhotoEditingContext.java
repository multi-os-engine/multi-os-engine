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

package apple.photos;

import apple.NSObject;
import apple.coreimage.CIImage;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHLivePhotoEditingContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHLivePhotoEditingContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHLivePhotoEditingContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHLivePhotoEditingContext allocWithZone(VoidPtr zone);

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
    public static native PHLivePhotoEditingContext new_objc();

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
     * Specify the audio volume of the edited live photo
     * Must be between 0.0 and 1.0
     * Default to 1.0
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("audioVolume")
    public native float audioVolume();

    /**
     * Cancel the current asynchronous operation
     * This is implicitly called whenever prepare or save is called
     * A canceled operation will call its completion handler with an appropriate error code
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * The duration of the live photo
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    /**
     * A block that can be set to process each frame of the live photo
     * Note that the context uses a copy of the processor block during processing
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("frameProcessor")
    @ObjCBlock(name = "call_frameProcessor_ret")
    public native Block_frameProcessor_ret frameProcessor();

    /**
     * The original full-size image from the input live photo
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("fullSizeImage")
    public native CIImage fullSizeImage();

    @Generated
    @Selector("init")
    public native PHLivePhotoEditingContext init();

    /**
     * Initializer from the specified live photo input
     * Return nil if the specified input is not for a live photo
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithLivePhotoEditingInput:")
    public native PHLivePhotoEditingContext initWithLivePhotoEditingInput(
            @NotNull PHContentEditingInput livePhotoInput);

    /**
     * The orientation of the live photo
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("orientation")
    public native int orientation();

    /**
     * The time of the still image within the live photo
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("photoTime")
    @ByValue
    public native CMTime photoTime();

    /**
     * Asynchronously generate a new live photo suitable for playback in a PHLivePhotoView of the specified target size
     * The options dictionary can contain additional options, see below
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("prepareLivePhotoForPlaybackWithTargetSize:options:completionHandler:")
    public native void prepareLivePhotoForPlaybackWithTargetSizeOptionsCompletionHandler(@ByValue CGSize targetSize,
            @Nullable NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_prepareLivePhotoForPlaybackWithTargetSizeOptionsCompletionHandler") Block_prepareLivePhotoForPlaybackWithTargetSizeOptionsCompletionHandler handler);

    /**
     * Asynchronously process and save the edited live photo to the specified content editing output
     * Options dictionary should be nil, reserved for future expansion
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("saveLivePhotoToOutput:options:completionHandler:")
    public native void saveLivePhotoToOutputOptionsCompletionHandler(@NotNull PHContentEditingOutput output,
            @Nullable NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_saveLivePhotoToOutputOptionsCompletionHandler") Block_saveLivePhotoToOutputOptionsCompletionHandler handler);

    /**
     * Specify the audio volume of the edited live photo
     * Must be between 0.0 and 1.0
     * Default to 1.0
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setAudioVolume:")
    public native void setAudioVolume(float value);

    /**
     * A block that can be set to process each frame of the live photo
     * Note that the context uses a copy of the processor block during processing
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setFrameProcessor:")
    public native void setFrameProcessor(
            @Nullable @ObjCBlock(name = "call_setFrameProcessor") Block_setFrameProcessor value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_frameProcessor_ret {
        @Nullable
        @Generated
        CIImage call_frameProcessor_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object frame,
                @NotNull @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareLivePhotoForPlaybackWithTargetSizeOptionsCompletionHandler {
        @Generated
        void call_prepareLivePhotoForPlaybackWithTargetSizeOptionsCompletionHandler(@Nullable PHLivePhoto livePhoto,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveLivePhotoToOutputOptionsCompletionHandler {
        @Generated
        void call_saveLivePhotoToOutputOptionsCompletionHandler(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFrameProcessor {
        @Nullable
        @Generated
        CIImage call_setFrameProcessor(@NotNull @Mapped(ObjCObjectMapper.class) Object frame,
                @NotNull @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
