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

import org.clang.enums.CXIdxAttrKind;
import org.clang.struct.CXIdxAttrInfo;
import org.clang.struct.CXIdxDeclInfo;
import org.clang.struct.CXIdxIBOutletCollectionAttrInfo;

import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrUtils;

abstract class AbstractModelEditor implements IModelEditor {

	protected final Indexer indexer;
	protected final int memModel;
	protected final Configuration configuration;

	protected AbstractModelEditor(Indexer indexer, int memModel) {
		if (indexer == null) {
			throw new NullPointerException();
		}
		this.indexer = indexer;
		this.memModel = memModel;
		this.configuration = indexer.getConfiguration();
	}

	/**
	 * Get the Objective-C member attribute for a declaration
	 *
	 * @param decl
	 *            declaration
	 * @return {@link ObjCAttributeInfo} or null if there is none
	 */
	protected static final ObjCAttributeInfo getObjCMemberAttribute(CXIdxDeclInfo decl) {
		ObjCAttributeInfo attrInfo = null;
		int count = decl.numAttributes();
		for (int i = 0; i < count; ++i) {
			// Use element reference here! Underlying structure is not really
			// CXIdxAttrInfo and
			// is greater in size than CXIdxAttrInfo.
			CXIdxAttrInfo info = PtrUtils.getElemRef((Ptr<CXIdxAttrInfo>)decl.attributes().get(i), 0);
			switch (info.kind()) {
			case CXIdxAttrKind.CXIdxAttr_IBAction:
				attrInfo = new ObjCAttributeInfo(ObjCAttributeInfo.IBACTION);
				i = count;
				break;
			case CXIdxAttrKind.CXIdxAttr_IBOutlet:
				attrInfo = new ObjCAttributeInfo(ObjCAttributeInfo.IBOUTLET);
				i = count;
				break;
			case CXIdxAttrKind.CXIdxAttr_IBOutletCollection:
				CXIdxIBOutletCollectionAttrInfo collInfo = info.getIBOutletCollectionAttrInfo();
				attrInfo = new ObjCAttributeInfo(ObjCAttributeInfo.IBOUTLETCOLLECTION,
						collInfo.classCursor().toString());
				i = count;
				break;

			default:
				break;
			}
		}
		return attrInfo;
	}

	final protected Statistics statLog() {
		return indexer.stats;
	}

	final protected TypeLogger typeLog() {
		return indexer.tStats;
	}

	final protected Generator getGenerator() {
		return indexer.getGenerator();
	}

	@Override
	public void preProcess() {
		for (ObjCClassManager manager : getGenerator().getAllObjCClasss()) {
			manager.resetEditorState();
		}
		for (ObjCClassManager manager : getGenerator().getAllObjCProtocols()) {
			manager.resetEditorState();
		}
		for (CEnumManager manager : getGenerator().getAllCEnums()) {
			manager.resetEditorState();
		}
		for (CManager manager : getGenerator().getAllCManagers()) {
			manager.resetEditorState();
		}
	}

	@Override
	public void postProcess() {
		for (ObjCClassManager manager : getGenerator().getAllObjCClasss()) {
			manager.disableUneditedMethods();
		}
		for (ObjCClassManager manager : getGenerator().getAllObjCProtocols()) {
			manager.disableUneditedMethods();
		}
		for (CEnumManager manager : getGenerator().getAllCEnums()) {
			manager.disableUneditedMethods();
		}
		for (CManager manager : getGenerator().getAllCManagers()) {
			manager.disableUneditedMethods();
		}
	}

}
