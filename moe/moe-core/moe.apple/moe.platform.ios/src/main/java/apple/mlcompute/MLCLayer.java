package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MLCLayer
 * <p>
 * The base class for all MLCompute layers
 * <p>
 * There are as many MLCLayer subclasses as there are MLCompute neural network layer objects. Make one of those.
 * This class defines an polymorphic interface for them.
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCLayer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCLayer allocWithZone(VoidPtr zone);

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

    /**
     * [@property] deviceType
     * <p>
     * The device type where this layer will be executed
     * <p>
     * Typically the MLCDevice passed to compileWithOptions will be the device used to execute layers in the graph.
     * If MLCDeviceTypeANE is selected, it is possible that some of the layers of the graph may not be executed on the
     * ANE
     * but instead on the CPU or GPU. This property can be used to determine which device type the layer will be
     * executed on.
     */
    @Generated
    @Selector("deviceType")
    public native int deviceType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCLayer init();

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

    /**
     * [@property] isDebuggingEnabled
     * <p>
     * A flag to identify if we want to debug this layer when executing a graph that includes this layer
     * <p>
     * If this is set, we will make sure that the result tensor and gradient tensors are available for reading on CPU
     * The default is NO. If isDebuggingEnabled is set to YES, make sure to set options to enable debugging when
     * compiling the graph. Otherwise this property may be ignored.
     */
    @Generated
    @Selector("isDebuggingEnabled")
    public native boolean isDebuggingEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("label")
    public native String label();

    /**
     * [@property] layerID
     * <p>
     * The layer ID
     * <p>
     * A unique number to identify each layer. Assigned when the layer is created.
     */
    @Generated
    @Selector("layerID")
    @NUInt
    public native long layerID();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCLayer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] isDebuggingEnabled
     * <p>
     * A flag to identify if we want to debug this layer when executing a graph that includes this layer
     * <p>
     * If this is set, we will make sure that the result tensor and gradient tensors are available for reading on CPU
     * The default is NO. If isDebuggingEnabled is set to YES, make sure to set options to enable debugging when
     * compiling the graph. Otherwise this property may be ignored.
     */
    @Generated
    @Selector("setIsDebuggingEnabled:")
    public native void setIsDebuggingEnabled(boolean value);

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Determine whether instances of this layer accept source tensors of the given data type on the given device.
     *
     * @param dataType A data type of a possible input tensor to the layer
     * @param device   A device
     * @return A boolean indicating whether the data type is supported
     */
    @Generated
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, MLCDevice device);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
