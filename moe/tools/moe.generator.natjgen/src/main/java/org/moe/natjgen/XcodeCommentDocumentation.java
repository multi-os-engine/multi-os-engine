package org.moe.natjgen;

import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEditGroup;
import org.moe.natjgen.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class XcodeCommentDocumentation implements XcodeDocumentation.IXcodeDocumenrationImpl {

    private final String comment;
    private final TextEditGroup editGroup;

    public XcodeCommentDocumentation(String comment, TextEditGroup editGroup) {
        this.comment = comment;
        this.editGroup = editGroup;
    }

    @Override
    public Javadoc getJavaDoc(ASTRewrite rewrite, ArrayList<CalleeArgument> args) {
        if (comment == null) {
            return null;
        }

        // Preprocess the comment.
        // Here we need to extract the content from the raw comment,
        // removing all syntax elements like the leading slashes from line comments
        // and the `/* */` from block comments, while maintain the format of the original comment.
        // We also need to consider consecutive multiple comments in different syntax.
        // For example, giving the following comments (ignore the leading "//>"):
        //> /*
        //> Comment 1
        //> */
        //> // Comment 2
        //> /**
        //>  * Comment 3
        //>  */

        // After the process, we will have three lines of pure text (ignore the leading "//>"):
        //> Comment 1
        //> Comment 2
        //> Comment 3

        String c = comment.trim();

        // Split the raw comment into lines
        LinkedList<String> lines = new LinkedList<>();
        Collections.addAll(lines, c.split("\\r?\\n"));

        lines.add("*/"); // Make sure the last block ends

        LinkedList<String> cleanedLines = new LinkedList<>();
        LinkedList<String> blockBuffer = new LinkedList<>();
        boolean inBlock = false;
        while (!lines.isEmpty()) {
            String line = lines.pop();

            if (inBlock) {
                // Check if current line contains the termination of the block comment
                // TODO: handle sequence like /*/*/ correctly
                int i = line.indexOf("*/");
                if (i >= 0) {
                    // Block terminated
                    inBlock = false;

                    String start = line.substring(0, i);
                    if (!start.trim().isEmpty()) {
                        // Put anything before the termination symbol to the block buffer
                        // TODO: trim tail
                        blockBuffer.add(start);
                    }
                    String tail = line.substring(i + 2);
                    if (!tail.trim().isEmpty()) {
                        // Put anything after the termination symbol back to the line buffer
                        // since there can be more comments afterwards
                        lines.push(tail);
                    }

                    if (!blockBuffer.isEmpty()) {
                        // Handle the first line by removing the block start symbol /*
                        String firstLine = blockBuffer.pop().replaceFirst("/\\*+!?", "").trim();
                        if (!firstLine.isEmpty()) {
                            cleanedLines.add(firstLine);
                        }

                        // For remaining lines of the block, we remove the leading asterisks
                        // only if ALL lines start with asterisks.
                        boolean allLineStartWithAsterisk = true;
                        for (String bl : blockBuffer) {
                            String t = bl.trim();
                            if (!t.startsWith("*")) {
                                allLineStartWithAsterisk = false;
                                break;
                            }
                        }
                        List<String> blockBufferWithoutAsterisk = new ArrayList<>(blockBuffer.size());
                        if (allLineStartWithAsterisk) {
                            for (String bl : blockBuffer) {
                                String t = bl.trim();
                                blockBufferWithoutAsterisk.add(t.substring(1));
                            }
                        } else {
                            blockBufferWithoutAsterisk.addAll(blockBuffer);
                        }
                        blockBuffer.clear();

                        // We also remove the maximum common indent after the asterisk.
                        // For the following two lines:
                        // *   3 leading spaces
                        // *
                        // *  2 leading spaces
                        // the maximum common indent is 2, and the empty line is kept (and trimmed) regardless.
                        int maxCommonIndent = Integer.MAX_VALUE;
                        for (String bl : blockBufferWithoutAsterisk) {
                            if (!bl.trim().isEmpty()) {
                                maxCommonIndent = Math.min(maxCommonIndent, StringUtil.getIndentCount(bl));
                            }
                        }
                        for (String bl : blockBufferWithoutAsterisk) {
                            if (bl.trim().isEmpty()) {
                                // Replace any blank line with empty line
                                cleanedLines.add("");
                            } else {
                                // TODO: trim tail
                                cleanedLines.add(bl.substring(maxCommonIndent));
                            }
                        }
                    }
                } else {
                    // Block not terminate yet, keep buffering
                    blockBuffer.add(line);
                }
            } else {
                String tmpLine = line.trim();
                if (tmpLine.startsWith("/*")) {
                    // A block comment starts.
                    // Here we put the line back to the line buffer because this line might also
                    // contains the end of the block, e.g. a single-line block comment.
                    inBlock = true;
                    lines.push(tmpLine);
                } else if (tmpLine.startsWith("//")) {
                    // This is a single-line comment, we remove all continues slashes at the beginning of the line
                    cleanedLines.add(tmpLine.replaceFirst("^//+", ""));
                } else if (tmpLine.contains("*/")) {
                    // We are not in a block comment, and also not a line comment (how?), but there is a
                    // end-of-block symbol in the text, we have to remove it so the final javadoc won't
                    // terminate accidentally.
                    // Once the symbol is removed, then this line might be a valid comment, so we put the
                    // processed line back to the buffer.
                    lines.push(line.replace("*/", " "));
                } else {
                    // Otherwise just a plain text, consume i
                    cleanedLines.add(line);
                }
            }
        }

        // Remove blank lines at the start and end of the comment
        while (!cleanedLines.isEmpty() && cleanedLines.peekFirst().trim().isEmpty()) {
            cleanedLines.removeFirst();
        }
        while (!cleanedLines.isEmpty() && cleanedLines.peekLast().trim().isEmpty()) {
            cleanedLines.removeLast();
        }

        Javadoc doc = rewrite.getAST().newJavadoc();
        for (String l : cleanedLines) {
            addTag(doc, rewrite, null, l);
        }

        return doc;
    }

    private void addTag(Javadoc doc, ASTRewrite rewrite, String tag, String string) {
        if (string == null) return;

        ListRewrite lrw = rewrite.getListRewrite(doc, Javadoc.TAGS_PROPERTY);

        TagElement t = rewrite.getAST().newTagElement();
        lrw.insertLast(t, editGroup);
        if (tag != null) {
            rewrite.set(t, TagElement.TAG_NAME_PROPERTY, tag, editGroup);
        }

        ListRewrite fragments = rewrite.getListRewrite(t, TagElement.FRAGMENTS_PROPERTY);
        TextElement text = rewrite.getAST().newTextElement();
        fragments.insertLast(text, editGroup);
        rewrite.set(text, TextElement.TEXT_PROPERTY, string, editGroup);
    }
}
