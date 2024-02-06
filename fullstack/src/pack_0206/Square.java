package pack_0206;

public class Square extends Rectangle{
	public Square() {
		
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(String color, boolean filled, double side) {
		super(color,filled,side,side);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public String toString() {
		return"Square["+super.toString()+"]";
	}
}
