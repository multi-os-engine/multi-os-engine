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

package org.moe.natj.general.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Contents are marked with this annotation,
 * when the generator is not sure how to bind the method.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({
        ElementType.METHOD
})
public @interface UncertainReturn {
    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 6 LINES
    /**
     * Annotation argument that specifies the list of candidate types and
     * the type the binding fell back to.
     *
     * @return The chosen type and the list of candidate types.
     */
    String value();
}
