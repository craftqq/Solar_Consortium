package io.github.craftqq.game;

public class Player 
{
	public static Player NONE = new Player(0,0,0,0,"NONE",-1);
	
	protected int credits;
	protected int iron;
	protected int titan;
	protected int influence;
	protected String name;
	protected int playerNumber;
	
	public Player(int credits, int iron, int titan, int influence, String name, int playerNumber) 
	{
		this.credits = credits;
		this.iron = iron;
		this.titan = titan;
		this.influence = influence;
		this.name = name;
		this.playerNumber = playerNumber;
	}

	public int getCredits() 
	{
		return credits;
	}
	
	public void changeCredits(int amount)
	{
		credits += amount;	
	}
	
	public int getIron() 
	{
		return iron;
	}
	
	public void changeIron(int amount)
	{
		iron += amount;
	}
	
	public int getTitan() 
	{
		return titan;
	}
	
	public void changeTitan(int amount)
	{
		titan += amount;
	}
	
	public int getInfluence() 
	{
		return influence;
	}
	
	public void changeInfluence(int amount)
	{
		influence += amount;
	}
	
	public String getName() 
	{
		return name;
	}

	public int getPlayerNumber() 
	{
		return playerNumber;
	}
	
	
}
