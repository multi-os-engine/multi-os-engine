package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

/**
 * MPSNNPadGradient
 * [@dependency] This depends on Metal.framework
 * <p>
 * Computes the gradient for the @ref MPSNNPad layer.
 * Since the padding forward operation typically increases the size of the image, the gradient operation
 * decreases it. In case of zero or constant padding forward operation the gradient operation slices the
 * input gradient and in other edge modes the padded values copied in the forward operation are
 * summed together in the gradient operation.
 * For Example for the @ref MPSImageEdgeModeClamp the forward operation with offset = -2, destSize = 8
 * or @ref paddingSizeBefore = 2, @ref paddingSizeAfter = 3, sourceSize = 3:
 * [@code]
 * Source Image:
 * |--------------|
 * | x0 | x1 | x2 |
 * |--------------|
 * Destination Image:
 * |---------------------------------------|
 * | x0 | x0 | x0 | x1 | x2 | x2 | x2 | x2 |
 * |---------------------------------------|
 * [@endcode]
 * Then the gradient operation becomes:
 * [@code]
 * Source Gradient Image:
 * |---------------------------------------|
 * | d0 | d1 | d2 | d3 | d4 | d5 | d6 | d7 |
 * |---------------------------------------|
 * Destination Gradient Image:
 * |-----------------------------|
 * | d0+d1+d2 | d3 | d4+d5+d6+d7 |
 * |-----------------------------|
 * [@endcode]
 * Another example with @ref MPSImageEdgeModeMirror, the forward operation with offset = -4, destSize = 8
 * or @ref paddingSizeBefore = 4, @ref paddingSizeAfter = 1, sourceSize = 3:
 * [@code]
 * Source Image:
 * |--------------|
 * | x0 | x1 | x2 |
 * |--------------|
 * Destination Image:
 * |---------------------------------------|
 * | x0 | x1 | x2 | x1 | x0 | x1 | x2 | x1 |
 * |---------------------------------------|
 * [@endcode]
 * Then the gradient operation becomes:
 * [@code]
 * Source Gradient Image:
 * |---------------------------------------|
 * | d0 | d1 | d2 | d3 | d4 | d5 | d6 | d7 |
 * |---------------------------------------|
 * Destination Gradient Image:
 * |-----------------------------|
 * | d0+d4 | d1+d3+d5+d7 | d2+d6 |
 * |-----------------------------|
 * [@endcode]
 * <p>
 * NOTE: There are no channel fill-values to use with @ref MPSImageEdgeModeConstant
 * since the gradient values are independent of the constant of the forward pass.
 * NOTE: In case the forward pass defined a slice operation in feature channels then
 * the channels not read in the forward pass will be filled with zeros in the gradient pass.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNPadGradient extends MPSCNNGradientKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNPadGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNPadGradient alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNPadGradient allocWithZone(VoidPtr zone);

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
    public native MPSNNPadGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNPadGradient initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * See @ref MPSKernel#initWithCoder.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSNNPadGradient.
     * @param device   The MTLDevice on which to make the MPSNNPadGradient.
     * @return A new MPSNNPadGradient object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNPadGradient initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a MPSNNPadGradient filter
     *
     * @param device The MTLDevice on which this filter will be used
     * @return A valid MPSNNPadGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSNNPadGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSNNPadGradient new_objc();

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
