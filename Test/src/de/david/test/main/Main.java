package de.david.test.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.david.test.cmds.Fly;
import de.david.test.cmds.Fun;
import de.david.test.cmds.GameMode;
import de.david.test.cmds.Ping;
import de.david.test.cmds.Vanish;

public class Main extends JavaPlugin {
	
	public void print(String txt) {
		System.out.println(txt);
	}
	
	@Override
	public void onEnable(){
		print("------{Loaded Test}------");
		print(">     Loaded Vanish     <");
		print(">     Loaded GM         <");
		print(">     Loaded Fun        <");
		print(">                       <");
		print(">                       <");
		print(">                       <");
		print("------{Loaded Test}------");
		getCommand("v").setExecutor(new Vanish());
		getCommand("gm").setExecutor(new GameMode());
		getCommand("fun").setExecutor(new Fun());
		getCommand("ping").setExecutor(new Ping());
		getCommand("fly").setExecutor(new Fly());
	}
	
}
