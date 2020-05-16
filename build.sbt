import Dependencies._

ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "traversable-applicative-compilation-error",
    scalacOptions ++= Seq(
      "-Xlog-implicits"
    ),
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"
  )
