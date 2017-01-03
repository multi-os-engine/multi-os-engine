/*
 * Copyright 2000-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moe.idea.runconfig.configuration.test;

import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessOutputTypes;
import com.intellij.execution.testframework.sm.ServiceMessageBuilder;
import com.intellij.openapi.util.Comparing;
import org.moe.common.junit.MOEITestRunListener;
import org.moe.common.junit.MOETestIdentifier;
import org.moe.idea.runconfig.MOERunProfileState;

import java.util.Map;

public class MOETestListener implements MOEITestRunListener {

    private final MOERunProfileState myRunningState;
    private long myTestStartingTime;
    private long myTestSuiteStartingTime;
    private String myTestClassName = null;
    private ProcessHandler myProcessHandler;

  public MOETestListener(MOERunProfileState runningState) {
    myRunningState = runningState;
  }

  public ProcessHandler getProcessHandler() {
    if (myProcessHandler == null) {
      myProcessHandler = myRunningState.getProcessHandler();
    }
    return myProcessHandler;
  }

  @Override
  public void testRunStopped(long elapsedTime) {
    ProcessHandler handler = getProcessHandler();
    StringBuilder message = new StringBuilder("\n");
    message.append("Test running stopped");
    message.append("\n");
    handler.notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
    handler.destroyProcess();
  }

  @Override
  public void testRunEnded(long elapsedTime, Map<String, String> runMetrics) {
    if (myTestClassName != null) {
      testSuiteFinished();
    }
    final ProcessHandler handler = getProcessHandler();
    StringBuilder message = new StringBuilder("\n");
    message.append("Finish");
    message.append("\n");
    handler.notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
    handler.destroyProcess();
  }

  @Override
  public void testDefined(MOETestIdentifier test) {

  }

  @Override
  public void testRunStarted(String runName, int testCount) {
    StringBuilder message = new StringBuilder("\n");
    message.append("Test running started");
    message.append("\n");
    getProcessHandler().notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);

    final ServiceMessageBuilder builder = new ServiceMessageBuilder("enteredTheMatrix");
    message = new StringBuilder("\n");
    message.append(builder.toString());
    message.append("\n");
    getProcessHandler().notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
  }

  @Override
  public void testStarted(MOETestIdentifier test) {
    if (!Comparing.equal(test.getClassName(), myTestClassName)) {
      if (myTestClassName != null) {
        testSuiteFinished();
      }
      myTestClassName = test.getClassName();
      testSuiteStarted();
    }
    ServiceMessageBuilder builder = new ServiceMessageBuilder("testStarted");
    builder.addAttribute("name", test.getTestName());
    builder.addAttribute("locationHint", MOETestLocationProvider.PROTOCOL_ID + "://" + myRunningState.getConfiguration().moduleName() + ':' + test.getClassName() + '.' + test.getTestName() + "()");
    StringBuilder message = new StringBuilder("\n");
    message.append(builder.toString());
    message.append("\n");
    getProcessHandler().notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
    myTestStartingTime = System.currentTimeMillis();
  }

  private void testSuiteStarted() {
    myTestSuiteStartingTime = System.currentTimeMillis();
    ServiceMessageBuilder builder = new ServiceMessageBuilder("testSuiteStarted");
    builder.addAttribute("name", myTestClassName);
    builder.addAttribute("locationHint", MOETestLocationProvider.PROTOCOL_ID + "://" + myRunningState.getConfiguration().moduleName() + ':' + myTestClassName);
    StringBuilder message = new StringBuilder("\n");
    message.append(builder.toString());
    message.append("\n");
    getProcessHandler().notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
  }

  private void testSuiteFinished() {
    ServiceMessageBuilder builder = new ServiceMessageBuilder("testSuiteFinished");
    builder.addAttribute("name", myTestClassName);
    builder.addAttribute("duration", Long.toString(System.currentTimeMillis() - myTestSuiteStartingTime));
    StringBuilder message = new StringBuilder("\n");
    message.append(builder.toString());
    message.append("\n");
    getProcessHandler().notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
    myTestClassName = null;
  }

  @Override
  public void testFailed(MOETestIdentifier test, String stackTrace) {
    ServiceMessageBuilder builder = new ServiceMessageBuilder("testFailed");
    builder.addAttribute("name", test.getTestName());
    builder.addAttribute("message", "");
    builder.addAttribute("details", stackTrace);
    builder.addAttribute("error", "true");
    StringBuilder message = new StringBuilder("\n");
    message.append(builder.toString());
    message.append("\n");
    getProcessHandler().notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
  }

  @Override
  public void testAssumptionFailure(MOETestIdentifier test, String trace) {
    ServiceMessageBuilder builder = ServiceMessageBuilder.testFailed(test.getTestName());
    builder.addAttribute("message", "Assumption Failed");
    builder.addAttribute("details", trace);
    builder.addAttribute("error", "true");
    StringBuilder message = new StringBuilder("\n");
    message.append(builder.toString());
    message.append("\n");
    getProcessHandler().notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
  }

  @Override
  public void testIgnored(MOETestIdentifier test) {
    ServiceMessageBuilder builder = ServiceMessageBuilder.testIgnored(test.getTestName());
    StringBuilder message = new StringBuilder("\n");
    message.append(builder.toString());
    message.append("\n");
    getProcessHandler().notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
  }

  @Override
  public void testEnded(MOETestIdentifier test, Map<String, String> testMetrics) {
    ServiceMessageBuilder builder = new ServiceMessageBuilder("testFinished");
    builder.addAttribute("name", test.getTestName());
    builder.addAttribute("duration", Long.toString(System.currentTimeMillis() - myTestStartingTime));
    StringBuilder message = new StringBuilder("\n");
    message.append(builder.toString());
    message.append("\n");
    getProcessHandler().notifyTextAvailable(message.toString(), ProcessOutputTypes.STDOUT);
  }

  @Override
  public void testRunFailed(String errorMessage) {
    ProcessHandler handler = getProcessHandler();
    StringBuilder message = new StringBuilder("\n");
    message.append("Test running failed: ");
    message.append(errorMessage);
    message.append("\n");
    handler.notifyTextAvailable(message.toString(), ProcessOutputTypes.STDERR);
    handler.destroyProcess();
  }
}
