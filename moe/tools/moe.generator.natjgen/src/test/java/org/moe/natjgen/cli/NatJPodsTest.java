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

package org.moe.natjgen.cli;

import com.google.gson.Gson;
import org.junit.Test;
import org.moe.natjgen.cli.utils.JSpecObject;
import org.moe.natjgen.cli.utils.SpecObject;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class NatJPodsTest extends WrapNatJTest {

    @Test
    public void simpleNotNullTestFor_getJSpecObject() {
        String jSon = "{" + "\"name\": \"OCMock\"," + "\"version\": \"3.2.1\"," + "\"source\": {"
                + "\"git\": \"https://github.com/erikdoe/ocmock.git\"," + "\"tag\": \"v3.2.1\"" + "}" + "}";
        Gson gson = new Gson();

        SpecObject spec = gson.fromJson(jSon, SpecObject.class);
        String jpodSpecRepo = "https://github.com/NatJPods/Specs.git#Specs/";

        JSpecObject jspec = null;
        try {
            jspec = JSpecObject.getJSpecObject(spec, jpodSpecRepo);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertNotNull(jspec);
    }

    @Test
    public void simpleNullTestFor_getJSpecObject_withUnbindedLibrary() {
        String jSon = "{" + "\"name\": \"GoogleAnalytics\"," + "\"version\": \"3.14.0\"," + "\"source\": {"
                + "\"http\": \"https://www.gstatic.com/cpdc/69fd9fe84a8fea60-GoogleAnalytics-3.14.0.tar.gz\"" + "}"
                + "}";
        Gson gson = new Gson();

        SpecObject spec = gson.fromJson(jSon, SpecObject.class);
        String jpodSpecRepo = "https://github.com/NatJPods/Specs.git#Specs/";

        JSpecObject jspec = null;
        try {
            jspec = JSpecObject.getJSpecObject(spec, jpodSpecRepo);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertNull(jspec);
    }

    @Test(expected = RuntimeException.class)
    public void wrongJPodSpecRepoTest() {
        String jSon = "{" + "\"name\": \"OCMock\"," + "\"version\": \"3.2.1\"," + "\"source\": {"
                + "\"git\": \"https://github.com/erikdoe/ocmock.git\"," + "\"tag\": \"v3.2.1\"" + "}" + "}";
        Gson gson = new Gson();

        SpecObject spec = gson.fromJson(jSon, SpecObject.class);
        String jpodSpecRepo = "https://github.com/NatJPods/WrongSpecsRepo.git#Specs/";

        try {
            JSpecObject.getJSpecObject(spec, jpodSpecRepo);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void syntaxErrorJPodSpecRepoTest() {
        String jSon = "{" + "\"name\": \"OCMock\"," + "\"version\": \"3.2.1\"," + "\"source\": {"
                + "\"git\": \"https://github.com/erikdoe/ocmock.git\"," + "\"tag\": \"v3.2.1\"" + "}" + "}";
        Gson gson = new Gson();

        SpecObject spec = gson.fromJson(jSon, SpecObject.class);
        String jpodSpecRepo = "sdfghjkl;poiuytrewqzxcvbnm,;lkjhgf";

        try {
            JSpecObject.getJSpecObject(spec, jpodSpecRepo);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
