package com.github.ichunming.myplugintemplete.services

import com.intellij.openapi.project.Project
import com.github.ichunming.myplugintemplete.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
