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

package org.moe.natj.objc;

import java.util.concurrent.atomic.AtomicLong;

/**
 * A utility class for using NSAutoreleasePools.
 */
public class ObjCAutoreleasePool implements AutoCloseable {
    /**
     * Peer of the autorelease pool.
     */
    private final AtomicLong peer;

    /**
     * Create a new autorelease pool.
     */
    public ObjCAutoreleasePool() {
        peer = new AtomicLong(ObjCRuntime.createAutoreleasePool());
    }

    /**
     * Releases all objects int this pool.
     */
    public void release() {
        final long peer = this.peer.getAndSet(0);
        if (peer == 0L) {
            throw new RuntimeException("pool was already released");
        }
        ObjCRuntime.releaseAutoreleasePool(peer);
    }

    /**
     * Releases all objects int this pool.
     */
    public void drain() {
        release();
    }

    @Override
    public void close() throws Exception {
        release();
    }
}
