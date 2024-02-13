package pack_0213;

import java.util.Random;

public class SharedCar {
	public synchronized void drive(String name, String destination) {
		System.out.println(name+"님이 공유차에 탔음");
		Random r = new Random();
		for(int i=0;i<r.nextInt(3)+1;i++)
			System.out.println(name+"님이 공유차를 운전중");
		System.out.println(name+"님이 "+destination+"에 도착했음");
	}
}
