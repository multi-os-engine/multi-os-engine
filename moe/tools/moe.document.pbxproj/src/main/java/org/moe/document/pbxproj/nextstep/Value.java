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

import org.moe.document.pbxproj.nextstep.Tokenizer.Token;

public class Value extends NextStep {

	public String value = "";

	static Value create(Tokenizer t) throws NextStepException {
		Token token = t.next();

		if (token != null) {
			if (token.kind != Token.Value) {
				throw new NextStepException("illegal state");
			}

			return new Value(token.value);
		}

		throw new NextStepException("early end of tokenstream");
	}

	public Value() {

	}

	public Value(String value) {
		if (value == null) {
			throw new IllegalArgumentException();
		}

		this.value = value;
	}

	public String getComment() {
		return null;
	}

	@Override
	public int hashCode() {
		if (value == null) {
			return 0;
		}
		return value.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof Value)) {
			return false;
		}

		return value.equals(((Value) obj).value);
	}

	@Override
	public String print(int depth) {
		return printInline(depth);
	}

	@Override
	public String printInline(int depth) {
		String comment = getComment();
		if (comment != null) {
			return normalize(value) + " /* " + comment + " */";
		}
		return normalize(value);
	}

	private String normalize(String value) {
		if (value == null || value.length() == 0) {
			return "\"\"";
		}
		if (value.matches("[\\w\\./]*")) {
			return value;
		}

		StringBuilder b = new StringBuilder(value.length() + 2);
		b.append("\"");
		int idx = 0;
		char c = value.charAt(idx);
		while (true) {
			idx++;
			switch (c) {
			case '\n':
				b.append("\\n");
				break;
			case '\r':
				b.append("\\r");
				break;
			case '\t':
				b.append("\\t");
				break;
			case '\f':
				b.append("\\f");
				break;
			case '\b':
				b.append("\\b");
				break;
			case '\"':
				b.append("\\\"");
				break;
			case '\\':
				b.append("\\\\");
				break;

			default:
				b.append(c);
				break;
			}
			if (idx >= value.length()) {
				break;
			}
			c = value.charAt(idx);
		}
		b.append("\"");
		return b.toString();
	}

}
