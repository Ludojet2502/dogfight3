package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
	private int player;
	private Order order;

	
	
	public UserOrder ( int player, Order order) {
		this.order = order;
	}
	
	public Order getOrder() {
		return this.order;
		 
	}
	
	public int getPlayer() {
		return this.player;
	}
	
	public void setOrder(Order order) {
		this.order = order;
		order.setUserOrder(this);
	}
}
