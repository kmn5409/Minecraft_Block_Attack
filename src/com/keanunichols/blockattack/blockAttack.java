package com.keanunichols.blockattack;

import org.bukkit.plugin.java.JavaPlugin;

public class blockAttack extends JavaPlugin {
	
	
	public void onEnable() {
    	getServer().getPluginManager().registerEvents(new blockListener(), this);    	
    }

}
