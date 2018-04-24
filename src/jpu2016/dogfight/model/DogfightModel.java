package jpu2016.dogfight.model;
import jpu2016.dogfight.controller.*;
import jpu2016.dogfight.view.*;

import java.util.ArrayList;
import java.util.*;

public class DogfightModel extends Observable implements IDogfightModel{
	
	private ArrayList<IMobile> mobiles;		
	
	public DogfightModel() {
		
	}
	
	public ArrayList<IMobile> getMobiless() {		
		return mobiles;
	}

	public void setMobiless(ArrayList<IMobile> mobiless) {		
		this.mobiles =mobiles;
	}

	public IArea getArea() {
		return this.iArea;
	}

	public void buildArea (Dimension dimension) {
		
	}
	
	public void addMobile(IMobile Mobile) {
		
	}
	
	public void removeMobile(IMobile Mobile) {
		
	}
	
	public ArrayList<IMobile> getMobiles(){
		return mobiles;
	}
	
	public IMobile getMobileByPlayer(int player) {
		return this.mobileByPlayer;
	}
	
	public void setMobilesHavesMoved() {
		this.mobilesHavesMoved = mobilesHavesMoved;
	}
	
}
