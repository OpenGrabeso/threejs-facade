lazy val crossVersions = Seq("2.11.12", "2.12.12", "2.13.3")

scalaVersion := "2.12.12"

crossScalaVersions := crossVersions

organization := "com.github.opengrabeso"

name := "threejs-facade"

version := "0.0.126-0.0.3"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked"
)

publishMavenStyle := true

githubOwner := "OpenGrabeso"

githubRepository := "packages"

githubTokenSource := TokenSource.GitConfig("github.token") || TokenSource.Environment("GITHUB_USERTOKEN") || TokenSource.Environment("GITHUB_TOKEN")

publishTo := {
  Some("GitHub gamatron Apache Maven Packages" at "https://maven.pkg.github.com/OpenGrabeso/packages/")
}

crossScalaVersions := crossVersions

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"

jsDependencies += ProvidedJS / "facade_bundled/three.js" minified "facade_bundled/three.min.js" commonJSName "THREE"

enablePlugins(ScalaJSPlugin, JSDependenciesPlugin)

