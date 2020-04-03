package ru.witwar.advancedpluginmanager;

import org.bukkit.plugin.java.JavaPlugin;

public class AdvancedPluginManager extends JavaPlugin {
	
	private static AdvancedPluginManager instance;
	
	@Override
	public void onEnable() {
		
		getLogger().info("All services initialized.");
		getCommand("disable").setExecutor(new PluginDisableCommand(this));
		getCommand("enable").setExecutor(new PluginEnableCommand(this));
		
	}
	public static AdvancedPluginManager getInstance() {
		return instance;
	}

}
