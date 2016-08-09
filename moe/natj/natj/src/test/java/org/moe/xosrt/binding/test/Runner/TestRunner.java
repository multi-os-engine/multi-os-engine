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

package org.moe.xosrt.binding.test.Runner;

import org.junit.runner.JUnitCore;

public class TestRunner{

    //Test Suite.
    private static final String testSuite [] = {
        "org.moe.xosrt.binding.test.constructTest.ConstructTest",
        "org.moe.xosrt.binding.test.constructTest.ConstructTest"
        };

    public static void main(String args[]){
        JUnitCore junit = new JUnitCore();
        int i;
        for (i = 0; i < testSuite.length; i++){
            System.out.println("testSuite.length = " + testSuite.length);
            junit.main(testSuite[i]);
        }
        System.out.println("i =" + i);
    }
}
