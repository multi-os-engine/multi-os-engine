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

package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.IntPtr;

@Generated
@Structure()
public final class _RuneEntry extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public _RuneEntry() {
        super(_RuneEntry.class);
    }

    @Generated
    protected _RuneEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    public _RuneEntry(int __min, int __max, int __map, IntPtr __types) {
        super(_RuneEntry.class);
        set__min(__min);
        set__max(__max);
        set__map(__map);
        set__types(__types);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int __min();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set__min(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int __max();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void set__max(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int __map();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void set__map(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native IntPtr __types();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void set__types(IntPtr value);
}
