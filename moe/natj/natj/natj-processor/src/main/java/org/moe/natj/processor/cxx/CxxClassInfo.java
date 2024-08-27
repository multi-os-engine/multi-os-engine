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

import org.moe.natj.processor.cxx.decl.DeclInfo;
import org.moe.natj.processor.cxx.utility.BridgeMethodDesc;
import org.objectweb.asm.Type;

import java.util.*;

/**
 * This class contains implementation details about a C++ class.
 */
public class CxxClassInfo {

    /**
     * Fully qualified C++ class name.
     */
    public final String cxxClassName;

    /**
     * Cxx super classes.
     */
    private final HashSet<CxxClassInfo> cxxSupers = new HashSet<>();

    /**
     * Flag for disabling copy constructor.
     */
    private boolean copyConstructorUnavailable;

    /**
     * Flag for disabling default constructor.
     */
    private boolean defaultConstructorUnavailable;

    /**
     * Flag for disabling destructor.
     */
    private boolean destructorUnavailable;

    /**
     * Java interface or class mapping this C++ class.
     */
    public final Type mapperType;

    /**
     * Java interface's or class' source file.
     */
    public final String mapperSourceFile;

    /**
     * Methods in this interface.
     */
    private final ArrayList<DeclInfo> members = new ArrayList<>();

    /**
     * Java super javaInterfaces.
     */
    private final HashSet<Type> javaInterfaces = new HashSet<>();

    /**
     * Bridge method descriptors.
     */
    private final ArrayList<BridgeMethodDesc> bridgeMethodDescs = new ArrayList<>();

    /**
     * Flag indicating whether or not this interface is a C++ class inheritance.
     */
    public final boolean isInherited;

    /**
     * Resolution result.
     */
    final CxxClassInfoResolutionResult resolutionResult = new CxxClassInfoResolutionResult();

    /**
     * Create a new CxxClassInfo instance.
     *
     * @param cxxClassName  C++ class name
     * @param itfName       Mapping interface name
     * @param itfSourceFile Mapping interface source file
     * @param isInherited   Is inherited class
     */
    public CxxClassInfo(String cxxClassName, String itfName, String itfSourceFile, boolean isInherited) {
        if (cxxClassName == null) {
            throw new NullPointerException();
        }
        if (itfName == null) {
            throw new NullPointerException();
        }
        this.mapperType = Type.getObjectType(itfName);
        this.mapperSourceFile = itfSourceFile;
        this.isInherited = isInherited;
        this.cxxClassName = cxxClassName;
    }

    /**
     * Returns the direct superclasses of this C++ class.
     *
     * @return Direct superclasses
     */
    public Set<CxxClassInfo> getCxxSupers() {
        return Collections.unmodifiableSet(cxxSupers);
    }

    /**
     * Adds a superclass to this C++ class.
     *
     * @param sup New superclass
     */
    public void addSuper(CxxClassInfo sup) {
        cxxSupers.add(sup);
    }

    /**
     * Tells whether the C++ copy constructor is unavailable or not.
     *
     * @return True iff copy constructor is unavailable
     */
    public boolean isCopyConstructorUnavailable() {
        try {
            return resolutionResult.getClassHasPureVirtualMethod() || copyConstructorUnavailable;
        } catch (RuntimeException ex) {
            throw new RuntimeException(cxxClassName, ex);
        }
    }

    /**
     * Tells whether the C++ copy constructor is available or not.
     *
     * @return True iff copy constructor is available
     */
    public boolean isCopyConstructorAvailable() {
        return !isCopyConstructorUnavailable();
    }

    /**
     * Marks the C++ copy constructor availability.
     *
     * @param copyConstructorUnavailable True if unavailable otherwise false
     */
    public void setCopyConstructorUnavailable(boolean copyConstructorUnavailable) {
        this.copyConstructorUnavailable = copyConstructorUnavailable;
    }

    /**
     * Tells whether the C++ default constructor is unavailable or not.
     *
     * @return True iff default constructor is unavailable
     */
    public boolean isDefaultConstructorUnavailable() {
        try {
            return resolutionResult.getClassHasPureVirtualMethod() || defaultConstructorUnavailable;
        } catch (RuntimeException ex) {
            throw new RuntimeException(cxxClassName, ex);
        }
    }

    /**
     * Tells whether the C++ default constructor is available or not.
     *
     * @return True iff default constructor is available
     */
    public boolean isDefaultConstructorAvailable() {
        return !isDefaultConstructorUnavailable();
    }

    /**
     * Marks the C++ default constructor availability.
     *
     * @param defaultConstructorUnavailable True if unavailable otherwise false
     */
    public void setDefaultConstructorUnavailable(boolean defaultConstructorUnavailable) {
        this.defaultConstructorUnavailable = defaultConstructorUnavailable;
    }

    /**
     * Tells whether the C++ destructor is unavailable or not.
     *
     * @return True iff destructor is unavailable
     */
    public boolean isDestructorUnavailable() {
        return destructorUnavailable;
    }

    /**
     * Tells whether the C++ destructor is available or not.
     *
     * @return True iff destructor is available
     */
    public boolean isDestructorAvailable() {
        return !isDestructorUnavailable();
    }

    /**
     * Marks the C++ destructor availability.
     *
     * @param destructorUnavailable True if unavailable otherwise false
     */
    public void setDestructorUnavailable(boolean destructorUnavailable) {
        this.destructorUnavailable = destructorUnavailable;
    }

    /**
     * Returns the methods implemented by this class.
     *
     * @return Implemented methods
     */
    public List<CxxMemberImplInfo> getImplementedMethods() {
        try {
            return resolutionResult.getImplementedMethods();
        } catch (RuntimeException ex) {
            throw new RuntimeException(cxxClassName, ex);
        }
    }

    /**
     * Returns the inherited methods which are only available through a direct-interface.
     *
     * @return Direct-only inherited methods
     */
    public List<CxxMemberImplInfo> getInheritedDirectOnlyMethods() {
        try {
            return resolutionResult.getInheritedDirectOnlyMethods();
        } catch (RuntimeException ex) {
            throw new RuntimeException(cxxClassName, ex);
        }
    }

    /**
     * Tells whether or not this class has unimplemented pure-virtual methods.
     *
     * @return True iff class has unimplemented pure-virtual methods
     */
    public boolean getClassHasPureVirtualMethod() {
        try {
            return resolutionResult.getClassHasPureVirtualMethod();
        } catch (RuntimeException ex) {
            throw new RuntimeException(cxxClassName, ex);
        }
    }

    /**
     * Returns the bridge methods implemented by this class.
     *
     * @return Bridge methods
     */
    public List<BridgeMethodDesc> getBridgeMethodDescs() {
        try {
            return resolutionResult.getBridgeMethodDescs();
        } catch (RuntimeException ex) {
            throw new RuntimeException(cxxClassName, ex);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CxxClassInfo classInfo = (CxxClassInfo) o;
        return Objects.equals(mapperType, classInfo.mapperType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapperType);
    }

    @Override
    public String toString() {
        return mapperType.getClassName();
    }

    /**
     * Adds a member to this class.
     *
     * @param member Member to add
     */
    public void addMember(DeclInfo member) {
        if (member == null) {
            throw new NullPointerException();
        }
        if (!member.getKindInfo().isClassMember()) {
            throw new IllegalArgumentException();
        }
        members.add(member);
    }

    /**
     * Returns the list of members.
     *
     * @return List of members
     */
    public List<DeclInfo> getMembers() {
        return Collections.unmodifiableList(members);
    }

    /**
     * Returns the set of implemented Java interfaces.
     *
     * @return Set of implemented Java interfaces
     */
    public Set<Type> getJavaInterfaces() {
        return Collections.unmodifiableSet(javaInterfaces);
    }

    /**
     * Adds a Java interface as implemented by this class.
     *
     * @param sup Java interface
     */
    public void addJavaInterface(Type sup) {
        javaInterfaces.add(sup);
    }

    /**
     * Adds an interface bridge method.
     *
     * @param bridgeMethodDesc Bridge method descriptor
     */
    public void addBidgeMethod(BridgeMethodDesc bridgeMethodDesc) {
        if (bridgeMethodDesc == null) {
            throw new NullPointerException();
        }
        bridgeMethodDescs.add(bridgeMethodDesc);
    }

    /**
     * Return the list of bridge methods.
     *
     * @return List of bridge methods
     */
    public List<BridgeMethodDesc> getMemberBridgeMethods() {
        return Collections.unmodifiableList(bridgeMethodDescs);
    }
}
