package jpu2016.dogfight.model;


import java.awt.*;
import java.util.*;

public class Sky implements IArea{
	
	private Dimension dimension;
	
	
	
	public Sky (Dimension dimension) {
		this.dimension=new Dimension(dimension);
	}
	
	public Dimension getDimension() {
		return this.dimension;
	}
	
	public void setDimension(Dimension dimension) {
		this.dimension=dimension;
	}
	
	public Image getImage() {
		return this.image;
	}
	
	public void setImage(Image image) {
		this.image= image;
	}
	
	
}
