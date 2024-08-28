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

package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEHotspotHelperResult
 * 
 * The result of processing the NEHotspotHelperCommand.
 * 
 * The HotspotHelper provides the result of
 * processing the NEHotspotHelperCommand when it instantiates
 * its NEHotspotHelperResponse.
 * [@const] kNEHotspotHelperResultSuccess The operation was successful.
 * [@const] kNEHotspotHelperResultFailure The operation failed.
 * [@const] kNEHotspotHelperResultUIRequired The operation requires user
 * interaction. This result is only valid in response to a command with type
 * kNEHotspotHelperCommandTypeAuthenticate.
 * [@const] kNEHotspotHelperResultCommandNotRecognized The helper did not
 * recognize the command type.
 * [@const] kNEHotspotHelperResultAuthenticationRequired The network requires
 * authentication again. This result is only valid in response to a
 * command with type kNEHotspotHelperCommandTypeMaintain.
 * [@const] kNEHotspotHelperResultUnsupportedNetwork After attempting to
 * authenticate, the helper determined that it can't perform the
 * authentication. This result is only valid in response to commands of type
 * kNEHotspotHelperCommandTypeAuthenticate and
 * kNEHotspotHelperCommandTypePresentUI.
 * [@const] kNEHotspotHelperResultTemporaryFailure The helper determined that
 * it is temporarily unable to perform the authentication.
 * This result is only valid in response to commands of type
 * kNEHotspotHelperCommandTypeAuthenticate and
 * kNEHotspotHelperCommandTypePresentUI.
 * 
 * API-Since: 9.0
 */
@Generated
public final class NEHotspotHelperResult {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Failure = 0x0000000000000001L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long UIRequired = 0x0000000000000002L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long CommandNotRecognized = 0x0000000000000003L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long AuthenticationRequired = 0x0000000000000004L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long UnsupportedNetwork = 0x0000000000000005L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long TemporaryFailure = 0x0000000000000006L;

    @Generated
    private NEHotspotHelperResult() {
    }
}
