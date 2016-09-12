/*
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
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.internal.junit.launcher.ITestKind;
import org.eclipse.jdt.internal.junit.launcher.TestKindRegistry;
import org.eclipse.jdt.junit.launcher.JUnitLaunchConfigurationDelegate;
import org.eclipse.jdt.launching.IVMRunner;
import org.moe.runconfig.ApplicationManager;
import org.moe.utils.logger.LoggerFactory;

@SuppressWarnings("restriction")
public class MOEJUnitLaunchConfigurationDelegate extends JUnitLaunchConfigurationDelegate {

	private static final Logger LOG = LoggerFactory.getLogger(MOEJUnitLaunchConfigurationDelegate.class);

	private ApplicationManager manager;

	public MOEJUnitLaunchConfigurationDelegate(ApplicationManager manager) {
		this.manager = manager;
	}

	@Override
	public IVMRunner getVMRunner(ILaunchConfiguration configuration, String mode) throws CoreException {
		MOEVMRunner vmRunner = new MOEVMRunner();
		vmRunner.setApplicationManager(manager);
		return vmRunner;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void collectExecutionArguments(ILaunchConfiguration configuration, List vmArguments,
			List programArguments) throws CoreException {

		super.collectExecutionArguments(configuration, vmArguments, programArguments);

		ITestKind testKind = TestKindRegistry.getDefault().getKind(TestKindRegistry.JUNIT4_TEST_KIND_ID);
		programArguments.add("-testpluginname");
		programArguments.add(testKind.getLoaderClassName());

		programArguments.add("-host");
		programArguments.add("localhost");
	}

	@Override
	public synchronized void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
			IProgressMonitor monitor) throws CoreException {
		setDefaultSourceLocator(launch, configuration);
		
		LOG.debug("Set test arguments");
		
		try {
			manager.setTestArguments(getTests(configuration, monitor, launch));
		} catch (IOException e) {
			LOG.error("Unable set test arguments", e);
		}

		LOG.debug("Start junit");

		super.launch(configuration, mode, launch, monitor);
	}
	
	private List<String> getTests(ILaunchConfiguration configuration, IProgressMonitor monitor, ILaunch launch) throws CoreException, IOException {
		List<String> testList = new ArrayList<String>();
		IMember[] testElements = evaluateTests(configuration, null);
		for (int i = 0; i < testElements.length; i++) {
			if (testElements[i] instanceof IType) {
				IType type = (IType) testElements[i];
				testList.add(type.getFullyQualifiedName());
			}
		}
		return testList;
	}

}
