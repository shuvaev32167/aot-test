plugins {
    java
    id("org.gradlex.extra-java-module-info") version "1.9"
    `java-library`
    application
}

group = "com.github.shuvaev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://jitpack.io")
}

dependencies {
    implementation(libs.aot)

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.compileJava {
    options.encoding = "UTF-8"
}

tasks.compileTestJava {
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}

extraJavaModuleInfo {
    automaticModule("com.github.demidko:aot", "aot")
    automaticModule("com.github.demidko:aot-bytecode", "aot.bytecode")
    automaticModule("com.github.demidko:bits", "bits")
//    module("com.github.demidko:aot", "aot"){
//        exports("com.github.demidko.aot")
////        opens("com.github.demidko.aot")
//
//        requires("aot.bytecode")
//        requires("bits")
//    }
//
//    module("com.github.demidko:aot-bytecode", "aot.bytecode"){
////        exports("com.github.demidko.aot")
////        opens("com.github.demidko.aot")
//    }
//
//    module("com.github.demidko:bits", "bits"){
//    }
}

application {
    mainModule = "aot.test.main"
    mainClass = "com.github.shuvaev.Main"
}