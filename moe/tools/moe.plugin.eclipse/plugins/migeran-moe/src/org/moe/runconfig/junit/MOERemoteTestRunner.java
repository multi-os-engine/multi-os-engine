/*
 * Copyright (C) 2009 The Android Open Source Project
 * Copyright (C) 2016 Migeran
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe.runconfig.junit;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.internal.junit.runner.IVisitsTestTrees;
import org.eclipse.jdt.internal.junit.runner.MessageIds;
import org.eclipse.jdt.internal.junit.runner.RemoteTestRunner;
import org.eclipse.jdt.internal.junit.runner.TestExecution;
import org.eclipse.jdt.internal.junit.runner.TestReferenceFailure;
import org.moe.junit.MOEITestRunListener;
import org.moe.junit.MOETestIdentifier;
import org.moe.runconfig.ApplicationManager;
import org.moe.runconfig.Launcher;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("restriction")
public class MOERemoteTestRunner extends RemoteTestRunner implements MOEITestRunListener {

	private static final Logger LOG = LoggerFactory.getLogger(MOERemoteTestRunner.class);

	private ApplicationManager manager;
	private TestExecution execution;
	private String fTestPluginName;
	private ClassLoader fLoaderClassLoader;
	private Map<String, TestClass> testTree;

	public MOERemoteTestRunner() {
		super();
	}

	@Override
	public void runTests(String[] testClassNames, String testName, TestExecution testExecution) {
		this.execution = testExecution;
		this.testTree = new HashMap<String, TestClass>();
		try {
			Launcher launcher = manager.launchApplication(this);

			while (!launcher.isTerminated()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException ignored) {
				}
			}
		} catch (CoreException e) {
			LOG.error("Unable launch application", e);
		}

		//execution.stop();
	}

	public void runTests(String[] arguments, ApplicationManager manager) {
		this.manager = manager;
		readPluginArgs(arguments);
		defaultInit(arguments);
		run();
	}

	@Override
	public void testAssumptionFailure(MOETestIdentifier identifier, String arg1) {

	}

	@Override
	public void testEnded(MOETestIdentifier identifier, Map<String, String> arg1) {
		execution.getListener().notifyTestEnded(new TestMethod(identifier.getClassName(), identifier.getTestName()));
	}

	@Override
	public void testFailed(MOETestIdentifier identifier, String trace) {
		TestReferenceFailure failure = new TestReferenceFailure(
				new TestMethod(identifier.getClassName(), identifier.getTestName()), MessageIds.TEST_FAILED, trace,
				null);
		execution.getListener().notifyTestFailed(failure);
	}

	@Override
	public void testIgnored(MOETestIdentifier identifier) {
		TestMethod method = new TestMethod(identifier.getClassName(), identifier.getTestName());
		method.setIgnored(identifier.isIgnored());
		execution.getListener().notifyTestEnded(method);
	}

	@Override
	public void testRunEnded(long elapsedTime, Map<String, String> arg1) {
		notifyTestRunEnded(elapsedTime);
	}

	@Override
	public void testRunFailed(String out) {

	}

	@Override
	public void testRunStarted(String param, int count) {
		notifyTestRunStarted(count);
		sendTrees(MOERemoteTestRunner.this);
	}

	@Override
	public void testRunStopped(long elapsedTime) {
		notifyTestRunStopped(elapsedTime);
	}

	@Override
	public void testStarted(MOETestIdentifier identifier) {
		TestMethod method = new TestMethod(identifier.getClassName(), identifier.getTestName());
		method.setIgnored(identifier.isIgnored());
		execution.getListener().notifyTestStarted(method);
	}

	@Override
	public void testDefined(MOETestIdentifier identifier) {
		String className = identifier.getClassName();
		TestClass testClass = testTree.get(className);
		if (testClass == null) {
			testClass = new TestClass(className);
			testTree.put(className, testClass);
		}
		testClass.push(new TestMethod(className, identifier.getTestName()));
	}

	@Override
	protected Class<?> loadTestLoaderClass(String className) throws ClassNotFoundException {
		return fLoaderClassLoader.loadClass(className);
	}

	public ClassLoader getClassLoader(final String bundleId) {
		Bundle bundle = Platform.getBundle(bundleId);
		if (bundle == null) {
			throw new IllegalArgumentException("Bundle \"" + bundleId + "\" not found.");
		}
		return new BundleClassLoader(bundle);

	}

	protected ClassLoader getTestClassLoader() {
		return manager.getProject().getClass().getClassLoader();
	}

	public void readPluginArgs(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (isFlag(args, i, "-testpluginname"))
				fTestPluginName = args[i + 1];
			if (isFlag(args, i, "-loaderpluginname"))
				fLoaderClassLoader = getClassLoader(args[i + 1]);
		}

		if (fTestPluginName == null)
			throw new IllegalArgumentException("Parameter -testpluginnname not specified.");

		if (fLoaderClassLoader == null)
			fLoaderClassLoader = getClass().getClassLoader();
	}

	private boolean isFlag(String[] args, int i, final String wantedFlag) {
		String lowerCase = args[i].toLowerCase();
		return lowerCase.equals(wantedFlag) && i < args.length - 1;
	}

	private class BundleClassLoader extends ClassLoader {
		private Bundle bundle;

		public BundleClassLoader(Bundle target) {
			this.bundle = target;
		}

		protected Class<?> findClass(String name) throws ClassNotFoundException {
			return bundle.loadClass(name);
		}

		protected URL findResource(String name) {
			return bundle.getResource(name);
		}

		protected Enumeration<URL> findResources(String name) throws IOException {
			return bundle.getResources(name);
		}
	}

	@Override
	protected void stop() {
		if (execution != null) {
			execution.stop();
		}
	}

	private void sendTrees(IVisitsTestTrees visitsTestTrees) {
		for (TestClass testClass : testTree.values()) {
			testClass.sendTree(visitsTestTrees);
		}
	}

	private void notifyTestRunEnded(long elapsedTime) {
		sendMessage(MessageIds.TEST_RUN_END + elapsedTime);
		flush();
	}

}
