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

package org.moe.natj.general.map;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.OpaquePtr;
import org.moe.natj.general.Mapper;
import org.moe.natj.general.NatJ.JavaObjectConstructionInfo;
import org.moe.natj.general.NatJ.NativeObjectConstructionInfo;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.impl.PtrImplementer;

import java.lang.reflect.Constructor;

/**
 * Mapper for references.
 */
public class ReferenceMapper implements Mapper {

    /**
     * Returns the native pointer of the reference.
     */
    @Override
    public long toNative(Object instance, NativeObjectConstructionInfo info) {
        if (instance == null) {
            return 0;
        }
        return ((ConstVoidPtr) instance).getPeer().getPeer();
    }

    /**
     * Creates a reference from the pointer.
     */
    @Override
    public Object toJava(long peer, JavaObjectConstructionInfo info) {
        if (peer == 0) {
            return null;
        }
        Pointer pointer = CRuntime.createStrongPointer(peer, info.owned);
        try {
            synchronized (info) {
                Constructor<?> constructor;
                Object[] localData = (Object[]) info.data;
                if (localData[0] == null) {
                    if (localData[1] == null) {
                        if (OpaquePtr.class.isAssignableFrom(info.type)) {
                            constructor = getOpaqueConstructor(info.type, Pointer.class);
                            localData[1] = constructor;
                        } else {
                            constructor = getSimpleConstructor(info.type, Pointer.class);
                            localData[1] = constructor;
                        }
                    } else {
                        constructor = ((Constructor<?>) localData[1]);
                    }
                    return constructor.newInstance(pointer);
                } else {
                    if (localData[0] instanceof ReferenceInfo) {

                        ReferenceInfo inf = (ReferenceInfo) localData[0];
                        if (inf.depth() == 1) {
                            // Argument is a Class
                            if (localData[1] == null) {
                                constructor = getConstructor(inf, info.type, Class.class,
                                        Pointer.class);
                                localData[1] = constructor;
                            } else {
                                constructor = ((Constructor<?>) localData[1]);
                            }
                            return constructor.newInstance(inf.type(), pointer);

                        } else if (inf.depth() > 1) {
                            // Argument is a Class and an int
                            if (localData[1] == null) {
                                constructor = getConstructor(inf, info.type, Class.class,
                                        int.class, Pointer.class);
                                localData[1] = constructor;
                            } else {
                                constructor = ((Constructor<?>) localData[1]);
                            }
                            return constructor.newInstance(inf.type(), inf.depth(), pointer);
                        } else {
                            throw new RuntimeException("Invalid reference depth!");
                        }

                    } else if (localData[0] instanceof Class) {
                        // Argument is a Class
                        if (localData[1] == null) {
                            constructor = getConstructor(null, info.type, Class.class,
                                    Pointer.class);
                            localData[1] = constructor;
                        } else {
                            constructor = ((Constructor<?>) localData[1]);
                        }
                        return constructor.newInstance(localData[0], pointer);
                    }
                }
            }
            throw new RuntimeException("Invalid local mapper cache!");
        } catch (Exception ex) {
            throw new RuntimeException("Java reference construction error!", ex);
        }
    }

    private Constructor<?> getSimpleConstructor(Class<?> type, Class<?>... args)
            throws SecurityException, NoSuchMethodException {
        Class<?> impl = PtrImplementer.primitivePtrTypeMap.get(type);
        if (impl == null) throw new RuntimeException("No matching type found in ptr mapper");

        Constructor<?> constructor = impl.getDeclaredConstructor(args);
        constructor.setAccessible(true);
        return constructor;
    }

    private Constructor<?> getConstructor(ReferenceInfo info, Class<?> type, Class<?>... args)
            throws SecurityException, NoSuchMethodException {
        Class<?> impl = PtrImplementer.getImplementer(info, type == ConstPtr.class);
        if (impl == null) throw new RuntimeException("No matching type found in ptr mapper");
        Constructor<?> constructor = impl.getDeclaredConstructor(args);
        constructor.setAccessible(true);
        return constructor;
    }

    private Constructor<?> getOpaqueConstructor(Class<?> type, Class<?>... args)
            throws SecurityException, NoSuchMethodException {
        Class<?> impl = null;
        for (Class<?> declared : type.getDeclaredClasses()) {
            if ("Impl".equals(declared.getSimpleName())) {
                impl = declared;
                break;
            }
        }
        if (impl == null) throw new RuntimeException("No matching type found in ptr mapper");
        Constructor<?> constructor = impl.getDeclaredConstructor(args);
        constructor.setAccessible(true);
        return constructor;
    }
}
