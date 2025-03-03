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

package org.moe.natj.objc;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Objective-C SEL class.
 */
@Structure
public class SEL extends StructObject {

    /**
     * Collection to cached already resolved SEL objects.
     */
    private final static Map<String, Long> resolvedSelectors = new HashMap<String, Long>();

    /**
     * Resolves a selector by its name using {@link #resolvedSelectors} as cache.
     *
     * @param name Selector name
     * @return Selector's pointer
     */
    private static long resolveSelectorByName(String name) {
        Long sel;
        synchronized (resolvedSelectors) {
            sel = resolvedSelectors.get(name);
            if (sel == null) {
                sel = ObjCRuntime.registerSelector(name);
                resolvedSelectors.put(name, sel);
            }
        }
        return sel;
    }

    /**
     * Constructs a selector from a pointer.
     *
     * @param peer Selector's pointer
     */
    protected SEL(Pointer peer) {
        super(peer);
    }

    /**
     * Constructs a selector by its name.
     *
     * @param name Selector's name
     */
    public SEL(String name) {
        super(CRuntime.createStrongPointer(resolveSelectorByName(name), false));
    }

    /**
     * Constructs a selector from a method.
     *
     * <p>
     * Works only with native methods marked with {@link Selector} annotation.
     *
     * @param method Method marked with {@link Selector} annotation
     */
    public SEL(Method method) {
        super(CRuntime.createStrongPointer(resolveSelectorByName(getSelectorString(method)),
                false));
    }

    /**
     * Retrieves selector name from a native method with {@link Selector} annotation.
     *
     * @param method Method marked with {@link Selector} annotation
     * @return Selector name
     */
    static String getSelectorString(Method method) {
        Selector ann = method.getAnnotation(Selector.class);
        if (ann == null) {
            throw new RuntimeException("Can not create native selector from "
                    + "non-Objective-C method!");
        }
        return ann.value();
    }

}
