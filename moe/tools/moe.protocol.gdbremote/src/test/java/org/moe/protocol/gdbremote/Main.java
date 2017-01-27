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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.net.Socket;
import java.util.Map;

@Ignore
public class Main {

	static String testPath = null;

    private boolean TEST_setupCompleted;
    private boolean TEST_set_StartNoAckMode;
    private boolean TEST_query_HostInfo;
    private boolean TEST_send_vCont_Q;
    private boolean TEST_set_LaunchArch;
    private boolean TEST_send_Arguments;
    private boolean TEST_query_LaunchSuccess;
    private boolean TEST_send_vCont;
    private boolean TEST_send_ctrl_C__1;
    private boolean TEST_send_ctrl_C__2;
    private boolean TEST_send_k;
    private boolean TEST_protocolClosed;

    @Before
	public void setup() throws IOException {
        Assert.assertNotNull(testPath, "testPath must be set before running the test");

		// Create connection
		System.out.println("Creating socket to localhost:35524");
		Socket s = new Socket("localhost", 35524);

		// Create Protocol
		System.out.println("Creating GDB Remote Protocol");
		GDBRemoteProtocol p = new GDBRemoteProtocol(s.getInputStream(),
				s.getOutputStream());

		p.addListener(new IStopReplyListener() {

			@Override
			public void processTerminated(byte status) {
				System.out.println("<<<Process Terminated>>> " + status);
			}

			@Override
			public void processSignaled(byte signal, Map<String, String> infos) {
				System.out.println("<<<Process Signaled>>> " + signal + " " + infos);
			}

			@Override
			public void processOutput(String output) {
				System.out.println("<<<Output>>> " + output);
			}

			@Override
			public void processExited(byte status) {
				System.out.println("<<<Process Exited>>> " + status);
			}
		});
		TEST_setupCompleted = true;

        try{
    		// Start no ack mode
    		System.out.println("Started no ack mode: " + p.set_StartNoAckMode());
            TEST_set_StartNoAckMode = true;

    		// Get host info
    		System.out.println("Host info: " + p.query_HostInfo());
            TEST_query_HostInfo = true;

    		// Get vCont support
    		System.out.println("vCont support: " + p.send_vCont_Q());
            TEST_send_vCont_Q = true;

    		// Get vCont support
    		System.out.println("Set launch arch: " + (p.set_LaunchArch(GDBRemoteProtocol.LAUNCH_ARCH_ARM) == 0));
            TEST_set_LaunchArch = true;

    		// Launch app
    		System.out.println("Launching app: " + testPath);
    		System.out.println(p.send_Arguments(testPath, "-args", "none"));
            TEST_send_Arguments = true;

    		// Get success
    		while (p.query_LaunchSuccess() != null) {
    			sleep(1);
    		}
    		System.out.println("Launch success");
            TEST_query_LaunchSuccess = true;

    		// Continue app
    		System.out.println("Continuing app: "
    				+ p.send_vCont(GDBRemoteProtocol.VCONT_ACTION_CONTINUE,
    						GDBRemoteProtocol.THREAD_ID_ANY));
            TEST_send_vCont = true;
    		sleep(5);

    		// Interrupt app for 2 secs
    		System.out.println("Interrupted app: " + p.send_ctrl_C());
            TEST_send_ctrl_C__1 = true;
    		sleep(2);
    		System.out.println("Continuing app: "
    				+ p.send_vCont(GDBRemoteProtocol.VCONT_ACTION_CONTINUE,
    						GDBRemoteProtocol.THREAD_ID_ANY));
            TEST_send_vCont = true;
    		sleep(5);

    		// Terminate app
    		System.out.println("Interrupted app: " + p.send_ctrl_C());
            TEST_send_ctrl_C__2 = true;
    		System.out.println("Killing app with k: " + p.send_k());
            TEST_send_k = true;
    		sleep(2);
        } catch (IOException e){
            // Close protocol
            p.close();
            s.close();
            TEST_protocolClosed = true;
            throw e;
        }

		// Close protocol
		p.close();
        s.close();
        TEST_protocolClosed = true;
	}

	private static void sleep(int secs) {
		try {
			Thread.sleep(secs * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

    @Test
    public void test_setupCompleted() {
        Assert.assertTrue(TEST_setupCompleted);
    }

    @Test
    public void test_set_StartNoAckMode() {
        Assert.assertTrue(TEST_set_StartNoAckMode);
    }

    @Test
    public void test_query_HostInfo() {
        Assert.assertTrue(TEST_query_HostInfo);
    }

    @Test
    public void test_send_vCont_Q() {
        Assert.assertTrue(TEST_send_vCont_Q);
    }

    @Test
    public void test_set_LaunchArch() {
        Assert.assertTrue(TEST_set_LaunchArch);
    }

    @Test
    public void test_send_Arguments() {
        Assert.assertTrue(TEST_send_Arguments);
    }

    @Test
    public void test_query_LaunchSuccess() {
        Assert.assertTrue(TEST_query_LaunchSuccess);
    }

    @Test
    public void test_send_vCont() {
        Assert.assertTrue(TEST_send_vCont);
    }

    @Test
    public void test_send_ctrl_C__1() {
        Assert.assertTrue(TEST_send_ctrl_C__1);
    }

    @Test
    public void test_send_ctrl_C__2() {
        Assert.assertTrue(TEST_send_ctrl_C__2);
    }

    @Test
    public void test_send_k() {
        Assert.assertTrue(TEST_send_k);
    }

    @Test
    public void test_protocolClosed() {
        Assert.assertTrue(TEST_protocolClosed);
    }
}
