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

    public static void main(String[] args) {
        final Bindings bindings = new Bindings();
        bindings.setOutputDirectory("src/binding/google-gpg/java");

        FrameworkBinding frameworkBinding = new FrameworkBinding();
        frameworkBinding.setName("Google Play Games");
        frameworkBinding.setFramework("src/binding/google-gpg/sdk/ios/gpg.framework");
        frameworkBinding.setPackageBase("org.moe.binding");
        frameworkBinding.setImportCode("#import <gpg/GooglePlayGames.h>");
        bindings.add(frameworkBinding);

        final ConfigurationBuilder builder = new ConfigurationBuilder(bindings);
        try {
            System.out.println(builder.build());
        } catch (ValidationException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
