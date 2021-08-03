// This is a generated file. Not intended for manual editing.
package org.serenityos.gml.plugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.serenityos.gml.plugin.core.psi.GMLTypes.*;
import static org.intellij.grammar.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;
import static com.intellij.lang.WhitespacesBinders.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GMLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(GML, OBJECT, VALUE),
  };

  /* ********************************************************** */
  // brack1 [!brack2 (string comma? | number comma? | boolean comma?) *] brack2
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIs(b, BRACK1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACK1);
    r = r && array_1(b, l + 1);
    r = r && consumeToken(b, BRACK2);
    exit_section_(b, m, ARRAY, r);
    return r;
  }

  // [!brack2 (string comma? | number comma? | boolean comma?) *]
  private static boolean array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1")) return false;
    array_1_0(b, l + 1);
    return true;
  }

  // !brack2 (string comma? | number comma? | boolean comma?) *
  private static boolean array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_1_0_0(b, l + 1);
    r = r && array_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !brack2
  private static boolean array_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, BRACK2);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (string comma? | number comma? | boolean comma?) *
  private static boolean array_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_1_0_1", c)) break;
    }
    return true;
  }

  // string comma? | number comma? | boolean comma?
  private static boolean array_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_1_0_1_0_0(b, l + 1);
    if (!r) r = array_1_0_1_0_1(b, l + 1);
    if (!r) r = array_1_0_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string comma?
  private static boolean array_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && array_1_0_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean array_1_0_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1_0_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // number comma?
  private static boolean array_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && array_1_0_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean array_1_0_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1_0_1_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // boolean comma?
  private static boolean array_1_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = boolean_$(b, l + 1);
    r = r && array_1_0_1_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comma?
  private static boolean array_1_0_1_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1_0_2_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // true | false
  public static boolean boolean_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_$")) return false;
    if (!nextTokenIs(b, "<boolean $>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN, "<boolean $>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // object
  public static boolean gml(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gml")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, GML, "<gml>");
    r = object(b, l + 1);
    register_hook_(b, WS_BINDERS, null, null);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id | string | 
  public static boolean name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAME, "<name>");
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, NAME_2_0);
    register_hook_(b, RIGHT_BINDER, GREEDY_RIGHT_BINDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (prop)*
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    Marker m = enter_section_(b, l, _NONE_, OBJECT, "<object>");
    while (true) {
      int c = current_position_(b);
      if (!object_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // (prop)
  private static boolean object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prop(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // propdef brace1 [!brace2 ((prop | propdef) | (name colon value)) *] brace2
  public static boolean prop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop")) return false;
    if (!nextTokenIs(b, CLASSPREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = propdef(b, l + 1);
    r = r && consumeToken(b, BRACE1);
    r = r && prop_2(b, l + 1);
    r = r && consumeToken(b, BRACE2);
    exit_section_(b, m, PROP, r);
    return r;
  }

  // [!brace2 ((prop | propdef) | (name colon value)) *]
  private static boolean prop_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_2")) return false;
    prop_2_0(b, l + 1);
    return true;
  }

  // !brace2 ((prop | propdef) | (name colon value)) *
  private static boolean prop_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prop_2_0_0(b, l + 1);
    r = r && prop_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !brace2
  private static boolean prop_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, BRACE2);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((prop | propdef) | (name colon value)) *
  private static boolean prop_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prop_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prop_2_0_1", c)) break;
    }
    return true;
  }

  // (prop | propdef) | (name colon value)
  private static boolean prop_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prop_2_0_1_0_0(b, l + 1);
    if (!r) r = prop_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prop | propdef
  private static boolean prop_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_2_0_1_0_0")) return false;
    boolean r;
    r = prop(b, l + 1);
    if (!r) r = propdef(b, l + 1);
    return r;
  }

  // name colon value
  private static boolean prop_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_2_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // classprefix name colon colon name
  public static boolean propdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propdef")) return false;
    if (!nextTokenIs(b, CLASSPREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASSPREFIX);
    r = r && name(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, COLON);
    r = r && name(b, l + 1);
    exit_section_(b, m, PROPDEF, r);
    return r;
  }

  /* ********************************************************** */
  // !(comma | brack2 | brace2 | brack1 | brace1 | dot)
  static boolean recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // comma | brack2 | brace2 | brack1 | brace1 | dot
  private static boolean recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_0")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, BRACK2);
    if (!r) r = consumeToken(b, BRACE2);
    if (!r) r = consumeToken(b, BRACK1);
    if (!r) r = consumeToken(b, BRACE1);
    if (!r) r = consumeToken(b, DOT);
    return r;
  }

  /* ********************************************************** */
  // gml
  static boolean root(PsiBuilder b, int l) {
    return gml(b, l + 1);
  }

  /* ********************************************************** */
  // string | number | boolean | array | prop | propdef
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = boolean_$(b, l + 1);
    if (!r) r = array(b, l + 1);
    if (!r) r = prop(b, l + 1);
    if (!r) r = propdef(b, l + 1);
    register_hook_(b, LEFT_BINDER, GREEDY_LEFT_BINDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
