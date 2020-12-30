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

package apple.eventkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("EventKit")
@Runtime(CRuntime.class)
public final class EventKit {
    static {
        NatJ.register();
    }

    @Generated
    private EventKit() {
    }

    /**
     * [@constant]   EKEventStoreChangedNotification
     * 
     * Notification name sent out when the database is changed by either an external process,
     *             another event store in the same process, or by calling saveEvent: or removeEvent: on a
     *             store you are managing. When you receive this notification, you should consider all EKEvent
     *             instances you have to be invalid. If you had selected events for a date range using
     *             eventsMatchingPredicate, etc. for display, you should release them and re-fetch the events
     *             again. If you have an event you are actively using (e.g. you are currently viewing details
     *             for it or editing it), you can call [EKEvent refresh] to try to revalidate it against the
     *             latest state of the database. If that method returns YES, you can continue to use the event,
     *             otherwise, you should release it and abandon what you were doing with it. The view
     *             controllers provided by EventKitUI automatically deal with this for you.
     *             This notification will also be posted if access to events or reminders is changed by the user.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String EKEventStoreChangedNotification();

    /**
     * [@const]      EKErrorDomain 
     * 
     * Error domain for NSError values stemming from the EventKit Framework API.
     * 
     * This error domain is used as the domain for all NSError instances stemming from the
     *             EventKit Framework.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String EKErrorDomain();
}
