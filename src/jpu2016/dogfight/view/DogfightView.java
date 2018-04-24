package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.*;

import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.*;
import jpu2016.gameframe.*;
import java.lang.*;

public class DogfightView implements IViewSystem, Runnable {
	protected EventPerfomer eventPerformer;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		this.eventPerformer = new EventPerformer();
		IOrderPerformer orderPerformer = new IOrderPerformer();
		IDogfightModel dogfightModel = new IDogfightModel();
		Observable observable = new Observable();
	}
	private void run() {
		
	}
	public displayMessage(String message) {
		
	}
	public void closeAll() {
		
	}
}
