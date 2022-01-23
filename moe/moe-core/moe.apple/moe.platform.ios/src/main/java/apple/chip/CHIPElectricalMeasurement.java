package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Cluster Electrical Measurement
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPElectricalMeasurement extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPElectricalMeasurement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPElectricalMeasurement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CHIPElectricalMeasurement allocWithZone(VoidPtr zone);

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
    public native CHIPElectricalMeasurement init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPElectricalMeasurement initWithDeviceEndpointQueue(CHIPDevice device, char endpoint,
            NSObject queue);

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
    public static native CHIPElectricalMeasurement new_objc();

    @Generated
    @Selector("readAttributeActivePowerMaxWithResponseHandler:")
    public native void readAttributeActivePowerMaxWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerMaxWithResponseHandler") Block_readAttributeActivePowerMaxWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxWithResponseHandler {
        @Generated
        void call_readAttributeActivePowerMaxWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeActivePowerMinWithResponseHandler:")
    public native void readAttributeActivePowerMinWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerMinWithResponseHandler") Block_readAttributeActivePowerMinWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinWithResponseHandler {
        @Generated
        void call_readAttributeActivePowerMinWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeActivePowerWithResponseHandler:")
    public native void readAttributeActivePowerWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerWithResponseHandler") Block_readAttributeActivePowerWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerWithResponseHandler {
        @Generated
        void call_readAttributeActivePowerWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeClusterRevisionWithResponseHandler:")
    public native void readAttributeClusterRevisionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithResponseHandler") Block_readAttributeClusterRevisionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithResponseHandler {
        @Generated
        void call_readAttributeClusterRevisionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeMeasurementTypeWithResponseHandler:")
    public native void readAttributeMeasurementTypeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMeasurementTypeWithResponseHandler") Block_readAttributeMeasurementTypeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasurementTypeWithResponseHandler {
        @Generated
        void call_readAttributeMeasurementTypeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRmsCurrentMaxWithResponseHandler:")
    public native void readAttributeRmsCurrentMaxWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxWithResponseHandler") Block_readAttributeRmsCurrentMaxWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxWithResponseHandler {
        @Generated
        void call_readAttributeRmsCurrentMaxWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRmsCurrentMinWithResponseHandler:")
    public native void readAttributeRmsCurrentMinWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinWithResponseHandler") Block_readAttributeRmsCurrentMinWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinWithResponseHandler {
        @Generated
        void call_readAttributeRmsCurrentMinWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRmsCurrentWithResponseHandler:")
    public native void readAttributeRmsCurrentWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentWithResponseHandler") Block_readAttributeRmsCurrentWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentWithResponseHandler {
        @Generated
        void call_readAttributeRmsCurrentWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRmsVoltageMaxWithResponseHandler:")
    public native void readAttributeRmsVoltageMaxWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxWithResponseHandler") Block_readAttributeRmsVoltageMaxWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxWithResponseHandler {
        @Generated
        void call_readAttributeRmsVoltageMaxWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRmsVoltageMinWithResponseHandler:")
    public native void readAttributeRmsVoltageMinWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinWithResponseHandler") Block_readAttributeRmsVoltageMinWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinWithResponseHandler {
        @Generated
        void call_readAttributeRmsVoltageMinWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRmsVoltageWithResponseHandler:")
    public native void readAttributeRmsVoltageWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageWithResponseHandler") Block_readAttributeRmsVoltageWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageWithResponseHandler {
        @Generated
        void call_readAttributeRmsVoltageWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTotalActivePowerWithResponseHandler:")
    public native void readAttributeTotalActivePowerWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTotalActivePowerWithResponseHandler") Block_readAttributeTotalActivePowerWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalActivePowerWithResponseHandler {
        @Generated
        void call_readAttributeTotalActivePowerWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

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
