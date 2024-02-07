package pack_0131;

import java.util.Scanner;

public class Practice_4_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int x=0;
		int y=0;
		String operator = "";
		boolean repeat = true; 
		
		while(repeat) {
			System.out.print("첫 번째 숫자 입력 : ");
			x = scan.nextInt();
			
			System.out.print("두 번째 숫자 입력 : ");
			y = scan.nextInt();
			
			System.out.print("연산 기호 입력 : ");
			operator = scan.nextLine();
			
			if(operator.equals("+"))
				System.out.printf("계산 결과는 %d", x+y);
			else if(operator.equals("-"))
				System.out.printf("계산 결과는 %d", x-y);
			else if(operator.equals("*"))
				System.out.printf("계산 결과는 %d", x*y);
			if(operator.equals("/"))
				System.out.printf("계산 결과는 %d", x/y);
			else
				repeat = false;
		}
		
		scan.close();
	}

}
