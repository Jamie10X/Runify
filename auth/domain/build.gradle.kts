plugins {
    alias(libs.plugins.runify.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}