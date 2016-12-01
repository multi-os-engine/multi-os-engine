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

import org.moe.document.pbxproj.PBXNativeTarget;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.PBXProject;
import org.moe.document.pbxproj.ProjectException;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.tools.natjgen.util.Compute.Computer;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.moe.tools.natjgen.util.Compute.compute;

public class XcodeProject {

    public final ProjectFile projectFile;

    public final PBXObjectRef<PBXProject> ref;
    public final PBXProject raw;

    public final List<XcodeTarget> targets;

    public XcodeProject(File file) throws ProjectException {
        projectFile = new ProjectFile(file);
        ref = projectFile.getRoot().getRootObject();
        raw = ref.getReferenced();

        targets = compute(new Computer<List<XcodeTarget>>() {
            @Override
            public List<XcodeTarget> compute() {
                final Array<PBXObjectRef<PBXNativeTarget>> targetRefs = raw.getOrCreateTargets();
                final List<XcodeTarget> targets = new ArrayList<XcodeTarget>(targetRefs.size());
                for (PBXObjectRef<PBXNativeTarget> targetRef : targetRefs) {
                    targets.add(new XcodeTarget(targetRef));
                }
                return Collections.unmodifiableList(targets);
            }
        });
    }
}
