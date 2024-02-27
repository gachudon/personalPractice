package pack_0226;

import java.util.Scanner;

public class Practice_1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		n = scan.nextInt();
		
		npira(n);
		
	}
	
	public static void npira(int n) {
		
		for(int i=0;i<n+1;i++) {
			
			for(int j=0;j<n-i;j++)
				System.out.print(" ");
			
			for(int j=0;j<2*i+1;j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
		
	}

}
