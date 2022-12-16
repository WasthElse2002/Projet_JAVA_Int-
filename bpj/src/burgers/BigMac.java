package bpj.src.burgers;

import bpj.src.Burger;
import bpj.src.Salad;
import bpj.src.Sauce;

public class BigMac extends Burger {

	public BigMac() {
		super(Sauce.BIG_MAC);
		super.addSteak();
		super.addSalad(Salad.SCAROL);
	}
}
