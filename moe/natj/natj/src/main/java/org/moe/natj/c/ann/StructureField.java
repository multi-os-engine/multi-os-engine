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
 * Annotation for C structure field getters and setters.
 *
 * <p>
 * Marking a native method with this annotation will tell NatJ to handle the method as a structure
 * field getter or setter. This annotation only affects classes with the
 * {@link org.moe.natj.c.ann.Structure} annotation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.METHOD
})
public @interface StructureField {
    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 5 LINES
    /**
     * The order of the field.
     *
     * @return Order of the field
     */
    int order();

    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 5 LINES
    /**
     * Whether it a getter.
     *
     * @return True if getter, otherwise false
     */
    boolean isGetter();

    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 5 LINES
    /**
     * Size of the constant array typed field, 1 is equivalent to non-constant array type.
     *
     * @return Number of elements in the constant array field
     */
    int count() default 1;
}
