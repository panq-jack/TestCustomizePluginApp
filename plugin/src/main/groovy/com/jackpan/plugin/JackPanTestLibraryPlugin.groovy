package com.jackpan.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class JackPanTestLibraryPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.logger.error("==========定义插件开始运行了===========")
        println "This is Jack pan first Plugin in maven"

        project.extensions.create("jackpandebug", JackPanDebugConfig)

        project.task('jptestPlugin') << {
            println "This is my first TasK by jack pan to test plugin in maven"
        }

        project.afterEvaluate {
            println("value=" + project.jackpandebug.value)
        }
    }
}