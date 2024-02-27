package pack_0227;

import java.util.Random;
import java.util.Scanner;

public class Training_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[5];
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int key = 0;
		int index =0;
		
		for(int i=0;i<5;i++) {
			numbers[i] = rand.nextInt(100)+1;
			System.out.println(numbers[i]);
		}
		
		System.out.print("검색할 값을 입력하세요 >> ");
		key = Integer.parseInt(scan.nextLine());
		
		index = seqSearch(numbers,key);
		if(index <0) System.out.printf("%d는 배열에 존재하지 않음\n",key);
		else System.out.printf("%d는 인덱스 %d에 위치함\n", key,index);
		scan.close();
	}
	
	public static int seqSearch(int[] iArray, int key) {
		for(int i=0;i<iArray.length;i++) {
			if(iArray[i] == key) return i;
		}
		return -1;
	}
}
