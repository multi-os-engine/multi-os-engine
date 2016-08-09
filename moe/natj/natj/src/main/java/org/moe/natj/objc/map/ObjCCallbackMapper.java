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

package org.moe.natj.objc.map;

import org.moe.natj.general.Mapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.WeakReference;
import org.moe.natj.objc.ann.ObjCBlock;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Mapper for Objective-C blocks.
 */
@Runtime(ObjCRuntime.class)
public class ObjCCallbackMapper implements Mapper {

    /**
     * Collection used for caching generated native blocks where the Java instance has no cache
     * field.
     */
    public Map<Object, WeakReference[]> instance2callbacks =
            new WeakHashMap<Object, WeakReference[]>();

    /**
     * Collection used for caching data generated for Java blocks.
     */
    public Map<Class<?>, Long> class2data = new HashMap<Class<?>, Long>();

    /**
     * Cache constructor class used for constructing cache through the NatJ interface.
     */
    private class ObjCCallbackCacheConstructor implements NatJ.CacheConstructor {
        int size;

        public ObjCCallbackCacheConstructor(int size) {
            this.size = size;
        }

        @Override
        public Object constructCache() {
            return new WeakReference[size];
        }
    }

    /**
     * Class for containing informations needed for native blocks.
     */
    private static class NativeBlockInfo {
        public Constructor<?> proxyConstructor;
        public Constructor<?> handlerConstructor;
        public long data;
    }

    /**
     * Collection for caching the created Java proxy classes and data of native blocks.
     */
    public Map<Class<?>, NativeBlockInfo> block2blockInfo =
            new HashMap<Class<?>, NativeBlockInfo>();

    /**
     * Releaser for Objective-C block binding objects.
     *
     * <p>
     * Will remove the weak reference from the Objective-C block object and send release message
     * to the pointed object.
     */
    private static Pointer.Releaser strongBlockBindingReleaser = new Pointer.Releaser() {
        @Override
        public void release(long peer) {
            ObjCRuntime.lockObject(peer);
            Object instance = ObjCRuntime.getJavaReferenceOfBindingObject(peer);
            if (instance == null) {
                ObjCRuntime.setJavaReferenceOfBindingObject(peer, null);
            }
            ObjCRuntime.unlockObject(peer);
            ObjCRuntime.releaseObject(peer);
        }
    };

    /**
     * Creates a strong block binding pointer to an Objective-C object.
     *
     * <p>
     * Retains if doing so is needed to keep the strong ownership.
     *
     * @param peer The pointer
     * @param owned If this is false, the pointer objects will be retained
     * @return The created {@link Pointer} object
     */
    public static Pointer createStrongBlockBindingPointer(long peer, boolean owned) {
        if (!owned) {
            ObjCRuntime.retainObject(peer);
        }
        return new Pointer(peer, strongBlockBindingReleaser);
    }

    /**
     * Base for invocation handlers.
     */
    private abstract static class BlockInvocationHandler implements InvocationHandler {
        public Pointer peer;
        public long data;

        protected BlockInvocationHandler(Pointer peer, long data) {
            this.peer = peer;
            this.data = data;
        }

        @Override
        public abstract Object invoke(Object proxy, Method method, Object[] args);
    }

    /**
     * Invocation handler for native blocks with boolean return value.
     */
    private static class BooleanInvocationHandler extends BlockInvocationHandler {
        public BooleanInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return new Boolean(ObjCRuntime.forwardBooleanBlockCall(peer.getPeer(), data, args));
        }
    }

    /**
     * Invocation handler for native blocks with byte return value.
     */
    private static class ByteInvocationHandler extends BlockInvocationHandler {
        public ByteInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return new Byte(ObjCRuntime.forwardByteBlockCall(peer.getPeer(), data, args));
        }
    }

    /**
     * Invocation handler for native blocks with char return value.
     */
    private static class CharacterInvocationHandler extends BlockInvocationHandler {
        public CharacterInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return new Character(ObjCRuntime.forwardCharBlockCall(peer.getPeer(), data, args));
        }
    }

    /**
     * Invocation handler for native blocks with short return value.
     */
    private static class ShortInvocationHandler extends BlockInvocationHandler {
        public ShortInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return new Short(ObjCRuntime.forwardShortBlockCall(peer.getPeer(), data, args));
        }
    }

    /**
     * Invocation handler for native blocks with int return value.
     */
    private static class IntegerInvocationHandler extends BlockInvocationHandler {
        public IntegerInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return new Integer(ObjCRuntime.forwardIntBlockCall(peer.getPeer(), data, args));
        }
    }

    /**
     * Invocation handler for native blocks with long return value.
     */
    private static class LongInvocationHandler extends BlockInvocationHandler {
        public LongInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return new Long(ObjCRuntime.forwardLongBlockCall(peer.getPeer(), data, args));
        }
    }

    /**
     * Invocation handler for native blocks with float return value.
     */
    private static class FloatInvocationHandler extends BlockInvocationHandler {
        public FloatInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return new Float(ObjCRuntime.forwardFloatBlockCall(peer.getPeer(), data, args));
        }
    }

    /**
     * Invocation handler for native blocks with double return value.
     */
    private static class DoubleInvocationHandler extends BlockInvocationHandler {
        public DoubleInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return new Double(ObjCRuntime.forwardDoubleBlockCall(peer.getPeer(), data, args));
        }
    }

    /**
     * Invocation handler for native blocks with boolean return value.
     */
    private static class VoidInvocationHandler extends BlockInvocationHandler {
        public VoidInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            ObjCRuntime.forwardVoidBlockCall(peer.getPeer(), data, args);
            return null;
        }
    }

    /**
     * Invocation handler for native blocks with boolean return value.
     */
    private static class ObjectInvocationHandler extends BlockInvocationHandler {
        public ObjectInvocationHandler(Pointer peer, long data) {
            super(peer, data);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            return ObjCRuntime.forwardObjectBlockCall(peer.getPeer(), data, args);
        }
    }

    /**
     * Clean ups after an Objective-C block.
     *
     * @param instance Block object
     * @param method Callback method
     */
    public void cleanupObjCBlock(Object instance, Method method) {
        WeakReference[] cache;
        synchronized (instance) {
            cache = (WeakReference[]) NatJ.getObjectCacheForRuntime(ObjCRuntime.class, instance);
        }
        if (cache == null) {
            synchronized (instance2callbacks) {
                cache = instance2callbacks.get(instance);
            }
        }
        if (cache == null) {
            throw new RuntimeException("No cached value fount in ObjC callback Mapper");
        }
        int idx = NatJ.getMethodIndex(method);
        synchronized (cache) {
            WeakReference reference = cache[idx];
            if (reference != null) {
                if (reference.getPeer() == null) {
                    cache[idx] = null;
                }
            }
        }
    }

    /**
     * Gets the peer for a native block object.
     *
     * @param instance Block object
     * @return Pointer to native block
     */
    public Pointer getNativeBlockPeer(Object instance) {
        if (Proxy.isProxyClass(instance.getClass())) {
            try {
                InvocationHandler handler = Proxy.getInvocationHandler(instance);
                if (handler != null && handler instanceof BlockInvocationHandler) {
                    return ((BlockInvocationHandler) Proxy.getInvocationHandler(instance)).peer;
                }
            } catch (Exception ex) {
                return null;
            }
        }
        return null;
    }

    /**
     * Gets the peer for a Java block object.
     *
     * @param instance Block object
     * @param name Callback method name
     * @param argTypes Argument types
     * @return Pointer to block object
     */
    public Pointer getJavaBlockPeer(Object instance, String name, java.lang.Class<?>[] argTypes) {
        if (!Proxy.isProxyClass(instance.getClass())
                || Proxy.getInvocationHandler(instance) == null
                || !(Proxy.getInvocationHandler(instance) instanceof BlockInvocationHandler)) {
            long peer = getNativeCallback(instance, name, argTypes, false);
            if (peer != 0) {
                return ObjCRuntime.createStrongPointer(peer, true);
            }
        }
        return null;
    }

    /**
     * Creates a native block from a Java instance.
     *
     * <p>
     * At first this computes the method index that is used for cache indexing.
     * Then it tries to get or create a cache through the NatJ interface.
     * If this results in a failure that means the Java instance has no cache field,
     * in this case it uses {@link #instance2callbacks} as cache.
     * If the cache has a generated {@link Pointer} at the computed index, then it uses it as a
     * result, otherwise, if the cache does not contain anything for the method, then it creates
     * the native block and saves it in the cache at the computed index. And at last it returns the
     * created native block.
     *
     * @param instance Block object
     * @param name Callback method name
     * @param argTypes Argument types
     * @param toCreate Block should be created
     * @return Pointer to block object
     */
    private long getNativeCallback(Object instance, String name, java.lang.Class<?>[] argTypes,
            boolean toCreate) {
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
            method = NatJ.getMethod(cls, name, argTypes, idxRef, countRef);
            if (method == null) {
                return 0;
            }
            idx = idxRef[0];
            count = countRef[0];
        }

        WeakReference[] cache = null;
        try {
            synchronized (instance) {
                cache = (WeakReference[]) NatJ.getOrCreateObjectCacheForRuntime(ObjCRuntime.class,
                        instance, new ObjCCallbackCacheConstructor(count));
            }
        } catch (Exception e) {
            // ignore
        }

        if (cache == null) {
            synchronized (instance2callbacks) {
                cache = instance2callbacks.get(instance);
                if (cache == null) {
                    cache = new WeakReference[count];
                    instance2callbacks.put(instance, cache);
                }
            }
        }
        long peer = 0;
        synchronized (cache) {
            WeakReference reference = cache[idx];
            if (reference != null) {
                peer = reference.getNativePeer();
            }
            if (peer == 0 && toCreate) {
                Long data;
                synchronized (class2data) {
                    data = class2data.get(cls);
                    if (data == null) {
                        data = new Long(ObjCRuntime.createDataForJavaBlock(method));
                        class2data.put(cls, data);
                    }
                }
                peer = ObjCRuntime.createNativeCallbackFromJavaInstance(instance, data.longValue());
                reference = ObjCRuntime.createWeakReference(peer);
                cache[idx] = reference;
            }
        }
        return peer;
    }

    /**
     * Disposes an object if it can be.
     *
     * @param object The object of which we want to dispose the native peer
     * @return Whether the given object was disposable
     */
    public boolean dispose(Object object) {
        if (Proxy.isProxyClass(object.getClass())) {
            Object handler = Proxy.getInvocationHandler(object);
            if (handler instanceof BlockInvocationHandler) {
                Pointer peer = ((BlockInvocationHandler)handler).peer;
                long pointer = peer.getPeer();
                ObjCRuntime.lockObject(pointer);
                ObjCRuntime.setJavaReferenceOfBindingObject(pointer, null);
                peer.setPeer(0L);
                ObjCRuntime.unlockObject(pointer);
                ObjCRuntime.releaseObject(pointer);
                return true;
            }
        }
        return false;

    }

    /**
     * Creates a native block from a Java instance.
     */
    @Override
    public long toNative(Object instance, NatJ.NativeObjectConstructionInfo info) {
        if (instance == null) {
            return 0;
        }

        if (info.callback == null) {
            throw new RuntimeException("Invalid callback construction info!");
        }

        Pointer pointer = getNativeBlockPeer(instance);
        long peer;
        if (pointer == null) {
            ObjCBlock blck = (ObjCBlock) info.callback;

            // The memory management is almost the same as the one explained at the proxies
            peer = getNativeCallback(instance, blck.name(), blck.argTypes(), true);
        } else {
            peer = pointer.getPeer();
            ObjCRuntime.retainObject(peer);
        }

        if (peer == 0) {
            return 0;
        }
        if (!info.owned) {
            ObjCRuntime.autoreleaseObject(peer);
        }
        return peer;
    }

    /**
     * Returns a Java peer for a native block object.
     */
    private Object objectToJava(long peer, NatJ.JavaObjectConstructionInfo info) {
        Object instance = null;
        boolean isStackBlock = info.arg && ObjCRuntime.isStackBlock(peer);
        if (isStackBlock) {
            peer = ObjCRuntime.copyBlock(peer);
        } else {
            ObjCRuntime.lockObject(peer);
        }
        try {
            if (!isStackBlock) {
                // Get the Java reference for the Objective-C object
                instance = ObjCRuntime.getJavaReferenceOfBindingObject(peer);
            }

            // Handle objects without living or with stale Java peer
            if (instance == null) {
                // Construct Java object
                Pointer pointer = createStrongBlockBindingPointer(peer,
                        info.arg ? (isStackBlock ? true : false) : info.owned);

                NativeBlockInfo blockInfo = null;
                synchronized (info) {
                    Object[] cache;
                    if (info.data == null) {
                        info.data = cache = new Object[] {
                                null, null, null
                        };
                    } else {
                        cache = (Object[]) info.data;
                        blockInfo = (NativeBlockInfo) cache[0];
                    }
                    if (blockInfo == null) {
                        synchronized (block2blockInfo) {
                            blockInfo = block2blockInfo.get(info.type);
                            if (blockInfo == null) {
                                blockInfo = new NativeBlockInfo();

                                Method method;
                                {
                                    ObjCBlock block = (ObjCBlock) info.callback;
                                    int[] idxRef = new int[1];
                                    int[] countRef = new int[1];
                                    method = NatJ.getMethod(info.type, block.name(),
                                            block.argTypes(), idxRef, countRef);
                                    if (method == null) {
                                        throw new RuntimeException(
                                                "Could not find Java method for native callback!");
                                    }
                                }

                                blockInfo.data = ObjCRuntime.createDataForNativeBlock(method);

                                Class<?> returnType = method.getReturnType();
                                Class<?> handler;
                                if (returnType == Boolean.TYPE) {
                                    handler = BooleanInvocationHandler.class;
                                } else if (returnType == Byte.TYPE) {
                                    handler = ByteInvocationHandler.class;
                                } else if (returnType == Character.TYPE) {
                                    handler = CharacterInvocationHandler.class;
                                } else if (returnType == Short.TYPE) {
                                    handler = ShortInvocationHandler.class;
                                } else if (returnType == Integer.TYPE) {
                                    handler = IntegerInvocationHandler.class;
                                } else if (returnType == Long.TYPE) {
                                    handler = LongInvocationHandler.class;
                                } else if (returnType == Float.TYPE) {
                                    handler = FloatInvocationHandler.class;
                                } else if (returnType == Double.TYPE) {
                                    handler = DoubleInvocationHandler.class;
                                } else if (returnType == Void.TYPE) {
                                    handler = VoidInvocationHandler.class;
                                } else {
                                    handler = ObjectInvocationHandler.class;
                                }
                                try {
                                    blockInfo.handlerConstructor = handler.getConstructor(
                                            Pointer.class, Long.TYPE);
                                    blockInfo.proxyConstructor = Proxy.getProxyClass(
                                            info.type.getClassLoader(), new Class[] {
                                                info.type
                                            })
                                            .getConstructor(new Class[] {
                                                    InvocationHandler.class
                                            });
                                } catch (NoSuchMethodException e) {
                                    throw new RuntimeException(
                                            "Could not find proxy for native block!", e);
                                }

                                block2blockInfo.put(info.type, blockInfo);
                            }
                        }
                        cache[0] = blockInfo;
                    }
                }
                try {
                    instance = blockInfo.proxyConstructor.newInstance(blockInfo.handlerConstructor
                            .newInstance(pointer, blockInfo.data));
                } catch (Exception e) {
                    throw new RuntimeException("Java object construction error!", e);
                }

                // Save the Java reference
                ObjCRuntime.setJavaReferenceOfBindingObject(peer, instance);
            } else { // Handle objects with living Java peer
                if (!info.arg && info.owned) {
                    ObjCRuntime.releaseObject(peer);
                }
            }
        } finally {
            if (!isStackBlock) {
                ObjCRuntime.unlockObject(peer);
            }
        }
        return instance;
    }

    /**
     * Creates a Java instance from a native block.
     *
     * <p>
     * This only works with Objective-C blocks we create.
     */
    @Override
    public Object toJava(long peer, NatJ.JavaObjectConstructionInfo info) {
        if (peer == 0) {
            return null;
        }
        Object instance = ObjCRuntime.getInstanceForJavaBlock(peer);

        // Create Java proxy for native NSBlocks
        if (instance == null && info.type.isInterface()) {
            return objectToJava(peer, info);
        }

        if (!info.arg && info.owned) {
            ObjCRuntime.releaseObject(peer);
        }
        return instance;
    }
}
