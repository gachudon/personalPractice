package pack_0229;

import java.util.Random;
import java.util.Scanner;

public class Practice_3_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(5);
		
		System.out.print("배열의 개수를 입력하세요 >> ");
		int n = scan.nextInt();
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = rand.nextInt(100);
		}
		int sum = sumArray(array,n);
		System.out.println("배열의 합은 "+sum);
	}
	public static int sumArray(int[] array, int n) {
		if(n <= 0)
			return 0;
		else
			return sumArray(array, n-1)+array[n-1];
	}

}
