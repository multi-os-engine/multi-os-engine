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
import org.moe.natj.general.NatJ.JavaObjectConstructionInfo;
import org.moe.natj.general.NatJ.NativeObjectConstructionInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;

/**
 * Mapper for Objective-C strings.
 */
@Runtime(ObjCRuntime.class)
public class ObjCStringMapper implements Mapper {

    /**
     * Creates an Objective-C string from a Java string.
     *
     * @param instance Java String object
     * @param info Construction info
     * @return NSString pointer
     */
    @Override
    public long toNative(Object instance, NativeObjectConstructionInfo info) {
        if (instance == null) {
            return 0;
        }
        String string = (String) instance;

        // The memory management is almost the same as the one explained at the proxies
        long peer = ObjCRuntime.createNativeString(string);
        if (!info.owned) {
            ObjCRuntime.autoreleaseObject(peer);
        }

        return peer;
    }

    /**
     * Creates a Java string from an Objective-C string.
     *
     * @param peer NSString pointer
     * @param info Construction info
     * @return Java String object
     */
    @Override
    public Object toJava(long peer, JavaObjectConstructionInfo info) {
        if (peer == 0) {
            return null;
        }

        Object instance = ObjCRuntime.createJavaString(peer);
        if (info.owned) {
            ObjCRuntime.releaseObject(peer);
        }

        return instance;
    }

}
