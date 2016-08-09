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
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.ObjCProtocolName;

import java.util.HashMap;
import java.util.Map;

/**
 * Objective-C Class object.
 */
public class Class extends ObjCObject {

    /**
     * Collection to cached already resolved Objective-C classes.
     */
    private static Map<String, Long> resolvedClasses = new HashMap<String, Long>();

    /**
     * Resolves Objective-C class by its name with using {@link #resolvedClasses} collection as a
     * cache.
     *
     * @param name Class name
     * @return Objective-C class
     */
    private static long resolveClassByName(String name) {
        Long cls;
        synchronized (resolvedClasses) {
            cls = resolvedClasses.get(name);
            if (cls == null) {
                cls = ObjCRuntime.getClassByName(name);
                resolvedClasses.put(name, cls);
            }
        }
        return cls;
    }

    /**
     * Resolves Objective-C class by its respective Java class name with using
     * {@link #resolvedClasses} collection as a cache.
     *
     * @param name Java class name
     * @return Objective-C class
     */
    private static long resolveClassByJavaClassName(String name) {
        java.lang.Class<? extends ObjCObject> cls;
        try {
            @SuppressWarnings("unchecked")
            java.lang.Class<? extends ObjCObject> forName =
                    (java.lang.Class<? extends ObjCObject>) java.lang.Class.forName(name);
            cls = forName;
        } catch (Exception ignored) {
            return 0;
        }
        return resolveClassByName(getObjCClassName(cls));
    }

    /**
     * Resolves Objective-C class by its respective Java class with using {@link #resolvedClasses}
     * collection as a cache.
     *
     * @param type Java class
     * @return Objective-C class
     */
    private static long resolveClassByJavaClass(java.lang.Class<? extends ObjCObject> type) {
        return resolveClassByJavaClassName(type.getName());
    }

    /**
     * Gets Objective-C name for Java class.
     *
     * @param type Java class
     * @return Objective-C class name
     */
    public static String getObjCClassName(java.lang.Class<? extends ObjCObject> type) {
        ObjCClassName classAnn = type.getAnnotation(ObjCClassName.class);
        if (classAnn != null) {
            return classAnn.value();
        } else {
            ObjCProtocolName protAnn = type.getAnnotation(ObjCProtocolName.class);
            if (protAnn != null) {
                return protAnn.value();
            } else if (type.isAnnotationPresent(ObjCClassBinding.class)) {
                return type.getSimpleName();
            }
        }
        return type.getName();
    }

    /**
     * Constructs a Class from a pointer.
     *
     * @param peer Pointer
     */
    protected Class(Pointer peer) {
        super(peer);
    }

    /**
     * Get the class from an {@link ObjCObject} and construct a Class from it.
     *
     * @param obj Objective-C object
     */
    public Class(ObjCObject obj) {
        super(CRuntime.createStrongPointer(ObjCRuntime.getObjectClass(obj.getPeer().getPeer()),
                false));
        synchronized (resolvedClasses) {
            resolvedClasses.put(ObjCRuntime.getClassName(getPeer().getPeer()), getPeer()
                    .getPeer());
        }
    }

    /**
     * Construct a Class from a class name.
     *
     * @param name Objective-C class name
     */
    public Class(String name) {
        super(CRuntime.createStrongPointer(resolveClassByName(name), false));
    }

    /**
     * Construct a Class from an Objective-C or Java class name.
     *
     * @param name Objective-C or Java class name
     * @param isObjC Is Objective-C
     */
    public Class(String name, boolean isObjC) {
        super(CRuntime.createStrongPointer(isObjC ? resolveClassByName(name)
                : resolveClassByJavaClassName(name), false));
    }

    /**
     * Constructs a respective Class from a Java class.
     *
     * @param clazz Java class
     */
    public Class(java.lang.Class<? extends ObjCObject> clazz) {
        super(CRuntime.createStrongPointer(resolveClassByJavaClass(clazz), false));
    }

    /**
     * Returns the Objective-C pair of a Java class.
     *
     * @param clazz Java class
     * @return Objective-C class
     */
    public static Class fromJavaClass(java.lang.Class<? extends ObjCObject> clazz) {
        return new Class(clazz);
    }

    /**
     * Returns the super class.
     *
     * @return Objective-C superclass
     */
    public Class getSuper() {
        long parent = ObjCRuntime.getClassParent(getPeer().getPeer());
        if (parent == 0) {
            return null;
        } else {
            return new Class(CRuntime.createStrongPointer(parent, false));
        }
    }

}
