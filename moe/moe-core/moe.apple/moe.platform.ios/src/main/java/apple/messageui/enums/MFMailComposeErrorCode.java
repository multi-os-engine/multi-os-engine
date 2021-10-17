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

package apple.messageui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]       MFMailComposeErrorCode
 * <p>
 * Error codes for NSError values stemming from the MFMailCompose API.
 * <p>
 * These error codes are used as the codes for all NSError instances stemmming from the
 * MFMailCompose API.  These are the only valid values for NSError instances with the
 * <tt>MFMailComposeErrorDomain</tt> domain.
 * [@constant]   MFMailComposeErrorCodeSaveFailed    Generic error indicating a save failed.
 * [@constant]   MFMailComposeErrorCodeSendFailed    Generic error indicating a send failed.
 */
@Generated
public final class MFMailComposeErrorCode {
    @Generated @NInt public static final long SaveFailed = 0x0000000000000000L;
    @Generated @NInt public static final long SendFailed = 0x0000000000000001L;

    @Generated
    private MFMailComposeErrorCode() {
    }
}
