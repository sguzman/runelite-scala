package net.runelite.client

import java.io.File
import lombok.extern.slf4j.Slf4j;

@Slf4j
object RuneLite {
  val RUNELITE_DIR: File = new File(System.getProperty("user.home"), ".runelite")
}
