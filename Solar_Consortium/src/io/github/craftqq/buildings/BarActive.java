package io.github.craftqq.buildings;

import io.github.craftqq.game.Player;
import io.github.craftqq.game.Turn;

public class BarActive extends BuildingActive 
{

	public BarActive(Player owner) 
	{
		super(50, 50, 1, 0, owner);
	}

	@Override
	public void turnAction(Turn turn) 
	{
		owner.changeCredits(150 + (int) (150*Math.random()) );
	}

}
