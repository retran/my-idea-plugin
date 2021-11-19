package com.github.retran.myideaplugin.services

import com.intellij.openapi.project.Project
import com.github.retran.myideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
