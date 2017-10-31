package cn.itsource.io.TransferStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestTransStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void test(InputStream is) throws IOException {
//		把字节转换成字符,通过构造方法
		InputStreamReader isr = new InputStreamReader(new FileInputStream("TestInputStream"));
	}
}
