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

package org.moe.idea.runconfig.configuration.test;

import com.intellij.execution.Location;
import com.intellij.execution.PsiLocation;
import com.intellij.execution.testframework.sm.runner.SMTestLocator;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class MOETestLocationProvider implements SMTestLocator {

  @NonNls public static final String PROTOCOL_ID = "Multi-OSEngine";

  public static final MOETestLocationProvider INSTANCE = new MOETestLocationProvider();

  @NotNull
  @Override
  public List<Location> getLocation(@NotNull String protocol, @NotNull String path, @NotNull Project project, @NotNull GlobalSearchScope scope) {
    if (PROTOCOL_ID.equals(protocol)) {
      final PsiElement element = findElement(path, project, scope);

      if (element != null) {
        return Collections.singletonList((Location)new PsiLocation<PsiElement>(project, element));
      }
    }
    return Collections.emptyList();
  }

  @Nullable
  private static PsiElement findElement(String link, Project project, GlobalSearchScope scope) {
    int idx = link.indexOf(":");

    if (idx <= 0) {
      return null;
    }
    final String moduleName = link.substring(0, idx);
    final Module module = ModuleManager.getInstance(project).findModuleByName(moduleName);
    link = link.substring(idx + 1);

    PsiClass aClass = JavaPsiFacade.getInstance(project).findClass(link, scope);

    if (aClass != null) {
      return aClass;
    }
    if (link.contains(".") && link.endsWith("()")) {
      idx = link.lastIndexOf('.');
      final String className = link.substring(0, idx);
      aClass = JavaPsiFacade.getInstance(project).findClass(className, scope);

      if (aClass != null) {
        final String methodName = link.substring(idx + 1, link.length() - 2);
        final PsiMethod[] methods = aClass.findMethodsByName(methodName, false);

        if (methods.length == 0) {
          return null;
        }
        if (methods.length == 1) {
          return methods[0];
        }
        for (PsiMethod method : methods) {
          if (method.getParameterList().getParametersCount() == 0) {
            return method;
          }
        }
        return methods[0];
      }
    }
    return null;
  }
}
