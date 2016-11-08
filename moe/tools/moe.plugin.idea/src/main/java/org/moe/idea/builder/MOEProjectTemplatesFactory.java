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

package org.moe.idea.builder;

import com.intellij.ide.util.projectWizard.JavaModuleBuilder;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.platform.ProjectTemplate;
import com.intellij.platform.ProjectTemplatesFactory;
import org.jetbrains.annotations.NotNull;
import org.moe.generator.project.MOEProjectComposer.Template;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MOEProjectTemplatesFactory extends ProjectTemplatesFactory {
    @NotNull
    @Override
    public String[] getGroups() {
        return new String[] { MOEText.get("MOE") };
    }

    @Override
    public String getParentGroup(String group) {
        return "Java";
    }

    @Override
    public Icon getGroupIcon(String group) {
        return MOEIcons.MOESmall;
    }

    @Override
    public int getGroupWeight(String group) {
        return JavaModuleBuilder.JAVA_MOBILE_WEIGHT;
    }

    @NotNull
    @Override
    public ProjectTemplate[] createTemplates(String s, WizardContext wizardContext) {
        final List<MOEProjectTemplate> templates = new ArrayList<MOEProjectTemplate>();
        for (Template template : Template.values()) {
            final MOEProjectTemplate projectTemplate = new MOEProjectTemplate(template.description, "", template,
                    new MOEModuleBuilder());
            templates.add(projectTemplate);
        }
        Collections.sort(templates, new Comparator<MOEProjectTemplate>() {
            @Override
            public int compare(MOEProjectTemplate o1, MOEProjectTemplate o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return templates.toArray(new ProjectTemplate[templates.size()]);
    }
}
