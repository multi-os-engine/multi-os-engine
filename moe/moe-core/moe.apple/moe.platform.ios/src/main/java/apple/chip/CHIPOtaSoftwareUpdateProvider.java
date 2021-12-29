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
 * Cluster OTA Software Update Provider
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPOtaSoftwareUpdateProvider extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPOtaSoftwareUpdateProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPOtaSoftwareUpdateProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPOtaSoftwareUpdateProvider allocWithZone(VoidPtr zone);

    @Generated
    @Selector("applyUpdateRequest:newVersion:responseHandler:")
    public native void applyUpdateRequestNewVersionResponseHandler(NSData updateToken, int newVersion,
            @ObjCBlock(name = "call_applyUpdateRequestNewVersionResponseHandler") Block_applyUpdateRequestNewVersionResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applyUpdateRequestNewVersionResponseHandler {
        @Generated
        void call_applyUpdateRequestNewVersionResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

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
    public native CHIPOtaSoftwareUpdateProvider init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPOtaSoftwareUpdateProvider initWithDeviceEndpointQueue(CHIPDevice device, char endpoint,
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
    public static native CHIPOtaSoftwareUpdateProvider new_objc();

    @Generated
    @Selector("notifyUpdateApplied:currentVersion:responseHandler:")
    public native void notifyUpdateAppliedCurrentVersionResponseHandler(NSData updateToken, int currentVersion,
            @ObjCBlock(name = "call_notifyUpdateAppliedCurrentVersionResponseHandler") Block_notifyUpdateAppliedCurrentVersionResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyUpdateAppliedCurrentVersionResponseHandler {
        @Generated
        void call_notifyUpdateAppliedCurrentVersionResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("queryImage:productId:imageType:hardwareVersion:currentVersion:protocolsSupported:location:requestorCanConsent:metadataForProvider:responseHandler:")
    public native void queryImageProductIdImageTypeHardwareVersionCurrentVersionProtocolsSupportedLocationRequestorCanConsentMetadataForProviderResponseHandler(
            char vendorId, char productId, char imageType, char hardwareVersion, int currentVersion,
            byte protocolsSupported, String location, boolean requestorCanConsent, NSData metadataForProvider,
            @ObjCBlock(name = "call_queryImageProductIdImageTypeHardwareVersionCurrentVersionProtocolsSupportedLocationRequestorCanConsentMetadataForProviderResponseHandler") Block_queryImageProductIdImageTypeHardwareVersionCurrentVersionProtocolsSupportedLocationRequestorCanConsentMetadataForProviderResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryImageProductIdImageTypeHardwareVersionCurrentVersionProtocolsSupportedLocationRequestorCanConsentMetadataForProviderResponseHandler {
        @Generated
        void call_queryImageProductIdImageTypeHardwareVersionCurrentVersionProtocolsSupportedLocationRequestorCanConsentMetadataForProviderResponseHandler(
                NSError error, NSDictionary<?, ?> values);
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
