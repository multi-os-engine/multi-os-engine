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

package org.moe.natj.c.map;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.Mapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.NatJ.JavaObjectConstructionInfo;
import org.moe.natj.general.NatJ.NativeObjectConstructionInfo;
import org.moe.natj.general.Pointer;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Mapper for C callbacks.
 */
public class CCallbackMapper implements Mapper {

    /**
     * Used for storing the callback pointer and the extra field.
     *
     * <p>
     * The meaning of the extra field is opaque from Java and strongly platform dependent.
     */
    public static class CallbackInfo {
        public Pointer callback;
        public long extra;

        public CallbackInfo(Pointer callback, long extra) {
            this.callback = callback;
            this.extra = extra;
        }
    }

    /**
     * Collection used for caching generated native callbacks where the Java instance has no cache
     * field.
     */
    public final Map<Object, CallbackInfo[]> instance2callbacks = new HashMap<Object, CallbackInfo[]>();

    /**
     * Collection used for caching extras for callbacks.
     */
    public final Map<Long, Long> callback2extras = new HashMap<Long, Long>();

    /**
     * Cache constructor class used for constructing cache through the NatJ interface.
     */
    private class CCallbackCacheConstructor implements NatJ.CacheConstructor {
        int size;

        public CCallbackCacheConstructor(int size) {
            this.size = size;
        }

        @Override
        public Object constructCache() {
            return new CallbackInfo[size];
        }
    }

    /**
     * Creates a native callback from a Java instance.
     *
     * <p>
     * At first this computes the method index that is used for cache indexing.
     * Then it tries to get or create a cache through the NatJ interface.
     * If this results in a failure that means the Java instance has no cache field,
     * in this case it uses {@link #instance2callbacks} as cache.
     * If the cache has a generated {@link Pointer} at the computed index, then it uses it as a
     * result, otherwise, if the cache does not contain anything for the method, then it creates
     * the native callback and saves it in the cache at the computed index. And at last it returns
     * the created native callback.
     */
    @Override
    public long toNative(Object instance, NativeObjectConstructionInfo info) {
        if (instance == null) {
            return 0;
        }

        Class<?> cls = instance.getClass();

        Method method;
        int idx;
        int count;
        {
            int[] idxRef = new int[1];
            int[] countRef = new int[1];
            FunctionPtr cb = (FunctionPtr) info.callback;
            method = NatJ.getMethod(cls, cb.name(), cb.argTypes(), idxRef, countRef);
            if (method == null) {
                return 0;
            }
            idx = idxRef[0];
            count = countRef[0];
        }

        CallbackInfo[] cache = null;
        try {
            synchronized (instance) {
                cache = (CallbackInfo[]) NatJ.getOrCreateObjectCacheForRuntime(CRuntime.class,
                        instance, new CCallbackCacheConstructor(count));
            }
        } catch (Exception e) {
            // ignore
        }

        long peer;
        if (cache == null) {
            synchronized (instance2callbacks) {
                cache = instance2callbacks.get(instance);
                if (cache == null) {
                    cache = new CallbackInfo[count];
                    instance2callbacks.put(instance, cache);
                }
            }
        }
        synchronized (cache) {
            if (cache[idx] == null) {
                long[] extra = new long[1];
                peer = CRuntime.allocNativeCallback(instance, method, extra);
                Pointer callback = CRuntime.createStrongPointer(peer, false);
                cache[idx] = new CallbackInfo(callback, extra[0]);
                synchronized (callback2extras) {
                    callback2extras.put(callback.getPeer(), extra[0]);
                }
            } else {
                peer = cache[idx].callback.getPeer();
            }
        }
        return peer;
    }

    /**
     * Creates a Java instance from a native callback.
     *
     * <p>
     * This only works with C callbacks we create.
     */
    @Override
    public Object toJava(long peer, JavaObjectConstructionInfo info) {
        if (peer == 0) {
            return null;
        }

        Long cbInfo;
        synchronized (callback2extras) {
            cbInfo = callback2extras.get(peer);
        }
        if (cbInfo == null) {
            return null;
        }
        return CRuntime.createJavaCallback(cbInfo);
    }

}
