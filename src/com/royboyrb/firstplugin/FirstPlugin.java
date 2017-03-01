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
}