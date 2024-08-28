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

package apple.contacts.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 9.0
 */
@Generated
public final class CNErrorCode {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long CommunicationError = 0x0000000000000001L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long DataAccessError = 0x0000000000000002L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long AuthorizationDenied = 0x0000000000000064L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long RecordDoesNotExist = 0x00000000000000C8L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long InsertedRecordAlreadyExists = 0x00000000000000C9L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ContainmentCycle = 0x00000000000000CAL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ContainmentScope = 0x00000000000000CBL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ParentRecordDoesNotExist = 0x00000000000000CCL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ValidationMultipleErrors = 0x000000000000012CL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ValidationTypeMismatch = 0x000000000000012DL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ValidationConfigurationError = 0x000000000000012EL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long PredicateInvalid = 0x0000000000000190L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long PolicyViolation = 0x00000000000001F4L;

    @Generated
    private CNErrorCode() {
    }

    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ClientIdentifierInvalid = 0x0000000000000258L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ClientIdentifierDoesNotExist = 0x0000000000000259L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long VCardMalformed = 0x00000000000002BCL;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long NoAccessableWritableContainers = 0x0000000000000065L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long UnauthorizedKeys = 0x0000000000000066L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long FeatureDisabledByUser = 0x0000000000000067L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long RecordIdentifierInvalid = 0x00000000000000CDL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long RecordNotWritable = 0x00000000000000CEL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ParentContainerNotWritable = 0x00000000000000CFL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ClientIdentifierCollision = 0x000000000000025AL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ChangeHistoryExpired = 0x000000000000025BL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ChangeHistoryInvalidAnchor = 0x000000000000025CL;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long VCardSummarizationError = 0x00000000000002BDL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ChangeHistoryInvalidFetchRequest = 0x000000000000025DL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FeatureNotAvailable = 0x0000000000000068L;
}
