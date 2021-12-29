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
 * Cluster On/Off
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPOnOff extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPOnOff(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPOnOff alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPOnOff allocWithZone(VoidPtr zone);

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
    @Selector("configureAttributeOnOffWithMinInterval:maxInterval:responseHandler:")
    public native void configureAttributeOnOffWithMinIntervalMaxIntervalResponseHandler(char minInterval,
            char maxInterval,
            @ObjCBlock(name = "call_configureAttributeOnOffWithMinIntervalMaxIntervalResponseHandler") Block_configureAttributeOnOffWithMinIntervalMaxIntervalResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeOnOffWithMinIntervalMaxIntervalResponseHandler {
        @Generated
        void call_configureAttributeOnOffWithMinIntervalMaxIntervalResponseHandler(NSError error,
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
    public native CHIPOnOff init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPOnOff initWithDeviceEndpointQueue(CHIPDevice device, char endpoint, NSObject queue);

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
    public static native CHIPOnOff new_objc();

    @Generated
    @Selector("off:")
    public native void off(@ObjCBlock(name = "call_off") Block_off responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_off {
        @Generated
        void call_off(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("on:")
    public native void on(@ObjCBlock(name = "call_on") Block_on responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_on {
        @Generated
        void call_on(NSError error, NSDictionary<?, ?> values);
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
    @Selector("readAttributeOnOffWithResponseHandler:")
    public native void readAttributeOnOffWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOnOffWithResponseHandler") Block_readAttributeOnOffWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOnOffWithResponseHandler {
        @Generated
        void call_readAttributeOnOffWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeOnOffWithResponseHandler:")
    public native void reportAttributeOnOffWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeOnOffWithResponseHandler") Block_reportAttributeOnOffWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeOnOffWithResponseHandler {
        @Generated
        void call_reportAttributeOnOffWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("toggle:")
    public native void toggle(@ObjCBlock(name = "call_toggle") Block_toggle responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_toggle {
        @Generated
        void call_toggle(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("offWithEffect:effectVariant:responseHandler:")
    public native void offWithEffectEffectVariantResponseHandler(byte effectId, byte effectVariant,
            @ObjCBlock(name = "call_offWithEffectEffectVariantResponseHandler") Block_offWithEffectEffectVariantResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_offWithEffectEffectVariantResponseHandler {
        @Generated
        void call_offWithEffectEffectVariantResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("onWithRecallGlobalScene:")
    public native void onWithRecallGlobalScene(
            @ObjCBlock(name = "call_onWithRecallGlobalScene") Block_onWithRecallGlobalScene responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithRecallGlobalScene {
        @Generated
        void call_onWithRecallGlobalScene(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("onWithTimedOff:onTime:offWaitTime:responseHandler:")
    public native void onWithTimedOffOnTimeOffWaitTimeResponseHandler(byte onOffControl, char onTime, char offWaitTime,
            @ObjCBlock(name = "call_onWithTimedOffOnTimeOffWaitTimeResponseHandler") Block_onWithTimedOffOnTimeOffWaitTimeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_onWithTimedOffOnTimeOffWaitTimeResponseHandler {
        @Generated
        void call_onWithTimedOffOnTimeOffWaitTimeResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeFeatureMapWithResponseHandler:")
    public native void readAttributeFeatureMapWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeFeatureMapWithResponseHandler") Block_readAttributeFeatureMapWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFeatureMapWithResponseHandler {
        @Generated
        void call_readAttributeFeatureMapWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeGlobalSceneControlWithResponseHandler:")
    public native void readAttributeGlobalSceneControlWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeGlobalSceneControlWithResponseHandler") Block_readAttributeGlobalSceneControlWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeGlobalSceneControlWithResponseHandler {
        @Generated
        void call_readAttributeGlobalSceneControlWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeOffWaitTimeWithResponseHandler:")
    public native void readAttributeOffWaitTimeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOffWaitTimeWithResponseHandler") Block_readAttributeOffWaitTimeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOffWaitTimeWithResponseHandler {
        @Generated
        void call_readAttributeOffWaitTimeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeOnTimeWithResponseHandler:")
    public native void readAttributeOnTimeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOnTimeWithResponseHandler") Block_readAttributeOnTimeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOnTimeWithResponseHandler {
        @Generated
        void call_readAttributeOnTimeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeStartUpOnOffWithResponseHandler:")
    public native void readAttributeStartUpOnOffWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeStartUpOnOffWithResponseHandler") Block_readAttributeStartUpOnOffWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartUpOnOffWithResponseHandler {
        @Generated
        void call_readAttributeStartUpOnOffWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeOffWaitTimeWithValue:responseHandler:")
    public native void writeAttributeOffWaitTimeWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeOffWaitTimeWithValueResponseHandler") Block_writeAttributeOffWaitTimeWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOffWaitTimeWithValueResponseHandler {
        @Generated
        void call_writeAttributeOffWaitTimeWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeOnTimeWithValue:responseHandler:")
    public native void writeAttributeOnTimeWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeOnTimeWithValueResponseHandler") Block_writeAttributeOnTimeWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOnTimeWithValueResponseHandler {
        @Generated
        void call_writeAttributeOnTimeWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeStartUpOnOffWithValue:responseHandler:")
    public native void writeAttributeStartUpOnOffWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeStartUpOnOffWithValueResponseHandler") Block_writeAttributeStartUpOnOffWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStartUpOnOffWithValueResponseHandler {
        @Generated
        void call_writeAttributeStartUpOnOffWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
