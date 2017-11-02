package cn.itsource.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {

	public static void main(String[] args) throws IOException {
//		BufferedReader是字符的缓存流，在读的时候，对应 用fileReader
		BufferedReader br = new BufferedReader(new FileReader("BufferedReader"));
		/*	System.out.println(br.readLine());//以行为单位进行读取,读取后可以直接打印
		   	System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine()); */
		String line = "";//当通过循环来一次性打印所有的行，需要存储每行内容先
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
