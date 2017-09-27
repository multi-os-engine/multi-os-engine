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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNNotificationAttachmentOptionsTypeHintKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNNotificationAttachmentOptionsThumbnailHiddenKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UNNotificationAttachmentOptionsThumbnailClippingRectKey();

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
