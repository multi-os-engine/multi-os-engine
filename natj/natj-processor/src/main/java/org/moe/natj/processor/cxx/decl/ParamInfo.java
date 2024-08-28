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

package org.moe.natj.processor.cxx.decl;

import org.moe.natj.processor.cxx.CxxType;

/**
 * This class represents a method parameter and related information.
 */
public class ParamInfo {

    /**
     * Name.
     */
    private String name;

    /**
     * Access flags.
     */
    private int access;

    /**
     * Type.
     */
    private CxxType type;

    /**
     * Creates a new ParamInfo instance.
     *
     * @param type type
     */
    public ParamInfo(CxxType type) {
        if (type == null) {
            throw new NullPointerException();
        }
        this.type = type;
    }

    /**
     * Returns the parameter's name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the parameter's name.
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the parameter's access flags.
     *
     * @return access flags
     */
    public int getAccess() {
        return access;
    }

    /**
     * Sets the parameter's access flags.
     *
     * @param access access flags
     */
    public void setAccess(int access) {
        this.access = access;
    }

    /**
     * Returns the parameter's type.
     *
     * @return type
     */
    public CxxType getType() {
        return type;
    }

    /**
     * Sets the parameter's type.
     *
     * @param type type
     */
    public void setType(CxxType type) {
        if (type == null) {
            throw new NullPointerException();
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "<parameter name: " + getName() + ", type: " + getType() + ">";
    }
}
