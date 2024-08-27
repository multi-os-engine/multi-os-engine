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

package org.moe.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Shutdown manager class.
 */
public final class ShutdownManager implements Runnable {
    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ShutdownManager.class);

    static {
        Runtime.getRuntime().addShutdownHook(HOLDER.INSTANCE.thread);
    }

    /**
     * Shutdown thread.
     */
    private final Thread thread = new Thread(this);
    /**
     * Runnables to run.
     */
    private final ConcurrentLinkedQueue<Runnable> runnables = new ConcurrentLinkedQueue<Runnable>();
    /**
     * Runnables to run post.
     */
    private final ConcurrentLinkedQueue<Runnable> postRunnables = new ConcurrentLinkedQueue<Runnable>();

    /**
     * Registers a Runnable to run at shutdown.
     *
     * @param runnable runnable
     */
    public static void register(Runnable runnable) {
        HOLDER.INSTANCE.runnables.add(runnable);
    }

    /**
     * Registers a Runnable to run after running shutdown hooks.
     *
     * @param runnable runnable
     */
    public static void registerPost(Runnable runnable) {
        HOLDER.INSTANCE.postRunnables.add(runnable);
    }

    /**
     * Manual shutdown.
     */
    public static void shutdown() {
        Thread killer = new Thread(HOLDER.INSTANCE);
        killer.start();
        try {
            killer.join(10000);
        } catch (InterruptedException e) {
            LOG.debug("Failed to join shutdown thread");
        }
    }

    @Override
    public void run() {
        LOG.debug("Shutting down");
        Runnable runnable;
        while ((runnable = runnables.poll()) != null) {
            LOG.debug("Shutting down " + runnable);
            runnable.run();
        }
        while ((runnable = postRunnables.poll()) != null) {
            LOG.debug("Shutting down post " + runnable);
            runnable.run();
        }
    }

    /**
     * Thread-safe holder class for shared instance.
     */
    private static class HOLDER {
        /**
         * Shared instance.
         */
        public static final ShutdownManager INSTANCE = new ShutdownManager();
    }
}
