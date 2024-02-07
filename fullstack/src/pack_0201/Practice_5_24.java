package pack_0201;

import java.util.Scanner;

public class Practice_5_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] i = new int[5];
		
		double sum = 0;
		
		for(int j=0 ;j <i.length;j++) {
			i[j] = scan.nextInt();
			sum += i[j];
		}
		
		sum/=5;
		
		System.out.printf("배열 원소의 평균은 %.1f", sum);
		
		scan.close();
	}

}
