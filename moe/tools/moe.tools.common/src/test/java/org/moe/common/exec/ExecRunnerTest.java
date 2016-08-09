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

package org.moe.common.exec;

import junit.framework.TestCase;

public class ExecRunnerTest extends TestCase {

    public void testCanAddArguments() {
        String argument = "-help";

        SimpleExec exec = SimpleExec.getExec("javac");

        exec.getArguments().add(argument);

        assertFalse(exec.getArguments().isEmpty());

        assertEquals(exec.getArguments().get(0), argument);
    }

    public void testCanRun() {
        SimpleExec exec = SimpleExec.getExec("javac");

        exec.getArguments().add("-help");

        String output = "";
        try {
            output = ExecOutputCollector.collect(exec);
        } catch (Exception e) {
            System.err.println(e);
            assertTrue(false);
        }

//        assertTrue(output.indexOf("Usage") == 0);
    }
}
