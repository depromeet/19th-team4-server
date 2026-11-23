// 실행 모듈(apps/*)용: 실행 가능한 jar는 apps만 만든다
plugins {
    id("saju.kotlin-library")
    id("org.springframework.boot")
}

val libs = versionCatalogs.named("libs")

dependencies {
    testImplementation(libs.findLibrary("spring-boot-starter-test").get())
}

tasks.named<Jar>("jar") {
    enabled = false
}
