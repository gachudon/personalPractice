package pack_0201;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		}
		System.out.printf("숫자들의 합은 %d\n", sum);
	}

}
