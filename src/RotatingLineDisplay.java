import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class RotatingLineDisplay extends JPanel{
	private RotatingLine rotatingLine;
	private boolean rotatingClockwise;
	public RotatingLineDisplay(){
		super();
		rotatingLine = new RotatingLine(this);
		rotatingClockwise = true;
	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		g2.drawLine(rotatingLine.getX1(), rotatingLine.getY1(),
				rotatingLine.getX2(), rotatingLine.getY2());
		if(rotatingClockwise)
			rotatingLine.rotateClock();
		else rotatingLine.rotateCountClock();
	}
}
