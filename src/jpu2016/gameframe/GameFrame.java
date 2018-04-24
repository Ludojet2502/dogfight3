package jpu2016.gameframe;

import jpu2016.dogfight.view.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;


public class GameFrame extends JFrame implements KeyListener{
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		this.title = title;
		IEventPerformer performer = new IEventPerformer();
		IGraphicsBuilder graphicBuilder = new IGraphicsBuilder();
		Observable observable = new Observable();
	}
	public void keyPressed(KeyEvent keyEvent) {
		
	}
	public void keyReleased(KeyEvent keyEvent) {
		
	}
	public void keyTyped(KeyEvent keyEvent) {
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
