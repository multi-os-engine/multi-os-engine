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

package org.moe.idea.component;

import com.intellij.ProjectTopics;
import com.intellij.compiler.CompilerManagerImpl;
import com.intellij.execution.RunManager;
import com.intellij.execution.impl.RunManagerImpl;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileTask;
import com.intellij.openapi.compiler.CompilerManager;
import com.intellij.openapi.components.AbstractProjectComponent;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.fileEditor.FileEditorManagerListener;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.util.messages.MessageBusConnection;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.compiler.MOECompileTask;
import org.moe.idea.utils.FileEditorListener;
import org.moe.idea.utils.ModuleObserver;
import org.moe.idea.utils.logger.LoggerFactory;

public class MOEProjectComponent extends AbstractProjectComponent {

    private static final Logger LOG = LoggerFactory.getLogger(MOEProjectComponent.class);

    private MessageBusConnection messageBusConnection;

    protected MOEProjectComponent(Project project) {
        super(project);
    }

    @Override
    public void initComponent() {
        super.initComponent();
        messageBusConnection = myProject.getMessageBus().connect();
        messageBusConnection.subscribe(FileEditorManagerListener.FILE_EDITOR_MANAGER, new FileEditorListener());
        messageBusConnection.subscribe(ProjectTopics.MODULES, new ModuleObserver());
    }

    @Override
    public void disposeComponent() {
        if(messageBusConnection != null) {
            messageBusConnection.disconnect();
        }
        messageBusConnection = null;
        super.disposeComponent();
    }

    @Override
    public void projectOpened() {
        // Find MOE modules
        for (Module module : ModuleManager.getInstance(myProject).getModules()) {
            if (MOESdkPlugin.isValidMoeModule(module)) {
                if (module.getModuleFile() == null){
                    module.getProject().save();
                }
            }
        }
    }

}
