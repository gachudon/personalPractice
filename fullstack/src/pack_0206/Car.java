package pack_0206;

abstract class Car {
	Car(){
		System.out.println("car 객체 생성");
	}
	abstract void run();
	void start() {
		System.out.println("시동을 건다");
	}
}
