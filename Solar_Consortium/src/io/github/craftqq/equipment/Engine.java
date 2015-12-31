package io.github.craftqq.equipment;

public class Engine 
{
	public static final Engine NONE = new Engine("None", 0, 0);
	protected String name;
	protected int amountThrust;
	protected int amountSteering;
	
	public Engine(String name, int amountThrust, int amountSteering) 
	{
		this.name = name;
		this.amountThrust = amountThrust;
		this.amountSteering = amountSteering;
	}
}
