package pack_0215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Practice_16_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		URL url = null;
		BufferedReader in = null;
		File file = new File("practice_16_23.html");
		FileWriter fw = null;
		BufferedWriter out = null;
		
		try {
			url = new URL("https://en.wikipedia.org");
			in = new BufferedReader(new InputStreamReader(url.openStream()));
			fw = new FileWriter(file);
			out = new BufferedWriter(fw);
			
			String inputLine = "";
			while((inputLine = in.readLine()) != null)
				out.write(inputLine);
			in.close(); out.close(); fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
