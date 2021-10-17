package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.struct.MPSScaleTransform;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSImageScale
 * <p>
 * Resize an image and / or change its aspect ratio
 * <p>
 * The MPSImageScale filter can be used to resample an existing image
 * using a different sampling frequency in each dimension. This can be
 * used to enlarge or reduce the size of an image, or change the aspect
 * ratio of an image.
 * <p>
 * The resample methods supported are:
 * Bilinear
 * Bicubcic
 * Lanczos
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageScale extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageScale(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageScale alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageScale allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native MPSImageScale init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageScale initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly.  To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageScale initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * You must use one of the sub-classes of MPSImageScale
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSImageScale initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSImageScale new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   scaleTransform
     * <p>
     * An optional transform that describes how to scale and translate the source image
     * <p>
     * If the scaleTransform is NULL, then any image scaling factor such as MPSImageLanczosScale
     * will rescale the image so that the source image fits exactly into the destination
     * texture.  If the transform is not NULL, then the transform is used for determining
     * how to map the source image to the destination. Default: NULL
     * <p>
     * When the scaleTransform is set to non-NULL, the values pointed to by the new
     * scaleTransform are copied to object storage, and the pointer is updated to point
     * to internal storage. Do not attempt to free it.  You may free your copy of
     * the MPSScaleTransform as soon as the property set operation is complete.
     * <p>
     * When calculating a scaleTransform, use the limits of the bounding box for the intended
     * source region of interest and the destination clipRect. Adjustments for pixel center
     * coordinates are handled internally to the function.  For example,
     * the scale transform to convert the entire source image to the entire destination image
     * size (clipRect = MPSRectNoClip) would be:
     * <p>
     * [@code]
     * scaleTransform.scaleX = (double) dest.width / source.width;
     * scaleTransform.scaleY = (double) dest.height / source.height;
     * scaleTransform.translateX = scaleTransform.translateY = 0.0;
     * [@endcode]
     * <p>
     * The translation parameters allow you to adjust the region of the source image used
     * to create the destination image. They are in destination coordinates. To place the
     * top left corner of the destination clipRect to represent the position {x,y} in source
     * coordinates, we solve for the translation based on the standard scale matrix operation
     * for each axis:
     * <p>
     * [@code]
     * dest_position = source_position * scale + translation;
     * translation = dest_position - source_position * scale;
     * [@endcode]
     * <p>
     * For the top left corner of the clipRect, the dest_position is considered to be {0,0}.
     * This gives us a translation of:
     * <p>
     * [@code]
     * scaleTransform.translateX = -source_origin.x * scaleTransform.scaleX;
     * scaleTransform.translateY = -source_origin.y * scaleTransform.scaleY;
     * [@endcode]
     * <p>
     * One would typically use non-zero translations to do tiling, or provide a resized
     * view into a internal segment of an image.
     * <p>
     * NOTE:  Changing the Lanczos scale factor may trigger recalculation of signficant state internal
     * to the object when the filter is encoded to the command buffer. The scale factor is
     * scaleTransform->scaleX,Y, or the ratio of source and destination image sizes if
     * scaleTransform is NULL. Reuse a MPSImageLanczosScale object for frequently used scalings
     * to avoid redundantly recreating expensive resampling state.
     */
    @Generated
    @Selector("scaleTransform")
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native MPSScaleTransform scaleTransform();

    /**
     * [@property]   scaleTransform
     * <p>
     * An optional transform that describes how to scale and translate the source image
     * <p>
     * If the scaleTransform is NULL, then any image scaling factor such as MPSImageLanczosScale
     * will rescale the image so that the source image fits exactly into the destination
     * texture.  If the transform is not NULL, then the transform is used for determining
     * how to map the source image to the destination. Default: NULL
     * <p>
     * When the scaleTransform is set to non-NULL, the values pointed to by the new
     * scaleTransform are copied to object storage, and the pointer is updated to point
     * to internal storage. Do not attempt to free it.  You may free your copy of
     * the MPSScaleTransform as soon as the property set operation is complete.
     * <p>
     * When calculating a scaleTransform, use the limits of the bounding box for the intended
     * source region of interest and the destination clipRect. Adjustments for pixel center
     * coordinates are handled internally to the function.  For example,
     * the scale transform to convert the entire source image to the entire destination image
     * size (clipRect = MPSRectNoClip) would be:
     * <p>
     * [@code]
     * scaleTransform.scaleX = (double) dest.width / source.width;
     * scaleTransform.scaleY = (double) dest.height / source.height;
     * scaleTransform.translateX = scaleTransform.translateY = 0.0;
     * [@endcode]
     * <p>
     * The translation parameters allow you to adjust the region of the source image used
     * to create the destination image. They are in destination coordinates. To place the
     * top left corner of the destination clipRect to represent the position {x,y} in source
     * coordinates, we solve for the translation based on the standard scale matrix operation
     * for each axis:
     * <p>
     * [@code]
     * dest_position = source_position * scale + translation;
     * translation = dest_position - source_position * scale;
     * [@endcode]
     * <p>
     * For the top left corner of the clipRect, the dest_position is considered to be {0,0}.
     * This gives us a translation of:
     * <p>
     * [@code]
     * scaleTransform.translateX = -source_origin.x * scaleTransform.scaleX;
     * scaleTransform.translateY = -source_origin.y * scaleTransform.scaleY;
     * [@endcode]
     * <p>
     * One would typically use non-zero translations to do tiling, or provide a resized
     * view into a internal segment of an image.
     * <p>
     * NOTE:  Changing the Lanczos scale factor may trigger recalculation of signficant state internal
     * to the object when the filter is encoded to the command buffer. The scale factor is
     * scaleTransform->scaleX,Y, or the ratio of source and destination image sizes if
     * scaleTransform is NULL. Reuse a MPSImageLanczosScale object for frequently used scalings
     * to avoid redundantly recreating expensive resampling state.
     */
    @Generated
    @Selector("setScaleTransform:")
    public native void setScaleTransform(
            @UncertainArgument("Options: reference, array Fallback: reference") MPSScaleTransform value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
