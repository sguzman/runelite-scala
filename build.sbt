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
      "net.sf.jopt-simple" % "jopt-simple" % "5.0.4",
      "com.google.guava" % "guava" % "31.1-jre",
      "com.google.inject" % "guice" % "5.1.0",
      "com.google.code.gson" % "gson" % "2.9.0",
      "net.runelite.pushingpixels" % "substance" % "8.0.02",
      "net.runelite.pushingpixels" % "trident" % "1.5.00",
      "org.projectlombok" % "lombok" % "1.18.24" % "provided",
      "org.apache.commons" % "commons-text" % "1.9",
      "org.apache.commons" % "commons-csv" % "1.9.0",
      "net.runelite.archive-patcher" % "archive-patcher-applier" % "1.2"
    )
  )
