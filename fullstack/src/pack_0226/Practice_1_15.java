package pack_0226;

import java.util.Random;
import java.util.Scanner;

public class Practice_1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] bingo = new String[5][5];
		int[] numbers = new int[50];
		boolean[] isUsed = new boolean[50];
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		for(int i=0;i<50;i++) {
			numbers[i] = i+1;
			isUsed[i] = false;
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int tmp = 0;
				do {
					tmp = rand.nextInt(50);
				}while(isUsed[tmp]);
				bingo[i][j] = Integer.toString(numbers[tmp]);
				isUsed[tmp] = true;
				System.out.printf("%2s ",bingo[i][j]);
			}
			System.out.println();
		}
		
		boolean isBingo = false;
		
		while(!isBingo) {
			
			System.out.print("숫자를 입력하세요 ");
			String s = scan.nextLine();
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(bingo[i][j].equals(s))
						bingo[i][j] = "*";
					System.out.printf("%2s ",bingo[i][j]);
				}
				System.out.println();
			}
			
			int bingoCount = 0;
			for(int i=0;i<5;i++) {
				int count = 0;
				for(int j=0;j<5;j++) {
					if(bingo[i][j].equals("*"))
						count++;
				}
				if(count == 5) bingoCount++;
			}
			
			for(int i=0;i<5;i++) {
				int count = 0;
				for(int j=0;j<5;j++) {
					if(bingo[j][i].equals("*"))
						count++;
				}
				if(count == 5) bingoCount++;
			}
			
			for(int i=0;i<5;i++) {
				int count = 0;
				if(bingo[i][i].equals("*"))
					count++;
				if(count == 5)
					bingoCount++;
			}
			
			for(int i=0;i<5;i++) {
				int count = 0;
				if(bingo[i][4-i].equals("*"))
					count++;
				if(count == 5)
					bingoCount++;
			}
			
			if(bingoCount >= 5) isBingo=true;
		}
		
		System.out.println("BINGO!!!");
		scan.close();
	}
}
