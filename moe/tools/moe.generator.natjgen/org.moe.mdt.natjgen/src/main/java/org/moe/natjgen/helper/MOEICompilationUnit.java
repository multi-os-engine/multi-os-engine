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

package org.moe.natjgen.helper;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MOEICompilationUnit {

	/**
	 * Logger for this class
	 */
	private static final Logger LOG = LoggerFactory.getLogger(MOEICompilationUnit.class);

	private String source;

	private String location;

	public void save() {
		Writer out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(location), "UTF-8"));
		} catch (FileNotFoundException e) {
			LOG.error("Unable save" + location, e);
		} catch (UnsupportedEncodingException e) {
			LOG.error("Unable save" + location, e);
		}
		try {
			out.write(source);
		} catch (IOException e) {
			LOG.error("Unable save java file", e);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				LOG.error("Unable close Writer", e);
			}
		}
	}

	public void setSource(String newSource) {
		this.source = newSource;
	}

	public String getSource() {
		return source;
	}

	public void setLocation(String path) {
		this.location = path;
	}

}
