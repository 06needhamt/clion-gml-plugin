// This is a generated file. Not intended for manual editing.
package org.serenityos.gml.plugin.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GMLValue extends PsiElement {

  @Nullable
  GMLArray getArray();

  @Nullable
  GMLBoolean getBoolean();

  @Nullable
  GMLProp getProp();

  @Nullable
  GMLPropdef getPropdef();

  @Nullable
  PsiElement getNumber();

  @Nullable
  PsiElement getString();

}
