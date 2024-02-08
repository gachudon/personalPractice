package pack_0208;

import java.util.ArrayList;
import java.util.List;

public class Training_12_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Point>pl = new ArrayList<Point>();
		pl.add(new Point(2,3));
		pl.add(new Point(3,4));
		pl.add(new Point(1,-6));
		
		for(int i=0;i<pl.size();i++)
			System.out.println(pl.get(i));
//		for(Point p : pl)
//			System.out.println(p);
	}

}
