plugins {
    id("io.micronaut.build.internal.jms-tests")
}

dependencies {
    implementation(projects.micronautJmsSqs)
    testImplementation(libs.testcontainers.localstack)
    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)
}

micronaut {
    testRuntime("spock")
}