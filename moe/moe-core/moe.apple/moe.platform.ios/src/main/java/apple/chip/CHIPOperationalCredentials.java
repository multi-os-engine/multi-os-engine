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
 * Cluster Operational Credentials
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPOperationalCredentials extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPOperationalCredentials(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPOperationalCredentials alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPOperationalCredentials allocWithZone(VoidPtr zone);

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
    public native CHIPOperationalCredentials init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPOperationalCredentials initWithDeviceEndpointQueue(CHIPDevice device, char endpoint,
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
    public static native CHIPOperationalCredentials new_objc();

    @Generated
    @Selector("opCSRRequest:responseHandler:")
    public native void opCSRRequestResponseHandler(NSData cSRNonce,
            @ObjCBlock(name = "call_opCSRRequestResponseHandler") Block_opCSRRequestResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_opCSRRequestResponseHandler {
        @Generated
        void call_opCSRRequestResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("readAttributeFabricsListWithResponseHandler:")
    public native void readAttributeFabricsListWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeFabricsListWithResponseHandler") Block_readAttributeFabricsListWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFabricsListWithResponseHandler {
        @Generated
        void call_readAttributeFabricsListWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("updateFabricLabel:responseHandler:")
    public native void updateFabricLabelResponseHandler(String label,
            @ObjCBlock(name = "call_updateFabricLabelResponseHandler") Block_updateFabricLabelResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateFabricLabelResponseHandler {
        @Generated
        void call_updateFabricLabelResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addNOC:iPKValue:caseAdminNode:adminVendorId:responseHandler:")
    public native void addNOCIPKValueCaseAdminNodeAdminVendorIdResponseHandler(NSData nOCArray, NSData iPKValue,
            long caseAdminNode, char adminVendorId,
            @ObjCBlock(name = "call_addNOCIPKValueCaseAdminNodeAdminVendorIdResponseHandler") Block_addNOCIPKValueCaseAdminNodeAdminVendorIdResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addNOCIPKValueCaseAdminNodeAdminVendorIdResponseHandler {
        @Generated
        void call_addNOCIPKValueCaseAdminNodeAdminVendorIdResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("addTrustedRootCertificate:responseHandler:")
    public native void addTrustedRootCertificateResponseHandler(NSData rootCertificate,
            @ObjCBlock(name = "call_addTrustedRootCertificateResponseHandler") Block_addTrustedRootCertificateResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addTrustedRootCertificateResponseHandler {
        @Generated
        void call_addTrustedRootCertificateResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCommissionedFabricsWithResponseHandler:")
    public native void readAttributeCommissionedFabricsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCommissionedFabricsWithResponseHandler") Block_readAttributeCommissionedFabricsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCommissionedFabricsWithResponseHandler {
        @Generated
        void call_readAttributeCommissionedFabricsWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeSupportedFabricsWithResponseHandler:")
    public native void readAttributeSupportedFabricsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeSupportedFabricsWithResponseHandler") Block_readAttributeSupportedFabricsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSupportedFabricsWithResponseHandler {
        @Generated
        void call_readAttributeSupportedFabricsWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("removeFabric:responseHandler:")
    public native void removeFabricResponseHandler(byte fabricIndex,
            @ObjCBlock(name = "call_removeFabricResponseHandler") Block_removeFabricResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeFabricResponseHandler {
        @Generated
        void call_removeFabricResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("removeTrustedRootCertificate:responseHandler:")
    public native void removeTrustedRootCertificateResponseHandler(NSData trustedRootIdentifier,
            @ObjCBlock(name = "call_removeTrustedRootCertificateResponseHandler") Block_removeTrustedRootCertificateResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeTrustedRootCertificateResponseHandler {
        @Generated
        void call_removeTrustedRootCertificateResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("updateNOC:responseHandler:")
    public native void updateNOCResponseHandler(NSData nOCArray,
            @ObjCBlock(name = "call_updateNOCResponseHandler") Block_updateNOCResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNOCResponseHandler {
        @Generated
        void call_updateNOCResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
