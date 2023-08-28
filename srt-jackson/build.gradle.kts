plugins {
    kotlin("plugin.noarg") version "1.8.22"
}

dependencies {
    implementation(libs.spring.boot.starter.web)
}

tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}
