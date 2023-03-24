package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSNNResizeBilinear
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSNNResizeBilinear filter resizes the source image using bilinear interpolation to
 * a destination whose dimensions are given by resizeWidth and resizeHeight
 * 
 * The number of output feature channels remains the same as the number of input feature
 * channels.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNResizeBilinear extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNResizeBilinear(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] alignCorners
     * 
     * If YES, the centers of the 4 corner pixels of the input and output regions are aligned,
     * preserving the values at the corner pixels.
     * The default is NO.
     */
    @Generated
    @Selector("alignCorners")
    public native boolean alignCorners();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNResizeBilinear alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNResizeBilinear allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native MPSNNResizeBilinear init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNResizeBilinear initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSNNResizeBilinear
     * @param device   The MTLDevice on which to make the MPSNNResizeBilinear
     * @return A new MPSNNResizeBilinear object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNResizeBilinear initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNResizeBilinear initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the resize bilinear filter.
     * 
     * @param device       The device the filter will run on.
     * @param resizeWidth  The destination resize width in pixels
     * @param resizeHeight The destination resize height in pixels
     * @param alignCorners Specifier whether the centers of the 4 corner pixels of the input and output regions are
     *                     aligned,
     *                     preserving the values at the corner pixels.
     * @return A valid MPSNNResizeBilinear object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:resizeWidth:resizeHeight:alignCorners:")
    public native MPSNNResizeBilinear initWithDeviceResizeWidthResizeHeightAlignCorners(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long resizeWidth,
            @NUInt long resizeHeight, boolean alignCorners);

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
    public static native MPSNNResizeBilinear new_objc();

    /**
     * [@property] resizeHeight
     * 
     * The resize height.
     */
    @Generated
    @Selector("resizeHeight")
    @NUInt
    public native long resizeHeight();

    /**
     * [@property] resizeWidth
     * 
     * The resize width.
     */
    @Generated
    @Selector("resizeWidth")
    @NUInt
    public native long resizeWidth();

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
