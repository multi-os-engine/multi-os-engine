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

import org.clang.enums.CXObjCPropertyAttrKind;
import org.moe.natjgen.util.StringUtil;

import java.util.ArrayList;
import java.util.HashSet;

public class ObjCMethod extends AbstractModelElement implements IParameterizedCallable {

    public static final int NON_PROPERTY = -1;

    /**
     * Tells whether a method is a class or instance method
     */
    private boolean isStatic = false;

    /**
     * Contains the return type of the method
     */
    private Type type = null;

    /**
     * Contains the arguments of the method
     */
    private ArrayList<CalleeArgument> arguments = null;

    /**
     * Variadic flag
     */
    private final boolean isVariadic;

    /**
     * Objective-C method family information
     */
    private ObjCMethodFamily family = ObjCMethodFamily.UNDEFINED;

    /**
     * Contains the java side name of the method
     */
    private String javaName = null;

    /**
     * This flag indicates whether the method is in an external unit or not
     */
    private boolean externalUnit = false;

    /**
     * This flag indicates whether the method generation is disabled or not
     */
    private boolean unitDisabled = false;

    /**
     * This flag indicates whether a method is from an Objective-C protocol or
     * not
     */
    private boolean isProtocolMethod = false;

    /**
     * This flag indicated whether the method is @optional in Objective-C
     * or @required
     */
    private boolean isOptional = false;

    /**
     * This flag indicated whether the method is @deprecated or not
     */
    private boolean isDeprecated = false;

    /**
     * This flag indicated whether the method is inherited from a non-template class or not
     */
    private boolean isInheritedFromNonTemplateClass = false;

    /**
     * The name of the property (if the method is part of a @property)
     */
    private String propertyName = null;

    /**
     * Attribute property of the method
     */
    private ObjCAttributeInfo attribute = null;

    /**
     * Original kind of the method
     */
    private final ObjCMethodKind kind;

    /**
     * Property information, only non-negative when method is property.
     * Type: CXObjCPropertyAttrKind
     */
    private int propertyFlags = NON_PROPERTY;

    /**
     * Associated getter method, only valid for property setter methods.
     */
    private ObjCMethod associatedGetter = null;

    /**
     * Unit manager owner of this method.
     */
    private final AbstractUnitManager owner;

    /**
     * Create an Objective-C method
     *
     * @param selector Objective-C selector
     * @param isStatic method is static
     * @param type     return type
     * @param argCount number of arguments
     */
    public ObjCMethod(String selector, boolean isStatic, Type type, int argCount, ObjCMethodKind kind,
            boolean isVariadic, AbstractUnitManager owner) {
        super(selector, true);
        if (owner == null) {
            throw new IllegalArgumentException();
        }

        // Set values
        this.isStatic = isStatic;
        if (type == null) {
            this.type = new Type();
        } else {
            this.type = type;
        }
        this.kind = kind;
        this.arguments = new ArrayList<CalleeArgument>(argCount);
        this.isVariadic = isVariadic;
        this.owner = owner;

        // Update helper information
        updateJavaMethodName();
    }

    private final HashSet<ObjCMethod> inheritedCopies = new HashSet<>();

    /**
     * Creates a copy of a method and skips the 'skipViaConfig' flag.
     *
     * @return a copy of this method
     * @throws GeneratorException when trying to copy a non-init and non-factory method
     */
    ObjCMethod getInheritedCopy(ObjCClassManager owner) throws GeneratorException {
        if (family != ObjCMethodFamily.INIT && family != ObjCMethodFamily.FACTORY && !isStatic) {
            throw new GeneratorException("trying to copy non-init, non-factory and non-static method");
        }
        ObjCMethod copy = new ObjCMethod(getName(), isStatic, type, arguments.size(), kind, isVariadic, owner);
        copy.arguments.addAll(arguments);
        copy.family = family;
        copy.javaName = javaName;
        copy.unitDisabled = unitDisabled;
        copy.isProtocolMethod = isProtocolMethod;
        copy.isOptional = isOptional;
        copy.isDeprecated = isDeprecated;
        copy.propertyName = propertyName;
        copy.attribute = attribute;
        copy.propertyFlags = propertyFlags;
        copy.associatedGetter = associatedGetter;
        if (this.owner != null && this.owner instanceof ObjCClassManager) {
            ObjCClassManager cmOwner = (ObjCClassManager)this.owner;
            copy.isInheritedFromNonTemplateClass = cmOwner.genericParamTypes.size() == 0;
        }
        inheritedCopies.add(copy);
        return copy;
    }

    /**
     * Create an <code> + alloc </code> method for a given class
     *
     * @param clazz class of the alloc method
     * @return new alloc method
     */
    public static ObjCMethod allocMethod(String clazz, AbstractUnitManager owner) {
        return new ObjCMethod("alloc", true, new Type(clazz), 0, ObjCMethodKind.METHOD, false, owner);
    }

    /**
     * Get the method's Objective-C selector
     *
     * @return selector
     */
    public String getSelector() {
        return getName();
    }

    /**
     * Returns whether the method is a class or instance method
     *
     * @return true if class method otherwise false
     */
    public boolean isStatic() {
        return isStatic;
    }

    /**
     * Get the return type of the method
     *
     * @return return type
     */
    @Override
    public Type getType() {
        return type;
    }

    /**
     * Get the arguments of the method
     *
     * @return arguments list
     */
    @Override
    public ArrayList<CalleeArgument> getArguments() {
        return arguments;
    }

    @Override
    public boolean isVariadic() {
        return isVariadic;
    }

    @Override
    public String getVariadicName() {
        return Util.nameOfVariadic(this);
    }

    /**
     * Get the Java name of the method
     *
     * @return Java name
     */
    @Override
    public String getJavaName() {
        return javaName;
    }

    /**
     * Tells whether the method is external or not
     *
     * @return external flag
     */
    public boolean isExternalUnit() {
        return externalUnit;
    }

    /**
     * Sets the external flag, but will only set if the method is non-external
     *
     * @param externalUnit external flag
     */
    public void setExternalUnit(boolean externalUnit) {
        if (!this.externalUnit) {
            this.externalUnit = externalUnit;
        }
    }

    /**
     * Tells whether the method generation is disabled or not
     *
     * @return disabled flag
     */
    public boolean isDisabled() {
        return unitDisabled;
    }

    /**
     * Disabled method generation
     */
    public void setDisabled() {
        unitDisabled = true;
    }

    /**
     * Tells whether the method is from a protocol or not
     *
     * @return true when method is from a protocol otherwise false
     */
    public boolean isProtocolMethod() {
        return isProtocolMethod;
    }

    /**
     * Sets the method isFromProtocol flag (non-revertable action!)
     */
    public void setProtocolMethod() {
        this.isProtocolMethod = true;
    }

    /**
     * Tells whether the method is <code> @optional </code> or not
     *
     * @return true if method is <code> @optional </code>, false if
     * <code> @required </code>
     */
    public boolean isOptional() {
        return isOptional;
    }

    /**
     * Sets the method isOptional flag (non-revertable action!)
     *
     * @param isopt true if optional otherwise false
     */
    public void setOptional(boolean isopt) {
        if (this.isOptional) {
            throw new RuntimeException("Cannot turn an optional method back to required!");
        }
        this.isOptional = isopt;
    }

    /**
     * Tells whether the method is deprecated or not
     *
     * @return true if deprecated otherwise false
     */
    public boolean isDeprecated() {
        return isDeprecated;
    }

    /**
     * Sets the method's deprecated property
     *
     * @param isDeprecated true if deprecated otherwise false
     */
    public void setDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    /**
     * Returns the method's @property name if any
     *
     * @return @property name
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the method's @property name
     *
     * @param propertyName
     * @property name
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Returns the family of the method
     *
     * @return method family
     */
    public ObjCMethodFamily getFamily() {
        return family;
    }

    /**
     * Returns the method's attribute info
     *
     * @return attribute info
     */
    public ObjCAttributeInfo getAttribute() {
        return attribute;
    }

    /**
     * Sets the method's attribute info
     *
     * @param attribute attribute info
     */
    public void setAttribute(ObjCAttributeInfo attribute) {
        this.attribute = attribute;
    }

    /**
     * Returns the property's flags, if the method is not part of a property,
     * then NON_PROPERTY is returned.
     *
     * @return property's flags
     */
    public int getPropertyFlags() {
        return propertyFlags;
    }

    /**
     * Sets the property's flags.
     *
     * @param propertyFlags new flags
     */
    public void setPropertyFlags(int propertyFlags) {
        this.propertyFlags = propertyFlags;
    }

    /**
     * Returns the associated getter method, only valid for property setter
     * methods.
     *
     * @return getter method
     */
    public ObjCMethod getAssociatedGetter() {
        return associatedGetter;
    }

    /**
     * Sets the associated getter method name.
     *
     * @param associatedGetter getter method
     */
    public void setAssociatedGetter(ObjCMethod associatedGetter) {
        this.associatedGetter = associatedGetter;
    }

    /**
     * Update Java side name of the method
     */
    private void updateJavaMethodName() {
        javaName = StringUtil.getMethodNameFromObjCSelector(getName());
    }

    /**
     * Append a '_static' suffix to the java name
     */
    public void addStaticSuffix() {
        if (!javaName.endsWith("_static")) {
            javaName += "_static";
        }
        for (ObjCMethod inheritedCopy : inheritedCopies) {
            inheritedCopy.addStaticSuffix();
        }
    }

    /**
     * Close the method for further structural modification
     */
    public void close() {
        int count = arguments.size();
        for (int i = 0; i < count; ++i) {
            String primary = arguments.get(i).getName();
            for (int o = i + 1; o < count; ++o) {
                if (primary.equals(arguments.get(o).getName())) {
                    arguments.get(o).pushSuffix();
                    o = i;
                }
            }
        }
    }

    public boolean isSupported(Generator generator, ArrayList<String> problems) {
        boolean isSupported = true;

        ArrayList<String> innerP = problems == null ? null : new ArrayList<String>();
        if (!type.isSupported(generator, innerP)) {
            Util.transferProblems("bad return type", innerP, problems);
            isSupported = false;
        }

        int idx = 0;
        for (CalleeArgument arg : arguments) {
            if (innerP != null) {
                innerP.clear();
            }
            if (!arg.getType().isSupported(generator, innerP)) {
                Util.transferProblems("bad argument(" + idx + ") type", innerP, problems);
                isSupported = false;
            }
            ++idx;
        }

        return isSupported;
    }

    /**
     * Update method family information
     *
     * @param ownerClassName owner of the method
     */
    public void updateFamily(String ownerClassName) {
        if (family == ObjCMethodFamily.UNDEFINED) {
            if (isStatic) {
                String first_word = clangFirstWord();
                int range = ownerClassName
                        .indexOf(Character.toUpperCase(first_word.charAt(0)) + first_word.substring(1));
                if (range != -1) {
                    int remaining = range + first_word.length();
                    String remaining_sel = getName().substring(first_word.length());
                    if (remaining == ownerClassName.length() || remaining_sel
                            .startsWith(ownerClassName.substring(remaining))) {
                        family = ObjCMethodFamily.FACTORY;
                    } else {
                        family = ObjCMethodFamily.DEFAULT;
                    }
                } else {
                    family = ObjCMethodFamily.DEFAULT;
                }
            } else {
                String first_word = clangFirstWord();
                if (first_word.equals("init")) {
                    family = ObjCMethodFamily.INIT;
                } else {
                    family = ObjCMethodFamily.DEFAULT;
                }
            }
        }

        if (family == ObjCMethodFamily.UNDEFINED) {
            throw new RuntimeException("Updatinf family information failed!");
        }
    }

    /**
     * Small helper method to get the first word from the selector, ie.:
     * <code> initWithString -> init </code>
     *
     * @param start start index
     * @return selector's first word
     */
    private String clangFirstWord(int start) {
        int loc = start;
        while (loc < getName().length()) {
            char c = getName().charAt(loc);
            if (Character.isUpperCase(c) || c == ':') break;
            ++loc;
        }

        if (loc == 0) {
            while (loc < getName().length()) {
                char c = getName().charAt(loc);
                if (Character.isLowerCase(c) || c == ':') break;
                ++loc;
            }
            if (loc != getName().length()) --loc;
        }

        return getName().substring(0, loc);
    }

    /**
     * Small helper method to get the first word from the selector, ie.:
     * <code> initWithString -> init </code>
     *
     * @return selector's first word
     */
    private String clangFirstWord() {
        return clangFirstWord(1);
    }

    /**
     * Tells whether the method is an alloc method or not
     *
     * @return true if is alloc otherwise false
     */
    public boolean isAlloc() {
        return isStatic == true && getName().equals("alloc");
    }

    public boolean isRetainedReturn() {
        if (isStatic) {
            return getName().equals("alloc") || clangFirstWord().equals("new");
        } else {
            String firstWord = clangFirstWord();
            return firstWord.equals("copy") || (getName().startsWith("mutableCopy") && clangFirstWord(
                    "mutableC".length()).equals("opy"));
        }
    }

    @Override
    public String getDefaultRuntime() {
        return Constants.ObjCRuntimeFQ;
    }

    public String getStatisticsCategory() {
        if (kind == ObjCMethodKind.METHOD) {
            if (isStatic) {
                return Statistics.OBJC_CLASS_METHOD;
            } else {
                return Statistics.OBJC_INSTANCE_METHOD;
            }
        } else if (kind == ObjCMethodKind.PROPERTY_GETTER) {
            return Statistics.OBJC_PROPERTY_GETTER;
        } else if (kind == ObjCMethodKind.PROPERTY_SETTER) {
            return Statistics.OBJC_PROPERTY_SETTER;
        }
        throw new RuntimeException();
    }

    public AbstractUnitManager getOwner() {
        return owner;
    }

    public boolean isUnsafePropertySetter() {
        return kind == ObjCMethodKind.PROPERTY_SETTER && isUnsafeProperty();
    }

    public boolean isUnsafeProperty() {
        return (propertyFlags & CXObjCPropertyAttrKind.CXObjCPropertyAttr_assign) > 0
                || (propertyFlags & CXObjCPropertyAttrKind.CXObjCPropertyAttr_weak) > 0
                || (propertyFlags & CXObjCPropertyAttrKind.CXObjCPropertyAttr_unsafe_unretained) > 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("@");
        builder.append(getJavaName());
        for (CalleeArgument arg : getArguments()) {
            builder.append(" ");
            builder.append(arg.getType());
        }
        builder.append(" -> ");
        builder.append(getType());
        return builder.toString();
    }

    public Type getTypeAt(int argIdx) {
        if (argIdx == -1) {
            return getType();
        }
        return getArguments().get(argIdx).getType();
    }

    public boolean isInheritedFromNonTemplateClass() {
        return isInheritedFromNonTemplateClass;
    }
}
