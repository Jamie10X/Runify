plugins {
    alias(libs.plugins.runify.android.library)
    alias(libs.plugins.runify.jvm.ktor)
}

android {
    namespace = "com.jamie.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(libs.androidx.junit.ktx)
    implementation(libs.androidx.monitor)
}