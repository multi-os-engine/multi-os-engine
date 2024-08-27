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

/**
 * Member implementation information.
 */
public class CxxMemberImplInfo {
    /**
     * Declaration info.
     */
    public final DeclInfo declInfo;

    /**
     * Owning class info.
     */
    public final CxxClassInfo classInfo;

    /**
     * Create a new CxxMemberImplInfo instance.
     *
     * @param declInfo  Declaration info
     * @param classInfo Owning class info
     */
    public CxxMemberImplInfo(DeclInfo declInfo, CxxClassInfo classInfo) {
        if (declInfo == null) {
            throw new NullPointerException();
        }
        if (classInfo == null) {
            throw new NullPointerException();
        }
        this.declInfo = declInfo;
        this.classInfo = classInfo;
    }

    @Override
    public int hashCode() {
        return declInfo.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CxxMemberImplInfo that = (CxxMemberImplInfo) o;
        return declInfo.equals(that.declInfo);
    }
}
