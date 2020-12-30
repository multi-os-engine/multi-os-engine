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

package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum
 * @abstract   Font registration errors
 * @discussion Errors that would prevent registration of fonts for a specified font file URL.
 * @constant   kCTFontManagerErrorFileNotFound
 *             The file does not exist at the specified URL.
 * @constant   kCTFontManagerErrorInsufficientPermissions
 *             Cannot access the file due to insufficient permissions.
 * @constant   kCTFontManagerErrorUnrecognizedFormat
 *             The file is not a recognized or supported font file format.
 * @constant   kCTFontManagerErrorInvalidFontData
 *             The file contains invalid font data that could cause system problems.
 * @constant   kCTFontManagerErrorAlreadyRegistered
 *             The file has already been registered in the specified scope.
 * @discussion Errors that would prevent un-registration of fonts for a specified font file URL.
 * @constant   kCTFontManagerErrorNotRegistered
 *             The file is not registered in the specified scope.
 * @constant   kCTFontManagerErrorInUse
 *             The font file is actively in use and cannot be unregistered.
 * @constant   kCTFontManagerErrorSystemRequired
 *             The file is required by the system and cannot be unregistered.
 * @constant   kCTFontManagerErrorRegistrationFailed
 *             The file could not be processed due to an unexpected FontProvider error.
 * @constant   kCTFontManagerErrorMissingEntitlement
 *             The file could not be processed because the provider does not have a necessary entitlement.
 * @constant   kCTFontManagerErrorInsufficientInfo
 *             The font descriptor does not have information to specify a font file.
 * @constant   kCTFontManagerErrorCancelledByUser
 *             The operation was cancelled by the user.
 * @constant   kCTFontManagerErrorDuplicatedName
 *             The file could not be registered because of a duplicated font name.
 * @constant   kCTFontManagerErrorInvalidFilePath
 *             The file is not in an allowed location. It must be either in the application's bundle or an on-demand resource.
 * @constant   kCTFontManagerErrorExceededResourceLimit
 *             The operation failed due to a system limitation.
 * @constant   kCTFontManagerErrorUnsupportedScope
 *             The specified scope is not supported.
 */
@Generated
public final class CTFontManagerError {
    @Generated @NInt public static final long FileNotFound = 0x0000000000000065L;
    @Generated @NInt public static final long InsufficientPermissions = 0x0000000000000066L;
    @Generated @NInt public static final long UnrecognizedFormat = 0x0000000000000067L;
    @Generated @NInt public static final long InvalidFontData = 0x0000000000000068L;
    @Generated @NInt public static final long AlreadyRegistered = 0x0000000000000069L;
    @Generated @NInt public static final long NotRegistered = 0x00000000000000C9L;
    @Generated @NInt public static final long InUse = 0x00000000000000CAL;
    @Generated @NInt public static final long SystemRequired = 0x00000000000000CBL;

    @Generated
    private CTFontManagerError() {
    }

    @Generated @NInt public static final long ExceededResourceLimit = 0x000000000000006AL;
    @Generated @NInt public static final long RegistrationFailed = 0x000000000000012DL;
    @Generated @NInt public static final long MissingEntitlement = 0x000000000000012EL;
    @Generated @NInt public static final long InsufficientInfo = 0x000000000000012FL;
    @Generated @NInt public static final long CancelledByUser = 0x0000000000000130L;
    @Generated @NInt public static final long DuplicatedName = 0x0000000000000131L;
    @Generated @NInt public static final long InvalidFilePath = 0x0000000000000132L;
    @Generated @NInt public static final long AssetNotFound = 0x000000000000006BL;
    @Generated @NInt public static final long UnsupportedScope = 0x0000000000000133L;
}
