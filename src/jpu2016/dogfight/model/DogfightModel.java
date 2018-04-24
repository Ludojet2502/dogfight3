package jpu2016.dogfight.model;

import java.util.ArrayList;

public class DogfightModel extends Observable implements IADogfightModel{
	
	//private ArrayList<IMobile> mobiless;		
	
	public DogfightModel() {
		
	}
	
	//public ArrayList<IMobile> getMobiless() {		
		//return mobiless;
	//}

	//public void setMobiless(ArrayList<IMobile> mobiless) {		
	//	this.mobiless = mobiless;
	//}

	public IArea getArea() {
		return iArea;
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
		return mobileByPlayer;
	}
	
	public void setMobilesHavesMoved() {
		this.mobilesHavesMoved = mobilesHavesMoved;
	}
	
}
