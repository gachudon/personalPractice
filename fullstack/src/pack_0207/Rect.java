package pack_0207;

public class Rect {
	int width;
	int height;
	Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object rect) {
		if(rect instanceof Rect) {
			Rect r = (Rect)rect;
			if(width*height == r.width*r.height)
				return true;
			else
				return false;
		}
		return false;
	}
}
