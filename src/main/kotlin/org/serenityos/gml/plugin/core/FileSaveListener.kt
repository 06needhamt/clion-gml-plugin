/*
    BSD 2-Clause License

    Copyright (c) 2021, Tom Needham <06needhamt@gmail.com>
    All rights reserved.
 */
package org.serenityos.gml.plugin.actions

import com.intellij.ide.util.PropertiesComponent
import com.intellij.openapi.vfs.*

class FileSaveListener : VirtualFileListener {
    companion object Data {
        @JvmStatic
        val properties = PropertiesComponent.getInstance()
        @JvmStatic
        var enumerateFiles: (VirtualFile?) -> MutableList<VirtualFile?> = { directory ->
            mutableListOf(directory)
        }
        @JvmStatic
        var files: List<VirtualFile?> = listOf()
        @JvmStatic
        val checkFileNames: (List<VirtualFile?>, String) -> Boolean = { files, name ->
            var found: Boolean = false
            for (file: VirtualFile? in files) {
                found = file?.name?.equals(name)!!
            }
            found
        }
    }

    override fun beforePropertyChange(p0: VirtualFilePropertyEvent) {

    }

    override fun beforeContentsChange(p0: VirtualFileEvent) {

    }

    override fun fileDeleted(p0: VirtualFileEvent) {

    }

    override fun beforeFileMovement(p0: VirtualFileMoveEvent) {

    }

    override fun fileMoved(p0: VirtualFileMoveEvent) {

    }

    override fun propertyChanged(p0: VirtualFilePropertyEvent) {

    }

    override fun contentsChanged(p0: VirtualFileEvent) {
        files = mutableListOf()
    }

    override fun beforeFileDeletion(p0: VirtualFileEvent) {

    }

    override fun fileCreated(p0: VirtualFileEvent) {

    }

    override fun fileCopied(p0: VirtualFileCopyEvent) {

    }
}