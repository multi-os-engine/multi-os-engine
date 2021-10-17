package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
 * MLCActivationDescriptor
 * <p>
 * The MLCActivationDescriptor specifies a neuron descriptor.
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCActivationDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCActivationDescriptor(Pointer peer) {
        super(peer);
    }

    /**
     * [@property]   a
     * <p>
     * Parameter to the activation function
     */
    @Generated
    @Selector("a")
    public native float a();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property]   activationType
     * <p>
     * The type of activation function
     */
    @Generated
    @Selector("activationType")
    public native int activationType();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCActivationDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MLCActivationDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]   b
     * <p>
     * Parameter to the activation function
     */
    @Generated
    @Selector("b")
    public native float b();

    /**
     * [@property]   c
     * <p>
     * Parameter to the activation function
     */
    @Generated
    @Selector("c")
    public native float c();

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

    /**
     * Create a MLCActivationDescriptor object
     *
     * @param activationType A type of activation function.
     * @return A new neuron descriptor or nil if failure
     */
    @Generated
    @Selector("descriptorWithType:")
    public static native MLCActivationDescriptor descriptorWithType(int activationType);

    /**
     * Create a MLCActivationDescriptor object
     *
     * @param activationType A type of activation function.
     * @param a              Parameter "a".
     * @return A new neuron descriptor or nil if failure
     */
    @Generated
    @Selector("descriptorWithType:a:")
    public static native MLCActivationDescriptor descriptorWithTypeA(int activationType, float a);

    /**
     * Create a MLCActivationDescriptor object
     *
     * @param activationType A type of activation function.
     * @param a              Parameter "a".
     * @param b              Parameter "b".
     * @return A new neuron descriptor or nil if failure
     */
    @Generated
    @Selector("descriptorWithType:a:b:")
    public static native MLCActivationDescriptor descriptorWithTypeAB(int activationType, float a, float b);

    /**
     * Create a MLCActivationDescriptor object
     *
     * @param activationType A type of activation function.
     * @param a              Parameter "a".
     * @param b              Parameter "b".
     * @param c              Parameter "c".
     * @return A new neuron descriptor or nil if failure
     */
    @Generated
    @Selector("descriptorWithType:a:b:c:")
    public static native MLCActivationDescriptor descriptorWithTypeABC(int activationType, float a, float b, float c);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCActivationDescriptor init();

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
    public static native MLCActivationDescriptor new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
