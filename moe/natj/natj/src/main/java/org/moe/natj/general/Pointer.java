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

package org.moe.natj.general;

/**
 * Pointer class to handle pointers.
 *
 * <p>
 * Have automatic cleanup with using {@link Releaser releasers}.
 */
public class Pointer {

    /**
     * Interface for releasers.
     * {@code #release(long)} will be called for doing cleanup.
     */
    public interface Releaser {
        void release(long peer);
        boolean ifFinalizedExternally();
    }

    /** The native pointer. */
    private long peer;

    /**
     * The releaser responsible to cleanup after the GC trashed the {@link Pointer} object.
     */
    private Releaser releaser;

    /**
     * Constructs a {@link Pointer} object for a native pointer with a given releaser.
     *
     * @param peer The native peer pointer.
     * @param releaser The releaser instance responsible for cleanup after this object
     *      has been collected by the GC.
     */
    public Pointer(long peer, Releaser releaser) {
        this.peer = peer;
        this.releaser = releaser;
    }

    /**
     * Constructs a {@link Pointer} object for a native pointer without releaser.
     *
     * @param peer The native peer pointer.
     */
    public Pointer(long peer) {
        this.peer = peer;
        this.releaser = null;
    }

    /**
     * Invokes the {@link #releaser releaser}'s {@link Releaser#release(long)} method.
     */
    protected void finalize() {
        if (releaser != null && peer != 0 && !releaser.ifFinalizedExternally()) {
            releaser.release(peer);
        }
    }

    /**
     * Invokes the {@link #releaser releaser}'s {@link Releaser#release(long)} method.
     *
     * This method should only be accessed from {@link NativeObject}.
     */
    void release() {
        if (releaser != null && peer != 0 && releaser.ifFinalizedExternally()) {
            releaser.release(peer);
        }
    }

    /**
     * Returns true if the peers are pointing to the same memory space.
     */
    @Override
    public boolean equals(Object object) {
        if (object instanceof Pointer) {
            return peer == ((Pointer) object).peer;
        }
        return false;
    }

    /**
     * Returns the native pointer.
     *
     * @return The native peer pointer.
     */
    public long getPeer() {
        return peer;
    }

    /**
     * Sets the native pointer.
     *
     * @param peer The native peer pointer.
     */
    public void setPeer(long peer) {
        this.peer = peer;
    }

    /**
     * Return true if the pointer has a releaser.
     *
     * @return true when releaser is set
     */
    public boolean hasReleaser() {
        return releaser != null;
    }
}
