val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "runelite-scala",
    version := "0.1.0-SNAPSHOT",
    projectVersion := "1.8.25",

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
      "net.runelite.archive-patcher" % "archive-patcher-applier" % "1.2",
      "net.java.dev.jna" % "jna" % "5.12.1",
      "net.java.dev.jna" % "jna-platform" % "5.12.1",
      "com.google.code.findbugs" % "jsr305" % "3.0.2",
      "org.jetbrains" % "annotations" % "23.0.0",
      "com.google.protobuf" % "protobuf-javalite" % "3.21.2",

      // JOGL
      "net.runelite.jogl" % "jogl-rl" % "2.4.0-rc-20220318",
      "net.runelite.jogl" % "jogl-gldesktop-dbg" % "2.4.0-rc-20220318",
      "net.runelite.jogl" % "jogl-rl" % "2.4.0-rc-20220318" classifier "natives-windows-amd64",
      "net.runelite.jogl" % "jogl-rl" % "2.4.0-rc-20220318" classifier "natives-windows-i586",
      "net.runelite.jogl" % "jogl-rl" % "2.4.0-rc-20220318" classifier "natives-linux-amd64",
      "net.runelite.jogl" % "jogl-rl" % "2.4.0-rc-20220318" classifier "natives-macosx-universal",

      // Gluegen
      "net.runelite.jogl" % "gluegen-rt" % "2.4.0-rc-20220318",
      "net.runelite.jogl" % "gluegen-rt" % "2.4.0-rc-20220318" classifier "natives-windows-amd64",
      "net.runelite.jogl" % "gluegen-rt" % "2.4.0-rc-20220318" classifier "natives-windows-i586",
      "net.runelite.jogl" % "gluegen-rt" % "2.4.0-rc-20220318" classifier "natives-linux-amd64",
      "net.runelite.jogl" % "gluegen-rt" % "2.4.0-rc-20220318" classifier "natives-macosx-universal",

      // JOCL
      "net.runelite.jocl" % "jocl-rl" % "2.4.0-rc-20220318",
      "net.runelite.jocl" % "jocl-rl" % "2.4.0-rc-20220318" classifier "macos-x64",
      "net.runelite.jocl" % "jocl-rl" % "2.4.0-rc-20220318" classifier "macos-arm64",

      "net.runelite" % "runelite-api" % projectVersion,
      "net.runelite" % "jshell" % projectVersion,
      "net.runelite" % "client-patch" % projectVersion,
      "net.runelite" % "http-api" % projectVersion,
      "net.runelite" % "discord" % projectVersion,
      "net.runelite" % "orange-extensions" % projectVersion,
    )
  )
