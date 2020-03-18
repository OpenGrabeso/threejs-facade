lazy val crossVersions = Seq("2.11.12", "2.12.10", "2.13.1")

scalaVersion := Versions.scala

crossScalaVersions := crossVersions

organization := "com.github.opengrabeso"

name := "threejs-facade"

version := "0.0.114-0.0.1"

publishMavenStyle := true

githubOwner in ThisBuild := "OpenGrabeso"

githubRepository in ThisBuild := "packages"

githubActor in ThisBuild := sys.env.getOrElse("GITHUB_USERNAME", "OpenGrabeso")

githubTokenSource in ThisBuild := TokenSource.GitConfig("github.token") || TokenSource.Environment("GITHUB_USERTOKEN") || TokenSource.Environment("GITHUB_TOKEN")


publishTo := {
  Some("GitHub gamatron Apache Maven Packages" at "https://maven.pkg.github.com/gamatron/packages/")
}

libraryDependencies ++= Dependencies.commonShared.value ++ Dependencies.testing.value

crossScalaVersions := crossVersions

scalaSource in Compile := baseDirectory.value / "facade" / "src"


libraryDependencies ++= Dependencies.facadeDependencies.value

jsDependencies += ProvidedJS / "three.js" minified "three.min.js" commonJSName "THREE"


enablePlugins(ScalaJSPlugin)

