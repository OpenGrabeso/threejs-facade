lazy val crossVersions = Seq("2.11.12", "2.12.10", "2.13.1")

scalaVersion := "2.12.10"

crossScalaVersions := crossVersions

organization := "com.github.opengrabeso"

name := "threejs-facade"

version := "0.0.114-0.0.2"

publishMavenStyle := true

githubOwner := "OpenGrabeso"

githubRepository := "packages"

githubTokenSource := TokenSource.GitConfig("github.token") || TokenSource.Environment("GITHUB_USERTOKEN") || TokenSource.Environment("GITHUB_TOKEN")

publishTo := {
  Some("GitHub gamatron Apache Maven Packages" at "https://maven.pkg.github.com/OpenGrabeso/packages/")
}

crossScalaVersions := crossVersions

scalaSource in Compile := baseDirectory.value / "facade" / "src"


libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"

jsDependencies += ProvidedJS / "three.js" minified "three.min.js" commonJSName "THREE"


enablePlugins(ScalaJSPlugin)

