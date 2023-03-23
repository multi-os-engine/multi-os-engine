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
import apple.avfoundation.protocol.AVPlayerItemOutputPullDelegate;
import apple.coremedia.struct.CMTime;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 6.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemVideoOutput extends AVPlayerItemOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemVideoOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemVideoOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerItemVideoOutput allocWithZone(VoidPtr zone);

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
    public static native AVPlayerItemVideoOutput new_objc();

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
     * copyPixelBufferForItemTime:itemTimeForDisplay:
     * 
     * Retrieves an image that is appropriate for display at the specified item time, and marks the image as acquired.
     * 
     * The client is responsible for calling CVBufferRelease on the returned CVPixelBuffer when finished with it.
     * 
     * Typically you would call this method in response to a CVDisplayLink callback or CADisplayLink delegate invocation
     * and if hasNewPixelBufferForItemTime: also returns YES.
     * 
     * The buffer reference retrieved from copyPixelBufferForItemTime:itemTimeForDisplay: may itself be NULL. A
     * reference to a NULL pixel buffer communicates that nothing should be displayed for the supplied item time.
     * 
     * @param itemTime
     *                           A CMTime that expresses a desired item time.
     * @param itemTimeForDisplay
     *                           A CMTime pointer whose value will contain the true display deadline for the copied
     *                           pixel buffer. Can be NULL.
     */
    @Generated
    @Selector("copyPixelBufferForItemTime:itemTimeForDisplay:")
    public native CVBufferRef copyPixelBufferForItemTimeItemTimeForDisplay(@ByValue CMTime itemTime,
            CMTime outItemTimeForDisplay);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPlayerItemOutputPullDelegate delegate();

    /**
     * [@property] delegateQueue
     * 
     * The dispatch queue where the delegate is messaged.
     */
    @Generated
    @Selector("delegateQueue")
    public native NSObject delegateQueue();

    /**
     * hasNewPixelBufferForItemTime:
     * 
     * Query if any new video output is available for an item time.
     * 
     * This method returns YES if there is available video output, appropriate for display, at the specified item time
     * not marked as acquired. If you require multiple objects to acquire video output from the same AVPlayerItem, you
     * should instantiate more than one AVPlayerItemVideoOutput and add each via addOutput:. Each
     * AVPlayerItemVideoOutput maintains a separate record of client acquisition.
     * 
     * @param itemTime
     *                 The item time to query.
     * @return A BOOL indicating if there is newer output.
     */
    @Generated
    @Selector("hasNewPixelBufferForItemTime:")
    public native boolean hasNewPixelBufferForItemTime(@ByValue CMTime itemTime);

    @Generated
    @Selector("init")
    public native AVPlayerItemVideoOutput init();

    /**
     * initWithOutputSettings:
     * 
     * Returns an instance of AVPlayerItemVideoOutput, initialized with the specified output settings, for video image
     * output.
     * 
     * This method throws an exception for any of the following reasons:
     * - the output settings dictionary is empty
     * - the settings will yield compressed output
     * - the settings do not honor the requirements listed above for outputSettings
     * 
     * API-Since: 10.0
     * 
     * @param outputSettings
     *                       The client requirements for output CVPixelBuffers, expressed using the constants in
     *                       AVVideoSettings.h.
     * 
     *                       For uncompressed video output, start with kCVPixelBuffer* keys in
     *                       <CoreVideo/CVPixelBuffer.h>.
     * 
     *                       In addition to the keys in CVPixelBuffer.h, uncompressed video settings dictionaries may
     *                       also contain the following keys:
     * 
     *                       AVVideoAllowWideColorKey
     * 
     * @return An instance of AVPlayerItemVideoOutput.
     */
    @Generated
    @Selector("initWithOutputSettings:")
    public native AVPlayerItemVideoOutput initWithOutputSettings(NSDictionary<String, ?> outputSettings);

    /**
     * initWithPixelBufferAttributes:
     * 
     * Returns an instance of AVPlayerItemVideoOutput, initialized with the specified pixel buffer attributes, for video
     * image output.
     * 
     * This method throws an exception if the pixel buffer attributes contain keys that are not pixel buffer attribute
     * keys.
     * 
     * @param pixelBufferAttributes
     *                              The client requirements for output CVPixelBuffers, expressed using the constants in
     *                              <CoreVideo/CVPixelBuffer.h>.
     * @return An instance of AVPlayerItemVideoOutput.
     */
    @Generated
    @Selector("initWithPixelBufferAttributes:")
    public native AVPlayerItemVideoOutput initWithPixelBufferAttributes(NSDictionary<String, ?> pixelBufferAttributes);

    /**
     * requestNotificationOfMediaDataChangeWithAdvanceInterval:
     * 
     * Informs the receiver that the AVPlayerItemVideoOutput client is entering a quiescent state.
     * 
     * Message this method before you suspend your use of a CVDisplayLink or CADisplayLink. The interval you provide
     * will be used to message your delegate, in advance, that it should resume the display link. If the interval you
     * provide is large, effectively requesting wakeup earlier than the AVPlayerItemVideoOutput is prepared to act, the
     * delegate will be invoked as soon as possible. Do not use this method to force a delegate invocation for each
     * sample.
     * 
     * @param interval
     *                 A wall clock time interval.
     */
    @Generated
    @Selector("requestNotificationOfMediaDataChangeWithAdvanceInterval:")
    public native void requestNotificationOfMediaDataChangeWithAdvanceInterval(double interval);

    /**
     * setDelegate:queue:
     * 
     * Sets the receiver's delegate and a dispatch queue on which the delegate will be called.
     * 
     * @param delegate
     *                      An object conforming to AVPlayerItemOutputPullDelegate protocol.
     * @param delegateQueue
     *                      A dispatch queue on which all delegate methods will be called.
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(@Mapped(ObjCObjectMapper.class) AVPlayerItemOutputPullDelegate delegate,
            NSObject delegateQueue);
}
