plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.personal.calendarEN"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.calendarEN"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    implementation ("com.google.accompanist:accompanist-swiperefresh:0.36.0")

//    implementation(libs.coil.compose)

    //compose navigation
    implementation (libs.androidx.navigation.compose)

    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    implementation(libs.accompanist.systemuicontroller)

    implementation(libs.lottie.compose)

    implementation (libs.androidx.room.runtime)
    ksp (libs.androidx.room.compiler)
    implementation (libs.androidx.room.ktx)

    //retrofit
    implementation (libs.logging.interceptor)
    implementation (libs.converter.gson)
    implementation (libs.retrofit)

    //dataStore
    implementation(libs.androidx.datastore.preferences)

    implementation ("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.5")

//    //Accompanist-Pager
    implementation ("com.google.accompanist:accompanist-pager:0.29.0-alpha")
     implementation ("androidx.compose.foundation:foundation:1.5.0")
    //gson
    implementation ("com.google.code.gson:gson:2.9.1")
    //icon
    implementation ("androidx.compose.material:material-icons-extended:1.5.4")


    implementation ("com.guolindev.permissionx:permissionx:1.7.1")


//    implementation ("com.mindorks.android:prdownloader:0.6.0")

    //chart
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")

    //map
     implementation ("com.google.maps.android:maps-compose:6.2.0")


}