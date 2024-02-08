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
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.CALayer;
import apple.quartzcore.protocol.CAAction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corevideo.opaque.CVBufferRef;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerLayer extends CALayer {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerLayer allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(@NotNull String event);

    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

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
    @Selector("layer")
    public static native AVPlayerLayer layer();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlayerLayer new_objc();

    /**
     * layerWithPlayer:
     * 
     * Returns an instance of AVPlayerLayer to display the visual output of the specified AVPlayer.
     * 
     * @return An instance of AVPlayerLayer.
     */
    @NotNull
    @Generated
    @Selector("playerLayerWithPlayer:")
    public static native AVPlayerLayer playerLayerWithPlayer(@Nullable AVPlayer player);

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
    public native AVPlayerLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native AVPlayerLayer initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithLayer:")
    public native AVPlayerLayer initWithLayer(@NotNull @Mapped(ObjCObjectMapper.class) Object layer);

    /**
     * [@property] readyForDisplay
     * 
     * Boolean indicating that the first video frame has been made ready for display for the current item of the
     * associated AVPlayer.
     * [@discusssion] Use this property as an indicator of when best to show or animate-in an AVPlayerLayer into view.
     * An AVPlayerLayer may be displayed, or made visible, while this property is NO, however the layer will not have
     * any user-visible content until the value becomes YES. Note that if an animation is added to an AVPlayerLayer
     * before it becomes readyForDisplay the video image displayed inside might not animate with the receiver.
     * This property remains NO for an AVPlayer currentItem whose AVAsset contains no enabled video tracks.
     * This property is key-value observable.
     */
    @Generated
    @Selector("isReadyForDisplay")
    public native boolean isReadyForDisplay();

    /**
     * [@property] pixelBufferAttributes
     * 
     * The client requirements for the visual output displayed in AVPlayerLayer during playback.
     * 
     * Pixel buffer attribute keys are defined in <CoreVideo/CVPixelBuffer.h>
     * This property is key-value observable.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("pixelBufferAttributes")
    public native NSDictionary<String, ?> pixelBufferAttributes();

    /**
     * [@property] player
     * 
     * Indicates the instance of AVPlayer for which the AVPlayerLayer displays visual output
     */
    @Nullable
    @Generated
    @Selector("player")
    public native AVPlayer player();

    /**
     * [@property] pixelBufferAttributes
     * 
     * The client requirements for the visual output displayed in AVPlayerLayer during playback.
     * 
     * Pixel buffer attribute keys are defined in <CoreVideo/CVPixelBuffer.h>
     * This property is key-value observable.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setPixelBufferAttributes:")
    public native void setPixelBufferAttributes(@Nullable NSDictionary<String, ?> value);

    /**
     * [@property] player
     * 
     * Indicates the instance of AVPlayer for which the AVPlayerLayer displays visual output
     */
    @Generated
    @Selector("setPlayer:")
    public native void setPlayer(@Nullable AVPlayer value);

    /**
     * [@property] videoGravity
     * 
     * A string defining how the video is displayed within an AVPlayerLayer bounds rect.
     * [@discusssion] Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill
     * and AVLayerVideoGravityResize. AVLayerVideoGravityResizeAspect is default.
     * See <AVFoundation/AVAnimation.h> for a description of these options.
     */
    @Generated
    @Selector("setVideoGravity:")
    public native void setVideoGravity(@NotNull String value);

    /**
     * [@property] videoGravity
     * 
     * A string defining how the video is displayed within an AVPlayerLayer bounds rect.
     * [@discusssion] Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill
     * and AVLayerVideoGravityResize. AVLayerVideoGravityResizeAspect is default.
     * See <AVFoundation/AVAnimation.h> for a description of these options.
     */
    @NotNull
    @Generated
    @Selector("videoGravity")
    public native String videoGravity();

    /**
     * [@property] videoRect
     * 
     * The current size and position of the video image as displayed within the receiver's bounds.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("videoRect")
    @ByValue
    public native CGRect videoRect();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("cornerCurveExpansionFactor:")
    @NFloat
    public static native double cornerCurveExpansionFactor(@NotNull String curve);

    /**
     * copyDisplayedPixelBuffer
     * 
     * Returns a retained reference to the pixel buffer currently displayed in this AVPlayerLayer. This will return NULL
     * if the displayed pixel buffer is protected, no image is currently being displayed, if the current player's rate
     * is non-zero or if the image is unavailable.
     * 
     * This will only return the current image while the media is paused, otherwise this will return nil. Clients must
     * release the pixel buffer after use.
     * 
     * Do not write to the returned CVPixelBuffer's attachments or pixel data.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("copyDisplayedPixelBuffer")
    public native CVBufferRef copyDisplayedPixelBuffer();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
