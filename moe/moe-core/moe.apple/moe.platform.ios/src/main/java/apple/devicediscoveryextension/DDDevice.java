package apple.devicediscoveryextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSUUID;
import apple.uniformtypeidentifiers.UTType;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * ===========================================================================================================================
 * DeviceDiscoveryExtension device.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("DeviceDiscoveryExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class DDDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected DDDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native DDDevice alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native DDDevice allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Identifier to communicate with the device via Bluetooth.
     */
    @Nullable
    @Generated
    @Selector("bluetoothIdentifier")
    public native NSUUID bluetoothIdentifier();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Category of the device.
     */
    @Generated
    @Selector("category")
    @NInt
    public native long category();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Name of the device. Should be suitable for displaying to a user.
     */
    @NotNull
    @Generated
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Identifier of the device.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native DDDevice init();

    /**
     * Initializes a DD device with display name, category, protocol type, and identifier.
     */
    @Generated
    @Selector("initWithDisplayName:category:protocolType:identifier:")
    public native DDDevice initWithDisplayNameCategoryProtocolTypeIdentifier(@NotNull String displayName,
            @NInt long category, @NotNull UTType protocolType, @NotNull String identifier);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Subtitle of the media content being played. It can be used to display extra information about the content, such
     * as the name of the artist.
     */
    @Nullable
    @Generated
    @Selector("mediaContentSubtitle")
    public native String mediaContentSubtitle();

    /**
     * Title of the media content being played.
     */
    @Nullable
    @Generated
    @Selector("mediaContentTitle")
    public native String mediaContentTitle();

    /**
     * Current state of media playback on this device.
     */
    @Generated
    @Selector("mediaPlaybackState")
    @NInt
    public native long mediaPlaybackState();

    /**
     * Endpoint to communicate with the device via networking.
     */
    @Nullable
    @Generated
    @Selector("networkEndpoint")
    public native NSObject networkEndpoint();

    @Generated
    @Owned
    @Selector("new")
    public static native DDDevice new_objc();

    /**
     * Protocol of the device.
     */
    @Generated
    @Selector("protocol")
    @NInt
    public native long protocol();

    /**
     * Uniform Type for the protocol.
     */
    @NotNull
    @Generated
    @Selector("protocolType")
    public native UTType protocolType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Identifier to communicate with the device via Bluetooth.
     */
    @Generated
    @Selector("setBluetoothIdentifier:")
    public native void setBluetoothIdentifier(@Nullable NSUUID value);

    /**
     * Category of the device.
     */
    @Generated
    @Selector("setCategory:")
    public native void setCategory(@NInt long value);

    /**
     * Name of the device. Should be suitable for displaying to a user.
     */
    @Generated
    @Selector("setDisplayName:")
    public native void setDisplayName(@NotNull String value);

    /**
     * Identifier of the device.
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@NotNull String value);

    /**
     * Subtitle of the media content being played. It can be used to display extra information about the content, such
     * as the name of the artist.
     */
    @Generated
    @Selector("setMediaContentSubtitle:")
    public native void setMediaContentSubtitle(@Nullable String value);

    /**
     * Title of the media content being played.
     */
    @Generated
    @Selector("setMediaContentTitle:")
    public native void setMediaContentTitle(@Nullable String value);

    /**
     * Current state of media playback on this device.
     */
    @Generated
    @Selector("setMediaPlaybackState:")
    public native void setMediaPlaybackState(@NInt long value);

    /**
     * Endpoint to communicate with the device via networking.
     */
    @Generated
    @Selector("setNetworkEndpoint:")
    public native void setNetworkEndpoint(@Nullable NSObject value);

    /**
     * Protocol of the device.
     */
    @Generated
    @Selector("setProtocol:")
    public native void setProtocol(@NInt long value);

    /**
     * Uniform Type for the protocol.
     */
    @Generated
    @Selector("setProtocolType:")
    public native void setProtocolType(@NotNull UTType value);

    /**
     * State of the device.
     */
    @Generated
    @Selector("setState:")
    public native void setState(@NInt long value);

    /**
     * TXT record of the device.
     */
    @Generated
    @Selector("setTxtRecordData:")
    public native void setTxtRecordData(@Nullable NSData value);

    /**
     * URL used for SSDP connection.
     * The URL must have a valid hostname, no query parameters, and a maximum size of 100 bytes.
     */
    @Generated
    @Selector("setUrl:")
    public native void setUrl(@NotNull NSURL value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * State of the device.
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * TXT record of the device.
     */
    @Nullable
    @Generated
    @Selector("txtRecordData")
    public native NSData txtRecordData();

    /**
     * URL used for SSDP connection.
     * The URL must have a valid hostname, no query parameters, and a maximum size of 100 bytes.
     */
    @NotNull
    @Generated
    @Selector("url")
    public native NSURL url();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}