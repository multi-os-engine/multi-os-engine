package apple.cinematic;

import apple.NSObject;
import apple.avfoundation.AVTimedMetadataGroup;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
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
 * Frame-specific information required to render a frame in a rendering session.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Cinematic")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNRenderingSessionFrameAttributes extends NSObject implements NSCopying, NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CNRenderingSessionFrameAttributes(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNRenderingSessionFrameAttributes alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CNRenderingSessionFrameAttributes allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The f-stop value which inversely affects the aperture used to render the image.
     * 
     * A smaller f/ number results in larger bokeh and a shallower depth of field in the rendered image.
     */
    @Generated
    @Selector("fNumber")
    public native float fNumber();

    /**
     * The disparity value which represents the focus plane at which the rendered image should be in focus.
     * 
     * A larger disparity results in the focus plane being closer to the camera. The scale and offset of disparity is
     * not defined.
     * It is best practice to obtain disparity values from detections or by interpolation between known disparity
     * values.
     */
    @Generated
    @Selector("focusDisparity")
    public native float focusDisparity();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CNRenderingSessionFrameAttributes init();

    /**
     * Initialize rendering frame attributes from a sample buffer read from a cinematic metadata track.
     * - Parameters:
     * - sampleBuffer: A sample buffer read from the timed cinematic metadata track of a cinematic asset.
     * - sessionAttributes: Rendering session attributes loaded from a cinematic asset.
     */
    @Generated
    @Selector("initWithSampleBuffer:sessionAttributes:")
    public native CNRenderingSessionFrameAttributes initWithSampleBufferSessionAttributes(
            @NotNull CMSampleBufferRef sampleBuffer, @NotNull CNRenderingSessionAttributes sessionAttributes);

    /**
     * Initialize rendering frame attributes from a timed metadata group read from a cinematic metadata track.
     * - Parameters:
     * - metadataGroup: An AVTimedMetadataGroup read from the timed cinematic metadata track of a cinematic asset.
     * - sessionAttributes: Rendering session attributes loaded from a cinematic asset.
     */
    @Generated
    @Selector("initWithTimedMetadataGroup:sessionAttributes:")
    public native CNRenderingSessionFrameAttributes initWithTimedMetadataGroupSessionAttributes(
            @NotNull AVTimedMetadataGroup metadataGroup, @NotNull CNRenderingSessionAttributes sessionAttributes);

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
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Owned
    @Selector("new")
    public static native CNRenderingSessionFrameAttributes new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The f-stop value which inversely affects the aperture used to render the image.
     * 
     * A smaller f/ number results in larger bokeh and a shallower depth of field in the rendered image.
     */
    @Generated
    @Selector("setFNumber:")
    public native void setFNumber(float value);

    /**
     * The disparity value which represents the focus plane at which the rendered image should be in focus.
     * 
     * A larger disparity results in the focus plane being closer to the camera. The scale and offset of disparity is
     * not defined.
     * It is best practice to obtain disparity values from detections or by interpolation between known disparity
     * values.
     */
    @Generated
    @Selector("setFocusDisparity:")
    public native void setFocusDisparity(float value);

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