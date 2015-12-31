package io.github.craftqq.spaceships;

public class Spaceship 
{
	protected String name;
	protected int spaceInterior;
	protected int amountGuns;
	protected int healthBasis;
	protected int armorBasis;
	protected int costIron;
	protected int costTitan;
	protected int weightBasis;
	
	public Spaceship(String name, int spaceInterior, int amountGuns, int healthBasis, int armorBasis, int costIron, int costTitan, int weightBasis) 
	{
		this.name = name;
		this.spaceInterior = spaceInterior;
		this.amountGuns = amountGuns;
		this.healthBasis = healthBasis;
		this.armorBasis = armorBasis;
		this.costIron = costIron;
		this.costTitan = costTitan;
		this.weightBasis = weightBasis;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSpaceInterior() 
	{
		return spaceInterior;
	}
	
	public int getAmountGuns() 
	{
		return amountGuns;
	}
	
	public int getHealthBasis() 
	{
		return healthBasis;
	}
	
	public int getArmorBasis() 
	{
		return armorBasis;
	}
	
	public int getCostIron() 
	{
		return costIron;
	}
	
	public int getCostTitan() 
	{
		return costTitan;
	}
	
	public int getWeightBasis() 
	{
		return weightBasis;
	}
	
}
