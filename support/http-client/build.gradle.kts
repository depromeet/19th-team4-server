plugins {
    id("saju.kotlin-library")
}

dependencies {
    api(libs.spring.boot.starter.restclient)
    implementation(libs.jackson.module.kotlin)
}
