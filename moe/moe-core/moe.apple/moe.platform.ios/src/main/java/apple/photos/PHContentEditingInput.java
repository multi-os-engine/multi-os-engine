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
import apple.avfoundation.AVAsset;
import apple.corelocation.CLLocation;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHContentEditingInput extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHContentEditingInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHContentEditingInput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHContentEditingInput allocWithZone(VoidPtr zone);

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
    public static native PHContentEditingInput new_objc();

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
     * Adjustments to be applied onto the provided input image or video.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("adjustmentData")
    public native PHAdjustmentData adjustmentData();

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("audiovisualAsset")
    public native AVAsset audiovisualAsset();

    /**
     * Input video:
     * 
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("avAsset")
    public native AVAsset avAsset();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    /**
     * Input image:
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("displaySizeImage")
    public native UIImage displaySizeImage();

    /**
     * EXIF value
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("fullSizeImageOrientation")
    public native int fullSizeImageOrientation();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("fullSizeImageURL")
    public native NSURL fullSizeImageURL();

    @Generated
    @Selector("init")
    public native PHContentEditingInput init();

    /**
     * Input Live Photo:
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("livePhoto")
    public native PHLivePhoto livePhoto();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("location")
    public native CLLocation location();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("mediaSubtypes")
    @NUInt
    public native long mediaSubtypes();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("mediaType")
    @NInt
    public native long mediaType();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("uniformTypeIdentifier")
    public native String uniformTypeIdentifier();

    /**
     * Playback style describes how the content should be presented to the user. Use this value to choose the type of
     * view and the appropriate APIs on the content editing input to display this content.
     * When editing a live photo with a PHAssetPlaybackStyleLoopingVideo, you should provide an updated video that
     * includes the looping video metadata on the PHContentEditingOutput's renderedContentURL.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("playbackStyle")
    @NInt
    public native long playbackStyle();
}
