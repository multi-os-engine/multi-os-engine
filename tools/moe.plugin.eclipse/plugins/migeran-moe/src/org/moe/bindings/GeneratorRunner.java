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

package org.moe.bindings;

import java.io.File;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.IKillListener;
import org.moe.common.exec.ExecRunnerBase.ExecRunnerListener;
import org.moe.common.exec.GradleExec;
import org.moe.runconfig.MOEProjectBuildConsole;
import org.moe.utils.MessageFactory;

public class GeneratorRunner {
	
	private static final String ID = "org.moe.bindings.GeneratorRunner";
	
	private IProject project;
	private File configurationFile;
    private boolean test;
    private boolean keep;
    String title;

	public GeneratorRunner(IProject project) {
		this.project = project;
	}
	
	public void generateBinding(File confFile, boolean test, boolean keep) {
        this.configurationFile = confFile;
        this.test = test;
        this.keep = keep;
        title = test ? "Test Binding" : "Generate Binding";
        run();
    }
	
	private void run() {
		Job job = new Job("Generate Binding") {
	        @Override
	        protected IStatus run(IProgressMonitor m) {
	        	
	        	final IProgressMonitor monitor = m == null ? new NullProgressMonitor() : m;
	        	
	        	try {
	        		MessageConsole console = MOEProjectBuildConsole.getLaunchConsole();
	    			console.clearConsole();
	    			final MessageConsoleStream consoleStream = console.newMessageStream();
	    			
	    			monitor.beginTask(title, 10);
	    			
	    			File projectFile = project.getLocation().toFile();
	    			
	    			monitor.worked(2);
	    			
	    			StringBuilder errorBuilder = new StringBuilder();
	    			
	    			File workspace = new File(projectFile.getParent(), project.getName());
	    			
	    			GradleExec exec = new GradleExec(workspace);

	                exec.getArguments().add("moeNatJGen");
	                exec.getArguments().add("-Draw-binding-output");
	                exec.getArguments().add("-Dmoe.binding.conf=" + configurationFile.getPath());
	                if (test) {
	                    exec.getArguments().add("-Dmoe.natjgen.testrun=true");
	                }
	                if (keep) {
	                    exec.getArguments().add("-Dmoe.keep.natjgen");
	                }

	                ExecRunner runner = exec.getRunner();
	                runner.getBuilder().directory(workspace);
	                
	    			runner.setListener(new ExecRunnerListener() {
						
						@Override
						public void stdout(String line) {
							consoleStream.println(line);
						}
						
						@Override
						public void stderr(String line) {
							consoleStream.println(line);
							errorBuilder.append(line);
							errorBuilder.append("\n");
						}
					});
	    			
	    			runner.run(new IKillListener() {
						
						@Override
						public boolean needsKill() {
							return monitor.isCanceled();
						}
					});
	        		
		        	final String errorMessage = errorBuilder.toString();
	                
	                // Refresh project
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	                
	                monitor.done();
	                
	                final String title = test ? "Binding Test" : "Generate Binding";
	                
	                Display.getDefault().syncExec(new Runnable() {
	        		    public void run() {
	        		    	if (errorMessage == null || errorMessage.isEmpty()) {
	        		    		MessageFactory.showInfoDialog(title, "Successful");
	    	                } else {
	    	                	MessageFactory.showErrorDialog(errorMessage);
	    	                }
	        		    }
	        		});
	        	} catch (Exception e) {
	        		return new Status(Status.ERROR, ID, "Unable run generator", e);
	        	}
	         
	        	return Status.OK_STATUS;
	        }
		};
		job.setPriority(Job.LONG);
		job.setRule(project);
		job.schedule();
	}
}
