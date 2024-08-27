package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTLRegion;
import apple.metalperformanceshaders.struct.MPSOffset;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSNNReduceBinary
 * 
 * The MPSNNReduce performs a reduction operation
 * The reduction operations supported are:
 * - Reduce feature channels mean
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNReduceBinary extends MPSCNNBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNReduceBinary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNReduceBinary alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNReduceBinary allocWithZone(VoidPtr zone);

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
    public native MPSNNReduceBinary init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNReduceBinary initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNReduceBinary initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNReduceBinary initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSNNReduceBinary new_objc();

    /**
     * The source rectangle to use when reading data from primary source
     * 
     * A MTLRegion that indicates which part of the primary source to read. If the clipRectPrimarySource does not lie
     * completely within the primary source image, the intersection of the image bounds and clipRectPrimarySource will
     * be used. The primarySourceClipRect replaces the MPSBinaryImageKernel primaryOffset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     * 
     * The clipRect specified in MPSBinaryImageKernel is used to control the origin in the destination texture
     * where the min, max values are written. The clipRect.width must be >=2. The clipRect.height must be >= 1.
     */
    @Generated
    @Selector("primarySourceClipRect")
    @ByValue
    public native MTLRegion primarySourceClipRect();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The source rectangle to use when reading data from secondary source
     * 
     * A MTLRegion that indicates which part of the secondary source to read. If the clipRectSecondarySource does not
     * lie
     * completely within the secondary source image, the intersection of the image bounds and clipRectSecondarySource
     * will
     * be used. The secondarySourceClipRect replaces the MPSBinaryImageKernel secondaryOffset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     * 
     * The clipRect specified in MPSBinaryImageKernel is used to control the origin in the destination texture
     * where the min, max values are written. The clipRect.width must be >=2. The clipRect.height must be >= 1.
     */
    @Generated
    @Selector("secondarySourceClipRect")
    @ByValue
    public native MTLRegion secondarySourceClipRect();

    /**
     * The source rectangle to use when reading data from primary source
     * 
     * A MTLRegion that indicates which part of the primary source to read. If the clipRectPrimarySource does not lie
     * completely within the primary source image, the intersection of the image bounds and clipRectPrimarySource will
     * be used. The primarySourceClipRect replaces the MPSBinaryImageKernel primaryOffset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     * 
     * The clipRect specified in MPSBinaryImageKernel is used to control the origin in the destination texture
     * where the min, max values are written. The clipRect.width must be >=2. The clipRect.height must be >= 1.
     */
    @Generated
    @Selector("setPrimarySourceClipRect:")
    public native void setPrimarySourceClipRect(@ByValue MTLRegion value);

    /**
     * The source rectangle to use when reading data from secondary source
     * 
     * A MTLRegion that indicates which part of the secondary source to read. If the clipRectSecondarySource does not
     * lie
     * completely within the secondary source image, the intersection of the image bounds and clipRectSecondarySource
     * will
     * be used. The secondarySourceClipRect replaces the MPSBinaryImageKernel secondaryOffset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     * 
     * The clipRect specified in MPSBinaryImageKernel is used to control the origin in the destination texture
     * where the min, max values are written. The clipRect.width must be >=2. The clipRect.height must be >= 1.
     */
    @Generated
    @Selector("setSecondarySourceClipRect:")
    public native void setSecondarySourceClipRect(@ByValue MTLRegion value);

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

    /**
     * Since the clipRectSource replaces the MPSCNNKernel offset parameter for this filter,
     * this property is deprecated..
     * 
     * API-Since: 11.3
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("primaryOffset")
    @ByValue
    public native MPSOffset primaryOffset();

    /**
     * Since the clipRectSource replaces the MPSCNNKernel offset parameter for this filter,
     * this property is deprecated..
     * 
     * API-Since: 11.3
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("secondaryOffset")
    @ByValue
    public native MPSOffset secondaryOffset();

    /**
     * Since the clipRectSource replaces the MPSCNNKernel offset parameter for this filter,
     * this property is deprecated..
     * 
     * API-Since: 11.3
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("setPrimaryOffset:")
    public native void setPrimaryOffset(@ByValue MPSOffset value);

    /**
     * Since the clipRectSource replaces the MPSCNNKernel offset parameter for this filter,
     * this property is deprecated..
     * 
     * API-Since: 11.3
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("setSecondaryOffset:")
    public native void setSecondaryOffset(@ByValue MPSOffset value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
