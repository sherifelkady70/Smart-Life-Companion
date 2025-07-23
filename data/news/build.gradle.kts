plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {
    namespace = "com.example.news"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)




    implementation(libs.androidx.navigation.compose)


    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    // Optional: For ViewModel support
    kapt(libs.androidx.hilt.compiler)

    // Room runtime
    implementation("androidx.room:room-runtime:2.6.1")

    // Kotlin extensions and coroutines support
    implementation("androidx.room:room-ktx:2.7.2")

    // Annotation processor (for Java)
    annotationProcessor("androidx.room:room-compiler:2.6.1")

    //coil
    implementation("io.coil-kt:coil-compose:2.5.0")
//
    implementation(libs.ktor.client.core) // Ktor-Core
    implementation(libs.ktor.client.android) // Ktor-Engine

    implementation(libs.kotlinx.serialization.json) // KotlinX Serialization (Convert JSON response to Kotlin Objects)
    implementation(libs.ktor.serialization.kotlinx.json) // Ktor- To work with Serialization

    implementation(libs.ktor.client.logging) // Logging (Optional)

    implementation(libs.ktor.client.content.negotiation) // Serialization

}