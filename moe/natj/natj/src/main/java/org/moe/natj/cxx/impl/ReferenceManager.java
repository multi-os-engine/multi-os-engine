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

package org.moe.natj.cxx.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class ReferenceManager {
    private final AtomicBoolean mapLock = new AtomicBoolean(false);
    private final ReferenceQueue<Object> queue = new ReferenceQueue<Object>();
    private final HashMap<WeakReference<Object>, Integer> javaToIdentityMap = new HashMap<WeakReference<Object>, Integer>();
    private final HashMap<Integer, Long> identityToNativeMap = new HashMap<Integer, Long>();
    private final HashMap<Long, WeakReference<Object>> nativeToJavaMap = new HashMap<Long, WeakReference<Object>>();
    private final UniqueIndexProvider indexProvider = new UniqueIndexProvider();

    public ReferenceManager() {
        final Thread cleaner = new Thread(new Runnable() {
            @Override
            @SuppressWarnings("unchecked")
            public void run() {
                while (true) {
                    WeakReference<Object> ref;
                    try {
                        ref = (WeakReference<Object>) queue.remove();
                    } catch (InterruptedException e) {
                        System.out.println("Stopping NatJ Reference Manager Clean Daemon");
                        break;
                    }
                    aquireLock();
                    try {
                        final Integer ihc = javaToIdentityMap.get(ref);
                        final Long id = identityToNativeMap.get(ihc);
                        nativeToJavaMap.remove(id);
                        identityToNativeMap.remove(ihc);
                        javaToIdentityMap.remove(ref);
                        indexProvider.release(id);
                    } finally {
                        releaseLock();
                    }
                }
            }
        });
        cleaner.setDaemon(true);
        cleaner.setName("NatJ Reference Manager Clean Daemon");
        cleaner.start();
    }

    private void aquireLock() {
        while (!mapLock.compareAndSet(false, true))
            ;
    }

    public int objectCount() {
        aquireLock();
        try {
            return javaToIdentityMap.size();
        } finally {
            releaseLock();
        }
    }

    private void releaseLock() {
        mapLock.set(false);
    }

    public long put(Object obj) {
        if (obj == null) {
            return 0;
        }
        aquireLock();
        try {
            final int identityHashCode = System.identityHashCode(obj);
            Long key = identityToNativeMap.get(identityHashCode);
            if (key != null) {
                return key;
            }
            key = indexProvider.acquire();
            final WeakReference<Object> wref = new WeakReference<Object>(obj, queue);
            javaToIdentityMap.put(wref, identityHashCode);
            identityToNativeMap.put(identityHashCode, key);
            nativeToJavaMap.put(key, wref);
            return key;
        } finally {
            releaseLock();
        }
    }

    public Object get(long id) {
        if (id == 0) {
            return null;
        }
        aquireLock();
        try {
            WeakReference<Object> wref = nativeToJavaMap.get(id);
            if (wref == null) {
                throw new IllegalStateException();
            }
            return wref.get();
        } finally {
            releaseLock();
        }
    }
}
