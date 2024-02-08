package pack_0202;

import java.lang.Math;

public class Circle {
	private double radius;
	
	public Circle() {
		radius = 1.0f;
	}
	
	public Circle(double radius) {
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
	
	public double getCircumference() {
		return Math.PI*radius*2;
	}
	
	public String toString() {
		return "Circle[radius="+radius+"]";
	}
}
