ThisBuild / organization := "com.ghptest"
ThisBuild / scalaVersion := "2.13.12"
ThisBuild / version := "1.0.0-SNAPSHOT"

resolvers += Resolver.githubPackages("dj707chen")
githubOwner := "dj707chen"
githubRepository := "sbtPluginLabUser"
publishMavenStyle := true

////////////////////////////////////////////////////////////////////////////////////////////////
// Refer https://github.com/sbt/sbt-github-actions#jdk-settings
ThisBuild / githubWorkflowJavaVersions += JavaSpec.temurin("17")
ThisBuild / githubWorkflowEnv += "GITHUB_TOKEN" -> "${{ secrets.MY_GITHUB_TOKEN }}"

////////////////////////////////////////////////////////////////////////////////////////////////
lazy val sbtPluginLabUser = (project in file("."))
  .settings(
    // circeCore is defined in CognitOpsSbtPlugin which will be brought in by "com.ghptest.sbt" % "blog-sbt-plugin" % "1.0-SNAPSHOT")
    // it is properly published to Github Packages
    libraryDependencies ++= Seq(
      catsCore,
      http4sCirce,
      circeCore
    )

  )

logLevel := Level.Debug
