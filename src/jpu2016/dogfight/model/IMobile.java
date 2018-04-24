package jpu2016.dogfight.model;

public interface IMobile {
	
	private DogfightModel dogfightModel;
	
	public DogfightModel getDogfightModel() {
		return dogfightModel;
	}
	
	
	
	
	public Direction getDirection() {
		return direction;
	}
	
	public Direction setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Point getPosition() {
		return position;
	}

	public Dimension getDimension() {
		return dimension;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public Image getImage() {
		return image;
	}
	
	public void move() {
		
	}
	
	public void placeInArea(IArea area) {
		
	}
	
	public boolean isPlayer(int player) {
		
	}
	
	public void setDogfightModel(DogfightModel dogfightModel) {
		this.dogfightModel=dogfightModel;
	}
	
	public boolean hit() {
		
	}
	
	public boolean isWeapon() {
		
	}
	
	
	
	
	
	
}
