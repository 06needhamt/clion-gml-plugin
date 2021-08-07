package org.serenityos.gml.plugin.core.editor.syntax

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.serenityos.gml.plugin.core.psi.GMLLexerAdapter
import org.serenityos.gml.plugin.core.psi.GMLTypes

class GMLSyntaxHighlighter : SyntaxHighlighterBase() {

    companion object {
        @JvmStatic val SEPARATOR = createTextAttributesKey("GML_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        @JvmStatic val NUMBER = createTextAttributesKey("GML_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        @JvmStatic val STRING = createTextAttributesKey("GML_STRING", DefaultLanguageHighlighterColors.STRING)
        @JvmStatic val NAME = createTextAttributesKey("GML_NAME", DefaultLanguageHighlighterColors.STRING)
        @JvmStatic val TRUE = createTextAttributesKey("GML_TRUE", DefaultLanguageHighlighterColors.KEYWORD)
        @JvmStatic val FALSE = createTextAttributesKey("GML_FALSE", DefaultLanguageHighlighterColors.KEYWORD)
        @JvmStatic val CLASS_PREFIX = createTextAttributesKey("GML_CLASS_PREFIX", DefaultLanguageHighlighterColors.KEYWORD)
        @JvmStatic val ID = createTextAttributesKey("GML_ID", DefaultLanguageHighlighterColors.KEYWORD)
        @JvmStatic val COLON = createTextAttributesKey("GML_COLON", DefaultLanguageHighlighterColors.KEYWORD)



        @JvmStatic val SEPARATOR_KEYS = arrayOf(SEPARATOR)
        @JvmStatic val NUMBER_KEYS = arrayOf(NUMBER)
        @JvmStatic val STRING_KEYS = arrayOf(STRING)
        @JvmStatic val NAME_KEYS = arrayOf(NAME)
        @JvmStatic val TRUE_KEYS = arrayOf(TRUE)
        @JvmStatic val FALSE_KEYS = arrayOf(FALSE)
        @JvmStatic val CLASS_PREFIX_KEYS = arrayOf(CLASS_PREFIX)
        @JvmStatic val ID_KEYS = arrayOf(ID)
        @JvmStatic val COLON_KEYS = arrayOf(COLON)
        @JvmStatic val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }

    /**
     * Returns the lexer used for highlighting the file. The lexer is invoked incrementally when the file is changed, so it must be
     * capable of saving/restoring state and resuming lexing from the middle of the file.
     *
     * @return The lexer implementation.
     */
    override fun getHighlightingLexer(): Lexer {
        return GMLLexerAdapter()
    }

    /**
     * Returns the list of text attribute keys used for highlighting the specified token type. The attributes of all attribute keys
     * returned for the token type are successively merged to obtain the color and attributes of the token.
     *
     * @param tokenType The token type for which the highlighting is requested.
     * @return The array of text attribute keys.
     */
    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        when (tokenType) {
            GMLTypes.NUMBER -> return NUMBER_KEYS
            GMLTypes.STRING -> return STRING_KEYS
            GMLTypes.NAME -> return NAME_KEYS
            GMLTypes.TRUE -> return TRUE_KEYS
            GMLTypes.FALSE -> return FALSE_KEYS
            GMLTypes.CLASSPREFIX -> return CLASS_PREFIX_KEYS
            GMLTypes.ID -> return ID_KEYS
            GMLTypes.COLON -> return COLON_KEYS
            else -> return EMPTY_KEYS
        }
    }
}