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

package org.moe.natjgen.cli;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Ignore;
import org.moe.natjgen.cli.executor.ThirdPartyFrameworkLinkExecutor;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import org.moe.natjgen.cli.executor.IExecutor;
import org.moe.natjgen.cli.executor.ThirdPartyLibraryLinkExecutor;
import org.moe.natjgen.cli.manager.PrebuildCocoaPodsManager;
import org.moe.natjgen.cli.utils.SpecObject;

@Ignore
public class CocoaPodsExecutorTest extends WrapNatJTest {

	private SpecObject frameworkSpec;
	private SpecObject libSpec;
	private File outputJar;
	private File libOutputJar;
	private String packageName;

	private String jSon = "{ \"name\": \"GLMap\", \"version\": \"0.5.6\", \"platforms\": { \"ios\": \"7.0\" },"
			+ " \"source\": { \"http\": \"https://getyourmap.com/account/download/GLMap-0.5.6.zip\" },"
			+ " \"resources\": [ \"DefaultStyle.bundle\", \"world.vm\" ],"
			+ " \"public_header_files\": \"GLMap.framework/Versions/A/Headers/*.h\","
			+ " \"exclude_files\": [ \"Examples\", \"GLMap.docset\" ],"
			+ " \"ios\": { \"vendored_frameworks\": \"GLMap.framework\","
			+ " \"frameworks\": [ \"Accelerate\", \"CoreLocation\" ]," + " \"libraries\": [ \"z\", \"c++\" ] } }";

	private String libJSON = "{ \"name\": \"FyberSDK\", \"version\": \"8.0.1\","
			+ " \"platforms\": { \"ios\": \"6.0\" }, "
			+ " \"source\": { \"http\": \"https://bintray.com/artifact/download/fyber/mobile-sdk/Fyber_iOS_SDK_v.8.0.1.zip\" },"
			+ " \"public_header_files\": \"Fyber_iOS_SDK_v.8.0.1/fyber-sdk-lib/*.h\","
			+ " \"vendored_libraries\": \"Fyber_iOS_SDK_v.8.0.1/fyber-sdk-lib/libFyberSDK-*.a\","
			+ " \"resources\": \"Fyber_iOS_SDK_v.8.0.1/fyber-sdk-lib/Resources/**/*.{png,json}\","
			+ " \"preserve_paths\": \"Fyber_iOS_SDK_v.8.0.1/fyber-sdk-lib/**\", "
			+ " \"frameworks\": [ \"CoreGraphics\", \"CoreTelephony\","
			+ " \"Foundation\", \"MediaPlayer\", \"QuartzCore\","
			+ " \"SystemConfiguration\", \"UIKit\", \"CoreLocation\" ],"
			+ " \"weak_frameworks\": [ \"AdSupport\", \"StoreKit\" ]," + " \"requires_arc\": true }";

	@Before
	public void initFramework() throws Exception {

		outputJar = new File(tmpDir.newFolder(), "test.jar");
		packageName = "org.moe.test";

		Gson gson = new Gson();
		frameworkSpec = gson.fromJson(jSon, SpecObject.class);

	}

	@Before
	public void initLibrary() throws Exception {

		libOutputJar = new File(tmpDir.newFolder(), "test.jar");
		packageName = "org.moe.test";

		Gson gson = new Gson();
		libSpec = gson.fromJson(libJSON, SpecObject.class);

	}

	@Test
	public void frameworkPodTest() throws Exception {
		String source = frameworkSpec.getSource().get("http");
		assertNotNull(source);
		PrebuildCocoaPodsManager manager = new PrebuildCocoaPodsManager();

		IExecutor executor = manager.processCocoapods(source, frameworkSpec, packageName, null, outputJar.getPath());
		assertNotNull(executor);
		assertTrue(executor instanceof ThirdPartyFrameworkLinkExecutor);

		executor.execute();
	}

	@Test
	public void libPodTest() throws Exception {
		String source = libSpec.getSource().get("http");
		assertNotNull(source);
		PrebuildCocoaPodsManager manager = new PrebuildCocoaPodsManager();

		IExecutor executor = manager.processCocoapods(source, libSpec, packageName, null, libOutputJar.getPath());
		assertNotNull(executor);
		assertTrue(executor instanceof ThirdPartyLibraryLinkExecutor);

		executor.execute();
	}
}
