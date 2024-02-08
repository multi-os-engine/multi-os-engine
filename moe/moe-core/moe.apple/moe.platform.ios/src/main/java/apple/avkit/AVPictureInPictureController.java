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

package apple.avkit;

import apple.NSObject;
import apple.avfoundation.AVPlayerLayer;
import apple.avkit.protocol.AVPictureInPictureControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIImage;
import apple.uikit.UITraitCollection;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVPictureInPictureController
 * 
 * AVPictureInPictureController is a subclass of NSObject that can be used to present the contents of an AVPlayerLayer
 * or AVPlayerView floating on top of applications.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPictureInPictureController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPictureInPictureController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPictureInPictureController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPictureInPictureController allocWithZone(VoidPtr zone);

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

    /**
     * isPictureInPictureSupported
     * 
     * Whether or not Picture in Picture is supported on the current device.
     * 
     * When NO, all initializers will return nil.
     */
    @Generated
    @Selector("isPictureInPictureSupported")
    public static native boolean isPictureInPictureSupported();

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
    public static native AVPictureInPictureController new_objc();

    /**
     * pictureInPictureButtonStartImageCompatibleWithTraitCollection:
     * 
     * System default Picture in Picture start template image for use in client's Picture in Picture button.
     * 
     * @param traitCollection
     *                        Traits that describe the image to retrieve, pass nil to use traits that describe the main
     *                        screen.
     */
    @NotNull
    @Generated
    @Selector("pictureInPictureButtonStartImageCompatibleWithTraitCollection:")
    public static native UIImage pictureInPictureButtonStartImageCompatibleWithTraitCollection(
            @Nullable UITraitCollection traitCollection);

    /**
     * pictureInPictureButtonStopImageCompatibleWithTraitCollection:
     * 
     * System default Picture in Picture stop template image for use in client's Picture in Picture button.
     * 
     * @param traitCollection
     *                        Traits that describe the image to retrieve, pass nil to use traits that describe the main
     *                        screen.
     */
    @NotNull
    @Generated
    @Selector("pictureInPictureButtonStopImageCompatibleWithTraitCollection:")
    public static native UIImage pictureInPictureButtonStopImageCompatibleWithTraitCollection(
            @Nullable UITraitCollection traitCollection);

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
     * [@property] delegate
     * 
     * The receiver's delegate.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPictureInPictureControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native AVPictureInPictureController init();

    /**
     * initWithPlayerLayer:
     * 
     * Initialize the picture in picture controller with a player layer.
     * 
     * @param playerLayer
     *                    The player layer from which to source the media content for the Picture in Picture controller.
     */
    @Generated
    @Selector("initWithPlayerLayer:")
    public native AVPictureInPictureController initWithPlayerLayer(@NotNull AVPlayerLayer playerLayer);

    /**
     * [@property] pictureInPictureActive
     * 
     * Whether or not Picture in Picture is currently active.
     */
    @Generated
    @Selector("isPictureInPictureActive")
    public native boolean isPictureInPictureActive();

    /**
     * [@property] pictureInPicturePossible
     * 
     * Whether or not Picture in Picture is currently possible.
     */
    @Generated
    @Selector("isPictureInPicturePossible")
    public native boolean isPictureInPicturePossible();

    /**
     * [@property] pictureInPictureSuspended
     * 
     * Whether or not Picture in Picture is currently suspended.
     */
    @Generated
    @Selector("isPictureInPictureSuspended")
    public native boolean isPictureInPictureSuspended();

    /**
     * [@property] playerLayer
     * 
     * The receiver's player layer.
     */
    @NotNull
    @Generated
    @Selector("playerLayer")
    public native AVPlayerLayer playerLayer();

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) AVPictureInPictureControllerDelegate value);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) AVPictureInPictureControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * startPictureInPicture
     * 
     * Start Picture in Picture for the provided AVPlayerLayer if possible.
     * 
     * Receiver will call -pictureInPictureControllerWillStartPictureInPicture: if Picture in Picture is currently
     * possible and -pictureInPictureControllerDidStartPictureInPicture: after a successful start. If starting Picture
     * in Picture fails, -pictureInPictureControllerFailedToStartPictureInPicture:withError: is called on the delegate
     * instead. Client can stop Picture in Picture by calling -stopPictureInPicture. In addition the user can stop
     * Picture in Picture through user interaction. It is also possible that Picture in Picture is stopped by the
     * Picture in Picture controller at any time. In all these cases receiver calls
     * -pictureInPictureControllerWillStopPictureInPicture: on the delegate and
     * -pictureInPictureControllerDidStopPictureInPicture:after the stop animation completed.
     */
    @Generated
    @Selector("startPictureInPicture")
    public native void startPictureInPicture();

    /**
     * stopPictureInPicture
     * 
     * Stop the local Picture in Picture if currently active. On tvOS, this can also stop Picture in Picture sessions
     * for other applications.
     * 
     * See startPictureInPicture for details.
     */
    @Generated
    @Selector("stopPictureInPicture")
    public native void stopPictureInPicture();

    /**
     * [@property] pictureInPictureButtonStartImage
     * 
     * System default Picture in Picture start template image for use in client's Picture in Picture button.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("pictureInPictureButtonStartImage")
    public static native UIImage pictureInPictureButtonStartImage();

    /**
     * [@property] pictureInPictureButtonStopImage
     * 
     * System default Picture in Picture stop template image for use in client's Picture in Picture button.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("pictureInPictureButtonStopImage")
    public static native UIImage pictureInPictureButtonStopImage();

    /**
     * [@property] requiresLinearPlayback
     * 
     * Disables certain user operations (fast forward, forward skip, and scrubbing).
     * 
     * This can be used to temporarily enforce playback of mandatory content (such as legalese or advertisements).
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("requiresLinearPlayback")
    public native boolean requiresLinearPlayback();

    /**
     * [@property] requiresLinearPlayback
     * 
     * Disables certain user operations (fast forward, forward skip, and scrubbing).
     * 
     * This can be used to temporarily enforce playback of mandatory content (such as legalese or advertisements).
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setRequiresLinearPlayback:")
    public native void setRequiresLinearPlayback(boolean value);

    /**
     * [@property] canStartPictureInPictureAutomaticallyFromInline
     * 
     * Indicates whether Picture in Picture should be allowed to start automatically when transitioning to background
     * when the receiver’s content is embedded inline. Default is NO.
     * 
     * This property must only be set to YES for content intended to be the user's primary focus.
     * 
     * API-Since: 14.2
     */
    @Generated
    @Selector("canStartPictureInPictureAutomaticallyFromInline")
    public native boolean canStartPictureInPictureAutomaticallyFromInline();

    /**
     * [@property] canStartPictureInPictureAutomaticallyFromInline
     * 
     * Indicates whether Picture in Picture should be allowed to start automatically when transitioning to background
     * when the receiver’s content is embedded inline. Default is NO.
     * 
     * This property must only be set to YES for content intended to be the user's primary focus.
     * 
     * API-Since: 14.2
     */
    @Generated
    @Selector("setCanStartPictureInPictureAutomaticallyFromInline:")
    public native void setCanStartPictureInPictureAutomaticallyFromInline(boolean value);

    /**
     * [@property] contentSource
     * 
     * The receiver's content source. Can be changed while Picture in Picture is active, but the new content source must
     * be ready for display (in the case of AVPlayerLayer, that means AVPlayerLayer.isReadyForDisplay must return YES),
     * otherwise Picture in Picture will stop.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("contentSource")
    public native AVPictureInPictureControllerContentSource contentSource();

    /**
     * initWithContentSource:
     * 
     * Use this initializer for content that may be a sample buffer display layer or a player layer.
     * 
     * API-Since: 15.0
     * 
     * @param contentSource
     *                      The content source to be shown in Picture in Picture.
     */
    @Generated
    @Selector("initWithContentSource:")
    public native AVPictureInPictureController initWithContentSource(
            @NotNull AVPictureInPictureControllerContentSource contentSource);

    /**
     * invalidatePlaybackState
     * 
     * Informs Picture in Picture controller that it should request an updated playback state from its
     * sampleBufferPlaybackDelegate.
     * 
     * This should always be called whenever playback is paused or unpaused, or the underlying content duration changes.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("invalidatePlaybackState")
    public native void invalidatePlaybackState();

    /**
     * [@property] contentSource
     * 
     * The receiver's content source. Can be changed while Picture in Picture is active, but the new content source must
     * be ready for display (in the case of AVPlayerLayer, that means AVPlayerLayer.isReadyForDisplay must return YES),
     * otherwise Picture in Picture will stop.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setContentSource:")
    public native void setContentSource(@Nullable AVPictureInPictureControllerContentSource value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
