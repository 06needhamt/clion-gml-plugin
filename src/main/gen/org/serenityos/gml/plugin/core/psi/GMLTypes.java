// This is a generated file. Not intended for manual editing.
package org.serenityos.gml.plugin.core.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;

public interface GMLTypes {

  IElementType GML = new GMLElementType("GML");
  IElementType NAME = new GMLElementType("NAME");
  IElementType OBJECT = new GMLElementType("OBJECT");
  IElementType PROP = new GMLElementType("PROP");
  IElementType VALUE = new GMLElementType("VALUE");
  IElementType WHITESPACE = new GMLElementType("WHITESPACE");

  IElementType BRACE1 = new GMLTokenType("{");
  IElementType BRACE2 = new GMLTokenType("}");
  IElementType BRACK1 = new GMLTokenType("[");
  IElementType BRACK2 = new GMLTokenType("]");
  IElementType CLASSPREFIX = new GMLTokenType("@");
  IElementType COLON = new GMLTokenType(":");
  IElementType COMMA = new GMLTokenType(",");
  IElementType COMMENT = new GMLTokenType("comment");
  IElementType ID = new GMLTokenType("id");
  IElementType NEWLINE = new GMLTokenType("\\n");
  IElementType NUMBER = new GMLTokenType("number");
  IElementType RECOVER_0_5_0 = new GMLTokenType("recover_0_5_0");
  IElementType STRING = new GMLTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == GML) {
        return new GMLGmlImpl(node);
      }
      else if (type == NAME) {
        return new GMLNameImpl(node);
      }
      else if (type == OBJECT) {
        return new GMLObjectImpl(node);
      }
      else if (type == PROP) {
        return new GMLPropImpl(node);
      }
      else if (type == VALUE) {
        return new GMLValueImpl(node);
      }
      else if (type == WHITESPACE) {
        return new GMLWhitespaceImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
