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

package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class INIntentErrorCode {
    /**
     * Interactions
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long InteractionOperationNotSupported = 0x000000000000076CL;
    /**
     * Interactions
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long DonatingInteraction = 0x000000000000076DL;
    /**
     * Interactions
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long DeletingAllInteractions = 0x000000000000076EL;
    /**
     * Interactions
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long DeletingInteractionWithIdentifiers = 0x000000000000076FL;
    /**
     * Interactions
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long DeletingInteractionWithGroupIdentifier = 0x0000000000000770L;
    /**
     * Extension discovery / info plist validation
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long IntentSupportedByMultipleExtension = 0x00000000000007D1L;
    /**
     * Extension discovery / info plist validation
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long RestrictedIntentsNotSupportedByExtension = 0x00000000000007D2L;
    /**
     * Extension discovery / info plist validation
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NoHandlerProvidedForIntent = 0x00000000000007D3L;
    /**
     * Extension discovery / info plist validation
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long InvalidIntentName = 0x00000000000007D4L;
    /**
     * Requests
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long RequestTimedOut = 0x0000000000000BB9L;
    /**
     * User Vocabulary Sync
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long InvalidUserVocabularyFileLocation = 0x0000000000000FA0L;

    @Generated
    private INIntentErrorCode() {
    }

    /**
     * Extension connection
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ExtensionLaunchingTimeout = 0x0000000000001388L;
    /**
     * Extension connection
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ExtensionBringUpFailed = 0x0000000000001389L;
    /**
     * Extension discovery / info plist validation
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NoAppAvailable = 0x00000000000007D5L;
    /**
     * Requests
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long MissingInformation = 0x0000000000000BBAL;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageGeneric = 0x0000000000001770L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageNoServiceAvailable = 0x0000000000001771L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageStorageFailed = 0x0000000000001772L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageLoadingFailed = 0x0000000000001773L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageRetrievalFailed = 0x0000000000001774L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageProxyLoop = 0x0000000000001775L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageProxyInvalid = 0x0000000000001776L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageProxyTimeout = 0x0000000000001777L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageServiceFailure = 0x0000000000001778L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImageScalingFailed = 0x0000000000001779L;
    /**
     * Image loading, storage, and retrieval
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long PermissionDenied = 0x000000000000177AL;
    /**
     * Voice Shortcuts
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long VoiceShortcutCreationFailed = 0x0000000000001B58L;
    /**
     * Voice Shortcuts
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long VoiceShortcutGetFailed = 0x0000000000001B59L;
    /**
     * Voice Shortcuts
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long VoiceShortcutDeleteFailed = 0x0000000000001B5AL;
    /**
     * Encoding
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long EncodingGeneric = 0x0000000000001F40L;
    /**
     * Encoding
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long EncodingFailed = 0x0000000000001F41L;
    /**
     * Decoding
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long DecodingGeneric = 0x0000000000002328L;
}
