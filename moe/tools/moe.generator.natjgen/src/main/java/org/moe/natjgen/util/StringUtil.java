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

package org.moe.natjgen.util;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.regex.Pattern;

import org.moe.natjgen.JavaRestrictions;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class StringUtil {

	public static final String packageSeparator = ".";
	public static final String lineDelimiter = "\n";

	public static String getJavaPackageFromFilePath(IResource iResource) throws JavaModelException {
		IPath iPath = iResource.getFullPath();
		String s = "";
		IClasspathEntry[] cpes = JavaCore.create(iResource.getProject()).getRawClasspath();
		for (IClasspathEntry cpe : cpes) {
			if (cpe.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
				String srcf = cpe.getPath().toOSString();
				if (iPath.toOSString().startsWith(srcf)) {
					IPath srcfPath = cpe.getPath();
					int startSegment = srcfPath.segmentCount();
					int count = iPath.segmentCount();
					for (int i = startSegment; i < count - 1; i++) {
						s += iPath.segment(i).replaceAll(" ", "");
						if (i < count - 2) {
							s += packageSeparator;
						}
					}
				}
			}
		}
		return s;
	}

	public static String getJavaTypeFromQualifiedName(String qualifiedName) {
		try {
			return qualifiedName.substring(qualifiedName.lastIndexOf(packageSeparator) + 1);
		} catch (Exception e) {
			return qualifiedName;
		}
	}

	public static String getQualifiedNameFromPackageNameAndTypeName(String packageName, String typeName) {
		try {
			return packageName.isEmpty() ? typeName : packageName + StringUtil.packageSeparator + typeName;
		} catch (Exception e) {
			return typeName;
		}
	}

	public static String getQualifiedNameFromResource(IResource r) throws JavaModelException {
		String p = getJavaPackageFromFilePath(r);
		String c = getJavaTypeFromFileName(r.getName());
		return p.length() > 0 ? p + "." + c : c;
	}

	public static String getPathFromJavaPackage(String p) {
		String[] s = p.split(Pattern.quote(packageSeparator));
		String r = "";
		int len = s.length;
		for (int i = 0; i < len; i++) {
			r += s[i];
			if (i < len - 1) {
				r += File.separator;
			}
		}
		return r;
	}

	public static String getJavaTypeFromFileName(String fileName) {
		int idx = fileName.lastIndexOf(".");
		if (idx < 0) {
			return fileName;
		} else {
			return fileName.substring(0, idx);
		}
	}

	public static String getVariableNameFromTypeName(String paramTypeName) {
		String s = paramTypeName.substring(0, 1);
		return s.toLowerCase() + paramTypeName.substring(1);
	}

	public static String getMethodNameFromObjCSelector(String selector) {
		// Get selector components
		String comps[] = selector.split(":");

		// Get new java name
		StringBuilder final_string = new StringBuilder(comps[0]);
		for (int i = 1; i < comps.length; i++) {
			String compi = comps[i];
			if (compi.length() == 0) {
				final_string.append("_");
			} else {
				final_string.append(Character.toUpperCase(compi.charAt(0)));
				final_string.append(compi.substring(1));
			}
		}
		String javaName = final_string.toString();

		// Add '_objc' suffix if special case
		if (JavaRestrictions.isReserved(javaName)) {
			javaName += "_objc";
		}
		return javaName;
	}

	public static String listAsTextSeparatedWith(List<String> l, String separator) {
		String r = "";
		for (String s : l) {
			r += s + separator + " ";
		}
		if (r.endsWith(", ")) {
			r = r.substring(0, r.length() - 2);
		}
		return r;
	}

	public static String loadFileContent(File file) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(file));
			try {
				long len = file.length();
				byte[] bytes = new byte[(int)len];
				dis.readFully(bytes);
				return new String(bytes, "UTF-8");
			} finally {
				dis.close();
			}
		} catch (Exception ex) {
			return null;
		}
	}

	public static void safeToFile(String cnt, File file) {
		try {
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF8"));
			out.append(cnt);
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
