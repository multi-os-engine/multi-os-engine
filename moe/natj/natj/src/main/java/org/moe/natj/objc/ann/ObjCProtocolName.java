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
 * Mark an interface with this to tell NatJ to handle the interface as an Objective-C protocol.
 *
 * <p>
 * Implementing an interface with this annotation will affect how NatJ creates inherited or proxy
 * classes. The runtime created classes that created from Java classes implementing interfaces with
 * the annotation will conform the Objective-C protocols with the names given by the annotation. If
 * one creates an Objective-C binding, inherited or proxy class, then interfaces without this
 * annotation will be ignored.
 *
 * <p>
 * If a native protocol gets removed by the compiler's optimization, then the protocol will be
 * ignored.
 */
@Runtime(ObjCRuntime.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.TYPE
})
public @interface ObjCProtocolName {
    // CHECKSTYLE IGNORE JavadocMethodCheck FOR NEXT 5 LINES
    /**
     * The name of the Objective-C protocol.
     *
     * @return Objective-C protocol name
     */
    String value();
}
