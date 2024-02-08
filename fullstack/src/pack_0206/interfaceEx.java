package pack_0206;

public class interfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable[] fArray = {new Bird(), new Helicopter(), new Rocket()};
		for(int i=0; i<fArray.length;i++)
			fArray[i].fly();
	}

}
