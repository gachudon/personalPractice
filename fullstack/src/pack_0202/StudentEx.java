package pack_0202;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student[] student = new Student[3];
		
		for(int i=0;i<3;i++) {
			student[i] = new Student();
			
			System.out.println("학생 정보를 이름,반, 번호, 국어, 영어, 수학 순서대로 입력하세요-->");
			
			student[i].name = scan.next();
			student[i].ban = scan.nextInt();
			student[i].no = scan.nextInt();
			student[i].kor = scan.nextInt();
			student[i].eng = scan.nextInt();
			student[i].math = scan.nextInt();
		}
		
		System.out.println("=======================================");
		System.out.println("학생이름\t반\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------");
		for(int i=0;i<3;i++)
			student[i].showInfo();
		System.out.println("======================================");
		
		scan.close();
	}

}
