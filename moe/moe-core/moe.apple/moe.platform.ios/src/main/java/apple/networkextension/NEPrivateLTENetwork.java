package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] NEPrivateLTENetwork
 * 
 * The NEPrivateLTENetwork class declares an object that contains the parameters of a private LTE network.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEPrivateLTENetwork extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NEPrivateLTENetwork(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEPrivateLTENetwork alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEPrivateLTENetwork allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEPrivateLTENetwork init();

    @Generated
    @Selector("initWithCoder:")
    public native NEPrivateLTENetwork initWithCoder(NSCoder coder);

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
     * [@property] mobileCountryCode
     * 
     * Mobile Country Code of the private LTE network.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("mobileCountryCode")
    public native String mobileCountryCode();

    /**
     * [@property] mobileNetworkCode
     * 
     * Mobile Network Code of the private LTE network.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("mobileNetworkCode")
    public native String mobileNetworkCode();

    @Generated
    @Owned
    @Selector("new")
    public static native NEPrivateLTENetwork new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] mobileCountryCode
     * 
     * Mobile Country Code of the private LTE network.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMobileCountryCode:")
    public native void setMobileCountryCode(String value);

    /**
     * [@property] mobileNetworkCode
     * 
     * Mobile Network Code of the private LTE network.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMobileNetworkCode:")
    public native void setMobileNetworkCode(String value);

    /**
     * [@property] trackingAreaCode
     * 
     * Tracking Area Code of the private LTE network. This property is only applicable for band 48 private LTE networks.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTrackingAreaCode:")
    public native void setTrackingAreaCode(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] trackingAreaCode
     * 
     * Tracking Area Code of the private LTE network. This property is only applicable for band 48 private LTE networks.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("trackingAreaCode")
    public native String trackingAreaCode();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
