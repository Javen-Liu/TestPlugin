package com.github.javenliu.testplugin.services

import com.intellij.openapi.project.Project
import com.github.javenliu.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
