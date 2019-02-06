lazy val crossVersions = Seq("2.11.8", "2.12.1")

scalaVersion := Versions.scala

crossScalaVersions := crossVersions

organization := "net.gamatron"


name := "threejs-facade"

version := "0.0.86-0.0.12"

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

jsDependencies += "org.webjars.bower" % "three.js" % Versions.threeJs / "three.js" minified "three.min.js"


enablePlugins(ScalaJSPlugin)

