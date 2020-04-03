package ru.witwar.advancedpluginmanager;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class PluginIniter {
	
	private static AdvancedPluginManager instance = AdvancedPluginManager.getInstance();
	private static PluginIniter instanceOfPluginIniter;
	
	public void initPlugin(Plugin plugin) {
		
		instance.getServer().getPluginManager().callEvent(new PluginInitEvent(plugin, this.getClass()));
		try {
		  instance.getServer().getPluginManager().enablePlugin(plugin);
		} catch(Exception e) {
			e.printStackTrace();
			instance.getLogger().warning("Plugin cannot be initialized");
		}
	}
	public void initPlugin(String name) {
		
		instance.getServer().getPluginManager().callEvent(new PluginInitEvent(Bukkit.getPluginManager().getPlugin(name), this.getClass()));
		try {
			instance.getServer().getPluginManager().enablePlugin(Bukkit.getPluginManager().getPlugin(name));
		} catch(Exception e) {
			e.printStackTrace();
			instance.getLogger().warning("Plugin cannot be initialized");
		}
		
	}
	public void initJarFile(File file) {
		
		instance.getServer().getPluginManager().callEvent(new JarInitEvent(file, this.getClass()));
		try {
			instance.getServer().getPluginManager().loadPlugin(file);
		} catch(Exception e) {
			e.printStackTrace();
			instance.getLogger().warning("Plugin cannot be initialized");
		}
		
	}
	
	public void disablePlugin(Plugin plugin) {
		
		instance.getServer().getPluginManager().callEvent(new DisablePluginEvent(plugin, this.getClass()));
		instance.getServer().getPluginManager().disablePlugin(plugin);
		
	}
	public static PluginIniter getInstance() {
		return instanceOfPluginIniter;
	}
	
}
