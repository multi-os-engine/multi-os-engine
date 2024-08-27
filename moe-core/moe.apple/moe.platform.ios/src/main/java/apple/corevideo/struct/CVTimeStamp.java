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

package apple.corevideo.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CVTimeStamp extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CVTimeStamp() {
        super(CVTimeStamp.class);
    }

    @Generated
    protected CVTimeStamp(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int videoTimeScale();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVideoTimeScale(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long videoTime();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setVideoTime(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long hostTime();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setHostTime(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native double rateScalar();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setRateScalar(double value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long videoRefreshPeriod();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setVideoRefreshPeriod(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @ByValue
    public native CVSMPTETime smpteTime();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setSmpteTime(@ByValue CVSMPTETime value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long flags();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setFlags(long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native long reserved();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setReserved(long value);
}
