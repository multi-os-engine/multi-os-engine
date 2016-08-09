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

import org.clang.struct.CXIdxDeclInfo;

interface IModelEditor {

	/**
	 * Process declaration of an Objective-C class
	 * 
	 * @param decl
	 *            declaration
	 */
	void processObjCClass(CXIdxDeclInfo decl);

	/**
	 * Process declaration of an Objective-C category
	 * 
	 * @param decl
	 *            declaration
	 */
	void processObjCCategory(CXIdxDeclInfo decl);

	/**
	 * Process declaration of an Objective-C protocol
	 * 
	 * @param decl
	 *            declaration
	 */
	void processObjCProtocol(CXIdxDeclInfo decl);

	/**
	 * Process declaration of an Objective-C instance/class method
	 * 
	 * @param decl
	 *            declaration
	 */
	void processObjCMethod(CXIdxDeclInfo decl);

	/**
	 * Process declaration of an Objective-C property
	 * 
	 * @param decl
	 *            declaration
	 */
	void processObjCProperty(CXIdxDeclInfo decl);

	/**
	 * Process declaration of a C struct
	 * 
	 * @param decl
	 *            declaration
	 */
	void processStruct(CXIdxDeclInfo decl);

	/**
	 * Process declaration of a C struct's field
	 * 
	 * @param decl
	 *            declaration
	 */
	void processField(CXIdxDeclInfo decl);

	/**
	 * Process declaration of a C enum
	 * 
	 * @param decl
	 *            declaration
	 */
	void processEnum(CXIdxDeclInfo decl);

	/**
	 * Process declaration of a C enum's constant
	 * 
	 * @param decl
	 *            declaration
	 */
	void processEnumConstant(CXIdxDeclInfo decl);

	/**
	 * Process declaration of a C function
	 * 
	 * @param decl
	 *            declaration
	 */
	void processFunction(CXIdxDeclInfo decl);

	/**
	 * Process declaration of a C global variable
	 * 
	 * @param decl
	 *            declaration
	 */
	void processVariable(CXIdxDeclInfo decl);

	/**
	 * Process declaration of typedef
	 * 
	 * @param decl
	 *            declaration
	 */
	void processTypedef(CXIdxDeclInfo decl);

	/**
	 * Call this before any processing.
	 */
	void preProcess();

	/**
	 * Call this after any processing.
	 */
	void postProcess();

}
