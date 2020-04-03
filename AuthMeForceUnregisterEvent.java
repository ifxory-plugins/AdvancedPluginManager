package ru.witwar.apm.apimaster.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AuthMeForceUnregisterEvent extends Event implements Cancellable {

	private boolean isCancelled = false;
	private Player player;

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
	
	public AuthMeForceUnregisterEvent(Player name) {
		
		this.player = name;
		
	}

	public Player getPlayer() {
		return player;
	}

}
