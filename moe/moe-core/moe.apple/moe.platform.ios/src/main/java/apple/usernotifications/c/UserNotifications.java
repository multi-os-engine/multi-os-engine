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

package apple.usernotifications.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("UserNotifications")
@Runtime(CRuntime.class)
public final class UserNotifications {
    @Generated @NUInt public static final long UNNotificationActionOptionNone = 0x0000000000000000L;
    @Generated @NUInt public static final long UNAuthorizationOptionNone = 0x0000000000000000L;
    @Generated @NUInt public static final long UNNotificationPresentationOptionNone = 0x0000000000000000L;

    static {
        NatJ.register();
    }

    @Generated
    private UserNotifications() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNErrorDomain();

    /**
     * Key to manually provide a type hint for the attachment. If not set the type hint will be guessed from the
     * attachment's file extension. Value must be an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNNotificationAttachmentOptionsTypeHintKey();

    /**
     * Key to specify if the thumbnail for this attachment is hidden. Defaults to NO. Value must be a boolean NSNumber.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNNotificationAttachmentOptionsThumbnailHiddenKey();

    /**
     * Key to specify a normalized clipping rectangle to use for the attachment thumbnail. Value must be a CGRect
     * encoded using CGRectCreateDictionaryRepresentation.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNNotificationAttachmentOptionsThumbnailClippingRectKey();

    /**
     * Key to specify the animated image frame number or the movie time to use as the thumbnail.
     * An animated image frame number must be an NSNumber. A movie time must either be an NSNumber with the time in
     * seconds or a CMTime encoded using CMTimeCopyAsDictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNNotificationAttachmentOptionsThumbnailTimeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNNotificationDefaultActionIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNNotificationDismissActionIdentifier();

    @Generated @NUInt public static final long UNNotificationCategoryOptionNone = 0x0000000000000000L;
}
