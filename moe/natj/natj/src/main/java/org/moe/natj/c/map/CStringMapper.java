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
 * Mapper for C strings.
 */
public class CStringMapper implements Mapper {

    /**
     * Collection used for caching generated native C strings.
     *
     * <p>
     * Because this is a weak has map, the C strings will be released after every Java reference
     * to them is gone.
     */
    public final Map<String, Pointer> string2addr = new WeakHashMap<String, Pointer>();

    /**
     * Creates a C string.
     *
     * <p>
     * At first it lookups in the cache, if it results in a success, then it uses it as a result.
     * Otherwise, it creates a C string and cache it in {link #string2addr} and returns it.
     */
    @Override
    public long toNative(Object instance, NativeObjectConstructionInfo info) {
        if (instance == null) {
            return 0;
        }
        String string = (String) instance;
        Pointer pointer;
        synchronized (string2addr) {
            pointer = string2addr.get(string);
            if (pointer == null) {
                long peer = CRuntime.createNativeString(string);
                pointer = CRuntime.createStrongPointer(peer, true);
                string2addr.put(string, pointer);
            }
        }
        return pointer.getPeer();
    }

    /**
     * Creates a Java string.
     *
     * <p>
     * Creates a Java string from a C string.
     */
    @Override
    public Object toJava(long peer, JavaObjectConstructionInfo info) {
        if (peer == 0) {
            return null;
        }
        return CRuntime.createJavaString(peer);
    }

}
