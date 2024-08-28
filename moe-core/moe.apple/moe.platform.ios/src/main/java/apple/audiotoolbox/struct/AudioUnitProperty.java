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

import apple.audiotoolbox.opaque.AudioComponentInstance;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.jetbrains.annotations.NotNull;

@Generated
@Structure()
public final class AudioUnitProperty extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioUnitProperty() {
        super(AudioUnitProperty.class);
    }

    @Generated
    protected AudioUnitProperty(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioUnitProperty(@NotNull AudioComponentInstance mAudioUnit, int mPropertyID, int mScope, int mElement) {
        super(AudioUnitProperty.class);
        setMAudioUnit(mAudioUnit);
        setMPropertyID(mPropertyID);
        setMScope(mScope);
        setMElement(mElement);
    }

    @NotNull
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native AudioComponentInstance mAudioUnit();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMAudioUnit(@NotNull AudioComponentInstance value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mPropertyID();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMPropertyID(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mScope();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMScope(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int mElement();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMElement(int value);
}
