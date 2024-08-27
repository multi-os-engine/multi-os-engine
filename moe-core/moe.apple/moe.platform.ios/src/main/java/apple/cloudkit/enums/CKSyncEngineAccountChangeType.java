package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CKSyncEngineAccountChangeType {
    @Generated
    private CKSyncEngineAccountChangeType() {
    }

    /**
     * The user signed in to an account.
     * 
     * If you already have data stored locally, you have a few options:
     * 
     * - Merge the local data with the newly-signed-in account's data.
     * - Keep the local data separate from cloud-synced data (e.g. a separate "local account").
     * - Delete the local data.
     * - Prompt the user to make the decision.
     */
    @Generated @NInt public static final long SignIn = 0x0000000000000000L;
    /**
     * The user signed out of their account.
     * 
     * You should delete any locally-stored data for the previous account.
     */
    @Generated @NInt public static final long SignOut = 0x0000000000000001L;
    /**
     * The user switched from one account to another.
     * This might happen if the user signs out and in to a new account while your application is quit.
     * 
     * You should delete any locally-stored data for the previous account.
     */
    @Generated @NInt public static final long SwitchAccounts = 0x0000000000000002L;
}