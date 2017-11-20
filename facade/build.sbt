enablePlugins(ScalaJSPlugin)

name := "threejs-facade"

version := "0.0.82-0.1.8-internal"

scalaVersion := "2.12.1"

organization := "net.gamatron"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

libraryDependencies += "org.querki" %%% "querki-jsext" % "0.8"
