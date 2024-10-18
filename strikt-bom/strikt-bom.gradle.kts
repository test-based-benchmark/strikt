plugins {
  `java-platform`
}

description =
  "Bill of materials to make sure a consistent set of versions is used for Strikt."

dependencies {
  constraints {
    api(project(":strikt-arrow"))
    api(project(":strikt-core"))
    api(project(":strikt-jackson"))
    api(project(":strikt-jvm"))
    api(project(":strikt-mockk"))
    api(project(":strikt-protobuf"))
    api(project(":strikt-spring"))
  }
}
