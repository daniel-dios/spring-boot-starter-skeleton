import Build_gradle.Versions.JUNIT

group = "com.example"

allprojects {
    repositories {
        mavenCentral()
    }
    version = "0.0.1"
}

object Versions {
    const val JUNIT = "5.9.2"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

plugins {
    kotlin("jvm") version "1.8.10"
    id("maven-publish")
    id("com.jfrog.artifactory") version "4.31.8"
}

subprojects {
    apply(plugin = "java")

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api:$JUNIT")
        testImplementation("org.junit.jupiter:junit-jupiter-params:$JUNIT")
        testImplementation("org.assertj:assertj-core:3.24.2")

        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$JUNIT")
    }

    tasks.apply {
        test {
            enableAssertions = true
            useJUnitPlatform {}
        }
    }
}
