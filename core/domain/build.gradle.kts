plugins {
    id("saju.jpa")
}

dependencies {
    api(project(":support:error"))
    api(libs.spring.boot.starter.data.jpa)
    runtimeOnly(libs.mysql.connector)
}
