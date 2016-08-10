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

#define __STDC_LIMIT_MACROS
#define __STDC_CONSTANT_MACROS

#include <stdio.h>
#include <stdlib.h> 

#include "clang/AST/Decl.h"
#include "clang/AST/Type.h"

#include "CXIndex_ext.h"

void clang_forceDisableCrashRecovery() {
    if (setenv("LIBCLANG_DISABLE_CRASH_RECOVERY", "1", 1) != 0) {
        fprintf(stderr, "Failed to setenv LIBCLANG_DISABLE_CRASH_RECOVERY=1");
    }
}

int clang_Cursor_isInlined(CXCursor C) {
    if (!clang_isDeclaration(C.kind))
        return 0;
    
    const clang::Decl *D = reinterpret_cast<clang::FunctionDecl*>(const_cast<void*>(C.data[0]));
    if (const clang::FunctionDecl *FD = clang::dyn_cast<clang::FunctionDecl>(D))
        return FD->isInlined() ? 1 : 0;
    
    return 0;
}

int clang_Type_isSignedInteger(CXType CT) {
    clang::QualType T = clang::QualType::getFromOpaquePtr(CT.data[0]);
    return T->isSignedIntegerType() ? 1 : 0;
}

int clang_Type_isUnsignedInteger(CXType CT) {
    clang::QualType T = clang::QualType::getFromOpaquePtr(CT.data[0]);
    return T->isUnsignedIntegerType() ? 1 : 0;
}

int clang_Type_isSignedIntegerOrEnumeration(CXType CT) {
    clang::QualType T = clang::QualType::getFromOpaquePtr(CT.data[0]);
    return T->isSignedIntegerOrEnumerationType() ? 1 : 0;
}

int clang_Type_isUnsignedIntegerOrEnumeration(CXType CT) {
    clang::QualType T = clang::QualType::getFromOpaquePtr(CT.data[0]);
    return T->isUnsignedIntegerOrEnumerationType() ? 1 : 0;
}
