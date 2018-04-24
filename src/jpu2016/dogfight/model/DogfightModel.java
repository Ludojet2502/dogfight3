package jpu2016.dogfight.model;

public class DogfightModel extends Observable {
	
	public DogfightModel() {
		
	}
	
	public IArea getArea() {
		return iArea;
	}

	public void buildArea (Dimension dimension) {
		
	}
	
	public void addMobile(IMObile Mobile) {
		
	}
	
	public void removeMobile(IMObile Mobile) {
		
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
