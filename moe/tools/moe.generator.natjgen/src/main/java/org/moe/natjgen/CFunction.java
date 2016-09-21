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
import java.util.HashSet;
import java.util.Set;

public final class CFunction extends AbstractModelElement implements IParameterizedCallable {

    /**
     * Return type of the function
     */
    private Type type = null;

    /**
     * Funtion's arguments
     */
    private ArrayList<CalleeArgument> arguments = null;

    /**
     * Variadic flag
     */
    private final boolean isVariadic;

    /**
     * Java name of the function
     */
    private String javaName = null;

    /**
     * Indicated whether the function binding code should be generated or not
     */
    private boolean dontGenerate = false;

    /**
     * This flag indicated whether the method is @deprecated or not
     */
    private boolean isDeprecated = false;

    /**
     * This flag indicated whether the method is inlined or not
     */
    private boolean isInlined = false;

    /**
     * Location of the function declaration and locations of the referred types
     */
    private Set<String> locations;

    /**
     * Create a new C function
     *
     * @param name     name of the function
     * @param type     return type
     * @param argCount number of arguments
     * @param inlined
     */
    public CFunction(String name, Type type, int argCount, boolean isVariadic) {
        super(name, true);

        // Set values
        if (type == null) {
            this.type = new Type();
        } else {
            this.type = type;
        }
        this.arguments = new ArrayList<CalleeArgument>(argCount);
        this.isVariadic = isVariadic;

        // Update helper information
        updateJavaMethodName();
    }

    @Override
    public Type getType() {
        return type;
    }

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

    @Override
    public String getJavaName() {
        return javaName;
    }

    public boolean getDontGenerate() {
        return dontGenerate;
    }

    public void setDontGenerate() {
        this.dontGenerate = true;
    }

    public boolean isDeprecated() {
        return isDeprecated;
    }

    public void setDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    public boolean isInline() {
        return isInlined;
    }

    public void setInlined(boolean isInlined) {
        this.isInlined = isInlined;
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

    public void validate(Generator generator) {
        dontGenerate = dontGenerate | !isSupported(generator, null);
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

    public void addLocation(String location) {
        if (locations == null) {
            locations = new HashSet<String>();
        }
        locations.add(location);
    }

    public Set<String> getLocations() {
        return locations;
    }

    @Override
    public String getDefaultRuntime() {
        return Constants.CRuntimeFQ;
    }

}
