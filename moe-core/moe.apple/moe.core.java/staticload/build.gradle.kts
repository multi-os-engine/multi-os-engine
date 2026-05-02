/*
 * Copyright 2016 Migeran
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.gradle.internal.jvm.Jvm
import java.net.URLClassLoader
import javax.tools.ToolProvider

plugins {
    id("org.moe.java-conventions")
}

val currentJvm = Jvm.current()
if (Integer.parseInt(currentJvm.javaVersion!!.majorVersion) <= 8) {
    dependencies {
        "compile"(files(
            (ToolProvider.getSystemToolClassLoader() as URLClassLoader).urLs
                .find { it.toString().endsWith("tools.jar") }
        ))
    }
}
