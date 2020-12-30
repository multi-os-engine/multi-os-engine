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
import org.moe.natj.general.ann.NUInt;

/**
 *  @enum CBAttributePermissions
 * 
 * @discussion Read, write, and encryption permissions for an ATT attribute. Can be combined.
 * 
 * @constant CBAttributePermissionsReadable					Read-only.
 * @constant CBAttributePermissionsWriteable					Write-only.
 * @constant CBAttributePermissionsReadEncryptionRequired		Readable by trusted devices.
 * @constant CBAttributePermissionsWriteEncryptionRequired		Writeable by trusted devices.
 */
@Generated
public final class CBAttributePermissions {
    @Generated @NUInt public static final long Readable = 0x0000000000000001L;
    @Generated @NUInt public static final long Writeable = 0x0000000000000002L;
    @Generated @NUInt public static final long ReadEncryptionRequired = 0x0000000000000004L;
    @Generated @NUInt public static final long WriteEncryptionRequired = 0x0000000000000008L;

    @Generated
    private CBAttributePermissions() {
    }
}
