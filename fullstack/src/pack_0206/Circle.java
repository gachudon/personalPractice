package pack_0206;

import java.lang.Math;


//class Circle implements Drawable{
// 	public void draw(){
// 		System.out.println("원을 그리다");
// 	}
//}



//public class Circle implements GeometricObject{
//	protected double radius;
//	
//	public Circle() {
//		radius = 1.0;
//	}
//	
//	public Circle(double radius) {
//		this.radius = radius;
//	}
//	
//	public double getRadius() {
//		return radius;
//	}
//
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}
//
//	@Override
//	public double getPerimeter() {
//		// TODO Auto-generated method stub
//		return radius*2*Math.PI;
//	}
//
//	@Override
//	public double getArea() {
//		// TODO Auto-generated method stub
//		return radius*radius*Math.PI;
//	}
//	
//	public String toString() {
//		return "Circle[radius="+radius+"]";
//	}
//}
 

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
