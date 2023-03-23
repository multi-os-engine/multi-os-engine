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

/**
 * AVCustomRoutingPartialIP
 * 
 * Represents a full or partial IP address. To be used in conjunction with AVCustomRoutingController.knownRouteIPs
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
     * [@property] address
     * 
     * Bytes of the IP address. A full or partial IP address for a device known to be on the network.
     * 
     * To create full known IP, the app would do the following:
     * var anIPAddressInBytes:[Byte] = [192, 168, 10, 5]
     * var address = Data(bytes: anAddressInBytes, length: anAddressInBytes.count)
     * var aMaskInBytes:[Byte] = [255, 255, 255, 255]
     * var mask = Data(bytes: aMaskInBytes, length: aMaskInBytes.count)
     * var partialIP = AVCustomRoutingPartialIP(address: address, mask: mask)
     * 
     * API-Since: 16.1
     */
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
    public native AVCustomRoutingPartialIP init();

    /**
     * initWithAddress:mask:
     * 
     * Initializes an IP fragment.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("initWithAddress:mask:")
    public native AVCustomRoutingPartialIP initWithAddressMask(NSData address, NSData mask);

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
     * [@property] mask
     * 
     * A mask representing how many octets of the ip address to respect.
     * 
     * An app can use this mask to only pass e.g. the last two bytes of the IP address. So instead of passing the full
     * IP address, the app can pass just the last two bytes by masking the first two.
     * var anIPAddressInBytes:[Byte] = [0, 0, 10, 5]
     * var address = Data(bytes: anAddressInBytes, length: anAddressInBytes.count)
     * var aMaskInBytes:[Byte] = [0, 0, 255, 255]
     * var mask = Data(bytes: aMaskInBytes, length: aMaskInBytes.count)
     * var partialIP =AVCustomRoutingPartialIP(address: address, mask: mask)
     * 
     * API-Since: 16.1
     */
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
}