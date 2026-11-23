// 테스트에서만 쓴다. 각 모듈은 testImplementation으로 의존한다.
plugins {
    id("saju.kotlin-library")
}

dependencies {
    api(libs.spring.boot.starter.test)
    api(libs.spring.boot.testcontainers)
    api(libs.testcontainers.junit.jupiter)
    api(libs.testcontainers.mysql)
    api(libs.archunit.junit5)
}
