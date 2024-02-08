package pack_0206;

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = {new Cat(), new Dog(), new Mouse()};
		for(int i=0;i<animals.length;i++) {
			animals[i].makeSound();
		}
	}

}
