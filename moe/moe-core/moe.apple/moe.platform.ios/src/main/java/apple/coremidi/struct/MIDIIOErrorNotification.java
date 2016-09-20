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

package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDIIOErrorNotification extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MIDIIOErrorNotification() {
        super(MIDIIOErrorNotification.class);
    }

    @Generated
    protected MIDIIOErrorNotification(Pointer peer) {
        super(peer);
    }

    @Generated
    public MIDIIOErrorNotification(int messageID, int messageSize, int driverDevice, int errorCode) {
        super(MIDIIOErrorNotification.class);
        setMessageID(messageID);
        setMessageSize(messageSize);
        setDriverDevice(driverDevice);
        setErrorCode(errorCode);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int messageID();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMessageID(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int messageSize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMessageSize(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int driverDevice();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDriverDevice(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int errorCode();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setErrorCode(int value);
}
