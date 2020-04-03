package ru.witwar.advancedpluginmanager;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;

public class DisablePluginEvent extends Event implements Cancellable {

	private boolean isCancelled = false;
	private Plugin plugin;
	@SuppressWarnings("rawtypes")
	private Class summoner;

	@Override
	public HandlerList getHandlers() {
		return null;
	}

	@Override
	public boolean isCancelled() {
		return isCancelled;
	}

	@Override
	public void setCancelled(boolean value) {
		this.isCancelled  = value;
		
	}
	
	@SuppressWarnings("rawtypes")
	public DisablePluginEvent(Plugin plugin, Class summoner) {
		
		this.plugin = plugin;
		this.summoner = summoner;
		
	}

	public Plugin getPlugin() {
		return plugin;
	}

	@SuppressWarnings("rawtypes")
	public Class getSummoner() {
		return summoner;
	}

}
