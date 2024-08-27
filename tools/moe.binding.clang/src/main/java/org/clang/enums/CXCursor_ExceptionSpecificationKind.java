package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Describes the exception specification of a cursor.
 * <p>
 * A negative value indicates that the cursor is not a function declaration.
 */
@Generated
public final class CXCursor_ExceptionSpecificationKind {
    @Generated
    private CXCursor_ExceptionSpecificationKind() {
    }

    /**
     * The cursor has no exception specification.
     */
    @Generated public static final int None = 0x00000000;
    /**
     * The cursor has exception specification throw()
     */
    @Generated public static final int DynamicNone = 0x00000001;
    /**
     * The cursor has exception specification throw(T1, T2)
     */
    @Generated public static final int Dynamic = 0x00000002;
    /**
     * The cursor has exception specification throw(...).
     */
    @Generated public static final int MSAny = 0x00000003;
    /**
     * The cursor has exception specification basic noexcept.
     */
    @Generated public static final int BasicNoexcept = 0x00000004;
    /**
     * The cursor has exception specification computed noexcept.
     */
    @Generated public static final int ComputedNoexcept = 0x00000005;
    /**
     * The exception specification has not yet been evaluated.
     */
    @Generated public static final int Unevaluated = 0x00000006;
    /**
     * The exception specification has not yet been instantiated.
     */
    @Generated public static final int Uninstantiated = 0x00000007;
    /**
     * The exception specification has not been parsed yet.
     */
    @Generated public static final int Unparsed = 0x00000008;
    /**
     * The cursor has a __declspec(nothrow) exception specification.
     */
    @Generated public static final int NoThrow = 0x00000009;
}
