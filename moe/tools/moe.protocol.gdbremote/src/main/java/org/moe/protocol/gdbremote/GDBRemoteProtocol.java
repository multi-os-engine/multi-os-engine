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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public final class GDBRemoteProtocol {

	/**
	 * Communication object representing the server.
	 */
	private final Communication comm;

	/**
	 * Thread ID matching any thread.
	 */
	public static final int THREAD_ID_ANY = 0;

	/**
	 * Thread ID matching all threads.
	 */
	public static final int THREAD_ID_ALL = -1;

	/**
	 * Continue action for vCont.
	 */
	public static final byte VCONT_ACTION_CONTINUE = 'c';

	/**
	 * Step action for vCont.
	 */
	public static final byte VCONT_ACTION_STEP = 's';

	/**
	 * Stop action for vCont.
	 */
	public static final byte VCONT_ACTION_STOP = 't';

	/**
	 * i386 launch arch.
	 */
	public static final String LAUNCH_ARCH_I386 = "i386";

	/**
	 * x86_64 launch arch.
	 */
	public static final String LAUNCH_ARCH_X86_64 = "x86_64";

	/**
	 * arm64 launch arch.
	 */
	public static final String LAUNCH_ARCH_ARM64 = "arm64";

	/**
	 * arm launch arch.
	 */
	public static final String LAUNCH_ARCH_ARM = "arm";

	/**
	 * Create a new {@link GDBRemoteProtocol} with input and output streams.
	 *
	 * @param is
	 *            input stream
	 * @param os
	 *            output stream
	 * @throws IOException
	 */
	public GDBRemoteProtocol(InputStream is, OutputStream os) throws IOException {
		comm = new Communication(is, os);
	}

	/**
	 * Add a new {@link IStopReplyListener} listener.
	 *
	 * @param listener
	 *            listener to add
	 */
	public void addListener(IStopReplyListener listener) {
		comm.addListener(listener);
	}

	/**
	 * Remove the specified {@link IStopReplyListener}.
	 *
	 * @param listener
	 *            listener to remove
	 * @return <code>true</code> if the listener was found and removed
	 */
	public boolean removeListener(IStopReplyListener listener) {
		return comm.removeListener(listener);
	}

	/**
	 * Get response where possible responds are <code>OK</code> and
	 * <code>ENN</code>, where <code>NN</code> is a two-digit hex encoded error
	 * code. <code>OK</code> response returns <code>0</code>, <code>ENN</code>
	 * response returns the error code, otherwise <code>-1</code> is returned.
	 *
	 * @return error code
	 * @throws IOException
	 */
	private int _get_OK_ENN_Response() throws IOException {
		String resp = comm.nextResponse();
		if ("OK".equals(resp)) {
			return 0;
		} else if (resp != null && resp.matches("E[0-9a-fA-F][0-9a-fA-F]")) {
			return Integer.parseInt(resp.substring(1), 16);
		}
		return -1;
	}

	/**
	 * Get response where possible responds are <code>OK</code> and "".
	 * <code>true</code> is returned if the response is <code>OK</code>.
	 *
	 * @return <code>true</code> on success
	 * @throws IOException
	 */
	private boolean _get_OK_NOTSUPPORTED_Response() throws IOException {
		String resp = comm.nextResponse();
		if ("OK".equals(resp)) {
			return true;
		} else {
			// The response should be ""
			return false;
		}
	}

	/**
	 * Send an Arguments packet to the server.
	 *
	 * @param args
	 *            arguments in the packet
	 * @return error code, <code>0</code> on success
	 * @throws IOException
	 */
	public int send_Arguments(String... args) throws IOException {
		// Send packet
		PacketOutputStream pos = comm.newPacket();
		pos.write('A');

		if (args != null && args.length != 0) {
			int arg_idx = 0;
			String last_arg = args[args.length - 1];
			for (String arg : args) {
				pos.writeInteger(arg.length() * 2);
				pos.write(',');
				pos.writeInteger(arg_idx++);
				pos.write(',');
				pos.writeHexASCII(arg);
				if (arg != last_arg) {
					pos.write(',');
				}
			}
		}
		if (!pos.send()) {
			return -1;
		}

		// Process response
		return _get_OK_ENN_Response();
	}

	/**
	 * Send a vCont? packet to the server.
	 *
	 * @return respond or null if failed or not supported
	 * @throws IOException
	 */
	public List<String> send_vCont_Q() throws IOException {
		// Send packet
		if (!comm.sendASCIIPacket("vCont?")) {
			return null;
		}

		// Process response
		String resp = comm.nextResponse();
		if (resp.length() == 0) {
			return null;
		}
		List<String> list = Util.convertToList(resp, ";");
		list.remove("vCont");
		return list;
	}

	/**
	 * Send a vCont packet to the server.
	 *
	 * @param action
	 *            action to execute
	 * @param thread_id
	 *            thread ID to execute on
	 * @return <code>true</code> on success
	 * @throws IOException
	 */
	public boolean send_vCont(byte action, int thread_id) throws IOException {
		// Send packet
		PacketOutputStream pos = comm.newPacket();
		pos.writeASCII("vCont;");
		pos.write(action & 0xFF);
		pos.write(':');
		pos.writeInteger(thread_id);
		return pos.send();
	}

	/**
	 * Send a vAttach packet to the server.
	 *
	 * @param pid
	 *            process ID to attach to
	 * @return <code>true</code> on success
	 * @throws IOException
	 */
	public boolean send_vAttach(int pid) throws IOException {
		// Send packet
		PacketOutputStream pos = comm.newPacket();
		pos.writeASCII("vAttach;");
		pos.writeHexInteger(pid);
		return pos.send();
	}

	/**
	 * Send a H (Set thread) packet to the server.
	 *
	 * @param action
	 *            action to execute
	 * @param thread_id
	 *            thread ID to execute on
	 * @return error code, <code>0</code> on success
	 * @throws IOException
	 */
	public int send_H(byte action, int thread_id) throws IOException {
		// Send packet
		PacketOutputStream pos = comm.newPacket();
		pos.writeASCII("H");
		pos.write(action);
		pos.writeInteger(thread_id);
		if (!pos.send()) {
			return -1;
		}

		// Process response
		return _get_OK_ENN_Response();
	}

	/**
	 * Send a Continue packet to the server.
	 *
	 * @return <code>true</code> on success
	 * @throws IOException
	 */
	public boolean send_c() throws IOException {
		// Send packet
		return comm.sendASCIIPacket("c");
	}

	/**
	 * Send a Kill packet to the server.
	 *
	 * @return <code>true</code> on success
	 * @throws IOException
	 */
	public boolean send_k() throws IOException {
		// Send packet
		return comm.sendASCIIPacket("k");
	}

	/**
	 * Send an Interrupt (ctrl+C) packet to the server.
	 *
	 * @return <code>true</code> on success
	 * @throws IOException
	 */
	public boolean send_ctrl_C() throws IOException {
		// Send packet
		return comm.sendASCIIPacket("\u0003");
	}

	/**
	 * Send a Detach packet to the server.
	 *
	 * @return <code>0</code> on success, otherwise error code
	 * @throws IOException
	 */
	public int send_D() throws IOException {
		// Send packet
		if (!comm.sendASCIIPacket("D")) {
			return -1;
		}

		// Process response
		return _get_OK_ENN_Response();
	}

	/**
	 * Send a QStartNoAckMode packet to the server.
	 *
	 * @return <code>true</code> on success
	 * @throws IOException
	 */
	public boolean set_StartNoAckMode() throws IOException {
		// Send packet
		if (!comm.sendASCIIPacket("QStartNoAckMode")) {
			return false;
		}

		// Process response
		boolean noackmode = _get_OK_NOTSUPPORTED_Response();
		comm.setNoAckMode(noackmode);
		return noackmode;
	}

	/**
	 * Send an EnvironmentHexEncoded packet to the server.
	 *
	 * @param variable
	 *            variable name
	 * @param value
	 *            variable value
	 * @return <code>true</code> on success
	 * @throws IOException
	 */
	public boolean set_EnvironmentHexEncoded(String variable, String value) throws IOException {
		// Send packet
		PacketOutputStream pos = comm.newPacket();
		pos.writeASCII("QEnvironmentHexEncoded:");

		pos.writeHexASCII(variable);
		pos.writeHexASCII("=");
		pos.writeHexASCII(value);
		if (!pos.send()) {
			return false;
		}

		// Process response
		return _get_OK_NOTSUPPORTED_Response();
	}

	/**
	 * Send an LaunchArch packet to the server.
	 *
	 * @param arch
	 *            architecture name
	 * @return error code, 0 on success
	 * @throws IOException
	 */
	public int set_LaunchArch(String arch) throws IOException {
		// Send packet
		PacketOutputStream pos = comm.newPacket();
		pos.writeASCII("QLaunchArch:");

		pos.writeASCII(arch);
		if (!pos.send()) {
			return -1;
		}

		// Process response
		return _get_OK_ENN_Response();
	}

	/**
	 * Send a HostInfo query to the server.
	 *
	 * @return map containing host info or null on failure
	 * @throws IOException
	 */
	public Map<String, String> query_HostInfo() throws IOException {
		// Send packet
		if (!comm.sendASCIIPacket("qHostInfo")) {
			return null;
		}

		// Process response
		String resp = comm.nextResponse();
		return Util.converToMap(resp, ";", ":");
	}

	/**
	 * Send a LaunchSuccess query to the server.
	 *
	 * @return error code, <code>0</code> on success
	 * @throws IOException
	 */
	public int query_LaunchSuccess() throws IOException {
		// Send packet
		if (!comm.sendASCIIPacket("qLaunchSuccess")) {
			return -1;
		}

		// Process response
		return _get_OK_ENN_Response();
	}

	/**
	 * Send a ProcessInfo query to the server.
	 *
	 * @return map containing process info or null on failure
	 * @throws IOException
	 */
	public Map<String, String> query_ProcessInfo() throws IOException {
		// Send packet
		if (!comm.sendASCIIPacket("qProcessInfo")) {
			return null;
		}

		// Process response
		String resp = comm.nextResponse();
		return Util.converToMap(resp, ";", ":");
	}

	/**
	 * Send a RegisterInfo query to the server.
	 *
	 * @param register_id
	 *            register ID
	 * @return map containing register info or null on failure
	 * @throws IOException
	 */
	public Map<String, String> query_RegisterInfo(int register_id)
			throws IOException {
		// Send packet
		if (!comm.sendASCIIPacket("qRegisterInfo"
				+ Integer.toHexString(register_id))) {
			return null;
		}

		// Process response
		String resp = comm.nextResponse();
		if (resp.length() == 3 && resp.startsWith("E")) {
			return null;
		}
		return Util.converToMap(resp, ";", ":");
	}

	/**
	 * Close the protocol.
	 */
	public void close() {
		comm.close();
	}

}
