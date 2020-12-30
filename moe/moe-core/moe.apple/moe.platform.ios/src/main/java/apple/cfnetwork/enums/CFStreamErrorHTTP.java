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
 *  CFStreamErrorHTTP
 * 
 *  Discussion:
 * Errors from the kCFStreamErrorDomainHTTP domain.
 */
@Generated
public final class CFStreamErrorHTTP {
    /**
     * Could not parse the request/response.
     */
    @Generated public static final int ParseFailure = 0xFFFFFFFF;
    /**
     * A loop was detected during redirection.
     */
    @Generated public static final int RedirectionLoop = 0xFFFFFFFE;
    /**
     * Could not retreive url for request/response.
     */
    @Generated public static final int BadURL = 0xFFFFFFFD;

    @Generated
    private CFStreamErrorHTTP() {
    }
}
