package cn.itsource.io.FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) throws IOException {
		// 新建对象
		FileReader fr = new FileReader("TestInputStream");
//		System.out.print((char)fr.read());//一个一个的打印
		
		char[] c = new char[1026];
		int len = 0;
		while((len = fr.read(c)) != -1){
			System.out.println(new String(c, 0, len));
		}
		
		fr.close();
		System.out.print("");
		System.out.println("----------------------");
	}

}
