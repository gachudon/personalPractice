package pack_0130;

import java.util.Scanner;

public class Practice_3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		final int LIMIT = 125;
		int height = 0;
		
		System.out.print("어린이의 신장(cm)을 입력하세요 : ");
		height = scan.nextInt();
		
		System.out.println(height>=LIMIT);
		
		scan.close();
	}

}
