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

@Generated
@Structure()
public final class NumVersion extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public NumVersion() {
        super(NumVersion.class);
    }

    @Generated
    protected NumVersion(Pointer peer) {
        super(peer);
    }

    @Generated
    public NumVersion(byte nonRelRev, byte stage, byte minorAndBugRev, byte majorRev) {
        super(NumVersion.class);
        setNonRelRev(nonRelRev);
        setStage(stage);
        setMinorAndBugRev(minorAndBugRev);
        setMajorRev(majorRev);
    }

    /**
     * revision level of non-released version
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte nonRelRev();

    /**
     * revision level of non-released version
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNonRelRev(byte value);

    /**
     * stage code: dev, alpha, beta, final
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte stage();

    /**
     * stage code: dev, alpha, beta, final
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setStage(byte value);

    /**
     * 2nd & 3rd part of version number share a byte
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte minorAndBugRev();

    /**
     * 2nd & 3rd part of version number share a byte
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMinorAndBugRev(byte value);

    /**
     * 1st part of version number in BCD
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte majorRev();

    /**
     * 1st part of version number in BCD
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMajorRev(byte value);
}
