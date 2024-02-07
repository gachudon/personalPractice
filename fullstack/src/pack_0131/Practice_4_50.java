package pack_0131;

import java.util.Scanner;

public class Practice_4_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요 ");
		printSum(scan.nextInt(),scan.nextInt());
		
		scan.close();
	}
	
	public static void printSum(int x, int y) {
		int sum = 0;
		
		for(int i = x; i<y;i++) {
			System.out.printf("%d + ",i);
			sum +=i;
		}
		System.out.printf("%d = %d", y,y+sum);
	}

}
