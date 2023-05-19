group = "com.example"

dependencies {
    implementation(project(":starter"))
    implementation("org.springframework.boot:spring-boot-autoconfigure:3.0.4")

    testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.0")
}