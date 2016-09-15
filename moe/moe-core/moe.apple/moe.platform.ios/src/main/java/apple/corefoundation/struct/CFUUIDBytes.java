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

package apple.corefoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CFUUIDBytes extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CFUUIDBytes() {
        super(CFUUIDBytes.class);
    }

    @Generated
    protected CFUUIDBytes(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte byte0();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setByte0(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte byte1();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setByte1(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte byte2();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setByte2(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte byte3();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setByte3(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte byte4();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setByte4(byte value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native byte byte5();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setByte5(byte value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native byte byte6();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setByte6(byte value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native byte byte7();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setByte7(byte value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native byte byte8();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setByte8(byte value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native byte byte9();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setByte9(byte value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native byte byte10();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setByte10(byte value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native byte byte11();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setByte11(byte value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native byte byte12();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setByte12(byte value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native byte byte13();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setByte13(byte value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    public native byte byte14();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setByte14(byte value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native byte byte15();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setByte15(byte value);
}
