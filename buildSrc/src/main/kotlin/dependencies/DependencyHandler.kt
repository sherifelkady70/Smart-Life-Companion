
import dependencies.Dependencies
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.debugImplementation
import org.gradle.kotlin.dsl.implementation
import org.gradle.kotlin.dsl.kapt
import org.gradle.kotlin.dsl.releaseImplementation


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
//
//fun DependencyHandler.loginModule() {
//    moduleImplementation(project(":features:login"))
//}
//
//fun DependencyHandler.searchDataSelectionModule() {
//    moduleImplementation(project(":features:searchDataSelection"))
//}
//
//fun DependencyHandler.homeModule() {
//    moduleImplementation(project(":features:home"))
//}
//
//fun DependencyHandler.billPaymentModule() {
//    moduleImplementation(project(":features:billPayment"))
//}
//fun DependencyHandler.customerDetailsModule() {
//    moduleImplementation(project(":features:customerDetails"))
//}
//
//fun DependencyHandler.coreDataModule() {
//    moduleImplementation(project(":core:data"))
//}
//
//fun DependencyHandler.coreDataStoreModule() {
//    moduleImplementation(project(":core:datastore"))
//}
//
//fun DependencyHandler.coreProtoDataStoreModule() {
//    moduleImplementation(project(":core:protodatastore"))
//}
//
//fun DependencyHandler.coreDomainModule() {
//    moduleImplementation(project(":core:domain"))
//}
//
//fun DependencyHandler.coreNavigatorModule() {
//    moduleImplementation(project(":core:navigator"))
//}
//
//fun DependencyHandler.corePresentationModule() {
//    moduleImplementation(project(":core:presentation"))
//}
//
//fun DependencyHandler.coreConfigModule() {
//    moduleImplementation(project(":core:config"))
//}
//
//fun DependencyHandler.printerModule() {
//    moduleImplementation(project(":features:printer"))
//}
//
//fun DependencyHandler.roomModule() {
//    moduleImplementation(project(":core:room"))
//}
//
//fun DependencyHandler.customerListModule() {
//    moduleImplementation(project(":features:customerList"))
//}
//fun DependencyHandler.reportsModule() {
//    moduleImplementation(project(":features:reports"))
//}
//
//fun DependencyHandler.insertReadingModule() {
//    moduleImplementation(project(":features:insertReading"))
//}
//
//fun DependencyHandler.complaintsModule() {
//    moduleImplementation(project(":features:complaints"))
//}