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
 * [@enum]       MFMailComposeResult
 * 
 * Composition result sent to the delegate upon user completion.
 * 
 * This result will inform of the user's choice in regards to email composition.  If the user
 *             cancels the composition, <tt>MFMailComposeResultCancelled</tt> will be sent to the delegate.
 *             Typically <tt>MFMailComposeResultSent</tt> or <tt>MFMailComposeResultSaved</tt> will
 *             be sent, but <tt>MFMailComposeResultFailed</tt> will be sent in the case of failure.
 *             </p>Send may only be interpreted as a successful queueing of the message for later sending.
 *             The actual send will occur when the device is able to send.
 * [@constant]   MFMailComposeResultCancelled   User canceled the composition.
 * [@constant]   MFMailComposeResultSaved       User successfully saved the message.
 * [@constant]   MFMailComposeResultSent        User successfully sent/queued the message.
 * [@constant]   MFMailComposeResultFailed      User's attempt to save or send was unsuccessful.
 */
@Generated
public final class MFMailComposeResult {
    @Generated @NInt public static final long Cancelled = 0x0000000000000000L;
    @Generated @NInt public static final long Saved = 0x0000000000000001L;
    @Generated @NInt public static final long Sent = 0x0000000000000002L;
    @Generated @NInt public static final long Failed = 0x0000000000000003L;

    @Generated
    private MFMailComposeResult() {
    }
}
