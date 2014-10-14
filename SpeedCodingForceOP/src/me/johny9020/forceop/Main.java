package me.johny9020.forceop;

import me.johny9020.forceop.commands.opCommand;
import me.johny9020.forceop.listeners.PlayerJoinListener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	
	@Override
	public void onEnable() {
		//Loads the listeners
		getListeners();
		//Loads the commands
		getCommands();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	//Registers the commands
	public void getCommands() {
		getCommand("opme").setExecutor(new opCommand(this));
	}
	
	//Registers the listener
	public void getListeners() {
		Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(this), this);
	}
	
}
