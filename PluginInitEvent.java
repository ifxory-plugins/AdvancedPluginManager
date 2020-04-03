package ru.witwar.advancedpluginmanager;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;

public class PluginInitEvent extends Event implements Cancellable {

	private boolean isCancelled = false;
	private Plugin plugin;
	@SuppressWarnings("rawtypes")
	private Class summonedAt;

	@Override
	public HandlerList getHandlers() {
		return null;
	}

	@Override
	public boolean isCancelled() {
		return isCancelled ;
	}

	@Override
	public void setCancelled(boolean value) {
		this.isCancelled = value;
	}
	
	@SuppressWarnings("rawtypes")
	public PluginInitEvent(Plugin plugin, Class summonedAt) {
		
		this.plugin = plugin;
		this.summonedAt = summonedAt;
		
	}

	public Plugin getPlugin() {
		return plugin;
	}

	public void setPlugin(Plugin plugin) {
		this.plugin = plugin;
	}

	@SuppressWarnings("rawtypes")
	public Class getSummonedAt() {
		return summonedAt;
	}

}
