plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.common_feature"
    compileSdk = 34

    defaultConfig {
        minSdk = 26

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    api(platform(libs.androidx.compose.bom))
    api(libs.androidx.activity.compose)
    ///api(libs.androidx.compose.runtime)
    ///api(libs.androidx.compose.lifecycle)
    ///api(libs.androidx.compose.view.model)
    api(libs.androidx.compose.hilt.navigation)
//    api(libs.androidx.compose.ui)
//    api(libs.androidx.compose.ui.graphics)
    api(libs.androidx.compose.ui.material)
    api(libs.androidx.compose.preview)
    api(libs.androidx.compose.ui.text.google.fonts)
    ///api(libs.androidx.compose.material.iconsExtended)
    ///api(libs.androidx.compose.material.navigation)
    api(libs.androidx.navigation.compose)
//    api(libs.sdp.android)
//    api(libs.ssp.android)

    api(project(":core:data"))
}