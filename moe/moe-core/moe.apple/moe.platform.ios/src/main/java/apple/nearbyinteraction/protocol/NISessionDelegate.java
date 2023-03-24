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
import apple.nearbyinteraction.NIAlgorithmConvergence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Delegate for nearby interaction session updates.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("NearbyInteraction")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NISessionDelegate")
public interface NISessionDelegate {
    /**
     * Provides configuration data that needs to be shared with the accessory.
     * [@note] Shareable configuration data is only provided when running an NINearbyAccessoryConfiguration.
     * 
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
     * 
     *                                   API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("session:didGenerateShareableConfigurationData:forObject:")
    default void sessionDidGenerateShareableConfigurationDataForObject(@NotNull NISession session,
            @NotNull NSData shareableConfigurationData, @NotNull NINearbyObject object) {
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
    default void sessionDidInvalidateWithError(@NotNull NISession session, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when the system is no longer attempting to interact with some nearby objects.
     * 
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
    default void sessionDidRemoveNearbyObjectsWithReason(@NotNull NISession session,
            @NotNull NSArray<? extends NINearbyObject> nearbyObjects, @NInt long reason) {
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
    default void sessionDidUpdateNearbyObjects(@NotNull NISession session,
            @NotNull NSArray<? extends NINearbyObject> nearbyObjects) {
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
    default void sessionSuspensionEnded(@NotNull NISession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when a session is suspended.
     * 
     * A session will be suspended in various app and system scenarios.
     * A suspended session may be run again only after -sessionSuspensionEnded: has been called. Restart a session by
     * issuing a new call to -runWithConfiguration:.
     * 
     * @param session The nearby interaction session that was suspended.
     */
    @Generated
    @IsOptional
    @Selector("sessionWasSuspended:")
    default void sessionWasSuspended(@NotNull NISession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the algorithm state is updated for a specific nearby object.
     * 
     * @param session     the session interacting with this object.
     * @param convergence the algoriothm convergence context of the estimator for the session or nearby object
     * @param object      which nearby object this state was updated, if null, applies to the entire session
     * 
     *                    API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("session:didUpdateAlgorithmConvergence:forObject:")
    default void sessionDidUpdateAlgorithmConvergenceForObject(@NotNull NISession session,
            @NotNull NIAlgorithmConvergence convergence, @Nullable NINearbyObject object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The delegate may implement this method to be informed that the session started running.
     * 
     * a call to -runWithConfiguration: will result in one of the following outcomes:
     * 1. The session successfully starts running. This delegate callback will be subsequently invoked.
     * 2. Resources are not ready, and the session is immediately suspended. This delegate callback will not be invoked.
     * 3. An error is encountered, and the session is immediately invalidated. This delegate callback will not be
     * invoked.
     * 
     * This delegate method provides a way to monitor #1.
     * Note that #2 and #3 can be monitored by other delegate methods such as -sessionWasSuspended: and
     * -session:didInvalidateWithError:
     * 
     * API-Since: 16.0
     * 
     * @param session The session which started running
     */
    @Generated
    @IsOptional
    @Selector("sessionDidStartRunning:")
    default void sessionDidStartRunning(@NotNull NISession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
