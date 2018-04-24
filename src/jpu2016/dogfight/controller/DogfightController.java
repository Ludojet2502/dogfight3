package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.*;

public class DogfightController implements IOrderPerformer {
	private static int TIME_SLEEP = 30;
	private IDogfightModel dogfightModel;
	private IViewSystem viewSystem;
	private Missile missile;
	
	public IViewSystem getIViewSystem() {
		return viewSystem;
	}
	
	
	public DogfightController(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	public IDogfightModel getIDogFightModel() {
		return dogfightModel;
	}
	
	public void setIDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	public void orderPerform(UserOrder userOrder) {
		
	}
	
	public void play() {
		
	}
	
	public void setViewSystem( IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
	
	private void launchMissile( int player) {
		Missile missile = new Missile(null, null);
	}
	
	private void gameLoop() {
		
	}
	
	
	
	
}
