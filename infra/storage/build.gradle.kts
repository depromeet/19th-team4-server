plugins {
    id("saju.kotlin-library")
}

dependencies {
    implementation(libs.spring.boot.starter)
    implementation(platform(libs.aws.sdk.bom))
    implementation(libs.aws.sdk.s3)
}
