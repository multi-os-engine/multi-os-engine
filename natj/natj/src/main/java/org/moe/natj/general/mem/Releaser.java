package org.moe.natj.general.mem;

/**
 * Interface for releasers.
 * {@code #release(long)} will be called for doing cleanup.
 */
public interface Releaser {
    void release(long peer);

    boolean ifFinalizedExternally();
}
