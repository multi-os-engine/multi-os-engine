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

package org.moe.protocol.gdbremote;

import java.util.Map;

public interface IStopReplyListener {

	/**
	 * The process received a signal.
	 *
	 * @param signal
	 *            signal code
	 * @param info
	 *            related info or null if not available
	 */
	public void processSignaled(byte signal, Map<String, String> info);

	/**
	 * The process exited.
	 *
	 * @param status
	 *            exit status
	 */
	public void processExited(byte status);

	/**
	 * The process terminated.
	 *
	 * @param status
	 *            termination status
	 */
	public void processTerminated(byte status);

	/**
	 * The process write to the output stream.
	 *
	 * @param output
	 *            new content
	 */
	public void processOutput(String output);

}
