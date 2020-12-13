package com.github.sora-x7.riderextsizechecker.services

import com.intellij.openapi.project.Project
import com.github.sora-x7.riderextsizechecker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
