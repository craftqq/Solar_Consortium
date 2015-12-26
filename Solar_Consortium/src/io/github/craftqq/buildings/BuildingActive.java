package io.github.craftqq.buildings;

import io.github.craftqq.game.Turn;

public abstract class BuildingActive 
{
	protected int health;
	protected int healthMax;
	protected int space;
	protected int armor;
	
	public BuildingActive() 
	{
		health = 0;
		healthMax = 0;
		space = 0;
		armor = 0;
	}
	
	public BuildingActive(int health, int healthMax, int space, int armor) 
	{
		this.health = health;
		this.healthMax = healthMax;
		this.space = space;
		this.armor = armor;
	}
	
	public int getHealth() 
	{
		return health;
	}
	
	public void setHealth(int health)
	{	
		this.health = health;
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
