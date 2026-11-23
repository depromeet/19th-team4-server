plugins {
    id("saju.kotlin-library")
}

dependencies {
    implementation(platform(libs.spring.ai.bom))
    implementation(libs.spring.ai.client.chat)
    // LLM provider starter는 provider를 정한 뒤 추가한다. 예) spring-ai-starter-model-openai
}
