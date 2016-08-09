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

/**
 * This class contains template information.
 */
public class CxxTemplateInfo {
    /**
     * Original class info.
     */
    public final CxxClassInfo classInfo;
    /**
     * Type signature
     */
    public final String signature;

    /**
     * Create a new CxxTemplateInfo instance.
     *
     * @param classInfo Class info
     * @param signature Type signature
     */
    public CxxTemplateInfo(CxxClassInfo classInfo, String signature) {
        if (classInfo == null) {
            throw new NullPointerException();
        }
        if (signature == null) {
            throw new NullPointerException();
        }
        this.classInfo = classInfo;
        this.signature = signature;
    }
}
