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

import java.io.File;
import java.io.IOException;

public abstract class NextStep {

	public static Dictionary<Value, NextStep> read(File file) throws NextStepException {
		Tokenizer t = null;
		try {
			Parser p = new Parser(file);
			t = new Tokenizer(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (t == null) {
			return null;
		}

		Token token = t.peek();
		if (token != null && token.kind == Token.Brace_open) {
			return Dictionary.create(t);
		}

		return null;
	}

	static NextStep get(Tokenizer t) throws NextStepException {
		Token token = t.peek();
		if (token == null) {
			throw new NextStepException("early end of tokenstream");
		}
		switch (token.kind) {
		case Token.Brace_open:
			return Dictionary.create(t);
		case Token.Parentheses_open:
			return Array.create(t);
		case Token.Value:
			return Value.create(t);

		default:
			return null;
		}
	}

	protected void ident(StringBuilder b, int depth) {
		for (int i = 0; i < depth; ++i) {
			b.append('\t');
		}
	}

	@Override
	public String toString() {
		return print(0);
	}

	public abstract String print(int depth);

	public abstract String printInline(int depth);

}
