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

package org.moe.natj.cxx.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class or interface as one meeding to import a specific header file.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.TYPE
})
// Requires Java 8: @Repeatable(CxxHeaders.class)
public @interface CxxHeader {
    /**
     * Path of the header file.
     *
     * @return path of the header file
     */
    String[] value();

    /**
     * Include with quotes or angled brackets. Uses quotes by default.
     *
     * @return true for quotes, false for angled brackets
     */
    boolean useQuotes() default true;
}
