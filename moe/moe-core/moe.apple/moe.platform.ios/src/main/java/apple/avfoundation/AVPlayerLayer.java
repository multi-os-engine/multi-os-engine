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
import apple.coregraphics.struct.CGRect;
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
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(String event);

    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(String key);

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
    @Selector("layer")
    public static native AVPlayerLayer layer();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlayerLayer new_objc();

    /**
     * layerWithPlayer:
     * <p>
     * Returns an instance of AVPlayerLayer to display the visual output of the specified AVPlayer.
     *
     * @return An instance of AVPlayerLayer.
     */
    @Generated
    @Selector("playerLayerWithPlayer:")
    public static native AVPlayerLayer playerLayerWithPlayer(AVPlayer player);

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
    public native AVPlayerLayer initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithLayer:")
    public native AVPlayerLayer initWithLayer(@Mapped(ObjCObjectMapper.class) Object layer);

    /**
     * [@property] readyForDisplay
     * <p>
     * Boolean indicating that the first video frame has been made ready for display for the current item of the
     * associated AVPlayer.
     * [@discusssion] Use this property as an indicator of when best to show or animate-in an AVPlayerLayer into view.
     * An AVPlayerLayer may be displayed, or made visible, while this propoerty is NO, however the layer will not have
     * any user-visible content until the value becomes YES. Note that if an animation is added to an AVPlayerLayer
     * before it becomes readyForDisplay the video image displayed inside might not animate with the receiver.
     * This property remains NO for an AVPlayer currentItem whose AVAsset contains no enabled video tracks.
     */
    @Generated
    @Selector("isReadyForDisplay")
    public native boolean isReadyForDisplay();

    /**
     * [@property] pixelBufferAttributes
     * <p>
     * The client requirements for the visual output displayed in AVPlayerLayer during playback.
     * <p>
     * Pixel buffer attribute keys are defined in <CoreVideo/CVPixelBuffer.h>
     */
    @Generated
    @Selector("pixelBufferAttributes")
    public native NSDictionary<String, ?> pixelBufferAttributes();

    /**
     * [@property] player
     * <p>
     * Indicates the instance of AVPlayer for which the AVPlayerLayer displays visual output
     */
    @Generated
    @Selector("player")
    public native AVPlayer player();

    /**
     * [@property] pixelBufferAttributes
     * <p>
     * The client requirements for the visual output displayed in AVPlayerLayer during playback.
     * <p>
     * Pixel buffer attribute keys are defined in <CoreVideo/CVPixelBuffer.h>
     */
    @Generated
    @Selector("setPixelBufferAttributes:")
    public native void setPixelBufferAttributes(NSDictionary<String, ?> value);

    /**
     * [@property] player
     * <p>
     * Indicates the instance of AVPlayer for which the AVPlayerLayer displays visual output
     */
    @Generated
    @Selector("setPlayer:")
    public native void setPlayer(AVPlayer value);

    /**
     * [@property] videoGravity
     * <p>
     * A string defining how the video is displayed within an AVPlayerLayer bounds rect.
     * [@discusssion] Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill
     * and AVLayerVideoGravityResize. AVLayerVideoGravityResizeAspect is default.
     * See <AVFoundation/AVAnimation.h> for a description of these options.
     */
    @Generated
    @Selector("setVideoGravity:")
    public native void setVideoGravity(String value);

    /**
     * [@property] videoGravity
     * <p>
     * A string defining how the video is displayed within an AVPlayerLayer bounds rect.
     * [@discusssion] Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill
     * and AVLayerVideoGravityResize. AVLayerVideoGravityResizeAspect is default.
     * See <AVFoundation/AVAnimation.h> for a description of these options.
     */
    @Generated
    @Selector("videoGravity")
    public native String videoGravity();

    /**
     * [@property] videoRect
     * <p>
     * The current size and position of the video image as displayed within the receiver's bounds.
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
    public static native double cornerCurveExpansionFactor(String curve);
}
