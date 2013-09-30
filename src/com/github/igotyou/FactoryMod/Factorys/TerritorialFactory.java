package com.github.igotyou.FactoryMod.Factorys;

import com.github.igotyou.FactoryMod.Factorys.BaseFactory.FactoryCategory;
import com.github.igotyou.FactoryMod.utility.Anchor;

public class TerritorialFactory extends ContinuousFactory {

	protected int currentProductionTime;

	public TerritorialFactory(Anchor anchor, String factoryType) {
		super(anchor, factoryType, FactoryCategory.TERRITORIAL);
		currentProductionTime = 0;
	}

	public TerritorialFactory(Anchor anchor, String factoryType, int currentEnergyTime) {
		super(anchor, factoryType, FactoryCategory.TERRITORIAL, currentEnergyTime);
		currentProductionTime = 0;
	}

	/*
	 * Updates the effects and players effected
	 */
	@Override
	public void updateSpecifics() {
	}
}