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
import java.io.FileWriter;
import java.io.IOException;

import org.clang.struct.CXIdxDeclInfo;
import org.clang.struct.CXIdxEntityInfo;

import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;

public class TypeLogger {

	private final StringBuilder contents;

	public TypeLogger() {
		if ("true".equalsIgnoreCase(System.getProperty("moe.natjgen.typelog.enable", null))) {
			contents = new StringBuilder(16 * 1024);
		} else {
			contents = null;
		}
	}

	@Override
	public String toString() {
		return contents.toString();
	}

	public void saveToFile(File file) throws IOException {
		if (contents == null) {
			return;
		}
		FileWriter writer = new FileWriter(file);
		writer.write(contents.toString());
		writer.close();
	}

	private static class Elem {
		public String ownerParent = "";
		public String ownerParentType = "";
		public String owner;
		public String ownerType;
		public String location = "";
		public String type;
		public String resolvedType;
		public String rootType;
		public String attributes = "";
		public String sourceLocation;

		public void setType(Type type) {
			this.type = type.getTypeSpelling();
			this.resolvedType = type.toString();
			this.rootType = type.isPointer() ? type.getPonierRootType().toString() : type.toString();
		}

		public void setSourceLocation(CXIdxDeclInfo decl) {
			String file = ClangUtil.getFilePath(decl);
			IntPtr line = PtrFactory.newIntReference();
			IntPtr column = PtrFactory.newIntReference();
			decl.cursor().getCursorLocation().getExpansionLocation(null, line, column, null);
			this.sourceLocation = file + ":" + line.getValue() + ":" + column.getValue();
		}
	}

	private void log(Elem elem) {
		contents.append(elem.ownerParent).append(';');
		contents.append(elem.ownerParentType).append(';');
		contents.append(elem.owner).append(';');
		contents.append(elem.ownerType).append(';');
		contents.append(elem.location).append(';');
		contents.append(elem.type).append(';');
		contents.append(elem.resolvedType).append(';');
		contents.append(elem.rootType).append(';');
		contents.append(elem.attributes).append(';');
		contents.append(elem.sourceLocation).append('\n');
	}

	private boolean passesFilter(Type type) {
		return type.getPointerDepth() > 1 || (type.getPointerDepth() == 1 && type.getInnerType().isObjCObject());
	}

	private String getObjCContainerType(ObjCClassManager manager) {
		return (manager instanceof ObjCProtocolManager) ? "objc/protocol" : "objc/class";
	}

	private String getCallableLocationByIndex(int i) {
		if (i == -1) {
			return "ret";
		} else {
			return "arg" + i;
		}
	}

	public void objcProp(ObjCClassManager manager, String name, Type type, CXIdxEntityInfo setter_info,
			CXIdxDeclInfo decl) {
		if (contents == null || manager == null || !passesFilter(type)) {
			return;
		}
		Elem elem = new Elem();
		elem.ownerParent = manager.getOriginalName();
		elem.ownerParentType = getObjCContainerType(manager);
		elem.owner = name;
		elem.ownerType = "objc/property";
		elem.setType(type);
		elem.setSourceLocation(decl);
		elem.attributes = setter_info == null ? "ro" : "rw";
		log(elem);
	}

	public void objcMethod(ObjCClassManager manager, String selector, Type type, int i, boolean isStatic,
			CXIdxDeclInfo decl) {
		if (contents == null || manager == null || !passesFilter(type)) {
			return;
		}
		Elem elem = new Elem();
		elem.ownerParent = manager.getOriginalName();
		elem.ownerParentType = getObjCContainerType(manager);
		elem.owner = selector;
		elem.ownerType = "objc/method";
		elem.setType(type);
		elem.setSourceLocation(decl);
		elem.attributes = isStatic ? "static" : "";
		elem.location = getCallableLocationByIndex(i);
		log(elem);
	}

	public void cFunc(String function_name, Type type, int i, CXIdxDeclInfo decl) {
		if (contents == null || !passesFilter(type)) {
			return;
		}
		Elem elem = new Elem();
		elem.owner = function_name;
		elem.ownerType = "c/function";
		elem.setType(type);
		elem.setSourceLocation(decl);
		elem.location = getCallableLocationByIndex(i);
		log(elem);
	}
}
