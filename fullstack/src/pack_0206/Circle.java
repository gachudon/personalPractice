package pack_0206;

import java.lang.Math;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		radius = 1.0f;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return Math.PI*2*radius;
	}
	
	public String toString() {
		return "Circle["+super.toString()+", radius="+radius+"]";
	}
	
}