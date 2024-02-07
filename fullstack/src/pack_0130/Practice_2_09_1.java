package pack_0130;

import java.util.Scanner;

public class Practice_2_09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double weight = 0.0f;
		double height = 0.0f;
		
		System.out.print("몸무게(kg) : ");
		weight = scan.nextDouble();
		
		System.out.print("신장(m) : ");
		height = scan.nextDouble();
		
		System.out.printf("BMI ; %.1f", weight/(height*height));
		
		scan.close();
	}

}
