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

import org.moe.natj.processor.cxx.utility.BridgeMethodDesc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Result object of CxxClassInfoResolver.
 */
public class CxxClassInfoResolutionResult {

    /**
     * Implemented methods.
     */
    private List<CxxMemberImplInfo> implementedMethods;

    /**
     * Inherited direct access only methods.
     */
    private List<CxxMemberImplInfo> inheritedDirectOnlyMethods;

    /**
     * Class has pure virtual method flag.
     */
    private Boolean classHasPureVirtualMethod;

    /**
     * Java bridge methods.
     */
    private List<BridgeMethodDesc> bridgeMethodDescs;

    /**
     * Returns the methods implemented by this class.
     *
     * @return Implemented methods
     */
    public List<CxxMemberImplInfo> getImplementedMethods() {
        if (implementedMethods == null) {
            throw new NullPointerException();
        }
        return implementedMethods;
    }

    /**
     * Sets the methods implemented by this class.
     *
     * @param implementedMethods Implemented methods
     */
    public void setImplementedMethods(Collection<CxxMemberImplInfo> implementedMethods) {
        if (this.implementedMethods != null) {
            throw new RuntimeException("Parameter already set");
        }
        this.implementedMethods = Collections.unmodifiableList(new ArrayList<>(implementedMethods));
    }

    /**
     * Returns the inherited methods which are only available through a direct-interface.
     *
     * @return Direct-only inherited methods
     */
    public List<CxxMemberImplInfo> getInheritedDirectOnlyMethods() {
        if (inheritedDirectOnlyMethods == null) {
            throw new NullPointerException();
        }
        return inheritedDirectOnlyMethods;
    }

    /**
     * Sets the inherited methods which are only available through a direct-interface.
     *
     * @param inheritedDirectOnlyMethods Direct-only inherited methods
     */
    public void setInheritedDirectOnlyMethods(Collection<CxxMemberImplInfo> inheritedDirectOnlyMethods) {
        if (this.inheritedDirectOnlyMethods != null) {
            throw new RuntimeException("Parameter already set");
        }
        this.inheritedDirectOnlyMethods = Collections.unmodifiableList(new ArrayList<>(inheritedDirectOnlyMethods));
    }

    /**
     * Tells whether or not this class has unimplemented pure-virtual methods.
     *
     * @return True iff class has unimplemented pure-virtual methods
     */
    public boolean getClassHasPureVirtualMethod() {
        if (classHasPureVirtualMethod == null) {
            throw new NullPointerException();
        }
        return classHasPureVirtualMethod;
    }

    /**
     * Sets whether or not this class has unimplemented pure-virtual methods.
     *
     * @param classHasPureVirtualMethod True iff class has unimplemented pure-virtual methods
     */
    public void setClassHasPureVirtualMethod(Boolean classHasPureVirtualMethod) {
        if (this.classHasPureVirtualMethod != null) {
            throw new RuntimeException("Parameter already set");
        }
        this.classHasPureVirtualMethod = classHasPureVirtualMethod;
    }

    /**
     * Returns the bridge methods implemented by this class.
     *
     * @return Bridge methods
     */
    public List<BridgeMethodDesc> getBridgeMethodDescs() {
        if (bridgeMethodDescs == null) {
            throw new NullPointerException();
        }
        return bridgeMethodDescs;
    }

    /**
     * Sets the bridge methods implemented by this class.
     *
     * @param bridgeMethodDescs Bridge methods
     */
    public void setBridgeMethodDescs(Collection<BridgeMethodDesc> bridgeMethodDescs) {
        if (this.bridgeMethodDescs != null) {
            throw new RuntimeException("Parameter already set");
        }
        this.bridgeMethodDescs = Collections.unmodifiableList(new ArrayList<>(bridgeMethodDescs));
    }
}
