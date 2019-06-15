package de.david.test.cmds;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.david.test.data.Data;
import de.david.test.utils.ArrayUtils;

public class Vanish implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if(cs instanceof Player) {
			Player p = (Player) cs;
			if(p.hasPermission("test.vanish") || p.hasPermission("test.*")) {
				for(Player all : Bukkit.getOnlinePlayers()) {
					if(ArrayUtils.isVanish.contains(p)) {
						all.showPlayer(p);
						if(!(p.getGameMode() == GameMode.CREATIVE)) {
							p.setAllowFlight(false);
						}
						p.sendMessage(Data.prefix + "Du bist nun nicht mehr im Vanish!");
						ArrayUtils.isVanish.remove(p);
					} else if(!ArrayUtils.isVanish.contains(p)) {
						all.hidePlayer(p);
						p.setAllowFlight(true);
						p.sendMessage(Data.prefix + "Du bist nun im Vanish!");
						ArrayUtils.isVanish.add(p);
					}
				}
			} else {
				p.sendMessage(Data.noperm);
			}
		} else {
			cs.sendMessage(Data.noplay);
		}
		return false;
	}
	
	
	
}
