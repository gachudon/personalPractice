package pack_0214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Training_15_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:/windows/system.ini"); // 소스 파일
		File dst = new File("E:/temp/system.txt"); // 목적 파일
		FileReader fr = null; FileWriter fw = null;
		BufferedReader in = null; BufferedWriter out = null;
		int c;
		try {
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			while((c=in.read())!=-1)
				out.write((char)c);
			in.close(); out.close(); fr.close(); fw.close();
		} catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
