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

package org.moe.natj.processor.cxx;

import java.util.*;

/**
 * Type resolver configuration.
 */
public class TypeResolverPluginConfiguration {
    /**
     * Header files used by the resolver.
     */
    public final Set<String> headers = new HashSet<>();

    /**
     * User header files used by the resolver.
     */
    public final Set<String> userHeaders = new HashSet<>();

    /**
     * Type map.
     */
    private final Map<Integer, String> typeMap = new HashMap<>();

    /**
     * Registers a type identifier.
     *
     * @param id           Type identifier
     * @param internalName Internal type name
     */
    public void registerType(int id, String internalName) {
        typeMap.put(id, internalName);
    }

    /**
     * Returns the type map of this plugin.
     *
     * @return Type map
     */
    public Map<Integer, String> getTypeMap() {
        return Collections.unmodifiableMap(typeMap);
    }
}
