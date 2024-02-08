package pack_0206;

/*
 * class Rectangle implements Drawable{
 * 	public void draw(){
 * 		System.out.println("사각형을 그리다");
 * 	}
 * }
 * */

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		width = 1.0f;
		length = 1.0f;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color,filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public String toString() {
		return "Rectangle["+super.toString()+",width="+width+", length="+length+"]";
	}
}
