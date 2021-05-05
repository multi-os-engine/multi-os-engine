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
 * [@typedef] NEFilterManagerError
 * 
 * Filter error codes
 */
@Generated
public final class NEFilterManagerError {
    /**
     * [@const] NEFilterManagerErrorConfigurationInvalid The filter configuration is invalid
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000001L;
    /**
     * [@const] NEFilterManagerErrorConfigurationDisabled The filter configuration is not enabled.
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000002L;
    /**
     * [@const] NEFilterManagerErrorConfigurationStale The filter configuration needs to be loaded.
     */
    @Generated @NInt public static final long Stale = 0x0000000000000003L;
    /**
     * [@const] NEFilterManagerErrorConfigurationCannotBeRemoved The filter configuration cannot be removed.
     */
    @Generated @NInt public static final long CannotBeRemoved = 0x0000000000000004L;

    @Generated
    private NEFilterManagerError() {
    }

    /**
     * [@const] NEFilterManagerErrorConfigurationPermissionDenied Operation permission denied.
     */
    @Generated @NInt public static final long PermissionDenied = 0x0000000000000005L;
    /**
     * [@const] NEFilterManagerErrorConfigurationInternalError An internal configuration error occurred.
     */
    @Generated @NInt public static final long InternalError = 0x0000000000000006L;
}
