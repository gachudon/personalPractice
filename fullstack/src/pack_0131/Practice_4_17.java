package pack_0131;

import java.util.Scanner;

public class Practice_4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		
		System.out.println("1. 월~금, 2. 토요일, 3. 공휴일");
		System.out.print("요일을 선택하세요(1~3)--> ");
		choice = scan.nextInt();
		if(choice == 1) {
			System.out.println("1. 버스, 2. 승용차");
			System.out.print("차종을 선택하세요(1,2)---> ");
			choice = scan.nextInt();
			
			if(choice == 1)
				System.out.println("버스임, 안전 운행하세요~");
			else
				System.out.println("버스 전용차로 위반!!");
		}
		else
			System.out.println("토요일, 공휴일은 단속하지 않아요~");
	
		scan.close();
	}

}
