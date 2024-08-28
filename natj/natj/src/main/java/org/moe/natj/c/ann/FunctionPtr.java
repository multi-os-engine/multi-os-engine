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

package org.moe.natj.c.ann;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.ann.Callable;
import org.moe.natj.general.ann.Runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark a native method or its arguments to tell NatJ that the value is a C callback.
 *
 * <p>
 * NatJ will lookup a method by the {@link #name()} and {@link #argTypes()}.
 */
@Callable
@Runtime(CRuntime.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.METHOD, ElementType.PARAMETER
})
public @interface FunctionPtr {
    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 5 LINES
    /**
     * The name of the method of the Java instance we want to use as a native callback.
     *
     * @return Function name of empty string
     */
    String name() default "";

    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 5 LINES
    /**
     * Filters the methods we want to use as a native callback.
     *
     * @return Classes of the argument types
     */
    Class<?>[] argTypes() default {
            void.class
    };
}
