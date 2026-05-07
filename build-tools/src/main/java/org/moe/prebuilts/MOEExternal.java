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

import java.io.File;
import java.util.List;

/**
 * Typed shape of the {@code external} configuration tree shared between composite
 * builds. Registered as an extension on the root project of each composite that
 * populates it (currently {@code moe-core} and {@code tools}). Subprojects read
 * via {@code rootProject.the<MOEExternal>()}.
 *
 * <p>Fields not relevant to a given composite stay null. The {@code moe-core}
 * composite populates {@link #svm} but not {@link #moeCore}; {@code tools} is
 * the inverse.
 */
public class MOEExternal {
    public String root;
    public String prebuilts;
    public String external;
    public String moe;

    public final SVM svm = new SVM();
    public final NatJ natJ = new NatJ();
    public final LLVM llvm = new LLVM();
    public final MOECore moeCore = new MOECore();

    public static class SVM {
        public String root;
        public String mx;
        public String graal;
        public String openjdk;
    }

    public static class NatJ {
        public String root;
        public File sources;
        public File jnipath;
        public List<File> ios;
        public List<File> mac;
        public List<File> win;
        public List<File> ndk;
        public List<File> linux;
    }

    public static class LLVM {
        public String source;
        public String root;
        public File jnipath;
        public File macos;
    }

    public static class MOECore {
        public String root;
        public final Out out = new Out();

        public static class Out {
            public File moeIosJar;
            public File moeIosJavadocJar;
            public File moeIosSourcesJar;
            public File moeIosJunitJar;
            public File moeIosJunitJavadocJar;
            public File moeIosJunitSourcesJar;
            public File moeCoreJar;
            public File moeCoreJavadocJar;
            public File moeCoreSourcesJar;
            public File jniConfigBaseJson;
            public File reflectionConfigBaseJson;
            public File proguardFullCfg;
            public File proguardCfg;
            public File iphoneosLibmoe;
            public File iphoneosLibmoeHeaders;
            public File iphonesimulatorLibmoe;
            public File iphonesimulatorLibmoeHeaders;
            public File iphoneosSvmjdwp;
            public File iphonesimulatorSvmjdwp;
        }
    }
}
