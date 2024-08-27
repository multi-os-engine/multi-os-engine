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
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class rusage extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public rusage() {
        super(rusage.class);
    }

    @Generated
    protected rusage(Pointer peer) {
        super(peer);
    }

    /**
     * user time used (PL)
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native timeval ru_utime();

    /**
     * user time used (PL)
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRu_utime(@ByValue timeval value);

    /**
     * system time used (PL)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native timeval ru_stime();

    /**
     * system time used (PL)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRu_stime(@ByValue timeval value);

    /**
     * max resident set size (PL)
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NInt
    public native long ru_maxrss();

    /**
     * max resident set size (PL)
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRu_maxrss(@NInt long value);

    /**
     * integral shared memory size (NU)
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @NInt
    public native long ru_ixrss();

    /**
     * integral shared memory size (NU)
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRu_ixrss(@NInt long value);

    /**
     * integral unshared data (NU)
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @NInt
    public native long ru_idrss();

    /**
     * integral unshared data (NU)
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setRu_idrss(@NInt long value);

    /**
     * integral unshared stack (NU)
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    @NInt
    public native long ru_isrss();

    /**
     * integral unshared stack (NU)
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setRu_isrss(@NInt long value);

    /**
     * page reclaims (NU)
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    @NInt
    public native long ru_minflt();

    /**
     * page reclaims (NU)
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setRu_minflt(@NInt long value);

    /**
     * page faults (NU)
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    @NInt
    public native long ru_majflt();

    /**
     * page faults (NU)
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setRu_majflt(@NInt long value);

    /**
     * swaps (NU)
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    @NInt
    public native long ru_nswap();

    /**
     * swaps (NU)
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setRu_nswap(@NInt long value);

    /**
     * block input operations (atomic)
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    @NInt
    public native long ru_inblock();

    /**
     * block input operations (atomic)
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setRu_inblock(@NInt long value);

    /**
     * block output operations (atomic)
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    @NInt
    public native long ru_oublock();

    /**
     * block output operations (atomic)
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setRu_oublock(@NInt long value);

    /**
     * messages sent (atomic)
     */
    @Generated
    @StructureField(order = 11, isGetter = true)
    @NInt
    public native long ru_msgsnd();

    /**
     * messages sent (atomic)
     */
    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setRu_msgsnd(@NInt long value);

    /**
     * messages received (atomic)
     */
    @Generated
    @StructureField(order = 12, isGetter = true)
    @NInt
    public native long ru_msgrcv();

    /**
     * messages received (atomic)
     */
    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setRu_msgrcv(@NInt long value);

    /**
     * signals received (atomic)
     */
    @Generated
    @StructureField(order = 13, isGetter = true)
    @NInt
    public native long ru_nsignals();

    /**
     * signals received (atomic)
     */
    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setRu_nsignals(@NInt long value);

    /**
     * voluntary context switches (atomic)
     */
    @Generated
    @StructureField(order = 14, isGetter = true)
    @NInt
    public native long ru_nvcsw();

    /**
     * voluntary context switches (atomic)
     */
    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setRu_nvcsw(@NInt long value);

    /**
     * involuntary "
     */
    @Generated
    @StructureField(order = 15, isGetter = true)
    @NInt
    public native long ru_nivcsw();

    /**
     * involuntary "
     */
    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setRu_nivcsw(@NInt long value);
}
