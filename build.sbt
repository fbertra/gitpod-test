name := "gitpod-test"

version := "0.0.1"

scalaVersion := "2.12.11"

lazy val api = (project in file("sbt_nube-api"))

lazy val main = (project in file("sbt_nube-main")).dependsOn (api)