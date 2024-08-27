package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.5
 */
@Generated
public final class GKFriendsAuthorizationStatus {
    @Generated
    private GKFriendsAuthorizationStatus() {
    }

    /**
     * User has not yet made a choice with regards to this application.
     * A call to loadFriendsListWithHandler: in this state will result
     * into a prompt that might pause your application.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * This application is not authorized to use friend list data. Due
     * to active restrictions on friend list data, the user cannot change
     * this status, and may not have personally denied authorization.
     * If you have previously collected data for this player's friend list,
     * You should delete the data collected on your end.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    /**
     * User has explicitly denied this application access to friend list data,
     * or global friend list access are disabled in Settings.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
    /**
     * User has authorized this application to access friend list data.
     * A call to loadFriends: will return the player's
     * friend list via a completion block
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000003L;
}
