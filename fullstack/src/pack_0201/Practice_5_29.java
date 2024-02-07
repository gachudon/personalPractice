package pack_0201;

public class Practice_5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		System.out.print("전달받은 수는");
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]+" ");
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println();
		System.out.printf("숫자들의 합은 %d\n", sum);
		System.out.printf("숫자들의 평균은 %.1f", (double)sum/args.length);
	}

}
