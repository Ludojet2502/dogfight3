package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

public abstract class GraphicsBuilder implements IGraphicsBuilder{
	private int width;
	private int height;
	public GraphicsBuilder(IDogfightModel dogfightModel) {
		//IDogfightModel dogfightModel = new IDogfightModel();
	}
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	private void buildEmptySky() {
		
	}
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	public int getGlobalWidth() {
		return width;
	}
	public int getGlobalHeight() {
		return height;
	}
}
