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

package apple.foundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class NSOperatingSystemVersion extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public NSOperatingSystemVersion() {
        super(NSOperatingSystemVersion.class);
    }

    @Generated
    protected NSOperatingSystemVersion(Pointer peer) {
        super(peer);
    }

    @Generated
    public NSOperatingSystemVersion(@NInt long majorVersion, @NInt long minorVersion, @NInt long patchVersion) {
        super(NSOperatingSystemVersion.class);
        setMajorVersion(majorVersion);
        setMinorVersion(minorVersion);
        setPatchVersion(patchVersion);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NInt
    public native long majorVersion();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMajorVersion(@NInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NInt
    public native long minorVersion();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMinorVersion(@NInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NInt
    public native long patchVersion();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPatchVersion(@NInt long value);
}
