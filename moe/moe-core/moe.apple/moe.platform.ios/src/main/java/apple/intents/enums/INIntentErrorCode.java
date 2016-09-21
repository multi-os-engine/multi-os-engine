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

@Generated
public final class INIntentErrorCode {
    @Generated @NInt public static final long InteractionOperationNotSupported = 0x000000000000076CL;
    @Generated @NInt public static final long DonatingInteraction = 0x000000000000076DL;
    @Generated @NInt public static final long DeletingAllInteractions = 0x000000000000076EL;
    @Generated @NInt public static final long DeletingInteractionWithIdentifiers = 0x000000000000076FL;
    @Generated @NInt public static final long DeletingInteractionWithGroupIdentifier = 0x0000000000000770L;
    @Generated @NInt public static final long IntentSupportedByMultipleExtension = 0x00000000000007D1L;
    @Generated @NInt public static final long RestrictedIntentsNotSupportedByExtension = 0x00000000000007D2L;
    @Generated @NInt public static final long NoHandlerProvidedForIntent = 0x00000000000007D3L;
    @Generated @NInt public static final long InvalidIntentName = 0x00000000000007D4L;
    @Generated @NInt public static final long RequestTimedOut = 0x0000000000000BB9L;
    @Generated @NInt public static final long InvalidUserVocabularyFileLocation = 0x0000000000000FA0L;

    @Generated
    private INIntentErrorCode() {
    }
}
