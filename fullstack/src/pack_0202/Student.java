package pack_0202;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	double getAverage() {
		return (double) (kor + eng + math)/3;
	}
	
	void showInfo() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.1f\n", name,ban,no,kor,eng,math,this.getTotal(),this.getAverage());
	}
}
