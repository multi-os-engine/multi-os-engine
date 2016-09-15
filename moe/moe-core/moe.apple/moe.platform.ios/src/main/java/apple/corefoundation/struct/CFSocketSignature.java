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

package apple.corefoundation.struct;

import apple.corefoundation.opaque.CFDataRef;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CFSocketSignature extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CFSocketSignature() {
        super(CFSocketSignature.class);
    }

    @Generated
    protected CFSocketSignature(Pointer peer) {
        super(peer);
    }

    @Generated
    public CFSocketSignature(int protocolFamily, int socketType, int protocol, CFDataRef address) {
        super(CFSocketSignature.class);
        setProtocolFamily(protocolFamily);
        setSocketType(socketType);
        setProtocol(protocol);
        setAddress(address);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int protocolFamily();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setProtocolFamily(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int socketType();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSocketType(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int protocol();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setProtocol(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native CFDataRef address();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAddress(CFDataRef value);
}
