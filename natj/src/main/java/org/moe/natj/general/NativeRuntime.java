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

package org.moe.natj.general;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * The parent of every NativeRuntime.
 *
 * <p>
 * The runtimes are responsible for handling language environments like C, Objective-C and others.
 * The runtimes have three kinds of default {@link Mapper} implementations: object, string and
 * callback mappers. Whenever a native method or one of its arguments has no explicitly
 * given mapper specified with the {@link org.moe.natj.general.ann.MappedReturn} or
 * {@link org.moe.natj.general.ann.Mapped} annotations, then NatJ will use one of
 * these default mappers of the determined responsible runtime instance.
 */
public abstract class NativeRuntime {

    /**
     * Collection for caching mapper objects.
     */
    private final Map<Class<?>, Mapper> class2mapper = new HashMap<Class<?>, Mapper>();

    /**
     * Default mapper for handling objects.
     */
    protected final Mapper objectMapper;

    /**
     * Default mapper for handling strings.
     */
    protected final Mapper stringMapper;

    /**
     * Default mapper for handling callbacks.
     */
    protected final Mapper callbackMapper;

    /**
     * Constructs a mapper of the given {@code mapperClass} class.
     *
     * @param mapperClass The mapper class we want to instantiate
     * @return The instance
     */
    protected Mapper createMapper(Class<?> mapperClass) {
        try {
            Constructor<?> constructor = mapperClass.getConstructor();
            return (Mapper) constructor.newInstance();
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Returns an instance of a the given {@code mapperClass} class.
     *
     * <p>
     * The instances are cached in the {@link #class2mapper} collection,
     * so every class will have only one instance.
     *
     * @param mapperClass The mapper class we want to get an instance of
     * @return The instance
     */
    public Mapper getMapper(Class<?> mapperClass) {
        Mapper mapper;
        synchronized (class2mapper) {
            mapper = class2mapper.get(mapperClass);
            if (mapper == null) {
                mapper = createMapper(mapperClass);
                class2mapper.put(mapperClass, mapper);
            }
        }
        return mapper;
    }

    /**
     * Constructs the runtime and registers the default mappers.
     *
     * @param objectMapperClass The default mapper for objects
     * @param stringMapperClass The default mapper for strings
     * @param callbackMapperClass The default mapper for callbacks
     */
    protected NativeRuntime(Class<?> objectMapperClass, Class<?> stringMapperClass,
            Class<?> callbackMapperClass) {
        if (objectMapperClass != null) {
            objectMapper = createMapper(objectMapperClass);
            class2mapper.put(objectMapperClass, objectMapper);
        } else {
            objectMapper = null;
        }

        if (stringMapperClass != null) {
            stringMapper = createMapper(stringMapperClass);
            class2mapper.put(stringMapperClass, stringMapper);
        } else {
            stringMapper = null;
        }

        if (callbackMapperClass != null) {
            callbackMapper = createMapper(callbackMapperClass);
            class2mapper.put(callbackMapperClass, callbackMapper);
        } else {
            callbackMapper = null;
        }
    }

    /**
     * Returns the default mapper for objects.
     *
     * @return The default object mapper.
     */
    public Mapper getObjectMapper() {
        return objectMapper;
    }

    /**
     * Returns the default mapper for strings.
     *
     * @return The default string mapper.
     */
    public Mapper getStringMapper() {
        return stringMapper;
    }

    /**
     * Returns the default mapper for callbacks.
     *
     * @return The default callback mapper.
     */
    public Mapper getCallbackMapper() {
        return callbackMapper;
    }

    /**
     * Returns the default unbox policy for variadic arguments.
     *
     * @return The default unbox policy.
     */
    public abstract byte getDefaultUnboxPolicy();

    /**
     * Disposes the callbacks created for the given object.
     *
     * @param callback The callback we want to dispose.
     */
    public abstract void tryToDisposeCallback(Object callback);

    /**
     * Registers a class.
     *
     * @param type The type we want to register.
     */
    protected abstract void doRegistration(Class<?> type);

}
