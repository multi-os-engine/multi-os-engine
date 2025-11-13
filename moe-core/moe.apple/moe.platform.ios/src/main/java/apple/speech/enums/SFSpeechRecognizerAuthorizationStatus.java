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

package apple.speech.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The app's authorization to perform speech recognition.
 * 
 * API-Since: 10.0
 */
@Generated
public final class SFSpeechRecognizerAuthorizationStatus {
    /**
     * The app's authorization status has not yet been determined.
     * 
     * When your app's status is not determined, calling the ``SFSpeechRecognizer/requestAuthorization(_:)`` method
     * prompts the user to grant or deny authorization.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * The user denied your app's request to perform speech recognition.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000001L;
    /**
     * The device prevents your app from performing speech recognition.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000002L;
    /**
     * The user granted your app's request to perform speech recognition.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000003L;

    @Generated
    private SFSpeechRecognizerAuthorizationStatus() {
    }
}
