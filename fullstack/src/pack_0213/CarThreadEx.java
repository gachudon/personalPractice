package pack_0213;

public class CarThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedCar car = new SharedCar();
		new CarThread("코난",car,"서울").start();
		new CarThread("장미",car,"부산").start();
		new CarThread("미란",car,"대전").start();
	}

}
