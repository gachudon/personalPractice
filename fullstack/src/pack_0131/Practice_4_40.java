package pack_0131;

public class Practice_4_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 2;
		int height = 3;
		int area = 0;
		
		while(true) {
			area = width*height/2;
			
			if(area > 150)
				break;
			
			System.out.printf("삼각형의 넓이 : %d\n", area);
			
			width+=2;
			height+=3;
		}
	}

}
