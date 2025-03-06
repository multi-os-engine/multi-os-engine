package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVAssetReaderCaptionValidationHandling;
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
 * AVAssetReaderOutputCaptionAdaptor
 * 
 * An adaptor class for reading instances of AVCaptionGroup from a track containing timed text (i.e. subtitles or closed
 * captions).
 * 
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetReaderOutputCaptionAdaptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetReaderOutputCaptionAdaptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetReaderOutputCaptionAdaptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVAssetReaderOutputCaptionAdaptor allocWithZone(VoidPtr zone);

    /**
     * assetReaderOutputCaptionAdaptorWithAssetReaderTrackOutput:
     * 
     * Creates a new caption adaptor for reading from the given track output.
     * 
     * It is an error to pass nil to this method.
     * 
     * API-Since: 18.0
     * 
     * @param trackOutput
     *                    The track output from which to read captions.
     * @return
     *         A new instance of AVAssetReaderOutputCaptionAdaptor, configured to read captions from the given
     *         AVAssetReaderTrackOutput.
     */
    @Generated
    @Selector("assetReaderOutputCaptionAdaptorWithAssetReaderTrackOutput:")
    public static native AVAssetReaderOutputCaptionAdaptor assetReaderOutputCaptionAdaptorWithAssetReaderTrackOutput(
            @NotNull AVAssetReaderTrackOutput trackOutput);

    /**
     * [@property] assetReaderTrackOutput
     * 
     * The track output used to create the receiver.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("assetReaderTrackOutput")
    @NotNull
    public native AVAssetReaderTrackOutput assetReaderTrackOutput();

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

    /**
     * captionsNotPresentInPreviousGroupsInCaptionGroup:
     * 
     * Returns the set of captions that are present in the given group but were not present in any group previously
     * vended by calls to -nextCaptionGroup: on the receiver.
     * 
     * The returned array contains the set of captions in the given group whose time ranges have the same start time as
     * the group. This method is provided as a convenience for clients who want to process captions one-by-one and do
     * not need a complete view of the set of captions active at a given time.
     * 
     * API-Since: 18.0
     * 
     * @param captionGroup
     *                     The group containing the captions of interest.
     * @return
     *         An array of AVCaption objects.
     */
    @Generated
    @Selector("captionsNotPresentInPreviousGroupsInCaptionGroup:")
    @NotNull
    public native NSArray<? extends AVCaption> captionsNotPresentInPreviousGroupsInCaptionGroup(
            @NotNull AVCaptionGroup captionGroup);

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
    public native AVAssetReaderOutputCaptionAdaptor init();

    /**
     * initWithAssetReaderTrackOutput:
     * 
     * Creates a new caption adaptor for reading from the given track output.
     * 
     * It is an error to pass nil to this method.
     * 
     * API-Since: 18.0
     * 
     * @param trackOutput
     *                    The track output from which to read captions.
     * @return
     *         A new instance of AVAssetReaderOutputCaptionAdaptor, configured to read captions from the given
     *         AVAssetReaderTrackOutput.
     */
    @Generated
    @Selector("initWithAssetReaderTrackOutput:")
    public native AVAssetReaderOutputCaptionAdaptor initWithAssetReaderTrackOutput(
            @NotNull AVAssetReaderTrackOutput trackOutput);

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
    public static native AVAssetReaderOutputCaptionAdaptor new_objc();

    /**
     * nextCaptionGroup
     * 
     * Returns the next caption.
     * 
     * The method returns the next caption group.
     * 
     * This method throws an exception if the track output is not attached to an asset reader and reading has not yet
     * begun.
     * 
     * API-Since: 18.0
     * 
     * @return
     *         An instance of AVCaption representing the next caption.
     */
    @Generated
    @Selector("nextCaptionGroup")
    @Nullable
    public native AVCaptionGroup nextCaptionGroup();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] validationDelegate:
     * 
     * Register caption validation handling callback protocol to the caption adaptor.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setValidationDelegate:")
    public native void setValidationDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) @Nullable AVAssetReaderCaptionValidationHandling value);

    /**
     * [@property] validationDelegate:
     * 
     * Register caption validation handling callback protocol to the caption adaptor.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    public void setValidationDelegate(
            @Mapped(ObjCObjectMapper.class) @Nullable AVAssetReaderCaptionValidationHandling value) {
        Object __old = validationDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setValidationDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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

    /**
     * [@property] validationDelegate:
     * 
     * Register caption validation handling callback protocol to the caption adaptor.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("validationDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native AVAssetReaderCaptionValidationHandling validationDelegate();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}