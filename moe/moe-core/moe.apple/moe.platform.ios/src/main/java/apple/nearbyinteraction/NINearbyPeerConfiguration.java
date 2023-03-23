package apple.nearbyinteraction;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object to describe and configure parameters to be used in a nearby interaction session for mutual relative
 * positional measurements.
 * 
 * Devices engaged in a session run with an NINearbyPeerConfiguration are able to continuously generate positional
 * measurements relative to one another.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("NearbyInteraction")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NINearbyPeerConfiguration extends NIConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected NINearbyPeerConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NINearbyPeerConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NINearbyPeerConfiguration allocWithZone(VoidPtr zone);

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
    public native NINearbyPeerConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native NINearbyPeerConfiguration initWithCoder(NSCoder coder);

    /**
     * Initializes a new configuration with the provided peer token.
     * 
     * @param peerToken A discovery token received from the peer for this session.
     */
    @Generated
    @Selector("initWithPeerToken:")
    public native NINearbyPeerConfiguration initWithPeerToken(NIDiscoveryToken peerToken);

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
    public static native NINearbyPeerConfiguration new_objc();

    /**
     * The discovery token identifying the peer device for this session configuration.
     */
    @Generated
    @Selector("peerDiscoveryToken")
    public native NIDiscoveryToken peerDiscoveryToken();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Enables camera assistance during the NISession run with this configuration
     * 
     * If true, optionally call setARSession: on the NISession before calling runWithConfiguration:
     * If true and setARSession: is not called, an ARSession will automatically be created
     * If true and the platform does not support camera assistance, the NISession will generate an error when
     * runWithConfiguration: is called
     * [@note] Check supportsCameraAssistance property in NIDeviceCapability returned from deviceCapabilities properties
     * on NISession
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isCameraAssistanceEnabled")
    public native boolean isCameraAssistanceEnabled();

    /**
     * Enables camera assistance during the NISession run with this configuration
     * 
     * If true, optionally call setARSession: on the NISession before calling runWithConfiguration:
     * If true and setARSession: is not called, an ARSession will automatically be created
     * If true and the platform does not support camera assistance, the NISession will generate an error when
     * runWithConfiguration: is called
     * [@note] Check supportsCameraAssistance property in NIDeviceCapability returned from deviceCapabilities properties
     * on NISession
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setCameraAssistanceEnabled:")
    public native void setCameraAssistanceEnabled(boolean value);
}
