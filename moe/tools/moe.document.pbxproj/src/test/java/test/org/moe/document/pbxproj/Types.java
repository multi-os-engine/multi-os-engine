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

package test.org.moe.document.pbxproj;

import org.junit.BeforeClass;
import org.junit.Test;
import org.moe.document.pbxproj.PBXObject;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.PBXProject;
import org.moe.document.pbxproj.ProjectException;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.document.pbxproj.Root.RootObjects;
import org.moe.document.pbxproj.nextstep.Dictionary.Field;
import org.moe.document.pbxproj.nextstep.Dictionary.FieldIterator;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class Types {

    private static final String PACKAGE_ROOT = "org.moe.document.pbxproj.";

    private static ProjectFile pbxproj;
    private static PBXProject project;

    @BeforeClass
    public static void setup() throws ProjectException {
        String filename = "project.pbxproj";
        InputStream resourceStream = SCMSupport.class.getResourceAsStream(filename);
        pbxproj = new ProjectFile(resourceStream);
        project = pbxproj.getRoot().getRootObject().getReferenced();
    }

    @Test
    public void testTypes() {
        RootObjects objects = pbxproj.getRoot().getObjects();
        objects.iterate(new FieldIterator<PBXObjectRef<? extends PBXObject>, PBXObject>() {
            @Override
            public void process(Field<PBXObjectRef<? extends PBXObject>, PBXObject> field) {
                PBXObject value = field.value;
                String isa = value.getIsa();
                String className = PACKAGE_ROOT + isa;
                Class<?> clazz;
                try {
                    clazz = Class.forName(className);
                } catch (ClassNotFoundException ignore) {
                    return;
                }
                assertEquals(clazz, value.getClass());
            }
        });
    }
}
