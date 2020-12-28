package org.moe.natjgen;

import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEditGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

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

        // Preprocess the comment
        String c = comment.trim();

        LinkedList<String> lines = new LinkedList<>();
        Collections.addAll(lines, c.split("\\r?\\n"));
        lines.add("*/"); // Make sure the last block ends

        LinkedList<String> cleanedLines = new LinkedList<>();
        LinkedList<String> blockBuffer = new LinkedList<>();
        boolean inBlock = false;
        while (!lines.isEmpty()) {
            String line = lines.pop();

            if (inBlock) {
                int i = line.indexOf("*/");
                if (i >= 0) {
                    inBlock = false;

                    String start = line.substring(0, i);
                    if (!start.trim().isEmpty()) {
                        blockBuffer.add(start);
                    }
                    String tail = line.substring(i + 2);
                    if (!tail.trim().isEmpty()) {
                        lines.push(tail);
                    }

                    if (!blockBuffer.isEmpty()) {
                        String firstLine = blockBuffer.pop().replaceFirst("/\\*+", "").trim();
                        if (!firstLine.isEmpty()) {
                            cleanedLines.add(firstLine);
                        }

                        boolean allLineStartWithAsterisk = true;
                        int spaceAfterAsterisk = Integer.MAX_VALUE;
                        for (String bl : blockBuffer) {
                            String t = bl.trim();
                            if (t.startsWith("*")) {
                                t = t.substring(1);
                                if (!t.trim().isEmpty()) {
                                    int s = 0;
                                    for (; s < t.length() && t.charAt(s) == ' '; s++) ;
                                    spaceAfterAsterisk = Math.min(spaceAfterAsterisk, s);
                                }
                            } else {
                                allLineStartWithAsterisk = false;
                                break;
                            }
                        }
                        if (allLineStartWithAsterisk) {
                            for (String bl : blockBuffer) {
                                String t = bl.trim().substring(1);
                                if (t.trim().isEmpty()) {
                                    cleanedLines.add("");
                                } else {
                                    cleanedLines.add(t.substring(spaceAfterAsterisk));
                                }
                            }
                        } else {
                            cleanedLines.addAll(blockBuffer);
                        }
                        blockBuffer.clear();
                    }
                } else {
                    blockBuffer.add(line);
                }
            } else {
                String tmpLine = line.trim();
                if (tmpLine.startsWith("/*")) {
                    inBlock = true;
                    lines.push(tmpLine);
                } else if (tmpLine.startsWith("//")) {
                    cleanedLines.add(tmpLine.replaceFirst("^//+", ""));
                } else if (tmpLine.contains("*/")) {
                    lines.push(line.replace("*/", " "));
                } else {
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
