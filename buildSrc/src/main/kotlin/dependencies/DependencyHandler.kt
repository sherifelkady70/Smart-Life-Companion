
import dependencies.Dependencies
import dependencies.debugImplementation
import dependencies.implementation
import dependencies.kapt
import dependencies.releaseImplementation
import org.gradle.api.artifacts.dsl.DependencyHandler


fun DependencyHandler.room() {
    implementation(Dependencies.roomKtx)
    implementation(Dependencies.roomRuntime)
    kapt(Dependencies.roomCompiler)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofitConverterGson)
    implementation(Dependencies.retrofitKotlinCoroutinesAdapter)
}

fun DependencyHandler.okHttp() {
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLoggingInterceptor)
}

fun DependencyHandler.hilt() {
    implementation(Dependencies.hiltAndroid)
    implementation(Dependencies.hiltCompose)
    implementation(Dependencies.hiltNavigation)
    kapt(Dependencies.hiltCompiler)
    kapt(Dependencies.hiltAgp)
    kapt(Dependencies.hiltCompilerKapt)
}

fun DependencyHandler.androidx() {
    implementation(Dependencies.ANDROID_CORE_KTX)
    implementation(Dependencies.ANDROID_LIFECYCLE_RUNTIME_KTX)
    implementation(Dependencies.ANDROID_ACTIVITY_COMPOSE)
    implementation(Dependencies.ANDROIDX_UI)
    implementation(Dependencies.ANDROID_UI_GRAPHICS)
    implementation(Dependencies.ANDROID_UI_TOOLING_PREVIEW)
    debugImplementation(Dependencies.ANDROID_UI_TOOLING)
    implementation(Dependencies.ANDROID_COMPOSE_BOM)
    implementation(Dependencies.ANDROID_X_MATERIAL_3)
    implementation(Dependencies.ANDROID_MATERIAL)
    implementation(Dependencies.APP_COMPAT)
    implementation(Dependencies.ANDROIDX_ACTIVITY)
    implementation(Dependencies.COMPOSE_MATERIAL)
    implementation(Dependencies.COMPOSE_COMPILER)
    implementation(Dependencies.COMPOSE_RUNTIME)
    implementation(Dependencies.navigation)
    implementation(Dependencies.navigation2)
    implementation(Dependencies.navigationFragmentKtx)
    implementation(Dependencies.googleJson)
    dialogPagerState()
}

fun DependencyHandler.kotlinx() {
    implementation(Dependencies.kotlinSerilaizations)
}

fun DependencyHandler.dialogPagerState(){
    implementation(Dependencies.PAGER_STATE)
    implementation(Dependencies.PAGER_STATE_indicators)
    implementation(Dependencies.icons_extended)
    implementation(Dependencies.systemuicontroller)
}

fun DependencyHandler.dataStore() {
    implementation(Dependencies.datastore)
    implementation(Dependencies.kotlinCollections)
    implementation(Dependencies.kotlinSerilaizations)
}

fun DependencyHandler.protoDataStore() {
    implementation(Dependencies.datastore)
    implementation(Dependencies.protoBufJavaLite)
    implementation(Dependencies.protoBufKotlinLite)
}

fun DependencyHandler.chucker() {
    releaseImplementation(Dependencies.chuckerRelease)
    debugImplementation(Dependencies.chuckerDebug)
}
//
//fun DependencyHandler.testDeps() {
//    testImplementation(TestDependencies.ANDROID_J_UNIT)
//    testImplementation(TestDependencies.J_UNIT)
//}
//
//fun DependencyHandler.testImplDeps() {
//    androidTestImplementation(TestDependencies.ANDROID_ESPRESSO_CORE)
//    androidTestImplementation(TestDependencies.ANDROID_UI_TEST_J_UNIT)
//}
//
//fun DependencyHandler.testDebugDeps() {
//    debugImplementation(TestDependencies.ANDROID_UI_TEST_MANIFEST)
//}
fun DependencyHandler.workManger() {
    implementation(Dependencies.hiltWork)
    implementation(Dependencies.workManger)
}
