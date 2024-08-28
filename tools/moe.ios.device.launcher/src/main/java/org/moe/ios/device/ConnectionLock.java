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

package org.moe.ios.device;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ConnectionLock, lock class with additional state handling.
 */
public class ConnectionLock {

    /**
     * Lock.
     */
    private final Lock internalLock = new ReentrantLock();

    /**
     * State.
     */
    private boolean isClosed = false;

    /**
     * Locks and returns the current state.
     *
     * @return current state
     */
    public boolean lockGetClosed() {
        internalLock.lock();
        return isClosed;
    }

    /**
     * Locks and sets closed.
     */
    public void lockAndClose() {
        internalLock.lock();
        isClosed = true;
    }

    /**
     * Unlocks the lock.
     */
    public void unlock() {
        internalLock.unlock();
    }

}
