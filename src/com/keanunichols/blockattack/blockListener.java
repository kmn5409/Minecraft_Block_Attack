package com.keanunichols.blockattack;

import java.util.Random;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class blockListener implements Listener{
	
	private int blocks;
	
	public blockListener() {
		this.blocks = 0;
	}
	
	public boolean getRandomBoolean() {
	    Random random = new Random();
	    return random.nextBoolean();
	}
	
	@EventHandler
	public void onEntityDeath(BlockPlaceEvent event){
		//Just need to check maybe every 4 or 3 blocks and do a randomly boolean, take down 3 heats or 4
		//int random_number;
		if(getRandomBoolean()){
			Player plr = event.getPlayer();
			if(plr instanceof LivingEntity){
					//event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), 1, true, true, event.getEntity());
				blocks+=1;
				if(blocks%2 == 0){
					plr.damage(6);
				}
				//plr.sendMessage(blocks + "");
				//random_number = getRandomNumber(1,10);
				//event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), random_number, true, true, event.getEntity());
			}
		}
	}

}
