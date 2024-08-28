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

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerAllTest{
        public static void main (String[] args) {
                JUnitCore core = new JUnitCore();
                core.addListener(new TextListener(System.out));
                Result result = core.run(TestRunnerSuite.class);
                for (Failure failure : result.getFailures()) {
                        System.out.println(failure.toString());
                }
                System.out.println(result.wasSuccessful());
        }
}
