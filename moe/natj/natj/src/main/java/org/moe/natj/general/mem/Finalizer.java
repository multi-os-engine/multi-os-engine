package org.moe.natj.general.mem;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

public final class Finalizer {
    private Finalizer() {
    }

    /**
     * Used by {@link ReleaserMetadata ReleaserMetadata}
     */
    static final ReferenceQueue<Object> QUEUE = new ReferenceQueue<>();
    private static final HashSet<ReleaserMetadata> REGISTERED_METADATA = new HashSet<>();
    private static final Thread FINALIZER_THREAD = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    try {
                        ReleaserMetadata m = (ReleaserMetadata)QUEUE.remove();
                        boolean removed;
                        synchronized (REGISTERED_METADATA) {
                            removed = REGISTERED_METADATA.remove(m);
                        }
                        m.release();
                        if (!removed) {
                            System.err.println("Metadata not registered: " + m.getPeer());
                        }
                    } catch (Throwable e) {
                        System.err.println("Error in finalizer");
                        e.printStackTrace();
                    }
                }
            } finally {
                System.err.println("Fatal: NatJ Finalizer Daemon stopped!");
                System.exit(-1);
            }
        }
    };

    static {
        // Start finalize thread
        FINALIZER_THREAD.setDaemon(true);
        FINALIZER_THREAD.setName("NatJ Finalizer Daemon");
        FINALIZER_THREAD.start();
    }

    public static void registerForFinalize(ReleaserMetadata metadata) {
        if (!FINALIZER_THREAD.isAlive()) {
            System.err.println("Fatal: NatJ Finalizer Daemon stopped!");
            System.exit(-1);
            return;
        }

        synchronized (REGISTERED_METADATA) {
            if (!REGISTERED_METADATA.add(metadata)) {
                System.err.println("Metadata already registered: " + metadata.getPeer());
                new RuntimeException().printStackTrace();
            }
        }
    }
}
