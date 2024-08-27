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

package apple.usernotifications.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class UNErrorCode {
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NotificationsNotAllowed = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long AttachmentInvalidURL = 0x0000000000000064L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long AttachmentUnrecognizedType = 0x0000000000000065L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long AttachmentInvalidFileSize = 0x0000000000000066L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long AttachmentNotInDataStore = 0x0000000000000067L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long AttachmentMoveIntoDataStoreFailed = 0x0000000000000068L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long AttachmentCorrupt = 0x0000000000000069L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NotificationInvalidNoDate = 0x0000000000000578L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NotificationInvalidNoContent = 0x0000000000000579L;

    @Generated
    private UNErrorCode() {
    }

    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ContentProvidingObjectNotAllowed = 0x00000000000005DCL;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ContentProvidingInvalid = 0x00000000000005DDL;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long BadgeInputInvalid = 0x0000000000000640L;
}
