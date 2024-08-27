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

package apple.videosubscriberaccount.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Represents the current state of the application's access to the user's subscription information.
 * 
 * API-Since: 10.0
 */
@Generated
public final class VSAccountAccessStatus {
    /**
     * The user has not yet made a choice about whether to allow this access to the app.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * Restrictions, e.g. parental controls, prohibit the user from allowing access to the app.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    /**
     * The user has explicitly decided to not allow the app to access subscription information.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
    /**
     * The user has currently decided to allow the app to access subscription information.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Granted = 0x0000000000000003L;

    @Generated
    private VSAccountAccessStatus() {
    }
}
