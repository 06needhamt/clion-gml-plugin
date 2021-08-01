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
  // gml
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = gml(b, l + 1);
    exit_section_(b, l, m, r, false, GMLParser::recover);
    return r;
  }

  /* ********************************************************** */
  // id | string
  public static boolean name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name")) return false;
    if (!nextTokenIs(b, "<name>", ID, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAME, "<name>");
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, STRING);
    register_hook_(b, RIGHT_BINDER, GREEDY_RIGHT_BINDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (prop | whitespace)*
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

  // prop | whitespace
  private static boolean object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prop(b, l + 1);
    if (!r) r = whitespace(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // classprefix name '::' name '{' [!'}' (prop | name ':' value) *] '}'
  public static boolean prop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PROP, "<prop>");
    r = consumeToken(b, CLASSPREFIX);
    p = r; // pin = 1
    r = r && report_error_(b, name(b, l + 1));
    r = p && report_error_(b, consumeToken(b, "::")) && r;
    r = p && report_error_(b, name(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, BRACE1)) && r;
    r = p && report_error_(b, prop_5(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE2) && r;
    exit_section_(b, l, m, r, p, GMLParser::recover);
    return r || p;
  }

  // [!'}' (prop | name ':' value) *]
  private static boolean prop_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_5")) return false;
    prop_5_0(b, l + 1);
    return true;
  }

  // !'}' (prop | name ':' value) *
  private static boolean prop_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prop_5_0_0(b, l + 1);
    r = r && prop_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !'}'
  private static boolean prop_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_5_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, BRACE2);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (prop | name ':' value) *
  private static boolean prop_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_5_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prop_5_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prop_5_0_1", c)) break;
    }
    return true;
  }

  // prop | name ':' value
  private static boolean prop_5_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_5_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prop(b, l + 1);
    if (!r) r = prop_5_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // name ':' value
  private static boolean prop_5_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_5_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(',' | ']' | '}' | '[' | '{' |)
  static boolean recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ',' | ']' | '}' | '[' | '{' |
  private static boolean recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, BRACK2);
    if (!r) r = consumeToken(b, BRACE2);
    if (!r) r = consumeToken(b, BRACK1);
    if (!r) r = consumeToken(b, BRACE1);
    if (!r) r = consumeToken(b, RECOVER_0_5_0);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // gml
  static boolean root(PsiBuilder b, int l) {
    return gml(b, l + 1);
  }

  /* ********************************************************** */
  // string | number
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    if (!nextTokenIs(b, "<value>", NUMBER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, NUMBER);
    register_hook_(b, LEFT_BINDER, GREEDY_LEFT_BINDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // " " | "\t" | "\n" | comment
  public static boolean whitespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whitespace")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHITESPACE, "<whitespace>");
    r = consumeToken(b, " ");
    if (!r) r = consumeToken(b, "\t");
    if (!r) r = consumeToken(b, NEWLINE);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
