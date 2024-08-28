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

import java.util.ArrayList;

public interface IParameterizedCallable extends ICallable {

    /**
     * Returns the argument list of the callable
     *
     * @return arguments
     */
    public ArrayList<CalleeArgument> getArguments();

    /**
     * Returns true if the last parameter is variadic
     *
     * @return true if the last parameter is variadic
     */
    public boolean isVariadic();

    /**
     * Returns the name of the variadic argument
     *
     * @return the name of the variadic argument
     */
    public String getVariadicName();
}
