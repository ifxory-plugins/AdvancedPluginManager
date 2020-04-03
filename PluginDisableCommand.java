package ru.witwar.advancedpluginmanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class PluginDisableCommand implements CommandExecutor {

	public PluginDisableCommand(AdvancedPluginManager advancedPluginManager) {
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!sender.hasPermission("advancedpluginmanager.plugins.off")) {
			sender.sendMessage(ChatColor.RED + "You don't have needed permissions to perform this command.");
			return true;
		}
		if(args.length == 0) {
			sender.sendMessage(ChatColor.RED + "Syntax error. Cannot perform this with 'Null'.");
			return true;
		}
		if(Bukkit.getPluginManager().getPlugin(args[0]) == null) {
			sender.sendMessage(ChatColor.RED + "Logic error. Cannot perform this with " + args[0] + ". 'NullPointerException'");
			return true;
		}
		if(!Bukkit.getPluginManager().isPluginEnabled(args[0])) {
			sender.sendMessage(ChatColor.RED + "Logic error. Cannot perform this with disabled plugin.");
			return true;
		}
		Plugin plugin = Bukkit.getPluginManager().getPlugin(args[0]);
		Bukkit.getPluginManager().disablePlugin(plugin);
		return true;
	}

}
