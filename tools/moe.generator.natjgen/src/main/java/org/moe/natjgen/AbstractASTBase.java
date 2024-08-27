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

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.PrimitiveType.Code;
import org.eclipse.jdt.core.dom.SimpleType;

public abstract class AbstractASTBase {

    protected AbstractUnitManager getManager() {
        return null;
    }

    protected abstract AST getAST();

    protected SimpleType newSimpleType(String name) {
        if (getManager() != null) {
            name = getManager().addImport(name);
        }
        return getAST().newSimpleType(getAST().newName(name));
    }

    protected SimpleType newUnimportedSimpleType(final String name) {
        return getAST().newSimpleType(getAST().newName(name));
    }

    protected SimpleType newSimpleType(final AbstractUnitManager unit) {
        if (getManager() == null) {
            throw new NullPointerException();
        }
        final String name = getManager().addImport(unit);
        return getAST().newSimpleType(getAST().newName(name));
    }

    protected PrimitiveType newPrimitiveType(final Code typeCode) {
        return getAST().newPrimitiveType(typeCode);
    }

}
