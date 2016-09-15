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

package apple.mapkit.struct;

import apple.corelocation.struct.CLLocationCoordinate2D;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MKCoordinateRegion extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MKCoordinateRegion() {
        super(MKCoordinateRegion.class);
    }

    @Generated
    protected MKCoordinateRegion(Pointer peer) {
        super(peer);
    }

    @Generated
    public MKCoordinateRegion(@ByValue CLLocationCoordinate2D center, @ByValue MKCoordinateSpan span) {
        super(MKCoordinateRegion.class);
        setCenter(center);
        setSpan(span);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native CLLocationCoordinate2D center();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCenter(@ByValue CLLocationCoordinate2D value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native MKCoordinateSpan span();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSpan(@ByValue MKCoordinateSpan value);
}
