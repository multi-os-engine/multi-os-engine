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

package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MIDINotificationMessageID
 * <p>
 * Signifies the type of a MIDINotification.
 * <p>
 * [@constant] kMIDIMsgSetupChanged
 * Some aspect of the current MIDISetup has changed. No data. Should ignore this message if
 * messages 2-6 are handled.
 * [@constant] kMIDIMsgObjectAdded
 * A device, entity or endpoint was added. Structure is MIDIObjectAddRemoveNotification. New in
 * Mac OS X 10.2.
 * [@constant] kMIDIMsgObjectRemoved
 * A device, entity or endpoint was removed. Structure is MIDIObjectAddRemoveNotification. New
 * in Mac OS X 10.2.
 * [@constant] kMIDIMsgPropertyChanged
 * An object's property was changed. Structure is MIDIObjectPropertyChangeNotification. New in
 * Mac OS X 10.2.
 * [@constant] kMIDIMsgThruConnectionsChanged
 * A persistent MIDI Thru connection was created or destroyed. No data. New in Mac OS X 10.2.
 * [@constant] kMIDIMsgSerialPortOwnerChanged
 * No data. New in Mac OS X 10.2.
 * [@constant] kMIDIMsgIOError
 * A driver I/O error occurred.
 */
@Generated
public final class MIDINotificationMessageID {
    @Generated public static final int SetupChanged = 0x00000001;
    @Generated public static final int ObjectAdded = 0x00000002;
    @Generated public static final int ObjectRemoved = 0x00000003;
    @Generated public static final int PropertyChanged = 0x00000004;
    @Generated public static final int ThruConnectionsChanged = 0x00000005;
    @Generated public static final int SerialPortOwnerChanged = 0x00000006;
    @Generated public static final int IOError = 0x00000007;

    @Generated
    private MIDINotificationMessageID() {
    }
}
