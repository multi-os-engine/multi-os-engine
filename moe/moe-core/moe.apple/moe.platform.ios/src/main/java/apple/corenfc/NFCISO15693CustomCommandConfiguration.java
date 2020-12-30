package apple.corenfc;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NFCISO15693CustomCommandConfiguration
 * 
 * Configuration options for the Manufacturer Custom command.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCISO15693CustomCommandConfiguration extends NFCTagCommandConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCISO15693CustomCommandConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCISO15693CustomCommandConfiguration alloc();

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

    /**
     * Manufacturer Custom Command Index.  Valid range is 0xA0 to 0xDF.
     */
    @Generated
    @Selector("customCommandCode")
    @NUInt
    public native long customCommandCode();

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
    public native NFCISO15693CustomCommandConfiguration init();

    /**
     * initWithManufacturerCode:customCommandCode:requestParameters:
     * 
     * Initialize with default zero maximum retry and zero retry interval.
     * 
     * @param manufacturerCode      8 bits manufacturer code.
     * @param customCommandCode     8 bits custom command code.  Valid range is 0xA0 to 0xDF.
     * @param requestParameters     Optional custom request parameters.
     */
    @Generated
    @Selector("initWithManufacturerCode:customCommandCode:requestParameters:")
    public native NFCISO15693CustomCommandConfiguration initWithManufacturerCodeCustomCommandCodeRequestParameters(
            @NUInt long manufacturerCode, @NUInt long customCommandCode, NSData requestParameters);

    /**
     * initWithManufacturerCode:customCommandCode:requestParameters:maximumRetries:retryInterval:
     * 
     * @param manufacturerCode      8 bits manufacturer code.
     * @param customCommandCode     8 bits custom command code.  Valid range is 0xA0 to 0xDF.
     * @param requestParameters     Optional custom request parameters.
     * @param maximumRetries        Maximum number of retry attempt when tag response is not recevied.
     * @param retryInterval         Time interval wait between each retry attempt.
     */
    @Generated
    @Selector("initWithManufacturerCode:customCommandCode:requestParameters:maximumRetries:retryInterval:")
    public native NFCISO15693CustomCommandConfiguration initWithManufacturerCodeCustomCommandCodeRequestParametersMaximumRetriesRetryInterval(
            @NUInt long manufacturerCode, @NUInt long customCommandCode, NSData requestParameters,
            @NUInt long maximumRetries, double retryInterval);

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

    /**
     * Manufacturer code. Valid range is 0x00 to 0xFF.
     */
    @Generated
    @Selector("manufacturerCode")
    @NUInt
    public native long manufacturerCode();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Custom request data.
     */
    @Generated
    @Selector("requestParameters")
    public native NSData requestParameters();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Manufacturer Custom Command Index.  Valid range is 0xA0 to 0xDF.
     */
    @Generated
    @Selector("setCustomCommandCode:")
    public native void setCustomCommandCode(@NUInt long value);

    /**
     * Manufacturer code. Valid range is 0x00 to 0xFF.
     */
    @Generated
    @Selector("setManufacturerCode:")
    public native void setManufacturerCode(@NUInt long value);

    /**
     * Custom request data.
     */
    @Generated
    @Selector("setRequestParameters:")
    public native void setRequestParameters(NSData value);

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