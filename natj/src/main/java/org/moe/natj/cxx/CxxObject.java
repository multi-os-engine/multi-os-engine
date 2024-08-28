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

package org.moe.natj.cxx;

/**
 * Base class for every C++ composite type.
 */
public interface CxxObject {

    /**
     * Call to the destructor.
     */
    void _cxx_rt_delete();

    /**
     * Returns the underlying C++ peer to this object.
     *
     * @return peer of this object
     */
    long _cxx_rt_peer();

    /**
     * Tells whether or not this object is a const interface or not.
     *
     * @return true if this object is a const interface otherwise false
     */
    boolean cxxIsConstInterface();

    /**
     * Tells whether or not this object is a direct interface or not.
     *
     * @return true if this object is a direct interface otherwise false
     */
    boolean cxxIsDirectInterface();

    /**
     * Tells whether or not this object is identical to another.
     *
     * @param other other object
     * @return true when identical otherwise false
     */
    boolean cxxIsIdenticalTo(Object other);

    /**
     * Returns a direct interface to the specified class.
     *
     * @param cls class
     * @return direct interface
     */
    <T extends CxxObject> T cxxGetDirectInterface(Class<T> cls);

    /**
     * Returns a direct interface to the specified class without checking compatibility.
     *
     * @param cls class
     * @return direct interface
     */
    <T extends CxxObject> T cxxGetUnsafeDirectInterface(Class<T> cls);

    /**
     * Returns an implementing interface to the specified class without checking compatibility.
     *
     * @param cls class
     * @return implementing interface
     */
    <T extends CxxObject> T cxxGetUnsafeImplInterface(Class<T> cls);
}
