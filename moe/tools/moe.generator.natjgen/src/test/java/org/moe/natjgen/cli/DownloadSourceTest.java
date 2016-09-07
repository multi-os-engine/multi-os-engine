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

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import org.junit.Ignore;
import org.moe.natjgen.cli.exceptions.UnsupportedTypeException;

import org.junit.Test;

import org.moe.natjgen.cli.utils.GrabUtils;

@Ignore
public class DownloadSourceTest extends WrapNatJTest {
	
	@Test
	public void downloadFromRemote() throws FileAlreadyExistsException, FileNotFoundException, URISyntaxException, IOException, UnsupportedTypeException {
		URI link = new URI("https://github.com/NatJPods/Specs/archive/master.zip");
		File output = new File(tmpDir.newFolder(),"tempFile");
		HashMap<URI,File> map = new HashMap<URI,File>();
		map.put(link, output);
		GrabUtils.download(map);
		assertTrue(output.exists());
	}
	
	@Test
	public void downloadFromRemoteDirectly() throws FileAlreadyExistsException, FileNotFoundException, URISyntaxException, IOException, UnsupportedTypeException {
		URI link = new URI("https://github.com/NatJPods/Specs/archive/master.zip");
		File output = new File(tmpDir.newFolder(),"tempFile");
		GrabUtils.downloadFileFromRemote(link, output);
		assertTrue(output.exists());
	}
	
	@Test
	public void downloadFromGit() throws FileAlreadyExistsException, FileNotFoundException, URISyntaxException, IOException, UnsupportedTypeException {
		String git = "https://github.com/NatJPods/Bindings.git";
		String tag = "Example";
		String path = "Bindings/Google/1.3.2";
		URI link = new URI(git + "#" + tag + ":" + path);
		File output = new File(tmpDir.newFolder(),"tempFolder");
		HashMap<URI,File> map = new HashMap<URI,File>();
		map.put(link, output);
		GrabUtils.download(map);
		assertTrue(output.isDirectory());
	}
	
	@Test
	public void downloadFromGitDirectly() throws FileAlreadyExistsException, FileNotFoundException, URISyntaxException, IOException, UnsupportedTypeException {
		String git = "https://github.com/NatJPods/Bindings.git";
		String tag = "Example";
		Path path = Paths.get("Bindings/Google/1.3.2");
		URI link = new URI(git);
		File output = new File(tmpDir.newFolder(),"tempFolder");
		GrabUtils.downloadFileFromGit(link,tag,path,output);
		assertTrue(output.isDirectory());
	}
	
	@Test
	public void downloadFromLocal() throws FileAlreadyExistsException, FileNotFoundException, URISyntaxException, IOException, UnsupportedTypeException {
		File input = new File(tmpDir.newFolder(),"tempFolder");
		input.mkdir();
		File output = new File(tmpDir.newFolder(),"tempFolder");
		HashMap<URI,File> map = new HashMap<URI,File>();
		map.put(input.toURI(), output);
		GrabUtils.download(map);
		assertTrue(output.isDirectory());
	}
	
}
