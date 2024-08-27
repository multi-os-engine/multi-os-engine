/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.accounts.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class ACErrorCode {
    @Generated public static final int Unknown = 0x00000001;
    /**
     * Account wasn't saved because it is missing a required property.
     */
    @Generated public static final int AccountMissingRequiredProperty = 0x00000002;
    /**
     * Account wasn't saved because authentication of the supplied credential failed.
     */
    @Generated public static final int AccountAuthenticationFailed = 0x00000003;
    /**
     * Account wasn't saved because the account type is invalid.
     */
    @Generated public static final int AccountTypeInvalid = 0x00000004;
    /**
     * Account wasn't added because it already exists.
     */
    @Generated public static final int AccountAlreadyExists = 0x00000005;
    /**
     * Account wasn't deleted because it could not be found.
     */
    @Generated public static final int AccountNotFound = 0x00000006;
    /**
     * The operation didn't complete because the user denied permission.
     */
    @Generated public static final int PermissionDenied = 0x00000007;
    /**
     * The client's access info dictionary has incorrect or missing values.
     */
    @Generated public static final int AccessInfoInvalid = 0x00000008;
    /**
     * Your client does not have access to the requested data.
     */
    @Generated public static final int ClientPermissionDenied = 0x00000009;
    /**
     * Due to the current protection policy in effect, we couldn't fetch a credential
     */
    @Generated public static final int AccessDeniedByProtectionPolicy = 0x0000000A;
    /**
     * Yo, I tried to find your credential, but it must have run off!
     */
    @Generated public static final int CredentialNotFound = 0x0000000B;
    /**
     * Something bad happened on the way to the keychain
     */
    @Generated public static final int FetchCredentialFailed = 0x0000000C;
    /**
     * Unable to store credential
     */
    @Generated public static final int StoreCredentialFailed = 0x0000000D;
    /**
     * Unable to remove credential
     */
    @Generated public static final int RemoveCredentialFailed = 0x0000000E;
    /**
     * Account save failed because the account being updated has been removed.
     */
    @Generated public static final int UpdatingNonexistentAccount = 0x0000000F;
    /**
     * The client making the request does not have a valid bundle ID.
     */
    @Generated public static final int InvalidClientBundleID = 0x00000010;
    /**
     * A plugin prevented the expected action to occur.
     */
    @Generated public static final int DeniedByPlugin = 0x00000011;
    /**
     * Something broke below us when we tried to the CoreData store.
     */
    @Generated public static final int CoreDataSaveFailed = 0x00000012;
    @Generated public static final int FailedSerializingAccountInfo = 0x00000013;
    @Generated public static final int InvalidCommand = 0x00000014;
    @Generated public static final int MissingTransportMessageID = 0x00000015;
    /**
     * Credential item wasn't saved because it could not be found.
     */
    @Generated public static final int CredentialItemNotFound = 0x00000016;
    /**
     * Credential item wasn't removed because it has not yet expired.
     */
    @Generated public static final int CredentialItemNotExpired = 0x00000017;

    @Generated
    private ACErrorCode() {
    }
}
