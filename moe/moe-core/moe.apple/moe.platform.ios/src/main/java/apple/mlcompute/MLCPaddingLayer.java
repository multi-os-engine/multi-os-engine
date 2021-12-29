package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * MLCPaddingLayer
 * <p>
 * A padding layer
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCPaddingLayer extends MLCLayer implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCPaddingLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCPaddingLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCPaddingLayer allocWithZone(VoidPtr zone);

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

    /**
     * [@property]   constantValue
     * <p>
     * The constant value to use if padding type is constant.
     */
    @Generated
    @Selector("constantValue")
    public native float constantValue();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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
    public native MLCPaddingLayer init();

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

    /**
     * Create a padding layer with constant padding
     *
     * @param padding       The padding sizes.
     * @param constantValue The constant value to pad the source tensor.
     * @return A new padding layer
     */
    @Generated
    @Selector("layerWithConstantPadding:constantValue:")
    public static native MLCPaddingLayer layerWithConstantPaddingConstantValue(NSArray<? extends NSNumber> padding,
            float constantValue);

    /**
     * Create a padding layer with reflection padding
     *
     * @param padding The padding sizes.
     * @return A new padding layer
     */
    @Generated
    @Selector("layerWithReflectionPadding:")
    public static native MLCPaddingLayer layerWithReflectionPadding(NSArray<? extends NSNumber> padding);

    /**
     * Create a padding layer with symmetric padding
     *
     * @param padding The padding sizes.
     * @return A new padding layer
     */
    @Generated
    @Selector("layerWithSymmetricPadding:")
    public static native MLCPaddingLayer layerWithSymmetricPadding(NSArray<? extends NSNumber> padding);

    /**
     * Create a padding layer with zero padding
     *
     * @param padding The padding sizes.
     * @return A new padding layer
     */
    @Generated
    @Selector("layerWithZeroPadding:")
    public static native MLCPaddingLayer layerWithZeroPadding(NSArray<? extends NSNumber> padding);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCPaddingLayer new_objc();

    /**
     * [@property]   paddingBottom
     * <p>
     * The bottom padding size
     */
    @Generated
    @Selector("paddingBottom")
    @NUInt
    public native long paddingBottom();

    /**
     * [@property]   paddingLeft
     * <p>
     * The left padding size
     */
    @Generated
    @Selector("paddingLeft")
    @NUInt
    public native long paddingLeft();

    /**
     * [@property]   paddingRight
     * <p>
     * The right padding size
     */
    @Generated
    @Selector("paddingRight")
    @NUInt
    public native long paddingRight();

    /**
     * [@property]   paddingTop
     * <p>
     * The top padding size
     */
    @Generated
    @Selector("paddingTop")
    @NUInt
    public native long paddingTop();

    /**
     * [@property]   paddingType
     * <p>
     * The padding type i.e. constant, zero, reflect or symmetric
     */
    @Generated
    @Selector("paddingType")
    public native int paddingType();

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
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, MLCDevice device);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
