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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class MortChain extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MortChain() {
        super(MortChain.class);
    }

    @Generated
    protected MortChain(Pointer peer) {
        super(peer);
    }

    /**
     * default flags for this chain
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int defaultFlags();

    /**
     * default flags for this chain
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDefaultFlags(int value);

    /**
     * byte length of this chain
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int length();

    /**
     * byte length of this chain
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLength(int value);

    /**
     * number of feature entries
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char nFeatures();

    /**
     * number of feature entries
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setNFeatures(char value);

    /**
     * number of subtables
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native char nSubtables();

    /**
     * number of subtables
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNSubtables(char value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native MortFeatureEntry featureEntries();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setFeatureEntries(@ByValue MortFeatureEntry value);
}
