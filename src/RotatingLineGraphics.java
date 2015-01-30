import java.awt.Graphics;
import java.awt.Color;



import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RotatingLineGraphics extends JComponent{
	private double waitTime;
	private double x1; private double x2; private double y1; private double y2;
	
	public RotatingLineGraphics(double speed, double x1, double x2, double y1, double y2) {
		this.waitTime = speed; this.x1 = x1; this.x2 = x2; 
		this.y1 = y1; this.y2 = y2;
	}
	
	public void paintComponenet(Graphics g) {
		int width = getWidth(); int height = getHeight();
	}
	
	private static void draw() {
		JFrame application = new JFrame();
		
		
	}
	
	
}
