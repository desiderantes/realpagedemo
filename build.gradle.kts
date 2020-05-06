plugins {
    id("org.springframework.boot") version "2.2.6.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    idea
    java
    id("org.flywaydb.flyway") version "6.4.0"
}

group = "com.realpage"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

val developmentOnly by configurations.creating
configurations {
    runtimeClasspath {
        extendsFrom(developmentOnly)
    }
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-hateoas")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(group = "org.projectlombok", name = "lombok", version = "1.18.12")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-hibernate5")
    implementation("com.fasterxml.jackson.module:jackson-module-parameter-names")
    implementation("org.flywaydb:flyway-core")
    implementation("javax.inject:javax.inject:1")
    implementation("org.springframework.session:spring-session-core")
    implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect")
    //implementation("org.springframework.data:spring-data-rest-hal-explorer")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.microsoft.sqlserver:mssql-jdbc")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

object DataSource {
    val driver = System.getProperty("spring.datasource.driverClassName")
            ?: "com.microsoft.sqlserver.jdbc.SQLServerDriver"
    val url = System.getProperty("spring.datasource.url") ?: "jdbc:sqlserver://localhost\\MSSQLSERVER;database=test"
    val user = System.getProperty("spring.datasource.username") ?: "sa"
    val password = System.getProperty("spring.datasource.password") ?: "testpassword"
}

flyway {
    url = DataSource.url
    user = DataSource.user
    password = DataSource.password
    driver = DataSource.driver
}