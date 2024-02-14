package pack_0214;

import java.io.IOException;

public class Training_15_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int b, len = 0;
		int bArray[] = new int[100];
		
		System.out.println("---입력 스트림---");
		while((b=System.in.read())!='\n') {//엔터키를 입력할 때 까지
			System.out.printf("%c(%d)",(char)b,b);
			bArray[len++]=b;
		}
		
		System.out.println("\n\n---출력 스트림---");
		for(int i=0;i<len;i++)
			System.out.write(bArray[i]);
		System.out.flush(); //System.out.close();
	}

}
