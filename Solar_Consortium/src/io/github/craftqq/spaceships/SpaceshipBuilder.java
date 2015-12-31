package io.github.craftqq.spaceships;

import io.github.craftqq.equipment.Engine;
import io.github.craftqq.equipment.Equipment;
import io.github.craftqq.weapons.Weapon;

import java.util.ArrayList;

public class SpaceshipBuilder 
{
	protected Spaceship base;
	protected Weapon[] weapons;
	protected ArrayList<Equipment> equipment;
	protected int spaceInterior;
	protected int SpaceInteriorOccupied;
	protected Engine engine;
	
	public SpaceshipBuilder(Spaceship base)
	{
		this.base = base;
		spaceInterior = base.getSpaceInterior();
		SpaceInteriorOccupied = 0;
		weapons = new Weapon[base.getAmountGuns()];
		equipment = new ArrayList<Equipment>();
		engine = Engine.NONE;
	}
}