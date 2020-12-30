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

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 1)
public final class CAFOverviewChunk extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CAFOverviewChunk() {
        super(CAFOverviewChunk.class);
    }

    @Generated
    protected CAFOverviewChunk(Pointer peer) {
        super(peer);
    }

    @Generated
    public CAFOverviewChunk(int mEditCount, int mNumFramesPerOVWSample, @ByValue CAFOverviewSample mData) {
        super(CAFOverviewChunk.class);
        setMEditCount(mEditCount);
        setMNumFramesPerOVWSample(mNumFramesPerOVWSample);
        setMData(mData);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mEditCount();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMEditCount(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mNumFramesPerOVWSample();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMNumFramesPerOVWSample(int value);

    /**
     * data is of variable size, calculated from the sizeo of the chunk.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native CAFOverviewSample mData();

    /**
     * data is of variable size, calculated from the sizeo of the chunk.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMData(@ByValue CAFOverviewSample value);
}
