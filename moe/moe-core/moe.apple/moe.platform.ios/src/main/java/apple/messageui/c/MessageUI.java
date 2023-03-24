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

package apple.messageui.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("MessageUI")
@Runtime(CRuntime.class)
public final class MessageUI {
    static {
        NatJ.register();
    }

    @Generated
    private MessageUI() {
    }

    /**
     * [@const] MFMailComposeErrorDomain
     * 
     * Error domain for NSError values stemming from the MFMailCompose API.
     * 
     * This error domain is used as the domain for all NSError instances stemmming from the
     * MFMailCompose API. Valid error code values are declared in the <tt>MFMailComposeErrorCode</tt>
     * space.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MFMailComposeErrorDomain();

    /**
     * [@constant] MFMessageComposeViewControllerAttachmentURL The url for the given attachment.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MFMessageComposeViewControllerAttachmentURL();

    /**
     * [@constant] MFMessageComposeViewControllerAttachmentAlternateFilename The alternate filename for the given
     * attachment.
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MFMessageComposeViewControllerAttachmentAlternateFilename();

    /**
     * [@const] MFMessageComposeViewControllerTextMessageAvailabilityDidChangeNotification
     * 
     * Notification posted when the value of <tt>+[MFMessageComposeViewController canSendText]</tt> has changed.
     * 
     * This notification is posted when the value of <tt>+[MFMessageComposeViewController canSendText]</tt>
     * has changed. Clients should invalidate any caches and update UI as appropriate.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MFMessageComposeViewControllerTextMessageAvailabilityDidChangeNotification();

    /**
     * [@const] MFMessageComposeViewControllerTextMessageAvailabilityKey
     * 
     * UserInfo key for MFMessageComposeViewControllerTextMessageAvailabilityDidChangeNotification
     * containing the value of <tt>+[MFMessageComposeViewController canSendText]</tt>
     * 
     * The value of this key is an NSNumber containing a BOOL value. This value matches
     * the result of <tt>+[MFMessageComposeViewController canSendText]</tt>.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MFMessageComposeViewControllerTextMessageAvailabilityKey();
}
