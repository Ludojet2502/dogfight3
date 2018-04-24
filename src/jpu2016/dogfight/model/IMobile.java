package jpu2016.dogfight.model;

import jpu2016.dogfight.controller.*;
import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.*;
import jpu2016.gameframe.*;


public interface IMobile {
	
	public Direction getDirection();
	
	public Direction setDirection(Direction direction);
	
	public Point getPosition();

	public Dimension getDimension();
	
	public int getWidth();
	
	public int getHeight();
	
	public int getSpeed();
	
	public Image getImage();
	
	public void move();
	
	public void placeInArea(IArea area);
	
	public boolean isPlayer(int player);
	
	public setDogfightModel(IDogfightModel dogfightModel);
	
	public boolean hit();
	
	public boolean isWeapon();
	
	
	
	
	
	
}
