package de.david.test.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.david.test.utils.ArrayUtils;

public class GameMode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if(cs instanceof Player) {
			Player p = (Player) cs;
			if(!ArrayUtils.isGameMode.contains(p)) {
				p.setGameMode(org.bukkit.GameMode.CREATIVE);
				ArrayUtils.isGameMode.add(p);
			} else {
				p.setGameMode(org.bukkit.GameMode.SURVIVAL);
				ArrayUtils.isGameMode.remove(p);
			}
		}
		
		return false;
	}
	
	
	
}
