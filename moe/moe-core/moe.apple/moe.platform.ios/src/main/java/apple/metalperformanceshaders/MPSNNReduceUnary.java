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
 * MPSNNReduceUnary
 * 
 * The MPSNNReduce performs a reduction operation
 * The reduction operations supported are:
 * - Reduce row min
 * - Reduce column min
 * - Reduce feature channels min
 * - Reduce row max
 * - Reduce column max
 * - Reduce feature channels max
 * - Reduce row mean
 * - Reduce column mean
 * - Reduce feature channels mean
 * - Reduce row sum
 * - Reduce column sum
 * - Reduce feature channels sum
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNReduceUnary extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNReduceUnary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNReduceUnary alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNReduceUnary allocWithZone(VoidPtr zone);

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

    /**
     * [@property] clipRectSource
     * 
     * The source rectangle to use when reading data.
     * 
     * A MTLRegion that indicates which part of the source to read. If the clipRectSource does not lie
     * completely within the source image, the intersection of the image bounds and clipRectSource will
     * be used. The clipRectSource replaces the MPSCNNKernel offset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     */
    @Generated
    @Selector("clipRectSource")
    @ByValue
    public native MTLRegion clipRectSource();

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
    public native MPSNNReduceUnary init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNReduceUnary initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNReduceUnary initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNReduceUnary initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSNNReduceUnary new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] clipRectSource
     * 
     * The source rectangle to use when reading data.
     * 
     * A MTLRegion that indicates which part of the source to read. If the clipRectSource does not lie
     * completely within the source image, the intersection of the image bounds and clipRectSource will
     * be used. The clipRectSource replaces the MPSCNNKernel offset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     */
    @Generated
    @Selector("setClipRectSource:")
    public native void setClipRectSource(@ByValue MTLRegion value);

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
    @Selector("offset")
    @ByValue
    public native MPSOffset offset();

    /**
     * Since the clipRectSource replaces the MPSCNNKernel offset parameter for this filter,
     * this property is deprecated..
     * 
     * API-Since: 11.3
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("setOffset:")
    public native void setOffset(@ByValue MPSOffset value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
