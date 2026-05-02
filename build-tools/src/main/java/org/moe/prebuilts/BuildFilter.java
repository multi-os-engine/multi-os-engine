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

package org.moe.prebuilts;

/**
 * Per-subproject filter that lets developers narrow native builds to a single
 * config / sdk / archs triple. Populated by {@code moe.core.native/build.gradle}'s
 * subprojects block from {@code moe.buildfilter.*} root-project properties; read
 * by every XcodeBuild.registerTask call site.
 */
public class BuildFilter {
    public final Ios ios = new Ios();
    public final MacOs macos = new MacOs();

    public static class Ios {
        public String config;
        public String sdk;
        public String archs;
    }

    public static class MacOs {
        public String config;
    }
}
