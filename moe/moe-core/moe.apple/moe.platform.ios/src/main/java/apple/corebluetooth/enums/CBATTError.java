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

package apple.corebluetooth.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CBATTError {
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    @Generated @NInt public static final long InvalidHandle = 0x0000000000000001L;
    @Generated @NInt public static final long ReadNotPermitted = 0x0000000000000002L;
    @Generated @NInt public static final long WriteNotPermitted = 0x0000000000000003L;
    @Generated @NInt public static final long InvalidPdu = 0x0000000000000004L;
    @Generated @NInt public static final long InsufficientAuthentication = 0x0000000000000005L;
    @Generated @NInt public static final long RequestNotSupported = 0x0000000000000006L;
    @Generated @NInt public static final long InvalidOffset = 0x0000000000000007L;
    @Generated @NInt public static final long InsufficientAuthorization = 0x0000000000000008L;
    @Generated @NInt public static final long PrepareQueueFull = 0x0000000000000009L;
    @Generated @NInt public static final long AttributeNotFound = 0x000000000000000AL;
    @Generated @NInt public static final long AttributeNotLong = 0x000000000000000BL;
    @Generated @NInt public static final long InsufficientEncryptionKeySize = 0x000000000000000CL;
    @Generated @NInt public static final long InvalidAttributeValueLength = 0x000000000000000DL;
    @Generated @NInt public static final long UnlikelyError = 0x000000000000000EL;
    @Generated @NInt public static final long InsufficientEncryption = 0x000000000000000FL;
    @Generated @NInt public static final long UnsupportedGroupType = 0x0000000000000010L;
    @Generated @NInt public static final long InsufficientResources = 0x0000000000000011L;

    @Generated
    private CBATTError() {
    }
}
