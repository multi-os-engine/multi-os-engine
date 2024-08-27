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
public final class flock extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public flock() {
        super(flock.class);
    }

    @Generated
    protected flock(Pointer peer) {
        super(peer);
    }

    /**
     * starting offset
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long l_start();

    /**
     * starting offset
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setL_start(long value);

    /**
     * len = 0 means until end of file
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long l_len();

    /**
     * len = 0 means until end of file
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setL_len(long value);

    /**
     * lock owner
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int l_pid();

    /**
     * lock owner
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setL_pid(int value);

    /**
     * lock type: read/write, etc.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native short l_type();

    /**
     * lock type: read/write, etc.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setL_type(short value);

    /**
     * type of l_start
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native short l_whence();

    /**
     * type of l_start
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setL_whence(short value);
}
