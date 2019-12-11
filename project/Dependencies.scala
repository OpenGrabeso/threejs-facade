import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Dependencies {

  //libs for testing
  lazy val testing: Def.Initialize[Seq[ModuleID]] = Def.setting(Seq(
    "org.scalatest" %%% "scalatest" % Versions.scalaTest % Test
  ))

  //akka-related libs
  lazy val templates = Def.setting(Seq(
    "com.github.japgolly.scalacss" %%% "core" % Versions.scalaCSS,

    "com.github.japgolly.scalacss" %%% "ext-scalatags" % Versions.scalaCSS))

  lazy val facadeDependencies = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % Versions.dom
    ))

  //scalajs libs
  lazy val sjsLibs = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % Versions.dom
  ))

  //dependencies on javascript libs
  lazy val webjars = Def.setting(Seq(
    "org.webjars" % "jquery" % Versions.jquery,

    "org.webjars" % "Semantic-UI" % Versions.semanticUI, //css theme, similar to bootstrap

    "org.webjars" % "codemirror" % Versions.codemirror,

    "org.webjars.bower" % "three.js" % Versions.threeJs))

  //common purpose libs
  lazy val commonShared: Def.Initialize[Seq[ModuleID]] = Def.setting(Seq( //"com.softwaremill.quicklens" %%% "quicklens" % Versions.quicklens//, //nice lenses for case classes
  ))
}
