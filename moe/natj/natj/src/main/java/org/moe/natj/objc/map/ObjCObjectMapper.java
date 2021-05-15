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
import org.moe.natj.general.NatJ.JavaObjectConstructionInfo;
import org.moe.natj.general.NatJ.NativeObjectConstructionInfo;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.Pointer.Releaser;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCOpaqueObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.WeakReference;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import java.lang.reflect.*;
import java.util.*;

/**
 * Mapper for Objective-C objects.
 */
@Runtime(ObjCRuntime.class)
public class ObjCObjectMapper implements Mapper {

    /**
     * Collection for caching Objective-C classes we generate for proxying.
     */
    private final Map<Class<?>, Long> class2addr = new HashMap<Class<?>, Long>();

    /**
     * Collection for caching the created Objective-C proxy objects.
     */
    public final Map<Object, WeakReference> proxy2addr = new WeakHashMap<Object, WeakReference>();

    /**
     * Class for containing informations needed for native protocol proxies.
     */
    private static class NativeProtocolInfo {
        public Constructor<?> proxyConstructor;
        public HashMap<Method, Long> data;
    }

    /**
     * Collection for caching the created info of native protocol proxies.
     */
    public final Map<Class<?>, NativeProtocolInfo> type2ProtocolInfo = new HashMap<Class<?>, NativeProtocolInfo>();

    /**
     * Releaser for Objective-C binding objects.
     *
     * <p>
     * Will remove the weak reference from the Objective-C object and send release message to the
     * pointed object.
     */
    private static final Releaser strongBindingReleaser = new Releaser() {
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

        @Override
        public boolean ifFinalizedExternally() {
            return false;
        }
    };

    /**
     * Creates a strong binding pointer to an Objective-C object.
     *
     * <p>
     * Retains if doing so is needed to keep the strong ownership.
     *
     * @param peer The pointer
     * @param owned If this is false, the pointer objects will be retained
     * @return The created {@link Pointer} object
     */
    public static Pointer createStrongBindingPointer(long peer, boolean owned) {
        if (!owned) {
            ObjCRuntime.retainObject(peer);
        }
        return new Pointer(peer, strongBindingReleaser);
    }

    /**
     * Removes the object from the proxy map.
     *
     * @param peer Proxy object
     */
    public void cleanupObjCProxy(Object peer) {
        synchronized (proxy2addr) {
            WeakReference reference = proxy2addr.get(peer);
            if (reference != null) {
                if (reference.getPeer() == null) {
                    proxy2addr.remove(peer);
                }
            }
        }
    }

    /**
     * Returns the Objective-C object for a proxied Java instance.
     *
     * @param object The object we want to get native proxy object for.
     * @return The native proxy object
     */
    public Pointer getNativePeerOfProxyedObject(Object object) {
        synchronized (proxy2addr) {
            WeakReference peer = proxy2addr.get(object);
            if (peer == null) {
                return null;
            } else {
                return peer.getPeer();
            }
        }
    }

    /**
     * Disposes an object if it can be.
     *
     * @param object The object of which we want to dispose the native peer
     * @return Whether the given object was disposable
     */
    public boolean dispose(Object object) {
        ObjCObject peer = null;
        if (object instanceof ObjCObject) {
            peer = (ObjCObject)object;
        }
        if (Proxy.isProxyClass(object.getClass())) {
            Object handler = Proxy.getInvocationHandler(object);
            if (handler instanceof ObjCOpaqueObject.ProtocolProxyHandler) {
                peer = ((ObjCOpaqueObject.ProtocolProxyHandler)handler).getHolder();
            }
        }
        if (peer != null) {
            long pointer = peer.getPeerPointer();
            ObjCRuntime.lockObject(pointer);
            ObjCRuntime.setJavaReferenceOfBindingObject(pointer, null);
            peer.getPeer().setPeer(0L);
            ObjCRuntime.unlockObject(pointer);
            ObjCRuntime.releaseObject(pointer);
            return true;
        }
        return false;
    }

    /**
     * Creates Objective-C objects from Java objects.
     *
     * <p>
     * For {@link NativeObject}s this will only return their peers.
     * For strings this will forward to {@link ObjCStringMapper}.
     * For every other cases this will generate proxy classes with using {@link #class2addr} as
     * cache for Objective-C classes, and instance them with using {@link #proxy2addr} as a cache
     * for instantiations.
     */
    @Override
    public long toNative(Object instance, NativeObjectConstructionInfo info) {
        if (instance == null) {
            return 0;
        }

        if (instance instanceof Proxy) {
            InvocationHandler handler = Proxy.getInvocationHandler(instance);
            if (handler instanceof ObjCOpaqueObject.ProtocolProxyHandler) {
                instance = ((ObjCOpaqueObject.ProtocolProxyHandler)handler).getHolder();
            }
        }

        if (instance instanceof String) {
            return NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class).getStringMapper()
                    .toNative(instance, info);
        } else if (NativeObject.class.isAssignableFrom(instance.getClass())) {
            long peer = ((NativeObject) instance).getPeer().getPeer();
            long opeer = ObjCRuntime.getObjCCastProxyPeer(peer);
            if (opeer != 0L) {
                peer = opeer;
            }
            if (!info.arg && ObjCRuntime.getInitTargetOnCurrentThread() == null) {
                ObjCRuntime.retainObject(peer);
                if (!info.owned) {
                    ObjCRuntime.autoreleaseObject(peer);
                }
            }
            return peer;
        } else {
            // The memory management of proxies are a little bit tricky.
            // Because the Java object does not have a strong reference to the proxy peer, when
            // passing a proxy as an argument to native side, potentially nobody is going to
            // retain (and release) the object, so the object would have to be alive for a certain
            // amount of time without any real strong reference to it. One solution for this
            // problem is to wrap the Java to native conversion, the native call and the native to
            // Java conversion phases with an autorelease pool, because doing so will enable us to
            // retain that proxy object without causing any memory leaks. So in the
            // javaToNativeMessageHandler we have to put an autorelease pool.
            long peer = 0;
            synchronized (proxy2addr) {
                // Get the proxy for the Java object with one extra retain
                WeakReference reference = proxy2addr.get(instance);
                if (reference != null) {
                    peer = reference.getNativePeer();
                }
                if (peer == 0) {
                    Class<?> cls = instance.getClass();
                    Long nativeClass;
                    synchronized (class2addr) {
                        nativeClass = class2addr.get(cls);
                        if (nativeClass == null) {
                            if (List.class.isAssignableFrom(cls)) {
                                nativeClass = ObjCRuntime.createProxyClassWithExtension(cls, "NSMutableArray", ListExtension.class);
                            } else if (Map.class.isAssignableFrom(cls)) {
                                nativeClass = ObjCRuntime.createProxyClassWithExtension(cls, "NSMutableDictionary", MapExtension.class);
                            } else if (Set.class.isAssignableFrom(cls)) {
                                nativeClass = ObjCRuntime.createProxyClassWithExtension(cls, "NSMutableSet", SetExtension.class);
                            } else if (Iterator.class.isAssignableFrom(cls)) {
                                nativeClass = ObjCRuntime.createProxyClassWithExtension(cls, "NSEnumerator", IteratorExtension.class);
                            } else {
                                nativeClass = ObjCRuntime.createProxyClass(cls);
                            }
                            class2addr.put(cls, nativeClass);
                        }
                    }
                    peer = ObjCRuntime.createProxyInstance(nativeClass, instance);
                    proxy2addr.put(instance, ObjCRuntime.createWeakReference(peer));
                }
            }

            // At this point the proxy object has an extra retain, so retaining the object here is
            // not needed.
            if (!info.owned) {
                ObjCRuntime.autoreleaseObject(peer);
            }
            return peer;
        }
    }

    /**
     * Gets or creates a protocol proxy.
     */
    private Object getOrCreateProtocolProxy(ObjCOpaqueObject oi, java.lang.Class<?> type) {
        Proxy proxy = oi.proxies.get(type);
        if (proxy == null) {
            NativeProtocolInfo protocolInfo;
            synchronized (type2ProtocolInfo) {
                protocolInfo = type2ProtocolInfo.get(type);
                if (protocolInfo == null) {
                    protocolInfo = new NativeProtocolInfo();

                    Object[] dataArray = ObjCRuntime.createDataForNativeProtocolProxy(type);
                    protocolInfo.data = new HashMap<Method, Long>();
                    for (int i = 0, n = dataArray.length / 2; i < n; i++) {
                        Method method = (Method) dataArray[i * 2];
                        Long data = (Long) dataArray[i * 2 + 1];
                        if (method == null || data == null) {
                            continue;
                        }
                        protocolInfo.data.put(method, data);
                    }

                    try {
                        protocolInfo.proxyConstructor = Proxy.getProxyClass(
                                type.getClassLoader(), new Class[]{
                                        type
                                })
                                .getConstructor(new Class[]{
                                        InvocationHandler.class
                                });
                    } catch (NoSuchMethodException e) {
                        throw new RuntimeException("Could not find proxy for native protocol!", e);
                    }

                    type2ProtocolInfo.put(type, protocolInfo);
                }
            }
            try {
                proxy = (Proxy) protocolInfo.proxyConstructor.newInstance(new Object[]{oi.createProtocolProxyHandler(protocolInfo.data)});
            } catch (Exception e) {
                throw new RuntimeException("Java object construction error!", e);
            }
            oi.proxies.put(type, proxy);
        }
        return proxy;
    }

    /**
     * Returns a Java peer for a non proxy object.
     */
    private Object objectToJava(long peer, JavaObjectConstructionInfo info) {
        // Determine the kind of the peer
        boolean isInherited = ObjCRuntime.isKindOfInheritedClass(peer);
        boolean isProxy = !isInherited && ObjCRuntime.isKindOfProxyClass(peer);
        boolean isHybrid = !isInherited && !isProxy && ObjCRuntime.isKindOfHybridClass(peer);
        boolean isBinding = !isInherited && !isProxy && !isHybrid;

        /* Select behaviors */

        // Proxies and inherited objects will always have a Java reference
        boolean isLockNeeded = !isProxy && !isInherited;

        // Proxies don't have init methods, so handling init calls is not needed for them
        boolean isInitHandlingNeeded = !isProxy;

        // Association of the peers will happen at Objective-C side for inherited classes
        boolean isRefSettingNeeded = !isInherited;

        Object instance;
        if (isLockNeeded) {
            ObjCRuntime.lockObject(peer);
        }
        try {
            // Get the Java reference for the Objective-C object
            instance = isBinding ? ObjCRuntime.getJavaReferenceOfBindingObject(peer) : ObjCRuntime
                    .getJavaReferenceOfCustomObject(peer);

            // Handle objects without living or with stale Java peer
            if (instance == null || NativeObject.class.isAssignableFrom(instance.getClass())
                    && ((NativeObject) instance).getPeer().getPeer() == 0) {

                // Check whether we are handling an init message
                Object target = null;
                if (isInitHandlingNeeded) {
                    target = ObjCRuntime.getInitTargetOnCurrentThread();
                    if (target != null && !info.arg && target instanceof NativeObject) {
                        Pointer pointer = ((NativeObject)target).getPeer();
                        pointer.setPeer(0);
                    }
                }

                // Determine Java class
                java.lang.Class<?> cls;
                if (instance != null) {
                    cls = instance.getClass();
                } else if (isHybrid) {
                    cls = ObjCRuntime.getJavaTypeForHybridClass(ObjCRuntime.getObjectClass(peer));
                } else if (isInherited) {
                    cls = info.type;
                } else {
                    Long typeCls = null;
                    synchronized (info) {
                        Object[] cache;
                        if (info.data == null) {
                            info.data = cache = new Object[] {
                                    null, null, null
                            };
                        } else {
                            cache = (Object[]) info.data;
                            typeCls = (Long) cache[1];
                        }
                        if (typeCls == null) {
                            if (ObjCObject.class.isAssignableFrom(info.type)) {
                                @SuppressWarnings("unchecked")
                                Class<? extends ObjCObject> casted =
                                        (Class<? extends ObjCObject>) info.type;
                                cache[1] = typeCls = Long.valueOf(org.moe.natj.objc.Class
                                        .fromJavaClass(casted).getPeer().getPeer());
                            } else {
                                cache[1] = typeCls = Long.valueOf(0);
                            }
                        }
                    }
                    if (typeCls != 0 && typeCls == ObjCRuntime.getObjectClass(peer)) {
                        cls = info.type;
                    } else {
                        cls = ((ObjCRuntime) NatJ
                                .getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class))
                                .resolveObjCClass(ObjCRuntime.getObjectClass(peer));
                        if (!info.type.isAssignableFrom(cls)) {
                            if (info.type.isInterface() &&
                                    info.type.isAnnotationPresent(ObjCProtocolName.class)) {
                                cls = ObjCOpaqueObject.class;
                            } else {
                                cls = info.type;
                            }
                        }
                    }
                }

                // Construct Java object
                Pointer pointer;
                if (isBinding) {
                    pointer = createStrongBindingPointer(peer, info.arg ? false : target != null
                            || info.owned);
                } else {
                    pointer = ObjCRuntime.createStrongPointer(peer, info.arg ? false
                            : target != null || info.owned);
                }
                try {
                    Constructor<?> constructor = cls.getDeclaredConstructor(Pointer.class);
                    constructor.setAccessible(true);
                    instance = constructor.newInstance(pointer);
                } catch (Exception ex) {
                    throw new RuntimeException("Java object construction error!", ex);
                }

                // Save the Java reference
                if (isRefSettingNeeded) {
                    if (isBinding) {
                        ObjCRuntime.setJavaReferenceOfBindingObject(peer, instance);
                    } else {
                        ObjCRuntime.setJavaReferenceOfCustomObject(peer, instance);
                    }
                }

                // Replace original opaque object with one of its protocol proxies
                if (instance.getClass() == ObjCOpaqueObject.class) {
                    instance = getOrCreateProtocolProxy((ObjCOpaqueObject) instance, info.type);
                }
            } else { // Handle objects with living Java peer
                Object target = null;
                if (isInitHandlingNeeded) {
                    target = ObjCRuntime.getInitTargetOnCurrentThread();
                }
                if (!info.arg) {
                    if (target != null) {
                        if (instance != target) {
                            if (target instanceof NativeObject) {
                                ((NativeObject) target).getPeer().setPeer(0);
                            }
                            ObjCRuntime.releaseObject(peer);
                        }
                    } else if (info.owned) {
                        ObjCRuntime.releaseObject(peer);
                    }
                }

                // Replace original opaque object with one of its protocol proxies
                if (instance.getClass() == ObjCOpaqueObject.class) {
                    instance = getOrCreateProtocolProxy((ObjCOpaqueObject) instance, info.type);
                }
            }
        } finally {
            if (isLockNeeded) {
                ObjCRuntime.unlockObject(peer);
            }
        }
        return instance;
    }

    /**
     * Creates Java objects from Objective-C objects.
     *
     * <p>
     * For {@link NativeObject}s this will use the Java instances associated with the Objective-C
     * objects.
     * If there are no references, then this will create new {@link NativeObject}s, and associate
     * them with the Objective-C objects. For strings this will forward to {@link ObjCStringMapper}.
     * For blocks this will forward to {@link ObjCCallbackMapper}.
     *
     * <p>
     * For proxies it will return the the Java instances associated with the Objective-C proxy
     * objects.
     */
    @Override
    public Object toJava(long peer, JavaObjectConstructionInfo info) {
        // Handling init methods is a special case, because a call to a method of this kind can
        // release the target object it is called on, so in this current implementation we solve
        // this by setting the peer of the target to zero, but this can cause problems if the
        // target Java instance used in other threads. But using a non-initialized object in
        // multiple threads is not a good move anyway.

        // Handle null pointers as null
        if (peer == 0) {
            // Cleanup for init methods
            Object target = ObjCRuntime.getInitTargetOnCurrentThread();
            if (target != null && !info.arg && target instanceof NativeObject) {
                Pointer pointer = ((NativeObject)target).getPeer();
                pointer.setPeer(0);
            }

            return null;
        }

        // Forward strings and blocks to the appropriate mappers
        if (!NativeObject.class.isAssignableFrom(info.type) && ObjCRuntime.isObjectString(peer)) {
            return NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class).getStringMapper()
                    .toJava(peer, info);
        }
        if (ObjCRuntime.isObjectBlock(peer)) {
            return NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class).getCallbackMapper()
                    .toJava(peer, info);
        }

        // Forward the peer to the appropriate handler
        return objectToJava(peer, info);
    }

    /**
     * Proxy extension for Java List objects.
     */
    private static class ListExtension extends ObjCRuntime.ProxyExtensionBase<List> {

        public ListExtension(Object target) {
            super(target);
        }


        /*
         * NSArray selectors.
         */

        @Selector("count")
        public @NUInt long count() {
            return target.size();
        }

        @Selector("objectAtIndex:")
        public Object objectAtIndex(@NUInt long index) {
            Object ret = target.get((int)index);
            if (ret == null) {
                throw new RuntimeException("NSArray can not hold null values!");
            }
            return ret;
        }


        /*
         * NSMutableArray selectors.
         */

        @Selector("insertObject:atIndex:")
        public void insertObjectAtIndex(Object object, @NUInt long index) {
            if (object == null) {
                throw new RuntimeException("NSArray can not hold null values!");
            }
            target.add((int)index, object);
        }

        @Selector("removeObjectAtIndex:")
        public void removeObjectAtIndex(@NUInt long index) {
            target.remove((int)index);
        }

        @Selector("addObject:")
        public void addObject(Object object) {
            if (object == null) {
                throw new RuntimeException("NSArray can not hold null values!");
            }
            target.add(object);
        }

        @Selector("removeLastObject")
        public void removeLastObject() {
            int last = target.size();
            if (last == 0) {
                throw new RuntimeException("Can not remove element from empty NSArray!");
            }
            last--;
            target.remove(last);
        }

        @Selector("replaceObjectAtIndex:withObject:")
        public void replaceObjectAtIndexWithObject(@NUInt long index, Object object) {
            if (object == null) {
                throw new RuntimeException("NSArray can not hold null values!");
            }
            target.set((int)index, object);
        }

    }

    /**
     * Proxy extension for Java Map objects.
     */
    private static class MapExtension extends ObjCRuntime.ProxyExtensionBase<Map> {

        public MapExtension(Object target) {
            super(target);
        }


        /*
         * NSDictionary selectors.
         */

        @Selector("count")
        public @NUInt long count() {
            return target.size();
        }

        @Selector("objectForKey:")
        public Object objectForKey(Object object) {
            if (object == null) {
                throw new RuntimeException("NSDictionary can not hold null keys!");
            }
            Object ret = target.get(object);
            if (ret == null) {
                throw new RuntimeException("NSDictionary can not hold null values!");
            }
            return ret;
        }

        @Selector("keyEnumerator")
        public Object keyEnumerator() {
            return target.keySet().iterator();
        }


        /*
         * NSMutableDictionary selectors.
         */

        @Selector("setObject:forKey:")
        public void setObjectForKey(Object object, Object key) {
            if (object == null) {
                throw new RuntimeException("NSDictionary can not hold null values!");
            }
            if (key == null) {
                throw new RuntimeException("NSDictionary can not hold null keys!");
            }
            target.put(key, object);
        }

        @Selector("removeObjectForKey:")
        public void removeObjectForKey(Object key) {
            if (key == null) {
                throw new RuntimeException("NSDictionary can not hold null keys!");
            }
            target.remove(key);
        }

    }

    /**
     * Proxy extension for Java Set objects.
     */
    private static class SetExtension extends ObjCRuntime.ProxyExtensionBase<Set> {

        public SetExtension(Object target) {
            super(target);
        }


        /*
         * NSSet selectors.
         */

        @Selector("count")
        public @NUInt long count() {
            return target.size();
        }

        @Selector("member:")
        public Object member(Object object) {
            if (object == null) {
                throw new RuntimeException("NSSet can not hold null keys!");
            }
            if(target.contains(object)) {
                return object;
            }
            return null;
        }

        @Selector("objectEnumerator")
        public Object objectEnumerator() {
            return target.iterator();
        }


        /*
         * NSMutableSet selectors.
         */

        @Selector("addObject:")
        public void addObject(Object object) {
            if (object == null) {
                throw new RuntimeException("NSSet can not hold null values!");
            }
            target.add(object);
        }

        @Selector("removeObject:")
        public void removeObject(Object object) {
            if (object == null) {
                throw new RuntimeException("NSSet can not hold null values!");
            }
            target.remove(object);
        }

    }

    /**
     * Proxy extension for Java IteratorExtension objects.
     */
    private static class IteratorExtension extends ObjCRuntime.ProxyExtensionBase<Iterator> {

        public IteratorExtension(Object target) {
            super(target);
        }

        /*
         * NSEnumerator selectors.
         */

        @Selector("allObjects")
        public Object allObjects() {
            ArrayList ret = new ArrayList();
            while (target.hasNext()) {
                Object object = target.next();
                if (object == null) {
                    throw new RuntimeException("Objective-C collections can not hold null values!");
                }
                ret.add(object);
            }
            return ret;
        }

        @Selector("nextObject")
        public Object nextObject() {
            if (target.hasNext()) {
                Object object = target.next();
                if (object == null) {
                    throw new RuntimeException("Objective-C collections can not hold null values!");
                }
                return object;
            }
            return null;
        }

    }
}
