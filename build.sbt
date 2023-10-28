ThisBuild / organization := "com.ghptest"
ThisBuild / scalaVersion := "2.13.10"
ThisBuild / version := "1.0.2-SNAPSHOT"

githubOwner := "weipingc"
githubRepository := "sbtPluginLabUser"
githubTokenSource := TokenSource.Environment("MY_GITHUB_TOKEN")
publishMavenStyle := true

////////////////////////////////////////////////////////////////////////////////////////////////
lazy val `sbtPluginLabUser` = (project in file("."))
  .disablePlugins(MimaPlugin)
  .enablePlugins(NoPublishPlugin)
//  .settings(
//    libraryDependencies ++= Seq(
//      catsCore,
//      circeGeneric,
//    ),
//  )

logLevel := Level.Debug
