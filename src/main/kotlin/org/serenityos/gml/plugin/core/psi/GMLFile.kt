package org.serenityos.gml.plugin.core.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.serenityos.gml.plugin.core.editor.GMLFileType
import org.serenityos.gml.plugin.core.editor.GMLLanguage

class GMLFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, GMLLanguage.INSTANCE) {
    /**
     * Returns the file type for the file.
     *
     * @return the file type instance.
     */
    override fun getFileType(): FileType {
        return GMLFileType.INSTANCE
    }

    override fun toString(): String {
        return "GML File"
    }
}