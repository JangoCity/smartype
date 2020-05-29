include(
    ":smartype-api",
    ":smartype-generator",
    ":smartype",
    ":smartype-receivers:smartype-mparticle",
    ":examples:androidExample"
)
rootProject.name = "smartype"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven ("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}