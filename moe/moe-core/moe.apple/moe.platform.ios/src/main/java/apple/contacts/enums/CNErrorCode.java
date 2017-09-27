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

@Generated
public final class CNErrorCode {
    @Generated @NInt public static final long CommunicationError = 0x0000000000000001L;
    @Generated @NInt public static final long DataAccessError = 0x0000000000000002L;
    @Generated @NInt public static final long AuthorizationDenied = 0x0000000000000064L;
    @Generated @NInt public static final long RecordDoesNotExist = 0x00000000000000C8L;
    @Generated @NInt public static final long InsertedRecordAlreadyExists = 0x00000000000000C9L;
    @Generated @NInt public static final long ContainmentCycle = 0x00000000000000CAL;
    @Generated @NInt public static final long ContainmentScope = 0x00000000000000CBL;
    @Generated @NInt public static final long ParentRecordDoesNotExist = 0x00000000000000CCL;
    @Generated @NInt public static final long ValidationMultipleErrors = 0x000000000000012CL;
    @Generated @NInt public static final long ValidationTypeMismatch = 0x000000000000012DL;
    @Generated @NInt public static final long ValidationConfigurationError = 0x000000000000012EL;
    @Generated @NInt public static final long PredicateInvalid = 0x0000000000000190L;
    @Generated @NInt public static final long PolicyViolation = 0x00000000000001F4L;

    @Generated
    private CNErrorCode() {
    }

    @Generated @NInt public static final long ClientIdentifierInvalid = 0x0000000000000258L;
    @Generated @NInt public static final long ClientIdentifierDoesNotExist = 0x0000000000000259L;
    @Generated @NInt public static final long VCardMalformed = 0x00000000000002BCL;
}
