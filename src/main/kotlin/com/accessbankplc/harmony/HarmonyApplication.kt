package com.accessbankplc.harmony

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class HarmonyApplication

fun main(args: Array<String>) {
    SpringApplication.run(HarmonyApplication::class.java, *args)
}
