/*
    BSD 2-Clause License

    Copyright (c) 2021, Tom Needham <06needhamt@gmail.com>
    All rights reserved.
 */
package org.serenityos.gml.plugin.core.editor

import com.intellij.lang.Language

class GMLLanguage() : Language("Serenity OS GML", false) {
    companion object {
        @JvmStatic val INSTANCE = GMLLanguage()
    }
}