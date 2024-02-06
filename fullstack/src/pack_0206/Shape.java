package pack_0206;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape(){
		color = "red";
		filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String toString() {
		return "Shape[color="+ color + ", filled=" + filled +"]";
	}
}
