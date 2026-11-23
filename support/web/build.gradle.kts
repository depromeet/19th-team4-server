plugins {
    id("saju.kotlin-library")
}

dependencies {
    api(project(":support:error"))
    api(libs.spring.boot.starter.webmvc)
    api(libs.spring.boot.starter.validation)
    api(libs.jackson.module.kotlin)
}
