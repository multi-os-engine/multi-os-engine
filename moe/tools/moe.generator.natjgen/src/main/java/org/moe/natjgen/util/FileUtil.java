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


package org.moe.natjgen.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtil {

	private static final Logger LOG = LoggerFactory.getLogger(FileUtil.class);

	public static boolean writeResource(File path, String name, String extension, String contents) {
		File f = new File(path, name + "." + extension);
		File p = f.getParentFile();
		if (!p.exists() && !p.mkdirs()) {
			LOG.error("Failed to create parent directory " + p.getAbsolutePath());
			return false;
		}
		PrintWriter out = null;
		try {
			out = new PrintWriter(f.getAbsolutePath());
			out.print(contents);
		} catch (FileNotFoundException e) {
			LOG.error("Failed to write file " + f.getAbsolutePath());
			return false;
		} finally {
			if (out != null) {
				out.close();
			}
		}
		return true;
	}

}
