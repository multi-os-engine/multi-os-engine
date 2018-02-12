/*
Copyright (C) 2017 Migeran

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

package org.moe.gradle.natj;

import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.moe.gradle.natj.IBActionAndOutletComposer.ClassVisitor;
import org.moe.gradle.utils.Require;
import org.objectweb.asm.Type;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * This class resolves how native code should be generated.
 */
public class NatJResolver<T extends NatJClass<ClassVisitor>> {

    private static final Logger LOG = Logging.getLogger(NatJResolver.class);

    final TreeMap<String, ResolvedClass> classes = new TreeMap<>();
    final List<String> issues = new ArrayList<>();

    /**
     * Adds a class to this resolver.
     *
     * @param clazz Class to add
     */
    public void add(T clazz) {
        Require.nonNull(clazz);
        LOG.debug("adding class " + clazz.getName());
        classes.put(clazz.getName(), new ResolvedClass(clazz));
    }

    /**
     * Resolves class hierarchy and types then calls the specified action on each class.
     *
     * @param action Action to call
     */
    public void resolve(BiConsumer<String, ResolvedClass> action) {
        Require.nonNull(action);

        // Create a validation order
        final List<String> order = new ArrayList<>();
        block(() -> {
            final Set<String> ordered = new HashSet<>();
            classes.forEach((clazz, resolvedClass) -> createOrder(clazz, resolvedClass, order, ordered));
        });

        // Validate Objective-C classes
        order.forEach(k -> {
            final ResolvedClass resolvedClass = classes.get(k);
            if ("org/moe/natj/objc/ObjCObject".equals(k)) {
                resolvedClass.markAsValidObjCType();
                resolvedClass.markAsObjCClass();
                resolvedClass.setBindingType("id");
                return;
            }

            // Check non-classes
            if (!resolvedClass.getClazz().isClass()) {
                if (resolvedClass.getClazz().hasObjcProtocolName()) {
                    if (resolvedClass.getClazz().hasObjcProtocolSourceName()) {
                        resolvedClass
                                .setBindingType("id<" + resolvedClass.getClazz().getObjcProtocolSourceName() + ">");
                    } else {
                        resolvedClass.setBindingType("id<" + resolvedClass.getClazz().getObjcProtocolName() + ">");
                    }
                } else {
                    resolvedClass.setBindingType("id");
                }
                return;
            }

            // Probably only Java classes
            final ResolvedClass zuper = resolvedClass.getSuper();
            if (zuper == null) {
                return;
            } else {
                if (zuper.isObjCClass()) {
                    resolvedClass.markAsObjCClass();
                }
            }

            // Check binding class
            if (resolvedClass.getClazz().hasObjcClassBinding()) {
                if (!zuper.isValidObjCType()) {
                    issueSkip(k,
                            "superclass (" + resolvedClass.getSuperPrettyName() + ") is not mapped to Objective-C");
                    resolvedClass.setBindingType(zuper.getBindingType());
                } else {
                    resolvedClass.markAsValidObjCType();
                    resolvedClass.setBindingType(resolvedClass.getClazz().getObjcClassBinding() + "*");
                }
                return;
            }

            // Check non-binding classes
            if (resolvedClass.getClazz().hasObjcClassName()) {
                if (!zuper.isValidObjCType()) {
                    issueSkip(k,
                            "superclass (" + resolvedClass.getSuperPrettyName() + ") is not mapped to Objective-C");
                    resolvedClass.setBindingType(zuper.getBindingType());
                } else {
                    resolvedClass.markAsValidObjCType();
                    resolvedClass.setBindingType(resolvedClass.getClazz().getObjcClassName() + "*");
                }
                return;
            }

            if (resolvedClass.isObjCClass()) {
                resolvedClass.setBindingType(zuper.getBindingType());
            }
        });

        // Print issues
        issues.forEach(LOG::warn);

        classes.forEach(action);
    }

    /**
     * Adds a skipping issue to the issues list.
     *
     * @param clazz  Skipped class
     * @param reason Skipping reason
     */
    private void issueSkip(String clazz, String reason) {
        String msg = "Skipping " + Type.getObjectType(clazz).getClassName() + ": " + reason;
        issues.add(msg);
    }

    /**
     * Creates an ordered list based on class hierarchy.
     *
     * @param clazz    Class name to add order for
     * @param resolved Class to add order for
     * @param order    Ordered list
     * @param ordered  Set of objects already in the ordered list
     */
    private void createOrder(String clazz, ResolvedClass resolved, List<String> order, Set<String> ordered) {
        Require.nonNull(clazz);
        if (resolved == null) {
            return;
        }

        final String superName = resolved.getClazz().getSuperName();
        if (superName != null) {
            final ResolvedClass sv = classes.get(superName);
            createOrder(superName, sv, order, ordered);
        }

        if (!ordered.contains(clazz)) {
            ordered.add(clazz);
            order.add(clazz);
        }
    }

    private static void block(Runnable runnable) {
        Require.nonNull(runnable).run();
    }

    public ResolvedClass get(String k) {
        return classes.get(k);
    }

    /**
     * Class representation with resolution information.
     */
    public class ResolvedClass {
        public final T _clazz;
        /**
         * Is a valid Objective-C type.
         */
        private boolean _isValidObjCType = false;
        /**
         * Is an Objective-C class.
         */
        private boolean _isObjCClass = false;
        /**
         * The native type of this class.
         */
        private String _bindingType;

        public ResolvedClass(T clazz) {
            this._clazz = Require.nonNull(clazz);
        }

        public void markAsValidObjCType() {
            _isValidObjCType = true;
        }

        public boolean isValidObjCType() {
            return _isValidObjCType;
        }

        public void markAsObjCClass() {
            _isObjCClass = true;
        }

        public boolean isObjCClass() {
            return _isObjCClass;
        }

        public void setBindingType(String bindingType) {
            this._bindingType = bindingType;
        }

        public String getBindingType() {
            return _bindingType;
        }

        public ResolvedClass getSuper() {
            if (_clazz.getSuperName() == null) {
                return null;
            }
            return classes.get(_clazz.getSuperName());
        }

        public String getPrettyName() {
            return Type.getObjectType(_clazz.getName()).getClassName();
        }

        public String getSuperPrettyName() {
            if (_clazz.getSuperName() == null) {
                return null;
            }
            return Type.getObjectType(_clazz.getSuperName()).getClassName();
        }

        public String getSuperObjCName() {
            final ResolvedClass superClass = getSuper();
            if (superClass == null) {
                return null;
            }
            if (superClass._clazz.hasObjcClassBinding()) {
                return superClass._clazz.getObjcClassBinding();
            }
            if (superClass._clazz.hasObjcClassName()) {
                return superClass._clazz.getObjcClassName();
            }
            return null;
        }

        public T getClazz() {
            return _clazz;
        }
    }
}
