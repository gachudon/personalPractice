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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EchoServer {

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
				pw.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +">>"+ line);
			}
			pw.close();br.close();socketOfServer.close(); server.close();
		} catch(Exception e) {System.out.println(e);}
	}

}
