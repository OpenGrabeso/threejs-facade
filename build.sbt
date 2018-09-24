import com.typesafe.sbt.SbtNativePackager.autoImport._
import com.typesafe.sbt.gzip.Import.gzip
import com.typesafe.sbt.web.SbtWeb.autoImport._
import com.typesafe.sbt.web.pipeline.Pipeline
import com.typesafe.sbt.web.{PathMapping, SbtWeb}
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._
import spray.revolver.RevolverPlugin.autoImport._

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

lazy val crossVersions = Seq("2.11.8", "2.12.1")

scalaVersion := Versions.scala

crossScalaVersions := crossVersions

organization := "net.gamatron"

libraryDependencies ++= Dependencies.commonShared.value++Dependencies.testing.value

name := "threejs-facade"

version := Versions.threejsFacade

crossScalaVersions := crossVersions

scalaSource in Compile := baseDirectory.value / "facade" / "src"


libraryDependencies ++= Dependencies.facadeDependencies.value

jsDependencies += "org.webjars.bower" % "three.js" % Versions.threeJs / "three.js" minified "three.min.js"


enablePlugins(ScalaJSPlugin)

disablePlugins(RevolverPlugin)
