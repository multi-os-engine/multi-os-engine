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

package ios.accounts.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class ACErrorCode {
	@Generated
	private ACErrorCode() {
	}

	@Generated
	public static final int Unknown = 0x00000001;
	@Generated
	public static final int AccountMissingRequiredProperty = 0x00000002;
	@Generated
	public static final int AccountAuthenticationFailed = 0x00000003;
	@Generated
	public static final int AccountTypeInvalid = 0x00000004;
	@Generated
	public static final int AccountAlreadyExists = 0x00000005;
	@Generated
	public static final int AccountNotFound = 0x00000006;
	@Generated
	public static final int PermissionDenied = 0x00000007;
	@Generated
	public static final int AccessInfoInvalid = 0x00000008;
	@Generated
	public static final int ClientPermissionDenied = 0x00000009;
	@Generated
	public static final int AccessDeniedByProtectionPolicy = 0x0000000A;
	@Generated
	public static final int CredentialNotFound = 0x0000000B;
	@Generated
	public static final int FetchCredentialFailed = 0x0000000C;
	@Generated
	public static final int StoreCredentialFailed = 0x0000000D;
	@Generated
	public static final int RemoveCredentialFailed = 0x0000000E;
	@Generated
	public static final int UpdatingNonexistentAccount = 0x0000000F;
	@Generated
	public static final int InvalidClientBundleID = 0x00000010;
	@Generated
	public static final int DeniedByPlugin = 0x00000011;
	@Generated
	public static final int CoreDataSaveFailed = 0x00000012;
	@Generated
	public static final int FailedSerializingAccountInfo = 0x00000013;
	@Generated
	public static final int InvalidCommand = 0x00000014;
	@Generated
	public static final int MissingTransportMessageID = 0x00000015;
	@Generated
	public static final int CredentialItemNotFound = 0x00000016;
	@Generated
	public static final int CredentialItemNotExpired = 0x00000017;
}
