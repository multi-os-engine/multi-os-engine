/*
Copyright (C) 2016 Migeran

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

package org.moe.tools.natjgen.util;

/**
 * Utility class for calculating values.
 */
public class Compute {

    /**
     * Computer interface.
     *
     * @param <T> Result type of the computation
     */
    public interface Computer<T> {
        /**
         * Compute method.
         *
         * @return Computed value
         */
        T compute();
    }

    /**
     * Compute method. This method uses a Computer to compute a value.
     *
     * @param computer Computer
     * @param <T>      Result type of the computation
     * @return Computed value
     */
    public static <T> T compute(Computer<T> computer) {
        return computer.compute();
    }
}
