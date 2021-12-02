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

/**
 * Describes the kind of entity that a cursor refers to.
 */
@Generated
public final class CXCursorKind {
    /**
     * Declarations
     * A declaration whose specific kind is not exposed via this
     * interface.
     * <p>
     * Unexposed declarations have the same operations as any other kind
     * of declaration; one can extract their location information,
     * spelling, find their definitions, etc. However, the specific kind
     * of the declaration is not reported.
     */
    @Generated public static final int UnexposedDecl = 0x00000001;
    /**
     * A C or C++ struct.
     */
    @Generated public static final int StructDecl = 0x00000002;
    /**
     * A C or C++ union.
     */
    @Generated public static final int UnionDecl = 0x00000003;
    /**
     * A C++ class.
     */
    @Generated public static final int ClassDecl = 0x00000004;
    /**
     * An enumeration.
     */
    @Generated public static final int EnumDecl = 0x00000005;
    /**
     * A field (in C) or non-static data member (in C++) in a
     * struct, union, or C++ class.
     */
    @Generated public static final int FieldDecl = 0x00000006;
    /**
     * An enumerator constant.
     */
    @Generated public static final int EnumConstantDecl = 0x00000007;
    /**
     * A function.
     */
    @Generated public static final int FunctionDecl = 0x00000008;
    /**
     * A variable.
     */
    @Generated public static final int VarDecl = 0x00000009;
    /**
     * A function or method parameter.
     */
    @Generated public static final int ParmDecl = 0x0000000A;
    /**
     * An Objective-C \@interface.
     */
    @Generated public static final int ObjCInterfaceDecl = 0x0000000B;
    /**
     * An Objective-C \@interface for a category.
     */
    @Generated public static final int ObjCCategoryDecl = 0x0000000C;
    /**
     * An Objective-C \@protocol declaration.
     */
    @Generated public static final int ObjCProtocolDecl = 0x0000000D;
    /**
     * An Objective-C \@property declaration.
     */
    @Generated public static final int ObjCPropertyDecl = 0x0000000E;
    /**
     * An Objective-C instance variable.
     */
    @Generated public static final int ObjCIvarDecl = 0x0000000F;
    /**
     * An Objective-C instance method.
     */
    @Generated public static final int ObjCInstanceMethodDecl = 0x00000010;
    /**
     * An Objective-C class method.
     */
    @Generated public static final int ObjCClassMethodDecl = 0x00000011;
    /**
     * An Objective-C \@implementation.
     */
    @Generated public static final int ObjCImplementationDecl = 0x00000012;
    /**
     * An Objective-C \@implementation for a category.
     */
    @Generated public static final int ObjCCategoryImplDecl = 0x00000013;
    /**
     * A typedef.
     */
    @Generated public static final int TypedefDecl = 0x00000014;
    /**
     * A C++ class method.
     */
    @Generated public static final int CXXMethod = 0x00000015;
    /**
     * A C++ namespace.
     */
    @Generated public static final int Namespace = 0x00000016;
    /**
     * A linkage specification, e.g. 'extern "C"'.
     */
    @Generated public static final int LinkageSpec = 0x00000017;
    /**
     * A C++ constructor.
     */
    @Generated public static final int Constructor = 0x00000018;
    /**
     * A C++ destructor.
     */
    @Generated public static final int Destructor = 0x00000019;
    /**
     * A C++ conversion function.
     */
    @Generated public static final int ConversionFunction = 0x0000001A;
    /**
     * A C++ template type parameter.
     */
    @Generated public static final int TemplateTypeParameter = 0x0000001B;
    /**
     * A C++ non-type template parameter.
     */
    @Generated public static final int NonTypeTemplateParameter = 0x0000001C;
    /**
     * A C++ template template parameter.
     */
    @Generated public static final int TemplateTemplateParameter = 0x0000001D;
    /**
     * A C++ function template.
     */
    @Generated public static final int FunctionTemplate = 0x0000001E;
    /**
     * A C++ class template.
     */
    @Generated public static final int ClassTemplate = 0x0000001F;
    /**
     * A C++ class template partial specialization.
     */
    @Generated public static final int ClassTemplatePartialSpecialization = 0x00000020;
    /**
     * A C++ namespace alias declaration.
     */
    @Generated public static final int NamespaceAlias = 0x00000021;
    /**
     * A C++ using directive.
     */
    @Generated public static final int UsingDirective = 0x00000022;
    /**
     * A C++ using declaration.
     */
    @Generated public static final int UsingDeclaration = 0x00000023;
    /**
     * A C++ alias declaration
     */
    @Generated public static final int TypeAliasDecl = 0x00000024;
    /**
     * An Objective-C \@synthesize definition.
     */
    @Generated public static final int ObjCSynthesizeDecl = 0x00000025;
    /**
     * An Objective-C \@dynamic definition.
     */
    @Generated public static final int ObjCDynamicDecl = 0x00000026;
    /**
     * An access specifier.
     */
    @Generated public static final int CXXAccessSpecifier = 0x00000027;
    /**
     * An access specifier.
     */
    @Generated public static final int FirstDecl = 0x00000001;
    /**
     * An access specifier.
     */
    @Generated public static final int LastDecl = 0x00000027;
    /**
     * Decl references
     */
    @Generated public static final int FirstRef = 0x00000028;
    @Generated public static final int ObjCSuperClassRef = 0x00000028;
    @Generated public static final int ObjCProtocolRef = 0x00000029;
    @Generated public static final int ObjCClassRef = 0x0000002A;
    /**
     * A reference to a type declaration.
     * <p>
     * A type reference occurs anywhere where a type is named but not
     * declared. For example, given:
     * <p>
     * \code
     * typedef unsigned size_type;
     * size_type size;
     * \endcode
     * <p>
     * The typedef is a declaration of size_type (CXCursor_TypedefDecl),
     * while the type of the variable "size" is referenced. The cursor
     * referenced by the type of size is the typedef for size_type.
     */
    @Generated public static final int TypeRef = 0x0000002B;
    /**
     * A reference to a type declaration.
     * <p>
     * A type reference occurs anywhere where a type is named but not
     * declared. For example, given:
     * <p>
     * \code
     * typedef unsigned size_type;
     * size_type size;
     * \endcode
     * <p>
     * The typedef is a declaration of size_type (CXCursor_TypedefDecl),
     * while the type of the variable "size" is referenced. The cursor
     * referenced by the type of size is the typedef for size_type.
     */
    @Generated public static final int CXXBaseSpecifier = 0x0000002C;
    /**
     * A reference to a class template, function template, template
     * template parameter, or class template partial specialization.
     */
    @Generated public static final int TemplateRef = 0x0000002D;
    /**
     * A reference to a namespace or namespace alias.
     */
    @Generated public static final int NamespaceRef = 0x0000002E;
    /**
     * A reference to a member of a struct, union, or class that occurs in
     * some non-expression context, e.g., a designated initializer.
     */
    @Generated public static final int MemberRef = 0x0000002F;
    /**
     * A reference to a labeled statement.
     * <p>
     * This cursor kind is used to describe the jump to "start_over" in the
     * goto statement in the following example:
     * <p>
     * \code
     * start_over:
     * ++counter;
     * <p>
     * goto start_over;
     * \endcode
     * <p>
     * A label reference cursor refers to a label statement.
     */
    @Generated public static final int LabelRef = 0x00000030;
    /**
     * A reference to a set of overloaded functions or function templates
     * that has not yet been resolved to a specific function or function template.
     * <p>
     * An overloaded declaration reference cursor occurs in C++ templates where
     * a dependent name refers to a function. For example:
     * <p>
     * \code
     * template<typename T> void swap(T&, T&);
     * <p>
     * struct X { ... };
     * void swap(X&, X&);
     * <p>
     * template<typename T>
     * void reverse(T* first, T* last) {
     * while (first < last - 1) {
     * swap(*first, *--last);
     * ++first;
     * }
     * }
     * <p>
     * struct Y { };
     * void swap(Y&, Y&);
     * \endcode
     * <p>
     * Here, the identifier "swap" is associated with an overloaded declaration
     * reference. In the template definition, "swap" refers to either of the two
     * "swap" functions declared above, so both results will be available. At
     * instantiation time, "swap" may also refer to other functions found via
     * argument-dependent lookup (e.g., the "swap" function at the end of the
     * example).
     * <p>
     * The functions \c clang_getNumOverloadedDecls() and
     * \c clang_getOverloadedDecl() can be used to retrieve the definitions
     * referenced by this cursor.
     */
    @Generated public static final int OverloadedDeclRef = 0x00000031;
    /**
     * A reference to a variable that occurs in some non-expression
     * context, e.g., a C++ lambda capture list.
     */
    @Generated public static final int VariableRef = 0x00000032;
    /**
     * A reference to a variable that occurs in some non-expression
     * context, e.g., a C++ lambda capture list.
     */
    @Generated public static final int LastRef = 0x00000032;
    /**
     * Error conditions
     */
    @Generated public static final int FirstInvalid = 0x00000046;
    /**
     * Error conditions
     */
    @Generated public static final int InvalidFile = 0x00000046;
    /**
     * Error conditions
     */
    @Generated public static final int NoDeclFound = 0x00000047;
    /**
     * Error conditions
     */
    @Generated public static final int NotImplemented = 0x00000048;
    /**
     * Error conditions
     */
    @Generated public static final int InvalidCode = 0x00000049;
    /**
     * Error conditions
     */
    @Generated public static final int LastInvalid = 0x00000049;
    /**
     * Expressions
     */
    @Generated public static final int FirstExpr = 0x00000064;
    /**
     * An expression whose specific kind is not exposed via this
     * interface.
     * <p>
     * Unexposed expressions have the same operations as any other kind
     * of expression; one can extract their location information,
     * spelling, children, etc. However, the specific kind of the
     * expression is not reported.
     */
    @Generated public static final int UnexposedExpr = 0x00000064;
    /**
     * An expression that refers to some value declaration, such
     * as a function, variable, or enumerator.
     */
    @Generated public static final int DeclRefExpr = 0x00000065;
    /**
     * An expression that refers to a member of a struct, union,
     * class, Objective-C class, etc.
     */
    @Generated public static final int MemberRefExpr = 0x00000066;
    /**
     * An expression that calls a function.
     */
    @Generated public static final int CallExpr = 0x00000067;
    /**
     * An expression that sends a message to an Objective-C
     * object or class.
     */
    @Generated public static final int ObjCMessageExpr = 0x00000068;
    /**
     * An expression that represents a block literal.
     */
    @Generated public static final int BlockExpr = 0x00000069;
    /**
     * An integer literal.
     */
    @Generated public static final int IntegerLiteral = 0x0000006A;
    /**
     * A floating point number literal.
     */
    @Generated public static final int FloatingLiteral = 0x0000006B;
    /**
     * An imaginary number literal.
     */
    @Generated public static final int ImaginaryLiteral = 0x0000006C;
    /**
     * A string literal.
     */
    @Generated public static final int StringLiteral = 0x0000006D;
    /**
     * A character literal.
     */
    @Generated public static final int CharacterLiteral = 0x0000006E;
    /**
     * A parenthesized expression, e.g. "(1)".
     * <p>
     * This AST node is only formed if full location information is requested.
     */
    @Generated public static final int ParenExpr = 0x0000006F;
    /**
     * This represents the unary-expression's (except sizeof and
     * alignof).
     */
    @Generated public static final int UnaryOperator = 0x00000070;
    /**
     * [C99 6.5.2.1] Array Subscripting.
     */
    @Generated public static final int ArraySubscriptExpr = 0x00000071;
    /**
     * A builtin binary operation expression such as "x + y" or
     * "x <= y".
     */
    @Generated public static final int BinaryOperator = 0x00000072;
    /**
     * Compound assignment such as "+=".
     */
    @Generated public static final int CompoundAssignOperator = 0x00000073;
    /**
     * The ?: ternary operator.
     */
    @Generated public static final int ConditionalOperator = 0x00000074;
    /**
     * An explicit cast in C (C99 6.5.4) or a C-style cast in C++
     * (C++ [expr.cast]), which uses the syntax (Type)expr.
     * <p>
     * For example: (int)f.
     */
    @Generated public static final int CStyleCastExpr = 0x00000075;
    /**
     * [C99 6.5.2.5]
     */
    @Generated public static final int CompoundLiteralExpr = 0x00000076;
    /**
     * Describes an C or C++ initializer list.
     */
    @Generated public static final int InitListExpr = 0x00000077;
    /**
     * The GNU address of label extension, representing &&label.
     */
    @Generated public static final int AddrLabelExpr = 0x00000078;
    /**
     * This is the GNU Statement Expression extension: ({int X=4; X;})
     */
    @Generated public static final int StmtExpr = 0x00000079;
    /**
     * Represents a C11 generic selection.
     */
    @Generated public static final int GenericSelectionExpr = 0x0000007A;
    /**
     * Implements the GNU __null extension, which is a name for a null
     * pointer constant that has integral type (e.g., int or long) and is the same
     * size and alignment as a pointer.
     * <p>
     * The __null extension is typically only used by system headers, which define
     * NULL as __null in C++ rather than using 0 (which is an integer that may not
     * match the size of a pointer).
     */
    @Generated public static final int GNUNullExpr = 0x0000007B;
    /**
     * C++'s static_cast<> expression.
     */
    @Generated public static final int CXXStaticCastExpr = 0x0000007C;
    /**
     * C++'s dynamic_cast<> expression.
     */
    @Generated public static final int CXXDynamicCastExpr = 0x0000007D;
    /**
     * C++'s reinterpret_cast<> expression.
     */
    @Generated public static final int CXXReinterpretCastExpr = 0x0000007E;
    /**
     * C++'s const_cast<> expression.
     */
    @Generated public static final int CXXConstCastExpr = 0x0000007F;
    /**
     * Represents an explicit C++ type conversion that uses "functional"
     * notion (C++ [expr.type.conv]).
     * <p>
     * Example:
     * \code
     * x = int(0.5);
     * \endcode
     */
    @Generated public static final int CXXFunctionalCastExpr = 0x00000080;
    /**
     * A C++ typeid expression (C++ [expr.typeid]).
     */
    @Generated public static final int CXXTypeidExpr = 0x00000081;
    /**
     * [C++ 2.13.5] C++ Boolean Literal.
     */
    @Generated public static final int CXXBoolLiteralExpr = 0x00000082;
    /**
     * [C++0x 2.14.7] C++ Pointer Literal.
     */
    @Generated public static final int CXXNullPtrLiteralExpr = 0x00000083;
    /**
     * Represents the "this" expression in C++
     */
    @Generated public static final int CXXThisExpr = 0x00000084;
    /**
     * [C++ 15] C++ Throw Expression.
     * <p>
     * This handles 'throw' and 'throw' assignment-expression. When
     * assignment-expression isn't present, Op will be null.
     */
    @Generated public static final int CXXThrowExpr = 0x00000085;
    /**
     * A new expression for memory allocation and constructor calls, e.g:
     * "new CXXNewExpr(foo)".
     */
    @Generated public static final int CXXNewExpr = 0x00000086;
    /**
     * A delete expression for memory deallocation and destructor calls,
     * e.g. "delete[] pArray".
     */
    @Generated public static final int CXXDeleteExpr = 0x00000087;
    /**
     * A unary expression. (noexcept, sizeof, or other traits)
     */
    @Generated public static final int UnaryExpr = 0x00000088;
    /**
     * An Objective-C string literal i.e. @"foo".
     */
    @Generated public static final int ObjCStringLiteral = 0x00000089;
    /**
     * An Objective-C \@encode expression.
     */
    @Generated public static final int ObjCEncodeExpr = 0x0000008A;
    /**
     * An Objective-C \@selector expression.
     */
    @Generated public static final int ObjCSelectorExpr = 0x0000008B;
    /**
     * An Objective-C \@protocol expression.
     */
    @Generated public static final int ObjCProtocolExpr = 0x0000008C;
    /**
     * An Objective-C "bridged" cast expression, which casts between
     * Objective-C pointers and C pointers, transferring ownership in the process.
     * <p>
     * \code
     * NSString *str = (__bridge_transfer NSString *)CFCreateString();
     * \endcode
     */
    @Generated public static final int ObjCBridgedCastExpr = 0x0000008D;
    /**
     * Represents a C++0x pack expansion that produces a sequence of
     * expressions.
     * <p>
     * A pack expansion expression contains a pattern (which itself is an
     * expression) followed by an ellipsis. For example:
     * <p>
     * \code
     * template<typename F, typename ...Types>
     * void forward(F f, Types &&...args) {
     * f(static_cast<Types&&>(args)...);
     * }
     * \endcode
     */
    @Generated public static final int PackExpansionExpr = 0x0000008E;
    /**
     * Represents an expression that computes the length of a parameter
     * pack.
     * <p>
     * \code
     * template<typename ...Types>
     * struct count {
     * static const unsigned value = sizeof...(Types);
     * };
     * \endcode
     */
    @Generated public static final int SizeOfPackExpr = 0x0000008F;
    /**
     * Represents a C++ lambda expression that produces a local function
     * object.
     * <p>
     * \code
     * void abssort(float *x, unsigned N) {
     * std::sort(x, x + N,
     * [](float a, float b) {
     * return std::abs(a) < std::abs(b);
     * });
     * }
     * \endcode
     */
    @Generated public static final int LambdaExpr = 0x00000090;
    /**
     * Objective-c Boolean Literal.
     */
    @Generated public static final int ObjCBoolLiteralExpr = 0x00000091;
    /**
     * Represents the "self" expression in an Objective-C method.
     */
    @Generated public static final int ObjCSelfExpr = 0x00000092;
    /**
     * OpenCL's addrspace_cast<> expression.
     */
    @Generated public static final int LastExpr = 0x00000098;
    /**
     * Statements
     */
    @Generated public static final int FirstStmt = 0x000000C8;
    /**
     * A statement whose specific kind is not exposed via this
     * interface.
     * <p>
     * Unexposed statements have the same operations as any other kind of
     * statement; one can extract their location information, spelling,
     * children, etc. However, the specific kind of the statement is not
     * reported.
     */
    @Generated public static final int UnexposedStmt = 0x000000C8;
    /**
     * A labelled statement in a function.
     * <p>
     * This cursor kind is used to describe the "start_over:" label statement in
     * the following example:
     * <p>
     * \code
     * start_over:
     * ++counter;
     * \endcode
     */
    @Generated public static final int LabelStmt = 0x000000C9;
    /**
     * A group of statements like { stmt stmt }.
     * <p>
     * This cursor kind is used to describe compound statements, e.g. function
     * bodies.
     */
    @Generated public static final int CompoundStmt = 0x000000CA;
    /**
     * A case statement.
     */
    @Generated public static final int CaseStmt = 0x000000CB;
    /**
     * A default statement.
     */
    @Generated public static final int DefaultStmt = 0x000000CC;
    /**
     * An if statement
     */
    @Generated public static final int IfStmt = 0x000000CD;
    /**
     * A switch statement.
     */
    @Generated public static final int SwitchStmt = 0x000000CE;
    /**
     * A while statement.
     */
    @Generated public static final int WhileStmt = 0x000000CF;
    /**
     * A do statement.
     */
    @Generated public static final int DoStmt = 0x000000D0;
    /**
     * A for statement.
     */
    @Generated public static final int ForStmt = 0x000000D1;
    /**
     * A goto statement.
     */
    @Generated public static final int GotoStmt = 0x000000D2;
    /**
     * An indirect goto statement.
     */
    @Generated public static final int IndirectGotoStmt = 0x000000D3;
    /**
     * A continue statement.
     */
    @Generated public static final int ContinueStmt = 0x000000D4;
    /**
     * A break statement.
     */
    @Generated public static final int BreakStmt = 0x000000D5;
    /**
     * A return statement.
     */
    @Generated public static final int ReturnStmt = 0x000000D6;
    /**
     * A GCC inline assembly statement extension.
     */
    @Generated public static final int GCCAsmStmt = 0x000000D7;
    /**
     * A GCC inline assembly statement extension.
     */
    @Generated public static final int AsmStmt = 0x000000D7;
    /**
     * Objective-C's overall \@try-\@catch-\@finally statement.
     */
    @Generated public static final int ObjCAtTryStmt = 0x000000D8;
    /**
     * Objective-C's \@catch statement.
     */
    @Generated public static final int ObjCAtCatchStmt = 0x000000D9;
    /**
     * Objective-C's \@finally statement.
     */
    @Generated public static final int ObjCAtFinallyStmt = 0x000000DA;
    /**
     * Objective-C's \@throw statement.
     */
    @Generated public static final int ObjCAtThrowStmt = 0x000000DB;
    /**
     * Objective-C's \@synchronized statement.
     */
    @Generated public static final int ObjCAtSynchronizedStmt = 0x000000DC;
    /**
     * Objective-C's autorelease pool statement.
     */
    @Generated public static final int ObjCAutoreleasePoolStmt = 0x000000DD;
    /**
     * Objective-C's collection statement.
     */
    @Generated public static final int ObjCForCollectionStmt = 0x000000DE;
    /**
     * C++'s catch statement.
     */
    @Generated public static final int CXXCatchStmt = 0x000000DF;
    /**
     * C++'s try statement.
     */
    @Generated public static final int CXXTryStmt = 0x000000E0;
    /**
     * C++'s for (* : *) statement.
     */
    @Generated public static final int CXXForRangeStmt = 0x000000E1;
    /**
     * Windows Structured Exception Handling's try statement.
     */
    @Generated public static final int SEHTryStmt = 0x000000E2;
    /**
     * Windows Structured Exception Handling's except statement.
     */
    @Generated public static final int SEHExceptStmt = 0x000000E3;
    /**
     * Windows Structured Exception Handling's finally statement.
     */
    @Generated public static final int SEHFinallyStmt = 0x000000E4;
    /**
     * A MS inline assembly statement extension.
     */
    @Generated public static final int MSAsmStmt = 0x000000E5;
    /**
     * The null statement ";": C99 6.8.3p3.
     * <p>
     * This cursor kind is used to describe the null statement.
     */
    @Generated public static final int NullStmt = 0x000000E6;
    /**
     * Adaptor class for mixing declarations with statements and
     * expressions.
     */
    @Generated public static final int DeclStmt = 0x000000E7;
    /**
     * OpenMP parallel directive.
     */
    @Generated public static final int OMPParallelDirective = 0x000000E8;
    /**
     * OpenMP SIMD directive.
     */
    @Generated public static final int OMPSimdDirective = 0x000000E9;
    /**
     * OpenMP for directive.
     */
    @Generated public static final int OMPForDirective = 0x000000EA;
    /**
     * OpenMP sections directive.
     */
    @Generated public static final int OMPSectionsDirective = 0x000000EB;
    /**
     * OpenMP section directive.
     */
    @Generated public static final int OMPSectionDirective = 0x000000EC;
    /**
     * OpenMP single directive.
     */
    @Generated public static final int OMPSingleDirective = 0x000000ED;
    /**
     * OpenMP parallel for directive.
     */
    @Generated public static final int OMPParallelForDirective = 0x000000EE;
    /**
     * OpenMP parallel sections directive.
     */
    @Generated public static final int OMPParallelSectionsDirective = 0x000000EF;
    /**
     * OpenMP task directive.
     */
    @Generated public static final int OMPTaskDirective = 0x000000F0;
    /**
     * OpenMP master directive.
     */
    @Generated public static final int OMPMasterDirective = 0x000000F1;
    /**
     * OpenMP critical directive.
     */
    @Generated public static final int OMPCriticalDirective = 0x000000F2;
    /**
     * OpenMP taskyield directive.
     */
    @Generated public static final int OMPTaskyieldDirective = 0x000000F3;
    /**
     * OpenMP barrier directive.
     */
    @Generated public static final int OMPBarrierDirective = 0x000000F4;
    /**
     * OpenMP taskwait directive.
     */
    @Generated public static final int OMPTaskwaitDirective = 0x000000F5;
    /**
     * OpenMP flush directive.
     */
    @Generated public static final int OMPFlushDirective = 0x000000F6;
    /**
     * Windows Structured Exception Handling's leave statement.
     */
    @Generated public static final int SEHLeaveStmt = 0x000000F7;
    /**
     * OpenMP ordered directive.
     */
    @Generated public static final int OMPOrderedDirective = 0x000000F8;
    /**
     * OpenMP atomic directive.
     */
    @Generated public static final int OMPAtomicDirective = 0x000000F9;
    /**
     * OpenMP for SIMD directive.
     */
    @Generated public static final int OMPForSimdDirective = 0x000000FA;
    /**
     * OpenMP parallel for SIMD directive.
     */
    @Generated public static final int OMPParallelForSimdDirective = 0x000000FB;
    /**
     * OpenMP target directive.
     */
    @Generated public static final int OMPTargetDirective = 0x000000FC;
    /**
     * OpenMP teams directive.
     */
    @Generated public static final int OMPTeamsDirective = 0x000000FD;
    /**
     * OpenMP taskgroup directive.
     */
    @Generated public static final int OMPTaskgroupDirective = 0x000000FE;
    /**
     * OpenMP cancellation point directive.
     */
    @Generated public static final int OMPCancellationPointDirective = 0x000000FF;
    /**
     * OpenMP cancel directive.
     */
    @Generated public static final int OMPCancelDirective = 0x00000100;
    /**
     * OpenMP target data directive.
     */
    @Generated public static final int OMPTargetDataDirective = 0x00000101;
    /**
     * OpenMP unroll directive.
     */
    @Generated public static final int LastStmt = 0x00000125;
    /**
     * Cursor that represents the translation unit itself.
     * <p>
     * The translation unit cursor exists primarily to act as the root
     * cursor for traversing the contents of a translation unit.
     */
    @Generated public static final int TranslationUnit = 0x0000012C;
    /**
     * Attributes
     */
    @Generated public static final int FirstAttr = 0x00000190;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int UnexposedAttr = 0x00000190;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int IBActionAttr = 0x00000191;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int IBOutletAttr = 0x00000192;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int IBOutletCollectionAttr = 0x00000193;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int CXXFinalAttr = 0x00000194;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int CXXOverrideAttr = 0x00000195;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int AnnotateAttr = 0x00000196;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int AsmLabelAttr = 0x00000197;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int PackedAttr = 0x00000198;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int PureAttr = 0x00000199;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ConstAttr = 0x0000019A;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int NoDuplicateAttr = 0x0000019B;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int CUDAConstantAttr = 0x0000019C;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int CUDADeviceAttr = 0x0000019D;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int CUDAGlobalAttr = 0x0000019E;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int CUDAHostAttr = 0x0000019F;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int CUDASharedAttr = 0x000001A0;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int LastAttr = 0x000001B9;
    /**
     * Preprocessing
     */
    @Generated public static final int PreprocessingDirective = 0x000001F4;
    /**
     * Preprocessing
     */
    @Generated public static final int MacroDefinition = 0x000001F5;
    /**
     * Preprocessing
     */
    @Generated public static final int MacroExpansion = 0x000001F6;
    /**
     * Preprocessing
     */
    @Generated public static final int MacroInstantiation = 0x000001F6;
    /**
     * Preprocessing
     */
    @Generated public static final int InclusionDirective = 0x000001F7;
    /**
     * Preprocessing
     */
    @Generated public static final int FirstPreprocessing = 0x000001F4;
    /**
     * Preprocessing
     */
    @Generated public static final int LastPreprocessing = 0x000001F7;
    /**
     * Extra Declarations
     * A module import declaration.
     */
    @Generated public static final int ModuleImportDecl = 0x00000258;
    /**
     * a friend declaration.
     */
    @Generated public static final int FirstExtraDecl = 0x00000258;
    /**
     * a friend declaration.
     */
    @Generated public static final int LastExtraDecl = 0x0000025B;
    /**
     * A code completion overload candidate.
     */
    @Generated public static final int OverloadCandidate = 0x000002BC;
    /**
     * OpenMP 5.0 [2.1.5, Array Section].
     */
    @Generated public static final int OMPArraySectionExpr = 0x00000093;
    /**
     * Represents an @available(...) check.
     */
    @Generated public static final int ObjCAvailabilityCheckExpr = 0x00000094;
    /**
     * OpenMP taskloop directive.
     */
    @Generated public static final int OMPTaskLoopDirective = 0x00000102;
    /**
     * OpenMP taskloop simd directive.
     */
    @Generated public static final int OMPTaskLoopSimdDirective = 0x00000103;
    /**
     * OpenMP distribute directive.
     */
    @Generated public static final int OMPDistributeDirective = 0x00000104;
    /**
     * OpenMP target enter data directive.
     */
    @Generated public static final int OMPTargetEnterDataDirective = 0x00000105;
    /**
     * OpenMP target exit data directive.
     */
    @Generated public static final int OMPTargetExitDataDirective = 0x00000106;
    /**
     * OpenMP target parallel directive.
     */
    @Generated public static final int OMPTargetParallelDirective = 0x00000107;
    /**
     * OpenMP target parallel for directive.
     */
    @Generated public static final int OMPTargetParallelForDirective = 0x00000108;
    /**
     * OpenMP target update directive.
     */
    @Generated public static final int OMPTargetUpdateDirective = 0x00000109;
    /**
     * OpenMP distribute parallel for directive.
     */
    @Generated public static final int OMPDistributeParallelForDirective = 0x0000010A;
    /**
     * OpenMP distribute parallel for simd directive.
     */
    @Generated public static final int OMPDistributeParallelForSimdDirective = 0x0000010B;
    /**
     * OpenMP distribute simd directive.
     */
    @Generated public static final int OMPDistributeSimdDirective = 0x0000010C;
    /**
     * OpenMP target parallel for simd directive.
     */
    @Generated public static final int OMPTargetParallelForSimdDirective = 0x0000010D;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int VisibilityAttr = 0x000001A1;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int DLLExport = 0x000001A2;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int DLLImport = 0x000001A3;
    /**
     * Extra Declarations
     * A module import declaration.
     */
    @Generated public static final int TypeAliasTemplateDecl = 0x00000259;
    /**
     * A static_assert or _Static_assert node
     */
    @Generated public static final int StaticAssert = 0x0000025A;

    @Generated
    private CXCursorKind() {
    }

    /**
     * Fixed point literal
     */
    @Generated public static final int FixedPointLiteral = 0x00000095;
    /**
     * OpenMP 5.0 [2.1.4, Array Shaping].
     */
    @Generated public static final int OMPArrayShapingExpr = 0x00000096;
    /**
     * OpenMP 5.0 [2.1.6 Iterators]
     */
    @Generated public static final int OMPIteratorExpr = 0x00000097;
    /**
     * OpenCL's addrspace_cast<> expression.
     */
    @Generated public static final int CXXAddrspaceCastExpr = 0x00000098;
    /**
     * OpenMP target simd directive.
     */
    @Generated public static final int OMPTargetSimdDirective = 0x0000010E;
    /**
     * OpenMP teams distribute directive.
     */
    @Generated public static final int OMPTeamsDistributeDirective = 0x0000010F;
    /**
     * OpenMP teams distribute simd directive.
     */
    @Generated public static final int OMPTeamsDistributeSimdDirective = 0x00000110;
    /**
     * OpenMP teams distribute parallel for simd directive.
     */
    @Generated public static final int OMPTeamsDistributeParallelForSimdDirective = 0x00000111;
    /**
     * OpenMP teams distribute parallel for directive.
     */
    @Generated public static final int OMPTeamsDistributeParallelForDirective = 0x00000112;
    /**
     * OpenMP target teams directive.
     */
    @Generated public static final int OMPTargetTeamsDirective = 0x00000113;
    /**
     * OpenMP target teams distribute directive.
     */
    @Generated public static final int OMPTargetTeamsDistributeDirective = 0x00000114;
    /**
     * OpenMP target teams distribute parallel for directive.
     */
    @Generated public static final int OMPTargetTeamsDistributeParallelForDirective = 0x00000115;
    /**
     * OpenMP target teams distribute parallel for simd directive.
     */
    @Generated public static final int OMPTargetTeamsDistributeParallelForSimdDirective = 0x00000116;
    /**
     * OpenMP target teams distribute simd directive.
     */
    @Generated public static final int OMPTargetTeamsDistributeSimdDirective = 0x00000117;
    /**
     * C++2a std::bit_cast expression.
     */
    @Generated public static final int BuiltinBitCastExpr = 0x00000118;
    /**
     * OpenMP master taskloop directive.
     */
    @Generated public static final int OMPMasterTaskLoopDirective = 0x00000119;
    /**
     * OpenMP parallel master taskloop directive.
     */
    @Generated public static final int OMPParallelMasterTaskLoopDirective = 0x0000011A;
    /**
     * OpenMP master taskloop simd directive.
     */
    @Generated public static final int OMPMasterTaskLoopSimdDirective = 0x0000011B;
    /**
     * OpenMP parallel master taskloop simd directive.
     */
    @Generated public static final int OMPParallelMasterTaskLoopSimdDirective = 0x0000011C;
    /**
     * OpenMP parallel master directive.
     */
    @Generated public static final int OMPParallelMasterDirective = 0x0000011D;
    /**
     * OpenMP depobj directive.
     */
    @Generated public static final int OMPDepobjDirective = 0x0000011E;
    /**
     * OpenMP scan directive.
     */
    @Generated public static final int OMPScanDirective = 0x0000011F;
    /**
     * OpenMP tile directive.
     */
    @Generated public static final int OMPTileDirective = 0x00000120;
    /**
     * OpenMP canonical loop.
     */
    @Generated public static final int OMPCanonicalLoop = 0x00000121;
    /**
     * OpenMP interop directive.
     */
    @Generated public static final int OMPInteropDirective = 0x00000122;
    /**
     * OpenMP dispatch directive.
     */
    @Generated public static final int OMPDispatchDirective = 0x00000123;
    /**
     * OpenMP masked directive.
     */
    @Generated public static final int OMPMaskedDirective = 0x00000124;
    /**
     * OpenMP unroll directive.
     */
    @Generated public static final int OMPUnrollDirective = 0x00000125;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int NSReturnsRetained = 0x000001A4;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int NSReturnsNotRetained = 0x000001A5;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int NSReturnsAutoreleased = 0x000001A6;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int NSConsumesSelf = 0x000001A7;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int NSConsumed = 0x000001A8;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCException = 0x000001A9;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCNSObject = 0x000001AA;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCIndependentClass = 0x000001AB;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCPreciseLifetime = 0x000001AC;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCReturnsInnerPointer = 0x000001AD;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCRequiresSuper = 0x000001AE;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCRootClass = 0x000001AF;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCSubclassingRestricted = 0x000001B0;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCExplicitProtocolImpl = 0x000001B1;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCDesignatedInitializer = 0x000001B2;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCRuntimeVisible = 0x000001B3;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ObjCBoxable = 0x000001B4;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int FlagEnum = 0x000001B5;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int ConvergentAttr = 0x000001B6;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int WarnUnusedAttr = 0x000001B7;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int WarnUnusedResultAttr = 0x000001B8;
    /**
     * An attribute whose specific kind is not exposed via this
     * interface.
     */
    @Generated public static final int AlignedAttr = 0x000001B9;
    /**
     * a friend declaration.
     */
    @Generated public static final int FriendDecl = 0x0000025B;
}
