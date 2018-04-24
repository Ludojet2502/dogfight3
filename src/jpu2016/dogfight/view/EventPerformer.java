package jpu2016.dogfight.view;
import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.*;
import jpu2016.dogfight.model.*;
import jpu2016.gameframe.IEventPerformer;


public class EventPerformer implements IEventPerformer {
	protected DogfightView dogfightview;
	private UserOrder userOrder;
	
	protected IOrderPerformer orderPerformer;
	
	public IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}
	
	public void setOrderPerformer( IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		
	}
	
	public void eventPerform(KeyEvent keyCode) {
		
	}
	private UserOrder keyCodeToUserOrder(int keyCode) {
		//UserOrder userOrder = new UserOrder(1, null);
		return new UserOrder(keyCode, null);
	}
}
