package ru.witwar.apm.apimaster.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AuthMeForceRegisterEvent extends Event implements Cancellable {

	private boolean isCancelled = false;
	private Player player;
	private String password;
	private boolean autologin;

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
	
	public AuthMeForceRegisterEvent(Player player, String password, boolean AutoLogin) {
		
		this.player = player;
		this.password = password;
		this.setAutologin(AutoLogin);
		
	}

	public Player getPlayer() {
		return player;
	}

	public String getPassword() {
		return password;
	}

	public boolean isAutologin() {
		return autologin;
	}

	public void setAutologin(boolean autologin) {
		this.autologin = autologin;
	}

}
