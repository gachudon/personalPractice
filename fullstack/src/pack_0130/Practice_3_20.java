package pack_0130;

import java.util.Scanner;

public class Practice_3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int x=0;
		int y=0;
		
		System.out.print("첫 번째 정수를 입력하세요-->");
		x = scan.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요-->");
		y = scan.nextInt();
		
		System.out.printf("입력하신 수 %d, %d 중에서 큰 수는 %d입니다.\n", x,y,(x>y)?x:y);
		
		scan.close();
	}

}
