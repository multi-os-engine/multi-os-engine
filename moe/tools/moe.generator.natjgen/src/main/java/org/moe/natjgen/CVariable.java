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

import java.util.ArrayList;

public final class CVariable extends AbstractModelElement implements ICallable {

    /**
     * Type of the variable
     */
    private final Type type;

    /**
     * Java name of the variable
     */
    private String javaName = null;

    /**
     * Indicated whether the variable binding code should be generated or not
     */
    private boolean dontGenerate = false;

    /**
     * Optional value for the variable
     */
    private ConstantValue value;

    /**
     * Create a new C variable
     *
     * @param name name of the variable
     * @param type type of the variable
     */
    public CVariable(String name, Type type) {
        super(name, true);

        // Check values
        if (type == null) {
            throw new RuntimeException("Variable type cannot be null!");
        }

        // Set values
        this.type = type;

        // Update helper information
        updateJavaMethodName();
    }

    public Type getType() {
        return type;
    }

    public String getJavaName() {
        return javaName;
    }

    public boolean getDontGenerate() {
        return dontGenerate;
    }

    public void setDontGenerate() {
        this.dontGenerate = true;
    }

    public ConstantValue getValue() {
        return value;
    }

    public void setValue(ConstantValue value) {
        if (this.value != null) {
            throw new RuntimeException("Variable already has an associated value");
        }
        if (value == null) {
            throw new NullPointerException();
        }
        this.value = value;
    }

    /**
     * Update Java side name of the method
     */
    private void updateJavaMethodName() {
        javaName = getName();

        // Add '_c' suffix if special case
        if (JavaRestrictions.isReserved(javaName)) {
            javaName += "_c";
        }
    }

    /**
     * Append a suffix to the java name
     *
     * @param sfx suffix to append
     */
    public void addJavaSuffix(String sfx) {
        javaName += sfx;
    }

    public void validate(Generator generator) {
        dontGenerate = dontGenerate | !isSupported(generator, null);
    }

    public boolean isSupported(Generator generator, ArrayList<String> problems) {
        boolean isSupported = true;

        ArrayList<String> innerP = problems == null ? null : new ArrayList<String>();
        if (!type.isSupported(generator, innerP)) {
            Util.transferProblems("bad variable type", innerP, problems);
            isSupported = false;
        }

        return isSupported;
    }

    @Override
    public String getDefaultRuntime() {
        return Constants.CRuntimeFQ;
    }

}
