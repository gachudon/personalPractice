package pack_0202;

public class CurrencyConverterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverter.setRate(1326.56);
		System.out.printf("백만원은\t%.2f달러입니다.\n", CurrencyConverter.toDollar(1000000));
		System.out.printf("백달러는\t%.2f원입니다.\n", CurrencyConverter.toKWR(100));
	}

}
