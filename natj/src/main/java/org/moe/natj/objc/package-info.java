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

/**
 * This package features Objective-C support.
 *
 * <p>
 * Works without any extra addition or modification with the iOS/OS X library.
 * For additional frameworks or libraries one has to add the library to the
 * {@link org.moe.natj.objc.ObjCRuntime} with
 * {@link org.moe.natj.objc.ObjCRuntime#addExternalPackage(String)} and
 * {@link org.moe.natj.objc.ObjCRuntime#addExternalPackagesForPrefix
 * (String,java.util.Set)} methods.
 * The first one will store the given package name (like "mylib.subpackagename") in the
 * runtime as an external package name. External package names used when the runtime can not
 * resolve an Objective-C class name with any iOS/OS X class. The second method will store the
 * given prefix and the respective package names and the runtime will use that information when
 * resolving Objective-C class names in the following manner: when resolving the runtime will try
 * to fit the prefixes on the class name. If there is a prefix match then the runtime will use the
 * respective package names registered in the runtime for the prefix. If there are no success with
 * resolving the class name, then the runtime will try to resolve the class name by the external
 * package names. If there are still no match, then the runtime will try to resolve it with the
 * Objective-C class parent and so on.
 */

package org.moe.natj.objc;
