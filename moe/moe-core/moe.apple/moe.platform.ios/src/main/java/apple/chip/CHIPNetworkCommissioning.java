package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * Cluster Network Commissioning
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPNetworkCommissioning extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPNetworkCommissioning(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addThreadNetwork:breadcrumb:timeoutMs:responseHandler:")
    public native void addThreadNetworkBreadcrumbTimeoutMsResponseHandler(NSData operationalDataset, long breadcrumb,
            int timeoutMs,
            @ObjCBlock(name = "call_addThreadNetworkBreadcrumbTimeoutMsResponseHandler") Block_addThreadNetworkBreadcrumbTimeoutMsResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addThreadNetworkBreadcrumbTimeoutMsResponseHandler {
        @Generated
        void call_addThreadNetworkBreadcrumbTimeoutMsResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("addWiFiNetwork:credentials:breadcrumb:timeoutMs:responseHandler:")
    public native void addWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler(NSData ssid, NSData credentials,
            long breadcrumb, int timeoutMs,
            @ObjCBlock(name = "call_addWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler") Block_addWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler {
        @Generated
        void call_addWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPNetworkCommissioning alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPNetworkCommissioning allocWithZone(VoidPtr zone);

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
    @Selector("disableNetwork:breadcrumb:timeoutMs:responseHandler:")
    public native void disableNetworkBreadcrumbTimeoutMsResponseHandler(NSData networkID, long breadcrumb,
            int timeoutMs,
            @ObjCBlock(name = "call_disableNetworkBreadcrumbTimeoutMsResponseHandler") Block_disableNetworkBreadcrumbTimeoutMsResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableNetworkBreadcrumbTimeoutMsResponseHandler {
        @Generated
        void call_disableNetworkBreadcrumbTimeoutMsResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("enableNetwork:breadcrumb:timeoutMs:responseHandler:")
    public native void enableNetworkBreadcrumbTimeoutMsResponseHandler(NSData networkID, long breadcrumb, int timeoutMs,
            @ObjCBlock(name = "call_enableNetworkBreadcrumbTimeoutMsResponseHandler") Block_enableNetworkBreadcrumbTimeoutMsResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableNetworkBreadcrumbTimeoutMsResponseHandler {
        @Generated
        void call_enableNetworkBreadcrumbTimeoutMsResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("getLastNetworkCommissioningResult:responseHandler:")
    public native void getLastNetworkCommissioningResultResponseHandler(int timeoutMs,
            @ObjCBlock(name = "call_getLastNetworkCommissioningResultResponseHandler") Block_getLastNetworkCommissioningResultResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getLastNetworkCommissioningResultResponseHandler {
        @Generated
        void call_getLastNetworkCommissioningResultResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHIPNetworkCommissioning init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPNetworkCommissioning initWithDeviceEndpointQueue(CHIPDevice device, char endpoint,
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
    public static native CHIPNetworkCommissioning new_objc();

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
    @Selector("removeNetwork:breadcrumb:timeoutMs:responseHandler:")
    public native void removeNetworkBreadcrumbTimeoutMsResponseHandler(NSData networkID, long breadcrumb, int timeoutMs,
            @ObjCBlock(name = "call_removeNetworkBreadcrumbTimeoutMsResponseHandler") Block_removeNetworkBreadcrumbTimeoutMsResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeNetworkBreadcrumbTimeoutMsResponseHandler {
        @Generated
        void call_removeNetworkBreadcrumbTimeoutMsResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scanNetworks:breadcrumb:timeoutMs:responseHandler:")
    public native void scanNetworksBreadcrumbTimeoutMsResponseHandler(NSData ssid, long breadcrumb, int timeoutMs,
            @ObjCBlock(name = "call_scanNetworksBreadcrumbTimeoutMsResponseHandler") Block_scanNetworksBreadcrumbTimeoutMsResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scanNetworksBreadcrumbTimeoutMsResponseHandler {
        @Generated
        void call_scanNetworksBreadcrumbTimeoutMsResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("updateThreadNetwork:breadcrumb:timeoutMs:responseHandler:")
    public native void updateThreadNetworkBreadcrumbTimeoutMsResponseHandler(NSData operationalDataset, long breadcrumb,
            int timeoutMs,
            @ObjCBlock(name = "call_updateThreadNetworkBreadcrumbTimeoutMsResponseHandler") Block_updateThreadNetworkBreadcrumbTimeoutMsResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateThreadNetworkBreadcrumbTimeoutMsResponseHandler {
        @Generated
        void call_updateThreadNetworkBreadcrumbTimeoutMsResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("updateWiFiNetwork:credentials:breadcrumb:timeoutMs:responseHandler:")
    public native void updateWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler(NSData ssid, NSData credentials,
            long breadcrumb, int timeoutMs,
            @ObjCBlock(name = "call_updateWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler") Block_updateWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler {
        @Generated
        void call_updateWiFiNetworkCredentialsBreadcrumbTimeoutMsResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

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
}
