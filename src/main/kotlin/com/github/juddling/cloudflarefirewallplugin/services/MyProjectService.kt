package com.github.juddling.cloudflarefirewallplugin.services

import com.intellij.openapi.project.Project
import com.github.juddling.cloudflarefirewallplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
