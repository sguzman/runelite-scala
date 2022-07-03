package net.runelite.client

import java.util.Properties

object RuneLiteProperties {
 val API_BASE: String = "runelite.api.base"
 val BUILDING_LINK: String = "runelite.wiki.building.link"
 val DISCORD_INVITE: String = "runelite.discord.invite"
 val DNS_CHANGE_LINK: String = "runelite.dnschange.link"
 val INSECURE_SKIP_TLS_VERIFICATION_PROPERTY: String = "runelite.insecure-skip-tls-verification"
 val JAV_CONFIG_BACKUP: String = "runelite.jav_config_backup"
 val JAV_CONFIG: String = "runelite.jav_config"
 val LAUNCHER_VERSION_PROPERTY: String = "runelite.launcher.version"
 val OSRS_TWITTER_LINK: String = "runelite.osrstwitter.link"
 val PLUGINHUB_BASE: String = "runelite.pluginhub.url"
 val PLUGINHUB_VERSION: String = "runelite.pluginhub.version"
 val RUNELITE_COMMIT: String = "runelite.commit"
 val RUNELITE_CONFIG: String = "runelite.config"
 val RUNELITE_DIRTY: String = "runelite.dirty"
 val TROUBLESHOOTING_LINK: String = "runelite.wiki.troubleshooting.link"
 val RUNELITE_VERSION: String = "runelite.version"

 val properties = new Properties()
 properties.load(RuneLiteProperties.getClass.getResourceAsStream("runelite.properties"))

 def getVersion: String = properties.getProperty(RUNELITE_VERSION)
 def getCommit: String = properties.getProperty(RUNELITE_COMMIT)
 def getLauncherVersion: Option[String] = properties.getProperty(LAUNCHER_VERSION_PROPERTY)
 def isDirty: Boolean = properties.getProperty(RUNELITE_DIRTY).toBoolean
 def getDiscordInvite: String = properties.getProperty(DISCORD_INVITE)


}
