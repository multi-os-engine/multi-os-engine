/*
Copyright (C) 2016 Migeran

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

package org.moe.common.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility class for JLS.
 */
public class JavaUtil {
    /**
     * Set of Java keywords (https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-Keyword), boolean
     * literals and the null literal.
     */
    private static final Set<String> KEYWORDS_BOOLLITERALS_NULLLITERAL;

    static {
        KEYWORDS_BOOLLITERALS_NULLLITERAL = Collections.unmodifiableSet(new HashSet<String>(
                Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "if", "package",
                        "synchronized", "boolean", "do", "goto", "private", "this", "break", "double", "implements",
                        "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum",
                        "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final",
                        "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const",
                        "float", "native", "super", "while", "true", "false", "null")));
    }

    /**
     * Tells whether or not the specified String is a valid Java package name or not.
     *
     * @param value String to validate
     * @return true iff specified string is a valid package name
     */
    public static boolean isValidJavaPackage(String value) {
        // Spec:
        // https://docs.oracle.com/javase/specs/jls/se8/html/jls-6.html#jls-PackageName
        // https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-IdentifierChars
        if (value == null) {
            throw new NullPointerException();
        }
        final String[] components = value.split("\\.");
        for (String component : components) {
            final int length = component.length();
            if (length == 0) return false;
            for (int offset = 0; offset < length; ) {
                final int codepoint = component.codePointAt(offset);
                if (offset == 0) {
                    if (!Character.isJavaIdentifierStart(codepoint)) return false;
                } else {
                    if (!Character.isJavaIdentifierPart(codepoint)) return false;
                }
                offset += Character.charCount(codepoint);
            }
            if (KEYWORDS_BOOLLITERALS_NULLLITERAL.contains(component)) return false;
        }
        return true;
    }

}
