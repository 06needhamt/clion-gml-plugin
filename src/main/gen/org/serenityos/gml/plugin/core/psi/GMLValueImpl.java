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

public class GMLValueImpl extends ASTWrapperPsiElement implements GMLValue {

  public GMLValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GMLVisitor visitor) {
    visitor.visitValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GMLVisitor) accept((GMLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GMLArray getArray() {
    return findChildByClass(GMLArray.class);
  }

  @Override
  @Nullable
  public GMLBoolean getBoolean() {
    return findChildByClass(GMLBoolean.class);
  }

  @Override
  @Nullable
  public GMLProp getProp() {
    return findChildByClass(GMLProp.class);
  }

  @Override
  @Nullable
  public GMLPropdef getPropdef() {
    return findChildByClass(GMLPropdef.class);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
