package pack_0228;

public class Animal {
	public void makeSound() {System.out.println("소리내다");}
}

class Dog extends Animal{
	@Override
	public void makeSound() {System.out.println("멍멍");}
}

class Cat extends Animal{
	@Override
	public void makeSound() {System.out.println("야옹");}
}