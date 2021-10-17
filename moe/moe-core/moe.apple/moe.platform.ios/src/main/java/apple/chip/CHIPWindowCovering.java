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
import org.moe.natj.general.ann.MappedReturn;
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
 * Cluster Window Covering
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPWindowCovering extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPWindowCovering(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPWindowCovering alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("configureAttributeConfigStatusWithMinInterval:maxInterval:responseHandler:")
    public native void configureAttributeConfigStatusWithMinIntervalMaxIntervalResponseHandler(char minInterval,
            char maxInterval,
            @ObjCBlock(name = "call_configureAttributeConfigStatusWithMinIntervalMaxIntervalResponseHandler") Block_configureAttributeConfigStatusWithMinIntervalMaxIntervalResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeConfigStatusWithMinIntervalMaxIntervalResponseHandler {
        @Generated
        void call_configureAttributeConfigStatusWithMinIntervalMaxIntervalResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentPositionLiftWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentPositionLiftWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, char change,
            @ObjCBlock(name = "call_configureAttributeCurrentPositionLiftWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentPositionLiftWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentPositionLiftWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentPositionLiftWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentPositionTiltWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentPositionTiltWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, char change,
            @ObjCBlock(name = "call_configureAttributeCurrentPositionTiltWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentPositionTiltWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentPositionTiltWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentPositionTiltWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeWindowCoveringTypeWithMinInterval:maxInterval:responseHandler:")
    public native void configureAttributeWindowCoveringTypeWithMinIntervalMaxIntervalResponseHandler(char minInterval,
            char maxInterval,
            @ObjCBlock(name = "call_configureAttributeWindowCoveringTypeWithMinIntervalMaxIntervalResponseHandler") Block_configureAttributeWindowCoveringTypeWithMinIntervalMaxIntervalResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeWindowCoveringTypeWithMinIntervalMaxIntervalResponseHandler {
        @Generated
        void call_configureAttributeWindowCoveringTypeWithMinIntervalMaxIntervalResponseHandler(NSError error,
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
    public native CHIPWindowCovering init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPWindowCovering initWithDeviceEndpointQueue(CHIPDevice device, byte endpoint, NSObject queue);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
    @Selector("readAttributeConfigStatusWithResponseHandler:")
    public native void readAttributeConfigStatusWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeConfigStatusWithResponseHandler") Block_readAttributeConfigStatusWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeConfigStatusWithResponseHandler {
        @Generated
        void call_readAttributeConfigStatusWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentPositionLiftWithResponseHandler:")
    public native void readAttributeCurrentPositionLiftWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftWithResponseHandler") Block_readAttributeCurrentPositionLiftWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftWithResponseHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentPositionTiltWithResponseHandler:")
    public native void readAttributeCurrentPositionTiltWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltWithResponseHandler") Block_readAttributeCurrentPositionTiltWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltWithResponseHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInstalledClosedLimitLiftWithResponseHandler:")
    public native void readAttributeInstalledClosedLimitLiftWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitLiftWithResponseHandler") Block_readAttributeInstalledClosedLimitLiftWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitLiftWithResponseHandler {
        @Generated
        void call_readAttributeInstalledClosedLimitLiftWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInstalledClosedLimitTiltWithResponseHandler:")
    public native void readAttributeInstalledClosedLimitTiltWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitTiltWithResponseHandler") Block_readAttributeInstalledClosedLimitTiltWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitTiltWithResponseHandler {
        @Generated
        void call_readAttributeInstalledClosedLimitTiltWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInstalledOpenLimitLiftWithResponseHandler:")
    public native void readAttributeInstalledOpenLimitLiftWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitLiftWithResponseHandler") Block_readAttributeInstalledOpenLimitLiftWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitLiftWithResponseHandler {
        @Generated
        void call_readAttributeInstalledOpenLimitLiftWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInstalledOpenLimitTiltWithResponseHandler:")
    public native void readAttributeInstalledOpenLimitTiltWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitTiltWithResponseHandler") Block_readAttributeInstalledOpenLimitTiltWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitTiltWithResponseHandler {
        @Generated
        void call_readAttributeInstalledOpenLimitTiltWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeModeWithResponseHandler:")
    public native void readAttributeModeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeModeWithResponseHandler") Block_readAttributeModeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeModeWithResponseHandler {
        @Generated
        void call_readAttributeModeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeWindowCoveringTypeWithResponseHandler:")
    public native void readAttributeWindowCoveringTypeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeWindowCoveringTypeWithResponseHandler") Block_readAttributeWindowCoveringTypeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWindowCoveringTypeWithResponseHandler {
        @Generated
        void call_readAttributeWindowCoveringTypeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeConfigStatusWithResponseHandler:")
    public native void reportAttributeConfigStatusWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeConfigStatusWithResponseHandler") Block_reportAttributeConfigStatusWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeConfigStatusWithResponseHandler {
        @Generated
        void call_reportAttributeConfigStatusWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentPositionLiftWithResponseHandler:")
    public native void reportAttributeCurrentPositionLiftWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentPositionLiftWithResponseHandler") Block_reportAttributeCurrentPositionLiftWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentPositionLiftWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentPositionLiftWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentPositionTiltWithResponseHandler:")
    public native void reportAttributeCurrentPositionTiltWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentPositionTiltWithResponseHandler") Block_reportAttributeCurrentPositionTiltWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentPositionTiltWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentPositionTiltWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeWindowCoveringTypeWithResponseHandler:")
    public native void reportAttributeWindowCoveringTypeWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeWindowCoveringTypeWithResponseHandler") Block_reportAttributeWindowCoveringTypeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeWindowCoveringTypeWithResponseHandler {
        @Generated
        void call_reportAttributeWindowCoveringTypeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("windowCoveringDownClose:")
    public native void windowCoveringDownClose(
            @ObjCBlock(name = "call_windowCoveringDownClose") Block_windowCoveringDownClose responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_windowCoveringDownClose {
        @Generated
        void call_windowCoveringDownClose(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("windowCoveringGoToLiftPercentage:responseHandler:")
    public native void windowCoveringGoToLiftPercentageResponseHandler(byte percentageLiftValue,
            @ObjCBlock(name = "call_windowCoveringGoToLiftPercentageResponseHandler") Block_windowCoveringGoToLiftPercentageResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_windowCoveringGoToLiftPercentageResponseHandler {
        @Generated
        void call_windowCoveringGoToLiftPercentageResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("windowCoveringGoToLiftValue:responseHandler:")
    public native void windowCoveringGoToLiftValueResponseHandler(char liftValue,
            @ObjCBlock(name = "call_windowCoveringGoToLiftValueResponseHandler") Block_windowCoveringGoToLiftValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_windowCoveringGoToLiftValueResponseHandler {
        @Generated
        void call_windowCoveringGoToLiftValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("windowCoveringGoToTiltPercentage:responseHandler:")
    public native void windowCoveringGoToTiltPercentageResponseHandler(byte percentageTiltValue,
            @ObjCBlock(name = "call_windowCoveringGoToTiltPercentageResponseHandler") Block_windowCoveringGoToTiltPercentageResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_windowCoveringGoToTiltPercentageResponseHandler {
        @Generated
        void call_windowCoveringGoToTiltPercentageResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("windowCoveringGoToTiltValue:responseHandler:")
    public native void windowCoveringGoToTiltValueResponseHandler(char tiltValue,
            @ObjCBlock(name = "call_windowCoveringGoToTiltValueResponseHandler") Block_windowCoveringGoToTiltValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_windowCoveringGoToTiltValueResponseHandler {
        @Generated
        void call_windowCoveringGoToTiltValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("windowCoveringStop:")
    public native void windowCoveringStop(
            @ObjCBlock(name = "call_windowCoveringStop") Block_windowCoveringStop responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_windowCoveringStop {
        @Generated
        void call_windowCoveringStop(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("windowCoveringUpOpen:")
    public native void windowCoveringUpOpen(
            @ObjCBlock(name = "call_windowCoveringUpOpen") Block_windowCoveringUpOpen responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_windowCoveringUpOpen {
        @Generated
        void call_windowCoveringUpOpen(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeModeWithValue:responseHandler:")
    public native void writeAttributeModeWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeModeWithValueResponseHandler") Block_writeAttributeModeWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeModeWithValueResponseHandler {
        @Generated
        void call_writeAttributeModeWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
