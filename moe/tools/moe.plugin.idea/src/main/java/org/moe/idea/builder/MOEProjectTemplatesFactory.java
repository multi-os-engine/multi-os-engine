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
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;

public class MOEProjectTemplatesFactory extends ProjectTemplatesFactory {
    @NotNull
    @Override
    public String[] getGroups() {
        return new String[] {  MOEText.get("MOE") };
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

        return new ProjectTemplate[] {

                new MOEProjectTemplate(MOEText.get("MasterDetailStoryboard.Application"),
                        MOEText.get("MasterDetail.Application.Description"),
                        MOEProjectTemplate.MOETemplateType.MasterDetail,
                        new MOEModuleBuilder()),

                new MOEProjectTemplate(MOEText.get("PageBased.Application"),
                        MOEText.get("PageBased.Application.Description"),
                        MOEProjectTemplate.MOETemplateType.PageBased,
                        new MOEModuleBuilder()),

                new MOEProjectTemplate(MOEText.get("PageBasedStoryboard.Application"),
                        MOEText.get("PageBased.Application.Description"),
                        MOEProjectTemplate.MOETemplateType.PageBasedStoryboard,
                        new MOEModuleBuilder()),

                new MOEProjectTemplate(MOEText.get("SingleView.Application"),
                        MOEText.get("SingleView.Application.Description"),
                        MOEProjectTemplate.MOETemplateType.SingleView,
                        new MOEModuleBuilder()),

                new MOEProjectTemplate(MOEText.get("SingleViewStoryboard.Application"),
                        MOEText.get("SingleView.Application.Description"),
                        MOEProjectTemplate.MOETemplateType.SingleViewStoryboard,
                        new MOEModuleBuilder()),

                new MOEProjectTemplate(MOEText.get("Tabbed.Application"),
                        MOEText.get("Tabbed.Application.Description"),
                        MOEProjectTemplate.MOETemplateType.Tabbed,
                        new MOEModuleBuilder()),

                new MOEProjectTemplate(MOEText.get("Game.Application"),
                        MOEText.get("Game.Application.Description"),
                        MOEProjectTemplate.MOETemplateType.Game,
                        new MOEModuleBuilder())
        };
    }
}
