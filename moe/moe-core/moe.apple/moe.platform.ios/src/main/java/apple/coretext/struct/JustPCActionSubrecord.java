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

package apple.coretext.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class JustPCActionSubrecord extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public JustPCActionSubrecord() {
        super(JustPCActionSubrecord.class);
    }

    @Generated
    protected JustPCActionSubrecord(Pointer peer) {
        super(peer);
    }

    @Generated
    public JustPCActionSubrecord(char theClass, char theType, int length, int data) {
        super(JustPCActionSubrecord.class);
        setTheClass(theClass);
        setTheType(theType);
        setLength(length);
        setData(data);
    }

    /**
     * justification class value associated with this rec
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char theClass();

    /**
     * justification class value associated with this rec
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTheClass(char value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char theType();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTheType(char value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int length();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLength(int value);

    /**
     * not really a UInt32; cast as ptr to appropriate action
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int data();

    /**
     * not really a UInt32; cast as ptr to appropriate action
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setData(int value);
}
