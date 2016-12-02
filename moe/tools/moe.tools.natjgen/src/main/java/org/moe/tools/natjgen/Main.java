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

package org.moe.tools.natjgen;

public class Main {

    public static Bindings getGooglePlayGamesSample() {
        final Bindings bindings = new Bindings();
        bindings.setOutputDirectory("src/binding/google-gpg/java");

        FrameworkBinding gpg = new FrameworkBinding();
        gpg.setName("Google Play Games");
        gpg.setFrameworkPath("src/binding/google-gpg/sdk/ios/gpg.framework");
        gpg.setPackageBase("org.moe.binding");
        gpg.setImportCode("#import <gpg/GooglePlayGames.h>");
        bindings.add(gpg);

        return bindings;
    }

    public static Bindings getClangSample() {
        final Bindings bindings = new Bindings();
        bindings.setOutputDirectory("src/main/java");
        bindings.setPlatform(Bindings.PLATFORM_OSX);

        HeaderBinding clang = new HeaderBinding();
        clang.setName("clang");
        clang.setHeaderPath("../../../external/llvm/tools/clang/include");
        clang.setImportCode("#import \"clang-c/Index.h\"\n" + "#import \"clang-c/Documentation.h\"\n");
        clang.setPackageBase("org.clang");
        clang.setExplicitLibrary("clang");
        bindings.add(clang);

        return bindings;
    }

    public static void main(String[] args) {
        final ConfigurationBuilder builder = new ConfigurationBuilder(getClangSample());
        try {
            System.out.println(builder.build());
        } catch (ValidationException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
