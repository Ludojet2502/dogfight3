package jpu2016.dogfight.model;

public class Plane extends Mobile{
	
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	
	
	public Plane(int player,Direction direction, Position position, String image) {
		this.player=player;
		this.direction=direction;
		this.position=position;
		this.image=image;
		
	}
	
	public boolean isPlayer(int player) {
		
	}

	public boolean hit() {
		
	}
	
	
}