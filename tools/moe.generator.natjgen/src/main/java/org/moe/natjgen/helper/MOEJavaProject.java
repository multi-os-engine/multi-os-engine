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

package org.moe.natjgen.helper;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

import java.io.File;

public class MOEJavaProject {

    private String name;

    private IPath location;

    public MOEJavaProject(String name, String location) {
        this.location = new Path(location + File.separator + name);
        this.name = name;
    }

    public IPath getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void refreshLocal(int depthInfinite, IProgressMonitor monitor) {
        // TODO Auto-generated method stub

    }

}
