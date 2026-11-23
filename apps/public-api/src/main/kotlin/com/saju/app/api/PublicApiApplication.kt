package com.saju.app.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.saju.app"])
class PublicApiApplication

fun main(args: Array<String>) {
    runApplication<PublicApiApplication>(*args)
}
