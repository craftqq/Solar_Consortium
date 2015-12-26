package io.github.craftqq.buildings;

public abstract class Building 
{
	protected int costSpace;
	protected int costLand;
	protected int costIron;
	protected int costTitan;
	protected int costCredits;
	
	public Building() 
	{
		costSpace = 0;
		costLand = 0;
		costIron = 0;
		costTitan = 0;
		costCredits = 0;
	}

	public Building(int costSpace, int costLand, int costIron, int costTitan, int costCredits) 
	{
		this.costSpace = costSpace;
		this.costLand = costLand;
		this.costIron = costIron;
		this.costTitan = costTitan;
		this.costCredits = costCredits;
	}

	public int getCostSpace() 
	{
		return costSpace;
	}

	public int getCostLand() 
	{
		return costLand;
	}

	public int getCostIron() 
	{
		return costIron;
	}

	public int getCostTitan() 
	{
		return costTitan;
	}

	public int getCostCredits() 
	{
		return costCredits;
	}
	
	public abstract BuildingActive getActiveCorrespond();
}
