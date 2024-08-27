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

import org.clang.c.clang;
import org.clang.struct.CXIdxIncludedFileInfo;
import org.clang.struct.CXIdxLoc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IncludeManager {

    Map<String, Set<String>> map = new HashMap<String, Set<String>>();

    /**
     * Callback to the indexer
     *
     * @param client additional data
     * @param decl   currently indexed import
     */
    @SuppressWarnings("unused")
    private int ppIncludedFile(long client, CXIdxIncludedFileInfo decl) {
        try {
            if (decl.isImport() == 0 && decl.isModuleImport() == 0) {
                return 0;
            }
            // #import <Availability.h>
            // #import <Foundation/Foundation.h>
            // #include <asl.h>
            // #include <mach/mach.h>
            String val = (decl.isImport() == 1) ? "#import <" : "#include <";
            val += decl.filename() + ">";

            CXIdxLoc loc = decl.hashLoc();
            String key = clang.clang_getFileName(loc.getFileLocation()).toString();
            Set<String> vals = map.get(key);
            if (vals == null) {
                vals = new HashSet<String>();
                map.put(key, vals);
            }
            vals.add(val);

            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public Set<String> getIncludesForLocation(String location) {
        return map.get(location);
    }

}
