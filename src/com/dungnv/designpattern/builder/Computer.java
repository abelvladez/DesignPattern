package com.dungnv.designpattern.builder;

public class Computer {

	private String hardDisk;
	private String RAM;
	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;

	private Computer(ComputerBuilder builder) {
		this.hardDisk = builder.hardDisk;
		this.RAM = builder.RAM;
		this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}

	public void setGraphicCardEnabled(boolean isGraphicCardEnabled) {
		this.isGraphicCardEnabled = isGraphicCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	public static class ComputerBuilder {
		private String hardDisk;
		private String RAM;
		private boolean isGraphicCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String hardDisk, String ram) {
			this.hardDisk = hardDisk;
			this.RAM = ram;
		}

		public ComputerBuilder setGraphicCardEnable(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled = isGraphicCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
