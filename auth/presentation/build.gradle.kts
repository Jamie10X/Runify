plugins {
    alias(libs.plugins.runify.android.feature.ui)
}

android {
    namespace = "com.jamie.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}