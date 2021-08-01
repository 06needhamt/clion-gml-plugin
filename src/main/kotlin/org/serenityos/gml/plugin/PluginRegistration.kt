/*
    BSD 2-Clause License

    Copyright (c) 2021, Tom Needham <06needhamt@gmail.com>
    All rights reserved.
 */
package org.serenityos.gml.plugin

import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.fileTypes.impl.FileTypeManagerImpl
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity
import com.intellij.openapi.vfs.VirtualFileManager
import org.serenityos.gml.plugin.actions.FileSaveListener
import org.serenityos.gml.plugin.actions.InitialisationAction

class PluginRegistration : StartupActivity.Background {
    val actionManager = ActionManager.getInstance()
    val init = InitialisationAction()
    val fileManager: FileTypeManagerImpl = FileTypeManagerImpl.getInstance() as FileTypeManagerImpl
    val virtualFileManager = VirtualFileManager.getInstance()
    val fileSaveListener = FileSaveListener()

    override fun runActivity(project: Project) {
        println("Plugin Loaded for project: ${project.name}")
    }
}