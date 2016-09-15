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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class sa_endpoints extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public sa_endpoints() {
        super(sa_endpoints.class);
    }

    @Generated
    protected sa_endpoints(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int sae_srcif();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSae_srcif(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native sockaddr sae_srcaddr();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSae_srcaddr(
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int sae_srcaddrlen();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSae_srcaddrlen(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native sockaddr sae_dstaddr();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSae_dstaddr(
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int sae_dstaddrlen();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setSae_dstaddrlen(int value);
}
