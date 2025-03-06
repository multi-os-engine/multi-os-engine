package apple.accessorysetupkit;

import apple.NSObject;
import apple.corebluetooth.CBUUID;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.0
 */
@Generated
@Library("AccessorySetupKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASDiscoveryDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASDiscoveryDescriptor(Pointer peer) {
        super(peer);
    }

    /**
     * The SSID of the accessory's Wi-Fi network.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("SSID")
    @Nullable
    public native String SSID();

    /**
     * The prefix string of SSID of the accessory's Wi-Fi network.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("SSIDPrefix")
    @Nullable
    public native String SSIDPrefix();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASDiscoveryDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ASDiscoveryDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The accessory's 16-bit Bluetooth Company Identifier.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bluetoothCompanyIdentifier")
    public native char bluetoothCompanyIdentifier();

    /**
     * A byte buffer that matches the accessory's Bluetooth manufacturer data.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bluetoothManufacturerDataBlob")
    @Nullable
    public native NSData bluetoothManufacturerDataBlob();

    /**
     * The accessory's Bluetooth manufacturer data mask.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bluetoothManufacturerDataMask")
    @Nullable
    public native NSData bluetoothManufacturerDataMask();

    /**
     * The accessory's over-the-air Bluetooth name substring.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bluetoothNameSubstring")
    @Nullable
    public native String bluetoothNameSubstring();

    /**
     * The accessory's over-the-air Bluetooth name substring compare options.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("bluetoothNameSubstringCompareOptions")
    @NUInt
    public native long bluetoothNameSubstringCompareOptions();

    /**
     * A property that tells the session to discover accessories within a specific Bluetooth range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bluetoothRange")
    @NInt
    public native long bluetoothRange();

    /**
     * A byte buffer that matches the accessory's Bluetooth service data.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bluetoothServiceDataBlob")
    @Nullable
    public native NSData bluetoothServiceDataBlob();

    /**
     * The accessory's Bluetooth service data mask.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bluetoothServiceDataMask")
    @Nullable
    public native NSData bluetoothServiceDataMask();

    /**
     * The accessory's Bluetooth service UUID.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("bluetoothServiceUUID")
    @Nullable
    public native CBUUID bluetoothServiceUUID();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native ASDiscoveryDescriptor init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ASDiscoveryDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The accessory's 16-bit Bluetooth Company Identifier.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBluetoothCompanyIdentifier:")
    public native void setBluetoothCompanyIdentifier(char value);

    /**
     * A byte buffer that matches the accessory's Bluetooth manufacturer data.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBluetoothManufacturerDataBlob:")
    public native void setBluetoothManufacturerDataBlob(@Nullable NSData value);

    /**
     * The accessory's Bluetooth manufacturer data mask.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBluetoothManufacturerDataMask:")
    public native void setBluetoothManufacturerDataMask(@Nullable NSData value);

    /**
     * The accessory's over-the-air Bluetooth name substring.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBluetoothNameSubstring:")
    public native void setBluetoothNameSubstring(@Nullable String value);

    /**
     * The accessory's over-the-air Bluetooth name substring compare options.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("setBluetoothNameSubstringCompareOptions:")
    public native void setBluetoothNameSubstringCompareOptions(@NUInt long value);

    /**
     * A property that tells the session to discover accessories within a specific Bluetooth range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBluetoothRange:")
    public native void setBluetoothRange(@NInt long value);

    /**
     * A byte buffer that matches the accessory's Bluetooth service data.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBluetoothServiceDataBlob:")
    public native void setBluetoothServiceDataBlob(@Nullable NSData value);

    /**
     * The accessory's Bluetooth service data mask.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBluetoothServiceDataMask:")
    public native void setBluetoothServiceDataMask(@Nullable NSData value);

    /**
     * The accessory's Bluetooth service UUID.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBluetoothServiceUUID:")
    public native void setBluetoothServiceUUID(@Nullable CBUUID value);

    /**
     * The SSID of the accessory's Wi-Fi network.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSSID:")
    public native void setSSID(@Nullable String value);

    /**
     * The prefix string of SSID of the accessory's Wi-Fi network.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSSIDPrefix:")
    public native void setSSIDPrefix(@Nullable String value);

    /**
     * Options supported by an accessory.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSupportedOptions:")
    public native void setSupportedOptions(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Options supported by an accessory.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportedOptions")
    @NUInt
    public native long supportedOptions();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}