package pack_0215;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Practice_15_41_server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("접속을 기다립니다.");
			Socket socketOfServer = server.accept();
			InetAddress inetaddr = socketOfServer.getInetAddress();
			System.out.println(inetaddr.getHostAddress()+" 로 부터 접속하였습니다.");
			OutputStream out = socketOfServer.getOutputStream();
			InputStream in = socketOfServer.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out),true);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println("클라이언트로부터 전송받은 문자열 : "+line);
				pw.println(line + calculate(line));
			}
			pw.close();br.close();socketOfServer.close(); server.close();
		} catch(Exception e) {System.out.println(e);}
	}
	
	public static String calculate(String line) {
		
		String[] eq = line.split(" ");
		if(eq.length!=3) return "연산식이 잘못됐습니다.";
		double x, y = 0;
		try {
			x = Double.parseDouble(eq[0]);
			y = Double.parseDouble(eq[2]);
		} catch(NumberFormatException e) {
			return "연산식이 잘못됐습니다.";
		}
		if(eq[1].equals("+"))
			return Double.toString(x+y);
		else if(eq[1].equals("-"))
			return Double.toString(x-y);
		else if(eq[1].equals("*"))
			return Double.toString(x*y);
		else if(eq[1].equals("/"))
			return Double.toString(x/y);
		
		return "연산식이 잘못됐습니다.";
		
	}
}
