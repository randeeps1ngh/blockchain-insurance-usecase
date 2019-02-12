import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

val kotlinVersion = "1.2.71"
val springBootVersion = "2.1.2.RELEASE"
val springCloudVersion = "2.1.0.RELEASE"
plugins {
    kotlin("jvm") version "1.3.20"
    id("org.springframework.boot") version "2.1.2.RELEASE"
    id("org.jetbrains.kotlin.plugin.spring") version "1.3.20"
    id("org.jetbrains.kotlin.plugin.jpa") version "1.3.20"
    application
}

apply(plugin = "io.spring.dependency-management")

the<DependencyManagementExtension>().apply {
    imports {
        mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
    }
}

dependencies {


    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

//    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-allopen:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-noarg:${kotlinVersion}")

    implementation( "org.springframework.boot:spring-boot-starter-data-jpa:${springBootVersion}")
    implementation ("org.springframework.boot:spring-boot-starter-webflux:${springBootVersion}")
    implementation ("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.8")
    implementation ("org.springframework.cloud:spring-cloud-starter:${springCloudVersion}")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation ("org.jetbrains.kotlin:kotlin-reflect")
    implementation ("com.h2database:h2")
    runtimeOnly ("org.springframework.boot:spring-boot-devtools:${springBootVersion}")
    testImplementation ("org.springframework.boot:spring-boot-starter-test:${springBootVersion}")
}


application {
    mainClassName = "com.blockchain.insurance.BlockChainInsuranceApp"
}

