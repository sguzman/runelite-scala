package net.runelite.client

import java.io.File

@Slf4j
object RuneLite {
  val RUNELITE_DIR: File = new File(System.getProperty("user.home"), ".runelite")
}
