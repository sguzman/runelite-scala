package net.runelite.client

import java.io.File
import java.applet.Applet
import net.runelite.client.plugins.PluginManager
import net.runelite.client.externalplugins.ExternalPluginManager
import externalplugins.ExternalPluginManager
import com.google.common.eventbus.EventBus


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

  //def injector: Injector = Injector.getInstance()
  val pluginManager: Option[PluginManager] = None
  val ExternalPluginManager: Option[ExternalPluginManager] = None
  val eventBus: Option[EventBus] = None
  val configManager: Option[ConfigManager] = None
  val sessionManager: Option[SessionManager] = None
  val discordService: Option[DiscordService] = None
  val clientSessionManager: Option[ClientSessionManager] = None
  val clientUI: Option[ClientUI] = None
  val overlayManager: Option[OverlayManager] = None
  val tooltipOverlay: Option[Provider[TooltipOverlay]] = None
  val worldMapOverlay: Option[Provider[WorldMapOverlay]] = None
  val applet: Option[Applet]
  val client: Option[Client]
  val runetimeConfig: Option[RuntimeConfig]
}
