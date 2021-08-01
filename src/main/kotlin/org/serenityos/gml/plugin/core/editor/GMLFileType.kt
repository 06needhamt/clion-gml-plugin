/*
    BSD 2-Clause License

    Copyright (c) 2021, Tom Needham <06needhamt@gmail.com>
    All rights reserved.
 */
package org.serenityos.gml.plugin.core.editor

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class GMLFileType : LanguageFileType(GMLLanguage()) {

    companion object {
        @JvmStatic val INSTANCE = GMLFileType()
    }

    /**
     * Returns the name of the file type. The name must be unique among all file types registered in the system.
     */
    override fun getName(): String {
        return "Serenity OS GML"
    }

    /**
     * Returns the user-readable description of the file type.
     */
    override fun getDescription(): String {
        return "Serenity GML File"
    }

    /**
     * Returns the default extension for files of the type, *not* including the leading '.'.
     */
    override fun getDefaultExtension(): String {
        return ".gml"
    }

    /**
     * Returns the icon used for showing files of the type, or `null` if no icon should be shown.
     */
    override fun getIcon(): Icon {
        return GMLIcons.FILE
    }

}