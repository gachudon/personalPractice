package pack_0228;

import java.util.ArrayList;
import java.util.List;

public class AnimalEx {

	public static void printSound(List<? extends Animal> animals) {
		for(Animal animal : animals) {
			animal.makeSound();
		}
	}
	
	public static void addDog(List<? super Dog> dogs) {
		dogs.add(new Dog());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog());
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat());
		printSound(dogList); printSound(catList);
		
		List<Object> objectList = new ArrayList<>();
		objectList.add(new Dog()); objectList.add(new Animal());
		objectList.add(new Object());
		addDog(objectList);
	}

}
