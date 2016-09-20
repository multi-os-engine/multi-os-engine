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

package apple.glkit.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class GLKVertexAttributeParameters extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public GLKVertexAttributeParameters() {
        super(GLKVertexAttributeParameters.class);
    }

    @Generated
    protected GLKVertexAttributeParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    public GLKVertexAttributeParameters(int type, int size, byte normalized) {
        super(GLKVertexAttributeParameters.class);
        setType(type);
        setSize(size);
        setNormalized(normalized);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int type();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setType(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSize(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte normalized();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setNormalized(byte value);
}
