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

package apple.security.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum SSLAuthenticate
 * @discussion Optional; Default is kNeverAuthenticate.
 *    Can only be called when no session is active.
 */
@Generated
public final class SSLAuthenticate {
    /**
     * skip client authentication
     */
    @Generated public static final int NeverAuthenticate = 0x00000000;
    /**
     * require it
     */
    @Generated public static final int AlwaysAuthenticate = 0x00000001;
    /**
     * try to authenticate, but not an error if client doesn't have a cert
     */
    @Generated public static final int TryAuthenticate = 0x00000002;

    @Generated
    private SSLAuthenticate() {
    }
}
