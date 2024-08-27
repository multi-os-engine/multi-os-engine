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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for C variables.
 *
 * <p>
 * Any native method marked by this annotation will be bound by NatJ as a getter or setter for
 * a native global variable.
 * If the name is not specified by the value, then the variable's name will be used for symbol
 * lookup.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.METHOD
})
public @interface CVariable {
    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 5 LINES
    /**
     * The variable name.
     *
     * @return Variable name or empty string
     */
    String name() default "";

    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 5 LINES
    /**
     * Whether it a getter or a setter.
     *
     * @return True if getter, otherwise false
     */
    boolean isGetter() default true;
}
