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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class kauth_ace extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public kauth_ace() {
        super(kauth_ace.class);
    }

    @Generated
    protected kauth_ace(Pointer peer) {
        super(peer);
    }

    @Generated
    public kauth_ace(@ByValue guid_t ace_applicable, int ace_flags, int ace_rights) {
        super(kauth_ace.class);
        setAce_applicable(ace_applicable);
        setAce_flags(ace_flags);
        setAce_rights(ace_rights);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native guid_t ace_applicable();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAce_applicable(@ByValue guid_t value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int ace_flags();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAce_flags(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int ace_rights();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAce_rights(int value);
}
