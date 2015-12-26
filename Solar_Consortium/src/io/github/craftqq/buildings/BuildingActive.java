package io.github.craftqq.buildings;

import io.github.craftqq.game.Player;
import io.github.craftqq.game.Turn;

public abstract class BuildingActive 
{
	protected int health;
	protected int healthMax;
	protected int space;
	protected int armor;
	protected Player owner;
	
	public BuildingActive() 
	{
		health = 0;
		healthMax = 0;
		space = 0;
		armor = 0;
		owner = Player.NONE;
	}
	
	public BuildingActive(int health, int healthMax, int space, int armor, Player owner) 
	{
		this.health = health;
		this.healthMax = healthMax;
		this.space = space;
		this.armor = armor;
		this.owner = owner;
	}
	
	public int getHealth() 
	{
		return health;
	}
	
	public void changeHealth(int amount)
	{	
		health += amount;
	}
	
	public int getHealthMax() 
	{
		return healthMax;
	}
	
	public int getSpace() 
	{
		return space;
	}
	
	public int getArmor() 
	{
		return armor;
	}
	
	public abstract void turnAction(Turn turn);
}
