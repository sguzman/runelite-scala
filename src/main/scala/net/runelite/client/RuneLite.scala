package net.runelite.client

import java.io.File


object RuneLite {
  val RUNELITE_DIR: File = new File(System.getProperty("user.home"), ".runelite")
  val CACHE_DIR: File = new File(RUNELITE_DIR, "cache")
  val PLUGIN_DIR: File = new File(RUNELITE_DIR, "plugins")
  val PROFILE_DIR: File = new File(RUNELITE_DIR, "profiles")
  val SCREENSHOT_DIR: File = new File(RUNELITE_DIR, "screenshots")
  val LOG_DIR: File = new File(RUNELITE_DIR, "logs")
  val DEFAULT_SESSION_FILE: File = new File(RUNELITE_DIR, "session")
  val DEFAULT_PROFILE_FILE: File = new File(RUNELITE_DIR, "settings.profile")

  // 20 * 1024 * 1024 = 20MB
  val MAX_OKHTTP_CACHE_SIZE: Long = 20 * 1024 * 1024
  val USER_AGENT: String = s"RuneLite/${RuneLiteProperties.getVersion}-${RuneLiteProperties.getCommit}${if RuneLiteProperties.isDirty then "+" else ""}"
}
