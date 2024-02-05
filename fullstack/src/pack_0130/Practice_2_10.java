package pack_0130;

import java.util.Scanner;

public class Practice_2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		
		Scanner scan = new Scanner(System.in);
		
		double r = 0.0f;
		
		System.out.print("원의 반지름을 입력하세요--> ");
		r = scan.nextDouble();
		
		System.out.printf("반지름이 %.2f인 원의 둘레는 %.2f, 면적은 %.2f임\n", r,2*r*PI,r*r*PI);
		
		scan.close();
	}

}
