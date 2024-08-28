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

package org.clang.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class IndexerCallbacks extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public IndexerCallbacks() {
        super(IndexerCallbacks.class);
    }

    @Generated
    protected IndexerCallbacks(Pointer peer) {
        super(peer);
    }

    /**
     * Called periodically to check whether indexing should be aborted.
     * Should return 0 to continue, and non-zero to abort.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAbortQuery(@FunctionPtr(name = "call_abortQuery") Function_abortQuery value);

    /**
     * Called at the end of indexing; passes the complete diagnostic set.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setDiagnostic(@FunctionPtr(name = "call_diagnostic") Function_diagnostic value);

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEnteredMainFile(@FunctionPtr(name = "call_enteredMainFile") Function_enteredMainFile value);

    /**
     * Called when a file gets \#included/\#imported.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPpIncludedFile(@FunctionPtr(name = "call_ppIncludedFile") Function_ppIncludedFile value);

    /**
     * Called when a AST file (PCH or module) gets imported.
     * <p>
     * AST files will not get indexed (there will not be callbacks to index all
     * the entities in an AST file). The recommended action is that, if the AST
     * file is not already indexed, to initiate a new indexing job specific to
     * the AST file.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setImportedASTFile(@FunctionPtr(name = "call_importedASTFile") Function_importedASTFile value);

    /**
     * Called at the beginning of indexing a translation unit.
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setStartedTranslationUnit(
            @FunctionPtr(name = "call_startedTranslationUnit") Function_startedTranslationUnit value);

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setIndexDeclaration(
            @FunctionPtr(name = "call_indexDeclaration") Function_indexDeclaration value);

    /**
     * Called to index a reference of an entity.
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setIndexEntityReference(
            @FunctionPtr(name = "call_indexEntityReference") Function_indexEntityReference value);

    /**
     * Called periodically to check whether indexing should be aborted.
     * Should return 0 to continue, and non-zero to abort.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_abortQuery")
    public native Function_abortQuery abortQuery();

    /**
     * Called at the end of indexing; passes the complete diagnostic set.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_diagnostic")
    public native Function_diagnostic diagnostic();

    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_enteredMainFile")
    public native Function_enteredMainFile enteredMainFile();

    /**
     * Called when a file gets \#included/\#imported.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_ppIncludedFile")
    public native Function_ppIncludedFile ppIncludedFile();

    /**
     * Called when a AST file (PCH or module) gets imported.
     * <p>
     * AST files will not get indexed (there will not be callbacks to index all
     * the entities in an AST file). The recommended action is that, if the AST
     * file is not already indexed, to initiate a new indexing job specific to
     * the AST file.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_importedASTFile")
    public native Function_importedASTFile importedASTFile();

    /**
     * Called at the beginning of indexing a translation unit.
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    @FunctionPtr(name = "call_startedTranslationUnit")
    public native Function_startedTranslationUnit startedTranslationUnit();

    @Generated
    @StructureField(order = 6, isGetter = true)
    @FunctionPtr(name = "call_indexDeclaration")
    public native Function_indexDeclaration indexDeclaration();

    /**
     * Called to index a reference of an entity.
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    @FunctionPtr(name = "call_indexEntityReference")
    public native Function_indexEntityReference indexEntityReference();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_abortQuery {
        @Generated
        int call_abortQuery(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_diagnostic {
        @Generated
        void call_diagnostic(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_enteredMainFile {
        @Generated
        VoidPtr call_enteredMainFile(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_ppIncludedFile {
        @Generated
        VoidPtr call_ppIncludedFile(VoidPtr arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") CXIdxIncludedFileInfo arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_importedASTFile {
        @Generated
        VoidPtr call_importedASTFile(VoidPtr arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") CXIdxImportedASTFileInfo arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_startedTranslationUnit {
        @Generated
        VoidPtr call_startedTranslationUnit(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_indexDeclaration {
        @Generated
        void call_indexDeclaration(VoidPtr arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") CXIdxDeclInfo arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_indexEntityReference {
        @Generated
        void call_indexEntityReference(VoidPtr arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityRefInfo arg1);
    }
}
