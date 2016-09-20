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

package apple.avfoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVAudio3DVectorOrientation extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AVAudio3DVectorOrientation() {
        super(AVAudio3DVectorOrientation.class);
    }

    @Generated
    protected AVAudio3DVectorOrientation(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVAudio3DVectorOrientation(@ByValue AVAudio3DPoint forward, @ByValue AVAudio3DPoint up) {
        super(AVAudio3DVectorOrientation.class);
        setForward(forward);
        setUp(up);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native AVAudio3DPoint forward();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setForward(@ByValue AVAudio3DPoint value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native AVAudio3DPoint up();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setUp(@ByValue AVAudio3DPoint value);
}
