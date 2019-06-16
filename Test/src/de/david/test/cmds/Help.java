package de.david.test.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if(cs instanceof Player) {
			Player p = (Player) cs;
			if(!p.hasPermission("test.help")) {
				p.sendMessage("Für hilfe gehe auf den BadGames Discord!");
			}
		}
		
		return false;
	}
	
	
	
}
