// This is a generated file. Not intended for manual editing.
package org.serenityos.gml.plugin.core.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;

public interface GMLTypes {

  IElementType ARRAY = new GMLElementType("ARRAY");
  IElementType BOOLEAN = new GMLElementType("BOOLEAN");
  IElementType GML = new GMLElementType("GML");
  IElementType NAME = new GMLElementType("NAME");
  IElementType OBJECT = new GMLElementType("OBJECT");
  IElementType PROP = new GMLElementType("PROP");
  IElementType PROPDEF = new GMLElementType("PROPDEF");
  IElementType VALUE = new GMLElementType("VALUE");

  IElementType BRACE1 = new GMLTokenType("{");
  IElementType BRACE2 = new GMLTokenType("}");
  IElementType BRACK1 = new GMLTokenType("[");
  IElementType BRACK2 = new GMLTokenType("]");
  IElementType CLASSNAME = new GMLTokenType("classname");
  IElementType CLASSPREFIX = new GMLTokenType("@");
  IElementType COLON = new GMLTokenType(":");
  IElementType COMMA = new GMLTokenType(",");
  IElementType DOT = new GMLTokenType(".");
  IElementType FALSE = new GMLTokenType("false");
  IElementType KEY = new GMLTokenType("key");
  IElementType NAME_2_0 = new GMLTokenType("name_2_0");
  IElementType NEWLINE = new GMLTokenType("\\n");
  IElementType NUMBER = new GMLTokenType("number");
  IElementType PAREN1 = new GMLTokenType("(");
  IElementType PAREN2 = new GMLTokenType(")");
  IElementType STRING = new GMLTokenType("string");
  IElementType TRUE = new GMLTokenType("true");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY) {
        return new GMLArrayImpl(node);
      }
      else if (type == BOOLEAN) {
        return new GMLBooleanImpl(node);
      }
      else if (type == GML) {
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
      else if (type == PROPDEF) {
        return new GMLPropdefImpl(node);
      }
      else if (type == VALUE) {
        return new GMLValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
