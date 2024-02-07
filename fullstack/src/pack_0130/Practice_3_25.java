package pack_0130;

import java.util.Scanner;

public class Practice_3_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		final double TEMP = 20.0f;
		int depth = 0;
		
		System.out.print("수심을 입력하세요 : ");
		depth = scan.nextInt();
		
		System.out.printf("수온 : %.1f\n", TEMP-0.7f*(depth/10));
		
		scan.close();
	}

}
