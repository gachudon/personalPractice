package pack_0213;

interface Mathematical{
	double calculate(double d);
}

interface Pickable{
	char pick(String s, int i);
}

interface Computable{
	int compute(int x,int y);
}

class Utils{
	int add(int a, int b) {
		return a+b;
	}
}

public class MethodRefEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathematical m;
		Pickable p;
		Computable c;
		
		// m = d->Math.abs(d);
		m = Math::abs;
		System.out.println(m.calculate(-50.3));
		
		// p = (a,b)->a.charAt(b);
		p=String::charAt;
		System.out.println(p.pick("Hello Java~", 4));
		
		Utils utils = new Utils();
		// c = (a, b) -> utils.add(a, b);
		c=utils::add;
		System.out.println(c.compute(20, 30));
	}

}
