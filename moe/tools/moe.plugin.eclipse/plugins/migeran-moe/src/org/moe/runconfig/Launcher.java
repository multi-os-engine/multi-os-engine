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

package org.moe.runconfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.IStreamListener;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamMonitor;
import org.eclipse.debug.core.model.IStreamsProxy;
import org.eclipse.jdt.launching.IVMConnector;
import org.eclipse.jdt.launching.JavaRuntime;
import org.moe.utils.logger.LoggerFactory;

public class Launcher implements IProcess {

	private static final Logger LOG = LoggerFactory.getLogger(Launcher.class);

	private Process mProcess;
	private ILaunch mLaunch;
	private final HashMap<String, String> attributes = new HashMap<String, String>();
	private StreamMonitor outputStreamMonitor;
	private StreamMonitor errorStreamMonitor;
	private boolean isDebug;
	private Map<String, String> vmArgs;
	private IProgressMonitor progressMonitor;

	public Launcher(ILaunch launch, Process process, Map<String, String> vmArgs, IProgressMonitor progressMonitor) {
		this.mLaunch = launch;
		this.mProcess = process;
		this.outputStreamMonitor = new StreamMonitor(mProcess.getInputStream());
		this.errorStreamMonitor = new StreamMonitor(mProcess.getErrorStream());
		this.isDebug = launch.getLaunchMode().equals(ILaunchManager.DEBUG_MODE);
		this.vmArgs = vmArgs;
		this.progressMonitor = progressMonitor;
	}

	@Override
	public <T> T getAdapter(Class<T> arg0) {
		return null;
	}

	@Override
	public boolean canTerminate() {
		return mProcess.isAlive();
	}

	@Override
	public boolean isTerminated() {
		if (!mProcess.isAlive()) {
			outputStreamMonitor.stop();
			errorStreamMonitor.stop();
		}
		return !mProcess.isAlive();
	}

	@Override
	public void terminate() throws DebugException {
		outputStreamMonitor.stop();
		errorStreamMonitor.stop();
		if (mProcess.isAlive()) {
			mProcess.destroy();
		}
		sendEvent(new DebugEvent(this, DebugEvent.TERMINATE));
	}

	@Override
	public String getAttribute(String arg0) {
		return attributes.get(arg0);
	}

	@Override
	public int getExitValue() throws DebugException {
		return 0;
	}

	@Override
	public String getLabel() {
		return getLaunch().getLaunchConfiguration().getName();
	}

	@Override
	public ILaunch getLaunch() {
		return mLaunch;
	}

	@Override
	public IStreamsProxy getStreamsProxy() {
		// TODO Auto-generated method stub
		return new IStreamsProxy() {

			@Override
			public IStreamMonitor getErrorStreamMonitor() {
				return errorStreamMonitor;
			}

			@Override
			public IStreamMonitor getOutputStreamMonitor() {
				return outputStreamMonitor;
			}

			@Override
			public void write(String arg0) throws IOException {

			}
		};
	}

	@Override
	public void setAttribute(String arg0, String arg1) {
		attributes.put(arg0, arg1);
	}

	private void sendEvent(DebugEvent event) {
		DebugPlugin manager = DebugPlugin.getDefault();
		if (manager != null) {
			manager.fireDebugEventSet(new DebugEvent[] {
					event
			});
		}
	}

	public void start() {
		mLaunch.addProcess(this);
		sendEvent(new DebugEvent(this, DebugEvent.CREATE));
		ProcessHandler processHandler = new ProcessHandler();
		processHandler.start();
		if (isDebug) {
			try {
				attachToVM();
			} catch (CoreException e) {
				LOG.error("Unable attach to VM", e);
			}
		}
	}

	private class StreamMonitor implements IStreamMonitor {

		private Vector<IStreamListener> listeners = new Vector<IStreamListener>();
		private InputStream mInputStream;
		private Object lock = new Object();
		private StringBuffer stringBuffer = new StringBuffer();
		private boolean stopped = false;

		public StreamMonitor(InputStream in) {
			this.mInputStream = in;

			new Thread(new Runnable() {

				byte buffer[] = new byte[1024];

				@Override
				public void run() {
					while (!stopped) {
						synchronized (lock) {
							try {
								while (mInputStream.available() > 0) {
									int size = mInputStream.read(buffer);
									String content = new String(buffer, 0, size, "UTF-8");
									stringBuffer.append(content);
									for (IStreamListener listener : listeners) {
										listener.streamAppended(content, StreamMonitor.this);
									}
								}
							} catch (IOException e) {
								break;
							}
						}

						try {
							Thread.sleep(10);
						} catch (InterruptedException ignored) {
						}
					}
				}
			}).start();
		}

		@Override
		public void addListener(IStreamListener arg0) {
			listeners.addElement(arg0);
		}

		@Override
		public String getContents() {
			String content = "";
			synchronized (lock) {
				content = stringBuffer.toString();
			}
			return content;
		}

		@Override
		public void removeListener(IStreamListener arg0) {
			listeners.remove(arg0);
		}

		public void stop() {
			this.stopped = true;
		}

	}

	private class ProcessHandler {

		private Thread worker;

		public ProcessHandler() {

			worker = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						int result = mProcess.waitFor();
						if (result != 0) {
						}
						try {
							terminate();
						} catch (DebugException e) {

						}
					} catch (InterruptedException e) {

					}

				}
			});
		}

		public void start() {
			worker.start();
		}
	}

	private void attachToVM() throws CoreException {
		IVMConnector connector = JavaRuntime.getVMConnector("org.eclipse.jdt.launching.socketAttachConnector");

		int timeout = 30;
		CoreException exception = null;
		while (timeout > 0 && !progressMonitor.isCanceled()) {
			try {
				connector.connect(vmArgs, progressMonitor, mLaunch);
				exception = null;
				break;
			} catch (CoreException e) {
				exception = e;
			}
			--timeout;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		if (exception != null) {
			throw new CoreException(exception.getStatus());
		}
	}

}
