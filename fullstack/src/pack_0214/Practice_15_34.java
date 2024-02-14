package pack_0214;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice_15_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("practice_15_34.txt");
		FileReader fr = null;
		BufferedReader in = null;
		String s = "";
		int c;
		Scanner scan = new Scanner(System.in);
		
		try {
			fr = new FileReader(file);
			in = new BufferedReader(fr);
			while((c=in.read())!=-1)
				s += (char)c;
			in.close(); fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		StringTokenizer st = new StringTokenizer(s,",.\'\" ");
		String[] ss = new String[st.countTokens()];
		for(int i=0;i<ss.length;i++) {
			ss[i] = st.nextToken();
//			System.out.println(ss[i]);
		}
		while(true) {
			System.out.print("찾고 싶은 단어는 무엇입니까? ");
			s = scan.nextLine();
			int count = 0;
			for (int i=0;i<ss.length;i++)
				if(ss[i].equalsIgnoreCase(s)) count++;
			System.out.printf("%d번 사용됨\n", count);
		}
	}

}
