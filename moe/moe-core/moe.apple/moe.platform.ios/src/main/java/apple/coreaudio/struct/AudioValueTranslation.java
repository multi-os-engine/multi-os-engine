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

package apple.coreaudio.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class AudioValueTranslation extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioValueTranslation() {
        super(AudioValueTranslation.class);
    }

    @Generated
    protected AudioValueTranslation(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioValueTranslation(VoidPtr mInputData, int mInputDataSize, VoidPtr mOutputData, int mOutputDataSize) {
        super(AudioValueTranslation.class);
        setMInputData(mInputData);
        setMInputDataSize(mInputDataSize);
        setMOutputData(mOutputData);
        setMOutputDataSize(mOutputDataSize);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr mInputData();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMInputData(VoidPtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mInputDataSize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMInputDataSize(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr mOutputData();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMOutputData(VoidPtr value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int mOutputDataSize();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMOutputDataSize(int value);
}
