package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		IGraphicsBuilder graphicBuilder = new IGraphicsBuilder();
	}
	public update(Observable observable) {
		
	}
	public void paintComponent(Graphics graphic) {
		
	}
}
