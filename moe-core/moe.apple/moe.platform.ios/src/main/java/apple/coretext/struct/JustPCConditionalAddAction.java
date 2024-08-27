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

package apple.coretext.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class JustPCConditionalAddAction extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public JustPCConditionalAddAction() {
        super(JustPCConditionalAddAction.class);
    }

    @Generated
    protected JustPCConditionalAddAction(Pointer peer) {
        super(peer);
    }

    @Generated
    public JustPCConditionalAddAction(int substThreshold, char addGlyph, char substGlyph) {
        super(JustPCConditionalAddAction.class);
        setSubstThreshold(substThreshold);
        setAddGlyph(addGlyph);
        setSubstGlyph(substGlyph);
    }

    /**
     * threshold of growth factor at which subst occurs
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int substThreshold();

    /**
     * threshold of growth factor at which subst occurs
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSubstThreshold(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char addGlyph();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAddGlyph(char value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char substGlyph();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSubstGlyph(char value);
}
