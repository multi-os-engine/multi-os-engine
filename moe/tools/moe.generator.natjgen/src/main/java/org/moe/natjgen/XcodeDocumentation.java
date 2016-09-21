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

import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.text.edits.TextEditGroup;

import java.io.IOException;
import java.util.ArrayList;

public class XcodeDocumentation {

    public static final String DocCLanguage = "C";
    public static final String DocObjectiveCLanguage = "Objective-C";

    public static final String DocFunctionType = "func";
    public static final String DocMacroType = "macro";

    public static final String DocClassMethodType = "clm";
    public static final String DocInstanceMethodType = "instm";
    public static final String DocInstancePropertyType = "instp";
    public static final String DocInterfaceClassMethodType = "intfcm";
    public static final String DocInterfaceMethodType = "intfm";
    public static final String DocInterfacePropertyType = "intfp";

    interface IXcodeDocumenrationImpl {
        Javadoc getJavaDoc(ASTRewrite rewrite, ArrayList<CalleeArgument> args);
    }

    private final IXcodeDocumenrationImpl impl;

    public XcodeDocumentation(Indexer indexer, String lang, String type, String element, String name,
            TextEditGroup editGroup) throws IOException {
        if ("true".equals(System.getProperty("moe.natjgen.doc.full", "false"))) {
            impl = new XcodeFullDocumentation(indexer, lang, type, element, name, editGroup);
        } else {
            impl = new XcodeLinkedDocumentation(indexer, lang, type, element, name, editGroup);
        }
    }

    public Javadoc getJavaDoc(ASTRewrite rewrite, ArrayList<CalleeArgument> args) {
        return impl.getJavaDoc(rewrite, args);
    }

}
