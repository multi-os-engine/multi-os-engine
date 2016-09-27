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

public class Tokenizer {

    public static class Token {
        public static final int Brace_open = '{';
        public static final int Brace_close = '}';
        public static final int Parentheses_open = '(';
        public static final int Parentheses_close = ')';
        public static final int Equal = '=';
        public static final int Comma = ',';
        public static final int Semicolon = ';';
        public static final int Value = 'v';

        public final char kind;
        public final String value;

        public Token(char kind) {
            this.kind = kind;
            this.value = null;
        }

        public Token(String value) {
            this.kind = Value;
            this.value = value;
        }

        @Override
        public String toString() {
            switch (kind) {
            case Brace_open:
                return "{";
            case Brace_close:
                return "}";
            case Parentheses_open:
                return "(";
            case Parentheses_close:
                return ")";
            case Equal:
                return "=";
            case Comma:
                return ",";
            case Semicolon:
                return ";";
            case Value:
                return value;
            }
            return super.toString();
        }
    }

    private final Parser p;

    public Tokenizer(Parser p) {
        this.p = p;
    }

    private Token peekedToken;

    public Token peek() throws NextStepException {
        if (peekedToken == null) {
            peekedToken = next();
        }
        return peekedToken;
    }

    public Token next() throws NextStepException {
        if (peekedToken != null) {
            Token t = peekedToken;
            peekedToken = null;
            return t;
        }

        char c = p.read();
        if (c == 0) {
            return null;
        } else if (isStructure(c)) {
            return new Token(c);
        } else if (c == '"') {
            StringBuilder b = new StringBuilder();

            boolean isesc = false;
            c = p.read();

            while (true) {
                if (!isesc && c == '"') {
                    break;
                }

                if (isesc) {
                    switch (c) {
                    case 'n':
                        b.append('\n');
                        isesc = false;
                        break;
                    case 'r':
                        b.append('\r');
                        isesc = false;
                        break;
                    case 't':
                        b.append('\t');
                        isesc = false;
                        break;
                    case 'f':
                        b.append('\f');
                        isesc = false;
                        break;
                    case 'b':
                        b.append('\b');
                        isesc = false;
                        break;
                    case '"':
                        b.append('\"');
                        isesc = false;
                        break;
                    case '\\':
                        b.append('\\');
                        isesc = false;
                        break;

                    default:
                        throw new NextStepException("unrecognized escaped char: " + c);
                    }
                } else {
                    if (c == '\\') {
                        isesc = true;
                    } else {
                        b.append(c);
                    }
                }

                c = p.read();
            }

            return new Token(b.toString());
        } else {
            StringBuilder b = new StringBuilder();
            while (!isStructure(c) && c != 0) {
                b.append(c);
                c = p.read();
            }
            p.reverse();
            return new Token(b.toString());
        }
    }

    private boolean isStructure(char c) {
        switch (c) {
        case Token.Brace_open:
        case Token.Brace_close:
        case Token.Parentheses_open:
        case Token.Parentheses_close:
        case Token.Equal:
        case Token.Comma:
        case Token.Semicolon:
            return true;

        default:
            return false;
        }
    }

}
