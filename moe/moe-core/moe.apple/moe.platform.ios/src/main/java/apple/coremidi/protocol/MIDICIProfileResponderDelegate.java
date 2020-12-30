package apple.coremidi.protocol;

import apple.coremidi.MIDICIDeviceInfo;
import apple.coremidi.MIDICIProfile;
import apple.foundation.NSData;
import apple.foundation.NSNumber;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @protocol  MIDICIProfileResponderDelegate
 * @brief     Protocol for an NSObject that constructs and issues responses for a MIDICIResponder.
 *            A MIDICIProfileResponderDelegate is required to construct a MIDICIResponder.
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MIDICIProfileResponderDelegate")
public interface MIDICIProfileResponderDelegate {
    /**
     * Allow a new MIDI-CI Initiator to create a session or reject the connection attempt
     */
    @Generated
    @Selector("connectInitiator:withDeviceInfo:")
    boolean connectInitiatorWithDeviceInfo(NSNumber initiatorMUID, MIDICIDeviceInfo deviceInfo);

    @Generated
    @IsOptional
    @Selector("handleDataForProfile:onChannel:data:")
    default void handleDataForProfileOnChannelData(MIDICIProfile aProfile, byte channel, NSData inData) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when an initiator terminates its MIDI-CI connection
     */
    @Generated
    @Selector("initiatorDisconnected:")
    void initiatorDisconnected(NSNumber initiatorMUID);

    /**
     * These methods must be implemented if the associated responder implements MIDI-CI profiles.
     */
    @Generated
    @IsOptional
    @Selector("willSetProfile:onChannel:enabled:")
    default boolean willSetProfileOnChannelEnabled(MIDICIProfile aProfile, byte channel, boolean shouldEnable) {
        throw new java.lang.UnsupportedOperationException();
    }
}