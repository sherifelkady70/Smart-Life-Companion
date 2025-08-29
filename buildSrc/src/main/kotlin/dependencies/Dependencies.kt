package dependencies

object Dependencies {
    const val ANDROID_CORE_KTX = "androidx.core:core-ktx:${DependenciesVersions.CORE_KTX}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${DependenciesVersions.APP_COMPAT}"
    const val ANDROIDX_ACTIVITY = "androidx.activity:activity-ktx:${DependenciesVersions.ANDROIDX_ACTIVITY}"
    const val ANDROID_MATERIAL = "com.google.android.material:material:${DependenciesVersions.MATERIAL}"
    const val ANDROID_LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${DependenciesVersions.LIFECYCLE_RUNTIME_KTX}"
    const val ANDROID_ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${DependenciesVersions.ACTIVITY_COMPOSE}"
    const val ANDROID_COMPOSE_BOM = "androidx.compose:compose-bom:${DependenciesVersions.COMPOSE_BOM}"
    const val ANDROIDX_UI = "androidx.compose.ui:ui"
    const val ANDROID_UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
    const val ANDROID_UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${DependenciesVersions.COMPOSE_UI}"
    const val ANDROID_UI_TOOLING = "androidx.compose.ui:ui-tooling:${DependenciesVersions.COMPOSE_UI}"

    const val ANDROID_X_MATERIAL_3 = "androidx.compose.material3:material3-android:${DependenciesVersions.MATERIAL3}"

    const val COMPOSE_MATERIAL =
        "androidx.compose.material:material:${DependenciesVersions.COMPOSE_MATERIAL}"
    const val COMPOSE_COMPILER =
        "androidx.compose.compiler:compiler:${DependenciesVersions.COMPOSE_COMPILER}"
    const val COMPOSE_RUNTIME = "androidx.lifecycle:lifecycle-runtime-compose:${DependenciesVersions.COMPOSE_RUNTIME}"

    const val hiltAndroid = "com.google.dagger:hilt-android:${DependenciesVersions.HILT}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${DependenciesVersions.HILT}"
    const val hiltAgp = "com.google.dagger:hilt-android-gradle-plugin:${DependenciesVersions.HILT}"
    const val hiltCompose = "androidx.hilt:hilt-work:${DependenciesVersions.HILT_COMPOSE}"
    const val hiltCompilerKapt = "androidx.hilt:hilt-compiler:${DependenciesVersions.HILT_COMPOSE}"
    const val hiltNavigation =
        "androidx.hilt:hilt-navigation-compose:${DependenciesVersions.HILT_COMPOSE}"

    const val hiltWork =
        "androidx.hilt:hilt-work:${DependenciesVersions.HILT_WORK}"


    const val workManger =
        "androidx.work:work-runtime-ktx:${DependenciesVersions.WORK_MANGER}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${DependenciesVersions.RETROFIT}"
    const val retrofitConverterGson =
        "com.squareup.retrofit2:converter-gson:${DependenciesVersions.RETROFIT}"
    const val retrofitKotlinCoroutinesAdapter =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${DependenciesVersions.RETROFIT_COROUTINE_ADAPTER_VERSION}"

    const val okHttp = "com.squareup.okhttp3:okhttp:${DependenciesVersions.OKHTTP}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${DependenciesVersions.OKHTTP}"

    const val roomRuntime = "androidx.room:room-runtime:${DependenciesVersions.ROOM}"
    const val roomCompiler = "androidx.room:room-compiler:${DependenciesVersions.ROOM}"
    const val roomKtx = "androidx.room:room-ktx:${DependenciesVersions.ROOM}"

    const val datastore = "androidx.datastore:datastore:${DependenciesVersions.DATA_STORE}"
    const val kotlinCollections = "org.jetbrains.kotlinx:kotlinx-collections-immutable:${DependenciesVersions.KOTLIN_COLLECTIONS}"
    const val kotlinSerilaizations = "org.jetbrains.kotlinx:kotlinx-serialization-json:${DependenciesVersions.KOTLIN_SERIALIZATIONS}"

    const val protoBufJavaLite = "com.google.protobuf:protobuf-javalite:${DependenciesVersions.PROTO_BUF_JAVA}"
    const val protoBufKotlinLite = "com.google.protobuf:protobuf-kotlin-lite:${DependenciesVersions.PROTO_BUF_KOTLIN}"
    const val protoBufArtifact = "com.google.protobuf:protoc:${DependenciesVersions.PROTO_BUF_KOTLIN}"

    const val chuckerDebug = "com.github.chuckerteam.chucker:library:${DependenciesVersions.CHUCKER}"
    const val chuckerRelease = "com.github.chuckerteam.chucker:library-no-op:${DependenciesVersions.CHUCKER}"

    const val navigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${DependenciesVersions.NAVIGATION}"
    const val navigation =
        "androidx.navigation:navigation-ui-ktx:${DependenciesVersions.NAVIGATION}"
    const val navigation2 = "androidx.navigation:navigation-compose:${DependenciesVersions.NAVIGATION}"
    const val googleJson = "com.google.code.gson:gson:${DependenciesVersions.GOOGLE_GSON}"


    const val PAGER_STATE = "com.google.accompanist:accompanist-pager:${DependenciesVersions.Pager}"
    const val PAGER_STATE_indicators = "com.google.accompanist:accompanist-pager-indicators:${DependenciesVersions.Pager}"
    const val systemuicontroller = "com.google.accompanist:accompanist-systemuicontroller:${DependenciesVersions.System_ui_controller}"
    const val icons_extended = "androidx.compose.material:material-icons-extended"
    const val calendar = "com.maxkeppeler.sheets-compose-dialogs:calendar:${DependenciesVersions.calendar}"
    const val calendar_core = "com.maxkeppeler.sheets-compose-dialogs:core:${DependenciesVersions.calendar}"

}
