package de.david.test.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.david.test.cmds.*;

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
		getCommand("gm").setExecutor(new Gamemode());
		getCommand("fun").setExecutor(new Fun());
		getCommand("ping").setExecutor(new Ping());
		getCommand("fly").setExecutor(new Fly());
	}
	
}
