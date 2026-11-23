// JPA Entity를 가진 모듈용: Entity/Embeddable을 open, 기본 생성자 생성
plugins {
    id("saju.kotlin-library")
    kotlin("plugin.jpa")
}

allOpen {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.MappedSuperclass")
    annotation("jakarta.persistence.Embeddable")
}
