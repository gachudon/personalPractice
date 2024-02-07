package pack_0131;

import java.util.Scanner;

public class Practice_4_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dan = 0;
		
		System.out.print("원하시는 단을 입력하세요 (2-9)>> ");
		dan = scan.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
		
		scan.close();
	}

}
