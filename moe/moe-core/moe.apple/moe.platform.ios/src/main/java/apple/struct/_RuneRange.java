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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class _RuneRange extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public _RuneRange() {
        super(_RuneRange.class);
    }

    @Generated
    protected _RuneRange(Pointer peer) {
        super(peer);
    }

    @Generated
    public _RuneRange(int __nranges,
            @UncertainArgument("Options: reference, array Fallback: reference") _RuneEntry __ranges) {
        super(_RuneRange.class);
        set__nranges(__nranges);
        set__ranges(__ranges);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int __nranges();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set__nranges(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native _RuneEntry __ranges();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void set__ranges(
            @UncertainArgument("Options: reference, array Fallback: reference") _RuneEntry value);
}
