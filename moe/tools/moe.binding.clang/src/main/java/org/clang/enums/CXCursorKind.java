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

package org.clang.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class CXCursorKind {
	@Generated
	private CXCursorKind() {
	}

	@Generated
	public static final int UnexposedDecl = 0x00000001;
	@Generated
	public static final int StructDecl = 0x00000002;
	@Generated
	public static final int UnionDecl = 0x00000003;
	@Generated
	public static final int ClassDecl = 0x00000004;
	@Generated
	public static final int EnumDecl = 0x00000005;
	@Generated
	public static final int FieldDecl = 0x00000006;
	@Generated
	public static final int EnumConstantDecl = 0x00000007;
	@Generated
	public static final int FunctionDecl = 0x00000008;
	@Generated
	public static final int VarDecl = 0x00000009;
	@Generated
	public static final int ParmDecl = 0x0000000A;
	@Generated
	public static final int ObjCInterfaceDecl = 0x0000000B;
	@Generated
	public static final int ObjCCategoryDecl = 0x0000000C;
	@Generated
	public static final int ObjCProtocolDecl = 0x0000000D;
	@Generated
	public static final int ObjCPropertyDecl = 0x0000000E;
	@Generated
	public static final int ObjCIvarDecl = 0x0000000F;
	@Generated
	public static final int ObjCInstanceMethodDecl = 0x00000010;
	@Generated
	public static final int ObjCClassMethodDecl = 0x00000011;
	@Generated
	public static final int ObjCImplementationDecl = 0x00000012;
	@Generated
	public static final int ObjCCategoryImplDecl = 0x00000013;
	@Generated
	public static final int TypedefDecl = 0x00000014;
	@Generated
	public static final int CXXMethod = 0x00000015;
	@Generated
	public static final int Namespace = 0x00000016;
	@Generated
	public static final int LinkageSpec = 0x00000017;
	@Generated
	public static final int Constructor = 0x00000018;
	@Generated
	public static final int Destructor = 0x00000019;
	@Generated
	public static final int ConversionFunction = 0x0000001A;
	@Generated
	public static final int TemplateTypeParameter = 0x0000001B;
	@Generated
	public static final int NonTypeTemplateParameter = 0x0000001C;
	@Generated
	public static final int TemplateTemplateParameter = 0x0000001D;
	@Generated
	public static final int FunctionTemplate = 0x0000001E;
	@Generated
	public static final int ClassTemplate = 0x0000001F;
	@Generated
	public static final int ClassTemplatePartialSpecialization = 0x00000020;
	@Generated
	public static final int NamespaceAlias = 0x00000021;
	@Generated
	public static final int UsingDirective = 0x00000022;
	@Generated
	public static final int UsingDeclaration = 0x00000023;
	@Generated
	public static final int TypeAliasDecl = 0x00000024;
	@Generated
	public static final int ObjCSynthesizeDecl = 0x00000025;
	@Generated
	public static final int ObjCDynamicDecl = 0x00000026;
	@Generated
	public static final int CXXAccessSpecifier = 0x00000027;
	@Generated
	public static final int FirstDecl = 0x00000001;
	@Generated
	public static final int LastDecl = 0x00000027;
	@Generated
	public static final int FirstRef = 0x00000028;
	@Generated
	public static final int ObjCSuperClassRef = 0x00000028;
	@Generated
	public static final int ObjCProtocolRef = 0x00000029;
	@Generated
	public static final int ObjCClassRef = 0x0000002A;
	@Generated
	public static final int TypeRef = 0x0000002B;
	@Generated
	public static final int CXXBaseSpecifier = 0x0000002C;
	@Generated
	public static final int TemplateRef = 0x0000002D;
	@Generated
	public static final int NamespaceRef = 0x0000002E;
	@Generated
	public static final int MemberRef = 0x0000002F;
	@Generated
	public static final int LabelRef = 0x00000030;
	@Generated
	public static final int OverloadedDeclRef = 0x00000031;
	@Generated
	public static final int VariableRef = 0x00000032;
	@Generated
	public static final int LastRef = 0x00000032;
	@Generated
	public static final int FirstInvalid = 0x00000046;
	@Generated
	public static final int InvalidFile = 0x00000046;
	@Generated
	public static final int NoDeclFound = 0x00000047;
	@Generated
	public static final int NotImplemented = 0x00000048;
	@Generated
	public static final int InvalidCode = 0x00000049;
	@Generated
	public static final int LastInvalid = 0x00000049;
	@Generated
	public static final int FirstExpr = 0x00000064;
	@Generated
	public static final int UnexposedExpr = 0x00000064;
	@Generated
	public static final int DeclRefExpr = 0x00000065;
	@Generated
	public static final int MemberRefExpr = 0x00000066;
	@Generated
	public static final int CallExpr = 0x00000067;
	@Generated
	public static final int ObjCMessageExpr = 0x00000068;
	@Generated
	public static final int BlockExpr = 0x00000069;
	@Generated
	public static final int IntegerLiteral = 0x0000006A;
	@Generated
	public static final int FloatingLiteral = 0x0000006B;
	@Generated
	public static final int ImaginaryLiteral = 0x0000006C;
	@Generated
	public static final int StringLiteral = 0x0000006D;
	@Generated
	public static final int CharacterLiteral = 0x0000006E;
	@Generated
	public static final int ParenExpr = 0x0000006F;
	@Generated
	public static final int UnaryOperator = 0x00000070;
	@Generated
	public static final int ArraySubscriptExpr = 0x00000071;
	@Generated
	public static final int BinaryOperator = 0x00000072;
	@Generated
	public static final int CompoundAssignOperator = 0x00000073;
	@Generated
	public static final int ConditionalOperator = 0x00000074;
	@Generated
	public static final int CStyleCastExpr = 0x00000075;
	@Generated
	public static final int CompoundLiteralExpr = 0x00000076;
	@Generated
	public static final int InitListExpr = 0x00000077;
	@Generated
	public static final int AddrLabelExpr = 0x00000078;
	@Generated
	public static final int StmtExpr = 0x00000079;
	@Generated
	public static final int GenericSelectionExpr = 0x0000007A;
	@Generated
	public static final int GNUNullExpr = 0x0000007B;
	@Generated
	public static final int CXXStaticCastExpr = 0x0000007C;
	@Generated
	public static final int CXXDynamicCastExpr = 0x0000007D;
	@Generated
	public static final int CXXReinterpretCastExpr = 0x0000007E;
	@Generated
	public static final int CXXConstCastExpr = 0x0000007F;
	@Generated
	public static final int CXXFunctionalCastExpr = 0x00000080;
	@Generated
	public static final int CXXTypeidExpr = 0x00000081;
	@Generated
	public static final int CXXBoolLiteralExpr = 0x00000082;
	@Generated
	public static final int CXXNullPtrLiteralExpr = 0x00000083;
	@Generated
	public static final int CXXThisExpr = 0x00000084;
	@Generated
	public static final int CXXThrowExpr = 0x00000085;
	@Generated
	public static final int CXXNewExpr = 0x00000086;
	@Generated
	public static final int CXXDeleteExpr = 0x00000087;
	@Generated
	public static final int UnaryExpr = 0x00000088;
	@Generated
	public static final int ObjCStringLiteral = 0x00000089;
	@Generated
	public static final int ObjCEncodeExpr = 0x0000008A;
	@Generated
	public static final int ObjCSelectorExpr = 0x0000008B;
	@Generated
	public static final int ObjCProtocolExpr = 0x0000008C;
	@Generated
	public static final int ObjCBridgedCastExpr = 0x0000008D;
	@Generated
	public static final int PackExpansionExpr = 0x0000008E;
	@Generated
	public static final int SizeOfPackExpr = 0x0000008F;
	@Generated
	public static final int LambdaExpr = 0x00000090;
	@Generated
	public static final int ObjCBoolLiteralExpr = 0x00000091;
	@Generated
	public static final int ObjCSelfExpr = 0x00000092;
	@Generated
	public static final int LastExpr = 0x00000092;
	@Generated
	public static final int FirstStmt = 0x000000C8;
	@Generated
	public static final int UnexposedStmt = 0x000000C8;
	@Generated
	public static final int LabelStmt = 0x000000C9;
	@Generated
	public static final int CompoundStmt = 0x000000CA;
	@Generated
	public static final int CaseStmt = 0x000000CB;
	@Generated
	public static final int DefaultStmt = 0x000000CC;
	@Generated
	public static final int IfStmt = 0x000000CD;
	@Generated
	public static final int SwitchStmt = 0x000000CE;
	@Generated
	public static final int WhileStmt = 0x000000CF;
	@Generated
	public static final int DoStmt = 0x000000D0;
	@Generated
	public static final int ForStmt = 0x000000D1;
	@Generated
	public static final int GotoStmt = 0x000000D2;
	@Generated
	public static final int IndirectGotoStmt = 0x000000D3;
	@Generated
	public static final int ContinueStmt = 0x000000D4;
	@Generated
	public static final int BreakStmt = 0x000000D5;
	@Generated
	public static final int ReturnStmt = 0x000000D6;
	@Generated
	public static final int GCCAsmStmt = 0x000000D7;
	@Generated
	public static final int AsmStmt = 0x000000D7;
	@Generated
	public static final int ObjCAtTryStmt = 0x000000D8;
	@Generated
	public static final int ObjCAtCatchStmt = 0x000000D9;
	@Generated
	public static final int ObjCAtFinallyStmt = 0x000000DA;
	@Generated
	public static final int ObjCAtThrowStmt = 0x000000DB;
	@Generated
	public static final int ObjCAtSynchronizedStmt = 0x000000DC;
	@Generated
	public static final int ObjCAutoreleasePoolStmt = 0x000000DD;
	@Generated
	public static final int ObjCForCollectionStmt = 0x000000DE;
	@Generated
	public static final int CXXCatchStmt = 0x000000DF;
	@Generated
	public static final int CXXTryStmt = 0x000000E0;
	@Generated
	public static final int CXXForRangeStmt = 0x000000E1;
	@Generated
	public static final int SEHTryStmt = 0x000000E2;
	@Generated
	public static final int SEHExceptStmt = 0x000000E3;
	@Generated
	public static final int SEHFinallyStmt = 0x000000E4;
	@Generated
	public static final int MSAsmStmt = 0x000000E5;
	@Generated
	public static final int NullStmt = 0x000000E6;
	@Generated
	public static final int DeclStmt = 0x000000E7;
	@Generated
	public static final int OMPParallelDirective = 0x000000E8;
	@Generated
	public static final int OMPSimdDirective = 0x000000E9;
	@Generated
	public static final int OMPForDirective = 0x000000EA;
	@Generated
	public static final int OMPSectionsDirective = 0x000000EB;
	@Generated
	public static final int OMPSectionDirective = 0x000000EC;
	@Generated
	public static final int OMPSingleDirective = 0x000000ED;
	@Generated
	public static final int OMPParallelForDirective = 0x000000EE;
	@Generated
	public static final int OMPParallelSectionsDirective = 0x000000EF;
	@Generated
	public static final int OMPTaskDirective = 0x000000F0;
	@Generated
	public static final int OMPMasterDirective = 0x000000F1;
	@Generated
	public static final int OMPCriticalDirective = 0x000000F2;
	@Generated
	public static final int OMPTaskyieldDirective = 0x000000F3;
	@Generated
	public static final int OMPBarrierDirective = 0x000000F4;
	@Generated
	public static final int OMPTaskwaitDirective = 0x000000F5;
	@Generated
	public static final int OMPFlushDirective = 0x000000F6;
	@Generated
	public static final int SEHLeaveStmt = 0x000000F7;
	@Generated
	public static final int OMPOrderedDirective = 0x000000F8;
	@Generated
	public static final int OMPAtomicDirective = 0x000000F9;
	@Generated
	public static final int OMPForSimdDirective = 0x000000FA;
	@Generated
	public static final int OMPParallelForSimdDirective = 0x000000FB;
	@Generated
	public static final int OMPTargetDirective = 0x000000FC;
	@Generated
	public static final int OMPTeamsDirective = 0x000000FD;
	@Generated
	public static final int OMPTaskgroupDirective = 0x000000FE;
	@Generated
	public static final int OMPCancellationPointDirective = 0x000000FF;
	@Generated
	public static final int OMPCancelDirective = 0x00000100;
	@Generated
	public static final int OMPTargetDataDirective = 0x00000101;
	@Generated
	public static final int LastStmt = 0x00000101;
	@Generated
	public static final int TranslationUnit = 0x0000012C;
	@Generated
	public static final int FirstAttr = 0x00000190;
	@Generated
	public static final int UnexposedAttr = 0x00000190;
	@Generated
	public static final int IBActionAttr = 0x00000191;
	@Generated
	public static final int IBOutletAttr = 0x00000192;
	@Generated
	public static final int IBOutletCollectionAttr = 0x00000193;
	@Generated
	public static final int CXXFinalAttr = 0x00000194;
	@Generated
	public static final int CXXOverrideAttr = 0x00000195;
	@Generated
	public static final int AnnotateAttr = 0x00000196;
	@Generated
	public static final int AsmLabelAttr = 0x00000197;
	@Generated
	public static final int PackedAttr = 0x00000198;
	@Generated
	public static final int PureAttr = 0x00000199;
	@Generated
	public static final int ConstAttr = 0x0000019A;
	@Generated
	public static final int NoDuplicateAttr = 0x0000019B;
	@Generated
	public static final int CUDAConstantAttr = 0x0000019C;
	@Generated
	public static final int CUDADeviceAttr = 0x0000019D;
	@Generated
	public static final int CUDAGlobalAttr = 0x0000019E;
	@Generated
	public static final int CUDAHostAttr = 0x0000019F;
	@Generated
	public static final int CUDASharedAttr = 0x000001A0;
	@Generated
	public static final int LastAttr = 0x000001A0;
	@Generated
	public static final int PreprocessingDirective = 0x000001F4;
	@Generated
	public static final int MacroDefinition = 0x000001F5;
	@Generated
	public static final int MacroExpansion = 0x000001F6;
	@Generated
	public static final int MacroInstantiation = 0x000001F6;
	@Generated
	public static final int InclusionDirective = 0x000001F7;
	@Generated
	public static final int FirstPreprocessing = 0x000001F4;
	@Generated
	public static final int LastPreprocessing = 0x000001F7;
	@Generated
	public static final int ModuleImportDecl = 0x00000258;
	@Generated
	public static final int FirstExtraDecl = 0x00000258;
	@Generated
	public static final int LastExtraDecl = 0x00000258;
	@Generated
	public static final int OverloadCandidate = 0x000002BC;
}
