plugins {
    kotlin("jvm") version "1.3.20"

    application
}

dependencies {

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:0.4.1")
    }
}

apply(plugin = "com.jfrog.bintray")

application {
    mainClassName = "com.blockchain.insurance.App"
}

