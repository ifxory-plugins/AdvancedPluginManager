package ru.witwar.apm.apimaster;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import fr.xephi.authme.api.v3.AuthMeApi;
import ru.witwar.apm.apimaster.events.AuthMeCheckPasswordEvent;
import ru.witwar.apm.apimaster.events.AuthMeForceRegisterEvent;
import ru.witwar.apm.apimaster.events.AuthMeForceUnregisterEvent;
import ru.witwar.apm.apimaster.events.ForceLoginEvent;
import ru.witwar.apm.apimaster.events.ForceLogoutEvent;

public class AuthMeAPI {
	
	public AuthMeApi getAuthMeApi() {
		return AuthMeApi.getInstance();
	}
	
	public void forceLogin(Player player) {
		Bukkit.getPluginManager().callEvent(new ForceLoginEvent(player));
		AuthMeApi.getInstance().forceLogin(player);
	}
	
	public void forceLogin(String playername) {
		Bukkit.getPluginManager().callEvent(new ForceLoginEvent(Bukkit.getPlayer(playername)));
		AuthMeApi.getInstance().forceLogin(Bukkit.getPlayer(playername));
	}
	
	public void forceLogout(Player player) {
		Bukkit.getPluginManager().callEvent(new ForceLogoutEvent(player));
		AuthMeApi.getInstance().forceLogout(player);
	}
	
	public void forceLogout(String playername) {
		Bukkit.getPluginManager().callEvent(new ForceLogoutEvent(Bukkit.getPlayer(playername)));
		AuthMeApi.getInstance().forceLogout(Bukkit.getPlayer(playername));
	}
	
	public void forceRegister(Player player, String password, boolean AutoLogin) {
		Bukkit.getPluginManager().callEvent(new AuthMeForceRegisterEvent(player, password, AutoLogin));
		AuthMeApi.getInstance().forceRegister(player, password, AutoLogin);
	}
	
	public void forceRegister(String player, String password, boolean AutoLogin) {
		Bukkit.getPluginManager().callEvent(new AuthMeForceRegisterEvent(Bukkit.getPlayer(player), password, AutoLogin));
		AuthMeApi.getInstance().forceRegister(Bukkit.getPlayer(player), password, AutoLogin);
	}
	
	public void forceUnregister(Player player) {
		Bukkit.getPluginManager().callEvent(new AuthMeForceUnregisterEvent(player));
		AuthMeApi.getInstance().forceUnregister(player);
	}
	
	public void forceUnregister(String player) {
		Bukkit.getPluginManager().callEvent(new AuthMeForceUnregisterEvent(Bukkit.getPlayer(player)));
		AuthMeApi.getInstance().forceUnregister(player);
	}
	
	public boolean checkPassword(Player player, String password) {
		Bukkit.getPluginManager().callEvent(new AuthMeCheckPasswordEvent(player, password));
		return AuthMeApi.getInstance().checkPassword(player.getName(), password);
	}
	
	public boolean checkPassword(String name, String password) {
		Bukkit.getPluginManager().callEvent(new AuthMeCheckPasswordEvent(Bukkit.getPlayer(name), password));
		return AuthMeApi.getInstance().checkPassword(name, password);
	}

}
