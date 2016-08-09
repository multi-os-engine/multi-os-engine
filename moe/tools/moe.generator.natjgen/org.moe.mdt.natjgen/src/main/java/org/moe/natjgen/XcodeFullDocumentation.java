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

package org.moe.natjgen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEditGroup;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XcodeFullDocumentation implements XcodeDocumentation.IXcodeDocumenrationImpl {

	public static final String DocTokensBase = "Contents/Resources/Tokens";

	private static final int MAX_LINE_WIDTH = 100;

	private static class HTMLTagReplacement {
		public final String openPlaceholder;
		public final String closePlaceholder;
		public final String xml;
		public final String openHtml;
		public final String closeHtml;
		public final boolean param;

		public HTMLTagReplacement(String xml, String html, boolean param) {
			this.xml = xml;
			this.openHtml = "<" + html + ">";
			this.closeHtml = "</" + html + ">";
			this.openPlaceholder = "===" + xml + "+++" + html + "+++" + "open" + "===";
			this.closePlaceholder = "===" + xml + "+++" + html + "+++" + "close" + "===";
			this.param = param;
		}
	}

	private static HTMLTagReplacement replacements[] = new HTMLTagReplacement[] {
			new HTMLTagReplacement("Para", "p", true), new HTMLTagReplacement("List-Bullet", "ul", false),
			new HTMLTagReplacement("List-Simple", "ol", false), new HTMLTagReplacement("Item", "li", false),
			new HTMLTagReplacement("Table", "table", false), new HTMLTagReplacement("TableHeading", "thead", false),
			new HTMLTagReplacement("TableBody", "tbody", false), new HTMLTagReplacement("TableFooter", "tfoot", false),
			new HTMLTagReplacement("TableRow", "tr", false), new HTMLTagReplacement("TableCell", "td", false),
			new HTMLTagReplacement("parameterName", "i", true), new HTMLTagReplacement("kConstantName", "b", true),
			new HTMLTagReplacement("codeVoice", "code", true),
	};

	private String Abstract;
	private String Discussion;
	private ArrayList<String> ParameterNames = new ArrayList<String>();
	private ArrayList<String> ParameterDescriptions = new ArrayList<String>();
	private String ResultDescription;
	private ArrayList<String> Availabilities = new ArrayList<String>();
	private String Declaration;

	private TextEditGroup editGroup;

	public XcodeFullDocumentation(Indexer indexer, String lang, String type, String element, String name,
			TextEditGroup editGroup) throws IOException {
		this.editGroup = editGroup;

		if (indexer.getXcodePath() == null) {
			throw new IOException("Xcode path could not be retrieved");
		}

		File file = null;
		ArrayList<String> docsets = indexer.getConfiguration().getDocsets();
		for (String docset : docsets) {
			File ds = new File(indexer.getXcodePath(), "Documentation/DocSets");
			ds = new File(ds, docset);
			ds = new File(ds, DocTokensBase + "/" + lang + "/" + type + "/" + element + "/" + name + ".xml");
			if (ds.exists()) {
				file = ds;
				break;
			}
		}

		if (file == null) {
			throw new IOException("no documentation found for /" + lang + "/" + type + "/" + element + "/" + name);
		}

		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {

				private final int kROOT = 0;
				private final int kAbstract = 1;
				private final int kDiscussion = 2;
				private final int kParameters = 3;
				private final int kParameter = 31;
				private final int kParameter_Term = 311;
				private final int kParameter_Definition = 312;
				private final int kResultDescription = 4;
				private final int kAvailability = 5;
				private final int kAvailabilityItem = 51;
				private final int kDeclaration = 6;
				private final int kCodeLine = 61;
				private int phase = kROOT;

				private StringBuilder capture;

				private final int maxStackDepth = 1024;
				private boolean contentStack[] = new boolean[maxStackDepth];
				private int contentStackDepth = 0;

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					switch (phase) {
					case kAbstract:
					case kDiscussion:
					case kResultDescription:
					case kParameter_Definition:
						contentStack[contentStackDepth] = true;
						++contentStackDepth;
						for (HTMLTagReplacement replacement : replacements) {
							if (qName.equalsIgnoreCase(replacement.xml)) {
								contentStack[contentStackDepth - 1] = replacement.param;
								capture.append(replacement.openPlaceholder);
								break;
							}
						}
					case kROOT:
						if (qName.equalsIgnoreCase("Abstract")) {
							phase = kAbstract;
							capture = new StringBuilder();
						} else if (qName.equalsIgnoreCase("Discussion")) {
							phase = kDiscussion;
							capture = new StringBuilder();
						} else if (qName.equalsIgnoreCase("Parameters")) {
							phase = kParameters;
						} else if (qName.equalsIgnoreCase("ResultDescription")) {
							phase = kResultDescription;
							capture = new StringBuilder();
						} else if (qName.equalsIgnoreCase("Availability")) {
							phase = kAvailability;
						} else if (qName.equalsIgnoreCase("Declaration")) {
							phase = kDeclaration;
						}
						break;
					case kParameters:
						if (qName.equalsIgnoreCase("Parameter")) {
							phase = kParameter;
						}
						break;
					case kParameter:
						if (qName.equalsIgnoreCase("Term")) {
							phase = kParameter_Term;
							capture = new StringBuilder();
						} else if (qName.equalsIgnoreCase("Definition")) {
							phase = kParameter_Definition;
							capture = new StringBuilder();
						}
						break;
					case kAvailability:
						if (qName.equalsIgnoreCase("AvailabilityItem")) {
							phase = kAvailabilityItem;
							capture = new StringBuilder();
						}
						break;
					case kDeclaration:
						if (qName.equalsIgnoreCase("CodeLine")) {
							phase = kCodeLine;
							capture = new StringBuilder();
						}
						break;

					default:
						break;
					}
				}

				@Override
				public void endElement(String uri, String localName, String qName) throws SAXException {
					if (contentStackDepth > 0) {
						--contentStackDepth;
						for (HTMLTagReplacement replacement : replacements) {
							if (qName.equalsIgnoreCase(replacement.xml)) {
								capture.append(replacement.closePlaceholder);
								break;
							}
						}
					} else {
						switch (phase) {
						case kAbstract:
							if (qName.equalsIgnoreCase("Abstract")) {
								Abstract = capture.toString();
								capture = null;
								phase = kROOT;
							}
							break;
						case kDiscussion:
							if (qName.equalsIgnoreCase("Discussion")) {
								Discussion = capture.toString();
								capture = null;
								phase = kROOT;
							}
							break;
						case kParameters:
							if (qName.equalsIgnoreCase("Parameters")) {
								phase = kROOT;
							}
							break;
						case kResultDescription:
							if (qName.equalsIgnoreCase("ResultDescription")) {
								ResultDescription = capture.toString();
								capture = null;
								phase = kROOT;
							}
							break;
						case kAvailability:
							if (qName.equalsIgnoreCase("Availability")) {
								phase = kROOT;
							}
							break;
						case kDeclaration:
							if (qName.equalsIgnoreCase("Declaration")) {
								phase = kROOT;
							}
							break;
						case kParameter:
							if (qName.equalsIgnoreCase("Parameter")) {
								phase = kParameters;
							}
							break;
						case kParameter_Term:
							if (qName.equalsIgnoreCase("Term")) {
								ParameterNames.add(capture.toString());
								capture = null;
								phase = kParameter;
							}
							break;
						case kParameter_Definition:
							if (qName.equalsIgnoreCase("Definition")) {
								ParameterDescriptions.add(capture.toString());
								capture = null;
								phase = kParameter;
							}
							break;
						case kAvailabilityItem:
							if (qName.equalsIgnoreCase("AvailabilityItem")) {
								Availabilities.add(capture.toString());
								capture = null;
								phase = kAvailability;
							}
							break;
						case kCodeLine:
							if (qName.equalsIgnoreCase("CodeLine")) {
								Declaration = capture.toString();
								capture = null;
								phase = kDeclaration;
							}
							break;

						default:
							break;
						}
					}
				}

				@Override
				public void characters(char[] ch, int start, int length) throws SAXException {
					if (capture != null) {
						if (contentStackDepth == 0 || contentStack[contentStackDepth - 1]) {
							capture.append(new String(ch, start, length));
						}
					}
				}
			};

			InputStream inputStream = new FileInputStream(file);
			Reader reader = new InputStreamReader(inputStream, "UTF-8");

			InputSource is = new InputSource(reader);
			is.setEncoding("UTF-8");

			parser.parse(is, handler);

		} catch (Exception e) {
			throw new IOException("failed to parse doc", e);
		}
	}

	public Javadoc getJavaDoc(ASTRewrite rewrite, ArrayList<CalleeArgument> args) {
		Javadoc doc = rewrite.getAST().newJavadoc();

		addTag(doc, rewrite, null, "<h1>Abstract:</h1>\n" + prettyString(Abstract));
		if (Discussion != null) {
			addTag(doc, rewrite, null, "<h1>Discussion:</h1>\n" + prettyString(Discussion));
		}

		// @code
		addTag(doc, rewrite, TagElement.TAG_CODE, prettyString(Declaration));

		// @param
		if (args.size() == ParameterNames.size()) {
			for (int i = 0; i < ParameterNames.size(); ++i) {
				addTag(doc, rewrite, TagElement.TAG_PARAM,
						args.get(i).getName() + " " + prettyString(ParameterDescriptions.get(i)));
			}
		} else {
			for (int i = 0; i < ParameterNames.size(); ++i) {
				addTag(doc, rewrite, TagElement.TAG_PARAM,
						ParameterNames.get(i) + " " + prettyString(ParameterDescriptions.get(i)));
			}
		}

		// @return
		addTag(doc, rewrite, TagElement.TAG_RETURN, prettyString(ResultDescription));

		// @since
		for (int i = 0; i < Availabilities.size(); ++i) {
			addTag(doc, rewrite, TagElement.TAG_SINCE, prettyString(Availabilities.get(i)));
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

	private String prettyString(String capture) {
		if (capture == null) {
			return null;
		}
		return prettyString(new StringBuilder(capture));
	}

	private String prettyString(StringBuilder capture) {
		if (capture.length() == 0) return null;

		// Remove heading new-lines
		while (capture.length() == 0 && (capture.charAt(0) == '\n' || capture.charAt(0) == '\r')) {
			capture.deleteCharAt(0);
		}

		// Remove trailing new-lines
		while (capture.length() == 0
				&& (capture.charAt(capture.length() - 1) == '\n' || capture.charAt(capture.length() - 1) == '\r')) {
			capture.deleteCharAt(capture.length() - 1);
		}

		String htmlencoded = StringEscapeUtils.escapeHtml4(capture.toString());
		String[] words = htmlencoded.split("\\s+");

		// Try to create lines with the maximum length of MAX_LINE_WIDTH
		capture.setLength(0);
		int lineLength = 0;
		for (String word : words) {
			if (lineLength > 0) {
				if (lineLength + word.length() > MAX_LINE_WIDTH) {
					capture.append("\n");
					lineLength = 0;
				} else {
					capture.append(" ");
				}
			}
			capture.append(word);
			lineLength += word.length();
		}

		for (HTMLTagReplacement replacement : replacements) {
			replaceAll(capture, replacement.openPlaceholder, replacement.openHtml);
			replaceAll(capture, replacement.closePlaceholder, replacement.closeHtml);
		}
		replaceAll(capture, "/*", "&#47;*");
		replaceAll(capture, "*/", "*&#47;");

		for (int i = 0; i < capture.length(); ++i) {
			char c = capture.charAt(i);
			if (!CharUtils.isAscii(c)) {
				capture.replace(i, i + 1, "&#x;");
				capture.insert(i + 3, String.format("%04X", new Integer(c)));
				i += 7;
			}
		}

		return capture.toString();
	}

	private void replaceAll(StringBuilder builder, String from, String to) {
		int idx = 0;
		int flen = from.length();
		while ((idx = builder.indexOf(from, idx)) != -1) {
			builder.replace(idx, idx + flen, to);
		}
	}

}
