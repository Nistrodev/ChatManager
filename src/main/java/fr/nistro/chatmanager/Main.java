package fr.nistro.chatmanager;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		this.getLogger().info("Plugin enabled");
	}

	@Override
	public void onDisable() {
		this.getLogger().info("Plugin disabled");
	}
}
