package pack_0206;

import pack_0202.Circle;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public void resize(int percent) {
		// TODO Auto-generated method stub
		super.setRadius(super.getRadius()*(double)percent/100);
	}
	
	public String toString() {
		return "ResizableCircle["+super.toString()+"]";
	}

}
