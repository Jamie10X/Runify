plugins {
    alias(libs.plugins.runify.android.feature.ui)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.jamie.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}