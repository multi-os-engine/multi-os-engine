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

package org.moe.natj.c.ann;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.ann.Runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark a native method as variadic with this annotation to tell NatJ
 * that how the arguments should be handled.
 */
@Runtime(CRuntime.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.METHOD
})
public @interface Variadic {
    /** Auto select Unbox or Box policy based on the actual runtime. */
    public static final byte Runtime = 0;

    /** Unbox boxed primitive values. */
    public static final byte Unbox = 1;

    /** Pass boxed primitive values without unboxing. */
    public static final byte Box = 2;

    /** Specifies the policy of handling primitive arguments. */
    byte unboxPolicy() default Runtime;
}
