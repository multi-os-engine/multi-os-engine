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

package org.moe.natj.processor.cxx;

import org.moe.natj.processor.cxx.decl.invokable.InvokableInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Utility class for writing formatted C++ code.
 */
public class CxxSource {

    /**
     * Current indentation level.
     */
    private int indentLevel = 0;

    /**
     * Flag for source code indentation.
     */
    private boolean isSourceIndented = false;

    /**
     * Flag for header code indentation.
     */
    private boolean isHeaderIndented = false;

    /**
     * Source code buffer.
     */
    private final StringBuilder source = new StringBuilder();

    /**
     * Header code buffer.
     */
    private final StringBuilder header = new StringBuilder();

    /**
     * Flag for source code generation.
     */
    private boolean sourceGenEnabled = true;

    /**
     * Flag hor header code generation.
     */
    private boolean headerGenEnabled = true;

    /**
     * Stack for classes.
     */
    private final Stack<Clazz> classes = new Stack<>();

    /**
     * Returns the source code.
     *
     * @return Source code
     */
    public String getSource() {
        return source.toString();
    }

    /**
     * Returns the length of the source buffer.
     *
     * @return Length of the source buffer
     */
    public int getSourceLength() {
        return source.length();
    }

    /**
     * Returns the substring from the source buffer.
     *
     * @param start Start
     * @param end   End
     * @return Substring
     */
    public String getSourceSubstring(int start, int end) {
        return source.substring(start, end);
    }

    /**
     * Returns the header code.
     *
     * @return Header code
     */
    public String getHeader() {
        return header.toString();
    }

    /**
     * Code block.
     */
    public interface ICodeBlock {
        /**
         * Writes code inside the current block.
         *
         * @param src buffer to write to.
         */
        void block(CxxSource src);
    }

    /**
     * Writes an object.
     *
     * @param code Object
     * @return Buffer written to
     */
    private CxxSource __write(Object code) {
        return __write(code.toString());
    }

    /**
     * Writes the specified String.
     *
     * @param code Code
     * @return Buffer written to
     */
    private CxxSource __write(String code) {
        if (code == null) {
            throw new NullPointerException();
        }
        if (code.length() == 0) {
            return this;
        }
        if (code.contains("\n")) {
            throw new IllegalStateException();
        }
        __write_indent();
        if (sourceGenEnabled)
            source.append(code);
        if (headerGenEnabled)
            header.append(code);
        return this;
    }

    /**
     * Writes proper indentation.
     *
     * @return Buffer written to
     */
    private CxxSource __write_indent() {
        if (sourceGenEnabled)
            if (!isSourceIndented) {
                isSourceIndented = true;
                for (int i = 0; i < indentLevel; ++i)
                    source.append("    ");
            }
        if (headerGenEnabled)
            if (!isHeaderIndented) {
                isHeaderIndented = true;
                for (int i = 0; i < indentLevel; ++i)
                    header.append("    ");
            }
        return this;
    }

    /**
     * Writes a new line character.
     *
     * @return Buffer written to
     */
    public CxxSource nl() {
        if (sourceGenEnabled) {
            isSourceIndented = false;
            source.append("\n");
        }
        if (headerGenEnabled) {
            isHeaderIndented = false;
            header.append("\n");
        }
        return this;
    }

    /**
     * Enables writing for only the source buffer.
     *
     * @return Buffer written to
     */
    public CxxSource writeSource() {
        sourceGenEnabled = true;
        headerGenEnabled = false;
        return this;
    }

    /**
     * Enables writing for only the header buffer.
     *
     * @return Buffer written to
     */
    public CxxSource writeHeader() {
        sourceGenEnabled = false;
        headerGenEnabled = true;
        return this;
    }

    /**
     * Enables writing for both source and header buffers.
     *
     * @return Buffer written to
     */
    public CxxSource writeBoth() {
        sourceGenEnabled = true;
        headerGenEnabled = true;
        return this;
    }

    /**
     * Writes a string to the enabled buffers.
     *
     * @param msg String
     * @return Buffer written to
     */
    public CxxSource w(String msg) {
        return __write(msg);
    }

    /**
     * Writes a PP include directive to the enabled buffers using angle brackets.
     *
     * @param file File to include
     * @return Buffer written to
     */
    public CxxSource include(String file) {
        return __write("#include <").__write(file).__write(">").nl();
    }

    /**
     * Writes a PP include directive to the enabled buffers using quotes.
     *
     * @param file File to include
     * @return Buffer written to
     */
    public CxxSource includeUser(String file) {
        return __write("#include \"").__write(file).__write("\"").nl();
    }

    /**
     * Returns the top class of the classes stack.
     *
     * @return Top class or null
     */
    public Clazz topClass() {
        return classes.top();
    }

    /**
     * Writable interface.
     */
    public interface Writable {
        /**
         * Writes code.
         *
         * @return Buffer written to
         */
        CxxSource write();
    }

    /**
     * ScopedWritable interface.
     */
    public interface ScopedWritable {
        /**
         * Writes code and embeds the contents of block properly.
         *
         * @param block Block to embed
         * @return Buffer written to
         */
        CxxSource write(ICodeBlock block);
    }

    /**
     * Native code comment.
     */
    public class Comment implements Writable {
        /**
         * Contents of the comment.
         */
        private String contents = "";

        /**
         * Sets the contents of the comment.
         *
         * @param contents Contents
         * @return This Comment
         */
        public Comment setContents(String contents) {
            if (contents == null) {
                throw new NullPointerException();
            }
            this.contents = contents;
            return this;
        }

        @Override
        public CxxSource write() {
            final String[] lines = contents.split("\n");
            for (String line : lines) {
                __write("// ").__write(line).nl();
            }
            return CxxSource.this;
        }
    }

    /**
     * Returns a new Comment component.
     *
     * @return Comment component
     */
    public Comment comment() {
        return new Comment();
    }

    /**
     * Native code comment block.
     */
    public class CommentBlock implements Writable {
        /**
         * Contents of the comment block.
         */
        private String contents = "";

        /**
         * Sets the contents of the comment block.
         *
         * @param contents Contents
         * @return This CommentBlock
         */
        public CommentBlock setContents(String contents) {
            if (contents == null) {
                throw new NullPointerException();
            }
            this.contents = contents;
            return this;
        }

        @Override
        public CxxSource write() {
            final String[] lines = contents.split("\n");
            __write("/*").nl();
            for (String line : lines) {
                __write(" * ").__write(line).nl();
            }
            __write(" */").nl();
            return CxxSource.this;
        }
    }

    /**
     * Creates a new CommentBlock component.
     *
     * @return CommentBlock component
     */
    public CommentBlock commentBlock() {
        return new CommentBlock();
    }

    /**
     * Writes a pragma mark.
     *
     * @param msg Pragma mark message
     * @return This CxxSource
     */
    public CxxSource pragmaMark(String msg) {
        __write("#pragma mark ").__write(msg).nl();
        return this;
    }

    /**
     * Writes a static assert.
     *
     * @param msg Pragma mark message
     * @return This CxxSource
     */
    public CxxSource staticAssert(String condition, String msg) {
        __write("static_assert(").__write(condition).__write(",").nl();
        ++indentLevel;
        __write("\"").__write(msg).__write("\");").nl();
        --indentLevel;
        return this;
    }

    /**
     * Native source block.
     */
    public class Block implements ScopedWritable {

        @Override
        public CxxSource write(ICodeBlock block) {
            __write(" {").nl();
            ++indentLevel;
            if (block != null) {
                block.block(CxxSource.this);
            }
            --indentLevel;
            __write("}").nl();
            return CxxSource.this;
        }
    }

    /**
     * Creates a new Block component.
     *
     * @return Block component
     */
    public Block block() {
        return new Block();
    }

    /**
     * Native code namespace block.
     */
    public class Namespace implements ScopedWritable {
        /**
         * Namespaces.
         */
        private ArrayList<String> namespaces = new ArrayList<>();

        /**
         * Adds a namespace.
         *
         * @param namespace Namespace name
         * @return this Namespace
         */
        public Namespace addNamespace(String namespace) {
            if (namespace == null) {
                throw new NullPointerException();
            }
            namespaces.add(namespace);
            return this;
        }

        @Override
        public CxxSource write(ICodeBlock block) {
            for (String namespace : namespaces) {
                __write("namespace ").__write(namespace).__write(" {").nl();
                ++indentLevel;
            }
            if (block != null) {
                block.block(CxxSource.this);
            }
            for (String namespace : namespaces) {
                --indentLevel;
                __write("} /* namespace ").__write(namespace).__write(" */").nl();
            }
            return CxxSource.this;
        }
    }

    /**
     * Creates a new Namespace component.
     *
     * @return Namespace component
     */
    public Namespace namespace() {
        return new Namespace();
    }

    /**
     * Native code class definition.
     */
    public class Clazz implements ScopedWritable {
        /**
         * Class name.
         */
        private String name = "__unset_name__";

        /**
         * Superclass names.
         */
        private final ArrayList<String> supers = new ArrayList<>();

        /**
         * Block directly after class definition.
         */
        private ICodeBlock afterBlock;

        /**
         * Sets the class' name.
         *
         * @param name Name
         * @return This Clazz
         */
        public Clazz setName(String name) {
            if (name == null) {
                throw new NullPointerException();
            }
            this.name = name;
            return this;
        }

        /**
         * Returns the simpleName of this class.
         *
         * @return Simple name
         */
        public String getSimpleName() {
            final String[] split = name.split("::");
            return split[split.length - 1];
        }

        /**
         * Adds a super class.
         *
         * @param zuper Super class name
         * @return This Clazz
         */
        public Clazz addSuper(String zuper) {
            if (zuper == null) {
                throw new NullPointerException();
            }
            supers.add(zuper);
            return this;
        }

        /**
         * Sets the block following the class' definition.
         *
         * @param afterBlock After block
         * @return This Clazz
         */
        public Clazz setAfterClass(ICodeBlock afterBlock) {
            this.afterBlock = afterBlock;
            return this;
        }

        /**
         * Writes this class.
         *
         * @param name  Class name
         * @param block Contents block
         * @return CxxSource written to
         */
        private CxxSource writeClazz(String name, ICodeBlock block) {
            __write("class ").__write(name);
            if (supers.size() > 0) {
                __write(" : ");
                for (int i = 0; i < supers.size(); ++i) {
                    if (i > 0)
                        __write(", ");
                    __write("public ");
                    final String zuper = supers.get(i);
                    if (!zuper.startsWith("::")) {
                        __write("::");
                    }
                    __write(zuper);
                }
            }
            classes.push(this);
            __write(" {").nl();
            ++indentLevel;
            if (block != null) {
                block.block(CxxSource.this);
            }
            --indentLevel;
            __write("}; /* class ").__write(name).__write(" */").nl();
            if (afterBlock != null) {
                afterBlock.block(CxxSource.this);
            }
            classes.pop();
            return CxxSource.this;
        }

        @Override
        public CxxSource write(ICodeBlock block) {
            final int templateIdx = name.indexOf('<');
            final String basename;
            final String template;
            if (templateIdx != -1) {
                basename = name.substring(0, templateIdx);
                template = name.substring(templateIdx);
            } else {
                basename = name;
                template = "";
            }
            final String[] ns = basename.split("::");
            if (ns.length > 1) {
                final Namespace namespace = namespace();
                for (int i = 0; i < ns.length - 1; ++i) {
                    namespace.addNamespace(ns[i]);
                }
                return namespace.write(src -> writeClazz(ns[ns.length - 1] + template, block));
            }
            return writeClazz(name, block);
        }
    }

    /**
     * Creates a new Clazz component.
     *
     * @return Clazz component
     */
    public Clazz clazz() {
        return new Clazz();
    }

    /**
     * Inherited class' method table component.
     */
    public class InheritedClassMethodTable implements Writable {
        /**
         * Class name.
         */
        private String className;

        /**
         * Inherited methods.
         */
        private List<InvokableInfo> methods = new ArrayList<>();

        /**
         * Sets the class name.
         *
         * @param name Class name
         * @return This InheritedClassMethodTable
         */
        public InheritedClassMethodTable setClassName(String name) {
            if (name == null) {
                throw new NullPointerException();
            }
            this.className = name;
            return this;
        }

        /**
         * Sets the list of inherited methods.
         *
         * @param methods Inherited methods
         * @return This InheritedClassMethodTable
         */
        public InheritedClassMethodTable setMethods(List<InvokableInfo> methods) {
            if (methods == null) {
                throw new NullPointerException();
            }
            this.methods = new ArrayList<>(methods);
            return this;
        }

        @Override
        public CxxSource write() {
            __write("enum __java_method : ::natj::MethodIndex {").nl();
            ++indentLevel;
            for (InvokableInfo method : methods) {
                comment().setContents(method.getName() + method.getDesc().getDescriptor()).write();
                __write(method.getJavaStaticBridgeStubMethodName()).__write(",").nl();
            }
            comment().setContents("_cxx_rt_release_java(J)V").write();
            __write("_cxx_rt_release_java,").nl();
            --indentLevel;
            __write("};").nl();
            __write("static jmethodID __java_method_table[").__write(methods.size() + 1).__write("];").nl();
            __write("static jmethodID __java_get_method(::natj::MethodIndex index) {").nl();
            ++indentLevel;
            __write("jmethodID tmp = __java_method_table[index];").nl();
            __write("if (tmp != nullptr) return tmp;").nl();
            __write("switch (index) {").nl();
            ++indentLevel;
            for (InvokableInfo method : methods) {
                __write("case NATJ_CASE_INIT_METHOD_INDEX(")
                        .__write(method.getJavaStaticBridgeStubMethodName()).__write(", \"")
                        .__write(method.getJavaStaticStubMethodType()).__write("\")").nl();
            }
            __write("case NATJ_CASE_INIT_METHOD_INDEX(_cxx_rt_release_java, \"(J)V\")").nl();
            __write("default: abort();").nl();
            --indentLevel;
            __write("}").nl();
            __write("return __java_method_table[index];").nl();
            --indentLevel;
            __write("};").nl();
            __write("struct java_object {").nl();
            ++indentLevel;
            __write("jlong peer;").nl();
            __write("java_object(jlong _peer) : peer(_peer) {};").nl();
            __write("~java_object() {").nl();
            ++indentLevel;
            __write("::natj::CallStaticVoidMethod<").__write(className).__write(">(peer, _cxx_rt_release_java);").nl();
            --indentLevel;
            __write("}").nl();
            __write("operator jlong() const { return peer; }").nl();
            --indentLevel;
            __write("} __java_object;").nl();
            return CxxSource.this;
        }
    }

    /**
     * Creates a new InheritedClassMethodTable component.
     *
     * @return InheritedClassMethodTable component
     */
    public InheritedClassMethodTable inheritedClassMethodTable() {
        return new InheritedClassMethodTable();
    }

    /**
     * Inherited class' forwarding constructor component.
     */
    public class InheritedClassForwardingConstructor implements Writable {
        @Override
        public CxxSource write() {
            final Clazz clazz = classes.top();
            switch (clazz.supers.size()) {
                case 0: {
                    __write(clazz.getSimpleName())
                            .__write("(jlong java_object) : __java_object(java_object)");
                    break;
                }
                case 1: {
                    __write("template<class ...Args>").nl();
                    __write(clazz.getSimpleName())
                            .__write("(jlong java_object, Args... args) : ");
                    final String zuper = clazz.supers.get(0);
                    if (!zuper.startsWith("::")) {
                        __write("::");
                    }
                    __write(zuper).__write("(args...), __java_object(java_object)");
                    break;
                }
                default:
                    throw new RuntimeException("Multiple supers are currently not supported!");
            }
            __write(" {}").nl();
            return CxxSource.this;
        }
    }

    /**
     * Creates a new InheritedClassForwardingConstructor component.
     *
     * @return InheritedClassForwardingConstructor component
     */
    public InheritedClassForwardingConstructor inheritedClassForwardingConstructor() {
        return new InheritedClassForwardingConstructor();
    }

    /**
     * Disabled constructors component.
     */
    public class DisabledConstructors implements Writable {
        @Override
        public CxxSource write() {
            final Clazz clazz = classes.top();
            final String name = clazz.getSimpleName();
            __write(name).__write("(const ").__write(name).__write("&) = delete;").nl();
            __write(name).__write("& operator=(const ").__write(name).__write("&) = delete;").nl();
            __write(name).__write("(").__write(name).__write("&&) = delete;").nl();
            __write(name).__write("& operator=(").__write(name).__write("&&) = delete;").nl();
            return CxxSource.this;
        }
    }

    /**
     * Creates a new DisabledConstructors component.
     *
     * @return DisabledConstructors component
     */
    public DisabledConstructors disabledConstructors() {
        return new DisabledConstructors();
    }

    /**
     * Configurable function component.
     */
    public class Function implements Writable {
        /**
         * Name.
         */
        private String name = "__unset_name__";

        /**
         * Const qualified.
         */
        private boolean isConst = false;

        /**
         * Is virtual flag.
         */
        private boolean isVirtual = false;

        /**
         * Is Overriding flag.
         */
        private boolean isOverride = false;

        /**
         * Is JNIEXPORT flag.
         */
        private boolean isJNIEXPORT = false;

        /**
         * Is JNICALL flag.
         */
        private boolean isJNICALL = false;

        /**
         * Return type.
         */
        private CxxType type = null;

        /**
         * Argument types.
         */
        private final ArrayList<CxxType> args = new ArrayList<>();

        /**
         * Is post increment or post decrement operator flag.
         */
        private boolean isPostIncOrDecOperator = false;

        /**
         * Should omit return type flag.
         */
        private boolean omitReturnType = false;

        /**
         * Is the first argument the peer flag.
         */
        private boolean isFirstArgPeer = false;

        /**
         * Sets the function's name.
         *
         * @param name Name
         * @return This function
         */
        public Function setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the function's const qualifier flag.
         *
         * @param aConst Value
         * @return This function
         */
        public Function setConst(boolean aConst) {
            isConst = aConst;
            return this;
        }

        /**
         * Sets the function's is virtual flag.
         *
         * @param virtual Value
         * @return This function
         */
        public Function setVirtual(boolean virtual) {
            isVirtual = virtual;
            return this;
        }

        /**
         * Sets the function's is override flag.
         *
         * @param override Value
         * @return This function
         */
        public Function setOverride(boolean override) {
            isOverride = override;
            return this;
        }

        /**
         * Sets the function's is JNIEXPORT flag.
         *
         * @param JNIEXPORT Value
         * @return This function
         */
        public Function setJNIEXPORT(boolean JNIEXPORT) {
            isJNIEXPORT = JNIEXPORT;
            return this;
        }

        /**
         * Sets the function's is JNICALL flag.
         *
         * @param JNICALL Value
         * @return This function
         */
        public Function setJNICALL(boolean JNICALL) {
            isJNICALL = JNICALL;
            return this;
        }

        /**
         * Sets the function's return type.
         *
         * @param type Type
         * @return This function
         */
        public Function setType(CxxType type) {
            this.type = type;
            return this;
        }

        /**
         * Adds an type as the function's argument.
         *
         * @param arg Type
         * @return This function
         */
        public Function addArg(CxxType arg) {
            args.add(arg);
            return this;
        }

        /**
         * Returns the names of the argument.
         *
         * @param removePeer The list should contain the peer.
         * @return List of argument names
         */
        private List<String> getParamNames(final boolean removePeer) {
            final AtomicInteger index = new AtomicInteger(0);
            Stream<CxxType> typeStream = args.stream();

            // Filter out peer
            if (removePeer && isFirstArgPeer) {
                typeStream = typeStream.skip(1);
            }

            // Generate names
            index.set(!removePeer && isFirstArgPeer ? -1 : 0);
            final List<String> list = typeStream.map(type -> "p" + index.getAndIncrement()).collect(Collectors.toList());
            if (!removePeer && isFirstArgPeer) {
                list.set(0, "peer");
            }
            return list;
        }

        /**
         * Returns the names of the argument.
         *
         * @return List of argument names NOT including the peer
         */
        public List<String> getParamNames() {
            return getParamNames(true);
        }

        @Override
        public CxxSource write() {
            if (isJNIEXPORT) __write("JNIEXPORT ");
            if (isVirtual) __write("virtual ");
            if (!omitReturnType) {
                if (isJNICALL) {
                    __write(type.getNativeJNIType());
                } else {
                    __write(type.getNativeType());
                }
            }
            if (isJNICALL) __write(" JNICALL");
            if (!omitReturnType) __write(" ");
            __write(name).__write("(");

            if (isJNICALL) __write("JNIEnv*, jclass");
            final List<String> paramNames = getParamNames(false);
            int paramIndex = 0;
            for (CxxType type : args) {
                if (paramIndex > 0 || isJNICALL) {
                    __write(", ");
                }
                if (isJNICALL) {
                    __write(type.getNativeJNIType());
                } else {
                    __write(type.getNativeType());
                }
                __write(" ").__write(paramNames.get(paramIndex));
                ++paramIndex;
            }

            if (isPostIncOrDecOperator) {
                if (args.size() > 0) {
                    throw new RuntimeException("Post increment/decrement operators cannot have arguments");
                }
                __write("int");
            }

            __write(")");
            if (isConst) __write(" const");
            if (isOverride) __write(" override");
            return CxxSource.this;
        }

        /**
         * Sets the function's fist argument is the peer flag.
         *
         * @param firstArgAsPeer Value
         * @return This function
         */
        public Function setFirstArgAsPeer(boolean firstArgAsPeer) {
            this.isFirstArgPeer = firstArgAsPeer;
            return this;
        }

        /**
         * Sets the function's is post increment or post decrement operator flag.
         *
         * @param postIncOrDecOperator Value
         * @return This function
         */
        public Function setPostIncOrDecOperator(boolean postIncOrDecOperator) {
            isPostIncOrDecOperator = postIncOrDecOperator;
            return this;
        }

        /**
         * Sets the function's should omit return type flag.
         *
         * @param omitReturnType Value
         * @return This function
         */
        public Function setOmitReturnType(boolean omitReturnType) {
            this.omitReturnType = omitReturnType;
            return this;
        }
    }

    /**
     * Creates a new configurable Function component.
     *
     * @return Function component
     */
    public Function function() {
        return new Function();
    }

    /**
     * Simple Stack implementation.
     *
     * @param <T> Element type
     */
    private static class Stack<T> implements Iterable<T> {
        /**
         * Element container.
         */
        private final ArrayList<T> elems = new ArrayList<>();

        /**
         * Push an element onto the stack.
         *
         * @param elem Element to push
         */
        public void push(T elem) {
            if (elem == null) {
                throw new NullPointerException();
            }
            elems.add(elem);
        }

        /**
         * Pop an element from the stack.
         *
         * @return Popped element
         */
        public T pop() {
            if (elems.size() == 0) {
                throw new NoSuchElementException();
            }
            return elems.remove(elems.size() - 1);
        }

        /**
         * Returns the top element on the stack.
         *
         * @return Top element or null
         */
        public T top() {
            return elems.size() == 0 ? null : elems.get(elems.size() - 1);
        }

        @Override
        public Iterator<T> iterator() {
            return elems.iterator();
        }
    }
}
