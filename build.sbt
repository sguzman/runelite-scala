val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "runelite-scala",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "org.slf4j" % "slf4j-api" % "1.7.36",
      "ch.qos.logback" % "logback-classic" % "1.2.11",
      "net.sf.jopt-simple" % "jopt-simple" % "5.0.4"
    )
  )
