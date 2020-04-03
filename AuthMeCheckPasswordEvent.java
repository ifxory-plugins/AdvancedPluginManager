package ru.witwar.apm.apimaster.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AuthMeCheckPasswordEvent extends Event implements Cancellable {

	private boolean isCancelled = false;
	private Player player;
	private String password;

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
	
	public AuthMeCheckPasswordEvent(Player player, String password) {
		
		this.player = player;
		this.password = password;
		
	}

	public Player getPlayer() {
		return player;
	}

	public String getPassword() {
		return password;
	}

}
