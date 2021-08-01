/*
    BSD 2-Clause License

    Copyright (c) 2021, Tom Needham <06needhamt@gmail.com>
    All rights reserved.
 */
package org.serenityos.gml.plugin.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project

/**
 * Initial action that is performed when the plugin is loaded on IDE startup
 * or enabled manually by the user.
 */
class InitialisationAction : AnAction {
    companion object ProjectInfo {
        var project: Project? = null
        var projectDirectory: String? = ""
        var isOpen: Boolean? = false
    }

    constructor() {

    }

    constructor(text: String?) : super(text) {

    }

    /**
     * Function called when the plugin has been successfully initialised
     * @param p0 The action event that fired the action
     */
    override fun actionPerformed(p0: AnActionEvent) {
        // Setup the Plugin and load the project
        project = p0.project
        projectDirectory = project?.basePath
        isOpen = project?.isOpen
    }

}