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

package apple.localauthentication.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class LACredentialType {
    @Generated
    private LACredentialType() {
    }

    /**
     * Password provided by application
     * <p>
     * If not set, LocalAuthentication will ask for the password when necessary. It will use
     * its own user interface depending on the evaluated policy or ACL.
     * Applications can provide the password using the setCredential method. In such case,
     * LocalAuthentication will not show password entry user interface.
     * When entered from the LocalAuthentication user interface, the password is stored as
     * UTF-8 encoded string.
     */
    @Generated @NInt public static final long ApplicationPassword = 0x0000000000000000L;
    /**
     * Smart card PIN provided by application
     * <p>
     * If not set, LocalAuthentication will ask users for the smart card PIN when necessary.
     * Applications can provide the PIN using setCredential method. In such case,
     * LocalAuthentication will not show the smart card PIN user interface.
     * When entered from the LocalAuthentication user interface, the PIN is stored as
     * UTF-8 encoded string.
     */
    @Generated @NInt public static final long SmartCardPIN = 0xFFFFFFFFFFFFFFFDL;
}
