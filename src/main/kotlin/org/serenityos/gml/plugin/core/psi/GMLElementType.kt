package org.serenityos.gml.plugin.core.psi

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.serenityos.gml.plugin.core.editor.GMLLanguage

class GMLElementType(debugName: @NonNls String) : IElementType(debugName, GMLLanguage.INSTANCE) {
}