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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class CXUnsavedFile extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXUnsavedFile() {
        super(CXUnsavedFile.class);
    }

    @Generated
    protected CXUnsavedFile(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXUnsavedFile(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String Filename,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String Contents,
            long Length) {
        super(CXUnsavedFile.class);
        setFilename(Filename);
        setContents(Contents);
        setLength(Length);
    }

    /**
     * The file whose contents have not yet been saved.
     * <p>
     * This file must already exist in the file system.
     */
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native String Filename();

    /**
     * The file whose contents have not yet been saved.
     * <p>
     * This file must already exist in the file system.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFilename(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    /**
     * A buffer containing the unsaved contents of this file.
     */
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native String Contents();

    /**
     * A buffer containing the unsaved contents of this file.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setContents(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    /**
     * The length of the unsaved contents of this buffer.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long Length();

    /**
     * The length of the unsaved contents of this buffer.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLength(long value);
}
