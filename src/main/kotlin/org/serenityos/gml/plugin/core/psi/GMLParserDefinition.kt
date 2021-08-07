package org.serenityos.gml.plugin.core.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.serenityos.gml.plugin.core.editor.GMLLanguage
import org.serenityos.gml.plugin.parser.GMLParser

class GMLParserDefinition : ParserDefinition {

    companion object {
        @JvmStatic val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        @JvmStatic val COMMENTS = TokenSet.EMPTY
        @JvmStatic val STRING_LITERALS = TokenSet.create(GMLTypes.STRING)
        @JvmStatic val FILE = IFileElementType(GMLLanguage.INSTANCE)
    }

    /**
     * Returns the lexer for lexing files in the specified project. This lexer does not need to support incremental relexing - it is always
     * called for the entire file.
     *
     * @param project the project to which the lexer is connected.
     * @return the lexer instance.
     */
    override fun createLexer(project: Project?): Lexer {
        return GMLLexerAdapter()
    }

    /**
     * Returns the parser for parsing files in the specified project.
     *
     * @param project the project to which the parser is connected.
     * @return the parser instance.
     */
    override fun createParser(project: Project?): PsiParser {
        return GMLParser()
    }

    /**
     * Returns the element type of the node describing a file in the specified language.
     *
     * @return the file node element type.
     */
    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    /**
     * Returns the set of token types which are treated as comments by the PSI builder.
     * Tokens of those types are automatically skipped by PsiBuilder. Also, To Do patterns
     * are searched in the text of tokens of those types.
     * For composite comment elements it should contain only the root element type
     * (for example [com.intellij.psi.impl.source.tree.JavaDocElementType.DOC_COMMENT]).
     *
     * @return the set of comment token types.
     */
    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    /**
     * Returns the set of token types which are treated as whitespace by the PSI builder.
     * Tokens of those types are automatically skipped by PsiBuilder. Also, To Do patterns
     * are searched in the text of tokens of those types.
     *
     * @return the set of whitespace token types.
     */
    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }

    /**
     * Returns the set of element types which are treated as string literals. "Search in strings"
     * option in refactorings is applied to the contents of such tokens.
     *
     * @return the set of string literal element types.
     */
    override fun getStringLiteralElements(): TokenSet {
        return STRING_LITERALS
    }

    /**
     * Creates a PSI element for the specified AST node. The AST tree is a simple, semantic-free
     * tree of AST nodes which is built during the PsiBuilder parsing pass. The PSI tree is built
     * over the AST tree and includes elements of different types for different language constructs.
     *
     * !!!WARNING!!! PSI element types should be unambiguously determined by AST node element types.
     * You can not produce different PSI elements from AST nodes of the same types (e.g. based on AST node content).
     * Typically, your code should be as simple as that:
     * <pre>`if (node.getElementType == MY_ELEMENT_TYPE) {
     * return new MyPsiElement(node);
     * }
    `</pre> *
     *
     * @param node the node for which the PSI element should be returned.
     * @return the PSI element matching the element type of the AST node.
     */
    override fun createElement(node: ASTNode?): PsiElement {
        return GMLTypes.Factory.createElement(node)
    }

    /**
     * Creates a PSI element for the specified virtual file.
     *
     * @param viewProvider virtual file.
     * @return the PSI file element.
     */
    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return GMLFile(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements {
        return super.spaceExistenceTypeBetweenTokens(left, right)
    }
}