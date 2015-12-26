package io.github.craftqq.buildings;

import io.github.craftqq.game.Player;

public class Bar extends Building 
{

	public Bar() {
		super(1, 4, 200, 100, 3000);
	}

	@Override
	public BuildingActive createActiveBuilding(Player p) 
	{
		return new BarActive(p);
	}

}
