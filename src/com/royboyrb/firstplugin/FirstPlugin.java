package com.royboyrb.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

import com.royboyrb.firstplugin.commands.Hello;
import com.royboyrb.firstplugin.commands.RandomLocation;

public class FirstPlugin extends JavaPlugin {

	//private Logger myLog = Bukkit.getLogger();
	
	@Override
	public void onEnable(){
		getLogger().info("FirstPlugin is Enabled!");
		
		getCommand("teleportrandom").setExecutor(new RandomLocation());
		getCommand("hello").setExecutor(new Hello());
	}
	
	@Override
	public void onDisable(){
		getLogger().info("FirstPlugin is disabled!");
	}

	/* /teleport iemand iemand				 jij		teleport->tp-(/)teleport		iemand, iemand
	public boolean onCommand(CommandSender theSender, Command cmd, String commandLabel, String[] args)
														does things with the commands
																	the command itself
																						the things after the command*/

}