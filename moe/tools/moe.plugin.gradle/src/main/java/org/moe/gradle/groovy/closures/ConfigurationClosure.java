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

package org.moe.gradle.groovy.closures;

import groovy.lang.Closure;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

/**
 * Configuration closure helper class for working with Groovy closures.
 * @param <T> Type to configure
 */
public abstract class ConfigurationClosure<T> extends Closure<Void> {

    protected ConfigurationClosure(@NotNull Object owner) {
        super(Require.nonNull(owner));
    }

    public abstract void doCall(T object);
}
