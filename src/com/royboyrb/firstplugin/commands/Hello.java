package com.royboyrb.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hello implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player)
		{
			Player thePlayer = (Player) sender;
				if (args.length == 0)
				{
					thePlayer.sendMessage(ChatColor.BLUE + "Well hello!");
					return true;
				} else if (args[0].equalsIgnoreCase("Sir"))
				{
					thePlayer.sendMessage(ChatColor.BLUE + "Well hello Sir!");
					return true;
				} else 
				{
					return false;
				}
		} else 
		{
			sender.sendMessage(ChatColor.RED + "This command is only for players!");
			return true;
		}
	}

}
