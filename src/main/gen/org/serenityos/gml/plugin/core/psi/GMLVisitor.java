// This is a generated file. Not intended for manual editing.
package org.serenityos.gml.plugin.core.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class GMLVisitor extends PsiElementVisitor {

  public void visitArray(@NotNull GMLArray o) {
    visitPsiElement(o);
  }

  public void visitBoolean(@NotNull GMLBoolean o) {
    visitPsiElement(o);
  }

  public void visitGml(@NotNull GMLGml o) {
    visitValue(o);
  }

  public void visitName(@NotNull GMLName o) {
    visitPsiElement(o);
  }

  public void visitObject(@NotNull GMLObject o) {
    visitGml(o);
  }

  public void visitProp(@NotNull GMLProp o) {
    visitPsiElement(o);
  }

  public void visitPropdef(@NotNull GMLPropdef o) {
    visitPsiElement(o);
  }

  public void visitValue(@NotNull GMLValue o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
