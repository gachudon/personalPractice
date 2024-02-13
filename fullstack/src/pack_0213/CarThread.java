package pack_0213;

public class CarThread extends Thread {
	private String driver;
	private SharedCar car;
	private String destination;
	public CarThread(String driver, SharedCar car, String destination) {
		this.driver = driver; this.car = car; this.destination = destination;
	}
	
	public void run() {car.drive(driver, destination);}
}
