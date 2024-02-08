package pack_0202;

public class CurrencyConverter {
	private static double rate;
	public static double toDollar(double won) {
		return won/1326.56;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}
