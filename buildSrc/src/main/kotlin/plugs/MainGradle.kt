package plugs

import com.android.build.gradle.LibraryExtension
import dependencies.DependenciesVersions
import org.gradle.api.Plugin
import org.gradle.api.Project
import kotlin.jvm.java

class MainGradle : Plugin<Project> {
    override fun apply(project: Project) {
//        project.applyPlugins()
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

    private fun Project.androidConfig() {
        extensions.getByType(LibraryExtension::class.java).apply {
            compileSdk = ProjectConfig.compileSdk
            defaultConfig.apply {
                minSdk = ProjectConfig.minSdk
                targetSdk = ProjectConfig.targetSdk
                versionCode = ProjectConfig.versionCode
                versionName = ProjectConfig.versionName
                testInstrumentationRunner = ProjectConfig.testInstrumentationRunner
            }

            buildTypes {
                debug {
                    isMinifyEnabled = false
                    isShrinkResources = false
                    proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro"
                    )
                }
                release {
                    isMinifyEnabled = false
                    isShrinkResources = false
                    proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro"
                    )
                }
            }

            composeOptions {
                kotlinCompilerExtensionVersion = DependenciesVersions.KOTLIN_COMPILER
            }
        }
    }
//    private fun Project.applyPlugins(){
//        plugins.apply(BuildPlugins.ANDROID_APPLICATION) // run time
//        plugins.apply(BuildPlugins.HILT)
//    }
}