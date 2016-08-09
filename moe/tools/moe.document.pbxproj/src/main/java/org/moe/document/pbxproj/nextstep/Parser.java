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

package org.moe.document.pbxproj.nextstep;

import java.io.*;
import java.nio.charset.Charset;

public class Parser {

	private char buffer[];
	private int loc = 0;

	public Parser(File nextstepfile) throws IOException {
		FileInputStream fis = new FileInputStream(nextstepfile);
		try {
			InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
			StringBuilder fileData = new StringBuilder(1000);
			BufferedReader reader = new BufferedReader(isr);
	
			char[] buf = new char[10];
			int numRead;
			while ((numRead = reader.read(buf)) != -1) {
				String readData = String.valueOf(buf, 0, numRead);
				fileData.append(readData);
				buf = new char[1024];
			}
	
			reader.close();
	
			buffer = fileData.toString().toCharArray();
		} finally {
			fis.close();
		}
	}

	public char read() {
		return getNextChar();
	}

	boolean inStringMode = false;

	private char getNextChar() {
		if (inStringMode) {
			return getNextCharInString();
		} else {
			return getNextCharRaw();
		}
	}

	private char getNextCharInString() {
		char c = next();
		if (c == '"' && buffer[loc - 2] != '\\') {
			inStringMode = false;
		}
		return c;
	}

	private char getNextCharRaw() {
		char c;
		do {
			c = next();
		} while (Character.isWhitespace(c));

		if (c == '/') {
			c = next();
			if (c == '/' && (loc == 2 || lookback(2) == '\r' || lookback(2) == '\n')) {
				skipSingleLineComment();
				return getNextChar();
			} else if (c == '*') {
				skipMultiLineComment();
				return getNextChar();
			} else {
				reverse();
				return '/';
			}
		} else if (c == '"') {
			inStringMode = true;
			return c;
		} else {
			return c;
		}
	}

	private void skipSingleLineComment() {
		char c = next();
		while (c != '\n' && c != '\r') {
			c = next();
		}

		if (c == '\r' && peek() == '\n') {
			next();
		}
	}

	private void skipMultiLineComment() {
		char c = next();
		while (c != '*') {
			c = next();
			if (c == '*') {
				c = next();
				if (c == '/') {
					break;
				}
			}
		}
	}

	private char next() {
		if (loc + 1 >= buffer.length) {
			return 0;
		}
		return buffer[loc++];
	}

	private char lookback(int rel) {
		return buffer[loc - 1 - rel];
	}

	private char peek() {
		if (loc + 1 >= buffer.length) {
			return 0;
		}
		return buffer[loc + 1];
	}

	public void reverse() {
		--loc;
	}
}
