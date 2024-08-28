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

package apple.audiotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDIChannelMessage extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MIDIChannelMessage() {
        super(MIDIChannelMessage.class);
    }

    @Generated
    protected MIDIChannelMessage(Pointer peer) {
        super(peer);
    }

    @Generated
    public MIDIChannelMessage(byte status, byte data1, byte data2, byte reserved) {
        super(MIDIChannelMessage.class);
        setStatus(status);
        setData1(data1);
        setData2(data2);
        setReserved(reserved);
    }

    /**
     * contains message and channel
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte status();

    /**
     * contains message and channel
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setStatus(byte value);

    /**
     * message specific data
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte data1();

    /**
     * message specific data
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setData1(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte data2();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setData2(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte reserved();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setReserved(byte value);
}
