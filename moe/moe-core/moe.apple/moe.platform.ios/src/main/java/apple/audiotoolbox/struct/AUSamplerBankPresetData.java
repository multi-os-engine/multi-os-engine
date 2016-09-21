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

import apple.corefoundation.opaque.CFURLRef;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AUSamplerBankPresetData extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AUSamplerBankPresetData() {
        super(AUSamplerBankPresetData.class);
    }

    @Generated
    protected AUSamplerBankPresetData(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native CFURLRef bankURL();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setBankURL(CFURLRef value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte bankMSB();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBankMSB(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte bankLSB();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBankLSB(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte presetID();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPresetID(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte reserved();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setReserved(byte value);
}
