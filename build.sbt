lazy val crossVersions = Seq("2.11.12", "2.12.10", "2.13.1")

scalaVersion := Versions.scala

crossScalaVersions := crossVersions

organization := "net.gamatron"


name := "threejs-facade"

version := "0.0.112-0.0.1-SNAPSHOT"

resolvers += sbt.Resolver.bintrayRepo("denigma", "denigma-releases") //add resolver

resolvers += Resolver.jcenterRepo

publishMavenStyle := true

publishTo := {
	val nexus = "https://www.gamatron.net/nexus/"
	if (isSnapshot.value)
		Some("Gamatron Snapshots Nexus" at nexus + "repository/maven-snapshots")
	else
		Some("Gamatron Releases Nexus"  at nexus + "repository/maven-releases")
}

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")


libraryDependencies ++= Dependencies.commonShared.value++Dependencies.testing.value

crossScalaVersions := crossVersions

scalaSource in Compile := baseDirectory.value / "facade" / "src"


libraryDependencies ++= Dependencies.facadeDependencies.value

jsDependencies += ProvidedJS / "three.js" minified "three.min.js" commonJSName "THREE"


enablePlugins(ScalaJSPlugin)

