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
import org.moe.natj.general.Pointer;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Mapper for C string arrays.
 */
public class CStringArrayMapper implements Mapper {

    /**
     * Collection used for caching generated native C string arrays.
     *
     * <p>
     * Because this is a weak has map, the C string arrays will be released after every Java
     * reference to them is gone.
     */
    public Map<String[], Pointer> strings2addr = new WeakHashMap<String[], Pointer>();

    /**
     * Creates a C string array.
     *
     * <p>
     * At first it lookups in the cache, if it results in a success, then it uses it as a result.
     * Otherwise, it creates a C string array and cache it in {@link #strings2addr} and returns it.
     */
    @Override
    public long toNative(Object instance, NativeObjectConstructionInfo info) {
        if (instance == null) {
            return 0;
        }
        String[] strings = (String[]) instance;
        Pointer pointer;
        synchronized (strings2addr) {
            pointer = strings2addr.get(strings);
            if (pointer == null) {
                long peer = CRuntime.createNativeStringArray(strings);
                pointer = CRuntime.createStrongPointer(peer, true);
                strings2addr.put(strings, pointer);
            }
        }
        return pointer.getPeer();
    }

    /**
     * Throws runtime error, because there is no way to support this direction.
     */
    @Override
    public Object toJava(long peer, JavaObjectConstructionInfo info) {
        throw new RuntimeException("Converting native string array to Java is not supported!");
    }

}
