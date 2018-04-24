package jpu2016.dogfight.model;

public class Mobile implements IMobile{
	
	private int speed ;
	private Dimension width;
	private Dimension height;
	private Position x;
	private Position y;
	private Position maxX;
	private Position maxY;
	private Direction UP;
	private Direction Right;
	private Direction Down;
	private Direction Left;
	
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.direction= direction;
		this.position= position;
		this.dimension=dimension;
		this.speed=speed;
		this.image=image;
		
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public Dimension getDimension() {
		return dimension;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void move() {
		
	}
	
	public void placeInArea(Area area) {
		
	}
	
	public boolean isPlayer(int player) {
		
	}
	
	private void moveUp() {
		
	}
	
	private void moveRight() {
			
	}
	
	private void moveDown() {
		
	}
	
	private void moveLeft() {
		
	}
	
	public Color getColor() {
		return color;
	}
	
	public IDogfightModel getDogfightModel() {
		return dogfightModel;
	}
	
	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	public boolean hit() {
		
	}
	
	public boolean isWeapon() {
		
	}
	
	public Image getImage() {
		return image;
	}

	@Override
	public Direction setDirection(Direction direction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}
	
	

}
