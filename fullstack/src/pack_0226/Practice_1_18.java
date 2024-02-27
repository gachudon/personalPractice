package pack_0226;

import java.util.Random;
import java.util.Scanner;

public class Practice_1_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Practice 1
//		Random rand = new Random();
//		
//		int[] numbers = new int[5];
//		int max =0;
//		for(int i=0;i<5;i++) {
//			numbers[i] = rand.nextInt(100)+1;
//			if(numbers[i] > max) max = numbers[i];
//			System.out.printf("배열에 저장된 값은 intArray[%d] = %d\n",i,numbers[i]);
//		}
//		System.out.println("최대값 : "+max);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하시오 >> ");
		int n = Integer.parseInt(scan.nextLine());
		
		int[] numbers = new int[n];
		int max = 0;
		for(int i=0; i<numbers.length;i++) {
			
			System.out.print("정수를 입력하시오 >> ");
			numbers[i] = Integer.parseInt(scan.nextLine());
			if(max < numbers[i]) max = numbers[i];
		}
		
		for(int i=0;i<numbers.length;i++) {
			System.out.printf("배열에 저장된 값은 intArray[%d] = %d\n", i,numbers[i]);
		}
		System.out.println("최대값 : "+max);
		
		scan.close();
	}

}
