
import javax.swing.JPanel;


public class RotatingLine {
	private double r;
	private double theta;
	public RotatingLine(JPanel a){
		r = Math.sqrt(a.getHeight() * a.getHeight() + 
				a.getWidth() * a.getWidth());
		theta = 0;
	}
	public RotatingLine(float theta, JPanel a){
		r = Math.sqrt(a.getHeight() * a.getHeight() + 
				a.getWidth() * a.getWidth());
		this.theta = Math.round(theta * 10) / 10.0;
	}
	public void rotateCountClock(){
		if(theta == 359.9)
			theta = 0;
		else theta += 0.1;
	}
	public void rotateClock(){
		if(theta == 0)
			theta = 359.9;
		else theta -= 0.1;
	}
	public int getX1(){
		return (int)(0.5 * r * Math.cos(theta));
	}
	public int getY1(){
		return (int)(0.5 * r * Math.sin(theta));
	}
	public int getX2(){
		if(theta < 180)
			return (int)(0.5 * r * Math.cos(theta + 180));
		return (int)(0.5 * r * Math.cos(theta - 180));
	}
	public int getY2(){
		if(theta < 180)
			return (int)(0.5 * r * Math.sin(theta + 180));
		return (int)(0.5 * r * Math.sin(theta - 180));
	}
	public double getR() {
		return r;
	}
	public double getTheta() {
		return theta;
	}
	
	
}
