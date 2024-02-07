package pack_0131;

import java.util.Scanner;

public class Practice_4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int personnel = 0;
		
		System.out.print("인원 수를 입력하시오-->>");
		personnel = scan.nextInt();
		
		if(personnel <= 1)
			System.out.println("400,000원 지원");
		else if (personnel <=2)
			System.out.println("600,000원 지원");
		else if (personnel <=3)
			System.out.println("800,000원 지원");
		else
			System.out.println("1,000,000원 지원");
		
		scan.close();
	}

}
