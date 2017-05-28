package com.redfrench;

public class PC {
	
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	
	public void powerUp() {
		theCase.pressPwrBtn();
		drawLogo();
		loadProgram();
	}


	private void drawLogo() {
		monitor.drawPixelAt(1500, 1200, "red");
	}
	
	private void loadProgram() {
		motherboard.loadProgram("Windows 1.0");
	}
	
}
