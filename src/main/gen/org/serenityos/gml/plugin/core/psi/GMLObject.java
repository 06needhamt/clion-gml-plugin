// This is a generated file. Not intended for manual editing.
package org.serenityos.gml.plugin.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GMLObject extends GMLGml {

  @NotNull
  List<GMLProp> getPropList();

  @NotNull
  List<GMLWhitespace> getWhitespaceList();

}
