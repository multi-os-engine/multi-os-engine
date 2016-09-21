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

package org.moe.natjgen;

public interface ICallable {

    /**
     * Returns the java method name the callable will be bound to
     *
     * @return java method name
     */
    public String getJavaName();

    /**
     * Returns the callable's type
     *
     * @return type
     */
    public Type getType();

    /**
     * Return the callable's default runtime's fully qualified name
     *
     * @return default runtime
     */
    public String getDefaultRuntime();

}
