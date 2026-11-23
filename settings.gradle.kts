pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
    repositories {
        mavenCentral()
    }
}

rootProject.name = "saju"

include(
    // apps: 따로 배포되는 실행 단위
    ":apps:public-api",
    // core: 도메인 모델과 비즈니스 규칙
    ":core:domain",
    ":core:business",
    // infra: 전용 라이브러리/프로토콜로 붙는 외부 시스템
    ":infra:ai",
    ":infra:storage",
    // client: HTTP API 호출
    ":client:social-login",
    ":client:saju-ontology",
    // support: 비즈니스를 모르는 기술 공통 코드
    ":support:error",
    ":support:web",
    ":support:http-client",
    ":support:logging",
    ":support:monitoring",
    ":support:test-support",
)
