package com.dungnv.designpattern.bridge;

public class AdvanceRemote extends BasicRemote {

	public AdvanceRemote(Device dev) {
		super.device = dev;
	}
	
	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}
