/*
 * Copyright 2016 Migeran
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe.javacplugin;

import com.sun.source.tree.ExpressionStatementTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.util.JavacTask;
import com.sun.source.util.Plugin;
import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.source.util.TreeScanner;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.api.BasicJavacTask;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeMaker;

public class StaticLoad implements Plugin {

  private Context context;
  private Names names;
  private TreeMaker maker;

  @Override
  public String getName() {
    return "org.moe.javacplugin.StaticLoad";
  }

  @Override
  public void init(JavacTask javacTask, String... args) {
    context = ((BasicJavacTask)javacTask).getContext();
    names = Names.instance(context);
    maker = TreeMaker.instance(context);

    javacTask.addTaskListener(new TaskListener() {

      @Override
      public void finished(TaskEvent taskEvent) {
        // Using a TreeScanner might be somewhat simpler, but would not be as precise.
        taskEvent.getCompilationUnit().getTypeDecls().stream()
            .filter(decl -> decl instanceof JCTree.JCClassDecl)
            .forEach(decl -> ((JCTree.JCClassDecl)decl).getMembers().stream()
                    .filter(member -> member instanceof JCTree.JCMethodDecl || member instanceof JCTree.JCBlock)
                    .forEach(method -> method.accept(scanner, StaticLoad.this)));
      }

      @Override
      public void started(TaskEvent arg0) {
          // Nothing to do.
      }

    });
  }

  private static StaticLoadScanner scanner = new StaticLoadScanner();

  private static class StaticLoadScanner extends TreeScanner<Void, StaticLoad> {
    // Workaround for skipping LetExpr, because scanning them may result in an assert.
    @Override
    public Void visitExpressionStatement(ExpressionStatementTree expression, StaticLoad arg) {
      if (!(expression.getExpression() instanceof JCTree.LetExpr)) {
        super.visitExpressionStatement(expression, arg);
      }
      return null;
    }

    @Override
    public Void visitMethodInvocation(MethodInvocationTree invokation, StaticLoad arg) {
      ExpressionTree select = invokation.getMethodSelect();

      if (select instanceof JCTree.JCFieldAccess) {
          JCTree.JCFieldAccess fieldAccess = (JCTree.JCFieldAccess)select;
          if (fieldAccess.name.contentEquals("loadLibrary")) {
            boolean match = false;
            JCTree.JCExpression parent = fieldAccess.getExpression();
            if (parent instanceof JCTree.JCIdent) {
              JCTree.JCIdent ident = (JCTree.JCIdent)parent;
              if (ident.name.contentEquals("System")) {
                  match = true;
              }
            } else if (parent instanceof JCTree.JCFieldAccess) {
              JCTree.JCFieldAccess parentFieldAccess = (JCTree.JCFieldAccess)parent;
              if (parentFieldAccess.name.contentEquals("System")) {
                JCTree.JCExpression parent2 = parentFieldAccess.getExpression();
                if (parent2 instanceof JCTree.JCFieldAccess) {
                  JCTree.JCFieldAccess parentFieldAccess2 = (JCTree.JCFieldAccess)parent2;
                  if (parentFieldAccess2.name.contentEquals("lang")) {
                    JCTree.JCExpression parent3 = parentFieldAccess2.getExpression();
                    if (parent3 instanceof JCTree.JCIdent) {
                      JCTree.JCIdent ident = (JCTree.JCIdent)parent3;
                      if (ident.name.contentEquals("java")) {
                        match = true;
                      }
                    }
                  }
                }
              }
            }
            if (match) {
              fieldAccess.name = arg.names.fromString("loadStatic");
              JCTree.JCFieldAccess moe = arg.maker.Select(arg.maker.Ident(arg.names.fromString("org")), arg.names.fromString("moe"));
              fieldAccess.selected = arg.maker.Select(moe, arg.names.fromString("MOE"));
            }
          }
      }
      return super.visitMethodInvocation(invokation, arg);
    }
  }
}
