package pack_0229;

public class Practice_3_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(2,1);
	}
	
	public static void gugudan(int x, int y) {
		if(x >= 9 && y >= 9) {
			System.out.printf("%d * %d = %2d\n", x,y,x*y);
			return;
		} else if(x >= 9) {
			System.out.printf("%d * %d = %2d\n", x,y,x*y);
			gugudan(2,y+1);
		} else {
			System.out.printf("%d * %d = %2d ", x,y,x*y);
			gugudan(x+1,y);
		}
	}
}
