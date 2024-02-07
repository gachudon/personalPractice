package pack_0131;

import java.util.Scanner;

public class Practice_4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double temp=0;
		
		System.out.print("기계의 온도를 입력하세요. ");
		temp = scan.nextDouble();
		
		if(temp>=40)
			System.out.println("팬(Fan) 중지");
		else
			System.out.println("팬(Fan) 가동");
		
		scan.close();
	}

}
