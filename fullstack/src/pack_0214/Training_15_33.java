package pack_0214;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Training_15_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("1111","conan",10000);
		Account a2 = new Account("2222","rose",20000);
		File file = new File("account.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(file));
			pw.println(a1);pw.println(a2);
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			pw.close();
		}
	}

}
