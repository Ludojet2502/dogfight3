package jpu2016.gameframe;

public class GameFrame {
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
}
