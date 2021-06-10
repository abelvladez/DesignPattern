package com.dungnv.designpattern.bridge;

public class BasicRemote implements Remote {

	protected Device device;
	
	public BasicRemote() {};
	
	
	public BasicRemote(Device dev) {
		this.device = dev;
	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("Remote: toggle power");
		if(device.isEnabled()) {
			device.disable();
		}
		else {
			device.enable();
		}
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Remote: Decrease volume");
		device.setVolume(device.getVolume() - 10);
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Remote: Increase volume");
		device.setVolume(device.getVolume() + 10);
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("Remote: Channel Down");
		device.setChannel(device.getChannel() - 1);
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("Remote: Channel Up");
		device.setChannel(device.getChannel() + 1);
	}

}
