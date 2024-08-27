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

import com.intellij.execution.junit.JUnitUtil;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.JavaCodeFragment;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class MOETestClassVisibilityChecker implements JavaCodeFragment.VisibilityChecker {

  private Module module;

  public MOETestClassVisibilityChecker(Module module) {
    this.module = module;
  }

  protected boolean isVisible(@NotNull Module module, @NotNull PsiClass aClass) {
    return JUnitUtil.isTestClass(aClass);
  }

  @Override
  public Visibility isDeclarationVisible(PsiElement declaration, PsiElement place) {
    if (!(declaration instanceof PsiClass)) {
      return Visibility.NOT_VISIBLE;
    }

    if (module == null) {
      return Visibility.NOT_VISIBLE;
    }
    final PsiFile file = declaration.getContainingFile();
    final VirtualFile vFile = file != null ? file.getVirtualFile() : null;

    if (vFile == null) {
      return Visibility.NOT_VISIBLE;
    }
    return isVisible(module, (PsiClass)declaration) ? Visibility.VISIBLE : Visibility.NOT_VISIBLE;
  }

  public void setModule(Module module) {
    this.module = module;
  }

}
