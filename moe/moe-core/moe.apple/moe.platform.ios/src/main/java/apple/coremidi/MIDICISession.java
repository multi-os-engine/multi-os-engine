package apple.coremidi;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MIDICISession
 * <p>
 * Object representating a MIDI Capability Inquiry session.
 * <p>
 * A MIDI Capability Inquiry session is a bidirectional communication path between a MIDI process
 * and a MIDI-CI node (i.e., paired MIDI source and destination) identified using MIDI-CI discovery.
 * A MIDICISession can be used to manipulate MIDI-CI profiles and to discover the MIDI-CI property
 * capability.
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDICISession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDICISession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDICISession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MIDICISession allocWithZone(VoidPtr zone);

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

    /**
     * Given a MIDI channel number, asynchronously request that the supplied profile be disabled.
     * The result of this operation is sent to the MIDICIProfileChangedBlock.
     * Returnes YES if the request is valid.
     */
    @Generated
    @Selector("disableProfile:onChannel:error:")
    public native boolean disableProfileOnChannelError(MIDICIProfile profile, byte channel,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Given a MIDI channel number, asynchronously request that the supplied profile be enabled.
     * The result of this operation is sent to the MIDICIProfileChangedBlock.
     * Returns YES if the request is valid.
     */
    @Generated
    @Selector("enableProfile:onChannel:error:")
    public native boolean enableProfileOnChannelError(MIDICIProfile profile, byte channel,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MIDICISession init();

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
    public static native MIDICISession new_objc();

    /**
     * An optional block called when a device signals that a profile has been enabled or disabled.
     */
    @Generated
    @Selector("profileChangedCallback")
    @ObjCBlock(name = "call_profileChangedCallback_ret")
    public native Block_profileChangedCallback_ret profileChangedCallback();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_profileChangedCallback_ret {
        @Generated
        void call_profileChangedCallback_ret(MIDICISession session, byte channel, MIDICIProfile profile,
                boolean enabled);
    }

    /**
     * Given a MIDI channel number, return the supported profiles. Note that the
     * arrays will be empty if this property is queried before data is ready.
     */
    @Generated
    @Selector("profileStateForChannel:")
    public native MIDICIProfileState profileStateForChannel(byte channel);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An optional block called when a device signals that a profile has been enabled or disabled.
     */
    @Generated
    @Selector("setProfileChangedCallback:")
    public native void setProfileChangedCallback(
            @ObjCBlock(name = "call_setProfileChangedCallback") Block_setProfileChangedCallback value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setProfileChangedCallback {
        @Generated
        void call_setProfileChangedCallback(MIDICISession session, byte channel, MIDICIProfile profile,
                boolean enabled);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * After CI session data is ready, indicates whether the entity supports the MIDI-CI profile capability.
     */
    @Generated
    @Selector("supportsProfileCapability")
    public native boolean supportsProfileCapability();

    /**
     * After CI session data is ready, indicates whether the entity supports the MIDI-CI property exchange capability.
     */
    @Generated
    @Selector("supportsPropertyCapability")
    public native boolean supportsPropertyCapability();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Obtain the device's basic identification. Nil before data is ready or if the device does not
     * support MIDI-CI.
     */
    @Generated
    @Selector("deviceInfo")
    public native MIDICIDeviceInfo deviceInfo();

    @Generated
    @Selector("initWithDiscoveredNode:dataReadyHandler:disconnectHandler:")
    public native MIDICISession initWithDiscoveredNodeDataReadyHandlerDisconnectHandler(
            MIDICIDiscoveredNode discoveredNode,
            @ObjCBlock(name = "call_initWithDiscoveredNodeDataReadyHandlerDisconnectHandler_1") Block_initWithDiscoveredNodeDataReadyHandlerDisconnectHandler_1 handler,
            @ObjCBlock(name = "call_initWithDiscoveredNodeDataReadyHandlerDisconnectHandler_2") Block_initWithDiscoveredNodeDataReadyHandlerDisconnectHandler_2 disconnectHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDiscoveredNodeDataReadyHandlerDisconnectHandler_1 {
        @Generated
        void call_initWithDiscoveredNodeDataReadyHandlerDisconnectHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDiscoveredNodeDataReadyHandlerDisconnectHandler_2 {
        @Generated
        void call_initWithDiscoveredNodeDataReadyHandlerDisconnectHandler_2(MIDICISession session, NSError error);
    }

    /**
     * int
     */
    @Generated
    @Selector("maxPropertyRequests")
    public native NSNumber maxPropertyRequests();

    /**
     * unsigned long
     */
    @Generated
    @Selector("maxSysExSize")
    public native NSNumber maxSysExSize();

    /**
     * The MIDI destination with which the session is communicating.
     */
    @Generated
    @Selector("midiDestination")
    public native int midiDestination();

    /**
     * An optional block called when a device sends profile-specific data to the session.
     */
    @Generated
    @Selector("profileSpecificDataHandler")
    @ObjCBlock(name = "call_profileSpecificDataHandler_ret")
    public native Block_profileSpecificDataHandler_ret profileSpecificDataHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_profileSpecificDataHandler_ret {
        @Generated
        void call_profileSpecificDataHandler_ret(MIDICISession session, byte channel, MIDICIProfile profile,
                NSData profileSpecificData);
    }

    /**
     * Given a MIDI channel number, send profile specific data to the MIDICISession.
     * Returns YES if the data was successfully sent.
     */
    @Generated
    @Selector("sendProfile:onChannel:profileData:")
    public native boolean sendProfileOnChannelProfileData(MIDICIProfile profile, byte channel,
            NSData profileSpecificData);

    /**
     * An optional block called when a device sends profile-specific data to the session.
     */
    @Generated
    @Selector("setProfileSpecificDataHandler:")
    public native void setProfileSpecificDataHandler(
            @ObjCBlock(name = "call_setProfileSpecificDataHandler") Block_setProfileSpecificDataHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setProfileSpecificDataHandler {
        @Generated
        void call_setProfileSpecificDataHandler(MIDICISession session, byte channel, MIDICIProfile profile,
                NSData profileSpecificData);
    }
}
