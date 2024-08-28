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

package apple.cfnetwork.enums;

import org.moe.natj.general.ann.Generated;

/**
 * CFStreamErrorHTTPAuthentication
 * 
 * Discussion:
 * Authentication errors which may be returned as a result of trying
 * to apply authentication to a request. These errors are in the
 * kCFStreamErrorDomainHTTP domain.
 */
@Generated
public final class CFStreamErrorHTTPAuthentication {
    /**
     * The type of authentication to be applied to a request is not
     * supported.
     */
    @Generated public static final int TypeUnsupported = 0xFFFFFC18;
    /**
     * The username was in a format not suitable for applying to the
     * request.
     */
    @Generated public static final int BadUserName = 0xFFFFFC17;
    /**
     * The password was in a format not suitable for applying to the
     * request.
     */
    @Generated public static final int BadPassword = 0xFFFFFC16;

    @Generated
    private CFStreamErrorHTTPAuthentication() {
    }
}
