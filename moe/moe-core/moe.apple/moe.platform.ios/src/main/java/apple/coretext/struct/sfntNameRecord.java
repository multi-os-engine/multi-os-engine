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
@Structure()
public final class sfntNameRecord extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public sfntNameRecord() {
        super(sfntNameRecord.class);
    }

    @Generated
    protected sfntNameRecord(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char platformID();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setPlatformID(char value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char scriptID();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setScriptID(char value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char languageID();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLanguageID(char value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native char nameID();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNameID(char value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native char length();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setLength(char value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native char offset();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setOffset(char value);
}
