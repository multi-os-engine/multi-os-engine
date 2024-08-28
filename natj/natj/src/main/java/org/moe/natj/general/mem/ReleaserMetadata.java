package org.moe.natj.general.mem;

import java.lang.ref.PhantomReference;

public final class ReleaserMetadata extends PhantomReference<Object> {

    /**
     * The releaser responsible to cleanup after the GC trashed the referent.
     */
    private final Releaser releaser;

    /** The native pointer. */
    private long peer;

    public ReleaserMetadata(Object referent, long peer) {
        this(referent, null, peer);
    }

    public ReleaserMetadata(Object referent, Releaser releaser, long peer) {
        super(referent, Finalizer.QUEUE);
        if (peer == -1) {
            throw new IllegalArgumentException();
        }
        this.releaser = releaser;
        this.peer = peer;
    }

    /**
     * Returns the native pointer.
     *
     * @return The native peer pointer.
     */
    public long getPeer() {
        if (this.peer == -1) {
            throw new IllegalStateException();
        }
        return peer;
    }

    /**
     * Sets the native pointer.
     *
     * @param peer The native peer pointer.
     */
    public void setPeer(long peer) {
        if (peer == -1) {
            throw new IllegalArgumentException();
        }
        if (this.peer == -1) {
            throw new IllegalStateException();
        }
        this.peer = peer;
    }

    /**
     * Invokes the {@link #releaser releaser}'s {@link Releaser#release(long)} method.
     */
    public void release() {
        if (releaser != null && peer != 0) {
            if (peer == -1) {
                new RuntimeException("peer already released").printStackTrace();
            } else {
                releaser.release(peer);
                peer = -1;
            }
        }
    }

    /**
     * Return true if the pointer has a releaser.
     *
     * @return true when releaser is set
     */
    public boolean hasReleaser() {
        return releaser != null;
    }

    public boolean isSamePeer(ReleaserMetadata other) {
        return peer == other.peer;
    }

    public boolean ifFinalizedExternally() {
        return releaser != null && releaser.ifFinalizedExternally();
    }
}
