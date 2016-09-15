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
public final class kauth_filesec extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public kauth_filesec() {
        super(kauth_filesec.class);
    }

    @Generated
    protected kauth_filesec(Pointer peer) {
        super(peer);
    }

    @Generated
    public kauth_filesec(int fsec_magic, @ByValue guid_t fsec_owner, @ByValue guid_t fsec_group,
            @ByValue kauth_acl fsec_acl) {
        super(kauth_filesec.class);
        setFsec_magic(fsec_magic);
        setFsec_owner(fsec_owner);
        setFsec_group(fsec_group);
        setFsec_acl(fsec_acl);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int fsec_magic();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFsec_magic(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native guid_t fsec_owner();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFsec_owner(@ByValue guid_t value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native guid_t fsec_group();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFsec_group(@ByValue guid_t value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native kauth_acl fsec_acl();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFsec_acl(@ByValue kauth_acl value);
}
