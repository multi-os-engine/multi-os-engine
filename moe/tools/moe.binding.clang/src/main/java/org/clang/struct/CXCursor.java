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

import org.clang.c.clang;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;

@Generated
@Structure()
public final class CXCursor extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXCursor() {
        super(CXCursor.class);
    }

    @Generated
    protected CXCursor(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int kind();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setKind(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int xdata();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setXdata(int value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 3)
    public native ConstVoidPtr data(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 3)
    public native void setData(ConstVoidPtr value, int field_idx);

    /* General java methods */
    @Override
    public String toString() {
        CXString tmp = clang.clang_getCursorSpelling(this);
        if (tmp == null) {
            throw new IllegalStateException("CXCursors are extected to have spelling");
        }
        String result = clang.clang_getCString(tmp);
        if (result == null) {
            throw new IllegalStateException("Failed to retrieve string from CXString");
        }
        clang.clang_disposeString(tmp);
        return result;
    }

    /* Comfort java methods */
    public CXSourceLocation getCursorLocation() {
        return clang.clang_getCursorLocation(this);
    }

    public CXPlatformAvailability[] getCursorPlatformAvailabilities() {
        // Identify the number of platforms
        int size = clang.clang_getCursorPlatformAvailability(this, null, null, null, null, null, 0);

        Ptr<CXPlatformAvailability> availabilityPtr = PtrFactory.newStructArray(CXPlatformAvailability.class, size);
        clang.clang_getCursorPlatformAvailability(this, null, null, null, null, availabilityPtr, size);
        CXPlatformAvailability[] availabilities = new CXPlatformAvailability[size];
        availabilityPtr.copyTo(availabilities, size);
        return availabilities;
    }

    public int getCursorAvailability() {
        return clang.clang_getCursorAvailability(this);
    }

    public CXType getTypedefDeclUnderlyingType() {
        return clang.clang_getTypedefDeclUnderlyingType(this);
    }

    public CXType getCursorType() {
        return clang.clang_getCursorType(this);
    }

    public CXCursor getCursorDefinition() {
        return clang.clang_getCursorDefinition(this);
    }

    public CXString getCursorUSR() {
        return clang.clang_getCursorUSR(this);
    }

    public boolean isVariadic() {
        return clang.clang_Cursor_isVariadic(this) != 0;
    }

    public boolean isBitField() {
        return clang.clang_Cursor_isBitField(this) != 0;
    }

    public int getNumArguments() {
        return clang.clang_Cursor_getNumArguments(this);
    }

    public CXCursor getArgument(int i) {
        return clang.clang_Cursor_getArgument(this, i);
    }

    public CXType getCursorResultType() {
        return clang.clang_getCursorResultType(this);
    }

    public boolean isObjCOptional() {
        return clang.clang_Cursor_isObjCOptional(this) != 0;
    }

    public long getEnumConstantDeclValue() {
        return clang.clang_getEnumConstantDeclValue(this);
    }

    public CXType getEnumDeclIntegerType() {
        return clang.clang_getEnumDeclIntegerType(this);
    }

    public boolean isInlined() {
        return clang.clang_Cursor_isInlined(this) != 0;
    }
}
