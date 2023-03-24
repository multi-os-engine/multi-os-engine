package apple.pushtotalk.protocol;

import apple.avfaudio.AVAudioSession;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSUUID;
import apple.pushtotalk.PTChannelManager;
import apple.pushtotalk.PTPushResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 16.0
 */
@Generated
@Library("PushToTalk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PTChannelManagerDelegate")
public interface PTChannelManagerDelegate {
    /**
     * This method is called when the user begins pressing the Talk button in the system user interface, when a
     * programmatic transmit start request succeeds, or transmitting began due to a hands-free accessory button press.
     */
    @Generated
    @Selector("channelManager:channelUUID:didBeginTransmittingFromSource:")
    void channelManagerChannelUUIDDidBeginTransmittingFromSource(@NotNull PTChannelManager channelManager,
            @NotNull NSUUID channelUUID, @NInt long source);

    /**
     * This method is called when the user stops pressing the Talk button in the system user interface, when a
     * programmatic transmit stop request succeeds, or transmitting ends due to a hands-free accessory button press.
     */
    @Generated
    @Selector("channelManager:channelUUID:didEndTransmittingFromSource:")
    void channelManagerChannelUUIDDidEndTransmittingFromSource(@NotNull PTChannelManager channelManager,
            @NotNull NSUUID channelUUID, @NInt long source);

    @Generated
    @Selector("channelManager:didActivateAudioSession:")
    void channelManagerDidActivateAudioSession(@NotNull PTChannelManager channelManager,
            @NotNull AVAudioSession audioSession);

    @Generated
    @Selector("channelManager:didDeactivateAudioSession:")
    void channelManagerDidDeactivateAudioSession(@NotNull PTChannelManager channelManager,
            @NotNull AVAudioSession audioSession);

    /**
     * This method is called when your channel becomes active in the system user interface
     */
    @Generated
    @Selector("channelManager:didJoinChannelWithUUID:reason:")
    void channelManagerDidJoinChannelWithUUIDReason(@NotNull PTChannelManager channelManager,
            @NotNull NSUUID channelUUID, @NInt long reason);

    /**
     * This method is called once your channel is ended
     */
    @Generated
    @Selector("channelManager:didLeaveChannelWithUUID:reason:")
    void channelManagerDidLeaveChannelWithUUIDReason(@NotNull PTChannelManager channelManager,
            @NotNull NSUUID channelUUID, @NInt long reason);

    @Generated
    @IsOptional
    @Selector("channelManager:failedToBeginTransmittingInChannelWithUUID:error:")
    default void channelManagerFailedToBeginTransmittingInChannelWithUUIDError(@NotNull PTChannelManager channelManager,
            @NotNull NSUUID channelUUID, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("channelManager:failedToJoinChannelWithUUID:error:")
    default void channelManagerFailedToJoinChannelWithUUIDError(@NotNull PTChannelManager channelManager,
            @NotNull NSUUID channelUUID, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("channelManager:failedToLeaveChannelWithUUID:error:")
    default void channelManagerFailedToLeaveChannelWithUUIDError(@NotNull PTChannelManager channelManager,
            @NotNull NSUUID channelUUID, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("channelManager:failedToStopTransmittingInChannelWithUUID:error:")
    default void channelManagerFailedToStopTransmittingInChannelWithUUIDError(@NotNull PTChannelManager channelManager,
            @NotNull NSUUID channelUUID, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method is called when your channel manager receives a push token after joining a channel. This token is
     * ephemeral and is only valid while joined to the channel; it is invalidated when the user or a push request leave
     * the channel. When sending pushes, the apns-topic header field must use your app’s bundle ID with .voip-ptt
     * appended to the end
     */
    @Generated
    @Selector("channelManager:receivedEphemeralPushToken:")
    void channelManagerReceivedEphemeralPushToken(@NotNull PTChannelManager channelManager, @NotNull NSData pushToken);

    /**
     * This method is called for each incoming push. You must instantiate and return nonnil PTPushResult for each
     * incoming push. The system will fulfill the action specified by the PTPushResult on your behalf automatically.
     */
    @NotNull
    @Generated
    @Selector("incomingPushResultForChannelManager:channelUUID:pushPayload:")
    PTPushResult incomingPushResultForChannelManagerChannelUUIDPushPayload(@NotNull PTChannelManager channelManager,
            @NotNull NSUUID channelUUID, @NotNull NSDictionary<String, ?> pushPayload);
}