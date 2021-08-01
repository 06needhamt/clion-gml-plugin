/*
    BSD 2-Clause License

    Copyright (c) 2021, Tom Needham <06needhamt@gmail.com>
    All rights reserved.
 */
package org.serenityos.gml.plugin.core.psi

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class GMLIcons {
    companion object {
        @JvmStatic val FILE: Icon = IconLoader.getIcon("/icons/gml-file.png", GMLIcons::class.java)
    }
}