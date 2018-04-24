package jpu2016.dogfight.controller;

public enum Order {
	UP,
	RIGHT,
	DOWN,
	LEFT,
	SHOOT,
	NOP;
	
	protected UserOrder userOrder;
	
	public UserOrder getUserOrder() {
		return userOrder;
	}
	
	public void setUserOrder(UserOrder userOrder) {
		this.userOrder = userOrder;
	}
}
