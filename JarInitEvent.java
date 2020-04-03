package ru.witwar.advancedpluginmanager;

import java.io.File;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class JarInitEvent extends Event implements Cancellable {

	private boolean isCancelled = false;
	private File file;
	@SuppressWarnings("rawtypes")
	private Class summonedAt;

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
		this.isCancelled = value;
		
	}
	
	@SuppressWarnings("rawtypes")
	public JarInitEvent(File file, Class summonedAt) {
		
		this.file = file;
		this.summonedAt = summonedAt;
		
	}

	public File getFile() {
		return file;
	}

	@SuppressWarnings("rawtypes")
	public Class getSummonedAt() {
		return summonedAt;
	}

}
