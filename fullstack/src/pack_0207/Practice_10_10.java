package pack_0207;

public class Practice_10_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect(2,6);
		Rect r2 = new Rect(3,4);
		Rect r3 = new Rect(2,4);
		if(r1.equals(r2))
			System.out.println("r1과 r2가 각각 참조하는 두 사각형의 면적이 같음");
		else
			System.out.println("r1과 r2가 각각 참조하는 두 사각형의 면적이 다름");
		if(r1.equals(r3))
			System.out.println("r1과 r3가 각각 참조하는 두 사각형의 면적이 같음");
		else
			System.out.println("r1과 r3가 각각 참조하는 두 사각형의 면적이 다름");
	}

}
