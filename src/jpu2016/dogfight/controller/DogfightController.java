package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.*;

public class DogfightController implements IOrderPerformer {
	private static int TIME_SLEEP = 30;
	private IDogfightModel dogfightModel;
	private IViewSystem viewSystem; 
	
	public DogfightController(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	public void orderPerform(UserOrder userOrder) {
		
	}
	
	public void play() {
		
	}
	
	public void setViewSystem( IViewSystem viewSystem) {
		
	}
	
	private void launchMissile( int player) {
		
	}
	
	private void gameLoop() {
		
	}
	
}
