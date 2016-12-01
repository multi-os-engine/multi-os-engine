/*
Copyright (C) 2016 Migeran

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

package org.moe.tools.natjgen;

import org.moe.document.pbxproj.PBXBuildFile;
import org.moe.document.pbxproj.PBXBuildPhase;
import org.moe.document.pbxproj.PBXFrameworksBuildPhase;
import org.moe.document.pbxproj.PBXNativeTarget;
import org.moe.document.pbxproj.PBXObjectRef;

import java.util.ArrayList;
import java.util.List;

public class XcodeTarget {

    public final PBXObjectRef<PBXNativeTarget> ref;
    public final PBXNativeTarget raw;

    public XcodeTarget(PBXObjectRef<PBXNativeTarget> ref) {
        if (ref == null) {
            throw new NullPointerException();
        }
        if (ref.getReferenced() == null) {
            throw new NullPointerException();
        }
        this.ref = ref;
        this.raw = ref.getReferenced();
    }

    public List<PBXBuildFile> locateFrameworks() {
        final List<PBXBuildFile> frameworks = new ArrayList<PBXBuildFile>();
        for (PBXObjectRef<PBXBuildPhase> buildPhaseRef : raw.getOrCreateBuildPhases()) {
            final PBXBuildPhase buildPhase = buildPhaseRef.getReferenced();
            if (buildPhase instanceof PBXFrameworksBuildPhase) {
                for (PBXObjectRef<PBXBuildFile> fileRef : buildPhase.getOrCreateFiles()) {
                    final PBXBuildFile file = fileRef.getReferenced();
                    frameworks.add(file);
                }
            }
        }
        return frameworks;
    }
}
