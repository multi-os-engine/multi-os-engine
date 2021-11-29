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
 * Describes the type of the comment AST node (\c CXComment).  A comment
 * node can be considered block content (e. g., paragraph), inline content
 * (plain text) or neither (the root AST node).
 */
@Generated
public final class CXCommentKind {
    /**
     * Null comment.  No AST node is constructed at the requested location
     * because there is no text or a syntax error.
     */
    @Generated public static final int Null = 0x00000000;
    /**
     * Plain text.  Inline content.
     */
    @Generated public static final int Text = 0x00000001;
    /**
     * A command with word-like arguments that is considered inline content.
     * <p>
     * For example: \\c command.
     */
    @Generated public static final int InlineCommand = 0x00000002;
    /**
     * HTML start tag with attributes (name-value pairs).  Considered
     * inline content.
     * <p>
     * For example:
     * \verbatim
     * <br> <br /> <a href="http://example.org/">
     * \endverbatim
     */
    @Generated public static final int HTMLStartTag = 0x00000003;
    /**
     * HTML end tag.  Considered inline content.
     * <p>
     * For example:
     * \verbatim
     * </a>
     * \endverbatim
     */
    @Generated public static final int HTMLEndTag = 0x00000004;
    /**
     * A paragraph, contains inline comment.  The paragraph itself is
     * block content.
     */
    @Generated public static final int Paragraph = 0x00000005;
    /**
     * A command that has zero or more word-like arguments (number of
     * word-like arguments depends on command name) and a paragraph as an
     * argument.  Block command is block content.
     * <p>
     * Paragraph argument is also a child of the block command.
     * <p>
     * For example: \has 0 word-like arguments and a paragraph argument.
     * <p>
     * AST nodes of special kinds that parser knows about (e. g., \\param
     * command) have their own node kinds.
     */
    @Generated public static final int BlockCommand = 0x00000006;
    /**
     * A \\param or \\arg command that describes the function parameter
     * (name, passing direction, description).
     * <p>
     * For example: \\param [in] ParamName description.
     */
    @Generated public static final int ParamCommand = 0x00000007;
    /**
     * A \\tparam command that describes a template parameter (name and
     * description).
     * <p>
     * For example: \\tparam T description.
     */
    @Generated public static final int TParamCommand = 0x00000008;
    /**
     * A verbatim block command (e. g., preformatted code).  Verbatim
     * block has an opening and a closing command and contains multiple lines of
     * text (\c CXComment_VerbatimBlockLine child nodes).
     * <p>
     * For example:
     * \\verbatim
     * aaa
     * \\endverbatim
     */
    @Generated public static final int VerbatimBlockCommand = 0x00000009;
    /**
     * A line of text that is contained within a
     * CXComment_VerbatimBlockCommand node.
     */
    @Generated public static final int VerbatimBlockLine = 0x0000000A;
    /**
     * A verbatim line command.  Verbatim line has an opening command,
     * a single line of text (up to the newline after the opening command) and
     * has no closing command.
     */
    @Generated public static final int VerbatimLine = 0x0000000B;
    /**
     * A full comment attached to a declaration, contains block content.
     */
    @Generated public static final int FullComment = 0x0000000C;

    @Generated
    private CXCommentKind() {
    }
}
