package de.david.test.cmds;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.david.test.data.Data;
import de.david.test.utils.ArrayUtils;

public class Fly implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if(cs instanceof Player) {
			Player p = (Player) cs;
				if(p.hasPermission("test.fly") || p.hasPermission("test.*")) {
					if(args.length == 0) {
						if(!ArrayUtils.isFlying.contains(p)) {
							p.setAllowFlight(true);
							p.sendMessage(Data.prefix + " Du kannst nun Fliegen!");
							ArrayUtils.isFlying.add(p);
						} else {
							p.setAllowFlight(false);
							p.sendMessage(Data.prefix + " Du kannst nun nicht mehr Fliegen!");
							ArrayUtils.isFlying.remove(p);
						}
					} else if(args.length == 1) {
						Player t = Bukkit.getPlayer(args[0]);
						if(t != null) {
							if(!ArrayUtils.isFlying.contains(t)) {
								t.setAllowFlight(true);
								p.sendMessage(Data.prefix + " Der Spieler " + t.getName() + " kann nun Fliegen!");
								ArrayUtils.isFlying.add(t);
							} else {
								Bukkit.getPlayer(args[0]).setAllowFlight(false);
								p.sendMessage(Data.prefix + " Der Spieler " + t.getName() + " kann nun nicht mehr Fliegen!");
								ArrayUtils.isFlying.remove(t);
							}
						} else {
							p.sendMessage(Data.prefix + " §cDer Spieler §6" + args[0] + " §cist nicht auf dem Server!");
						}
					} else {
						p.sendMessage(Data.prefix + "§c Zu viele Argumente!");
					}
				}
			} else {
				cs.sendMessage(Data.noplay);
			}
		return false;
	}
}
