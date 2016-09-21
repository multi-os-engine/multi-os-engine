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

package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class quadrature_integrate_options extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public quadrature_integrate_options() {
        super(quadrature_integrate_options.class);
    }

    @Generated
    protected quadrature_integrate_options(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int integrator();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIntegrator(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double abs_tolerance();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAbs_tolerance(double value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native double rel_tolerance();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRel_tolerance(double value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long qag_points_per_interval();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setQag_points_per_interval(@NUInt long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long max_intervals();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMax_intervals(@NUInt long value);
}
