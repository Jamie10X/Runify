plugins {
    alias(libs.plugins.runify.android.library)
    alias(libs.plugins.runify.android.room)
}

android {
    namespace = "com.jamie.core.database"
}

dependencies {
    implementation(projects.core.domain)
}