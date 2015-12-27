package io.github.craftqq.spaceships;

import io.github.craftqq.equipment.EquipmentActive;
import io.github.craftqq.resources.Resource;
import io.github.craftqq.weapons.WeaponActive;

import java.util.ArrayList;

public class SpaceshipActive 
{
	protected int healthMax;
	protected int healthCurrent;
	protected int speedMovement;
	protected int speedTravel;
	protected int armor;
	protected WeaponActive[] weapons;
	protected EquipmentActive[] equipment;
	protected int spaceFreight;
	protected int spaceFreightOccupied;
	protected ArrayList<Resource> freight;
	
	public SpaceshipActive(int healthMax, int speedMovement, int speedTravel, int armor, WeaponActive[] weapons, EquipmentActive[] equipment, int spaceFreight)
	{
		this.healthMax = healthMax;
		this.healthCurrent = healthMax;
		this.speedMovement = speedMovement;
		this.speedTravel = speedTravel;
		this.armor = armor;
		this.weapons = weapons;
		this.equipment = equipment;
		this.spaceFreight = spaceFreight;
		this.spaceFreightOccupied = 0;
		this.freight = new ArrayList<Resource>();
	}

	public int getHealthCurrent() 
	{
		return healthCurrent;
	}

	public void setHealthCurrent(int healthCurrent) 
	{
		this.healthCurrent = healthCurrent;
	}

	public int getSpaceFreightOccupied() 
	{
		return spaceFreightOccupied;
	}

	public void setSpaceFreightOccupied(int spaceFreightOccupied) 
	{
		this.spaceFreightOccupied = spaceFreightOccupied;
	}

	public ArrayList<Resource> getFreight() 
	{
		return freight;
	}

	public void addFreight(Resource resource) 
	{
		freight.add(resource);
	}
	
	public void removeFreight(Resource resource)
	{
		freight.remove(resource);
	}

	public int getHealthMax() 
	{
		return healthMax;
	}

	public int getSpeedMovement() 
	{
		return speedMovement;
	}

	public int getSpeedTravel() 
	{
		return speedTravel;
	}

	public int getArmor() 
	{
		return armor;
	}

	public WeaponActive[] getWeapons() 
	{
		return weapons;
	}

	public EquipmentActive[] getEquipment() 
	{
		return equipment;
	}

	public int getSpaceFreight() 
	{
		return spaceFreight;
	}
	
	
}
