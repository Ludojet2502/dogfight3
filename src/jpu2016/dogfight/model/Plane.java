package jpu2016.dogfight.model;

public class Plane extends Mobile{
	
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	private Direction direction;
	private Position position;
	private String image;
	
	public Plane(int player,Direction direction, Position position, String image) {
		super();
		this.player=player;
		this.direction=direction;
		this.position=position;
		this.image=image;
		
		
	}
	
	public boolean isPlayer(int player) {
		return false;
		
	}

	public boolean hit() {
		return false;
		
	}
	
	
}
