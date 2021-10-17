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
 * Cluster Basic
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPBasic extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPBasic(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPBasic alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CHIPBasic allocWithZone(VoidPtr zone);

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
    public native CHIPBasic init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPBasic initWithDeviceEndpointQueue(CHIPDevice device, byte endpoint, NSObject queue);

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
    @Selector("mfgSpecificPing:")
    public native void mfgSpecificPing(@ObjCBlock(name = "call_mfgSpecificPing") Block_mfgSpecificPing responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mfgSpecificPing {
        @Generated
        void call_mfgSpecificPing(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native CHIPBasic new_objc();

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
    @Selector("readAttributeHardwareVersionStringWithResponseHandler:")
    public native void readAttributeHardwareVersionStringWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeHardwareVersionStringWithResponseHandler") Block_readAttributeHardwareVersionStringWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHardwareVersionStringWithResponseHandler {
        @Generated
        void call_readAttributeHardwareVersionStringWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeHardwareVersionWithResponseHandler:")
    public native void readAttributeHardwareVersionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeHardwareVersionWithResponseHandler") Block_readAttributeHardwareVersionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHardwareVersionWithResponseHandler {
        @Generated
        void call_readAttributeHardwareVersionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeInteractionModelVersionWithResponseHandler:")
    public native void readAttributeInteractionModelVersionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeInteractionModelVersionWithResponseHandler") Block_readAttributeInteractionModelVersionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInteractionModelVersionWithResponseHandler {
        @Generated
        void call_readAttributeInteractionModelVersionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeLocalConfigDisabledWithResponseHandler:")
    public native void readAttributeLocalConfigDisabledWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeLocalConfigDisabledWithResponseHandler") Block_readAttributeLocalConfigDisabledWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalConfigDisabledWithResponseHandler {
        @Generated
        void call_readAttributeLocalConfigDisabledWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeLocationWithResponseHandler:")
    public native void readAttributeLocationWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeLocationWithResponseHandler") Block_readAttributeLocationWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocationWithResponseHandler {
        @Generated
        void call_readAttributeLocationWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeManufacturingDateWithResponseHandler:")
    public native void readAttributeManufacturingDateWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeManufacturingDateWithResponseHandler") Block_readAttributeManufacturingDateWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeManufacturingDateWithResponseHandler {
        @Generated
        void call_readAttributeManufacturingDateWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePartNumberWithResponseHandler:")
    public native void readAttributePartNumberWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePartNumberWithResponseHandler") Block_readAttributePartNumberWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartNumberWithResponseHandler {
        @Generated
        void call_readAttributePartNumberWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeProductIDWithResponseHandler:")
    public native void readAttributeProductIDWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeProductIDWithResponseHandler") Block_readAttributeProductIDWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeProductIDWithResponseHandler {
        @Generated
        void call_readAttributeProductIDWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeProductLabelWithResponseHandler:")
    public native void readAttributeProductLabelWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeProductLabelWithResponseHandler") Block_readAttributeProductLabelWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeProductLabelWithResponseHandler {
        @Generated
        void call_readAttributeProductLabelWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeProductNameWithResponseHandler:")
    public native void readAttributeProductNameWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeProductNameWithResponseHandler") Block_readAttributeProductNameWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeProductNameWithResponseHandler {
        @Generated
        void call_readAttributeProductNameWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeProductURLWithResponseHandler:")
    public native void readAttributeProductURLWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeProductURLWithResponseHandler") Block_readAttributeProductURLWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeProductURLWithResponseHandler {
        @Generated
        void call_readAttributeProductURLWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeSerialNumberWithResponseHandler:")
    public native void readAttributeSerialNumberWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeSerialNumberWithResponseHandler") Block_readAttributeSerialNumberWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSerialNumberWithResponseHandler {
        @Generated
        void call_readAttributeSerialNumberWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeSoftwareVersionStringWithResponseHandler:")
    public native void readAttributeSoftwareVersionStringWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeSoftwareVersionStringWithResponseHandler") Block_readAttributeSoftwareVersionStringWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSoftwareVersionStringWithResponseHandler {
        @Generated
        void call_readAttributeSoftwareVersionStringWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeSoftwareVersionWithResponseHandler:")
    public native void readAttributeSoftwareVersionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeSoftwareVersionWithResponseHandler") Block_readAttributeSoftwareVersionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSoftwareVersionWithResponseHandler {
        @Generated
        void call_readAttributeSoftwareVersionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeUserLabelWithResponseHandler:")
    public native void readAttributeUserLabelWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeUserLabelWithResponseHandler") Block_readAttributeUserLabelWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUserLabelWithResponseHandler {
        @Generated
        void call_readAttributeUserLabelWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeVendorIDWithResponseHandler:")
    public native void readAttributeVendorIDWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeVendorIDWithResponseHandler") Block_readAttributeVendorIDWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVendorIDWithResponseHandler {
        @Generated
        void call_readAttributeVendorIDWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeVendorNameWithResponseHandler:")
    public native void readAttributeVendorNameWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeVendorNameWithResponseHandler") Block_readAttributeVendorNameWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVendorNameWithResponseHandler {
        @Generated
        void call_readAttributeVendorNameWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("writeAttributeLocalConfigDisabledWithValue:responseHandler:")
    public native void writeAttributeLocalConfigDisabledWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeLocalConfigDisabledWithValueResponseHandler") Block_writeAttributeLocalConfigDisabledWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocalConfigDisabledWithValueResponseHandler {
        @Generated
        void call_writeAttributeLocalConfigDisabledWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeLocationWithValue:responseHandler:")
    public native void writeAttributeLocationWithValueResponseHandler(String value,
            @ObjCBlock(name = "call_writeAttributeLocationWithValueResponseHandler") Block_writeAttributeLocationWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocationWithValueResponseHandler {
        @Generated
        void call_writeAttributeLocationWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeUserLabelWithValue:responseHandler:")
    public native void writeAttributeUserLabelWithValueResponseHandler(String value,
            @ObjCBlock(name = "call_writeAttributeUserLabelWithValueResponseHandler") Block_writeAttributeUserLabelWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUserLabelWithValueResponseHandler {
        @Generated
        void call_writeAttributeUserLabelWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
