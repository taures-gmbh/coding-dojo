plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks{
    test {
        useJUnitPlatform()
    }

    // Definiere einen eigenen 'run' Task
    register("run", JavaExec::class) {
        group = "run"
        mainClass.set("org.example.Main") // Ersetze "dein.package.name.Hauptklasse" durch den vollständigen Namen deiner Hauptklasse
        classpath = sourceSets["main"].runtimeClasspath
        args = listOf() // Füge hier Argumente hinzu, falls benötigt
        standardInput = System.`in`

    }

}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
