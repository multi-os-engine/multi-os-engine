package org.moe.natjgen;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEditGroup;
import org.moe.natjgen.util.StringUtil;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XcodeCommentDocumentation implements XcodeDocumentation.IXcodeDocumenrationImpl {

    private final String comment;
    private final TextEditGroup editGroup;

    public XcodeCommentDocumentation(String comment, TextEditGroup editGroup) {
        this.comment = comment;
        this.editGroup = editGroup;
    }

    /**
     * Remove the maximum common indent.
     * For the following two lines:
     * >   3 leading spaces
     * >
     * >  2 leading spaces
     * the maximum common indent is 2, and the empty line is kept (and trimmed) regardless.
     */
    private static List<String> trimCommonIndent(List<String> source) {
        List<String> result = new ArrayList<>(source.size());

        int maxCommonIndent = Integer.MAX_VALUE;
        for (String l : source) {
            if (!l.trim().isEmpty()) {
                maxCommonIndent = Math.min(maxCommonIndent, StringUtil.getIndentCount(l));
            }
        }

        for (String l : source) {
            if (l.trim().isEmpty()) {
                // Replace any blank line with empty line
                result.add("");
            } else {
                // TODO: trim tail
                result.add(l.substring(maxCommonIndent));
            }
        }

        return result;
    }

    private static final Pattern tagMatcher = Pattern.compile("^(?<leading>\\s*)@(?<tag>[a-zA-Z0-9]+?)(?<trailing>(:\\s?)|\\s|$)");

    // Tags that should be ignored (e.g. treat as not-a-tag)
    private static final Set<String> ignoredTags = new HashSet<>();
    private static final Map<String, String> knownTagsReplacement = new HashMap<>();

    static {
        for (String t : new String[]{
                "textblock"
        }) {
            ignoredTags.add(t);
        }

        // legitimate javadoc tags
        // https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html#CHDJGIJB
        for (String t : new String[]{
                "author",
                "deprecated",
                "exception",
                "param",
                "return",
                "see",
                "serial",
                "serialData",
                "serialField",
                "since",
                "throws",
                "version",
        }) {
            // we replace the tag to itself so affectively it's kept
            knownTagsReplacement.put(t.toLowerCase(), t);
        }

        // Tags that need to be moved to description section
        for (String t : new String[]{
                "class",
                "method",

                "brief",
                "abstract",
                "details",
                "discussion",
        }) {
            knownTagsReplacement.put(t, "");
        }

        // Tags that need to be replaced
        knownTagsReplacement.put("seealso", "see");
        knownTagsReplacement.put("result", "return");
        knownTagsReplacement.put("oaram", "param"); // stupid Apple typo
    }

    private enum TagReplaceStatus {
        NOT_TAG, // Input and output are not tag
        IS_TAG, // Input and output are both valid tag
        TAG_REMOVED, // Input was a tag but output has tag removed
        TAG_WRAPPED // Input was a tag and output has tag wrapped
    }

    private static class TagReplaceResult {
        public String line;
        public TagReplaceStatus status;
    }

    private static void replaceSingleTag(String line, TagReplaceResult result) {
        boolean tagRemoved;
        boolean tagEverRemoved = false;
        boolean wasTag = false;
        do {
            tagRemoved = false;

            StringBuffer sb = new StringBuffer();
            Matcher matcher = tagMatcher.matcher(line);
            if (matcher.find()) {
                String tag = matcher.group("tag");
                String lowerTag = tag.toLowerCase();
                if (ignoredTags.contains(lowerTag)) {
                    break;
                }

                wasTag = true;

                // Replace input tags with known tags
                String newTag;
                if (knownTagsReplacement.containsKey(lowerTag)) {
                    newTag = knownTagsReplacement.get(lowerTag);
                    if (!newTag.isEmpty()) {
                        newTag = "@" + newTag;
                    }
                } else {
                    newTag = "[@" + tag + "]";
                }

                // Handle leading and trailing spaces
                String leading = matcher.group("leading");
                String trailing = matcher.group("trailing");
                if (trailing.startsWith(":")) {
                    trailing = trailing.substring(1);
                    if (trailing.isEmpty()) {
                        trailing = " ";
                    }
                }
                if (newTag.isEmpty()) {
                    leading = "";
                    trailing = "";
                    tagRemoved = true;
                    tagEverRemoved = true;
                }

                // Replace the tag
                matcher.appendReplacement(sb, leading + newTag + trailing);
            }
            matcher.appendTail(sb);
            line = sb.toString();

        } while (tagRemoved);

        result.line = line;

        if (!wasTag) {
            result.status = TagReplaceStatus.NOT_TAG;
        } else {
            boolean isTag;
            Matcher matcher = tagMatcher.matcher(line);
            if (matcher.find()) {
                String tag = matcher.group("tag");
                String lowerTag = tag.toLowerCase();
                isTag = !ignoredTags.contains(lowerTag);
            } else {
                isTag = false;
            }

            if (isTag) {
                result.status = TagReplaceStatus.IS_TAG;
            } else if (tagEverRemoved) {
                // Remove the leading space if tag has been removed
                result.line = result.line.trim();
                result.status = TagReplaceStatus.TAG_REMOVED;
            } else {
                result.status = TagReplaceStatus.TAG_WRAPPED;
            }
        }
    }

    /**
     * Fix all unknown tags, and make sure the tags are at the end of the javadoc.
     * Unsupported tags will be wrapped by a square bracket.
     */
    private static List<String> fixTagsAndOrder(List<String> source) {

        LinkedList<String> descriptionBuffer = new LinkedList<>();
        LinkedList<String> tagSectionBuffer = new LinkedList<>();

        boolean inTag = false;

        TagReplaceResult lineResult = new TagReplaceResult();
        for (String l : source) {
            replaceSingleTag(l, lineResult);

            switch (lineResult.status) {
                case NOT_TAG:
                    if (inTag) {
                        tagSectionBuffer.add(lineResult.line);
                    } else {
                        descriptionBuffer.add(lineResult.line);
                    }
                    break;
                case TAG_WRAPPED:
                    inTag = false;
                    descriptionBuffer.add(lineResult.line);
                    break;
                case IS_TAG:
                    inTag = true;
                    tagSectionBuffer.add(lineResult.line);
                    break;
                case TAG_REMOVED:
                    inTag = false;
                    if (!descriptionBuffer.isEmpty() && StringUtils.isNotBlank(descriptionBuffer.peekLast())) {
                        descriptionBuffer.add("");
                    }
                    if (StringUtils.isNotBlank(lineResult.line)) {
                        descriptionBuffer.add(lineResult.line);
                    }
                    break;
            }
        }

        StringUtil.removeLeadingAndTrailingBlankLines(descriptionBuffer);
        StringUtil.removeLeadingAndTrailingBlankLines(tagSectionBuffer);

        if (!tagSectionBuffer.isEmpty()) {
            descriptionBuffer.add("");
            descriptionBuffer.addAll(tagSectionBuffer);
        }

        StringUtil.removeLeadingAndTrailingBlankLines(descriptionBuffer);

        return descriptionBuffer;
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
                        cleanedLines.addAll(trimCommonIndent(blockBufferWithoutAsterisk));
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
                } else if (tmpLine.contains("*/")) {
                    // We are not in a block comment, and also not a line comment (how?), but there is a
                    // end-of-block symbol in the text, we have to remove it so the final javadoc won't
                    // terminate accidentally.
                    // Once the symbol is removed, then this line might be a valid comment, so we put the
                    // processed line back to the buffer.
                    lines.push(line.replace("*/", " "));
                } else if (tmpLine.startsWith("//")) {
                    // This is a single-line comment, we remove all continues slashes at the beginning of the line
                    cleanedLines.add(tmpLine.replaceFirst("^//+", ""));
                } else {
                    // Otherwise just a plain text, consume i
                    cleanedLines.add(line);
                }
            }
        }

        // Remove blank lines at the start and end of the comment
        StringUtil.removeLeadingAndTrailingBlankLines(cleanedLines);

        // Remove the max common indent for the entire comment block
        List<String> trimmedCommentBlock = trimCommonIndent(cleanedLines);

        // Fix javadoc tags
        List<String> finalCommentBlock = fixTagsAndOrder(trimmedCommentBlock);

        Javadoc doc = rewrite.getAST().newJavadoc();
        for (String l : finalCommentBlock) {
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
