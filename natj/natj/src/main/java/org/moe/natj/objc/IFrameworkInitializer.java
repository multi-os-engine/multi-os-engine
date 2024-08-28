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

package org.moe.natj.objc;

import java.util.Map;
import java.util.Set;

/**
 * Framework initializer interface.
 *
 * <p>
 * Implement this interface with a class and mark that class with a
 * {@link org.moe.natj.general.ann.RegisterOnStartup}.
 * With this, framework initialization can
 * be done even before the main entry have been entered.
 */
public interface IFrameworkInitializer {

    /**
     * Should return a list of Java packages.
     *
     * <p>
     * If NatJ could not resolve a type based on its name prefix, then it will fallback to these
     * packages.
     *
     * @return List of Java packages
     */
    public Set<String> getExternalPackages();

    /**
     * Should return a map containing the preferable Java packages and Objective-C prefixes.
     *
     * @return Map of preferred Java package-Objective-C prefix pairs
     */
    public Map<String, Set<String>> getExternalPackagesAndPrefixes();

}
