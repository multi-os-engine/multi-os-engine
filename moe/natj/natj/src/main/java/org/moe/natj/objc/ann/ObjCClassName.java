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

import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark a class with this annotation to specify the name of the Objective-C class that NatJ will
 * generate.
 *
 * <p>
 * Without this annotation the Objective-C class name will be the same as the full name of the Java
 * class in case of non-binding classes, otherwise it will be the same as the simple name.
 */
@Runtime(ObjCRuntime.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.TYPE
})
public @interface ObjCClassName {
    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 5 LINES
    /**
     * The name of the Objective-C class.
     *
     * @return Objective-C class name
     */
    String value();
}
