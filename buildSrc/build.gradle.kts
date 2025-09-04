import com.sun.source.util.Plugin

plugins {
    `kotlin-dsl`
}

repositories{
    google()
    mavenCentral()
    gradlePluginPortal()
}


dependencies{
//    api(kotlin("gradle-plugin:1.9.0"))

//    implementation("com.android.tools.build:gradle:8.5.2")
//    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")

    compileOnly("com.android.tools.build:gradle:7.4.2")
}