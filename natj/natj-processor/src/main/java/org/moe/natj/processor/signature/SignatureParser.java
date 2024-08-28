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

package org.moe.natj.processor.signature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Signature parser class.
 * <p/>
 * Reference: <a href="https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.9.1">Signatures</a>
 */
public class SignatureParser {

    private final Buffer buffer;

    private SignatureParser(String signature) {
        buffer = new Buffer(signature);
    }

    private static class Buffer {
        private final char[] data;
        private int position = 0;

        Buffer(String signature) {
            if (signature == null) {
                throw new NullPointerException();
            }
            data = signature.toCharArray();
        }

        private char get() {
            return data[position];
        }

        private boolean is(char c) {
            return position < data.length && data[position] == c;
        }

        private void assertIsAndAdvance(char c) {
            if (!is(c)) throwSignatureParserException();
            adv();
        }

        private void adv() {
            ++position;
        }

        private int getPosition() {
            return position;
        }

        private void setPosition(int position) {
            this.position = position;
        }

        private boolean isIdentifier() {
            final char c = get();
            switch (c) {
                case '.':
                case ';':
                case '[':
                case '/':
                case '<':
                case '>':
                case ':':
                    return false;
                default:
                    return true;
            }
        }

        private boolean isEOS() {
            return data.length == position;
        }

        private void throwSignatureParserException() {
            final int blen = Math.min(20, position);
            final int alen = Math.min(20, data.length - (position + 1));
            final String before = new String(data, position - blen, blen);
            final String after = new String(data, position + 1, alen);
            throw new SignatureParserException("Before: '" + before + "', Current: '" + get() + "', After: '" +
                    after + "'");
        }
    }

    private boolean isJavaTypeSignature() {
        return isReferenceTypeSignature() || isBaseType();
    }

    public static JavaTypeSignature parseJavaTypeSignature(String signature) {
        return new SignatureParser(signature).parseJavaTypeSignature();
    }

    /**
     * JavaTypeSignature:
     * - ReferenceTypeSignature
     * - BaseType
     */
    private JavaTypeSignature parseJavaTypeSignature() {
        if (isReferenceTypeSignature()) {
            return parseReferenceTypeSignature();
        } else if (isBaseType()) {
            return parseBaseType();
        } else {
            buffer.throwSignatureParserException();
            throw new IllegalStateException();
        }
    }

    private boolean isBaseType() {
        if (buffer.isEOS()) {
            return false;
        }
        final char c = buffer.get();
        switch (c) {
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'I':
            case 'J':
            case 'S':
            case 'Z':
                return true;
            default:
                return false;
        }
    }

    /**
     * BaseType:
     * - (one of)
     * - B C D F I J S Z
     */
    private BaseType parseBaseType() {
        if (!isBaseType()) {
            buffer.throwSignatureParserException();
        }
        final char c = buffer.get();
        buffer.adv();
        return new BaseType(c);
    }

    private boolean isReferenceTypeSignature() {
        return isClassTypeSignature() || isTypeVariableSignature() || isArrayTypeSignature();
    }

    /**
     * ReferenceTypeSignature:
     * - ClassTypeSignature
     * - TypeVariableSignature
     * - ArrayTypeSignature
     */
    private ReferenceTypeSignature parseReferenceTypeSignature() {
        if (isClassTypeSignature()) {
            return parseClassTypeSignature();
        } else if (isTypeVariableSignature()) {
            return parseTypeVariableSignature();
        } else if (isArrayTypeSignature()) {
            return parseArrayTypeSignature();
        } else {
            buffer.throwSignatureParserException();
            throw new IllegalStateException();
        }
    }

    private boolean isClassTypeSignature() {
        return buffer.is('L');
    }

    public static ClassTypeSignature parseClassTypeSignature(String signature) {
        return new SignatureParser(signature).parseClassTypeSignature();
    }

    /**
     * ClassTypeSignature:
     * - 'L' [PackageSpecifier] SimpleClassTypeSignature {ClassTypeSignatureSuffix} ';'
     */
    private ClassTypeSignature parseClassTypeSignature() {
        // Assert 'L' prefix and advance
        buffer.assertIsAndAdvance('L');

        // Parse optional <PackageSpecifier>
        final String pkg;
        if (hasPackageSpecifier()) {
            pkg = parsePackageSpecifier();
        } else {
            pkg = "";
        }

        // Parse <SimpleClassTypeSignature>
        List<SimpleClassTypeSignature> simpleClassTypes = new ArrayList<>();
        simpleClassTypes.add(parseSimpleClassTypeSignature());

        // Parse optional <ClassTypeSignatureSuffix>
        while (hasClassTypeSignatureSuffix()) {
            simpleClassTypes.add(parseClassTypeSignatureSuffix());
        }

        // Assert ';' suffix and advance
        buffer.assertIsAndAdvance(';');

        return new ClassTypeSignature(pkg, Collections.unmodifiableList(simpleClassTypes));
    }

    private boolean hasPackageSpecifier() {
        if (!buffer.isIdentifier()) {
            return false;
        }
        final int pos = buffer.getPosition();
        try {
            while (buffer.isIdentifier()) {
                buffer.adv();
            }
            return buffer.is('/');
        } catch (Exception ignore) {
            // Do nothing
        } finally {
            buffer.setPosition(pos);
        }
        return false;
    }

    /**
     * PackageSpecifier:
     * - Identifier / {PackageSpecifier}
     */
    private String parsePackageSpecifier() {
        // Assert is in identifier
        if (!hasPackageSpecifier()) {
            buffer.throwSignatureParserException();
        }

        final StringBuilder pkg = new StringBuilder();
        while (hasPackageSpecifier()) {
            if (pkg.length() > 0) {
                pkg.append('/');
            }

            // Parse <Identifier>
            pkg.append(parseIdentifier());

            // Assert '/' and advance
            buffer.assertIsAndAdvance('/');
        }

        return pkg.toString();
    }

    /**
     * SimpleClassTypeSignature:
     * - Identifier [TypeArguments]
     */
    private SimpleClassTypeSignature parseSimpleClassTypeSignature() {
        // Parse <Identifier>
        final String identifier = parseIdentifier();

        // Parse optional <TypeArguments>
        final List<TypeArgument> typeArguments;
        if (hasTypeArguments()) {
            typeArguments = parseTypeArguments();
        } else {
            typeArguments = Collections.emptyList();
        }

        return new SimpleClassTypeSignature(identifier, typeArguments);
    }

    private boolean hasTypeArguments() {
        return buffer.is('<');
    }

    /**
     * TypeArguments:
     * - '<' TypeArgument {TypeArgument} '>'
     */
    private List<TypeArgument> parseTypeArguments() {
        // Assert '<' prefix and advance
        buffer.assertIsAndAdvance('<');

        // Parse all <TypeArgument>s
        final ArrayList<TypeArgument> arguments = new ArrayList<>();
        arguments.add(parseTypeArgument());
        while (hasTypeArgument()) {
            arguments.add(parseTypeArgument());
        }

        // Assert '>' suffix and advance
        buffer.assertIsAndAdvance('>');

        return Collections.unmodifiableList(arguments);
    }

    private boolean hasTypeArgument() {
        return hasWildcardIndicator() || isReferenceTypeSignature() || buffer.is('*');
    }

    /**
     * TypeArgument:
     * - [WildcardIndicator] ReferenceTypeSignature
     * - '*'
     */
    private TypeArgument parseTypeArgument() {
        if (hasWildcardIndicator()) {
            final char wildcard = parseWildcardIndicator();
            final ReferenceTypeSignature referenceTypeSignature = parseReferenceTypeSignature();
            return new TypeArgument(wildcard, referenceTypeSignature);
        } else if (isReferenceTypeSignature()) {
            final ReferenceTypeSignature referenceTypeSignature = parseReferenceTypeSignature();
            return new TypeArgument(referenceTypeSignature);
        } else if (buffer.is('*')) {
            buffer.adv();
            return new TypeArgument();
        } else {
            buffer.throwSignatureParserException();
            throw new IllegalStateException();
        }
    }

    private boolean hasWildcardIndicator() {
        if (buffer.isEOS()) {
            return false;
        }
        final char c = buffer.get();
        return c == '+' || c == '-';
    }

    /**
     * WildcardIndicator:
     * - '+'
     * - '-'
     */
    private char parseWildcardIndicator() {
        final char c = buffer.get();
        if (c != '+' && c != '-') {
            buffer.throwSignatureParserException();
        }
        return c;
    }

    private String parseIdentifier() {
        if (!buffer.isIdentifier()) {
            buffer.throwSignatureParserException();
        }
        final int pos = buffer.getPosition();
        while (buffer.isIdentifier()) {
            buffer.adv();
        }
        return new String(buffer.data, pos, buffer.getPosition() - pos);
    }

    private boolean hasClassTypeSignatureSuffix() {
        return buffer.is('.');
    }

    /**
     * ClassTypeSignatureSuffix:
     * - '.' SimpleClassTypeSignature
     */
    private SimpleClassTypeSignature parseClassTypeSignatureSuffix() {
        // Assert '.' prefix and advance
        buffer.assertIsAndAdvance('.');

        // Parse <SimpleClassTypeSignature>
        return parseSimpleClassTypeSignature();
    }

    private boolean isTypeVariableSignature() {
        return buffer.is('T');
    }

    /**
     * TypeVariableSignature:
     * - 'T' Identifier ';'
     */
    private TypeVariableSignature parseTypeVariableSignature() {
        // Assert 'T' prefix and advance
        buffer.assertIsAndAdvance('T');

        // Parse <Identifier>
        final String identifier = parseIdentifier();

        // Assert ';' suffix and advance
        buffer.assertIsAndAdvance(';');

        return new TypeVariableSignature(identifier);
    }

    private boolean isArrayTypeSignature() {
        return buffer.is('[');
    }

    /**
     * ArrayTypeSignature:
     * - '[' JavaTypeSignature
     */
    private ArrayTypeSignature parseArrayTypeSignature() {
        // Assert '[' prefix and advance
        buffer.assertIsAndAdvance('[');

        return new ArrayTypeSignature(parseJavaTypeSignature());
    }

    public static ClassSignature parseClassSignature(String signature) {
        return new SignatureParser(signature).parseClassSignature();
    }

    /**
     * ClassSignature:
     * - [TypeParameters] SuperclassSignature {SuperinterfaceSignature}
     */
    private ClassSignature parseClassSignature() {
        // Parse <TypeParameters>
        final List<TypeParameter> typeParameters;
        if (hasTypeParameters()) {
            typeParameters = parseTypeParameters();
        } else {
            typeParameters = Collections.emptyList();
        }

        // Parse <SuperclassSignature>
        final ClassTypeSignature superclassSignature = parseSuperclassSignature();

        // Parse all <SuperinterfaceSignature>s
        final List<ClassTypeSignature> superinterfaceSignatures = new ArrayList<>();
        while (isSuperinterfaceSignature()) {
            superinterfaceSignatures.add(parseSuperinterfaceSignature());
        }

        return new ClassSignature(typeParameters, superclassSignature,
                Collections.unmodifiableList(superinterfaceSignatures));
    }

    private boolean hasTypeParameters() {
        return buffer.is('<');
    }

    /**
     * TypeParameters:
     * - '<' TypeParameter {TypeParameter} '>'
     */
    private List<TypeParameter> parseTypeParameters() {
        // Assert '<' prefix and advance
        buffer.assertIsAndAdvance('<');

        // Parse all <TypeArgument>s
        final ArrayList<TypeParameter> parameters = new ArrayList<>();
        parameters.add(parseTypeParameter());
        while (!buffer.is('>')) {
            parameters.add(parseTypeParameter());
        }

        // Assert '>' suffix and advance
        buffer.assertIsAndAdvance('>');

        return Collections.unmodifiableList(parameters);
    }

    /**
     * TypeParameter:
     * - Identifier ClassBound {InterfaceBound}
     */
    private TypeParameter parseTypeParameter() {
        // Parse <Identifier>
        final String identifier = parseIdentifier();

        // Parse <ClassBound>
        final ReferenceTypeSignature classBound = parseClassBound();

        // Parse all <InterfaceBound>s
        List<ReferenceTypeSignature> interfaceBounds = new ArrayList<>();
        while (isClassOrInterfaceBound()) {
            interfaceBounds.add(parseInterfaceBound());
        }

        return new TypeParameter(identifier, classBound, Collections.unmodifiableList(interfaceBounds));
    }


    private boolean isClassOrInterfaceBound() {
        return buffer.is(':');
    }

    /**
     * ClassBound:
     * - ':' [ReferenceTypeSignature]
     */
    private ReferenceTypeSignature parseClassBound() {
        // Assert ':' prefix and advance
        buffer.assertIsAndAdvance(':');

        // Parse optional <ReferenceTypeSignature>
        if (isReferenceTypeSignature()) {
            return parseReferenceTypeSignature();
        }

        return null;
    }

    /**
     * InterfaceBound:
     * - ':' ReferenceTypeSignature
     */
    private ReferenceTypeSignature parseInterfaceBound() {
        // Assert ':' prefix and advance
        buffer.assertIsAndAdvance(':');

        // Parse <ReferenceTypeSignature>
        return parseReferenceTypeSignature();
    }

    /**
     * SuperclassSignature:
     * - ClassTypeSignature
     */
    private ClassTypeSignature parseSuperclassSignature() {
        return parseClassTypeSignature();
    }

    private boolean isSuperinterfaceSignature() {
        return isClassTypeSignature();
    }

    /**
     * SuperinterfaceSignature:
     * - ClassTypeSignature
     */
    private ClassTypeSignature parseSuperinterfaceSignature() {
        return parseClassTypeSignature();
    }

    public static MethodSignature parseMethodSignature(String signature) {
        return new SignatureParser(signature).parseMethodSignature();
    }

    /**
     * MethodSignature:
     * - [TypeParameters] '(' {JavaTypeSignature} ')' Result {ThrowsSignature}
     */
    private MethodSignature parseMethodSignature() {
        // Parse optional <TypeParameters>
        final List<TypeParameter> typeParameters;
        if (hasTypeParameters()) {
            typeParameters = parseTypeParameters();
        } else {
            typeParameters = Collections.emptyList();
        }

        // Assert '(' and advance
        buffer.assertIsAndAdvance('(');

        // Parse all <JavaTypeSignature>s
        List<JavaTypeSignature> parameters = new ArrayList<>();
        while (isJavaTypeSignature()) {
            parameters.add(parseJavaTypeSignature());
        }

        // Assert ')' and advance
        buffer.assertIsAndAdvance(')');

        // Parse <Result>
        final JavaTypeSignature result = parseResult();

        // Parse all <ThrowsSignature>
        final List<ReferenceTypeSignature> throwsSignatures = new ArrayList<>();
        while (isThrowsSignature()) {
            throwsSignatures.add(parseThrowsSignature());
        }

        return new MethodSignature(typeParameters, Collections.unmodifiableList(parameters), result,
                Collections.unmodifiableList(throwsSignatures));
    }

    /**
     * Result:
     * - JavaTypeSignature
     * - VoidDescriptor
     */
    private JavaTypeSignature parseResult() {
        // Try to parse <VoidDescriptor> first
        if (isVoidDescriptor()) {
            parseVoidDescriptor();
            return null;
        } else if (isJavaTypeSignature()) {
            return parseJavaTypeSignature();
        } else {
            buffer.throwSignatureParserException();
            throw new IllegalStateException();
        }
    }

    private boolean isThrowsSignature() {
        return buffer.is('^');
    }

    /**
     * ThrowsSignature:
     * - '^' ClassTypeSignature
     * - '^' TypeVariableSignature
     */
    private ReferenceTypeSignature parseThrowsSignature() {
        buffer.assertIsAndAdvance('^');

        if (isClassTypeSignature()) {
            return parseClassTypeSignature();
        } else if (isTypeVariableSignature()) {
            return parseTypeVariableSignature();
        } else {
            buffer.throwSignatureParserException();
            throw new IllegalStateException();
        }
    }

    private boolean isVoidDescriptor() {
        return buffer.is('V');
    }

    /**
     * VoidDescriptor:
     * - 'V'
     */
    private void parseVoidDescriptor() {
        if (!isVoidDescriptor()) {
            buffer.throwSignatureParserException();
        }
        buffer.adv();
    }

    public static ReferenceTypeSignature parseFieldSignature(String signature) {
        return new SignatureParser(signature).parseFieldSignature();
    }

    /**
     * FieldSignature:
     * - ReferenceTypeSignature
     */
    private ReferenceTypeSignature parseFieldSignature() {
        return parseReferenceTypeSignature();
    }
}
