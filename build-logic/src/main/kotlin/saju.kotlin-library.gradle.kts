// 모든 모듈의 기본 설정: Kotlin/JVM, Spring BOM, 테스트
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    `java-library`
}

val libs = versionCatalogs.named("libs")
fun lib(alias: String) = libs.findLibrary(alias).get()

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(libs.findVersion("java").get().requiredVersion)
    }
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.fromTarget(libs.findVersion("java").get().requiredVersion)
        freeCompilerArgs.addAll("-Xjsr305=strict", "-Xannotation-default-target=param-property")
    }
}

dependencies {
    val springBootBom = platform(lib("spring-boot-bom"))
    implementation(springBootBom)
    testImplementation(springBootBom)
    testRuntimeOnly(springBootBom)

    implementation(lib("kotlin-reflect"))

    testImplementation(lib("kotlin-test-junit5"))
    testImplementation(lib("mockk"))
    testRuntimeOnly(lib("junit-platform-launcher"))
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
