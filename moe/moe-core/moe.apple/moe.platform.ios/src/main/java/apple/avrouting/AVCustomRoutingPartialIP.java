package apple.avrouting;

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
 * Represents a full or partial IP address.
 * 
 * Use this class in conjunction with ``knownRouteIPs``.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("AVRouting")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCustomRoutingPartialIP extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCustomRoutingPartialIP(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * A full or partial IP address for a device known to be on the network.
     * 
     * Use the following code to create a full known IP address.
     * 
     * ```var anIPAddressInBytes:[Byte] = [192, 168, 10, 5]
     * var address = Data(bytes: anAddressInBytes, length: anAddressInBytes.count)
     * var aMaskInBytes:[Byte] = [255, 255, 255, 255]
     * var mask = Data(bytes: aMaskInBytes, length: aMaskInBytes.count)
     * var partialIP = AVCustomRoutingPartialIP(address: address, mask: mask)
     * ```
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("address")
    public native NSData address();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCustomRoutingPartialIP alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCustomRoutingPartialIP allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCustomRoutingPartialIP init();

    /**
     * Creates an IP fragment.
     * - Parameters:
     * - address: The IP address.
     * - mask: The address mask.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("initWithAddress:mask:")
    public native AVCustomRoutingPartialIP initWithAddressMask(@NotNull NSData address, @NotNull NSData mask);

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
     * A mask representing how many octets of the IP address to respect.
     * 
     * Use this mask to pass the last two bytes of the IP address instead of passing all four bytes.
     * 
     * ```var anIPAddressInBytes:[Byte] = [0, 0, 10, 5]
     * var address = Data(bytes: anAddressInBytes, length: anAddressInBytes.count)
     * var aMaskInBytes:[Byte] = [0, 0, 255, 255]
     * var mask = Data(bytes: aMaskInBytes, length: aMaskInBytes.count)
     * var partialIP =AVCustomRoutingPartialIP(address: address, mask: mask)
     * ```
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("mask")
    public native NSData mask();

    @Generated
    @Owned
    @Selector("new")
    public static native AVCustomRoutingPartialIP new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}