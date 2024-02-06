package pack_0206;

public class Practice_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle("red",false,5.5);
		Rectangle b = new Rectangle("red",false,1.0f,2.0f);
		Square c = new Square("red",true,6.6);
		
		System.out.printf("%s의 면적은 %.2f, 둘레는 %.2f\n", a.toString(),a.getArea(),a.getPerimeter());
		System.out.printf("%s의 반지름은 %.2f\nf", a.toString(),a.getRadius());
		System.out.printf("%s의 면적은 %.2f, 둘레는 %.2f\n", b.toString(),b.getArea(),b.getPerimeter());
		System.out.printf("%s의 밑변은 %.2f\n", b.toString(),b.getLength());
		System.out.printf("%s의 면적은 %.2f, 둘레는 %.2f\n", c.toString(), c.getArea(), c.getPerimeter());
		System.out.printf("%s의 밑변은 %.2f\n", c.toString(),c.getLength());
	}

}
