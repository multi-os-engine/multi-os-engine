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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ip_mreq_source extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public ip_mreq_source() {
        super(ip_mreq_source.class);
    }

    @Generated
    protected ip_mreq_source(Pointer peer) {
        super(peer);
    }

    @Generated
    public ip_mreq_source(@ByValue in_addr imr_multiaddr, @ByValue in_addr imr_sourceaddr,
            @ByValue in_addr imr_interface) {
        super(ip_mreq_source.class);
        setImr_multiaddr(imr_multiaddr);
        setImr_sourceaddr(imr_sourceaddr);
        setImr_interface(imr_interface);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native in_addr imr_multiaddr();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setImr_multiaddr(@ByValue in_addr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native in_addr imr_sourceaddr();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setImr_sourceaddr(@ByValue in_addr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native in_addr imr_interface();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setImr_interface(@ByValue in_addr value);
}
