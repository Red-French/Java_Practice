package com.redfrench;

public class Toner {

	private int level = 100;

	
	public int getLevel() {
		return level;
	}

	public void userToner(int tonerUsed) {
		this.level = this.level - tonerUsed;
	}
	
	public void fillToner() {
		this.level = 100;
	}

	
}
