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
 * Cluster Binary Input (Basic)
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPBinaryInputBasic extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPBinaryInputBasic(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPBinaryInputBasic alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CHIPBinaryInputBasic allocWithZone(VoidPtr zone);

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
    @Selector("configureAttributePresentValueWithMinInterval:maxInterval:responseHandler:")
    public native void configureAttributePresentValueWithMinIntervalMaxIntervalResponseHandler(char minInterval,
            char maxInterval,
            @ObjCBlock(name = "call_configureAttributePresentValueWithMinIntervalMaxIntervalResponseHandler") Block_configureAttributePresentValueWithMinIntervalMaxIntervalResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributePresentValueWithMinIntervalMaxIntervalResponseHandler {
        @Generated
        void call_configureAttributePresentValueWithMinIntervalMaxIntervalResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeStatusFlagsWithMinInterval:maxInterval:responseHandler:")
    public native void configureAttributeStatusFlagsWithMinIntervalMaxIntervalResponseHandler(char minInterval,
            char maxInterval,
            @ObjCBlock(name = "call_configureAttributeStatusFlagsWithMinIntervalMaxIntervalResponseHandler") Block_configureAttributeStatusFlagsWithMinIntervalMaxIntervalResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeStatusFlagsWithMinIntervalMaxIntervalResponseHandler {
        @Generated
        void call_configureAttributeStatusFlagsWithMinIntervalMaxIntervalResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

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
    public native CHIPBinaryInputBasic init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPBinaryInputBasic initWithDeviceEndpointQueue(CHIPDevice device, byte endpoint, NSObject queue);

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
    public static native CHIPBinaryInputBasic new_objc();

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
    @Selector("readAttributeOutOfServiceWithResponseHandler:")
    public native void readAttributeOutOfServiceWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOutOfServiceWithResponseHandler") Block_readAttributeOutOfServiceWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOutOfServiceWithResponseHandler {
        @Generated
        void call_readAttributeOutOfServiceWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePresentValueWithResponseHandler:")
    public native void readAttributePresentValueWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePresentValueWithResponseHandler") Block_readAttributePresentValueWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePresentValueWithResponseHandler {
        @Generated
        void call_readAttributePresentValueWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeStatusFlagsWithResponseHandler:")
    public native void readAttributeStatusFlagsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeStatusFlagsWithResponseHandler") Block_readAttributeStatusFlagsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStatusFlagsWithResponseHandler {
        @Generated
        void call_readAttributeStatusFlagsWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributePresentValueWithResponseHandler:")
    public native void reportAttributePresentValueWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributePresentValueWithResponseHandler") Block_reportAttributePresentValueWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributePresentValueWithResponseHandler {
        @Generated
        void call_reportAttributePresentValueWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeStatusFlagsWithResponseHandler:")
    public native void reportAttributeStatusFlagsWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeStatusFlagsWithResponseHandler") Block_reportAttributeStatusFlagsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeStatusFlagsWithResponseHandler {
        @Generated
        void call_reportAttributeStatusFlagsWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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

    @Generated
    @Selector("writeAttributeOutOfServiceWithValue:responseHandler:")
    public native void writeAttributeOutOfServiceWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeOutOfServiceWithValueResponseHandler") Block_writeAttributeOutOfServiceWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOutOfServiceWithValueResponseHandler {
        @Generated
        void call_writeAttributeOutOfServiceWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributePresentValueWithValue:responseHandler:")
    public native void writeAttributePresentValueWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributePresentValueWithValueResponseHandler") Block_writeAttributePresentValueWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePresentValueWithValueResponseHandler {
        @Generated
        void call_writeAttributePresentValueWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
