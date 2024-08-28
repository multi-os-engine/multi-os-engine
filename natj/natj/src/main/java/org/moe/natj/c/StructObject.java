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

package org.moe.natj.c;

import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Runtime;

/**
 * StructObject the ascendant of every structure.
 */
@Runtime(CRuntime.class)
public class StructObject extends NativeObject {

    /**
     * StructObject constructor.
     *
     * <p>
     * Uses the parameter {@code peer} as peer.
     *
     * @param peer Pointer to the front of the structure
     */
    protected StructObject(Pointer peer) {
        super(peer);
    }

    /**
     * StructObject constructor.
     *
     * <p>
     * Allocates space for {@code type} and use it as peer.
     *
     * @param type The Java class of the structure to allocate
     */
    protected StructObject(Class<? extends StructObject> type) {
        super(CRuntime.createStrongPointer(CRuntime.allocNativeObject(type, 1), true));
    }
}
