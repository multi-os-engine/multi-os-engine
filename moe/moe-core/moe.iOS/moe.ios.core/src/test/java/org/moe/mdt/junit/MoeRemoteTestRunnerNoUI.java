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

package org.moe.mdt.junit;

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class MoeRemoteTestRunnerNoUI {

    private static void runTests(Class<?>[] testsClasses) {

    	final boolean runGCAfterTest = "true".equals(System.getProperty("moe.test.postgc", "false"));
        JUnitCore junit = new JUnitCore();
        junit.addListener(new RunListener() {
            /**
             * Called before any tests have been run.
             */
            public void testRunStarted(Description description) throws java.lang.Exception {
                for (Description child : description.getChildren()) {
                    defineTest(child);
                }
                sendMessage(MessageIds.TEST_RUN_START + ":" + description.testCount());
            }

            /**
             * Called internally for defining tests.
             */
            private void defineTest(Description description) {
                if (description.isTest()) {
                    sendMessage(MessageIds.TEST_DEFINE + ":" + description.getClassName() + "-"
                            + description.getMethodName());
                    return;
                }
                if (description.getChildren() == null || description.getChildren().size() == 0) {
                    return;
                }
                for (Description child : description.getChildren()) {
                    defineTest(child);
                }
            }

            /**
             *  Called when all tests have finished.
             */
            public void testRunFinished(Result result) throws java.lang.Exception {
                sendMessage(MessageIds.TEST_RUN_END + ":" + result.getRunTime());
            }

            /**
             *  Called when an atomic test is about to be started.
             */
            public void testStarted(Description description) throws java.lang.Exception {
                sendMessage(MessageIds.TEST_START + ":" + description.getClassName() + "-"
                        + description.getMethodName());
            }

            /**
             *  Called when an atomic test has finished, whether the test succeeds or fails.
             */
            public void testFinished(Description description) throws java.lang.Exception {
                sendMessage(MessageIds.TEST_END + ":" + description.getClassName() + "-"
                        + description.getMethodName());
                if (runGCAfterTest) {
                	Runtime.getRuntime().gc();
                }
            }

            /**
             *  Called when an atomic test fails.
             */
            public void testFailure(Failure failure) throws java.lang.Exception {
                sendMessage(MessageIds.TEST_FAILED + ":" + failure.getTestHeader() + ":"
                        + failure.getTrace());
            }

            /**
             * Called when a test will not be run, generally because a test method is
             * annotated with Ignore.
             */
            public void testIgnored(Description description) throws java.lang.Exception {
                sendMessage(MessageIds.TEST_IGNORED + ":" + description.getClassName() + "-"
                        + description.getMethodName());
            }
        });
        junit.run(testsClasses);
    }

    public class MessageIds {

        public static final String TEST_RUN_START = "%TESTC  ";

        public static final String TEST_DEFINE = "%TESTD  ";

        public static final String TEST_START = "%TESTS  ";

        public static final String TEST_END = "%TESTE  ";

        public static final String TEST_ERROR = "%ERROR  ";

        public static final String TEST_FAILED = "%FAILED ";

        public static final String TEST_IGNORED = "%IGNORED";

        public static final String TEST_RUN_END = "%RUNTIME";
    }

    private static void sendMessage(String message) {
        System.out.print("\n" + message + "\n");
        System.out.flush();
    }
    
    private static String[] args;

    public static void main(String[] args) {
        MoeRemoteTestRunnerNoUI.args = args;

        Runnable testRunner = new Runnable() {
        
        @Override
        public void run() {
            ArrayList<Class<?>> classList = new ArrayList<Class<?>>();
            for (String arg : args) {
                String[] subs = arg.split("[,]");
                for (String sub : subs) {
                    if (sub.length() == 0) {
                        continue;
                    }
                    Class<?> cls = null;
                    try {
                        cls = Class.forName(sub);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (cls != null) {
                        classList.add(cls);
                    }
                }
            }
            if (classList.size() == 0) {
                try {
                    ClassLoader classLoader = MoeRemoteTestRunnerNoUI.class.getClassLoader();
                    File classListFile = new File(classLoader.getResource("classlist.txt").getPath());
                    
                    BufferedReader reader = new BufferedReader(new FileReader(classListFile));
                    String line;
                    while ((line = reader.readLine()) != null) {

                        if (line.length() == 0) {
                            continue;
                        }
                        Class<?> cls = null;

                        try {
                            cls = Class.forName(line);
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        if (cls != null) {
                            classList.add(cls);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();                    
                }
            }
            if (classList.size() > 0) {
                Class<?>[] classArray = new Class<?>[classList.size()];
                runTests(classList.toArray(classArray));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
    };

        new Thread(testRunner).start();
    }

    /*
    private final Runnable testRunner = new Runnable() {
        
        @Override
        public void run() {
            ArrayList<Class<?>> classList = new ArrayList<Class<?>>();
            for (String arg : args) {
                String[] subs = arg.split("[,]");
                for (String sub : subs) {
                    if (sub.length() == 0) {
                        continue;
                    }
                    Class<?> cls = null;
                    try {
                        cls = Class.forName(sub);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (cls != null) {
                        classList.add(cls);
                    }
                }
            }
            if (classList.size() == 0) {
                ClassLoader classLoader = MoeRemoteTestRunnerNoUI.class.getClassLoader();
                File classListFile = new File(classLoader.getResource("classlist.txt").getPath());
                
                BufferedReader reader = new BufferedReader(classListFile);
                String line;
                while ((line = reader.readLine()) != null) {

                    if (line.length() == 0) {
                        continue;
                    }
                    Class<?> cls = null;

                    try {
                        cls = Class.forName(line);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (cls != null) {
                        classList.add(cls);
                    }
                }
            }
            if (classList.size() > 0) {
                Class<?>[] classArray = new Class<?>[classList.size()];
                runTests(classList.toArray(classArray));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
    };*/
}
