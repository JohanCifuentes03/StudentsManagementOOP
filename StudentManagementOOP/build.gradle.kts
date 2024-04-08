plugins {
    id("java")
}

group = "co.com.sofka"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.github.javafaker:javafaker:1.0.2")

}

tasks.test {
    useJUnitPlatform()
}