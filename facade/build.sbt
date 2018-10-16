enablePlugins(ScalaJSPlugin)

name := "threejs-facade"

version := "0.0.86-0.0.9" // see also ScalaJSVersions.threejsFacade

scalaVersion := "2.11.8"

organization := "net.gamatron"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

libraryDependencies += "org.querki" %%% "querki-jsext" % "0.8"
