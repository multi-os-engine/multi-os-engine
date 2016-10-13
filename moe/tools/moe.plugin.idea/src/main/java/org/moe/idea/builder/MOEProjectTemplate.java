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

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.platform.templates.BuilderBasedTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.generator.project.MOEProjectComposer;
import res.MOEIcons;

import javax.swing.*;

public class MOEProjectTemplate extends BuilderBasedTemplate {

    private final MOEProjectComposer.Template templateType;

    private final String name;
    private final String description;

    public MOEProjectTemplate(String name, String description, MOEProjectComposer.Template templateType, ModuleBuilder builder) {
        super(builder);

        this.templateType = templateType;
        this.name = name;
        this.description = description;

        ((MOEModuleBuilder)builder).setTemplate(this);
    }

    @NotNull
    @Override
    public String getName() {
        return name;
    }

    @Nullable
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Icon getIcon() {
        return MOEIcons.MOESmall;
    }

    public MOEProjectComposer.Template getType() {
        return this.templateType;
    }
}
