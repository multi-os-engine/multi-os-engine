package org.clang.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class CXVisibilityKind {
    /**
     * This value indicates that no visibility information is available
     * for a provided CXCursor.
     */
    @Generated public static final int Invalid = 0x00000000;
    /**
     * Symbol not seen by the linker.
     */
    @Generated public static final int Hidden = 0x00000001;
    /**
     * Symbol seen by the linker but resolves to a symbol inside this object.
     */
    @Generated public static final int Protected = 0x00000002;
    /**
     * Symbol seen by the linker and acts like a normal symbol.
     */
    @Generated public static final int Default = 0x00000003;

    @Generated
    private CXVisibilityKind() {
    }
}