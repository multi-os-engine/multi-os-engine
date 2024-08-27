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

package org.clang.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CXPlatformAvailability extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXPlatformAvailability() {
        super(CXPlatformAvailability.class);
    }

    @Generated
    protected CXPlatformAvailability(Pointer peer) {
        super(peer);
    }

    /**
     * A string that describes the platform for which this structure
     * provides availability information.
     * <p>
     * Possible values are "ios" or "macos".
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native CXString Platform();

    /**
     * A string that describes the platform for which this structure
     * provides availability information.
     * <p>
     * Possible values are "ios" or "macos".
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setPlatform(@ByValue CXString value);

    /**
     * The version number in which this entity was introduced.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native CXVersion Introduced();

    /**
     * The version number in which this entity was introduced.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIntroduced(@ByValue CXVersion value);

    /**
     * The version number in which this entity was deprecated (but is
     * still available).
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native CXVersion Deprecated();

    /**
     * The version number in which this entity was deprecated (but is
     * still available).
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDeprecated(@ByValue CXVersion value);

    /**
     * The version number in which this entity was obsoleted, and therefore
     * is no longer available.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native CXVersion Obsoleted();

    /**
     * The version number in which this entity was obsoleted, and therefore
     * is no longer available.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setObsoleted(@ByValue CXVersion value);

    /**
     * Whether the entity is unconditionally unavailable on this platform.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int Unavailable();

    /**
     * Whether the entity is unconditionally unavailable on this platform.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setUnavailable(int value);

    /**
     * An optional message to provide to a user of this API, e.g., to
     * suggest replacement APIs.
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native CXString Message();

    /**
     * An optional message to provide to a user of this API, e.g., to
     * suggest replacement APIs.
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMessage(@ByValue CXString value);
}
