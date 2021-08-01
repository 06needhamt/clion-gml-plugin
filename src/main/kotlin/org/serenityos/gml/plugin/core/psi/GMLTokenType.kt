/*
    BSD 2-Clause License

    Copyright (c) 2021, Tom Needham <06needhamt@gmail.com>
    All rights reserved.
 */
package org.serenityos.gml.plugin.core.psi

import com.intellij.lang.Language
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.serenityos.gml.plugin.core.editor.GMLLanguage

class GMLTokenType(debugName: @NonNls String) : IElementType(debugName, GMLLanguage.INSTANCE) {
    override fun toString(): String {
        return "GMLTokenType.${super.toString()}"
    }
}