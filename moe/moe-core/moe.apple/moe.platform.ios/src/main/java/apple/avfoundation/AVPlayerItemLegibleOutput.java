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
import apple.avfoundation.protocol.AVPlayerItemLegibleOutputPushDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVPlayerItemLegibleOutput
 * 
 * A subclass of AVPlayerItemOutput that can vend media with a legible characteristic as NSAttributedStrings.
 * 
 * An instance of AVPlayerItemLegibleOutput is typically initialized using the -init method.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemLegibleOutput extends AVPlayerItemOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemLegibleOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemLegibleOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerItemLegibleOutput allocWithZone(VoidPtr zone);

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
    public static native AVPlayerItemLegibleOutput new_objc();

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
     * [@property] advanceIntervalForDelegateInvocation
     * 
     * Permits advance invocation of the associated delegate, if any.
     * 
     * If it is possible, an AVPlayerItemLegibleOutput will message its delegate advanceIntervalForDelegateInvocation
     * seconds earlier than otherwise. If the value you provide is large, effectively requesting provision of samples
     * earlier than the AVPlayerItemLegibleOutput is prepared to act on them, the delegate will be invoked as soon as
     * possible.
     */
    @Generated
    @Selector("advanceIntervalForDelegateInvocation")
    public native double advanceIntervalForDelegateInvocation();

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * The delegate is held using a zeroing-weak reference, so this property will have a value of nil after a delegate
     * that was previously set has been deallocated. This property is not key-value observable.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPlayerItemLegibleOutputPushDelegate delegate();

    /**
     * [@property] delegateQueue
     * 
     * The dispatch queue where the delegate is messaged.
     * 
     * This property is not key-value observable.
     */
    @Nullable
    @Generated
    @Selector("delegateQueue")
    public native NSObject delegateQueue();

    @Generated
    @Selector("init")
    public native AVPlayerItemLegibleOutput init();

    /**
     * initWithMediaSubtypesForNativeRepresentation:
     * 
     * Returns an instance of AVPlayerItemLegibleOutput with filtering enabled for
     * AVPlayerItemLegibleOutputPushDelegate's
     * legibleOutput:didOutputAttributedStrings:nativeSampleBuffers:forItemTime:.
     * 
     * Add media subtype FourCC number objects to the subtypes array to elect to receive that type as a CMSampleBuffer
     * instead of an NSAttributedString. Initializing an AVPlayerItemLegibleOutput using the -init method is equivalent
     * to calling -initWithMediaSubtypesForNativeRepresentation: with an empty array, which means that all legible data,
     * regardless of media subtype, will be delivered using NSAttributedString in a common format.
     * 
     * If a media subtype for which there is no legible data in the current player item is included in the media
     * subtypes array, no error will occur. AVPlayerItemLegibleOutput will not vend closed caption data as
     * CMSampleBuffers, so it is an error to include 'c608' in the media subtypes array.
     * 
     * This method throws an exception if any media subtype is kCMClosedCaptionFormatType_CEA608 (native representation
     * is not available for media subtype).
     * 
     * @param subtypes
     *                 NSArray of NSNumber FourCC codes, e.g. @[ [NSNumber numberWithUnsignedInt:'tx3g'] ]
     * @return An instance of AVPlayerItemLegibleOutput.
     */
    @Generated
    @Selector("initWithMediaSubtypesForNativeRepresentation:")
    public native AVPlayerItemLegibleOutput initWithMediaSubtypesForNativeRepresentation(
            @NotNull NSArray<? extends NSNumber> subtypes);

    /**
     * [@property] advanceIntervalForDelegateInvocation
     * 
     * Permits advance invocation of the associated delegate, if any.
     * 
     * If it is possible, an AVPlayerItemLegibleOutput will message its delegate advanceIntervalForDelegateInvocation
     * seconds earlier than otherwise. If the value you provide is large, effectively requesting provision of samples
     * earlier than the AVPlayerItemLegibleOutput is prepared to act on them, the delegate will be invoked as soon as
     * possible.
     */
    @Generated
    @Selector("setAdvanceIntervalForDelegateInvocation:")
    public native void setAdvanceIntervalForDelegateInvocation(double value);

    /**
     * setDelegate:queue:
     * 
     * Sets the receiver's delegate and a dispatch queue on which the delegate will be called.
     * 
     * The delegate is held using a zeroing-weak reference, so it is safe to deallocate the delegate while the receiver
     * still has a reference to it.
     * 
     * @param delegate
     *                      An object conforming to AVPlayerItemLegibleOutputPushDelegate protocol.
     * @param delegateQueue
     *                      A dispatch queue on which all delegate methods will be called.
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(
            @Nullable @Mapped(ObjCObjectMapper.class) AVPlayerItemLegibleOutputPushDelegate delegate,
            @Nullable NSObject delegateQueue);

    /**
     * [@property] textStylingResolution
     * 
     * A string identifier indicating the degree of text styling to be applied to attributed strings vended by the
     * receiver
     * 
     * Valid values are AVPlayerItemLegibleOutputTextStylingResolutionDefault and
     * AVPlayerItemLegibleOutputTextStylingResolutionSourceAndRulesOnly. An NSInvalidArgumentException is raised if this
     * property is set to any other value. The default value is AVPlayerItemLegibleOutputTextStylingResolutionDefault,
     * which indicates that attributed strings vended by the receiver will include the same level of styling information
     * that would be used if AVFoundation were rendering the text via AVPlayerLayer.
     */
    @Generated
    @Selector("setTextStylingResolution:")
    public native void setTextStylingResolution(@NotNull String value);

    /**
     * [@property] textStylingResolution
     * 
     * A string identifier indicating the degree of text styling to be applied to attributed strings vended by the
     * receiver
     * 
     * Valid values are AVPlayerItemLegibleOutputTextStylingResolutionDefault and
     * AVPlayerItemLegibleOutputTextStylingResolutionSourceAndRulesOnly. An NSInvalidArgumentException is raised if this
     * property is set to any other value. The default value is AVPlayerItemLegibleOutputTextStylingResolutionDefault,
     * which indicates that attributed strings vended by the receiver will include the same level of styling information
     * that would be used if AVFoundation were rendering the text via AVPlayerLayer.
     */
    @NotNull
    @Generated
    @Selector("textStylingResolution")
    public native String textStylingResolution();
}
