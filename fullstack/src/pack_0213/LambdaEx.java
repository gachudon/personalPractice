package pack_0213;

interface Negative{int neg(int x);}
interface Printable{void print();}

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Negative n;
		n = new Negative() {
			@Override
			public int neg(int x) {return -x;}
		};
		System.out.println("익명 구현객체 "+ n.neg(1));
		n = (int x) -> {return -x;};
		n = (x) -> {return -x;};
		n = x -> {return -x;};
		n = (int x) -> -x;
		n = (x) -> -x;
		n = x -> -x;
		System.out.println("람다식" + n.neg(2));
		
		Printable p;
		p = new Printable() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Hi~");
			}
			
		};
		p.print();
		p=()->{System.out.println("안녕!");};
		p=()->System.out.println("안녕!");
		p.print();
	}

}
