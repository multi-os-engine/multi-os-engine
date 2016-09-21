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

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.ChildListPropertyDescriptor;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ModifierEditor extends EditContext {

    // General annotation
    private Annotation aByValue;
    private Annotation aFunctionPtr;
    private Annotation aGenerated;
    private Annotation aLibrary;
    private Annotation aMapped;
    private Annotation aMappedReturn;
    private Annotation aOwned;
    private Annotation aRegisterOnStartup;
    private Annotation aReferenceInfo;
    private Annotation aRuntime;
    private Annotation aUncertainArgument;
    private Annotation aUncertainReturn;
    private Annotation aNFloat;
    private Annotation aNInt;
    private Annotation aNUInt;

    private static final String ByValue[] = new String[] { Constants.ByValueAnnotation, Constants.ByValueAnnotationFQ
    };
    private static final String FunctionPtr[] = new String[] { Constants.FunctionPtrAnnotation,
            Constants.FunctionPtrAnnotationFQ
    };
    private static final String Generated[] = new String[] { Constants.GeneratedAnnotation,
            Constants.GeneratedAnnotationFQ
    };
    private static final String Library[] = new String[] { Constants.LibraryAnnotation, Constants.LibraryAnnotationFQ
    };
    private static final String Mapped[] = new String[] { Constants.MappedAnnotation, Constants.MappedAnnotationFQ
    };
    private static final String MappedReturn[] = new String[] { Constants.MappedReturnAnnotation,
            Constants.MappedReturnAnnotationFQ
    };
    private static final String Owned[] = new String[] { Constants.OwnedAnnotation, Constants.OwnedAnnotationFQ
    };
    private static final String RegisterOnStartup[] = new String[] { Constants.RegisterOnStartupAnnotation,
            Constants.RegisterOnStartupAnnotationFQ
    };
    private static final String ReferenceInfo[] = new String[] { Constants.ReferenceInfoAnnotation,
            Constants.ReferenceInfoAnnotationFQ
    };
    private static final String Runtime[] = new String[] { Constants.RuntimeAnnotation, Constants.RuntimeAnnotationFQ
    };
    private static final String UncertainArgument[] = new String[] { Constants.UncertainArgumentAnnotation,
            Constants.UncertainArgumentAnnotationFQ
    };
    private static final String UncertainReturn[] = new String[] { Constants.UncertainReturnAnnotation,
            Constants.UncertainReturnAnnotationFQ
    };
    private static final String NFloat[] = new String[] { Constants.NFloatAnnotation, Constants.NFloatAnnotationFQ
    };
    private static final String NInt[] = new String[] { Constants.NIntAnnotation, Constants.NIntAnnotationFQ
    };
    private static final String NUInt[] = new String[] { Constants.NUIntAnnotation, Constants.NUIntAnnotationFQ
    };

    // C annotations
    private Annotation aCFunction;
    private Annotation aCVariable;
    private Annotation aInline;
    private Annotation aStructure;
    private Annotation aStructureField;
    private Annotation aVariadic;

    private static final String CFunction[] = new String[] { Constants.CFunctionAnnotation,
            Constants.CFunctionAnnotationFQ
    };
    private static final String CVariable[] = new String[] { Constants.CVariableAnnotation,
            Constants.CVariableAnnotationFQ
    };
    private static final String Inline[] = new String[] { Constants.InlineAnnotation, Constants.InlineAnnotationFQ
    };
    private static final String Structure[] = new String[] { Constants.StructureAnnotation,
            Constants.StructureAnnotationFQ
    };
    private static final String StructureField[] = new String[] { Constants.StructureFieldAnnotation,
            Constants.StructureFieldAnnotationFQ
    };
    private static final String Variadic[] = new String[] { Constants.VariadicAnnotation, Constants.VariadicAnnotationFQ
    };

    // Objective-C annotation
    private Annotation aCategoryClassMethod;
    private Annotation aIBAction;
    private Annotation aIBOutlet;

    // TODO MOE fix
    private Annotation aProperty;

    private Annotation aIBOutletCollection;
    private Annotation aInstanceVariable;
    private Annotation aIsOptional;
    private Annotation aNotImplemented;
    private Annotation aObjCBlock;
    private Annotation aObjCCategory;
    private Annotation aObjCClassBinding;
    private Annotation aObjCClassName;
    private Annotation aObjCProtocolName;
    private Annotation aProtocolClassMethod;
    private Annotation aSelector;
    private Annotation aXIB;

    private static final String CategoryClassMethod[] = new String[] { Constants.CategoryClassMethodAnnotation,
            Constants.CategoryClassMethodAnnotationFQ
    };
    private static final String IBAction[] = new String[] { Constants.IBActionAnnotation, Constants.IBActionAnnotationFQ
    };
    private static final String IBOutlet[] = new String[] { Constants.IBOutletAnnotation, Constants.IBOutletAnnotationFQ
    };

    // TODO MOE fix
    private static final String Property[] = new String[] { Constants.PropertyAnnotation, Constants.PropertyAnnotationFQ
    };

    private static final String IBOutletCollection[] = new String[] { Constants.IBOutletCollectionAnnotation,
            Constants.IBOutletCollectionAnnotationFQ
    };
    private static final String InstanceVariable[] = new String[] { Constants.InstanceVariableAnnotation,
            Constants.InstanceVariableAnnotationFQ
    };
    private static final String IsOptional[] = new String[] { Constants.IsOptionalAnnotation,
            Constants.IsOptionalAnnotationFQ
    };
    private static final String NotImplemented[] = new String[] { Constants.NotImplementedAnnotation,
            Constants.NotImplementedAnnotationFQ
    };
    private static final String ObjCBlock[] = new String[] { Constants.ObjCBlockAnnotation,
            Constants.ObjCBlockAnnotationFQ
    };
    private static final String ObjCCategory[] = new String[] { Constants.ObjCCategoryAnnotation,
            Constants.ObjCCategoryAnnotationFQ
    };
    private static final String ObjCClassBinding[] = new String[] { Constants.ObjCClassBindingAnnotation,
            Constants.ObjCClassBindingAnnotationFQ
    };
    private static final String ObjCClassName[] = new String[] { Constants.ObjCClassNameAnnotation,
            Constants.ObjCClassNameAnnotationFQ
    };
    private static final String ObjCProtocolName[] = new String[] { Constants.ObjCProtocolNameAnnotation,
            Constants.ObjCProtocolNameAnnotationFQ
    };
    private static final String ProtocolClassMethod[] = new String[] { Constants.ProtocolClassMethodAnnotation,
            Constants.ProtocolClassMethodAnnotationFQ
    };
    private static final String Selector[] = new String[] { Constants.SelectorAnnotation, Constants.SelectorAnnotationFQ
    };
    private static final String XIB[] = new String[] { Constants.XIBAnnotation, Constants.XIBAnnotationFQ
    };

    // Other annotations
    private Annotation aDeprecated;

    private static final String Deprecated[] = new String[] { "Deprecated", null
    };

    // Collection of annotations
    ArrayList<Annotation> allAnnotations = new ArrayList<Annotation>();
    ArrayList<Annotation> managedAnnotations = new ArrayList<Annotation>();

    // Modifiers
    private Modifier mPublic;
    private Modifier mProtected;
    private Modifier mPrivate;
    private Modifier mStatic;
    private Modifier mAbstract;
    private Modifier mFinal;
    private Modifier mNative;
    private Modifier mDefault;

    // Collection of modifiers
    ArrayList<Modifier> allModifiers = new ArrayList<Modifier>();
    ArrayList<Modifier> managedModifiers = new ArrayList<Modifier>();

    private final boolean isNew;
    private boolean forceEditing = false;
    ;
    private boolean isClosed = false;
    private final ListRewrite lrw;

    public ModifierEditor(AbstractUnitManager manager, ASTNode decl, ChildListPropertyDescriptor property,
            boolean isNew) {
        super(manager);
        this.isNew = isNew;
        this.lrw = getRewrite().getListRewrite(decl, property);
        read();
    }

    private void read() {
        for (IExtendedModifier it : (List<IExtendedModifier>)lrw.getRewrittenList()) {
            if (it.isAnnotation()) {
                String type_name = ((Annotation)it).getTypeName().getFullyQualifiedName();
                if (type_name.equals(Constants.ByValueAnnotation) || type_name.equals(Constants.ByValueAnnotationFQ)) {
                    aByValue = (Annotation)it;
                } else if (type_name.equals(Constants.FunctionPtrAnnotation) || type_name
                        .equals(Constants.FunctionPtrAnnotationFQ)) {
                    aFunctionPtr = (Annotation)it;
                } else if (type_name.equals(Constants.GeneratedAnnotation) || type_name
                        .equals(Constants.GeneratedAnnotationFQ)) {
                    aGenerated = (Annotation)it;
                } else if (type_name.equals(Constants.LibraryAnnotation) || type_name
                        .equals(Constants.LibraryAnnotationFQ)) {
                    aLibrary = (Annotation)it;
                } else if (type_name.equals(Constants.MappedAnnotation) || type_name
                        .equals(Constants.MappedAnnotationFQ)) {
                    aMapped = (Annotation)it;
                } else if (type_name.equals(Constants.MappedReturnAnnotation) || type_name
                        .equals(Constants.MappedReturnAnnotationFQ)) {
                    aMappedReturn = (Annotation)it;
                } else if (type_name.equals(Constants.OwnedAnnotation) || type_name
                        .equals(Constants.OwnedAnnotationFQ)) {
                    aOwned = (Annotation)it;
                } else if (type_name.equals(Constants.RegisterOnStartupAnnotation) || type_name
                        .equals(Constants.RegisterOnStartupAnnotationFQ)) {
                    aRegisterOnStartup = (Annotation)it;
                } else if (type_name.equals(Constants.ReferenceInfoAnnotation) || type_name
                        .equals(Constants.ReferenceInfoAnnotationFQ)) {
                    aReferenceInfo = (Annotation)it;
                } else if (type_name.equals(Constants.RuntimeAnnotation) || type_name
                        .equals(Constants.RuntimeAnnotationFQ)) {
                    aRuntime = (Annotation)it;
                } else if (type_name.equals(Constants.UncertainArgumentAnnotation) || type_name
                        .equals(Constants.UncertainArgumentAnnotationFQ)) {
                    aUncertainArgument = (Annotation)it;
                } else if (type_name.equals(Constants.UncertainReturnAnnotation) || type_name
                        .equals(Constants.UncertainReturnAnnotationFQ)) {
                    aUncertainReturn = (Annotation)it;
                } else if (type_name.equals(Constants.NFloatAnnotation) || type_name
                        .equals(Constants.NFloatAnnotationFQ)) {
                    aNFloat = (Annotation)it;
                } else if (type_name.equals(Constants.NIntAnnotation) || type_name.equals(Constants.NIntAnnotationFQ)) {
                    aNInt = (Annotation)it;
                } else if (type_name.equals(Constants.NUIntAnnotation) || type_name
                        .equals(Constants.NUIntAnnotationFQ)) {
                    aNUInt = (Annotation)it;
                } else if (type_name.equals(Constants.CFunctionAnnotation) || type_name
                        .equals(Constants.CFunctionAnnotationFQ)) {
                    aCFunction = (Annotation)it;
                } else if (type_name.equals(Constants.CVariableAnnotation) || type_name
                        .equals(Constants.CVariableAnnotationFQ)) {
                    aCVariable = (Annotation)it;
                } else if (type_name.equals(Constants.InlineAnnotation) || type_name
                        .equals(Constants.InlineAnnotationFQ)) {
                    aInline = (Annotation)it;
                } else if (type_name.equals(Constants.StructureAnnotation) || type_name
                        .equals(Constants.StructureAnnotationFQ)) {
                    aStructure = (Annotation)it;
                } else if (type_name.equals(Constants.StructureFieldAnnotation) || type_name
                        .equals(Constants.StructureFieldAnnotationFQ)) {
                    aStructureField = (Annotation)it;
                } else if (type_name.equals(Constants.VariadicAnnotation) || type_name
                        .equals(Constants.VariadicAnnotationFQ)) {
                    aVariadic = (Annotation)it;
                } else if (type_name.equals(Constants.CategoryClassMethodAnnotation) || type_name
                        .equals(Constants.CategoryClassMethodAnnotationFQ)) {
                    aCategoryClassMethod = (Annotation)it;
                }

                // TODO MOE fix
                else if (type_name.equals(Constants.PropertyAnnotation) || type_name
                        .equals(Constants.PropertyAnnotationFQ)) {
                    aProperty = (Annotation)it;
                } else if (type_name.equals(Constants.IBActionAnnotation) || type_name
                        .equals(Constants.IBActionAnnotationFQ)) {
                    aIBAction = (Annotation)it;
                } else if (type_name.equals(Constants.IBOutletAnnotation) || type_name
                        .equals(Constants.IBOutletAnnotationFQ)) {
                    aIBOutlet = (Annotation)it;
                } else if (type_name.equals(Constants.IBOutletCollectionAnnotation) || type_name
                        .equals(Constants.IBOutletCollectionAnnotationFQ)) {
                    aIBOutletCollection = (Annotation)it;
                } else if (type_name.equals(Constants.InstanceVariableAnnotation) || type_name
                        .equals(Constants.InstanceVariableAnnotationFQ)) {
                    aInstanceVariable = (Annotation)it;
                } else if (type_name.equals(Constants.IsOptionalAnnotation) || type_name
                        .equals(Constants.IsOptionalAnnotationFQ)) {
                    aIsOptional = (Annotation)it;
                } else if (type_name.equals(Constants.NotImplementedAnnotation) || type_name
                        .equals(Constants.NotImplementedAnnotationFQ)) {
                    aNotImplemented = (Annotation)it;
                } else if (type_name.equals(Constants.ObjCBlockAnnotation) || type_name
                        .equals(Constants.ObjCBlockAnnotationFQ)) {
                    aObjCBlock = (Annotation)it;
                } else if (type_name.equals(Constants.ObjCCategoryAnnotation) || type_name
                        .equals(Constants.ObjCCategoryAnnotationFQ)) {
                    aObjCCategory = (Annotation)it;
                } else if (type_name.equals(Constants.ObjCClassBindingAnnotation) || type_name
                        .equals(Constants.ObjCClassBindingAnnotationFQ)) {
                    aObjCClassBinding = (Annotation)it;
                } else if (type_name.equals(Constants.ObjCClassNameAnnotation) || type_name
                        .equals(Constants.ObjCClassNameAnnotationFQ)) {
                    aObjCClassName = (Annotation)it;
                } else if (type_name.equals(Constants.ObjCProtocolNameAnnotation) || type_name
                        .equals(Constants.ObjCProtocolNameAnnotationFQ)) {
                    aObjCProtocolName = (Annotation)it;
                } else if (type_name.equals(Constants.ProtocolClassMethodAnnotation) || type_name
                        .equals(Constants.ProtocolClassMethodAnnotationFQ)) {
                    aProtocolClassMethod = (Annotation)it;
                } else if (type_name.equals(Constants.SelectorAnnotation) || type_name
                        .equals(Constants.SelectorAnnotationFQ)) {
                    aSelector = (Annotation)it;
                } else if (type_name.equals(Constants.XIBAnnotation) || type_name.equals(Constants.XIBAnnotationFQ)) {
                    aXIB = (Annotation)it;
                } else if (type_name.equals("Deprecated")) {
                    aDeprecated = (Annotation)it;
                }
                allAnnotations.add((Annotation)it);
            } else if (it.isModifier()) {
                ModifierKeyword keyword = ((Modifier)it).getKeyword();
                if (keyword == ModifierKeyword.PUBLIC_KEYWORD) {
                    mPublic = (Modifier)it;
                } else if (keyword == ModifierKeyword.PROTECTED_KEYWORD) {
                    mProtected = (Modifier)it;
                } else if (keyword == ModifierKeyword.PRIVATE_KEYWORD) {
                    mPrivate = (Modifier)it;
                } else if (keyword == ModifierKeyword.STATIC_KEYWORD) {
                    mStatic = (Modifier)it;
                } else if (keyword == ModifierKeyword.ABSTRACT_KEYWORD) {
                    mAbstract = (Modifier)it;
                } else if (keyword == ModifierKeyword.FINAL_KEYWORD) {
                    mFinal = (Modifier)it;
                } else if (keyword == ModifierKeyword.NATIVE_KEYWORD) {
                    mNative = (Modifier)it;
                } else if (keyword == ModifierKeyword.DEFAULT_KEYWORD) {
                    mDefault = (Modifier)it;
                } else if (keyword == ModifierKeyword.SYNCHRONIZED_KEYWORD) {
                    continue;
                } else if (keyword == ModifierKeyword.TRANSIENT_KEYWORD) {
                    continue;
                } else if (keyword == ModifierKeyword.VOLATILE_KEYWORD) {
                    continue;
                } else if (keyword == ModifierKeyword.STRICTFP_KEYWORD) {
                    continue;
                }
                allModifiers.add((Modifier)it);
            }
        }
    }

    @Override
    public boolean isEditable() {
        return ((isGenerated() || isNew) && !isClosed) || forceEditing;
    }

    @Override
    public void close() throws NotEditableException {
        editLock();

        isClosed = true;
        forceEditing = false;

        ArrayList<ASTNode> unmanaged = new ArrayList<ASTNode>();

        unmanaged.addAll(allAnnotations);
        unmanaged.addAll(allModifiers);
        unmanaged.removeAll(managedAnnotations);
        unmanaged.removeAll(managedModifiers);

        for (ASTNode mods : unmanaged) {
            lrw.remove(mods, getEditGroup());
        }
    }

    public void forceEdit() {
        forceEditing = true;
    }

    public void setPublic() throws GeneratorException {
        mPublic = setModifier(mPublic, ModifierKeyword.PUBLIC_KEYWORD);
    }

    public void setProtected() throws GeneratorException {
        mProtected = setModifier(mProtected, ModifierKeyword.PROTECTED_KEYWORD);
    }

    public void setPrivate() throws GeneratorException {
        mPrivate = setModifier(mPrivate, ModifierKeyword.PRIVATE_KEYWORD);
    }

    public void setStatic() throws GeneratorException {
        mStatic = setModifier(mStatic, ModifierKeyword.STATIC_KEYWORD);
    }

    public void setAbstract() throws GeneratorException {
        mAbstract = setModifier(mAbstract, ModifierKeyword.ABSTRACT_KEYWORD);
    }

    public void setFinal() throws GeneratorException {
        mFinal = setModifier(mFinal, ModifierKeyword.FINAL_KEYWORD);
    }

    public void setNative() throws GeneratorException {
        mNative = setModifier(mNative, ModifierKeyword.NATIVE_KEYWORD);
    }

    public void setDefault() throws GeneratorException {
        mDefault = setModifier(mDefault, ModifierKeyword.DEFAULT_KEYWORD);
    }

    private Modifier setModifier(Modifier modifier, ModifierKeyword keyword) throws GeneratorException {
        editLock();

        if (modifier == null || getRewrite().get(modifier, Modifier.KEYWORD_PROPERTY) != keyword) {
            modifier = getAST().newModifier(keyword);
            lrw.insertLast(modifier, getEditGroup());
        }
        managedModifiers.add(modifier);
        return modifier;
    }

    public void setByValue() throws GeneratorException {
        aByValue = newMarker(aByValue, ByValue);
    }

    public void setFunctionPtr(String name) throws GeneratorException {
        aFunctionPtr = newNormal(aFunctionPtr, FunctionPtr);
        ArrayList<String> keys = new ArrayList<String>();
        if (name != null) {
            keys.add("name");
        }
        removeNAKeysExcluding(aFunctionPtr, keys);
        if (name != null) {
            setNAField(aFunctionPtr, 0, "name", newStringLiteral(name));
        }
    }

    public void setGenerated() throws GeneratorException {
        setGenerated(null);
    }

    public void setGenerated(String value) throws GeneratorException {
        if (value == null) {
            aGenerated = removeOnTypeMismatch(aGenerated, MarkerAnnotation.class);
            aGenerated = newMarker(aGenerated, Generated);
        } else {
            aGenerated = removeOnTypeMismatch(aGenerated, SingleMemberAnnotation.class);
            aGenerated = newSingleMember(aGenerated, Generated);
            setSMAStringValue(aGenerated, value);
        }
    }

    public void setLibrary(String value) throws GeneratorException {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        aLibrary = newSingleMember(aLibrary, Library);
        setSMAStringValue(aLibrary, value);
    }

    public void setMapped(String value, boolean isReturnModifier) throws GeneratorException {
        if (isReturnModifier) {
            aMappedReturn = newSingleMember(aMappedReturn, MappedReturn);
            setSMATypeValue(aMappedReturn, value);
        } else {
            aMapped = newSingleMember(aMapped, Mapped);
            setSMATypeValue(aMapped, value);
        }
    }

    public void setOwned() throws GeneratorException {
        aOwned = newMarker(aOwned, Owned);
    }

    public void setRegisterOnStartup() throws GeneratorException {
        aRegisterOnStartup = newMarker(aRegisterOnStartup, RegisterOnStartup);
    }

    public void setRuntime(String value) throws GeneratorException {
        if (!value.equals(Constants.CRuntime) && !value.equals(Constants.CRuntimeFQ) && !value
                .equals(Constants.ObjCRuntime) && !value.equals(Constants.ObjCRuntimeFQ)) {
            throw new IllegalArgumentException();
        }
        aRuntime = newSingleMember(aRuntime, Runtime);
        setSMATypeValue(aRuntime, value);
    }

    public void setReferenceInfo(String type, int depth) throws GeneratorException {
        if (type == null || type.length() == 0 || depth < 1) {
            throw new IllegalArgumentException();
        }
        aReferenceInfo = newNormal(aReferenceInfo, ReferenceInfo);
        ArrayList<String> keys = new ArrayList<String>();
        keys.add("type");
        if (depth > 1) {
            keys.add("depth");
        }
        removeNAKeysExcluding(aReferenceInfo, keys);
        TypeLiteral tl = getAST().newTypeLiteral();
        getRewrite().set(tl, TypeLiteral.TYPE_PROPERTY, getAST().newSimpleType(getAST().newSimpleName(type)),
                getEditGroup());
        setNAField(aReferenceInfo, 0, "type", tl);
        if (depth > 1) {
            setNAField(aReferenceInfo, 0, "depth", getAST().newNumberLiteral(Integer.toString(depth)));
        }
    }

	/*
     * public void setUncertainBinding(String value) throws GeneratorException {
	 * if (value == null) { throw new IllegalArgumentException(); }
	 * aUncertainBinding = newSingleMember(aUncertainBinding, UncertainBinding);
	 * setSMAStringValue(aUncertainBinding, value); }
	 */

    public UncertainDescriptor uncertainDescriptor;

    public UncertainDescriptor getUncertainDescriptor() {
        return uncertainDescriptor;
    }

    public void setUncertain(UncertainDescriptor value, boolean isReturnModifier) throws GeneratorException {
        uncertainDescriptor = value;
        if (!value.isFallback()) {
            // Don't put on the annotation if it was resolved
            return;
        }
        if (isReturnModifier) {
            aUncertainReturn = newSingleMember(aUncertainReturn, UncertainReturn);
            setSMAStringValue(aUncertainReturn, value.getDescription());
        } else {
            aUncertainArgument = newSingleMember(aUncertainArgument, UncertainArgument);
            setSMAStringValue(aUncertainArgument, value.getDescription());
        }
    }

    public void setCFunction(String value) throws GeneratorException {
        if (value == null) {
            aCFunction = removeOnTypeMismatch(aCFunction, MarkerAnnotation.class);
            aCFunction = newMarker(aCFunction, CFunction);
        } else {
            aCFunction = removeOnTypeMismatch(aCFunction, SingleMemberAnnotation.class);
            aCFunction = newSingleMember(aCFunction, CFunction);
            setSMAStringValue(aCFunction, value);
        }
    }

    public void setCVariable(String name, boolean isGetter) throws GeneratorException {
        aCVariable = newNormal(aCVariable, CVariable);
        ArrayList<String> keys = new ArrayList<String>();
        if (name != null) {
            keys.add("name");
        }
        if (isGetter != true) {
            keys.add("isGetter");
        }
        removeNAKeysExcluding(aCVariable, keys);
        if (name != null) {
            setNAField(aCVariable, 0, "name", newStringLiteral(name));
        }
        if (isGetter != true) {
            setNAField(aCVariable, 1, "isGetter", getAST().newBooleanLiteral(isGetter));
        }
    }

    public void setInline() throws GeneratorException {
        aInline = newMarker(aInline, Inline);
    }

    public void setStructure(int alignment) throws GeneratorException {
        aStructure = newNormal(aStructure, Structure);
        ArrayList<String> keys = new ArrayList<String>();
        if (alignment != 0) {
            keys.add("alignment");
        }
        removeNAKeysExcluding(aStructure, keys);
        if (alignment != 0) {
            setNAField(aStructure, 0, "alignment", getAST().newNumberLiteral(Integer.toString(alignment)));
        }
    }

    public void setStructureField(int order, boolean isGetter, int count) throws GeneratorException {
        aStructureField = newNormal(aStructureField, StructureField);
        ArrayList<String> keys = new ArrayList<String>();
        keys.add("order");
        keys.add("isGetter");
        if (count != 1) {
            keys.add("count");
        }
        removeNAKeysExcluding(aStructureField, keys);
        int idx = 0;
        setNAField(aStructureField, idx++, "order", getAST().newNumberLiteral(Integer.toString(order)));
        setNAField(aStructureField, idx++, "isGetter", getAST().newBooleanLiteral(isGetter));
        if (count != 1) {
            setNAField(aStructureField, idx++, "count", getAST().newNumberLiteral(Integer.toString(count)));
        }
    }

    public void setVariadic() throws GeneratorException {
        aVariadic = newNormal(aVariadic, Variadic);
        ArrayList<String> keys = new ArrayList<String>();
        // keys.add("unboxPolicy");
        removeNAKeysExcluding(aVariadic, keys);
    }

    public void setCategoryClassMethod() throws GeneratorException {
        aCategoryClassMethod = newMarker(aCategoryClassMethod, CategoryClassMethod);
    }

    // TODO MOE fix
    public void setProperty() throws GeneratorException {
        aProperty = newMarker(aProperty, Property);
    }

    public void setIBAction() throws GeneratorException {
        aIBAction = newMarker(aIBAction, IBAction);
    }

    public void setIBOutlet() throws GeneratorException {
        aIBOutlet = newMarker(aIBOutlet, IBOutlet);
    }

    public void setIBOutletCollection(String value) throws GeneratorException {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        aIBOutletCollection = newSingleMember(aIBOutletCollection, IBOutletCollection);
        setSMAStringValue(aIBOutletCollection, value);
    }

    public void setInstanceVariable(String name, boolean isGetter) throws GeneratorException {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        aInstanceVariable = newNormal(aInstanceVariable, InstanceVariable);
        ArrayList<String> keys = new ArrayList<String>();
        keys.add("name");
        keys.add("isGetter");
        removeNAKeysExcluding(aInstanceVariable, keys);
        setNAField(aInstanceVariable, 0, "name", newStringLiteral(name));
        setNAField(aInstanceVariable, 1, "isGetter", getAST().newBooleanLiteral(isGetter));
    }

    public void setIsOptional() throws GeneratorException {
        aIsOptional = newMarker(aIsOptional, IsOptional);
    }

    public void setNotImplemented() throws GeneratorException {
        aNotImplemented = newMarker(aNotImplemented, NotImplemented);
    }

    public void setObjCBlock(String name) throws GeneratorException {
        aObjCBlock = newNormal(aObjCBlock, ObjCBlock);
        ArrayList<String> keys = new ArrayList<String>();
        if (name != null) {
            keys.add("name");
        }
        removeNAKeysExcluding(aObjCBlock, keys);
        if (name != null) {
            setNAField(aObjCBlock, 0, "name", newStringLiteral(name));
        }
    }

    public void setObjCCategory(String value) throws GeneratorException {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        aObjCCategory = newSingleMember(aObjCCategory, ObjCCategory);
        setSMATypeValue(aObjCCategory, value);
    }

    public void setObjCClassBinding() throws GeneratorException {
        aObjCClassBinding = newMarker(aObjCClassBinding, ObjCClassBinding);
    }

    public void setObjCClassName(String value) throws GeneratorException {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        aObjCClassName = newSingleMember(aObjCClassName, ObjCClassName);
        setSMAStringValue(aObjCClassName, value);
    }

    public void setObjCProtocolName(String value) throws GeneratorException {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        aObjCProtocolName = newSingleMember(aObjCProtocolName, ObjCProtocolName);
        setSMAStringValue(aObjCProtocolName, value);
    }

    public void setProtocolClassMethod(String value) throws GeneratorException {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        aProtocolClassMethod = newSingleMember(aProtocolClassMethod, ProtocolClassMethod);
        setSMAStringValue(aProtocolClassMethod, value);
    }

    public void setSelector(String value) throws GeneratorException {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        aSelector = newSingleMember(aSelector, Selector);
        setSMAStringValue(aSelector, value);
    }

    public void setXIB() throws GeneratorException {
        aXIB = newMarker(aXIB, XIB);
    }

    public void setDeprecated() throws GeneratorException {
        aDeprecated = newMarker(aDeprecated, Deprecated);
    }

    private Annotation newMarker(Annotation annotation, String type[]) throws GeneratorException {
        if (annotation == null) {
            annotation = getAST().newMarkerAnnotation();
            lrw.insertFirst(annotation, getEditGroup());
        }

        setAnnotationName(annotation, type);
        managedAnnotations.add(annotation);

        return annotation;
    }

    private Annotation newSingleMember(Annotation annotation, String type[]) throws GeneratorException {
        if (annotation == null) {
            annotation = getAST().newSingleMemberAnnotation();
            lrw.insertFirst(annotation, getEditGroup());
        }

        setAnnotationName(annotation, type);
        managedAnnotations.add(annotation);

        return annotation;
    }

    private Annotation newNormal(Annotation annotation, String type[]) throws GeneratorException {
        if (annotation == null) {
            annotation = getAST().newNormalAnnotation();
            lrw.insertFirst(annotation, getEditGroup());
        }

        setAnnotationName(annotation, type);
        managedAnnotations.add(annotation);

        return annotation;
    }

    public boolean isStatic() {
        return mStatic != null;
    }

    public boolean isGenerated() {
        return aGenerated != null;
    }

    public boolean isCFunctionBinder(String nfunction, String jmethod) {
        if (aCFunction == null) {
            return false;
        }

        String value = getSMAStringValue(aCFunction);
        if (value == null) {
            value = jmethod;
        }

        return nfunction.equals(value);
    }

    public boolean isCVariableBinder(String nvariable, String jmethod, boolean isGetter) {
        if (aCVariable == null) {
            return false;
        }

        Boolean getter = getNABooleanValue(aCVariable, "isGetter");
        if ((getter == null && isGetter != true) || (getter != null && getter.booleanValue() != isGetter)) {
            return false;
        }

        String value = getNAStringValue(aCVariable, "name");
        if (value == null) {
            value = jmethod;
        }

        return nvariable.equals(value);
    }

    public boolean isStructFieldBinder(int order, boolean isGetter) {
        if (aStructureField == null) {
            return false;
        }

        Integer ord = getNANumberValue(aStructureField, "order");
        if (ord == null || (ord.intValue() != order)) {
            return false;
        }

        Boolean getter = getNABooleanValue(aStructureField, "isGetter");
        if (getter == null || (getter.booleanValue() != isGetter)) {
            return false;
        }

        return true;
    }

    public boolean isObjCMethodBinder(String selector, boolean isStatic) {
        if (aSelector == null) {
            return false;
        }

        if ((mStatic != null) != isStatic) {
            return false;
        }

        String value = getSMAStringValue(aSelector);

        return selector.equals(value);
    }

    public boolean isObjCProtocolClassMethodBinder(String jmethod) {
        if (aProtocolClassMethod == null) {
            return false;
        }

        return jmethod.equals(getSMAStringValue(aProtocolClassMethod));
    }

    public static class UncertainDescriptor {
        private final String options[];
        private String resolved;
        private boolean isFallback = true;

        public UncertainDescriptor(String... options) {
            this.options = options;
            this.resolved = options[0];
        }

        public UncertainDescriptor(String fallback, String options[]) {
            this.options = options;
            this.resolved = fallback;
        }

        public String getDescription() {
            StringBuilder builder = new StringBuilder();
            builder.append("Options: ");
            for (int i = 0; i < options.length; ++i) {
                builder.append(options[i]);
                if (i + 1 < options.length) {
                    builder.append(", ");
                }
            }
            builder.append(" Fallback: ");
            builder.append(getResolved());
            return builder.toString();
        }

        public void resolve(Type type) {
            if (type.getPreferredResolving() == null) {
                return;
            }

            for (String option : options) {
                if (option.equals(type.getPreferredResolving())) {
                    resolved = type.getPreferredResolving();
                    isFallback = false;
                    return;
                }
            }
        }

        public String[] getOptions() {
            return options;
        }

        public String getResolved() {
            return resolved;
        }

        public boolean isFallback() {
            return isFallback;
        }
    }

    public void setDowngradeAnnotation(String downgradeAnnotation) throws GeneratorException {
        if (Constants.NFloatAnnotationFQ.equals(downgradeAnnotation)) {
            aNFloat = newMarker(aNFloat, NFloat);
        } else if (Constants.NIntAnnotationFQ.equals(downgradeAnnotation)) {
            aNInt = newMarker(aNInt, NInt);
        } else if (Constants.NUIntAnnotationFQ.equals(downgradeAnnotation)) {
            aNUInt = newMarker(aNUInt, NUInt);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
