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
import org.moe.natj.general.Mapper;
import org.moe.natj.general.NatJ.JavaObjectConstructionInfo;
import org.moe.natj.general.NatJ.NativeObjectConstructionInfo;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;

import java.lang.reflect.Constructor;

/**
 * Mapper for C structures.
 */
public class CObjectMapper implements Mapper {

    /**
     * Gets the native structure pointer from the {@link NativeObject} and returns it.
     */
    @Override
    public long toNative(Object instance, NativeObjectConstructionInfo info) {
        if (instance == null) {
            return 0;
        }
        return ((NativeObject) instance).getPeer().getPeer();
    }

    /**
     * Creates a Java {@link NativeObject}.
     *
     * <p>
     * At first it copies the peer if needed, then it creates a {@link NativeObject} with
     * reflection. The reflected constructor cached in {@code info.data}. After the
     * construction it returns the resulted object.
     */
    @Override
    public Object toJava(long peer, JavaObjectConstructionInfo info) {
        if (peer == 0) {
            return null;
        }
        Pointer pointer = CRuntime.createStrongPointer(peer, info.owned);
        try {
            Constructor<?> constructor;
            synchronized (info) {
                if (info.data == null) {
                    constructor = info.type.getDeclaredConstructor(Pointer.class);
                    constructor.setAccessible(true);
                    info.data = constructor;
                } else {
                    constructor = ((Constructor<?>) info.data);
                }
            }
            return constructor.newInstance(pointer);
        } catch (Exception ex) {
            throw new RuntimeException("Java object construction error!", ex);
        }
    }

}
