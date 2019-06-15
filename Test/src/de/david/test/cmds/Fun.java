package de.david.test.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.david.test.data.Data;

public class Fun implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if(cs instanceof Player) {
			Player p = (Player) cs;
			if(args.length == 0) {
				p.sendMessage(Data.prefix + " /fun <command>");
				p.sendMessage(Data.prefix + " -> /fun help");
			} else {
				if(args[0].equalsIgnoreCase("v")) {
					p.performCommand("v");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				if(args[0].equalsIgnoreCase("help")) {
					p.sendMessage(Data.prefix + " -> /fun v");
				}
			}
		}
		
		return false;
	}

}
