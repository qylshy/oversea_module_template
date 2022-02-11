package com.github.qylshy.overseamoduletemplate.services

import com.intellij.openapi.project.Project
import com.github.qylshy.overseamoduletemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
