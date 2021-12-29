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
 * Cluster Barrier Control
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPBarrierControl extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPBarrierControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPBarrierControl alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPBarrierControl allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("barrierControlGoToPercent:responseHandler:")
    public native void barrierControlGoToPercentResponseHandler(byte percentOpen,
            @ObjCBlock(name = "call_barrierControlGoToPercentResponseHandler") Block_barrierControlGoToPercentResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_barrierControlGoToPercentResponseHandler {
        @Generated
        void call_barrierControlGoToPercentResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("barrierControlStop:")
    public native void barrierControlStop(
            @ObjCBlock(name = "call_barrierControlStop") Block_barrierControlStop responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_barrierControlStop {
        @Generated
        void call_barrierControlStop(NSError error, NSDictionary<?, ?> values);
    }

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
    public native CHIPBarrierControl init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPBarrierControl initWithDeviceEndpointQueue(CHIPDevice device, char endpoint, NSObject queue);

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
    public static native CHIPBarrierControl new_objc();

    @Generated
    @Selector("readAttributeBarrierCapabilitiesWithResponseHandler:")
    public native void readAttributeBarrierCapabilitiesWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBarrierCapabilitiesWithResponseHandler") Block_readAttributeBarrierCapabilitiesWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBarrierCapabilitiesWithResponseHandler {
        @Generated
        void call_readAttributeBarrierCapabilitiesWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeBarrierMovingStateWithResponseHandler:")
    public native void readAttributeBarrierMovingStateWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBarrierMovingStateWithResponseHandler") Block_readAttributeBarrierMovingStateWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBarrierMovingStateWithResponseHandler {
        @Generated
        void call_readAttributeBarrierMovingStateWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeBarrierPositionWithResponseHandler:")
    public native void readAttributeBarrierPositionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBarrierPositionWithResponseHandler") Block_readAttributeBarrierPositionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBarrierPositionWithResponseHandler {
        @Generated
        void call_readAttributeBarrierPositionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeBarrierSafetyStatusWithResponseHandler:")
    public native void readAttributeBarrierSafetyStatusWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBarrierSafetyStatusWithResponseHandler") Block_readAttributeBarrierSafetyStatusWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBarrierSafetyStatusWithResponseHandler {
        @Generated
        void call_readAttributeBarrierSafetyStatusWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
