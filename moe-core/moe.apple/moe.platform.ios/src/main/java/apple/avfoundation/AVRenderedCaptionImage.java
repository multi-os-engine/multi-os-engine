package apple.avfoundation;

import apple.NSObject;
import apple.corefoundation.struct.CGPoint;
import apple.corevideo.opaque.CVBufferRef;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVRenderedCaptionImage
 * 
 * AVRenderedCaptionImage is a wrapper class vended out to the client for reading a rendered caption image
 * (CVPixelBuffer) and its associated position (in pixels). The position is relative to the videoDisplaySize (in pixels)
 * provided by the client during the initialization of AVPlayerItemRenderedLegibleOutput, and accordinging to the
 * upper-left-origin coordinate system (ULO). The CVPixelBuffer will be backed by an IOSurface enabling it to be
 * converted to MTLTexture using CVMetalTextureCache.
 * 
 * Display scale is a property of the screen on which the client UI elements are displayed. This value defines the
 * mapping between the logical coordinate space (measured in points) and the physical coordinate space (measured in
 * pixels). Higher scale factors indicate that each point is represented by more than one pixel at render time. For
 * example, if the display scale factor is 2.0 and the bounds of caption rectangle are 50 x 50 points, the size of the
 * CVPixelBufferRef for the caption is 100 x 100 pixels. The client shall provide videoDisplaySize value in pixels only
 * and the position value of the caption image shall also be returned in pixels only.
 * 
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVRenderedCaptionImage extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVRenderedCaptionImage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVRenderedCaptionImage alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVRenderedCaptionImage allocWithZone(VoidPtr zone);

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
    public native AVRenderedCaptionImage init();

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
    public static native AVRenderedCaptionImage new_objc();

    /**
     * [@property] pixelBuffer
     * 
     * A CVPixelBufferRef that contains pixel data for the rendered caption.
     * 
     * If the client reads a pixelBuffer and wants to use it longer than AVRenderedCaptionImage, it must retain the
     * pixelBuffer. The pixel buffer can be converted to MTLTexture using CVMetalTextureCache. The pixel format is fixed
     * to kCVPixelFormatType_32BGRA defined in <CoreVideo/CVPixelBuffer.h>.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("pixelBuffer")
    @NotNull
    public native CVBufferRef pixelBuffer();

    /**
     * [@property] position
     * 
     * A CGPoint that defines the position (in pixels) of the rendered caption image relative to the video frame
     * 
     * To place the caption image correcly, the size of pixel buffer can be extracted from CVPixelBufferGetWidth and
     * CVPixelBufferGetHeight. Origin is assumed at upper-left. So, a caption image is rendered to the right and bottom
     * of the origin point.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("position")
    @ByValue
    public native CGPoint position();

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