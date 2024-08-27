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

/**
 * Type resolver plugin interface.
 */
public interface ITypeResolverPlugin {

    /**
     * Setup the type resolver plugin. Register mapped types, headers, etc.
     *
     * @param config Plugin configuration
     */
    void setup(TypeResolverPluginConfiguration config);

    /**
     * Check whether a specific type is supported or not.
     *
     * @param internalName Internal name of the type
     * @return True if this resolver supports the specified type
     */
    boolean match(String internalName);

    /**
     * Returns native (C++) code for retrieving type id (int) for the specified peer.
     *
     * @param nativeObject Variable name for the peer
     * @return Native code
     */
    String nativeTypeIDResolver(String nativeObject);

    /**
     * Base name of the implementing class.
     *
     * @return Internal class name
     */
    String getImplementingClass();
}
