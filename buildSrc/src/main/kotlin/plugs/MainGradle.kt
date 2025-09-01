package plugs

import jdk.tools.jlink.resources.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project

class MainGradle : Plugin<Project> {
    override fun apply(project: Project) {
        project.applyPlugins()
        applyPlugins(project)
    }

    private fun applyPlugins(project: Project) {
        project.apply {
            plugin(BuildPlugins.ANDROID_APPLICATION)//compile time
            plugin(BuildPlugins.KOTLIN_ANDROID)
            plugin(BuildPlugins.KOTLIN_COMPOSE)
            plugin(BuildPlugins.HILT)
        }
    }

    private fun Project.applyPlugins(){
        plugins.apply(BuildPlugins.ANDROID_APPLICATION) // run time
        plugins.apply(BuildPlugins.HILT)
    }
}