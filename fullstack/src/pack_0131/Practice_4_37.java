package pack_0131;

import java.util.Scanner;

public class Practice_4_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FEE = 1400;
		
		Scanner scan = new Scanner(System.in);
		
		int charge = 0;
		int i = 1;
		
		
		System.out.print("최초 충전금액 -->> ");
		charge = scan.nextInt();
		while(charge >= FEE) {
			charge -= FEE;
			System.out.printf("%d회 사용한 후 현재 잔액은 %d원\n", i, charge);
			i++;
		}
		
		scan.close();
	}

}
