package de.david.test.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.david.test.data.Data;

public class Fun implements CommandExecutor {
	
	public void todo(String txt, Player p, boolean done) {
		if(done) {
			p.sendMessage("§5- §e" + txt + " §a✔");
		} else {
			p.sendMessage("§5- §e" + txt + " §c✖");
		}
	}
	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if(cs instanceof Player) {
			Player p = (Player) cs;
			if(p.getName().equalsIgnoreCase("NebelVBuck")||p.getName().equalsIgnoreCase("davidjordan2006")||p.getName().equalsIgnoreCase("VBuckAdmin")) {
				p.sendMessage(Data.prefix + " §lTODOS§7: ");
				todo("Fly-Command coden", p, true);
				todo("NebelClient zu ende coden", p, false);
				todo("RaidLive zu ende coden", p, false);
				todo("Mehr Java lernen", p, false);
				todo("Für BadGames SW coden", p, false);
				todo("Neuen Minecraft-Client coden", p, false);
				todo("Für den Client einen Namen ausdenken", p, false);
			} else {
				p.sendMessage(Data.prefix + " Spaß!!!");
				todo("Spaß §ehaben", p, true);
			}
		} else {
			cs.sendMessage(Data.noplay);
		}
		
		return false;
	}

}
