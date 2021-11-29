package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Roles that are attributed to symbol occurrences.
 * <p>
 * Internal: this currently mirrors low 9 bits of clang::index::SymbolRole with
 * higher bits zeroed. These high bits may be exposed in the future.
 */
@Generated
public final class CXSymbolRole {
    @Generated
    private CXSymbolRole() {
    }

    @Generated public static final int CXSymbolRole_None = 0x00000000;
    @Generated public static final int CXSymbolRole_Declaration = 0x00000001;
    @Generated public static final int CXSymbolRole_Definition = 0x00000002;
    @Generated public static final int CXSymbolRole_Reference = 0x00000004;
    @Generated public static final int CXSymbolRole_Read = 0x00000008;
    @Generated public static final int CXSymbolRole_Write = 0x00000010;
    @Generated public static final int CXSymbolRole_Call = 0x00000020;
    @Generated public static final int CXSymbolRole_Dynamic = 0x00000040;
    @Generated public static final int CXSymbolRole_AddressOf = 0x00000080;
    @Generated public static final int CXSymbolRole_Implicit = 0x00000100;
}
