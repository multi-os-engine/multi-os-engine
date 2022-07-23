package apple.nearbyinteraction.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.nearbyinteraction.NINearbyObject;
import apple.nearbyinteraction.NISession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Delegate for nearby interaction session updates.
 */
@Generated
@Library("NearbyInteraction")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NISessionDelegate")
public interface NISessionDelegate {
    /**
     * Provides configuration data that needs to be shared with the accessory.
     * [@note] Shareable configuration data is only provided when running an NINearbyAccessoryConfiguration.
     * <p>
     * After invoking this callback, the session will go into a special preparedness state for a limited amount of time.
     * The interaction on the accessory must start within this time window. If activity is not detected from the
     * accessory, the session will call
     * the -[session:didRemoveNearbyObjects:reason:] delegate callback. To restart the session, coordinate with the
     * accessory and call -[runWithConfiguration] again.
     *
     * @param session                    The session which produced the configuration data.
     * @param shareableConfigurationData The configuration data that needs to be shared with the accessory.
     * @param object                     A representation of the accessory as a NINearbyObject. The discoveryToken
     *                                   property will be equal to the one in the configuration used to run the session.
     */
    @Generated
    @IsOptional
    @Selector("session:didGenerateShareableConfigurationData:forObject:")
    default void sessionDidGenerateShareableConfigurationDataForObject(NISession session,
            NSData shareableConfigurationData, NINearbyObject object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when a session is invalidated.
     *
     * @param session The session that has become invalid. Your app should discard any references it has to this
     *                session.
     * @param error   The error indicating the reason for invalidation of the session (see NIError.h).
     */
    @Generated
    @IsOptional
    @Selector("session:didInvalidateWithError:")
    default void sessionDidInvalidateWithError(NISession session, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when the system is no longer attempting to interact with some nearby objects.
     * <p>
     * The system was unable to interact with a peer device for some time, or the peer device signaled that it is
     * leaving the session. After this callback is received, the session with the peer is no longer active. To retry
     * interacting with the peer, issue a new call to -runWithConfiguration:.
     *
     * @param session       The nearby interaction session that removed the nearby object(s).
     * @param nearbyObjects The nearby objects that were removed.
     * @param reason        The reason the nearby object(s) were removed. All objects in nearbyObjects are removed for
     *                      the same reason. If multiple nearby objects are removed for different reasons,
     *                      -didRemoveNearbyObjects:reason: will be called multiple times.
     */
    @Generated
    @IsOptional
    @Selector("session:didRemoveNearbyObjects:withReason:")
    default void sessionDidRemoveNearbyObjectsWithReason(NISession session,
            NSArray<? extends NINearbyObject> nearbyObjects, @NInt long reason) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when new updates about nearby objects are available.
     *
     * @param session       The nearby interaction session being run.
     * @param nearbyObjects The nearby objects that have been updated.
     */
    @Generated
    @IsOptional
    @Selector("session:didUpdateNearbyObjects:")
    default void sessionDidUpdateNearbyObjects(NISession session, NSArray<? extends NINearbyObject> nearbyObjects) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when a session may be resumed.
     *
     * @param session The nearby interaction session that was suspended.
     */
    @Generated
    @IsOptional
    @Selector("sessionSuspensionEnded:")
    default void sessionSuspensionEnded(NISession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when a session is suspended.
     * <p>
     * A session will be suspended in various app and system scenarios.
     * A suspended session may be run again only after -sessionSuspensionEnded: has been called. Restart a session by
     * issuing a new call to -runWithConfiguration:.
     *
     * @param session The nearby interaction session that was suspended.
     */
    @Generated
    @IsOptional
    @Selector("sessionWasSuspended:")
    default void sessionWasSuspended(NISession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
