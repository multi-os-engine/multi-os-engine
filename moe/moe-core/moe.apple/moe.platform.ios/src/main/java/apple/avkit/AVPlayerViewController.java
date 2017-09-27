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
import apple.avfoundation.AVPlayer;
import apple.avkit.protocol.AVPlayerViewControllerDelegate;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

    @Generated
    @Selector("preparePrerollAds")
    public static native void preparePrerollAds();

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
    @Selector("allowsPictureInPicturePlayback")
    public native boolean allowsPictureInPicturePlayback();

    @Generated
    @Selector("cancelPreroll")
    public native void cancelPreroll();

    @Generated
    @Selector("contentOverlayView")
    public native UIView contentOverlayView();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPlayerViewControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native AVPlayerViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native AVPlayerViewController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native AVPlayerViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("isReadyForDisplay")
    public native boolean isReadyForDisplay();

    @Generated
    @Selector("playPrerollAdWithCompletionHandler:")
    public native void playPrerollAdWithCompletionHandler(
            @ObjCBlock(name = "call_playPrerollAdWithCompletionHandler") Block_playPrerollAdWithCompletionHandler completionHandler);

    @Generated
    @Selector("player")
    public native AVPlayer player();

    @Generated
    @Selector("setAllowsPictureInPicturePlayback:")
    public native void setAllowsPictureInPicturePlayback(boolean value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVPlayerViewControllerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVPlayerViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setPlayer:")
    public native void setPlayer(AVPlayer value);

    @Generated
    @Selector("setShowsPlaybackControls:")
    public native void setShowsPlaybackControls(boolean value);

    @Generated
    @Selector("setUpdatesNowPlayingInfoCenter:")
    public native void setUpdatesNowPlayingInfoCenter(boolean value);

    @Generated
    @Selector("setVideoGravity:")
    public native void setVideoGravity(String value);

    @Generated
    @Selector("showsPlaybackControls")
    public native boolean showsPlaybackControls();

    @Generated
    @Selector("updatesNowPlayingInfoCenter")
    public native boolean updatesNowPlayingInfoCenter();

    @Generated
    @Selector("videoBounds")
    @ByValue
    public native CGRect videoBounds();

    @Generated
    @Selector("videoGravity")
    public native String videoGravity();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playPrerollAdWithCompletionHandler {
        @Generated
        void call_playPrerollAdWithCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("entersFullScreenWhenPlaybackBegins")
    public native boolean entersFullScreenWhenPlaybackBegins();

    @Generated
    @Selector("exitsFullScreenWhenPlaybackEnds")
    public native boolean exitsFullScreenWhenPlaybackEnds();

    @Generated
    @Selector("setEntersFullScreenWhenPlaybackBegins:")
    public native void setEntersFullScreenWhenPlaybackBegins(boolean value);

    @Generated
    @Selector("setExitsFullScreenWhenPlaybackEnds:")
    public native void setExitsFullScreenWhenPlaybackEnds(boolean value);
}
