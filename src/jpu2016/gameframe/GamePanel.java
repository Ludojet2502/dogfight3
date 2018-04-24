package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		//IGraphicsBuilder graphicBuilder = new IGraphicsBuilder();
	}
	public void update(Observable observable) {
		return;
	}
	public void paintComponent(Graphics graphic) {
		
	}
	
	private Observable observable() {
		return new Observable();
	}
	
	private IGraphicsBuilder graphicsBuilder;
	
	public IGraphicsBuilder getIGraphicsBuilder() {
		return graphicsBuilder;
	}
	
	public void setIGraphicsBuilder(IGraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
