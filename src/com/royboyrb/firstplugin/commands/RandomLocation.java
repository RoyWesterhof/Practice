package com.royboyrb.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.robinmc.utils.Random;

public class RandomLocation implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender instanceof Player)
		{
			Player player = (Player) sender;
			
			double randomX = Random.getRandomInteger(1000, 5000);
			double randomZ = Random.getRandomInteger(1000, 5000);
			
			Location location = new Location(player.getWorld(), randomX, 0, randomZ);
			
			int y = player.getWorld().getHighestBlockAt(location).getY();
			location.setY(y);
			
			player.teleport(location);
			
			player.sendMessage("You where teleported to X: " + randomX + "Y: " + y + "Z: " + randomZ);
		} else 
		{
			sender.sendMessage(ChatColor.RED + "This command is only for players!");
		}			
		
		return true;
	}

}
