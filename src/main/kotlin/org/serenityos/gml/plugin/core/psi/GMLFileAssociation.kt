/*
    BSD 2-Clause License

    Copyright (c) 2021, Tom Needham <06needhamt@gmail.com>
    All rights reserved.
 */
package org.serenityos.gml.plugin.core.psi

import com.intellij.openapi.fileTypes.OSFileIdeAssociation

class GMLFileAssociation : OSFileIdeAssociation {
    override fun getExtensionsMode(): OSFileIdeAssociation.ExtensionMode {
        return OSFileIdeAssociation.ExtensionMode.Default
    }

    override fun isFileAssociationAllowed(): Boolean {
        return true
    }
}