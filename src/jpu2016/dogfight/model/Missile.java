package jpu2016.dogfight.model;

public class Missile extends Mobile{
	
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Dimension dimension) {
		this.direction=direction;
		this.dimension=dimension;
		
	}
	
	public static int getWidthWithADirection (Direction direction) {
		return widthWithADirection;
	}
	
	public static int getHeightWithADirection (Direction direction) {
		return heightWithADirection;
	}
	
	public void move() {
		
	}
	
	public boolean isWeapon() {
		
	}

}
