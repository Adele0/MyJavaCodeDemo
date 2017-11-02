package cn.itsource.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedOutputStream {

	public static void main(String[] args) throws IOException {
		// BufferedOutputStream是字节的缓存流，在写的时候，对应 用fileOutputStream
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("BufferedOutputStream"));//新建输出的位置
		String msg = "要写的内容先定义好，之后通过getBytes（）方法来转换成字节，从而进行输出";
		byte[] b = msg.getBytes();
		bos.write(b);
		bos.close();
	} 
}
