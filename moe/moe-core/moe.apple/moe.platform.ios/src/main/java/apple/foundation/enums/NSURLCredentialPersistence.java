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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @enum NSURLCredentialPersistence
 * @abstract Constants defining how long a credential will be kept around
 * @constant NSURLCredentialPersistenceNone This credential won't be saved.
 * @constant NSURLCredentialPersistenceForSession This credential will only be stored for this session.
 * @constant NSURLCredentialPersistencePermanent This credential will be stored permanently. Note: Whereas in Mac OS X any application can access any credential provided the user gives permission, in iPhone OS an application can access only its own credentials.
 * @constant NSURLCredentialPersistenceSynchronizable This credential will be stored permanently. Additionally, this credential will be distributed to other devices based on the owning AppleID.
 *     Note: Whereas in Mac OS X any application can access any credential provided the user gives permission, on iOS an application can 
 *     access only its own credentials.
 */
@Generated
public final class NSURLCredentialPersistence {
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long ForSession = 0x0000000000000001L;
    @Generated @NUInt public static final long Permanent = 0x0000000000000002L;
    @Generated @NUInt public static final long Synchronizable = 0x0000000000000003L;

    @Generated
    private NSURLCredentialPersistence() {
    }
}
