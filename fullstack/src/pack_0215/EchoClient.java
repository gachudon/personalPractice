package pack_0215;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socketOfClient = new Socket("127.0.0.1",9999);
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			OutputStream out = socketOfClient.getOutputStream();
			InputStream in = socketOfClient.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out),true);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line = keyboard.readLine()) != null) {
				if(line.equals("quit")) {break;}
				pw.println(line);
				String echo = br.readLine();
				System.out.println(echo);
			}
			pw.close(); br.close(); socketOfClient.close();
		} catch(Exception e) {}
	}

}
