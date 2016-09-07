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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.lang3.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Statistics {

	private static final Logger LOG = LoggerFactory.getLogger(Statistics.class);

	public static final String SUCCESS = "Success";
	public static final String SKIPPING = "Skipping";
	public static final String FAILED = "Failed";
	public static final String UNAVAILABLE = "Unavailable";
	public static final String INCOMPLETE = "Incomplete";

	public static final String RESOLVED_TYPE = "Resolved";
	public static final String UNCERTAIN_TYPE = "Uncertain";
	public static final String RESOLVED_UNCERTAIN_TYPE = "Resolved Uncertain";

	public static final String C_FUNCTION = "C Function";
	public static final String C_VARIABLE = "C Global Variable";
	public static final String C_STRUCT = "C Struct";
	public static final String C_STRUCT_FIELD = "C Struct Field";
	public static final String C_ENUM = "C Enum";
	public static final String C_ENUM_CONST = "C Enum Constant";
	public static final String C_OPAQUE_TYPE = "Opaque Type";
	public static final String OBJC_CLASS = "Objective-C Class";
	public static final String OBJC_PROTOCOL = "Objective-C Protocol";
	public static final String OBJC_CLASS_METHOD = "Objective-C Class Method";
	public static final String OBJC_INSTANCE_METHOD = "Objective-C Instance Method";
	public static final String OBJC_PROPERTY_GETTER = "Objective-C Property Getter";
	public static final String OBJC_PROPERTY_SETTER = "Objective-C Property Setter";
	public static final String CALLBACK = "Objective-C Block/Function Pointer";

	private ConcurrentLinkedQueue<String> logs = new ConcurrentLinkedQueue<String>();

	private final HashMap<String, ElemStats> elemStats = new HashMap<String, Statistics.ElemStats>(13);

	public Statistics() {
		elemStats.put(C_FUNCTION, new ElemStats(C_FUNCTION));
		elemStats.put(C_VARIABLE, new ElemStats(C_VARIABLE));
		elemStats.put(C_STRUCT, new ElemStats(C_STRUCT));
		elemStats.put(C_STRUCT_FIELD, new ElemStats(C_STRUCT_FIELD));
		elemStats.put(C_ENUM, new ElemStats(C_ENUM));
		elemStats.put(C_ENUM_CONST, new ElemStats(C_ENUM_CONST));
		elemStats.put(C_OPAQUE_TYPE, new ElemStats(C_OPAQUE_TYPE));
		elemStats.put(OBJC_CLASS, new ElemStats(OBJC_CLASS));
		elemStats.put(OBJC_PROTOCOL, new ElemStats(OBJC_PROTOCOL));
		elemStats.put(OBJC_CLASS_METHOD, new ElemStats(OBJC_CLASS_METHOD));
		elemStats.put(OBJC_INSTANCE_METHOD, new ElemStats(OBJC_INSTANCE_METHOD));
		elemStats.put(OBJC_PROPERTY_GETTER, new ElemStats(OBJC_PROPERTY_GETTER));
		elemStats.put(OBJC_PROPERTY_SETTER, new ElemStats(OBJC_PROPERTY_SETTER));
		elemStats.put(CALLBACK, new ElemStats(CALLBACK));
	}

	public void log(String type, String category, String subject, String... reasons) {
		if (type.equals(SKIPPING) || type.equals(FAILED) || type.equals(INCOMPLETE)) {
			StringBuilder bd = new StringBuilder();
			bd.append("<p><b>").append(escHTML(type)).append(":</b> ").append(escHTML(subject))
					.append(" (" + escHTML(category) + ")<br>\n");
			for (String reason : reasons) {
				bd.append("&nbsp;&nbsp;&nbsp;&nbsp;reason: <i>").append(escHTML(reason)).append("</i><br>\n");
			}
			bd.append("</p>\n");
			logs.add(bd.toString());
		}

		elemStats.get(category).push(type);
	}

	private static String escHTML(String v) {
		if (v == null) {
			return null;
		}
		return StringEscapeUtils.escapeHtml4(v);
	}

	public void writeHTMLLogToFile(String path) {
		try {
			final OutputStream os = new FileOutputStream(path);
			final PrintStream printStream = new PrintStream(os);

			printStream.print("<!DOCTYPE html>\n<html>\n<body>\n");
			printStream.print("<h1>NatJGen Log</h1>\n");
			printStream.print("<p><u>Number of logs: " + logs.size() + "</u></p>\n");
			printStream.print("<table border=\"1\">\n");
			printStream.print("<thead>\n");
			ElemStats.printHeader(printStream);
			printStream.print("</thead>\n");
			printStream.print("<tbody>\n");
			elemStats.get(C_FUNCTION).printHTML(printStream);
			elemStats.get(C_VARIABLE).printHTML(printStream);
			elemStats.get(C_STRUCT).printHTML(printStream);
			elemStats.get(C_STRUCT_FIELD).printHTML(printStream);
			elemStats.get(C_ENUM).printHTML(printStream);
			elemStats.get(C_ENUM_CONST).printHTML(printStream);
			elemStats.get(OBJC_CLASS).printHTML(printStream);
			elemStats.get(OBJC_PROTOCOL).printHTML(printStream);
			elemStats.get(OBJC_CLASS_METHOD).printHTML(printStream);
			elemStats.get(OBJC_INSTANCE_METHOD).printHTML(printStream);
			elemStats.get(OBJC_PROPERTY_GETTER).printHTML(printStream);
			elemStats.get(OBJC_PROPERTY_SETTER).printHTML(printStream);
			elemStats.get(CALLBACK).printHTML(printStream);
			printStream.print("</tbody>\n");
			printStream.print("</table>\n");

			for (String log : logs) {
				printStream.print(log);
			}

			printStream.print("</body></html>\n");
			printStream.close();
			os.close();
		} catch (IOException e) {
			LOG.error("Failed to write log!", e);
		}
	}

	public void dumpLogs(PrintStream printStream) {
		if (printStream == null) {
			throw new NullPointerException();
		}
		for (String log : logs) {
			printStream.print(log);
		}
	}

	private static class ElemStats {
		private final String name;

		private int all = 0;
		private int successful = 0;
		private int skipped = 0;
		private int failed = 0;
		private int unavailable = 0;
		private int incomplete = 0;

		private int all_types = 0;
		private int uncertain_types = 0;
		private int resolved_uncertain_types = 0;

		public ElemStats(String name) {
			this.name = name;
		}

		public synchronized void push(String type) {
			if (type.equals(SUCCESS)) {
				++all;
				++successful;
			} else if (type.equals(SKIPPING)) {
				++all;
				++skipped;
			} else if (type.equals(FAILED)) {
				++all;
				++failed;
			} else if (type.equals(UNAVAILABLE)) {
				++all;
				++unavailable;
			} else if (type.equals(INCOMPLETE)) {
				// We don't increment 'all' here
				++incomplete;
			} else if (type.equals(UNAVAILABLE)) {
				++all;
				++unavailable;
			} else if (type.equals(RESOLVED_TYPE)) {
				++all_types;
			} else if (type.equals(UNCERTAIN_TYPE)) {
				++all_types;
				++uncertain_types;
			} else if (type.equals(RESOLVED_UNCERTAIN_TYPE)) {
				++all_types;
				++uncertain_types;
				++resolved_uncertain_types;
			}
		}

		public void printHTML(PrintStream stream) {
			stream.println("<tr>");
			stream.println("<td>" + name + "</td>");
			stream.println("<td>" + all + "</td>");
			stream.println("<td>" + getPercentage(all, successful) + "</td>");
			stream.println("<td>" + getPercentage(all, skipped) + "</td>");
			stream.println("<td>" + getPercentage(all, failed) + "</td>");
			stream.println("<td>" + getPercentage(all, unavailable) + "</td>");
			stream.println("<td>" + getPercentage(all, incomplete) + "</td>");
			stream.println("<td>" + all_types + "</td>");
			stream.println("<td>" + getPercentage(all_types, uncertain_types) + "</td>");
			stream.println("<td>" + getPercentage(uncertain_types, resolved_uncertain_types) + "</td>");
			stream.println("</tr>");
		}

		private String getPercentage(int _sum, int _value) {
			if (_sum != 0) {
				float sum = (float)_sum;
				float value = (float)_value;
				return String.format("%d (%.2f%%)", _value, new Float(value * 100 / sum));
			} else {
				return "-";
			}
		}

		public static void printHeader(PrintStream stream) {
			stream.println("<tr>");
			stream.println("<td>Item Category</td>");
			stream.println("<td>Number of Items</td>");
			stream.println("<td>Successful</td>");
			stream.println("<td>Skipped</td>");
			stream.println("<td>Failed</td>");
			stream.println("<td>Unavailable</td>");
			stream.println("<td>Incomplete</td>");
			stream.println("<td>Number of Types</td>");
			stream.println("<td>Uncertain</td>");
			stream.println("<td>Resolved Uncertain</td>");
			stream.println("</tr>");
		}
	}

}
