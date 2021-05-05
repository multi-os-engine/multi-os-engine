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

import apple.coreaudiotypes.struct.AudioChannelLayout;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioPanningInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioPanningInfo() {
        super(AudioPanningInfo.class);
    }

    @Generated
    protected AudioPanningInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mPanningMode();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMPanningMode(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mCoordinateFlags();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMCoordinateFlags(int value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 3)
    public native float mCoordinates(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 3)
    public native void setMCoordinates(float value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float mGainScale();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMGainScale(float value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native AudioChannelLayout mOutputChannelMap();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMOutputChannelMap(AudioChannelLayout value);
}
