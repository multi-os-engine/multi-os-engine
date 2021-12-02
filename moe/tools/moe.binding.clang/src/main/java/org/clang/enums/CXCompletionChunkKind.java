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

package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Describes a single piece of text within a code-completion string.
 * <p>
 * Each "chunk" within a code-completion string (\c CXCompletionString) is
 * either a piece of text with a specific "kind" that describes how that text
 * should be interpreted by the client or is another completion string.
 */
@Generated
public final class CXCompletionChunkKind {
    /**
     * A code-completion string that describes "optional" text that
     * could be a part of the template (but is not required).
     * <p>
     * The Optional chunk is the only kind of chunk that has a code-completion
     * string for its representation, which is accessible via
     * \c clang_getCompletionChunkCompletionString(). The code-completion string
     * describes an additional part of the template that is completely optional.
     * For example, optional chunks can be used to describe the placeholders for
     * arguments that match up with defaulted function parameters, e.g. given:
     * <p>
     * \code
     * void f(int x, float y = 3.14, double z = 2.71828);
     * \endcode
     * <p>
     * The code-completion string for this function would contain:
     * - a TypedText chunk for "f".
     * - a LeftParen chunk for "(".
     * - a Placeholder chunk for "int x"
     * - an Optional chunk containing the remaining defaulted arguments, e.g.,
     * - a Comma chunk for ","
     * - a Placeholder chunk for "float y"
     * - an Optional chunk containing the last defaulted argument:
     * - a Comma chunk for ","
     * - a Placeholder chunk for "double z"
     * - a RightParen chunk for ")"
     * <p>
     * There are many ways to handle Optional chunks. Two simple approaches are:
     * - Completely ignore optional chunks, in which case the template for the
     * function "f" would only include the first parameter ("int x").
     * - Fully expand all optional chunks, in which case the template for the
     * function "f" would have all of the parameters.
     */
    @Generated public static final int Optional = 0x00000000;
    /**
     * Text that a user would be expected to type to get this
     * code-completion result.
     * <p>
     * There will be exactly one "typed text" chunk in a semantic string, which
     * will typically provide the spelling of a keyword or the name of a
     * declaration that could be used at the current code point. Clients are
     * expected to filter the code-completion results based on the text in this
     * chunk.
     */
    @Generated public static final int TypedText = 0x00000001;
    /**
     * Text that should be inserted as part of a code-completion result.
     * <p>
     * A "text" chunk represents text that is part of the template to be
     * inserted into user code should this particular code-completion result
     * be selected.
     */
    @Generated public static final int Text = 0x00000002;
    /**
     * Placeholder text that should be replaced by the user.
     * <p>
     * A "placeholder" chunk marks a place where the user should insert text
     * into the code-completion template. For example, placeholders might mark
     * the function parameters for a function declaration, to indicate that the
     * user should provide arguments for each of those parameters. The actual
     * text in a placeholder is a suggestion for the text to display before
     * the user replaces the placeholder with real code.
     */
    @Generated public static final int Placeholder = 0x00000003;
    /**
     * Informative text that should be displayed but never inserted as
     * part of the template.
     * <p>
     * An "informative" chunk contains annotations that can be displayed to
     * help the user decide whether a particular code-completion result is the
     * right option, but which is not part of the actual template to be inserted
     * by code completion.
     */
    @Generated public static final int Informative = 0x00000004;
    /**
     * Text that describes the current parameter when code-completion is
     * referring to function call, message send, or template specialization.
     * <p>
     * A "current parameter" chunk occurs when code-completion is providing
     * information about a parameter corresponding to the argument at the
     * code-completion point. For example, given a function
     * <p>
     * \code
     * int add(int x, int y);
     * \endcode
     * <p>
     * and the source code \c add(, where the code-completion point is after the
     * "(", the code-completion string will contain a "current parameter" chunk
     * for "int x", indicating that the current argument will initialize that
     * parameter. After typing further, to \c add(17, (where the code-completion
     * point is after the ","), the code-completion string will contain a
     * "current parameter" chunk to "int y".
     */
    @Generated public static final int CurrentParameter = 0x00000005;
    /**
     * A left parenthesis ('('), used to initiate a function call or
     * signal the beginning of a function parameter list.
     */
    @Generated public static final int LeftParen = 0x00000006;
    /**
     * A right parenthesis (')'), used to finish a function call or
     * signal the end of a function parameter list.
     */
    @Generated public static final int RightParen = 0x00000007;
    /**
     * A left bracket ('[').
     */
    @Generated public static final int LeftBracket = 0x00000008;
    /**
     * A right bracket (']').
     */
    @Generated public static final int RightBracket = 0x00000009;
    /**
     * A left brace ('{').
     */
    @Generated public static final int LeftBrace = 0x0000000A;
    /**
     * A right brace ('}').
     */
    @Generated public static final int RightBrace = 0x0000000B;
    /**
     * A left angle bracket ('<').
     */
    @Generated public static final int LeftAngle = 0x0000000C;
    /**
     * A right angle bracket ('>').
     */
    @Generated public static final int RightAngle = 0x0000000D;
    /**
     * A comma separator (',').
     */
    @Generated public static final int Comma = 0x0000000E;
    /**
     * Text that specifies the result type of a given result.
     * <p>
     * This special kind of informative chunk is not meant to be inserted into
     * the text buffer. Rather, it is meant to illustrate the type that an
     * expression using the given completion string would have.
     */
    @Generated public static final int ResultType = 0x0000000F;
    /**
     * A colon (':').
     */
    @Generated public static final int Colon = 0x00000010;
    /**
     * A semicolon (';').
     */
    @Generated public static final int SemiColon = 0x00000011;
    /**
     * An '=' sign.
     */
    @Generated public static final int Equal = 0x00000012;
    /**
     * Horizontal space (' ').
     */
    @Generated public static final int HorizontalSpace = 0x00000013;
    /**
     * Vertical space ('\\n'), after which it is generally a good idea to
     * perform indentation.
     */
    @Generated public static final int VerticalSpace = 0x00000014;

    @Generated
    private CXCompletionChunkKind() {
    }
}
