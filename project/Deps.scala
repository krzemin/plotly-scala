
import sbt._

import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Deps {

  import Def.setting

  private val jupyterScalaVersion = "0.4.2"
  private val circeVersion = "0.9.3"


  def circeCore = setting("io.circe" %%% "circe-core" % circeVersion)
  def circeLiteral = setting("io.circe" %% "circe-literal" % circeVersion)
  def circeScalaJs = setting("io.circe" %%% "circe-scalajs" % circeVersion)
  def circeParser = setting("io.circe" %%% "circe-parser" % circeVersion)
  def jodaTime = "joda-time" % "joda-time" % "2.9.9"
  def jupyterScalaApi = "org.jupyter-scala" % "scala-api" % jupyterScalaVersion cross CrossVersion.full
  def rhino = "org.mozilla" % "rhino" % "1.7.7.1"
  def shapeless = setting("com.chuusai" %%% "shapeless" % "2.3.3")
  def scalacheckShapeless = setting("com.github.alexarchambault" %%% "scalacheck-shapeless_1.13" % "1.1.8")
  def scalajsDom = setting("org.scala-js" %%% "scalajs-dom" % "0.9.5")
  def scalatags = setting("com.lihaoyi" %%% "scalatags" % "0.6.7")
  def scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  def utest = setting("com.lihaoyi" %%% "utest" % "0.4.8")

}
