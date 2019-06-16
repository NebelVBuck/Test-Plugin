package de.david.test.cmds;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.david.test.data.Data;

public class Gamemode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if(cs instanceof Player) {
			Player p = (Player) cs;
			if(args.length == 0) {
				p.sendMessage(Data.prefix + " §cZu wenig Argumente! Benutze /gm <0-3> <Spieler>");
			} else if(args.length == 1) {
				if(args[0].equalsIgnoreCase("0")) {
					p.sendMessage(Data.prefix + " Du bist nun im Survival Modus!");
					p.setGameMode(GameMode.SURVIVAL);
				}
				if(args[0].equalsIgnoreCase("1")) {
					p.sendMessage(Data.prefix + " Du bist nun im Creative Modus!");
					p.setGameMode(GameMode.CREATIVE);
				}
				if(args[0].equalsIgnoreCase("2")) {
					p.sendMessage(Data.prefix + " Du bist nun im Adventure Modus!");
					p.setGameMode(GameMode.ADVENTURE);
				}
				if(args[0].equalsIgnoreCase("3")) {
					p.sendMessage(Data.prefix + " Du bist nun im Spectator Modus!");
					p.setGameMode(GameMode.SPECTATOR);
				}
			} else {
				p.sendMessage(Data.prefix + " §cZu viele Argumente!");
			}
		}
		
		return false;
	}
	
	
	
}
