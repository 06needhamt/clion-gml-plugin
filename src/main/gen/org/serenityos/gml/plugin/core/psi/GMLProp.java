// This is a generated file. Not intended for manual editing.
package org.serenityos.gml.plugin.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GMLProp extends PsiElement {

  @NotNull
  List<GMLName> getNameList();

  @NotNull
  List<GMLProp> getPropList();

  @NotNull
  List<GMLValue> getValueList();

}
