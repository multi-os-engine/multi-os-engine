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

package apple.coregraphics.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.Ptr;
import apple.corefoundation.struct.CGPoint;

@Generated
@Structure()
public final class CGPathElement extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CGPathElement() {
        super(CGPathElement.class);
    }

    @Generated
    protected CGPathElement(Pointer peer) {
        super(peer);
    }

    @Generated
    public CGPathElement(int type, Ptr<CGPoint> points) {
        super(CGPathElement.class);
        setType(type);
        setPoints(points);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int type();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setType(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ReferenceInfo(type = CGPoint.class)
    public native Ptr<CGPoint> points();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setPoints(Ptr<CGPoint> value);
}
