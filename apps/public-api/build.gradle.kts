plugins {
    id("saju.spring-boot-app")
}

dependencies {
    implementation(project(":core:business"))
    implementation(project(":infra:ai"))
    implementation(project(":infra:storage"))
    implementation(project(":client:social-login"))
    implementation(project(":client:saju-ontology"))
    implementation(project(":support:web"))
    implementation(project(":support:logging"))
    implementation(project(":support:monitoring"))
    testImplementation(project(":support:test-support"))
}
