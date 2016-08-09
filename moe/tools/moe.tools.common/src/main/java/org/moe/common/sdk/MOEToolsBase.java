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

package org.moe.common.sdk;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MOEToolsBase extends MOEComponent {

    public static final String ROOT_DIR = "tools";

    private static final String RETROLAMBDA = "retrolambda.jar";
    protected static final String DX = "dx";
    protected static final String DX_JAR = "dx.jar";
    private static final String JAVA_8_SUPPORT_JAR = "java8support.jar";
    private static final String PROGUARD = "proguard.jar";
    private static final String PROGUARD_CFG = "proguard.cfg";
    private static final String PROGUARD_FULL_CFG = "proguard-full.cfg";
    private static final String UI_TRANSFORMER_JAR = "uiTransformer.jar";
    private static final String UI_TRANSFORMER_RES = "UITransformer-res";

    protected String dxExec;

    private File uiTransformerJar;
    private File uiTransformerRes;

    boolean fullTrim = false;

    MOEToolsBase(String sdkPath) {
        super(sdkPath);

        uiTransformerJar = new File(sdkPath + File.separator + getRootDir(), UI_TRANSFORMER_JAR);
        uiTransformerRes = new File(sdkPath + File.separator + getRootDir(), UI_TRANSFORMER_RES);
    }

    @Override
    public String getRootDir() {
        return ROOT_DIR;
    }

    @Override
    public List<String> getListOfEntries() {
        return new ArrayList<String>() {
            {
                add(RETROLAMBDA);
                add(JAVA_8_SUPPORT_JAR);
                add(PROGUARD);
                add(PROGUARD_CFG);
                add(PROGUARD_FULL_CFG);
                add(MOESDK.IOS_DEVICE_JAR);
            }
        };
    }

    public boolean getFullTrim() {
        return fullTrim;
    }

    public File retrolambdaJar() {
        return entries().get(RETROLAMBDA);
    }

    public File dxExec() {
        return entries().get(dxExec);
    }

    File java8SupportJar() {
        return entries().get(JAVA_8_SUPPORT_JAR);
    }

    public File proGuardJar() {
        return entries().get(PROGUARD);
    }

    public File proGuardCfg() {
        return entries().get(PROGUARD_CFG);
    }

    public File proGuardFullCfg() {
        return entries().get(PROGUARD_FULL_CFG);
    }

    public File uiTransformerJar() {
        return uiTransformerJar;
    }

    public File uiTransformerRes() {
        return uiTransformerRes;
    }

    public File preloadedClasses() {
        return null;
    }

    public File dex2OatExec() {
        return null;
    }
}
