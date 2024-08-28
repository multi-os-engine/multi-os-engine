package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMTaggedBufferGroupRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVPlayerVideoOutput
 * 
 * AVPlayerVideoOutput offers a way to attach to an AVPlayer and receive video frames and video-related data vended
 * through CMTaggedBufferGroups.
 * 
 * AVPlayerVideoOutput can be attached to an AVPlayer using AVPlayer's method addVideoOutput:
 * Note: An AVPlayerVideoOutput can only be attached to a single player at a time, attempting to attach to multiple
 * player will result in an exception being thrown.
 * 
 * API-Since: 17.2
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerVideoOutput extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerVideoOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerVideoOutput alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVPlayerVideoOutput allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * copyTaggedBufferGroupForHostTime:presentationTimeStamp:activeConfiguration
     * 
     * Retrieves a tagged buffer group that is appropriate for display at the specified host time.
     * 
     * The client is responsible for releasing the returned CMTaggedBufferGroup.
     * 
     * @param hostTime
     *                              A CMTime that expresses a desired host time.
     * @param presentationTimeStamp
     *                              On return points to a CMTime whose value is the presentation time in terms of the
     *                              corresponding AVPlayerItem's timebase for the copied tagged buffer group, or
     *                              kCMTimeInvalid if no sample is available for the provided hostTime.
     *                              Note: This timestamp is in terms of the timebase of the AVPlayerItem for which this
     *                              sample is associated.
     * @param activeConfiguration
     *                              On return points to the active configuration associated with the copied tagged
     *                              buffer group, or nil, if no sample is available for the provided hostTime.
     * @return A tagged buffer group for the specified host time if a sample is available, and NULL otherwise.
     */
    @Generated
    @Selector("copyTaggedBufferGroupForHostTime:presentationTimeStamp:activeConfiguration:")
    @Nullable
    public native CMTaggedBufferGroupRef copyTaggedBufferGroupForHostTimePresentationTimeStampActiveConfiguration(
            @ByValue CMTime hostTime,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable CMTime presentationTimeStampOut,
            @ReferenceInfo(type = AVPlayerVideoOutputConfiguration.class) @Nullable Ptr<AVPlayerVideoOutputConfiguration> activeConfigurationOut);

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
    @Selector("init")
    public native AVPlayerVideoOutput init();

    /**
     * initWithSpecification:
     * 
     * Creates an instance of AVPlayerVideoOutput, initialized with the specified video output specification.
     * 
     * Pixel buffer attributes will be selected from the input AVVideoOutputSpecification based on the data channels
     * selected for an item.
     * If no pixel buffer attributes were set for the selected tag collection, then the default pixel buffer attributes
     * from the AVVideoOutputSpecification will be used if those were set.
     * 
     * @param specification
     *                      An instance of AVVideoOutputSpecification, used to recommend data channels to the AVPlayer
     *                      associated with this AVPlayerVideoOutput.
     *                      The tag collections owned by the AVVideoOutputSpecification will be given a priority based
     *                      on their position in the array which they are held by AVVideoOutputSpecification, meaning
     *                      position i takes priority over position i+1.
     *                      This means that the player will first check if the tag collection at index 0 matches the
     *                      shape of the current item's data channels.
     *                      If the item's data channels would not be able satisfy the shape of the requested tag
     *                      collection, it will fall back to the next collection and repeat this process.
     *                      This continues until a tag collection or set of tag collection can be selected, otherwise if
     *                      no collections match the shape of the item’s data channels then samples cannot be vended for
     *                      that item.
     * @return An instance of AVPlayerVideoOutput.
     */
    @Generated
    @Selector("initWithSpecification:")
    public native AVPlayerVideoOutput initWithSpecification(@NotNull AVVideoOutputSpecification specification);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlayerVideoOutput new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}