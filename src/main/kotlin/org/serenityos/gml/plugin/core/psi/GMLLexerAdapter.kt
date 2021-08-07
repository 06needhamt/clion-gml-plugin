package org.serenityos.gml.plugin.core.psi

import com.intellij.lexer.FlexAdapter
import org.serenityos.gml.plugin.lexer._GMLLexer
import java.io.Reader

class GMLLexerAdapter() : FlexAdapter(_GMLLexer(Reader.nullReader())) {
}