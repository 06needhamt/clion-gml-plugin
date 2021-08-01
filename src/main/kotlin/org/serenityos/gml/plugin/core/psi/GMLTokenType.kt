/*
    BSD 2-Clause License

    Copyright (c) 2021, Tom Needham <06needhamt@gmail.com>
    All rights reserved.
 */
package org.serenityos.gml.plugin.core.psi

import com.intellij.lang.Language
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class GMLTokenType(debugName: @NonNls String, language: Language?) : IElementType(debugName, language) {
    override fun toString(): String {
        return "GMLTokenType.${super.toString()}"
    }
}