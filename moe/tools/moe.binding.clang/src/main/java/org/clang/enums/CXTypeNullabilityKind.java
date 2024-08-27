package org.clang.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class CXTypeNullabilityKind {
    @Generated
    private CXTypeNullabilityKind() {
    }

    /**
     * Values of this type can never be null.
     */
    @Generated public static final int NonNull = 0x00000000;
    /**
     * Values of this type can be null.
     */
    @Generated public static final int Nullable = 0x00000001;
    /**
     * Whether values of this type can be null is (explicitly)
     * unspecified. This captures a (fairly rare) case where we
     * can't conclude anything about the nullability of the type even
     * though it has been considered.
     */
    @Generated public static final int Unspecified = 0x00000002;
    /**
     * Nullability is not applicable to this type.
     */
    @Generated public static final int Invalid = 0x00000003;
    /**
     * Generally behaves like Nullable, except when used in a block parameter that
     * was imported into a swift async method. There, swift will assume that the
     * parameter can get null even if no error occured. _Nullable parameters are
     * assumed to only get null on error.
     */
    @Generated public static final int NullableResult = 0x00000004;
}
