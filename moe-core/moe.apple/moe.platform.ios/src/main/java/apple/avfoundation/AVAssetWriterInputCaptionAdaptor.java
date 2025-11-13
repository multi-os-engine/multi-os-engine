package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetWriterInputCaptionAdaptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetWriterInputCaptionAdaptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetWriterInputCaptionAdaptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVAssetWriterInputCaptionAdaptor allocWithZone(VoidPtr zone);

    /**
     * Append a single caption to be written.
     * 
     * If this method returns NO, check the value of AVAssetWriter.status on the attached asset writer to determine why
     * appending failed.
     * 
     * The start time of each caption's timeRange property must be numeric (see CMTIME_IS_NUMERIC) and must be at least
     * as large as the start time of any previous caption (including any captions present in a group appended via
     * -appendCaptionGroup:). In other words, the sequence of captions appended using this method must have
     * monotonically increasing start times.
     * 
     * The duration of each caption's timeRange property must be numeric.
     * 
     * - Parameter caption: The caption to append.
     * 
     * - Returns: Returns YES if the operation succeeded, NO if it failed.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("appendCaption:")
    public native boolean appendCaption(@NotNull AVCaption caption);

    /**
     * Append a group of captions to be written.
     * 
     * If this method returns NO, check the value of AVAssetWriter.status on the attached asset writer to determine why
     * appending failed.
     * When appending a sequence of captions groups, the start time of each group must be equal to or greater than the
     * end time of any previous group. The easiest way to achieve this is to create the group using a caption whose
     * duration is kCMTimeInvalid, in which case the duration will be determined by subtracting the start time of the
     * group from the start time of the next appended group.
     * When mixing calls to -appendCaptionGroup: and -appendCaption:, the start time of each group must be equal to or
     * greater than the end time of any previous captions.
     * To mark a time range containing no captions, append a group containing an empty caption array.
     * 
     * - Parameter captionGroup:
     * 
     * - Returns: Returns YES if the operation succeeded, NO if it failed.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("appendCaptionGroup:")
    public native boolean appendCaptionGroup(@NotNull AVCaptionGroup captionGroup);

    /**
     * The asset writer input that was used to initialize the receiver.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("assetWriterInput")
    @NotNull
    public native AVAssetWriterInput assetWriterInput();

    /**
     * Creates a new caption adaptor for writing to the specified asset writer input.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("assetWriterInputCaptionAdaptorWithAssetWriterInput:")
    public static native AVAssetWriterInputCaptionAdaptor assetWriterInputCaptionAdaptorWithAssetWriterInput(
            @NotNull AVAssetWriterInput input);

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
    public native AVAssetWriterInputCaptionAdaptor init();

    /**
     * Creates a new caption adaptor for writing to the specified asset writer input.
     * 
     * This method thows an exception for any of the following reasons:
     * - input is nil
     * - the input's media type is not supported (should use text or closed caption)
     * - the input is already attached to an asset writer caption adaptor
     * - the input has already started writing
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithAssetWriterInput:")
    public native AVAssetWriterInputCaptionAdaptor initWithAssetWriterInput(@NotNull AVAssetWriterInput input);

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
    public static native AVAssetWriterInputCaptionAdaptor new_objc();

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