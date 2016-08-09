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

package org.clang.test;

import org.moe.natj.general.ptr.VoidPtr;
import org.clang.enums.CXCursorKind;
import org.clang.enums.CXIdxEntityKind;
import org.clang.enums.CXIdxObjCContainerKind;
import org.clang.enums.CXIndexOptFlags;
import org.clang.opaque.CXTranslationUnit;
import org.clang.struct.CXIdxDeclInfo;
import org.clang.struct.CXIdxEntityInfo;
import org.clang.struct.CXIdxObjCPropertyDeclInfo;
import org.clang.struct.IndexerCallbacks;
import org.clang.struct.IndexerCallbacks.Function_indexDeclaration;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.clang.c.clang.*;

public class BasicTest {

	private static int indexingResult = 0;

	@BeforeClass
	public static void runTest() {
		long start_time = System.nanoTime();

		String SDK_PATH = null;
		try {
			ProcessBuilder pb = new ProcessBuilder("xcrun", "--sdk", "iphoneos", "--show-sdk-path");
			pb.redirectErrorStream(true);
			Process pr = pb.start();
            InputStream pris = pr.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(pris));
            try {
                String line;
                while ((line = in.readLine()) != null && line.length() > 0) {
                    if (SDK_PATH == null) {
                        SDK_PATH = line;
                    }
				}
                pr.waitFor();
            } finally {
                in.close();
			}
		} catch (Throwable e) {
			e.printStackTrace(System.err);
			Assert.fail(e.getMessage());
		}

		Assert.assertNotNull(SDK_PATH);
		try {
			SDK_PATH = new File(SDK_PATH).getCanonicalPath();
		} catch (IOException e) {
            SDK_PATH = new File(SDK_PATH).getAbsolutePath();
		}

		String file = Util.getPathForTempResource("org/clang/test/BasicTest.m");
		String cmdline[] = new String[] {
                "-x", "objective-c",
				"-arch", "armv7",
				"-fmessage-length=133", "-std=gnu99",
				"-fobjc-arc", "-fpascal-strings", "-DNS_BLOCK_ASSERTIONS=1",
				"-DOBJC_OLD_DISPATCH_PROTOTYPES=0",
                "-isysroot", SDK_PATH,
				"-miphoneos-version-min=8",
		};

		VoidPtr index = clang_createIndex(0, 0);

		CXTranslationUnit tu = clang_parseTranslationUnit(index, file, cmdline, cmdline.length, null, 0, 0);
		VoidPtr iaction = clang_IndexAction_create(index);

		IndexerCallbacks callbacks = new IndexerCallbacks();
		callbacks.setIndexDeclaration(new Function_indexDeclaration() {

			@Override
			public void call_indexDeclaration(VoidPtr arg0, CXIdxDeclInfo arg1) {
				BasicTest.indexDeclaration(arg0, arg1);
			}
		});

		indexingResult = clang_indexTranslationUnit(iaction, null, callbacks, 64,
				CXIndexOptFlags.CXIndexOpt_SuppressWarnings
						| CXIndexOptFlags.CXIndexOpt_SuppressRedundantRefs, tu);

        clang_IndexAction_dispose(iaction);
        clang_disposeTranslationUnit(tu);
        clang_disposeIndex(index);

		long end_time = System.nanoTime();
		System.out.println("Completed in " + ((double)(end_time -  start_time) / 1000000000.0) + "s");
		System.out.println("Callback called " + callback_call_count + " times");
	}

	private static int callback_call_count = 0;

	private static void indexDeclaration(VoidPtr client, CXIdxDeclInfo decl) {
		++callback_call_count;

		if (decl.isImplicit() != 0) return;

		switch(decl.entityInfo().kind()) {
			case CXIdxEntityKind.CXIdxEntity_ObjCClass:
			{
				if (clang_index_getObjCContainerDeclInfo(decl).kind() != CXIdxObjCContainerKind.CXIdxObjCContainer_Interface) break;
				String name = clang_getCursorSpelling(clang_index_getObjCInterfaceDeclInfo(decl).containerInfo().declInfo().cursor()).toString();
				if (name.equals(element_class)) state_class = true;
			}
			break;
			case CXIdxEntityKind.CXIdxEntity_ObjCProtocol:
			{
				if (clang_index_getObjCContainerDeclInfo(decl).kind() != CXIdxObjCContainerKind.CXIdxObjCContainer_Interface) break;
				String name = clang_getCursorSpelling(decl.cursor()).toString();
				if (name.equals(element_protocol)) state_protocol = true;
			}
			break;
			case CXIdxEntityKind.CXIdxEntity_ObjCCategory:
			{
				String name = clang_getCursorSpelling(decl.cursor()).toString();
				String class_name = clang_getCursorSpelling(clang_index_getObjCCategoryDeclInfo(decl).classCursor()).toString();
				if (name.equals(element_category) && class_name.equals(element_class)) state_category = true;
			}
			break;
			case CXIdxEntityKind.CXIdxEntity_ObjCInstanceMethod:
			case CXIdxEntityKind.CXIdxEntity_ObjCClassMethod:
			{
				String container = clang_getCursorSpelling(decl.semanticContainer().cursor()).toString();
				if (!container.equals(element_class) && !container.equals(element_protocol) && !container.equals(element_category)) break;

				boolean isStatic = decl.cursor().kind() == CXCursorKind.ObjCClassMethodDecl;
				String selector = clang_getCursorSpelling(decl.entityInfo().cursor()).toString();

				//Class methods
				if (isStatic && container.equals(element_class)) {
					/**/ if (selector.equals("s" + selector_meth0)) state_meth0 |= method_class;
					else if (selector.equals("s" + selector_meth1)) state_meth1 |= method_class;
					else if (selector.equals("s" + selector_meth2)) state_meth2 |= method_class;
					else if (selector.equals("s" + selector_meth3)) state_meth3 |= method_class;
					else if (selector.equals("s" + selector_meth4)) state_meth4 |= method_class;
					else if (selector.equals("s" + selector_meth5)) state_meth5 |= method_class;
					else if (selector.equals("s" + selector_meth6)) state_meth6 |= method_class;
					else if (selector.equals("s" + selector_meth7)) state_meth7 |= method_class;
					break;
				}

				//Instance methods
				if (!isStatic && container.equals(element_class) && selector.startsWith("m")) {
					/**/ if (selector.equals(selector_meth0)) state_meth0 |= method_instance;
					else if (selector.equals(selector_meth1)) state_meth1 |= method_instance;
					else if (selector.equals(selector_meth2)) state_meth2 |= method_instance;
					else if (selector.equals(selector_meth3)) state_meth3 |= method_instance;
					else if (selector.equals(selector_meth4)) state_meth4 |= method_instance;
					else if (selector.equals(selector_meth5)) state_meth5 |= method_instance;
					else if (selector.equals(selector_meth6)) state_meth6 |= method_instance;
					else if (selector.equals(selector_meth7)) state_meth7 |= method_instance;
					break;
				}

				//Protocol methods in protocol declaration
				if (!isStatic && container.equals(element_protocol) && selector.startsWith("p")) {
					/**/ if (selector.equals("p" + selector_meth0)) state_meth0 |= method_protocol_decl;
					else if (selector.equals("p" + selector_meth1)) state_meth1 |= method_protocol_decl;
					else if (selector.equals("p" + selector_meth2)) state_meth2 |= method_protocol_decl;
					else if (selector.equals("p" + selector_meth3)) state_meth3 |= method_protocol_decl;
					else if (selector.equals("p" + selector_meth4)) state_meth4 |= method_protocol_decl;
					else if (selector.equals("p" + selector_meth5)) state_meth5 |= method_protocol_decl;
					else if (selector.equals("p" + selector_meth6)) state_meth6 |= method_protocol_decl;
					else if (selector.equals("p" + selector_meth7)) state_meth7 |= method_protocol_decl;
					break;
				}

				//Protocol Methods in class declaration
				if (!isStatic && container.equals(element_class) && selector.startsWith("p")) {
					/**/ if (selector.equals("p" + selector_meth0)) state_meth0 |= method_protocol_impl;
					else if (selector.equals("p" + selector_meth1)) state_meth1 |= method_protocol_impl;
					else if (selector.equals("p" + selector_meth2)) state_meth2 |= method_protocol_impl;
					else if (selector.equals("p" + selector_meth3)) state_meth3 |= method_protocol_impl;
					else if (selector.equals("p" + selector_meth4)) state_meth4 |= method_protocol_impl;
					else if (selector.equals("p" + selector_meth5)) state_meth5 |= method_protocol_impl;
					else if (selector.equals("p" + selector_meth6)) state_meth6 |= method_protocol_impl;
					else if (selector.equals("p" + selector_meth7)) state_meth7 |= method_protocol_impl;
					break;
				}

				//Category methods
				if (!isStatic && container.equals(element_category) && selector.startsWith("c")) {
					/**/ if (selector.equals("c" + selector_meth0)) state_meth0 |= method_category;
					else if (selector.equals("c" + selector_meth1)) state_meth1 |= method_category;
					else if (selector.equals("c" + selector_meth2)) state_meth2 |= method_category;
					else if (selector.equals("c" + selector_meth3)) state_meth3 |= method_category;
					else if (selector.equals("c" + selector_meth4)) state_meth4 |= method_category;
					else if (selector.equals("c" + selector_meth5)) state_meth5 |= method_category;
					else if (selector.equals("c" + selector_meth6)) state_meth6 |= method_category;
					else if (selector.equals("c" + selector_meth7)) state_meth7 |= method_category;
					break;
				}

			}
			break;
			case CXIdxEntityKind.CXIdxEntity_ObjCProperty:
			{
				String container = clang_getCursorSpelling(decl.semanticContainer().cursor()).toString();
				if (!container.equals(element_class) && !container.equals(element_protocol)) break;

				String name = clang_getCursorSpelling(decl.cursor()).toString();
				CXIdxObjCPropertyDeclInfo info = clang_index_getObjCPropertyDeclInfo(decl);
				CXIdxEntityInfo getter = info.getter();
				CXIdxEntityInfo setter = info.setter();

				int mask = property_found;
				if (getter == null) mask |= property_error;
				if (setter == null) mask |= property_readonly;

				if (name.equals(property_value)) state_prop_value = mask;
				else if (name.equals(property_string)) state_prop_string = mask;
				else if (name.equals(property_values)) state_prop_values = mask;
				else if (name.equals(property_pString)) {
					if (container.equals(element_class)) {
						state_prop_pString = mask;
					} else {
						state_prop_prot_pString = mask;
					}
				}
			}
			break;
		}
	}

	/* ELEMENT TESTS */
	private static final String element_class = "TestClass";
	private static final String element_protocol = "TestProtocol";
	private static final String element_category = "TestCategory";

	private static boolean state_class = false;
	private static boolean state_protocol = false;
	private static boolean state_category = false;

	@Test
	public void testClassElement() {
		Assert.assertTrue(state_class);
	}

	@Test
	public void testProtocolElement() {
		Assert.assertTrue(state_protocol);
	}

	@Test
	public void testCategoryElement() {
		Assert.assertTrue(state_category);
	}

	/* METHOD TESTS */
	private static final int method_class = 1;
	private static final int method_instance = 2;
	private static final int method_protocol_decl = 4;
	private static final int method_protocol_impl = 8;
	private static final int method_category = 16;

	private static final String selector_meth0 = "meth0";
	private static final String selector_meth1 = "meth1";
	private static final String selector_meth2 = "meth2:";
	private static final String selector_meth3 = "meth3:";
	private static final String selector_meth4 = "meth4::";
	private static final String selector_meth5 = "meth5::";
	private static final String selector_meth6 = "meth6:cont:";
	private static final String selector_meth7 = "meth7:cont:";

	private static int state_meth0 = 0;
	private static int state_meth1 = 0;
	private static int state_meth2 = 0;
	private static int state_meth3 = 0;
	private static int state_meth4 = 0;
	private static int state_meth5 = 0;
	private static int state_meth6 = 0;
	private static int state_meth7 = 0;

	@Test
	public void testIndexResult() {
		Assert.assertEquals(0, indexingResult);
	}

	@Test
	public void testClassMethods() {
		Assert.assertTrue((state_meth0 & method_class) != 0);
		Assert.assertTrue((state_meth1 & method_class) != 0);
		Assert.assertTrue((state_meth2 & method_class) != 0);
		Assert.assertTrue((state_meth3 & method_class) != 0);
		Assert.assertTrue((state_meth4 & method_class) != 0);
		Assert.assertTrue((state_meth5 & method_class) != 0);
		Assert.assertTrue((state_meth6 & method_class) != 0);
		Assert.assertTrue((state_meth7 & method_class) != 0);
	}

	@Test
	public void testInstanceMethods() {
		Assert.assertTrue((state_meth0 & method_instance) != 0);
		Assert.assertTrue((state_meth1 & method_instance) != 0);
		Assert.assertTrue((state_meth2 & method_instance) != 0);
		Assert.assertTrue((state_meth3 & method_instance) != 0);
		Assert.assertTrue((state_meth4 & method_instance) != 0);
		Assert.assertTrue((state_meth5 & method_instance) != 0);
		Assert.assertTrue((state_meth6 & method_instance) != 0);
		Assert.assertTrue((state_meth7 & method_instance) != 0);
	}

	@Test
	public void testProtocolDeclMethods() {
		Assert.assertTrue((state_meth0 & method_protocol_decl) != 0);
		Assert.assertTrue((state_meth1 & method_protocol_decl) != 0);
		Assert.assertTrue((state_meth2 & method_protocol_decl) != 0);
		Assert.assertTrue((state_meth3 & method_protocol_decl) != 0);
		Assert.assertTrue((state_meth4 & method_protocol_decl) != 0);
		Assert.assertTrue((state_meth5 & method_protocol_decl) != 0);
		Assert.assertTrue((state_meth6 & method_protocol_decl) != 0);
		Assert.assertTrue((state_meth7 & method_protocol_decl) != 0);
	}

	@Test
	public void testProtocolImplMethods() {
		Assert.assertTrue((state_meth0 & method_protocol_impl) != 0);
		Assert.assertTrue((state_meth1 & method_protocol_impl) != 0);
		Assert.assertTrue((state_meth2 & method_protocol_impl) != 0);
		Assert.assertTrue((state_meth3 & method_protocol_impl) != 0);
		Assert.assertTrue((state_meth4 & method_protocol_impl) != 0);
		Assert.assertTrue((state_meth5 & method_protocol_impl) != 0);
		Assert.assertTrue((state_meth6 & method_protocol_impl) != 0);
		Assert.assertTrue((state_meth7 & method_protocol_impl) != 0);
	}

	@Test
	public void testCategoryMethods() {
		Assert.assertTrue((state_meth0 & method_category) != 0);
		Assert.assertTrue((state_meth1 & method_category) != 0);
		Assert.assertTrue((state_meth2 & method_category) != 0);
		Assert.assertTrue((state_meth3 & method_category) != 0);
		Assert.assertTrue((state_meth4 & method_category) != 0);
		Assert.assertTrue((state_meth5 & method_category) != 0);
		Assert.assertTrue((state_meth6 & method_category) != 0);
		Assert.assertTrue((state_meth7 & method_category) != 0);
	}

	/* PROPERTY TESTS */
	private static final int property_found = 1;
	private static final int property_readonly = 2;
	private static final int property_error = 4;

	private static final String property_value = "value";
	private static final String property_string = "string";
	private static final String property_values = "values";
	private static final String property_pString = "pString";

	private static int state_prop_value = 0;
	private static int state_prop_string = 0;
	private static int state_prop_values = 0;
	private static int state_prop_pString = 0;
	private static int state_prop_prot_pString = 0;

	@Test
	public void testClassProperies() {
		//state_prop_value
		Assert.assertTrue((state_prop_value & property_found) != 0);
		Assert.assertTrue((state_prop_value & property_readonly) != 0);
		Assert.assertTrue((state_prop_value & property_error) == 0);

		//state_prop_string
		Assert.assertTrue((state_prop_string & property_found) != 0);
		Assert.assertTrue((state_prop_string & property_error) == 0);

		//state_prop_values
		Assert.assertTrue((state_prop_values & property_found) != 0);
		Assert.assertTrue((state_prop_values & property_error) == 0);

		//state_prop_pString
		Assert.assertTrue((state_prop_pString & property_found) != 0);
		Assert.assertTrue((state_prop_pString & property_error) == 0);
	}

	@Test
	public void testProtocolProperies() {
		//state_prop_prot_pString
		Assert.assertTrue((state_prop_prot_pString & property_found) != 0);
		Assert.assertTrue((state_prop_prot_pString & property_error) == 0);
	}

	/* USR TESTS */
	@Ignore
	public void testUSRCreation() {
		//Create USRs
		/*CXString classUSR = USR.createObjCClass("TestClass");
		CXString categoryUSR = USR.createObjCCategory("TestClass", "TestCategory");
		CXString protocolUSR = USR.createObjCProtocol("TestProtocol");
		CXString ivarUSR = USR.createObjCIvar("TestIvar", classUSR);
		CXString classMethodUSR = USR.createObjCMethod("TestClassMethod", 0, classUSR);
		CXString instanceMethodUSR = USR.createObjCMethod("TestInstanceMethod", 1, classUSR);
		CXString propertyUSR = USR.createObjCProperty("TestProperty", classUSR);

		//Check values
		Assert.assertTrue(classUSR.getCString().equals("c:objc(cs)TestClass"));
		Assert.assertTrue(categoryUSR.getCString().equals("c:objc(cy)TestClass@TestCategory"));
		Assert.assertTrue(protocolUSR.getCString().equals("c:objc(pl)TestProtocol"));
		Assert.assertTrue(ivarUSR.getCString().equals("c:@TestIvar"));
		Assert.assertTrue(classMethodUSR.getCString().equals("c:(cm)TestClassMethod"));
		Assert.assertTrue(instanceMethodUSR.getCString().equals("c:(im)TestInstanceMethod"));
		Assert.assertTrue(propertyUSR.getCString().equals("c:(py)TestProperty"));

		//Cleanup
		classUSR.dispose();
		categoryUSR.dispose();
		protocolUSR.dispose();
		ivarUSR.dispose();
		classMethodUSR.dispose();
		instanceMethodUSR.dispose();
		propertyUSR.dispose();*/
	}

}
