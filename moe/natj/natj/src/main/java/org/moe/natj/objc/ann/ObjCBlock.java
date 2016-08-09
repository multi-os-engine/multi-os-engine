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

package org.moe.natj.objc.ann;

import org.moe.natj.general.ann.Callable;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark a native method or one of its argument to tell NatJ the value an Objective-C block.
 *
 * <p>
 * NatJ will lookup a method by the {@link #name()} and {@link #argTypes()}.
 */
@Callable
@Runtime(ObjCRuntime.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.PARAMETER, ElementType.METHOD
})
public @interface ObjCBlock {
    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 6 LINES
    /**
     * The name of the method of the Java instance we want to use as a native
     * callback.
     *
     * @return Method name
     */
    String name();

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
