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

package org.moe.natj.general;

import org.moe.natj.general.NatJ.JavaObjectConstructionInfo;
import org.moe.natj.general.NatJ.NativeObjectConstructionInfo;

/**
 * Mapper interface.
 *
 * <p>
 * Implement this interface to add support for handling new native types.
 * Adding {@code MappedReturn(MyMapper.class)} or {@code Mapped(MyMapper.class)} to
 * a native method or one of its argument, respectively, will tell NatJ to use the mapper
 * implementation whenever it has to convert the return or argument value between Java and native
 * side. When converting to Java NatJ will use the implementation's
 * {@code toJava(long, JavaObjectConstructionInfo)} method to convert native value to a Java one.
 * Reasonably, the {@code toNative(Object, NativeObjectConstructionInfo)} method will be used for
 * the other direction. {@link JavaObjectConstructionInfo#data} and
 * {@link NativeObjectConstructionInfo#data} fields are not used by NatJ and free to use for
 * anything.
 */
public interface Mapper {
    /**
     * Has to convert a Java value to native value and return its pointer.
     *
     * @param instance The Java value to convert
     * @param info Contains every information needed for conversion
     * @return The native value
     */
    public long toNative(Object instance, NativeObjectConstructionInfo info);

    /**
     * Has to convert a native value to Java value and return it.
     *
     * @param instance The pointer pointing to the native value
     * @param info Contains every information needed for conversion
     * @return The Java value
     */
    public Object toJava(long instance, JavaObjectConstructionInfo info);
}
