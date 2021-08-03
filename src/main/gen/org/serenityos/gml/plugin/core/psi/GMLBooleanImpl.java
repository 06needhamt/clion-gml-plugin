// This is a generated file. Not intended for manual editing.
package org.serenityos.gml.plugin.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.serenityos.gml.plugin.core.psi.GMLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class GMLBooleanImpl extends ASTWrapperPsiElement implements GMLBoolean {

  public GMLBooleanImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GMLVisitor visitor) {
    visitor.visitBoolean(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GMLVisitor) accept((GMLVisitor)visitor);
    else super.accept(visitor);
  }

}
