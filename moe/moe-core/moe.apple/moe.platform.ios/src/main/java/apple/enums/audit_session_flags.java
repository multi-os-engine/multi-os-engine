package apple.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Audit session flags for the ai_flags member of auditinfo_addr.
 */
@Generated
public final class audit_session_flags {
    @Generated
    private audit_session_flags() {
    }

    /**
     * The initial session created by PID 1.
     */
    @Generated public static final int IS_INITIAL = 0x00000001;
    /**
     * The graphics subsystem (CoreGraphics, etc.) is available.
     */
    @Generated public static final int HAS_GRAPHIC_ACCESS = 0x00000010;
    /**
     * /dev/tty is available.
     */
    @Generated public static final int HAS_TTY = 0x00000020;
    /**
     * The session was created for a remote connection.
     */
    @Generated public static final int IS_REMOTE = 0x00001000;
    /**
     * The console and associated devices are available.
     */
    @Generated public static final int HAS_CONSOLE_ACCESS = 0x00002000;
    /**
     * An active, authenticated user is associated with the session.
     */
    @Generated public static final int HAS_AUTHENTICATED = 0x00004000;
}