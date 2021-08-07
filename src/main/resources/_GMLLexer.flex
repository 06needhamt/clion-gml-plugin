package org.serenityos.gml.plugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.serenityos.gml.plugin.core.psi.GMLTypes.*;

%%

%{
  public _GMLLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _GMLLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
STRING=\"[^\"]*\"|'[^']*'
NUMBER=(-)?[:digit:]+(.[:digit:])*
KEY=[:letter:][a-zA-Z_0-9]*
CLASSNAME=([:letter:][a-zA-Z_0-9]*)::([:letter:][a-zA-Z_0-9]*)

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "@"                { return CLASSPREFIX; }
  ","                { return COMMA; }
  ":"                { return COLON; }
  "."                { return DOT; }
  "{"                { return BRACE1; }
  "}"                { return BRACE2; }
  "["                { return BRACK1; }
  "]"                { return BRACK2; }
  "("                { return PAREN1; }
  ")"                { return PAREN2; }
  "\\n"              { return NEWLINE; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }

  {SPACE}            { return SPACE; }
  {STRING}           { return STRING; }
  {NUMBER}           { return NUMBER; }
  {KEY}              { return KEY; }
  {CLASSNAME}        { return CLASSNAME; }

}

[^] { return BAD_CHARACTER; }
