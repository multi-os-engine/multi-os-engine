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

import com.intellij.CommonBundle;
import com.intellij.execution.ExecutionBundle;
import com.intellij.execution.configuration.BrowseModuleValueActionListener;
import com.intellij.execution.junit.JUnitUtil;
import com.intellij.ide.util.ClassFilter;
import com.intellij.ide.util.TreeClassChooser;
import com.intellij.ide.util.TreeClassChooserFactory;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiModifier;
import com.intellij.psi.PsiModifierList;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MOETestClassBrowser extends BrowseModuleValueActionListener {

  private Module module;
  private String title;
  private boolean myIncludeLibraryClasses;

  public MOETestClassBrowser(@NotNull Project project,
                             @NotNull Module module,
                             @NotNull String dialogTitle,
                             boolean includeLibraryClasses) {
    super(project);
    this.module = module;
    this.title = dialogTitle;
    this.myIncludeLibraryClasses = includeLibraryClasses;
  }

  @Nullable
  protected TreeClassChooser createTreeClassChooser(@NotNull Project project,
                                                    @NotNull GlobalSearchScope scope,
                                                    @Nullable PsiClass initialSelection, @NotNull final ClassFilter classFilter) {
    return TreeClassChooserFactory.getInstance(project).createNoInnerClassesScopeChooser(title, scope, new ClassFilter() {
      @Override
      public boolean isAccepted(PsiClass aClass) {
        return classFilter.isAccepted(aClass) && JUnitUtil.isTestClass(aClass);
      }
    }, initialSelection);
  }

  @Override
  protected String showDialog() {
    Project project = getProject();
    final JavaPsiFacade facade = JavaPsiFacade.getInstance(project);
    if (module == null) {
      Messages.showErrorDialog(project, ExecutionBundle.message("module.not.specified.error.text"), CommonBundle.getErrorTitle());
      return null;
    }
    GlobalSearchScope scope =
            myIncludeLibraryClasses ? module.getModuleWithDependenciesAndLibrariesScope(true) : module.getModuleWithDependenciesScope();
    PsiClass initialSelection = facade.findClass(getText(), scope);
    TreeClassChooser chooser = createTreeClassChooser(project, scope, initialSelection, new ClassFilter() {
      @Override
      public boolean isAccepted(PsiClass aClass) {
        if (aClass.isInterface()) return false;
        final PsiModifierList modifierList = aClass.getModifierList();
        return modifierList == null || !modifierList.hasModifierProperty(PsiModifier.ABSTRACT);
      }
    });
    if (chooser == null) return null;
    chooser.showDialog();
    PsiClass selClass = chooser.getSelected();
    return selClass != null ? selClass.getQualifiedName() : null;
  }
}
