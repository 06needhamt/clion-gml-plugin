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

public class GMLPropImpl extends ASTWrapperPsiElement implements GMLProp {

  public GMLPropImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GMLVisitor visitor) {
    visitor.visitProp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GMLVisitor) accept((GMLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GMLName> getNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GMLName.class);
  }

  @Override
  @NotNull
  public List<GMLProp> getPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GMLProp.class);
  }

  @Override
  @NotNull
  public List<GMLValue> getValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GMLValue.class);
  }

}
